package com.feast.kanjo.entity;

import com.feast.kanjo.entity.Lbt85YosanJisseki;
import com.feast.kanjo.entity.Lbt85YosanJissekiExample;
import com.feast.kanjo.entity.Lbt85YosanJissekiKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Lbt85YosanJissekiMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lb01_pt.lbt85_yosan_jisseki
     *
     * @mbggenerated Mon Jan 22 17:43:52 CST 2018
     */
    int countByExample(Lbt85YosanJissekiExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lb01_pt.lbt85_yosan_jisseki
     *
     * @mbggenerated Mon Jan 22 17:43:52 CST 2018
     */
    int deleteByExample(Lbt85YosanJissekiExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lb01_pt.lbt85_yosan_jisseki
     *
     * @mbggenerated Mon Jan 22 17:43:52 CST 2018
     */
    int deleteByPrimaryKey(Lbt85YosanJissekiKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lb01_pt.lbt85_yosan_jisseki
     *
     * @mbggenerated Mon Jan 22 17:43:52 CST 2018
     */
    int insert(Lbt85YosanJisseki record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lb01_pt.lbt85_yosan_jisseki
     *
     * @mbggenerated Mon Jan 22 17:43:52 CST 2018
     */
    int insertSelective(Lbt85YosanJisseki record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lb01_pt.lbt85_yosan_jisseki
     *
     * @mbggenerated Mon Jan 22 17:43:52 CST 2018
     */
    List<Lbt85YosanJisseki> selectByExample(Lbt85YosanJissekiExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lb01_pt.lbt85_yosan_jisseki
     *
     * @mbggenerated Mon Jan 22 17:43:52 CST 2018
     */
    Lbt85YosanJisseki selectByPrimaryKey(Lbt85YosanJissekiKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lb01_pt.lbt85_yosan_jisseki
     *
     * @mbggenerated Mon Jan 22 17:43:52 CST 2018
     */
    int updateByExampleSelective(@Param("record") Lbt85YosanJisseki record, @Param("example") Lbt85YosanJissekiExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lb01_pt.lbt85_yosan_jisseki
     *
     * @mbggenerated Mon Jan 22 17:43:52 CST 2018
     */
    int updateByExample(@Param("record") Lbt85YosanJisseki record, @Param("example") Lbt85YosanJissekiExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lb01_pt.lbt85_yosan_jisseki
     *
     * @mbggenerated Mon Jan 22 17:43:52 CST 2018
     */
    int updateByPrimaryKeySelective(Lbt85YosanJisseki record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lb01_pt.lbt85_yosan_jisseki
     *
     * @mbggenerated Mon Jan 22 17:43:52 CST 2018
     */
    int updateByPrimaryKey(Lbt85YosanJisseki record);
}