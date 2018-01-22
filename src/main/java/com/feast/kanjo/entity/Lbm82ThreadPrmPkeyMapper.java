package com.feast.kanjo.entity;

import com.feast.kanjo.entity.Lbm82ThreadPrmPkey;
import com.feast.kanjo.entity.Lbm82ThreadPrmPkeyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Lbm82ThreadPrmPkeyMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lb01_pt.lbm82_thread_prm_pkey
     *
     * @mbggenerated Mon Jan 22 17:43:51 CST 2018
     */
    int countByExample(Lbm82ThreadPrmPkeyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lb01_pt.lbm82_thread_prm_pkey
     *
     * @mbggenerated Mon Jan 22 17:43:51 CST 2018
     */
    int deleteByExample(Lbm82ThreadPrmPkeyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lb01_pt.lbm82_thread_prm_pkey
     *
     * @mbggenerated Mon Jan 22 17:43:51 CST 2018
     */
    int insert(Lbm82ThreadPrmPkey record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lb01_pt.lbm82_thread_prm_pkey
     *
     * @mbggenerated Mon Jan 22 17:43:51 CST 2018
     */
    int insertSelective(Lbm82ThreadPrmPkey record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lb01_pt.lbm82_thread_prm_pkey
     *
     * @mbggenerated Mon Jan 22 17:43:51 CST 2018
     */
    List<Lbm82ThreadPrmPkey> selectByExample(Lbm82ThreadPrmPkeyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lb01_pt.lbm82_thread_prm_pkey
     *
     * @mbggenerated Mon Jan 22 17:43:51 CST 2018
     */
    int updateByExampleSelective(@Param("record") Lbm82ThreadPrmPkey record, @Param("example") Lbm82ThreadPrmPkeyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lb01_pt.lbm82_thread_prm_pkey
     *
     * @mbggenerated Mon Jan 22 17:43:51 CST 2018
     */
    int updateByExample(@Param("record") Lbm82ThreadPrmPkey record, @Param("example") Lbm82ThreadPrmPkeyExample example);
}