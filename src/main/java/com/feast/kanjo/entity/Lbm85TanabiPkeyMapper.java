package com.feast.kanjo.entity;

import com.feast.kanjo.entity.Lbm85TanabiPkey;
import com.feast.kanjo.entity.Lbm85TanabiPkeyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Lbm85TanabiPkeyMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lb01_pt.lbm85_tanabi_pkey
     *
     * @mbggenerated Mon Jan 22 17:43:51 CST 2018
     */
    int countByExample(Lbm85TanabiPkeyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lb01_pt.lbm85_tanabi_pkey
     *
     * @mbggenerated Mon Jan 22 17:43:51 CST 2018
     */
    int deleteByExample(Lbm85TanabiPkeyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lb01_pt.lbm85_tanabi_pkey
     *
     * @mbggenerated Mon Jan 22 17:43:51 CST 2018
     */
    int insert(Lbm85TanabiPkey record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lb01_pt.lbm85_tanabi_pkey
     *
     * @mbggenerated Mon Jan 22 17:43:51 CST 2018
     */
    int insertSelective(Lbm85TanabiPkey record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lb01_pt.lbm85_tanabi_pkey
     *
     * @mbggenerated Mon Jan 22 17:43:51 CST 2018
     */
    List<Lbm85TanabiPkey> selectByExample(Lbm85TanabiPkeyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lb01_pt.lbm85_tanabi_pkey
     *
     * @mbggenerated Mon Jan 22 17:43:51 CST 2018
     */
    int updateByExampleSelective(@Param("record") Lbm85TanabiPkey record, @Param("example") Lbm85TanabiPkeyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lb01_pt.lbm85_tanabi_pkey
     *
     * @mbggenerated Mon Jan 22 17:43:51 CST 2018
     */
    int updateByExample(@Param("record") Lbm85TanabiPkey record, @Param("example") Lbm85TanabiPkeyExample example);
}