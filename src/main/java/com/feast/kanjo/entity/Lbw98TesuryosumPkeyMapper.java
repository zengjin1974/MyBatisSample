package com.feast.kanjo.entity;

import com.feast.kanjo.entity.Lbw98TesuryosumPkey;
import com.feast.kanjo.entity.Lbw98TesuryosumPkeyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Lbw98TesuryosumPkeyMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lb01_pt.lbw98_tesuryosum_pkey
     *
     * @mbggenerated Mon Jan 22 17:43:51 CST 2018
     */
    int countByExample(Lbw98TesuryosumPkeyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lb01_pt.lbw98_tesuryosum_pkey
     *
     * @mbggenerated Mon Jan 22 17:43:51 CST 2018
     */
    int deleteByExample(Lbw98TesuryosumPkeyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lb01_pt.lbw98_tesuryosum_pkey
     *
     * @mbggenerated Mon Jan 22 17:43:51 CST 2018
     */
    int insert(Lbw98TesuryosumPkey record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lb01_pt.lbw98_tesuryosum_pkey
     *
     * @mbggenerated Mon Jan 22 17:43:51 CST 2018
     */
    int insertSelective(Lbw98TesuryosumPkey record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lb01_pt.lbw98_tesuryosum_pkey
     *
     * @mbggenerated Mon Jan 22 17:43:51 CST 2018
     */
    List<Lbw98TesuryosumPkey> selectByExample(Lbw98TesuryosumPkeyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lb01_pt.lbw98_tesuryosum_pkey
     *
     * @mbggenerated Mon Jan 22 17:43:51 CST 2018
     */
    int updateByExampleSelective(@Param("record") Lbw98TesuryosumPkey record, @Param("example") Lbw98TesuryosumPkeyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lb01_pt.lbw98_tesuryosum_pkey
     *
     * @mbggenerated Mon Jan 22 17:43:51 CST 2018
     */
    int updateByExample(@Param("record") Lbw98TesuryosumPkey record, @Param("example") Lbw98TesuryosumPkeyExample example);
}