package com.example.entity;

import com.example.entity.Inventory;
import com.example.entity.InventoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InventoryMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table inventory
     *
     * @mbggenerated Sat Jan 20 09:14:44 CST 2018
     */
    int countByExample(InventoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table inventory
     *
     * @mbggenerated Sat Jan 20 09:14:44 CST 2018
     */
    int deleteByExample(InventoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table inventory
     *
     * @mbggenerated Sat Jan 20 09:14:44 CST 2018
     */
    int deleteByPrimaryKey(Integer inventoryId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table inventory
     *
     * @mbggenerated Sat Jan 20 09:14:44 CST 2018
     */
    int insert(Inventory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table inventory
     *
     * @mbggenerated Sat Jan 20 09:14:44 CST 2018
     */
    int insertSelective(Inventory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table inventory
     *
     * @mbggenerated Sat Jan 20 09:14:44 CST 2018
     */
    List<Inventory> selectByExample(InventoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table inventory
     *
     * @mbggenerated Sat Jan 20 09:14:44 CST 2018
     */
    Inventory selectByPrimaryKey(Integer inventoryId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table inventory
     *
     * @mbggenerated Sat Jan 20 09:14:44 CST 2018
     */
    int updateByExampleSelective(@Param("record") Inventory record, @Param("example") InventoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table inventory
     *
     * @mbggenerated Sat Jan 20 09:14:44 CST 2018
     */
    int updateByExample(@Param("record") Inventory record, @Param("example") InventoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table inventory
     *
     * @mbggenerated Sat Jan 20 09:14:44 CST 2018
     */
    int updateByPrimaryKeySelective(Inventory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table inventory
     *
     * @mbggenerated Sat Jan 20 09:14:44 CST 2018
     */
    int updateByPrimaryKey(Inventory record);
}