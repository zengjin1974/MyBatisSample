package com.example.MyBatisSample;

import java.io.IOException;
import java.io.Reader;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.example.entity.Actor;
import com.example.entity.ActorExample;
import com.example.entity.ActorMapper;

/**
 * MyBatisを使ってDBにアクセスするサンプルプログラムです.
 *
 */
public class App2 {
    public static void main(String[] args) {

        // resources直下のmybatis-config.xmlを読み込みます
        try (Reader r = Resources.getResourceAsReader("mybatis-config.xml");) {

            // 読み込んだ設定ファイルからSqlSessionFactoryを生成します
            SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(r,"sakila@bfs");

            // SQLセッションを取得します
            try (SqlSession session = factory.openSession()) {

                // ActorテーブルのMapperを取得します
                ActorMapper map = session.getMapper(ActorMapper.class);

                // Actorテーブルの条件検索用クラスを生成します
                ActorExample ex = new ActorExample();

                // WHERE
                //    (first_name LIKE 'T%' AND actor_id < 100)
                //    OR (last_name LIKE 'S%' AND actor_id > 100)
                // 検索条件に↑と同等の条件を設定しています
                // 　  Criteriaを作成し、AND条件を追加する (1)
                ex.createCriteria().andFirstNameLike("T%").andActorIdLessThan((short)100);
                // 2 OR条件がある場合はExampleのor() メソッドで区切り、OR条件内の条件を追加する
                ex.or().andLastNameLike("S%").andActorIdGreaterThan((short)100);

                // 上記の条件でテーブルを検索します
                List<Actor> actorList = map.selectByExample(ex);

                // 取得結果を表示します
                System.out.println("actor_id, first_name, last_name, last_update");
                for (Actor actor : actorList) {

                    System.out.printf("%s, %s, %s, %s \n", actor.getActorId(), actor.getFirstName(), actor.getLastName(),
                                    actor.getLastUpdate());
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}