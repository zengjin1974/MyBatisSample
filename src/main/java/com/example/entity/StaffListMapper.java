package com.example.entity;

import com.example.entity.StaffList;
import com.example.entity.StaffListExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StaffListMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table staff_list
     *
     * @mbggenerated Sat Jan 20 09:14:44 CST 2018
     */
    int countByExample(StaffListExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table staff_list
     *
     * @mbggenerated Sat Jan 20 09:14:44 CST 2018
     */
    int deleteByExample(StaffListExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table staff_list
     *
     * @mbggenerated Sat Jan 20 09:14:44 CST 2018
     */
    int insert(StaffList record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table staff_list
     *
     * @mbggenerated Sat Jan 20 09:14:44 CST 2018
     */
    int insertSelective(StaffList record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table staff_list
     *
     * @mbggenerated Sat Jan 20 09:14:44 CST 2018
     */
    List<StaffList> selectByExample(StaffListExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table staff_list
     *
     * @mbggenerated Sat Jan 20 09:14:44 CST 2018
     */
    int updateByExampleSelective(@Param("record") StaffList record, @Param("example") StaffListExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table staff_list
     *
     * @mbggenerated Sat Jan 20 09:14:44 CST 2018
     */
    int updateByExample(@Param("record") StaffList record, @Param("example") StaffListExample example);
}