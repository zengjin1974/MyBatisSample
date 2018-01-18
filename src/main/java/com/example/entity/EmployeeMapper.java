package com.example.entity;

import com.example.entity.Employee;
import com.example.entity.EmployeeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EmployeeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table employee
     *
     * @mbggenerated Thu Jan 18 23:44:16 CST 2018
     */
    int countByExample(EmployeeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table employee
     *
     * @mbggenerated Thu Jan 18 23:44:16 CST 2018
     */
    int deleteByExample(EmployeeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table employee
     *
     * @mbggenerated Thu Jan 18 23:44:16 CST 2018
     */
    int deleteByPrimaryKey(Long employeeId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table employee
     *
     * @mbggenerated Thu Jan 18 23:44:16 CST 2018
     */
    int insert(Employee record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table employee
     *
     * @mbggenerated Thu Jan 18 23:44:16 CST 2018
     */
    int insertSelective(Employee record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table employee
     *
     * @mbggenerated Thu Jan 18 23:44:16 CST 2018
     */
    List<Employee> selectByExample(EmployeeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table employee
     *
     * @mbggenerated Thu Jan 18 23:44:16 CST 2018
     */
    Employee selectByPrimaryKey(Long employeeId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table employee
     *
     * @mbggenerated Thu Jan 18 23:44:16 CST 2018
     */
    int updateByExampleSelective(@Param("record") Employee record, @Param("example") EmployeeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table employee
     *
     * @mbggenerated Thu Jan 18 23:44:16 CST 2018
     */
    int updateByExample(@Param("record") Employee record, @Param("example") EmployeeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table employee
     *
     * @mbggenerated Thu Jan 18 23:44:16 CST 2018
     */
    int updateByPrimaryKeySelective(Employee record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table employee
     *
     * @mbggenerated Thu Jan 18 23:44:16 CST 2018
     */
    int updateByPrimaryKey(Employee record);
}