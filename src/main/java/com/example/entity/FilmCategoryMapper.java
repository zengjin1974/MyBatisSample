package com.example.entity;

import com.example.entity.FilmCategory;
import com.example.entity.FilmCategoryExample;
import com.example.entity.FilmCategoryKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FilmCategoryMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table film_category
     *
     * @mbggenerated Sat Jan 20 09:14:44 CST 2018
     */
    int countByExample(FilmCategoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table film_category
     *
     * @mbggenerated Sat Jan 20 09:14:44 CST 2018
     */
    int deleteByExample(FilmCategoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table film_category
     *
     * @mbggenerated Sat Jan 20 09:14:44 CST 2018
     */
    int deleteByPrimaryKey(FilmCategoryKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table film_category
     *
     * @mbggenerated Sat Jan 20 09:14:44 CST 2018
     */
    int insert(FilmCategory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table film_category
     *
     * @mbggenerated Sat Jan 20 09:14:44 CST 2018
     */
    int insertSelective(FilmCategory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table film_category
     *
     * @mbggenerated Sat Jan 20 09:14:44 CST 2018
     */
    List<FilmCategory> selectByExample(FilmCategoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table film_category
     *
     * @mbggenerated Sat Jan 20 09:14:44 CST 2018
     */
    FilmCategory selectByPrimaryKey(FilmCategoryKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table film_category
     *
     * @mbggenerated Sat Jan 20 09:14:44 CST 2018
     */
    int updateByExampleSelective(@Param("record") FilmCategory record, @Param("example") FilmCategoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table film_category
     *
     * @mbggenerated Sat Jan 20 09:14:44 CST 2018
     */
    int updateByExample(@Param("record") FilmCategory record, @Param("example") FilmCategoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table film_category
     *
     * @mbggenerated Sat Jan 20 09:14:44 CST 2018
     */
    int updateByPrimaryKeySelective(FilmCategory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table film_category
     *
     * @mbggenerated Sat Jan 20 09:14:44 CST 2018
     */
    int updateByPrimaryKey(FilmCategory record);
}