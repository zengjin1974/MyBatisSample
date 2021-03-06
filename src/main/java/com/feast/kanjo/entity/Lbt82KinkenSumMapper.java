package com.feast.kanjo.entity;

import com.feast.kanjo.entity.Lbt82KinkenSum;
import com.feast.kanjo.entity.Lbt82KinkenSumExample;
import com.feast.kanjo.entity.Lbt82KinkenSumKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Lbt82KinkenSumMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lb01_pt.lbt82_kinken_sum
     *
     * @mbggenerated Mon Jan 22 17:43:51 CST 2018
     */
    int countByExample(Lbt82KinkenSumExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lb01_pt.lbt82_kinken_sum
     *
     * @mbggenerated Mon Jan 22 17:43:51 CST 2018
     */
    int deleteByExample(Lbt82KinkenSumExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lb01_pt.lbt82_kinken_sum
     *
     * @mbggenerated Mon Jan 22 17:43:51 CST 2018
     */
    int deleteByPrimaryKey(Lbt82KinkenSumKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lb01_pt.lbt82_kinken_sum
     *
     * @mbggenerated Mon Jan 22 17:43:51 CST 2018
     */
    int insert(Lbt82KinkenSum record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lb01_pt.lbt82_kinken_sum
     *
     * @mbggenerated Mon Jan 22 17:43:51 CST 2018
     */
    int insertSelective(Lbt82KinkenSum record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lb01_pt.lbt82_kinken_sum
     *
     * @mbggenerated Mon Jan 22 17:43:51 CST 2018
     */
    List<Lbt82KinkenSum> selectByExample(Lbt82KinkenSumExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lb01_pt.lbt82_kinken_sum
     *
     * @mbggenerated Mon Jan 22 17:43:51 CST 2018
     */
    Lbt82KinkenSum selectByPrimaryKey(Lbt82KinkenSumKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lb01_pt.lbt82_kinken_sum
     *
     * @mbggenerated Mon Jan 22 17:43:51 CST 2018
     */
    int updateByExampleSelective(@Param("record") Lbt82KinkenSum record, @Param("example") Lbt82KinkenSumExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lb01_pt.lbt82_kinken_sum
     *
     * @mbggenerated Mon Jan 22 17:43:51 CST 2018
     */
    int updateByExample(@Param("record") Lbt82KinkenSum record, @Param("example") Lbt82KinkenSumExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lb01_pt.lbt82_kinken_sum
     *
     * @mbggenerated Mon Jan 22 17:43:51 CST 2018
     */
    int updateByPrimaryKeySelective(Lbt82KinkenSum record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lb01_pt.lbt82_kinken_sum
     *
     * @mbggenerated Mon Jan 22 17:43:51 CST 2018
     */
    int updateByPrimaryKey(Lbt82KinkenSum record);
}