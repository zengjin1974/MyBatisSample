package com.example.entity;

import com.example.entity.Language;
import com.example.entity.LanguageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LanguageMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table language
     *
     * @mbggenerated Sat Jan 20 09:14:44 CST 2018
     */
    int countByExample(LanguageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table language
     *
     * @mbggenerated Sat Jan 20 09:14:44 CST 2018
     */
    int deleteByExample(LanguageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table language
     *
     * @mbggenerated Sat Jan 20 09:14:44 CST 2018
     */
    int deleteByPrimaryKey(Byte languageId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table language
     *
     * @mbggenerated Sat Jan 20 09:14:44 CST 2018
     */
    int insert(Language record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table language
     *
     * @mbggenerated Sat Jan 20 09:14:44 CST 2018
     */
    int insertSelective(Language record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table language
     *
     * @mbggenerated Sat Jan 20 09:14:44 CST 2018
     */
    List<Language> selectByExample(LanguageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table language
     *
     * @mbggenerated Sat Jan 20 09:14:44 CST 2018
     */
    Language selectByPrimaryKey(Byte languageId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table language
     *
     * @mbggenerated Sat Jan 20 09:14:44 CST 2018
     */
    int updateByExampleSelective(@Param("record") Language record, @Param("example") LanguageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table language
     *
     * @mbggenerated Sat Jan 20 09:14:44 CST 2018
     */
    int updateByExample(@Param("record") Language record, @Param("example") LanguageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table language
     *
     * @mbggenerated Sat Jan 20 09:14:44 CST 2018
     */
    int updateByPrimaryKeySelective(Language record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table language
     *
     * @mbggenerated Sat Jan 20 09:14:44 CST 2018
     */
    int updateByPrimaryKey(Language record);
}