package com.feast.kanjo.entity;

import com.feast.kanjo.entity.Lbt90TourokuteiseiChkPkey;
import com.feast.kanjo.entity.Lbt90TourokuteiseiChkPkeyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Lbt90TourokuteiseiChkPkeyMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lb01_pt.lbt90_tourokuteisei_chk_pkey
     *
     * @mbggenerated Mon Jan 22 17:43:52 CST 2018
     */
    int countByExample(Lbt90TourokuteiseiChkPkeyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lb01_pt.lbt90_tourokuteisei_chk_pkey
     *
     * @mbggenerated Mon Jan 22 17:43:52 CST 2018
     */
    int deleteByExample(Lbt90TourokuteiseiChkPkeyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lb01_pt.lbt90_tourokuteisei_chk_pkey
     *
     * @mbggenerated Mon Jan 22 17:43:52 CST 2018
     */
    int insert(Lbt90TourokuteiseiChkPkey record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lb01_pt.lbt90_tourokuteisei_chk_pkey
     *
     * @mbggenerated Mon Jan 22 17:43:52 CST 2018
     */
    int insertSelective(Lbt90TourokuteiseiChkPkey record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lb01_pt.lbt90_tourokuteisei_chk_pkey
     *
     * @mbggenerated Mon Jan 22 17:43:52 CST 2018
     */
    List<Lbt90TourokuteiseiChkPkey> selectByExample(Lbt90TourokuteiseiChkPkeyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lb01_pt.lbt90_tourokuteisei_chk_pkey
     *
     * @mbggenerated Mon Jan 22 17:43:52 CST 2018
     */
    int updateByExampleSelective(@Param("record") Lbt90TourokuteiseiChkPkey record, @Param("example") Lbt90TourokuteiseiChkPkeyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lb01_pt.lbt90_tourokuteisei_chk_pkey
     *
     * @mbggenerated Mon Jan 22 17:43:52 CST 2018
     */
    int updateByExample(@Param("record") Lbt90TourokuteiseiChkPkey record, @Param("example") Lbt90TourokuteiseiChkPkeyExample example);
}