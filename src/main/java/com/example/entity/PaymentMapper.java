package com.example.entity;

import com.example.entity.Payment;
import com.example.entity.PaymentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PaymentMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table payment
     *
     * @mbggenerated Sat Jan 20 09:14:44 CST 2018
     */
    int countByExample(PaymentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table payment
     *
     * @mbggenerated Sat Jan 20 09:14:44 CST 2018
     */
    int deleteByExample(PaymentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table payment
     *
     * @mbggenerated Sat Jan 20 09:14:44 CST 2018
     */
    int deleteByPrimaryKey(Short paymentId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table payment
     *
     * @mbggenerated Sat Jan 20 09:14:44 CST 2018
     */
    int insert(Payment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table payment
     *
     * @mbggenerated Sat Jan 20 09:14:44 CST 2018
     */
    int insertSelective(Payment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table payment
     *
     * @mbggenerated Sat Jan 20 09:14:44 CST 2018
     */
    List<Payment> selectByExample(PaymentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table payment
     *
     * @mbggenerated Sat Jan 20 09:14:44 CST 2018
     */
    Payment selectByPrimaryKey(Short paymentId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table payment
     *
     * @mbggenerated Sat Jan 20 09:14:44 CST 2018
     */
    int updateByExampleSelective(@Param("record") Payment record, @Param("example") PaymentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table payment
     *
     * @mbggenerated Sat Jan 20 09:14:44 CST 2018
     */
    int updateByExample(@Param("record") Payment record, @Param("example") PaymentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table payment
     *
     * @mbggenerated Sat Jan 20 09:14:44 CST 2018
     */
    int updateByPrimaryKeySelective(Payment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table payment
     *
     * @mbggenerated Sat Jan 20 09:14:44 CST 2018
     */
    int updateByPrimaryKey(Payment record);
}