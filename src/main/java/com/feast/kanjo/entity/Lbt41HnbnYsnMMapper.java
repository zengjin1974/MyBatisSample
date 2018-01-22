package com.feast.kanjo.entity;

import com.feast.kanjo.entity.Lbt41HnbnYsnM;
import com.feast.kanjo.entity.Lbt41HnbnYsnMExample;
import com.feast.kanjo.entity.Lbt41HnbnYsnMKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Lbt41HnbnYsnMMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lb01_pt.lbt41_hnbn_ysn_m
     *
     * @mbggenerated Mon Jan 22 17:43:51 CST 2018
     */
    int countByExample(Lbt41HnbnYsnMExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lb01_pt.lbt41_hnbn_ysn_m
     *
     * @mbggenerated Mon Jan 22 17:43:51 CST 2018
     */
    int deleteByExample(Lbt41HnbnYsnMExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lb01_pt.lbt41_hnbn_ysn_m
     *
     * @mbggenerated Mon Jan 22 17:43:51 CST 2018
     */
    int deleteByPrimaryKey(Lbt41HnbnYsnMKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lb01_pt.lbt41_hnbn_ysn_m
     *
     * @mbggenerated Mon Jan 22 17:43:51 CST 2018
     */
    int insert(Lbt41HnbnYsnM record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lb01_pt.lbt41_hnbn_ysn_m
     *
     * @mbggenerated Mon Jan 22 17:43:51 CST 2018
     */
    int insertSelective(Lbt41HnbnYsnM record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lb01_pt.lbt41_hnbn_ysn_m
     *
     * @mbggenerated Mon Jan 22 17:43:51 CST 2018
     */
    List<Lbt41HnbnYsnM> selectByExample(Lbt41HnbnYsnMExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lb01_pt.lbt41_hnbn_ysn_m
     *
     * @mbggenerated Mon Jan 22 17:43:51 CST 2018
     */
    Lbt41HnbnYsnM selectByPrimaryKey(Lbt41HnbnYsnMKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lb01_pt.lbt41_hnbn_ysn_m
     *
     * @mbggenerated Mon Jan 22 17:43:51 CST 2018
     */
    int updateByExampleSelective(@Param("record") Lbt41HnbnYsnM record, @Param("example") Lbt41HnbnYsnMExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lb01_pt.lbt41_hnbn_ysn_m
     *
     * @mbggenerated Mon Jan 22 17:43:51 CST 2018
     */
    int updateByExample(@Param("record") Lbt41HnbnYsnM record, @Param("example") Lbt41HnbnYsnMExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lb01_pt.lbt41_hnbn_ysn_m
     *
     * @mbggenerated Mon Jan 22 17:43:51 CST 2018
     */
    int updateByPrimaryKeySelective(Lbt41HnbnYsnM record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lb01_pt.lbt41_hnbn_ysn_m
     *
     * @mbggenerated Mon Jan 22 17:43:51 CST 2018
     */
    int updateByPrimaryKey(Lbt41HnbnYsnM record);
}