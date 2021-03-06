package com.feast.kanjo.entity;

import com.feast.kanjo.entity.Lma08Hinban;
import com.feast.kanjo.entity.Lma08HinbanExample;
import com.feast.kanjo.entity.Lma08HinbanKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Lma08HinbanMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lb01_pt.lma08_hinban
     *
     * @mbggenerated Mon Jan 22 17:43:52 CST 2018
     */
    int countByExample(Lma08HinbanExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lb01_pt.lma08_hinban
     *
     * @mbggenerated Mon Jan 22 17:43:52 CST 2018
     */
    int deleteByExample(Lma08HinbanExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lb01_pt.lma08_hinban
     *
     * @mbggenerated Mon Jan 22 17:43:52 CST 2018
     */
    int deleteByPrimaryKey(Lma08HinbanKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lb01_pt.lma08_hinban
     *
     * @mbggenerated Mon Jan 22 17:43:52 CST 2018
     */
    int insert(Lma08Hinban record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lb01_pt.lma08_hinban
     *
     * @mbggenerated Mon Jan 22 17:43:52 CST 2018
     */
    int insertSelective(Lma08Hinban record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lb01_pt.lma08_hinban
     *
     * @mbggenerated Mon Jan 22 17:43:52 CST 2018
     */
    List<Lma08Hinban> selectByExample(Lma08HinbanExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lb01_pt.lma08_hinban
     *
     * @mbggenerated Mon Jan 22 17:43:52 CST 2018
     */
    Lma08Hinban selectByPrimaryKey(Lma08HinbanKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lb01_pt.lma08_hinban
     *
     * @mbggenerated Mon Jan 22 17:43:52 CST 2018
     */
    int updateByExampleSelective(@Param("record") Lma08Hinban record, @Param("example") Lma08HinbanExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lb01_pt.lma08_hinban
     *
     * @mbggenerated Mon Jan 22 17:43:52 CST 2018
     */
    int updateByExample(@Param("record") Lma08Hinban record, @Param("example") Lma08HinbanExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lb01_pt.lma08_hinban
     *
     * @mbggenerated Mon Jan 22 17:43:52 CST 2018
     */
    int updateByPrimaryKeySelective(Lma08Hinban record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lb01_pt.lma08_hinban
     *
     * @mbggenerated Mon Jan 22 17:43:52 CST 2018
     */
    int updateByPrimaryKey(Lma08Hinban record);
}