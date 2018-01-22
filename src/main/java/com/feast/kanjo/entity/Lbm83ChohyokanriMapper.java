package com.feast.kanjo.entity;

import com.feast.kanjo.entity.Lbm83Chohyokanri;
import com.feast.kanjo.entity.Lbm83ChohyokanriExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Lbm83ChohyokanriMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lb01_pt.lbm83_chohyokanri
     *
     * @mbggenerated Mon Jan 22 17:43:51 CST 2018
     */
    int countByExample(Lbm83ChohyokanriExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lb01_pt.lbm83_chohyokanri
     *
     * @mbggenerated Mon Jan 22 17:43:51 CST 2018
     */
    int deleteByExample(Lbm83ChohyokanriExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lb01_pt.lbm83_chohyokanri
     *
     * @mbggenerated Mon Jan 22 17:43:51 CST 2018
     */
    int deleteByPrimaryKey(String chohyoshbtsuid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lb01_pt.lbm83_chohyokanri
     *
     * @mbggenerated Mon Jan 22 17:43:51 CST 2018
     */
    int insert(Lbm83Chohyokanri record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lb01_pt.lbm83_chohyokanri
     *
     * @mbggenerated Mon Jan 22 17:43:51 CST 2018
     */
    int insertSelective(Lbm83Chohyokanri record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lb01_pt.lbm83_chohyokanri
     *
     * @mbggenerated Mon Jan 22 17:43:51 CST 2018
     */
    List<Lbm83Chohyokanri> selectByExample(Lbm83ChohyokanriExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lb01_pt.lbm83_chohyokanri
     *
     * @mbggenerated Mon Jan 22 17:43:51 CST 2018
     */
    Lbm83Chohyokanri selectByPrimaryKey(String chohyoshbtsuid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lb01_pt.lbm83_chohyokanri
     *
     * @mbggenerated Mon Jan 22 17:43:51 CST 2018
     */
    int updateByExampleSelective(@Param("record") Lbm83Chohyokanri record, @Param("example") Lbm83ChohyokanriExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lb01_pt.lbm83_chohyokanri
     *
     * @mbggenerated Mon Jan 22 17:43:51 CST 2018
     */
    int updateByExample(@Param("record") Lbm83Chohyokanri record, @Param("example") Lbm83ChohyokanriExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lb01_pt.lbm83_chohyokanri
     *
     * @mbggenerated Mon Jan 22 17:43:51 CST 2018
     */
    int updateByPrimaryKeySelective(Lbm83Chohyokanri record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lb01_pt.lbm83_chohyokanri
     *
     * @mbggenerated Mon Jan 22 17:43:51 CST 2018
     */
    int updateByPrimaryKey(Lbm83Chohyokanri record);
}