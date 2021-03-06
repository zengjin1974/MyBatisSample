package com.feast.kanjo.entity;

import com.feast.kanjo.entity.Lmx01Gyomuhizuke;
import com.feast.kanjo.entity.Lmx01GyomuhizukeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Lmx01GyomuhizukeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lb01_pt.lmx01_gyomuhizuke
     *
     * @mbggenerated Mon Jan 22 17:43:51 CST 2018
     */
    int countByExample(Lmx01GyomuhizukeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lb01_pt.lmx01_gyomuhizuke
     *
     * @mbggenerated Mon Jan 22 17:43:51 CST 2018
     */
    int deleteByExample(Lmx01GyomuhizukeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lb01_pt.lmx01_gyomuhizuke
     *
     * @mbggenerated Mon Jan 22 17:43:51 CST 2018
     */
    int deleteByPrimaryKey(String rcdid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lb01_pt.lmx01_gyomuhizuke
     *
     * @mbggenerated Mon Jan 22 17:43:51 CST 2018
     */
    int insert(Lmx01Gyomuhizuke record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lb01_pt.lmx01_gyomuhizuke
     *
     * @mbggenerated Mon Jan 22 17:43:51 CST 2018
     */
    int insertSelective(Lmx01Gyomuhizuke record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lb01_pt.lmx01_gyomuhizuke
     *
     * @mbggenerated Mon Jan 22 17:43:51 CST 2018
     */
    List<Lmx01Gyomuhizuke> selectByExample(Lmx01GyomuhizukeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lb01_pt.lmx01_gyomuhizuke
     *
     * @mbggenerated Mon Jan 22 17:43:51 CST 2018
     */
    Lmx01Gyomuhizuke selectByPrimaryKey(String rcdid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lb01_pt.lmx01_gyomuhizuke
     *
     * @mbggenerated Mon Jan 22 17:43:51 CST 2018
     */
    int updateByExampleSelective(@Param("record") Lmx01Gyomuhizuke record, @Param("example") Lmx01GyomuhizukeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lb01_pt.lmx01_gyomuhizuke
     *
     * @mbggenerated Mon Jan 22 17:43:51 CST 2018
     */
    int updateByExample(@Param("record") Lmx01Gyomuhizuke record, @Param("example") Lmx01GyomuhizukeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lb01_pt.lmx01_gyomuhizuke
     *
     * @mbggenerated Mon Jan 22 17:43:51 CST 2018
     */
    int updateByPrimaryKeySelective(Lmx01Gyomuhizuke record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lb01_pt.lmx01_gyomuhizuke
     *
     * @mbggenerated Mon Jan 22 17:43:51 CST 2018
     */
    int updateByPrimaryKey(Lmx01Gyomuhizuke record);
}