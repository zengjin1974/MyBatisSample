package com.example.entity;

public class FilmActorKey {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column film_actor.actor_id
     *
     * @mbggenerated Sat Jan 20 09:14:44 CST 2018
     */
    private Short actorId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column film_actor.film_id
     *
     * @mbggenerated Sat Jan 20 09:14:44 CST 2018
     */
    private Short filmId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column film_actor.actor_id
     *
     * @return the value of film_actor.actor_id
     *
     * @mbggenerated Sat Jan 20 09:14:44 CST 2018
     */
    public Short getActorId() {
        return actorId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column film_actor.actor_id
     *
     * @param actorId the value for film_actor.actor_id
     *
     * @mbggenerated Sat Jan 20 09:14:44 CST 2018
     */
    public void setActorId(Short actorId) {
        this.actorId = actorId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column film_actor.film_id
     *
     * @return the value of film_actor.film_id
     *
     * @mbggenerated Sat Jan 20 09:14:44 CST 2018
     */
    public Short getFilmId() {
        return filmId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column film_actor.film_id
     *
     * @param filmId the value for film_actor.film_id
     *
     * @mbggenerated Sat Jan 20 09:14:44 CST 2018
     */
    public void setFilmId(Short filmId) {
        this.filmId = filmId;
    }
}