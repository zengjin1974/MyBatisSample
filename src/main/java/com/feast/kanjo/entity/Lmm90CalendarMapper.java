package com.feast.kanjo.entity;

import com.feast.kanjo.entity.Lmm90Calendar;
import com.feast.kanjo.entity.Lmm90CalendarExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Lmm90CalendarMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lb01_pt.lmm90_calendar
     *
     * @mbggenerated Mon Jan 22 17:43:52 CST 2018
     */
    int countByExample(Lmm90CalendarExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lb01_pt.lmm90_calendar
     *
     * @mbggenerated Mon Jan 22 17:43:52 CST 2018
     */
    int deleteByExample(Lmm90CalendarExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lb01_pt.lmm90_calendar
     *
     * @mbggenerated Mon Jan 22 17:43:52 CST 2018
     */
    int insert(Lmm90Calendar record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lb01_pt.lmm90_calendar
     *
     * @mbggenerated Mon Jan 22 17:43:52 CST 2018
     */
    int insertSelective(Lmm90Calendar record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lb01_pt.lmm90_calendar
     *
     * @mbggenerated Mon Jan 22 17:43:52 CST 2018
     */
    List<Lmm90Calendar> selectByExample(Lmm90CalendarExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lb01_pt.lmm90_calendar
     *
     * @mbggenerated Mon Jan 22 17:43:52 CST 2018
     */
    int updateByExampleSelective(@Param("record") Lmm90Calendar record, @Param("example") Lmm90CalendarExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lb01_pt.lmm90_calendar
     *
     * @mbggenerated Mon Jan 22 17:43:52 CST 2018
     */
    int updateByExample(@Param("record") Lmm90Calendar record, @Param("example") Lmm90CalendarExample example);
}