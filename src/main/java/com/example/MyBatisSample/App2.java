package com.example.MyBatisSample;

import java.io.IOException;
import java.io.Reader;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.example.entity.Employee;
import com.example.entity.EmployeeExample;
/*
 * http://www.casleyconsulting.co.jp/blog-engineer/java/mybatis3mybatisを使ってみよう/
 */
import com.example.entity.EmployeeMapper;

/**
 * MyBatisを使ってDBにアクセスするサンプルプログラムです.
 *
 */
public class App2 {
    public static void main(String[] args) {

        // resources直下のmybatis-config.xmlを読み込みます
        try (Reader r = Resources.getResourceAsReader("mybatis-config.xml");) {

            // 読み込んだ設定ファイルからSqlSessionFactoryを生成します
            SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(r);

            // SQLセッションを取得します
            try (SqlSession session = factory.openSession()) {

                // EmployeeテーブルのMapperを取得します
                EmployeeMapper map = session.getMapper(EmployeeMapper.class);

                // Employeeテーブルの条件検索用クラスを生成します
                EmployeeExample ex = new EmployeeExample();

                // WHERE
                //    (employee_name LIKE 'R%')
                //    OR (employee_name LIKE 'J%')
                // 検索条件に↑と同等の条件を設定しています
                // 　  Criteriaを作成し、AND条件を追加する (1)
                ex.createCriteria().andEmployeeNameLike("R%");
                // 2 OR条件がある場合はExampleのor() メソッドで区切り、OR条件内の条件を追加する
                ex.or().andEmployeeNameLike("J%");

                // 上記の条件でテーブルを検索します
                List<Employee> empList = map.selectByExample(ex);

                // 取得結果を表示します
                System.out.println("employee_id, employee_name");
                for (Employee emp : empList) {

                    System.out.printf("%s, %s \n", emp.getEmployeeId(), emp.getEmployeeName());
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}