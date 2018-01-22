/*
 * http://www.casleyconsulting.co.jp/blog-engineer/java/mybatis3mybatisを使ってみよう/
 */
package com.feast.kanjo.test;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.feast.kanjo.entity.Test2;
import com.feast.kanjo.entity.Test2Mapper;

/**
 * MyBatisを使ってDBにアクセスするサンプルプログラムです.
 */
public class Test1 {
    public static void main(String[] args) {

        // resources直下のmybatis-config.xmlを読み込みます(1)
        try (Reader r = Resources.getResourceAsReader("mybatis-config.xml");) {

            // 読み込んだ設定ファイルからSqlSessionFactoryを生成します(2)
            SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(r,"lb01_pt@bfs");

//mybatis-config.xmlに定義しないと下記処理が必要です。
//定義例；
//    <mappers>
//            <package name="com.example.entity" />
//            <package name="com.feast.kanjo.entity" />
//    </mappers>

//            factory.getConfiguration().addMapper(Test2Mapper.class);

            // SQLセッションを取得します(3)
            try (SqlSession session = factory.openSession()) {

                // Test2テーブルのMapperを取得します(4)
            	Test2Mapper map = session.getMapper(Test2Mapper.class);
                // Employeeテーブルの主キー（Employee_id)が１であるレコードを検索します(5)


            	Test2 test = map.selectByPrimaryKey(1);

          // 取得した内容を確認します
                System.out.println("test.geId     = " + test.getId());
                System.out.println("test.getName  = " + test.getName());

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}