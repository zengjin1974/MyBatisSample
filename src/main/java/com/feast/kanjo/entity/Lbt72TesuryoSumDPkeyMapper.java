package com.feast.kanjo.entity;

import com.feast.kanjo.entity.Lbt72TesuryoSumDPkey;
import com.feast.kanjo.entity.Lbt72TesuryoSumDPkeyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Lbt72TesuryoSumDPkeyMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lb01_pt.lbt72_tesuryo_sum_d_pkey
     *
     * @mbggenerated Mon Jan 22 17:43:52 CST 2018
     */
    int countByExample(Lbt72TesuryoSumDPkeyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lb01_pt.lbt72_tesuryo_sum_d_pkey
     *
     * @mbggenerated Mon Jan 22 17:43:52 CST 2018
     */
    int deleteByExample(Lbt72TesuryoSumDPkeyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lb01_pt.lbt72_tesuryo_sum_d_pkey
     *
     * @mbggenerated Mon Jan 22 17:43:52 CST 2018
     */
    int insert(Lbt72TesuryoSumDPkey record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lb01_pt.lbt72_tesuryo_sum_d_pkey
     *
     * @mbggenerated Mon Jan 22 17:43:52 CST 2018
     */
    int insertSelective(Lbt72TesuryoSumDPkey record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lb01_pt.lbt72_tesuryo_sum_d_pkey
     *
     * @mbggenerated Mon Jan 22 17:43:52 CST 2018
     */
    List<Lbt72TesuryoSumDPkey> selectByExample(Lbt72TesuryoSumDPkeyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lb01_pt.lbt72_tesuryo_sum_d_pkey
     *
     * @mbggenerated Mon Jan 22 17:43:52 CST 2018
     */
    int updateByExampleSelective(@Param("record") Lbt72TesuryoSumDPkey record, @Param("example") Lbt72TesuryoSumDPkeyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lb01_pt.lbt72_tesuryo_sum_d_pkey
     *
     * @mbggenerated Mon Jan 22 17:43:52 CST 2018
     */
    int updateByExample(@Param("record") Lbt72TesuryoSumDPkey record, @Param("example") Lbt72TesuryoSumDPkeyExample example);
}