package com.feast.kanjo.entity;

import com.feast.kanjo.entity.Lmm91CdnmPkey;
import com.feast.kanjo.entity.Lmm91CdnmPkeyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Lmm91CdnmPkeyMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lb01_pt.lmm91_cdnm_pkey
     *
     * @mbggenerated Mon Jan 22 17:43:52 CST 2018
     */
    int countByExample(Lmm91CdnmPkeyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lb01_pt.lmm91_cdnm_pkey
     *
     * @mbggenerated Mon Jan 22 17:43:52 CST 2018
     */
    int deleteByExample(Lmm91CdnmPkeyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lb01_pt.lmm91_cdnm_pkey
     *
     * @mbggenerated Mon Jan 22 17:43:52 CST 2018
     */
    int insert(Lmm91CdnmPkey record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lb01_pt.lmm91_cdnm_pkey
     *
     * @mbggenerated Mon Jan 22 17:43:52 CST 2018
     */
    int insertSelective(Lmm91CdnmPkey record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lb01_pt.lmm91_cdnm_pkey
     *
     * @mbggenerated Mon Jan 22 17:43:52 CST 2018
     */
    List<Lmm91CdnmPkey> selectByExample(Lmm91CdnmPkeyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lb01_pt.lmm91_cdnm_pkey
     *
     * @mbggenerated Mon Jan 22 17:43:52 CST 2018
     */
    int updateByExampleSelective(@Param("record") Lmm91CdnmPkey record, @Param("example") Lmm91CdnmPkeyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lb01_pt.lmm91_cdnm_pkey
     *
     * @mbggenerated Mon Jan 22 17:43:52 CST 2018
     */
    int updateByExample(@Param("record") Lmm91CdnmPkey record, @Param("example") Lmm91CdnmPkeyExample example);
}