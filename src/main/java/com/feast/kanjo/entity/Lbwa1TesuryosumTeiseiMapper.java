package com.feast.kanjo.entity;

import com.feast.kanjo.entity.Lbwa1TesuryosumTeisei;
import com.feast.kanjo.entity.Lbwa1TesuryosumTeiseiExample;
import com.feast.kanjo.entity.Lbwa1TesuryosumTeiseiKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Lbwa1TesuryosumTeiseiMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lb01_pt.lbwa1_tesuryosum_teisei
     *
     * @mbggenerated Mon Jan 22 17:43:51 CST 2018
     */
    int countByExample(Lbwa1TesuryosumTeiseiExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lb01_pt.lbwa1_tesuryosum_teisei
     *
     * @mbggenerated Mon Jan 22 17:43:51 CST 2018
     */
    int deleteByExample(Lbwa1TesuryosumTeiseiExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lb01_pt.lbwa1_tesuryosum_teisei
     *
     * @mbggenerated Mon Jan 22 17:43:51 CST 2018
     */
    int deleteByPrimaryKey(Lbwa1TesuryosumTeiseiKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lb01_pt.lbwa1_tesuryosum_teisei
     *
     * @mbggenerated Mon Jan 22 17:43:51 CST 2018
     */
    int insert(Lbwa1TesuryosumTeisei record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lb01_pt.lbwa1_tesuryosum_teisei
     *
     * @mbggenerated Mon Jan 22 17:43:51 CST 2018
     */
    int insertSelective(Lbwa1TesuryosumTeisei record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lb01_pt.lbwa1_tesuryosum_teisei
     *
     * @mbggenerated Mon Jan 22 17:43:51 CST 2018
     */
    List<Lbwa1TesuryosumTeisei> selectByExample(Lbwa1TesuryosumTeiseiExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lb01_pt.lbwa1_tesuryosum_teisei
     *
     * @mbggenerated Mon Jan 22 17:43:51 CST 2018
     */
    Lbwa1TesuryosumTeisei selectByPrimaryKey(Lbwa1TesuryosumTeiseiKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lb01_pt.lbwa1_tesuryosum_teisei
     *
     * @mbggenerated Mon Jan 22 17:43:51 CST 2018
     */
    int updateByExampleSelective(@Param("record") Lbwa1TesuryosumTeisei record, @Param("example") Lbwa1TesuryosumTeiseiExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lb01_pt.lbwa1_tesuryosum_teisei
     *
     * @mbggenerated Mon Jan 22 17:43:51 CST 2018
     */
    int updateByExample(@Param("record") Lbwa1TesuryosumTeisei record, @Param("example") Lbwa1TesuryosumTeiseiExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lb01_pt.lbwa1_tesuryosum_teisei
     *
     * @mbggenerated Mon Jan 22 17:43:51 CST 2018
     */
    int updateByPrimaryKeySelective(Lbwa1TesuryosumTeisei record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lb01_pt.lbwa1_tesuryosum_teisei
     *
     * @mbggenerated Mon Jan 22 17:43:51 CST 2018
     */
    int updateByPrimaryKey(Lbwa1TesuryosumTeisei record);
}