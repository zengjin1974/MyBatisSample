package com.feast.kanjo.entity;

import com.feast.kanjo.entity.Lbt01BaikanD;
import com.feast.kanjo.entity.Lbt01BaikanDExample;
import com.feast.kanjo.entity.Lbt01BaikanDKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Lbt01BaikanDMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lb01_pt.lbt01_baikan_d
     *
     * @mbggenerated Mon Jan 22 17:43:52 CST 2018
     */
    int countByExample(Lbt01BaikanDExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lb01_pt.lbt01_baikan_d
     *
     * @mbggenerated Mon Jan 22 17:43:52 CST 2018
     */
    int deleteByExample(Lbt01BaikanDExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lb01_pt.lbt01_baikan_d
     *
     * @mbggenerated Mon Jan 22 17:43:52 CST 2018
     */
    int deleteByPrimaryKey(Lbt01BaikanDKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lb01_pt.lbt01_baikan_d
     *
     * @mbggenerated Mon Jan 22 17:43:52 CST 2018
     */
    int insert(Lbt01BaikanD record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lb01_pt.lbt01_baikan_d
     *
     * @mbggenerated Mon Jan 22 17:43:52 CST 2018
     */
    int insertSelective(Lbt01BaikanD record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lb01_pt.lbt01_baikan_d
     *
     * @mbggenerated Mon Jan 22 17:43:52 CST 2018
     */
    List<Lbt01BaikanD> selectByExample(Lbt01BaikanDExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lb01_pt.lbt01_baikan_d
     *
     * @mbggenerated Mon Jan 22 17:43:52 CST 2018
     */
    Lbt01BaikanD selectByPrimaryKey(Lbt01BaikanDKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lb01_pt.lbt01_baikan_d
     *
     * @mbggenerated Mon Jan 22 17:43:52 CST 2018
     */
    int updateByExampleSelective(@Param("record") Lbt01BaikanD record, @Param("example") Lbt01BaikanDExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lb01_pt.lbt01_baikan_d
     *
     * @mbggenerated Mon Jan 22 17:43:52 CST 2018
     */
    int updateByExample(@Param("record") Lbt01BaikanD record, @Param("example") Lbt01BaikanDExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lb01_pt.lbt01_baikan_d
     *
     * @mbggenerated Mon Jan 22 17:43:52 CST 2018
     */
    int updateByPrimaryKeySelective(Lbt01BaikanD record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lb01_pt.lbt01_baikan_d
     *
     * @mbggenerated Mon Jan 22 17:43:52 CST 2018
     */
    int updateByPrimaryKey(Lbt01BaikanD record);
}