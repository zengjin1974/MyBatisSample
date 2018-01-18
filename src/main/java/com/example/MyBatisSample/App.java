/*
 * http://www.casleyconsulting.co.jp/blog-engineer/java/mybatis3mybatisを使ってみよう/
 */
package com.example.MyBatisSample;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.example.entity.Employee;
import com.example.entity.EmployeeMapper;

/**
 * MyBatisを使ってDBにアクセスするサンプルプログラムです.
 */
public class App {
    public static void main(String[] args) {

        // resources直下のmybatis-config.xmlを読み込みます(1)
        try (Reader r = Resources.getResourceAsReader("mybatis-config.xml");) {

            // 読み込んだ設定ファイルからSqlSessionFactoryを生成します(2)
            SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(r);

            // SQLセッションを取得します(3)
            try (SqlSession session = factory.openSession()) {

                // ActorテーブルのMapperを取得します(4)
            	EmployeeMapper map = session.getMapper(EmployeeMapper.class);
                // Actorテーブルの主キー（actor_id)が１であるレコードを検索します(5)
            	Employee emp = map.selectByPrimaryKey((long)1);

          // 取得した内容を確認します
                System.out.println("emp.getEmployeeId    = " + emp.getEmployeeId());
                System.out.println("emp.getEmployeeName  = " + emp.getEmployeeName());

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}