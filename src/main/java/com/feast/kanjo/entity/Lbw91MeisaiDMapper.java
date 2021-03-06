package com.feast.kanjo.entity;

import com.feast.kanjo.entity.Lbw91MeisaiD;
import com.feast.kanjo.entity.Lbw91MeisaiDExample;
import com.feast.kanjo.entity.Lbw91MeisaiDKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Lbw91MeisaiDMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lb01_pt.lbw91_meisai_d
     *
     * @mbggenerated Mon Jan 22 17:43:52 CST 2018
     */
    int countByExample(Lbw91MeisaiDExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lb01_pt.lbw91_meisai_d
     *
     * @mbggenerated Mon Jan 22 17:43:52 CST 2018
     */
    int deleteByExample(Lbw91MeisaiDExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lb01_pt.lbw91_meisai_d
     *
     * @mbggenerated Mon Jan 22 17:43:52 CST 2018
     */
    int deleteByPrimaryKey(Lbw91MeisaiDKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lb01_pt.lbw91_meisai_d
     *
     * @mbggenerated Mon Jan 22 17:43:52 CST 2018
     */
    int insert(Lbw91MeisaiD record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lb01_pt.lbw91_meisai_d
     *
     * @mbggenerated Mon Jan 22 17:43:52 CST 2018
     */
    int insertSelective(Lbw91MeisaiD record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lb01_pt.lbw91_meisai_d
     *
     * @mbggenerated Mon Jan 22 17:43:52 CST 2018
     */
    List<Lbw91MeisaiD> selectByExample(Lbw91MeisaiDExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lb01_pt.lbw91_meisai_d
     *
     * @mbggenerated Mon Jan 22 17:43:52 CST 2018
     */
    Lbw91MeisaiD selectByPrimaryKey(Lbw91MeisaiDKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lb01_pt.lbw91_meisai_d
     *
     * @mbggenerated Mon Jan 22 17:43:52 CST 2018
     */
    int updateByExampleSelective(@Param("record") Lbw91MeisaiD record, @Param("example") Lbw91MeisaiDExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lb01_pt.lbw91_meisai_d
     *
     * @mbggenerated Mon Jan 22 17:43:52 CST 2018
     */
    int updateByExample(@Param("record") Lbw91MeisaiD record, @Param("example") Lbw91MeisaiDExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lb01_pt.lbw91_meisai_d
     *
     * @mbggenerated Mon Jan 22 17:43:52 CST 2018
     */
    int updateByPrimaryKeySelective(Lbw91MeisaiD record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lb01_pt.lbw91_meisai_d
     *
     * @mbggenerated Mon Jan 22 17:43:52 CST 2018
     */
    int updateByPrimaryKey(Lbw91MeisaiD record);
}