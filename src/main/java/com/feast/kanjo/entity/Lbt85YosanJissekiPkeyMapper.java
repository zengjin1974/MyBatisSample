package com.feast.kanjo.entity;

import com.feast.kanjo.entity.Lbt85YosanJissekiPkey;
import com.feast.kanjo.entity.Lbt85YosanJissekiPkeyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Lbt85YosanJissekiPkeyMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lb01_pt.lbt85_yosan_jisseki_pkey
     *
     * @mbggenerated Mon Jan 22 17:43:52 CST 2018
     */
    int countByExample(Lbt85YosanJissekiPkeyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lb01_pt.lbt85_yosan_jisseki_pkey
     *
     * @mbggenerated Mon Jan 22 17:43:52 CST 2018
     */
    int deleteByExample(Lbt85YosanJissekiPkeyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lb01_pt.lbt85_yosan_jisseki_pkey
     *
     * @mbggenerated Mon Jan 22 17:43:52 CST 2018
     */
    int insert(Lbt85YosanJissekiPkey record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lb01_pt.lbt85_yosan_jisseki_pkey
     *
     * @mbggenerated Mon Jan 22 17:43:52 CST 2018
     */
    int insertSelective(Lbt85YosanJissekiPkey record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lb01_pt.lbt85_yosan_jisseki_pkey
     *
     * @mbggenerated Mon Jan 22 17:43:52 CST 2018
     */
    List<Lbt85YosanJissekiPkey> selectByExample(Lbt85YosanJissekiPkeyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lb01_pt.lbt85_yosan_jisseki_pkey
     *
     * @mbggenerated Mon Jan 22 17:43:52 CST 2018
     */
    int updateByExampleSelective(@Param("record") Lbt85YosanJissekiPkey record, @Param("example") Lbt85YosanJissekiPkeyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lb01_pt.lbt85_yosan_jisseki_pkey
     *
     * @mbggenerated Mon Jan 22 17:43:52 CST 2018
     */
    int updateByExample(@Param("record") Lbt85YosanJissekiPkey record, @Param("example") Lbt85YosanJissekiPkeyExample example);
}