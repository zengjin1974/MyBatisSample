package com.example.entity;

import java.util.Date;

public class Language {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column language.language_id
     *
     * @mbggenerated Sat Jan 20 09:14:44 CST 2018
     */
    private Byte languageId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column language.name
     *
     * @mbggenerated Sat Jan 20 09:14:44 CST 2018
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column language.last_update
     *
     * @mbggenerated Sat Jan 20 09:14:44 CST 2018
     */
    private Date lastUpdate;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column language.language_id
     *
     * @return the value of language.language_id
     *
     * @mbggenerated Sat Jan 20 09:14:44 CST 2018
     */
    public Byte getLanguageId() {
        return languageId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column language.language_id
     *
     * @param languageId the value for language.language_id
     *
     * @mbggenerated Sat Jan 20 09:14:44 CST 2018
     */
    public void setLanguageId(Byte languageId) {
        this.languageId = languageId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column language.name
     *
     * @return the value of language.name
     *
     * @mbggenerated Sat Jan 20 09:14:44 CST 2018
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column language.name
     *
     * @param name the value for language.name
     *
     * @mbggenerated Sat Jan 20 09:14:44 CST 2018
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column language.last_update
     *
     * @return the value of language.last_update
     *
     * @mbggenerated Sat Jan 20 09:14:44 CST 2018
     */
    public Date getLastUpdate() {
        return lastUpdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column language.last_update
     *
     * @param lastUpdate the value for language.last_update
     *
     * @mbggenerated Sat Jan 20 09:14:44 CST 2018
     */
    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }
}