package com.example.entity;

import java.util.Date;

public class FilmActor extends FilmActorKey {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column film_actor.last_update
     *
     * @mbggenerated Sat Jan 20 09:14:44 CST 2018
     */
    private Date lastUpdate;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column film_actor.last_update
     *
     * @return the value of film_actor.last_update
     *
     * @mbggenerated Sat Jan 20 09:14:44 CST 2018
     */
    public Date getLastUpdate() {
        return lastUpdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column film_actor.last_update
     *
     * @param lastUpdate the value for film_actor.last_update
     *
     * @mbggenerated Sat Jan 20 09:14:44 CST 2018
     */
    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }
}