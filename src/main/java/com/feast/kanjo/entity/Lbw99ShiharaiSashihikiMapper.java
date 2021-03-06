package com.feast.kanjo.entity;

import com.feast.kanjo.entity.Lbw99ShiharaiSashihiki;
import com.feast.kanjo.entity.Lbw99ShiharaiSashihikiExample;
import com.feast.kanjo.entity.Lbw99ShiharaiSashihikiKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Lbw99ShiharaiSashihikiMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lb01_pt.lbw99_shiharai_sashihiki
     *
     * @mbggenerated Mon Jan 22 17:43:52 CST 2018
     */
    int countByExample(Lbw99ShiharaiSashihikiExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lb01_pt.lbw99_shiharai_sashihiki
     *
     * @mbggenerated Mon Jan 22 17:43:52 CST 2018
     */
    int deleteByExample(Lbw99ShiharaiSashihikiExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lb01_pt.lbw99_shiharai_sashihiki
     *
     * @mbggenerated Mon Jan 22 17:43:52 CST 2018
     */
    int deleteByPrimaryKey(Lbw99ShiharaiSashihikiKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lb01_pt.lbw99_shiharai_sashihiki
     *
     * @mbggenerated Mon Jan 22 17:43:52 CST 2018
     */
    int insert(Lbw99ShiharaiSashihiki record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lb01_pt.lbw99_shiharai_sashihiki
     *
     * @mbggenerated Mon Jan 22 17:43:52 CST 2018
     */
    int insertSelective(Lbw99ShiharaiSashihiki record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lb01_pt.lbw99_shiharai_sashihiki
     *
     * @mbggenerated Mon Jan 22 17:43:52 CST 2018
     */
    List<Lbw99ShiharaiSashihiki> selectByExample(Lbw99ShiharaiSashihikiExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lb01_pt.lbw99_shiharai_sashihiki
     *
     * @mbggenerated Mon Jan 22 17:43:52 CST 2018
     */
    Lbw99ShiharaiSashihiki selectByPrimaryKey(Lbw99ShiharaiSashihikiKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lb01_pt.lbw99_shiharai_sashihiki
     *
     * @mbggenerated Mon Jan 22 17:43:52 CST 2018
     */
    int updateByExampleSelective(@Param("record") Lbw99ShiharaiSashihiki record, @Param("example") Lbw99ShiharaiSashihikiExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lb01_pt.lbw99_shiharai_sashihiki
     *
     * @mbggenerated Mon Jan 22 17:43:52 CST 2018
     */
    int updateByExample(@Param("record") Lbw99ShiharaiSashihiki record, @Param("example") Lbw99ShiharaiSashihikiExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lb01_pt.lbw99_shiharai_sashihiki
     *
     * @mbggenerated Mon Jan 22 17:43:52 CST 2018
     */
    int updateByPrimaryKeySelective(Lbw99ShiharaiSashihiki record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lb01_pt.lbw99_shiharai_sashihiki
     *
     * @mbggenerated Mon Jan 22 17:43:52 CST 2018
     */
    int updateByPrimaryKey(Lbw99ShiharaiSashihiki record);
}