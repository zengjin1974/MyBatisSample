package com.feast.kanjo.entity;

import java.util.ArrayList;
import java.util.List;

public class Lbw96ZentenposExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table lb01_pt.lbw96_zentenpos
     *
     * @mbggenerated Mon Jan 22 17:43:52 CST 2018
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table lb01_pt.lbw96_zentenpos
     *
     * @mbggenerated Mon Jan 22 17:43:52 CST 2018
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table lb01_pt.lbw96_zentenpos
     *
     * @mbggenerated Mon Jan 22 17:43:52 CST 2018
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lb01_pt.lbw96_zentenpos
     *
     * @mbggenerated Mon Jan 22 17:43:52 CST 2018
     */
    public Lbw96ZentenposExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lb01_pt.lbw96_zentenpos
     *
     * @mbggenerated Mon Jan 22 17:43:52 CST 2018
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lb01_pt.lbw96_zentenpos
     *
     * @mbggenerated Mon Jan 22 17:43:52 CST 2018
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lb01_pt.lbw96_zentenpos
     *
     * @mbggenerated Mon Jan 22 17:43:52 CST 2018
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lb01_pt.lbw96_zentenpos
     *
     * @mbggenerated Mon Jan 22 17:43:52 CST 2018
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lb01_pt.lbw96_zentenpos
     *
     * @mbggenerated Mon Jan 22 17:43:52 CST 2018
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lb01_pt.lbw96_zentenpos
     *
     * @mbggenerated Mon Jan 22 17:43:52 CST 2018
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lb01_pt.lbw96_zentenpos
     *
     * @mbggenerated Mon Jan 22 17:43:52 CST 2018
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lb01_pt.lbw96_zentenpos
     *
     * @mbggenerated Mon Jan 22 17:43:52 CST 2018
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lb01_pt.lbw96_zentenpos
     *
     * @mbggenerated Mon Jan 22 17:43:52 CST 2018
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lb01_pt.lbw96_zentenpos
     *
     * @mbggenerated Mon Jan 22 17:43:52 CST 2018
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table lb01_pt.lbw96_zentenpos
     *
     * @mbggenerated Mon Jan 22 17:43:52 CST 2018
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andYmdIsNull() {
            addCriterion("ymd is null");
            return (Criteria) this;
        }

        public Criteria andYmdIsNotNull() {
            addCriterion("ymd is not null");
            return (Criteria) this;
        }

        public Criteria andYmdEqualTo(Integer value) {
            addCriterion("ymd =", value, "ymd");
            return (Criteria) this;
        }

        public Criteria andYmdNotEqualTo(Integer value) {
            addCriterion("ymd <>", value, "ymd");
            return (Criteria) this;
        }

        public Criteria andYmdGreaterThan(Integer value) {
            addCriterion("ymd >", value, "ymd");
            return (Criteria) this;
        }

        public Criteria andYmdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ymd >=", value, "ymd");
            return (Criteria) this;
        }

        public Criteria andYmdLessThan(Integer value) {
            addCriterion("ymd <", value, "ymd");
            return (Criteria) this;
        }

        public Criteria andYmdLessThanOrEqualTo(Integer value) {
            addCriterion("ymd <=", value, "ymd");
            return (Criteria) this;
        }

        public Criteria andYmdIn(List<Integer> values) {
            addCriterion("ymd in", values, "ymd");
            return (Criteria) this;
        }

        public Criteria andYmdNotIn(List<Integer> values) {
            addCriterion("ymd not in", values, "ymd");
            return (Criteria) this;
        }

        public Criteria andYmdBetween(Integer value1, Integer value2) {
            addCriterion("ymd between", value1, value2, "ymd");
            return (Criteria) this;
        }

        public Criteria andYmdNotBetween(Integer value1, Integer value2) {
            addCriterion("ymd not between", value1, value2, "ymd");
            return (Criteria) this;
        }

        public Criteria andSysgrpcdIsNull() {
            addCriterion("sysgrpcd is null");
            return (Criteria) this;
        }

        public Criteria andSysgrpcdIsNotNull() {
            addCriterion("sysgrpcd is not null");
            return (Criteria) this;
        }

        public Criteria andSysgrpcdEqualTo(String value) {
            addCriterion("sysgrpcd =", value, "sysgrpcd");
            return (Criteria) this;
        }

        public Criteria andSysgrpcdNotEqualTo(String value) {
            addCriterion("sysgrpcd <>", value, "sysgrpcd");
            return (Criteria) this;
        }

        public Criteria andSysgrpcdGreaterThan(String value) {
            addCriterion("sysgrpcd >", value, "sysgrpcd");
            return (Criteria) this;
        }

        public Criteria andSysgrpcdGreaterThanOrEqualTo(String value) {
            addCriterion("sysgrpcd >=", value, "sysgrpcd");
            return (Criteria) this;
        }

        public Criteria andSysgrpcdLessThan(String value) {
            addCriterion("sysgrpcd <", value, "sysgrpcd");
            return (Criteria) this;
        }

        public Criteria andSysgrpcdLessThanOrEqualTo(String value) {
            addCriterion("sysgrpcd <=", value, "sysgrpcd");
            return (Criteria) this;
        }

        public Criteria andSysgrpcdLike(String value) {
            addCriterion("sysgrpcd like", value, "sysgrpcd");
            return (Criteria) this;
        }

        public Criteria andSysgrpcdNotLike(String value) {
            addCriterion("sysgrpcd not like", value, "sysgrpcd");
            return (Criteria) this;
        }

        public Criteria andSysgrpcdIn(List<String> values) {
            addCriterion("sysgrpcd in", values, "sysgrpcd");
            return (Criteria) this;
        }

        public Criteria andSysgrpcdNotIn(List<String> values) {
            addCriterion("sysgrpcd not in", values, "sysgrpcd");
            return (Criteria) this;
        }

        public Criteria andSysgrpcdBetween(String value1, String value2) {
            addCriterion("sysgrpcd between", value1, value2, "sysgrpcd");
            return (Criteria) this;
        }

        public Criteria andSysgrpcdNotBetween(String value1, String value2) {
            addCriterion("sysgrpcd not between", value1, value2, "sysgrpcd");
            return (Criteria) this;
        }

        public Criteria andKgygrpcdIsNull() {
            addCriterion("kgygrpcd is null");
            return (Criteria) this;
        }

        public Criteria andKgygrpcdIsNotNull() {
            addCriterion("kgygrpcd is not null");
            return (Criteria) this;
        }

        public Criteria andKgygrpcdEqualTo(String value) {
            addCriterion("kgygrpcd =", value, "kgygrpcd");
            return (Criteria) this;
        }

        public Criteria andKgygrpcdNotEqualTo(String value) {
            addCriterion("kgygrpcd <>", value, "kgygrpcd");
            return (Criteria) this;
        }

        public Criteria andKgygrpcdGreaterThan(String value) {
            addCriterion("kgygrpcd >", value, "kgygrpcd");
            return (Criteria) this;
        }

        public Criteria andKgygrpcdGreaterThanOrEqualTo(String value) {
            addCriterion("kgygrpcd >=", value, "kgygrpcd");
            return (Criteria) this;
        }

        public Criteria andKgygrpcdLessThan(String value) {
            addCriterion("kgygrpcd <", value, "kgygrpcd");
            return (Criteria) this;
        }

        public Criteria andKgygrpcdLessThanOrEqualTo(String value) {
            addCriterion("kgygrpcd <=", value, "kgygrpcd");
            return (Criteria) this;
        }

        public Criteria andKgygrpcdLike(String value) {
            addCriterion("kgygrpcd like", value, "kgygrpcd");
            return (Criteria) this;
        }

        public Criteria andKgygrpcdNotLike(String value) {
            addCriterion("kgygrpcd not like", value, "kgygrpcd");
            return (Criteria) this;
        }

        public Criteria andKgygrpcdIn(List<String> values) {
            addCriterion("kgygrpcd in", values, "kgygrpcd");
            return (Criteria) this;
        }

        public Criteria andKgygrpcdNotIn(List<String> values) {
            addCriterion("kgygrpcd not in", values, "kgygrpcd");
            return (Criteria) this;
        }

        public Criteria andKgygrpcdBetween(String value1, String value2) {
            addCriterion("kgygrpcd between", value1, value2, "kgygrpcd");
            return (Criteria) this;
        }

        public Criteria andKgygrpcdNotBetween(String value1, String value2) {
            addCriterion("kgygrpcd not between", value1, value2, "kgygrpcd");
            return (Criteria) this;
        }

        public Criteria andTencdIsNull() {
            addCriterion("tencd is null");
            return (Criteria) this;
        }

        public Criteria andTencdIsNotNull() {
            addCriterion("tencd is not null");
            return (Criteria) this;
        }

        public Criteria andTencdEqualTo(String value) {
            addCriterion("tencd =", value, "tencd");
            return (Criteria) this;
        }

        public Criteria andTencdNotEqualTo(String value) {
            addCriterion("tencd <>", value, "tencd");
            return (Criteria) this;
        }

        public Criteria andTencdGreaterThan(String value) {
            addCriterion("tencd >", value, "tencd");
            return (Criteria) this;
        }

        public Criteria andTencdGreaterThanOrEqualTo(String value) {
            addCriterion("tencd >=", value, "tencd");
            return (Criteria) this;
        }

        public Criteria andTencdLessThan(String value) {
            addCriterion("tencd <", value, "tencd");
            return (Criteria) this;
        }

        public Criteria andTencdLessThanOrEqualTo(String value) {
            addCriterion("tencd <=", value, "tencd");
            return (Criteria) this;
        }

        public Criteria andTencdLike(String value) {
            addCriterion("tencd like", value, "tencd");
            return (Criteria) this;
        }

        public Criteria andTencdNotLike(String value) {
            addCriterion("tencd not like", value, "tencd");
            return (Criteria) this;
        }

        public Criteria andTencdIn(List<String> values) {
            addCriterion("tencd in", values, "tencd");
            return (Criteria) this;
        }

        public Criteria andTencdNotIn(List<String> values) {
            addCriterion("tencd not in", values, "tencd");
            return (Criteria) this;
        }

        public Criteria andTencdBetween(String value1, String value2) {
            addCriterion("tencd between", value1, value2, "tencd");
            return (Criteria) this;
        }

        public Criteria andTencdNotBetween(String value1, String value2) {
            addCriterion("tencd not between", value1, value2, "tencd");
            return (Criteria) this;
        }

        public Criteria andShohincd1IsNull() {
            addCriterion("shohincd1 is null");
            return (Criteria) this;
        }

        public Criteria andShohincd1IsNotNull() {
            addCriterion("shohincd1 is not null");
            return (Criteria) this;
        }

        public Criteria andShohincd1EqualTo(String value) {
            addCriterion("shohincd1 =", value, "shohincd1");
            return (Criteria) this;
        }

        public Criteria andShohincd1NotEqualTo(String value) {
            addCriterion("shohincd1 <>", value, "shohincd1");
            return (Criteria) this;
        }

        public Criteria andShohincd1GreaterThan(String value) {
            addCriterion("shohincd1 >", value, "shohincd1");
            return (Criteria) this;
        }

        public Criteria andShohincd1GreaterThanOrEqualTo(String value) {
            addCriterion("shohincd1 >=", value, "shohincd1");
            return (Criteria) this;
        }

        public Criteria andShohincd1LessThan(String value) {
            addCriterion("shohincd1 <", value, "shohincd1");
            return (Criteria) this;
        }

        public Criteria andShohincd1LessThanOrEqualTo(String value) {
            addCriterion("shohincd1 <=", value, "shohincd1");
            return (Criteria) this;
        }

        public Criteria andShohincd1Like(String value) {
            addCriterion("shohincd1 like", value, "shohincd1");
            return (Criteria) this;
        }

        public Criteria andShohincd1NotLike(String value) {
            addCriterion("shohincd1 not like", value, "shohincd1");
            return (Criteria) this;
        }

        public Criteria andShohincd1In(List<String> values) {
            addCriterion("shohincd1 in", values, "shohincd1");
            return (Criteria) this;
        }

        public Criteria andShohincd1NotIn(List<String> values) {
            addCriterion("shohincd1 not in", values, "shohincd1");
            return (Criteria) this;
        }

        public Criteria andShohincd1Between(String value1, String value2) {
            addCriterion("shohincd1 between", value1, value2, "shohincd1");
            return (Criteria) this;
        }

        public Criteria andShohincd1NotBetween(String value1, String value2) {
            addCriterion("shohincd1 not between", value1, value2, "shohincd1");
            return (Criteria) this;
        }

        public Criteria andShohincd2IsNull() {
            addCriterion("shohincd2 is null");
            return (Criteria) this;
        }

        public Criteria andShohincd2IsNotNull() {
            addCriterion("shohincd2 is not null");
            return (Criteria) this;
        }

        public Criteria andShohincd2EqualTo(String value) {
            addCriterion("shohincd2 =", value, "shohincd2");
            return (Criteria) this;
        }

        public Criteria andShohincd2NotEqualTo(String value) {
            addCriterion("shohincd2 <>", value, "shohincd2");
            return (Criteria) this;
        }

        public Criteria andShohincd2GreaterThan(String value) {
            addCriterion("shohincd2 >", value, "shohincd2");
            return (Criteria) this;
        }

        public Criteria andShohincd2GreaterThanOrEqualTo(String value) {
            addCriterion("shohincd2 >=", value, "shohincd2");
            return (Criteria) this;
        }

        public Criteria andShohincd2LessThan(String value) {
            addCriterion("shohincd2 <", value, "shohincd2");
            return (Criteria) this;
        }

        public Criteria andShohincd2LessThanOrEqualTo(String value) {
            addCriterion("shohincd2 <=", value, "shohincd2");
            return (Criteria) this;
        }

        public Criteria andShohincd2Like(String value) {
            addCriterion("shohincd2 like", value, "shohincd2");
            return (Criteria) this;
        }

        public Criteria andShohincd2NotLike(String value) {
            addCriterion("shohincd2 not like", value, "shohincd2");
            return (Criteria) this;
        }

        public Criteria andShohincd2In(List<String> values) {
            addCriterion("shohincd2 in", values, "shohincd2");
            return (Criteria) this;
        }

        public Criteria andShohincd2NotIn(List<String> values) {
            addCriterion("shohincd2 not in", values, "shohincd2");
            return (Criteria) this;
        }

        public Criteria andShohincd2Between(String value1, String value2) {
            addCriterion("shohincd2 between", value1, value2, "shohincd2");
            return (Criteria) this;
        }

        public Criteria andShohincd2NotBetween(String value1, String value2) {
            addCriterion("shohincd2 not between", value1, value2, "shohincd2");
            return (Criteria) this;
        }

        public Criteria andUriJikokuIsNull() {
            addCriterion("uri_jikoku is null");
            return (Criteria) this;
        }

        public Criteria andUriJikokuIsNotNull() {
            addCriterion("uri_jikoku is not null");
            return (Criteria) this;
        }

        public Criteria andUriJikokuEqualTo(String value) {
            addCriterion("uri_jikoku =", value, "uriJikoku");
            return (Criteria) this;
        }

        public Criteria andUriJikokuNotEqualTo(String value) {
            addCriterion("uri_jikoku <>", value, "uriJikoku");
            return (Criteria) this;
        }

        public Criteria andUriJikokuGreaterThan(String value) {
            addCriterion("uri_jikoku >", value, "uriJikoku");
            return (Criteria) this;
        }

        public Criteria andUriJikokuGreaterThanOrEqualTo(String value) {
            addCriterion("uri_jikoku >=", value, "uriJikoku");
            return (Criteria) this;
        }

        public Criteria andUriJikokuLessThan(String value) {
            addCriterion("uri_jikoku <", value, "uriJikoku");
            return (Criteria) this;
        }

        public Criteria andUriJikokuLessThanOrEqualTo(String value) {
            addCriterion("uri_jikoku <=", value, "uriJikoku");
            return (Criteria) this;
        }

        public Criteria andUriJikokuLike(String value) {
            addCriterion("uri_jikoku like", value, "uriJikoku");
            return (Criteria) this;
        }

        public Criteria andUriJikokuNotLike(String value) {
            addCriterion("uri_jikoku not like", value, "uriJikoku");
            return (Criteria) this;
        }

        public Criteria andUriJikokuIn(List<String> values) {
            addCriterion("uri_jikoku in", values, "uriJikoku");
            return (Criteria) this;
        }

        public Criteria andUriJikokuNotIn(List<String> values) {
            addCriterion("uri_jikoku not in", values, "uriJikoku");
            return (Criteria) this;
        }

        public Criteria andUriJikokuBetween(String value1, String value2) {
            addCriterion("uri_jikoku between", value1, value2, "uriJikoku");
            return (Criteria) this;
        }

        public Criteria andUriJikokuNotBetween(String value1, String value2) {
            addCriterion("uri_jikoku not between", value1, value2, "uriJikoku");
            return (Criteria) this;
        }

        public Criteria andUriagedBikIsNull() {
            addCriterion("uriaged_bik is null");
            return (Criteria) this;
        }

        public Criteria andUriagedBikIsNotNull() {
            addCriterion("uriaged_bik is not null");
            return (Criteria) this;
        }

        public Criteria andUriagedBikEqualTo(Long value) {
            addCriterion("uriaged_bik =", value, "uriagedBik");
            return (Criteria) this;
        }

        public Criteria andUriagedBikNotEqualTo(Long value) {
            addCriterion("uriaged_bik <>", value, "uriagedBik");
            return (Criteria) this;
        }

        public Criteria andUriagedBikGreaterThan(Long value) {
            addCriterion("uriaged_bik >", value, "uriagedBik");
            return (Criteria) this;
        }

        public Criteria andUriagedBikGreaterThanOrEqualTo(Long value) {
            addCriterion("uriaged_bik >=", value, "uriagedBik");
            return (Criteria) this;
        }

        public Criteria andUriagedBikLessThan(Long value) {
            addCriterion("uriaged_bik <", value, "uriagedBik");
            return (Criteria) this;
        }

        public Criteria andUriagedBikLessThanOrEqualTo(Long value) {
            addCriterion("uriaged_bik <=", value, "uriagedBik");
            return (Criteria) this;
        }

        public Criteria andUriagedBikIn(List<Long> values) {
            addCriterion("uriaged_bik in", values, "uriagedBik");
            return (Criteria) this;
        }

        public Criteria andUriagedBikNotIn(List<Long> values) {
            addCriterion("uriaged_bik not in", values, "uriagedBik");
            return (Criteria) this;
        }

        public Criteria andUriagedBikBetween(Long value1, Long value2) {
            addCriterion("uriaged_bik between", value1, value2, "uriagedBik");
            return (Criteria) this;
        }

        public Criteria andUriagedBikNotBetween(Long value1, Long value2) {
            addCriterion("uriaged_bik not between", value1, value2, "uriagedBik");
            return (Criteria) this;
        }

        public Criteria andHasseikeijokbnIsNull() {
            addCriterion("hasseikeijokbn is null");
            return (Criteria) this;
        }

        public Criteria andHasseikeijokbnIsNotNull() {
            addCriterion("hasseikeijokbn is not null");
            return (Criteria) this;
        }

        public Criteria andHasseikeijokbnEqualTo(String value) {
            addCriterion("hasseikeijokbn =", value, "hasseikeijokbn");
            return (Criteria) this;
        }

        public Criteria andHasseikeijokbnNotEqualTo(String value) {
            addCriterion("hasseikeijokbn <>", value, "hasseikeijokbn");
            return (Criteria) this;
        }

        public Criteria andHasseikeijokbnGreaterThan(String value) {
            addCriterion("hasseikeijokbn >", value, "hasseikeijokbn");
            return (Criteria) this;
        }

        public Criteria andHasseikeijokbnGreaterThanOrEqualTo(String value) {
            addCriterion("hasseikeijokbn >=", value, "hasseikeijokbn");
            return (Criteria) this;
        }

        public Criteria andHasseikeijokbnLessThan(String value) {
            addCriterion("hasseikeijokbn <", value, "hasseikeijokbn");
            return (Criteria) this;
        }

        public Criteria andHasseikeijokbnLessThanOrEqualTo(String value) {
            addCriterion("hasseikeijokbn <=", value, "hasseikeijokbn");
            return (Criteria) this;
        }

        public Criteria andHasseikeijokbnLike(String value) {
            addCriterion("hasseikeijokbn like", value, "hasseikeijokbn");
            return (Criteria) this;
        }

        public Criteria andHasseikeijokbnNotLike(String value) {
            addCriterion("hasseikeijokbn not like", value, "hasseikeijokbn");
            return (Criteria) this;
        }

        public Criteria andHasseikeijokbnIn(List<String> values) {
            addCriterion("hasseikeijokbn in", values, "hasseikeijokbn");
            return (Criteria) this;
        }

        public Criteria andHasseikeijokbnNotIn(List<String> values) {
            addCriterion("hasseikeijokbn not in", values, "hasseikeijokbn");
            return (Criteria) this;
        }

        public Criteria andHasseikeijokbnBetween(String value1, String value2) {
            addCriterion("hasseikeijokbn between", value1, value2, "hasseikeijokbn");
            return (Criteria) this;
        }

        public Criteria andHasseikeijokbnNotBetween(String value1, String value2) {
            addCriterion("hasseikeijokbn not between", value1, value2, "hasseikeijokbn");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table lb01_pt.lbw96_zentenpos
     *
     * @mbggenerated do_not_delete_during_merge Mon Jan 22 17:43:52 CST 2018
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table lb01_pt.lbw96_zentenpos
     *
     * @mbggenerated Mon Jan 22 17:43:52 CST 2018
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}