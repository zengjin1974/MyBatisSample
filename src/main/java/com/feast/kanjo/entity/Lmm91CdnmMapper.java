package com.feast.kanjo.entity;

import com.feast.kanjo.entity.Lmm91Cdnm;
import com.feast.kanjo.entity.Lmm91CdnmExample;
import com.feast.kanjo.entity.Lmm91CdnmKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Lmm91CdnmMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lb01_pt.lmm91_cdnm
     *
     * @mbggenerated Mon Jan 22 17:43:52 CST 2018
     */
    int countByExample(Lmm91CdnmExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lb01_pt.lmm91_cdnm
     *
     * @mbggenerated Mon Jan 22 17:43:52 CST 2018
     */
    int deleteByExample(Lmm91CdnmExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lb01_pt.lmm91_cdnm
     *
     * @mbggenerated Mon Jan 22 17:43:52 CST 2018
     */
    int deleteByPrimaryKey(Lmm91CdnmKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lb01_pt.lmm91_cdnm
     *
     * @mbggenerated Mon Jan 22 17:43:52 CST 2018
     */
    int insert(Lmm91Cdnm record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lb01_pt.lmm91_cdnm
     *
     * @mbggenerated Mon Jan 22 17:43:52 CST 2018
     */
    int insertSelective(Lmm91Cdnm record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lb01_pt.lmm91_cdnm
     *
     * @mbggenerated Mon Jan 22 17:43:52 CST 2018
     */
    List<Lmm91Cdnm> selectByExample(Lmm91CdnmExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lb01_pt.lmm91_cdnm
     *
     * @mbggenerated Mon Jan 22 17:43:52 CST 2018
     */
    Lmm91Cdnm selectByPrimaryKey(Lmm91CdnmKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lb01_pt.lmm91_cdnm
     *
     * @mbggenerated Mon Jan 22 17:43:52 CST 2018
     */
    int updateByExampleSelective(@Param("record") Lmm91Cdnm record, @Param("example") Lmm91CdnmExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lb01_pt.lmm91_cdnm
     *
     * @mbggenerated Mon Jan 22 17:43:52 CST 2018
     */
    int updateByExample(@Param("record") Lmm91Cdnm record, @Param("example") Lmm91CdnmExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lb01_pt.lmm91_cdnm
     *
     * @mbggenerated Mon Jan 22 17:43:52 CST 2018
     */
    int updateByPrimaryKeySelective(Lmm91Cdnm record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lb01_pt.lmm91_cdnm
     *
     * @mbggenerated Mon Jan 22 17:43:52 CST 2018
     */
    int updateByPrimaryKey(Lmm91Cdnm record);
}