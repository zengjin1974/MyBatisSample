package com.feast.kanjo.entity;

import com.feast.kanjo.entity.Lma04MisePkey;
import com.feast.kanjo.entity.Lma04MisePkeyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Lma04MisePkeyMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lb01_pt.lma04_mise_pkey
     *
     * @mbggenerated Mon Jan 22 17:43:52 CST 2018
     */
    int countByExample(Lma04MisePkeyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lb01_pt.lma04_mise_pkey
     *
     * @mbggenerated Mon Jan 22 17:43:52 CST 2018
     */
    int deleteByExample(Lma04MisePkeyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lb01_pt.lma04_mise_pkey
     *
     * @mbggenerated Mon Jan 22 17:43:52 CST 2018
     */
    int insert(Lma04MisePkey record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lb01_pt.lma04_mise_pkey
     *
     * @mbggenerated Mon Jan 22 17:43:52 CST 2018
     */
    int insertSelective(Lma04MisePkey record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lb01_pt.lma04_mise_pkey
     *
     * @mbggenerated Mon Jan 22 17:43:52 CST 2018
     */
    List<Lma04MisePkey> selectByExample(Lma04MisePkeyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lb01_pt.lma04_mise_pkey
     *
     * @mbggenerated Mon Jan 22 17:43:52 CST 2018
     */
    int updateByExampleSelective(@Param("record") Lma04MisePkey record, @Param("example") Lma04MisePkeyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lb01_pt.lma04_mise_pkey
     *
     * @mbggenerated Mon Jan 22 17:43:52 CST 2018
     */
    int updateByExample(@Param("record") Lma04MisePkey record, @Param("example") Lma04MisePkeyExample example);
}