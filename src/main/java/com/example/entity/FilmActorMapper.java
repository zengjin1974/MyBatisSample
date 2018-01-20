package com.example.entity;

import com.example.entity.FilmActor;
import com.example.entity.FilmActorExample;
import com.example.entity.FilmActorKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FilmActorMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table film_actor
     *
     * @mbggenerated Sat Jan 20 09:14:44 CST 2018
     */
    int countByExample(FilmActorExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table film_actor
     *
     * @mbggenerated Sat Jan 20 09:14:44 CST 2018
     */
    int deleteByExample(FilmActorExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table film_actor
     *
     * @mbggenerated Sat Jan 20 09:14:44 CST 2018
     */
    int deleteByPrimaryKey(FilmActorKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table film_actor
     *
     * @mbggenerated Sat Jan 20 09:14:44 CST 2018
     */
    int insert(FilmActor record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table film_actor
     *
     * @mbggenerated Sat Jan 20 09:14:44 CST 2018
     */
    int insertSelective(FilmActor record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table film_actor
     *
     * @mbggenerated Sat Jan 20 09:14:44 CST 2018
     */
    List<FilmActor> selectByExample(FilmActorExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table film_actor
     *
     * @mbggenerated Sat Jan 20 09:14:44 CST 2018
     */
    FilmActor selectByPrimaryKey(FilmActorKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table film_actor
     *
     * @mbggenerated Sat Jan 20 09:14:44 CST 2018
     */
    int updateByExampleSelective(@Param("record") FilmActor record, @Param("example") FilmActorExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table film_actor
     *
     * @mbggenerated Sat Jan 20 09:14:44 CST 2018
     */
    int updateByExample(@Param("record") FilmActor record, @Param("example") FilmActorExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table film_actor
     *
     * @mbggenerated Sat Jan 20 09:14:44 CST 2018
     */
    int updateByPrimaryKeySelective(FilmActor record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table film_actor
     *
     * @mbggenerated Sat Jan 20 09:14:44 CST 2018
     */
    int updateByPrimaryKey(FilmActor record);
}