package com.feast.kanjo.entity;

import com.feast.kanjo.entity.Lbw92BaikanMPkey;
import com.feast.kanjo.entity.Lbw92BaikanMPkeyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Lbw92BaikanMPkeyMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lb01_pt.lbw92_baikan_m_pkey
     *
     * @mbggenerated Mon Jan 22 17:43:51 CST 2018
     */
    int countByExample(Lbw92BaikanMPkeyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lb01_pt.lbw92_baikan_m_pkey
     *
     * @mbggenerated Mon Jan 22 17:43:51 CST 2018
     */
    int deleteByExample(Lbw92BaikanMPkeyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lb01_pt.lbw92_baikan_m_pkey
     *
     * @mbggenerated Mon Jan 22 17:43:51 CST 2018
     */
    int insert(Lbw92BaikanMPkey record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lb01_pt.lbw92_baikan_m_pkey
     *
     * @mbggenerated Mon Jan 22 17:43:51 CST 2018
     */
    int insertSelective(Lbw92BaikanMPkey record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lb01_pt.lbw92_baikan_m_pkey
     *
     * @mbggenerated Mon Jan 22 17:43:51 CST 2018
     */
    List<Lbw92BaikanMPkey> selectByExample(Lbw92BaikanMPkeyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lb01_pt.lbw92_baikan_m_pkey
     *
     * @mbggenerated Mon Jan 22 17:43:51 CST 2018
     */
    int updateByExampleSelective(@Param("record") Lbw92BaikanMPkey record, @Param("example") Lbw92BaikanMPkeyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lb01_pt.lbw92_baikan_m_pkey
     *
     * @mbggenerated Mon Jan 22 17:43:51 CST 2018
     */
    int updateByExample(@Param("record") Lbw92BaikanMPkey record, @Param("example") Lbw92BaikanMPkeyExample example);
}