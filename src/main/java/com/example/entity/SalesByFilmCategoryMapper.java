package com.example.entity;

import com.example.entity.SalesByFilmCategory;
import com.example.entity.SalesByFilmCategoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SalesByFilmCategoryMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sales_by_film_category
     *
     * @mbggenerated Sat Jan 20 09:14:44 CST 2018
     */
    int countByExample(SalesByFilmCategoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sales_by_film_category
     *
     * @mbggenerated Sat Jan 20 09:14:44 CST 2018
     */
    int deleteByExample(SalesByFilmCategoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sales_by_film_category
     *
     * @mbggenerated Sat Jan 20 09:14:44 CST 2018
     */
    int insert(SalesByFilmCategory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sales_by_film_category
     *
     * @mbggenerated Sat Jan 20 09:14:44 CST 2018
     */
    int insertSelective(SalesByFilmCategory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sales_by_film_category
     *
     * @mbggenerated Sat Jan 20 09:14:44 CST 2018
     */
    List<SalesByFilmCategory> selectByExample(SalesByFilmCategoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sales_by_film_category
     *
     * @mbggenerated Sat Jan 20 09:14:44 CST 2018
     */
    int updateByExampleSelective(@Param("record") SalesByFilmCategory record, @Param("example") SalesByFilmCategoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sales_by_film_category
     *
     * @mbggenerated Sat Jan 20 09:14:44 CST 2018
     */
    int updateByExample(@Param("record") SalesByFilmCategory record, @Param("example") SalesByFilmCategoryExample example);
}