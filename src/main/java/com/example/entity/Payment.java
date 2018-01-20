package com.example.entity;

import java.math.BigDecimal;
import java.util.Date;

public class Payment {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column payment.payment_id
     *
     * @mbggenerated Sat Jan 20 09:14:44 CST 2018
     */
    private Short paymentId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column payment.customer_id
     *
     * @mbggenerated Sat Jan 20 09:14:44 CST 2018
     */
    private Short customerId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column payment.staff_id
     *
     * @mbggenerated Sat Jan 20 09:14:44 CST 2018
     */
    private Byte staffId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column payment.rental_id
     *
     * @mbggenerated Sat Jan 20 09:14:44 CST 2018
     */
    private Integer rentalId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column payment.amount
     *
     * @mbggenerated Sat Jan 20 09:14:44 CST 2018
     */
    private BigDecimal amount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column payment.payment_date
     *
     * @mbggenerated Sat Jan 20 09:14:44 CST 2018
     */
    private Date paymentDate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column payment.last_update
     *
     * @mbggenerated Sat Jan 20 09:14:44 CST 2018
     */
    private Date lastUpdate;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column payment.payment_id
     *
     * @return the value of payment.payment_id
     *
     * @mbggenerated Sat Jan 20 09:14:44 CST 2018
     */
    public Short getPaymentId() {
        return paymentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column payment.payment_id
     *
     * @param paymentId the value for payment.payment_id
     *
     * @mbggenerated Sat Jan 20 09:14:44 CST 2018
     */
    public void setPaymentId(Short paymentId) {
        this.paymentId = paymentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column payment.customer_id
     *
     * @return the value of payment.customer_id
     *
     * @mbggenerated Sat Jan 20 09:14:44 CST 2018
     */
    public Short getCustomerId() {
        return customerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column payment.customer_id
     *
     * @param customerId the value for payment.customer_id
     *
     * @mbggenerated Sat Jan 20 09:14:44 CST 2018
     */
    public void setCustomerId(Short customerId) {
        this.customerId = customerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column payment.staff_id
     *
     * @return the value of payment.staff_id
     *
     * @mbggenerated Sat Jan 20 09:14:44 CST 2018
     */
    public Byte getStaffId() {
        return staffId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column payment.staff_id
     *
     * @param staffId the value for payment.staff_id
     *
     * @mbggenerated Sat Jan 20 09:14:44 CST 2018
     */
    public void setStaffId(Byte staffId) {
        this.staffId = staffId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column payment.rental_id
     *
     * @return the value of payment.rental_id
     *
     * @mbggenerated Sat Jan 20 09:14:44 CST 2018
     */
    public Integer getRentalId() {
        return rentalId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column payment.rental_id
     *
     * @param rentalId the value for payment.rental_id
     *
     * @mbggenerated Sat Jan 20 09:14:44 CST 2018
     */
    public void setRentalId(Integer rentalId) {
        this.rentalId = rentalId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column payment.amount
     *
     * @return the value of payment.amount
     *
     * @mbggenerated Sat Jan 20 09:14:44 CST 2018
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column payment.amount
     *
     * @param amount the value for payment.amount
     *
     * @mbggenerated Sat Jan 20 09:14:44 CST 2018
     */
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column payment.payment_date
     *
     * @return the value of payment.payment_date
     *
     * @mbggenerated Sat Jan 20 09:14:44 CST 2018
     */
    public Date getPaymentDate() {
        return paymentDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column payment.payment_date
     *
     * @param paymentDate the value for payment.payment_date
     *
     * @mbggenerated Sat Jan 20 09:14:44 CST 2018
     */
    public void setPaymentDate(Date paymentDate) {
        this.paymentDate = paymentDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column payment.last_update
     *
     * @return the value of payment.last_update
     *
     * @mbggenerated Sat Jan 20 09:14:44 CST 2018
     */
    public Date getLastUpdate() {
        return lastUpdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column payment.last_update
     *
     * @param lastUpdate the value for payment.last_update
     *
     * @mbggenerated Sat Jan 20 09:14:44 CST 2018
     */
    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }
}