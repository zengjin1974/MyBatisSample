/*
 * http://www.casleyconsulting.co.jp/blog-engineer/java/mybatis3mybatisを使ってみよう/
 */
package com.feast.kanjo.test;

import java.io.IOException;
import java.io.Reader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

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
    	Connection conn = null;

    	Test1 da =new Test1();
    	try {

    		conn = da.getConnection();

    	} catch (Exception e) {
    		e.printStackTrace();
    	}

        // resources直下のmybatis-config.xmlを読み込みます(1)
        try (Reader r = Resources.getResourceAsReader("mybatis-config.xml");) {

            // 読み込んだ設定ファイルからSqlSessionFactoryを生成します(2)
//            SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(r,"lb01_pt@bfs");
            SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(r);

//mybatis-config.xmlに定義しないと下記処理が必要です。
//定義例；
//    <mappers>
//            <package name="com.example.entity" />
//            <package name="com.feast.kanjo.entity" />
//    </mappers>

//            factory.getConfiguration().addMapper(Test2Mapper.class);

            // SQLセッションを取得します(3)
            try (SqlSession session = factory.openSession(conn)) {
//            try (SqlSession session = factory.openSession()) {
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


    public Connection getConnection() throws Exception{
    	  /* ユーザ名 */
    	  String user = "approot";
    	  /* パスワード */
    	  String pass = "approot";
    	  /* サーバ名 */
    	  String servername = "10.167.39.185";
    	  /* SID */
    	  String sid = "dept_dev";

    	  Connection conn = null;

			try {
				/* ドライバクラスのロード */
				Class.forName ("org.postgresql.Driver");

				/* Connectionの作成 */
				conn = DriverManager.getConnection
				("jdbc:postgresql://" + servername + ":27500/" + sid + "?user=" + user + "&password=" + pass);
			} catch (ClassNotFoundException e) {
				throw e;
			}
		return conn;
    }

    public void selectPostgres() throws Exception{

  	  /* ユーザ名 */
  	  String user = "approot";
  	  /* パスワード */
  	  String pass = "approot";
  	  /* サーバ名 */
  	  String servername = "10.167.39.185";
  	  /* SID */
  	  String sid = "dept_dev";

  	  Connection conn = null;
  	  Statement stmt = null;
  	  ResultSet rset = null;

  	  	try {
  			/* ドライバクラスのロード */
  			Class.forName ("org.postgresql.Driver");

  			/* Connectionの作成 */
  			conn = DriverManager.getConnection
  			("jdbc:postgresql://" + servername + ":27500/" + sid + "?user=" + user + "&password=" + pass);

  			/* Statementの作成 */
  			stmt = conn.createStatement();

  			/* Resultsetの作成 */
  			rset = stmt.executeQuery("select * from lb01_pt.test order by id");

  			/* 取得したデータを表示します。 */
  			while (rset.next()) {
  				System.out.println(rset.getString(1) + ":" + rset.getString(2));

  			}

  		} catch (ClassNotFoundException e) {
  			throw e;
  		} catch (SQLException e) {
  			throw e;
  		} catch ( Exception e){
  			throw e;
  		}
  		finally{
  			/* クローズ処理 */
  			if(conn != null){
  			  conn.close();
  			  conn = null;
  			}
  			if(stmt != null){
  			  stmt.close();
  			  stmt = null;
  			}
  			if(rset != null){
  			  rset.close();
  			  rset = null;
  			}
  		}
  	}
  }


