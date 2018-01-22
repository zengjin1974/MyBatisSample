package com.feast.kanjo.entity;

import com.feast.kanjo.entity.Lbt74EmKangen;
import com.feast.kanjo.entity.Lbt74EmKangenExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Lbt74EmKangenMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lb01_pt.lbt74_em_kangen
     *
     * @mbggenerated Mon Jan 22 17:43:51 CST 2018
     */
    int countByExample(Lbt74EmKangenExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lb01_pt.lbt74_em_kangen
     *
     * @mbggenerated Mon Jan 22 17:43:51 CST 2018
     */
    int deleteByExample(Lbt74EmKangenExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lb01_pt.lbt74_em_kangen
     *
     * @mbggenerated Mon Jan 22 17:43:51 CST 2018
     */
    int insert(Lbt74EmKangen record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lb01_pt.lbt74_em_kangen
     *
     * @mbggenerated Mon Jan 22 17:43:51 CST 2018
     */
    int insertSelective(Lbt74EmKangen record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lb01_pt.lbt74_em_kangen
     *
     * @mbggenerated Mon Jan 22 17:43:51 CST 2018
     */
    List<Lbt74EmKangen> selectByExample(Lbt74EmKangenExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lb01_pt.lbt74_em_kangen
     *
     * @mbggenerated Mon Jan 22 17:43:51 CST 2018
     */
    int updateByExampleSelective(@Param("record") Lbt74EmKangen record, @Param("example") Lbt74EmKangenExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lb01_pt.lbt74_em_kangen
     *
     * @mbggenerated Mon Jan 22 17:43:51 CST 2018
     */
    int updateByExample(@Param("record") Lbt74EmKangen record, @Param("example") Lbt74EmKangenExample example);
}