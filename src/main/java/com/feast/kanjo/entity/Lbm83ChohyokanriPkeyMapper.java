package com.feast.kanjo.entity;

import com.feast.kanjo.entity.Lbm83ChohyokanriPkey;
import com.feast.kanjo.entity.Lbm83ChohyokanriPkeyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Lbm83ChohyokanriPkeyMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lb01_pt.lbm83_chohyokanri_pkey
     *
     * @mbggenerated Mon Jan 22 17:43:51 CST 2018
     */
    int countByExample(Lbm83ChohyokanriPkeyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lb01_pt.lbm83_chohyokanri_pkey
     *
     * @mbggenerated Mon Jan 22 17:43:51 CST 2018
     */
    int deleteByExample(Lbm83ChohyokanriPkeyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lb01_pt.lbm83_chohyokanri_pkey
     *
     * @mbggenerated Mon Jan 22 17:43:51 CST 2018
     */
    int insert(Lbm83ChohyokanriPkey record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lb01_pt.lbm83_chohyokanri_pkey
     *
     * @mbggenerated Mon Jan 22 17:43:51 CST 2018
     */
    int insertSelective(Lbm83ChohyokanriPkey record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lb01_pt.lbm83_chohyokanri_pkey
     *
     * @mbggenerated Mon Jan 22 17:43:51 CST 2018
     */
    List<Lbm83ChohyokanriPkey> selectByExample(Lbm83ChohyokanriPkeyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lb01_pt.lbm83_chohyokanri_pkey
     *
     * @mbggenerated Mon Jan 22 17:43:51 CST 2018
     */
    int updateByExampleSelective(@Param("record") Lbm83ChohyokanriPkey record, @Param("example") Lbm83ChohyokanriPkeyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lb01_pt.lbm83_chohyokanri_pkey
     *
     * @mbggenerated Mon Jan 22 17:43:51 CST 2018
     */
    int updateByExample(@Param("record") Lbm83ChohyokanriPkey record, @Param("example") Lbm83ChohyokanriPkeyExample example);
}