package com.example.entity;

import java.util.Date;

public class Rental {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column rental.rental_id
     *
     * @mbggenerated Sat Jan 20 09:14:44 CST 2018
     */
    private Integer rentalId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column rental.rental_date
     *
     * @mbggenerated Sat Jan 20 09:14:44 CST 2018
     */
    private Date rentalDate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column rental.inventory_id
     *
     * @mbggenerated Sat Jan 20 09:14:44 CST 2018
     */
    private Integer inventoryId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column rental.customer_id
     *
     * @mbggenerated Sat Jan 20 09:14:44 CST 2018
     */
    private Short customerId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column rental.return_date
     *
     * @mbggenerated Sat Jan 20 09:14:44 CST 2018
     */
    private Date returnDate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column rental.staff_id
     *
     * @mbggenerated Sat Jan 20 09:14:44 CST 2018
     */
    private Byte staffId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column rental.last_update
     *
     * @mbggenerated Sat Jan 20 09:14:44 CST 2018
     */
    private Date lastUpdate;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column rental.rental_id
     *
     * @return the value of rental.rental_id
     *
     * @mbggenerated Sat Jan 20 09:14:44 CST 2018
     */
    public Integer getRentalId() {
        return rentalId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column rental.rental_id
     *
     * @param rentalId the value for rental.rental_id
     *
     * @mbggenerated Sat Jan 20 09:14:44 CST 2018
     */
    public void setRentalId(Integer rentalId) {
        this.rentalId = rentalId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column rental.rental_date
     *
     * @return the value of rental.rental_date
     *
     * @mbggenerated Sat Jan 20 09:14:44 CST 2018
     */
    public Date getRentalDate() {
        return rentalDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column rental.rental_date
     *
     * @param rentalDate the value for rental.rental_date
     *
     * @mbggenerated Sat Jan 20 09:14:44 CST 2018
     */
    public void setRentalDate(Date rentalDate) {
        this.rentalDate = rentalDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column rental.inventory_id
     *
     * @return the value of rental.inventory_id
     *
     * @mbggenerated Sat Jan 20 09:14:44 CST 2018
     */
    public Integer getInventoryId() {
        return inventoryId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column rental.inventory_id
     *
     * @param inventoryId the value for rental.inventory_id
     *
     * @mbggenerated Sat Jan 20 09:14:44 CST 2018
     */
    public void setInventoryId(Integer inventoryId) {
        this.inventoryId = inventoryId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column rental.customer_id
     *
     * @return the value of rental.customer_id
     *
     * @mbggenerated Sat Jan 20 09:14:44 CST 2018
     */
    public Short getCustomerId() {
        return customerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column rental.customer_id
     *
     * @param customerId the value for rental.customer_id
     *
     * @mbggenerated Sat Jan 20 09:14:44 CST 2018
     */
    public void setCustomerId(Short customerId) {
        this.customerId = customerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column rental.return_date
     *
     * @return the value of rental.return_date
     *
     * @mbggenerated Sat Jan 20 09:14:44 CST 2018
     */
    public Date getReturnDate() {
        return returnDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column rental.return_date
     *
     * @param returnDate the value for rental.return_date
     *
     * @mbggenerated Sat Jan 20 09:14:44 CST 2018
     */
    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column rental.staff_id
     *
     * @return the value of rental.staff_id
     *
     * @mbggenerated Sat Jan 20 09:14:44 CST 2018
     */
    public Byte getStaffId() {
        return staffId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column rental.staff_id
     *
     * @param staffId the value for rental.staff_id
     *
     * @mbggenerated Sat Jan 20 09:14:44 CST 2018
     */
    public void setStaffId(Byte staffId) {
        this.staffId = staffId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column rental.last_update
     *
     * @return the value of rental.last_update
     *
     * @mbggenerated Sat Jan 20 09:14:44 CST 2018
     */
    public Date getLastUpdate() {
        return lastUpdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column rental.last_update
     *
     * @param lastUpdate the value for rental.last_update
     *
     * @mbggenerated Sat Jan 20 09:14:44 CST 2018
     */
    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }
}