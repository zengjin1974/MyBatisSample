package com.example.entity;

import com.example.entity.ActorInfo;
import com.example.entity.ActorInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ActorInfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table actor_info
     *
     * @mbggenerated Sat Jan 20 09:14:44 CST 2018
     */
    int countByExample(ActorInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table actor_info
     *
     * @mbggenerated Sat Jan 20 09:14:44 CST 2018
     */
    int deleteByExample(ActorInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table actor_info
     *
     * @mbggenerated Sat Jan 20 09:14:44 CST 2018
     */
    int insert(ActorInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table actor_info
     *
     * @mbggenerated Sat Jan 20 09:14:44 CST 2018
     */
    int insertSelective(ActorInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table actor_info
     *
     * @mbggenerated Sat Jan 20 09:14:44 CST 2018
     */
    List<ActorInfo> selectByExampleWithBLOBs(ActorInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table actor_info
     *
     * @mbggenerated Sat Jan 20 09:14:44 CST 2018
     */
    List<ActorInfo> selectByExample(ActorInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table actor_info
     *
     * @mbggenerated Sat Jan 20 09:14:44 CST 2018
     */
    int updateByExampleSelective(@Param("record") ActorInfo record, @Param("example") ActorInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table actor_info
     *
     * @mbggenerated Sat Jan 20 09:14:44 CST 2018
     */
    int updateByExampleWithBLOBs(@Param("record") ActorInfo record, @Param("example") ActorInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table actor_info
     *
     * @mbggenerated Sat Jan 20 09:14:44 CST 2018
     */
    int updateByExample(@Param("record") ActorInfo record, @Param("example") ActorInfoExample example);
}