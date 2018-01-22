package com.feast.kanjo.entity;

import com.feast.kanjo.entity.Lbw97Gaisyopos;
import com.feast.kanjo.entity.Lbw97GaisyoposExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Lbw97GaisyoposMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lb01_pt.lbw97_gaisyopos
     *
     * @mbggenerated Mon Jan 22 17:43:52 CST 2018
     */
    int countByExample(Lbw97GaisyoposExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lb01_pt.lbw97_gaisyopos
     *
     * @mbggenerated Mon Jan 22 17:43:52 CST 2018
     */
    int deleteByExample(Lbw97GaisyoposExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lb01_pt.lbw97_gaisyopos
     *
     * @mbggenerated Mon Jan 22 17:43:52 CST 2018
     */
    int insert(Lbw97Gaisyopos record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lb01_pt.lbw97_gaisyopos
     *
     * @mbggenerated Mon Jan 22 17:43:52 CST 2018
     */
    int insertSelective(Lbw97Gaisyopos record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lb01_pt.lbw97_gaisyopos
     *
     * @mbggenerated Mon Jan 22 17:43:52 CST 2018
     */
    List<Lbw97Gaisyopos> selectByExample(Lbw97GaisyoposExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lb01_pt.lbw97_gaisyopos
     *
     * @mbggenerated Mon Jan 22 17:43:52 CST 2018
     */
    int updateByExampleSelective(@Param("record") Lbw97Gaisyopos record, @Param("example") Lbw97GaisyoposExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lb01_pt.lbw97_gaisyopos
     *
     * @mbggenerated Mon Jan 22 17:43:52 CST 2018
     */
    int updateByExample(@Param("record") Lbw97Gaisyopos record, @Param("example") Lbw97GaisyoposExample example);
}