package com.feast.kanjo.entity;

import com.feast.kanjo.entity.Lma04Mise;
import com.feast.kanjo.entity.Lma04MiseExample;
import com.feast.kanjo.entity.Lma04MiseKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Lma04MiseMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lb01_pt.lma04_mise
     *
     * @mbggenerated Mon Jan 22 17:43:52 CST 2018
     */
    int countByExample(Lma04MiseExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lb01_pt.lma04_mise
     *
     * @mbggenerated Mon Jan 22 17:43:52 CST 2018
     */
    int deleteByExample(Lma04MiseExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lb01_pt.lma04_mise
     *
     * @mbggenerated Mon Jan 22 17:43:52 CST 2018
     */
    int deleteByPrimaryKey(Lma04MiseKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lb01_pt.lma04_mise
     *
     * @mbggenerated Mon Jan 22 17:43:52 CST 2018
     */
    int insert(Lma04Mise record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lb01_pt.lma04_mise
     *
     * @mbggenerated Mon Jan 22 17:43:52 CST 2018
     */
    int insertSelective(Lma04Mise record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lb01_pt.lma04_mise
     *
     * @mbggenerated Mon Jan 22 17:43:52 CST 2018
     */
    List<Lma04Mise> selectByExample(Lma04MiseExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lb01_pt.lma04_mise
     *
     * @mbggenerated Mon Jan 22 17:43:52 CST 2018
     */
    Lma04Mise selectByPrimaryKey(Lma04MiseKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lb01_pt.lma04_mise
     *
     * @mbggenerated Mon Jan 22 17:43:52 CST 2018
     */
    int updateByExampleSelective(@Param("record") Lma04Mise record, @Param("example") Lma04MiseExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lb01_pt.lma04_mise
     *
     * @mbggenerated Mon Jan 22 17:43:52 CST 2018
     */
    int updateByExample(@Param("record") Lma04Mise record, @Param("example") Lma04MiseExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lb01_pt.lma04_mise
     *
     * @mbggenerated Mon Jan 22 17:43:52 CST 2018
     */
    int updateByPrimaryKeySelective(Lma04Mise record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lb01_pt.lma04_mise
     *
     * @mbggenerated Mon Jan 22 17:43:52 CST 2018
     */
    int updateByPrimaryKey(Lma04Mise record);
}