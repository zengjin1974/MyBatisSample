package com.example.entity;

import java.util.Date;

public class Inventory {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column inventory.inventory_id
     *
     * @mbggenerated Sat Jan 20 09:14:44 CST 2018
     */
    private Integer inventoryId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column inventory.film_id
     *
     * @mbggenerated Sat Jan 20 09:14:44 CST 2018
     */
    private Short filmId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column inventory.store_id
     *
     * @mbggenerated Sat Jan 20 09:14:44 CST 2018
     */
    private Byte storeId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column inventory.last_update
     *
     * @mbggenerated Sat Jan 20 09:14:44 CST 2018
     */
    private Date lastUpdate;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column inventory.inventory_id
     *
     * @return the value of inventory.inventory_id
     *
     * @mbggenerated Sat Jan 20 09:14:44 CST 2018
     */
    public Integer getInventoryId() {
        return inventoryId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column inventory.inventory_id
     *
     * @param inventoryId the value for inventory.inventory_id
     *
     * @mbggenerated Sat Jan 20 09:14:44 CST 2018
     */
    public void setInventoryId(Integer inventoryId) {
        this.inventoryId = inventoryId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column inventory.film_id
     *
     * @return the value of inventory.film_id
     *
     * @mbggenerated Sat Jan 20 09:14:44 CST 2018
     */
    public Short getFilmId() {
        return filmId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column inventory.film_id
     *
     * @param filmId the value for inventory.film_id
     *
     * @mbggenerated Sat Jan 20 09:14:44 CST 2018
     */
    public void setFilmId(Short filmId) {
        this.filmId = filmId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column inventory.store_id
     *
     * @return the value of inventory.store_id
     *
     * @mbggenerated Sat Jan 20 09:14:44 CST 2018
     */
    public Byte getStoreId() {
        return storeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column inventory.store_id
     *
     * @param storeId the value for inventory.store_id
     *
     * @mbggenerated Sat Jan 20 09:14:44 CST 2018
     */
    public void setStoreId(Byte storeId) {
        this.storeId = storeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column inventory.last_update
     *
     * @return the value of inventory.last_update
     *
     * @mbggenerated Sat Jan 20 09:14:44 CST 2018
     */
    public Date getLastUpdate() {
        return lastUpdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column inventory.last_update
     *
     * @param lastUpdate the value for inventory.last_update
     *
     * @mbggenerated Sat Jan 20 09:14:44 CST 2018
     */
    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }
}