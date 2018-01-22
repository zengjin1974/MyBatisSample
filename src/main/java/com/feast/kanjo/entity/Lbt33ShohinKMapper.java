package com.feast.kanjo.entity;

import com.feast.kanjo.entity.Lbt33ShohinK;
import com.feast.kanjo.entity.Lbt33ShohinKExample;
import com.feast.kanjo.entity.Lbt33ShohinKKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Lbt33ShohinKMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lb01_pt.lbt33_shohin_k
     *
     * @mbggenerated Mon Jan 22 17:43:52 CST 2018
     */
    int countByExample(Lbt33ShohinKExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lb01_pt.lbt33_shohin_k
     *
     * @mbggenerated Mon Jan 22 17:43:52 CST 2018
     */
    int deleteByExample(Lbt33ShohinKExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lb01_pt.lbt33_shohin_k
     *
     * @mbggenerated Mon Jan 22 17:43:52 CST 2018
     */
    int deleteByPrimaryKey(Lbt33ShohinKKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lb01_pt.lbt33_shohin_k
     *
     * @mbggenerated Mon Jan 22 17:43:52 CST 2018
     */
    int insert(Lbt33ShohinK record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lb01_pt.lbt33_shohin_k
     *
     * @mbggenerated Mon Jan 22 17:43:52 CST 2018
     */
    int insertSelective(Lbt33ShohinK record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lb01_pt.lbt33_shohin_k
     *
     * @mbggenerated Mon Jan 22 17:43:52 CST 2018
     */
    List<Lbt33ShohinK> selectByExample(Lbt33ShohinKExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lb01_pt.lbt33_shohin_k
     *
     * @mbggenerated Mon Jan 22 17:43:52 CST 2018
     */
    Lbt33ShohinK selectByPrimaryKey(Lbt33ShohinKKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lb01_pt.lbt33_shohin_k
     *
     * @mbggenerated Mon Jan 22 17:43:52 CST 2018
     */
    int updateByExampleSelective(@Param("record") Lbt33ShohinK record, @Param("example") Lbt33ShohinKExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lb01_pt.lbt33_shohin_k
     *
     * @mbggenerated Mon Jan 22 17:43:52 CST 2018
     */
    int updateByExample(@Param("record") Lbt33ShohinK record, @Param("example") Lbt33ShohinKExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lb01_pt.lbt33_shohin_k
     *
     * @mbggenerated Mon Jan 22 17:43:52 CST 2018
     */
    int updateByPrimaryKeySelective(Lbt33ShohinK record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lb01_pt.lbt33_shohin_k
     *
     * @mbggenerated Mon Jan 22 17:43:52 CST 2018
     */
    int updateByPrimaryKey(Lbt33ShohinK record);
}