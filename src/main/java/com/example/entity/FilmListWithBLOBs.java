package com.example.entity;

public class FilmListWithBLOBs extends FilmList {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column film_list.description
     *
     * @mbggenerated Sat Jan 20 09:14:44 CST 2018
     */
    private String description;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column film_list.actors
     *
     * @mbggenerated Sat Jan 20 09:14:44 CST 2018
     */
    private String actors;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column film_list.description
     *
     * @return the value of film_list.description
     *
     * @mbggenerated Sat Jan 20 09:14:44 CST 2018
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column film_list.description
     *
     * @param description the value for film_list.description
     *
     * @mbggenerated Sat Jan 20 09:14:44 CST 2018
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column film_list.actors
     *
     * @return the value of film_list.actors
     *
     * @mbggenerated Sat Jan 20 09:14:44 CST 2018
     */
    public String getActors() {
        return actors;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column film_list.actors
     *
     * @param actors the value for film_list.actors
     *
     * @mbggenerated Sat Jan 20 09:14:44 CST 2018
     */
    public void setActors(String actors) {
        this.actors = actors;
    }
}