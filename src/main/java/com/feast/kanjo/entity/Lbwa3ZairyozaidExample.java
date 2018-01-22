package com.feast.kanjo.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Lbwa3ZairyozaidExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table lb01_pt.lbwa3_zairyozaid
     *
     * @mbggenerated Mon Jan 22 17:43:52 CST 2018
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table lb01_pt.lbwa3_zairyozaid
     *
     * @mbggenerated Mon Jan 22 17:43:52 CST 2018
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table lb01_pt.lbwa3_zairyozaid
     *
     * @mbggenerated Mon Jan 22 17:43:52 CST 2018
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lb01_pt.lbwa3_zairyozaid
     *
     * @mbggenerated Mon Jan 22 17:43:52 CST 2018
     */
    public Lbwa3ZairyozaidExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lb01_pt.lbwa3_zairyozaid
     *
     * @mbggenerated Mon Jan 22 17:43:52 CST 2018
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lb01_pt.lbwa3_zairyozaid
     *
     * @mbggenerated Mon Jan 22 17:43:52 CST 2018
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lb01_pt.lbwa3_zairyozaid
     *
     * @mbggenerated Mon Jan 22 17:43:52 CST 2018
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lb01_pt.lbwa3_zairyozaid
     *
     * @mbggenerated Mon Jan 22 17:43:52 CST 2018
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lb01_pt.lbwa3_zairyozaid
     *
     * @mbggenerated Mon Jan 22 17:43:52 CST 2018
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lb01_pt.lbwa3_zairyozaid
     *
     * @mbggenerated Mon Jan 22 17:43:52 CST 2018
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lb01_pt.lbwa3_zairyozaid
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
     * This method corresponds to the database table lb01_pt.lbwa3_zairyozaid
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
     * This method corresponds to the database table lb01_pt.lbwa3_zairyozaid
     *
     * @mbggenerated Mon Jan 22 17:43:52 CST 2018
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lb01_pt.lbwa3_zairyozaid
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
     * This class corresponds to the database table lb01_pt.lbwa3_zairyozaid
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

        public Criteria andYmIsNull() {
            addCriterion("ym is null");
            return (Criteria) this;
        }

        public Criteria andYmIsNotNull() {
            addCriterion("ym is not null");
            return (Criteria) this;
        }

        public Criteria andYmEqualTo(Integer value) {
            addCriterion("ym =", value, "ym");
            return (Criteria) this;
        }

        public Criteria andYmNotEqualTo(Integer value) {
            addCriterion("ym <>", value, "ym");
            return (Criteria) this;
        }

        public Criteria andYmGreaterThan(Integer value) {
            addCriterion("ym >", value, "ym");
            return (Criteria) this;
        }

        public Criteria andYmGreaterThanOrEqualTo(Integer value) {
            addCriterion("ym >=", value, "ym");
            return (Criteria) this;
        }

        public Criteria andYmLessThan(Integer value) {
            addCriterion("ym <", value, "ym");
            return (Criteria) this;
        }

        public Criteria andYmLessThanOrEqualTo(Integer value) {
            addCriterion("ym <=", value, "ym");
            return (Criteria) this;
        }

        public Criteria andYmIn(List<Integer> values) {
            addCriterion("ym in", values, "ym");
            return (Criteria) this;
        }

        public Criteria andYmNotIn(List<Integer> values) {
            addCriterion("ym not in", values, "ym");
            return (Criteria) this;
        }

        public Criteria andYmBetween(Integer value1, Integer value2) {
            addCriterion("ym between", value1, value2, "ym");
            return (Criteria) this;
        }

        public Criteria andYmNotBetween(Integer value1, Integer value2) {
            addCriterion("ym not between", value1, value2, "ym");
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

        public Criteria andHinbanIsNull() {
            addCriterion("hinban is null");
            return (Criteria) this;
        }

        public Criteria andHinbanIsNotNull() {
            addCriterion("hinban is not null");
            return (Criteria) this;
        }

        public Criteria andHinbanEqualTo(String value) {
            addCriterion("hinban =", value, "hinban");
            return (Criteria) this;
        }

        public Criteria andHinbanNotEqualTo(String value) {
            addCriterion("hinban <>", value, "hinban");
            return (Criteria) this;
        }

        public Criteria andHinbanGreaterThan(String value) {
            addCriterion("hinban >", value, "hinban");
            return (Criteria) this;
        }

        public Criteria andHinbanGreaterThanOrEqualTo(String value) {
            addCriterion("hinban >=", value, "hinban");
            return (Criteria) this;
        }

        public Criteria andHinbanLessThan(String value) {
            addCriterion("hinban <", value, "hinban");
            return (Criteria) this;
        }

        public Criteria andHinbanLessThanOrEqualTo(String value) {
            addCriterion("hinban <=", value, "hinban");
            return (Criteria) this;
        }

        public Criteria andHinbanLike(String value) {
            addCriterion("hinban like", value, "hinban");
            return (Criteria) this;
        }

        public Criteria andHinbanNotLike(String value) {
            addCriterion("hinban not like", value, "hinban");
            return (Criteria) this;
        }

        public Criteria andHinbanIn(List<String> values) {
            addCriterion("hinban in", values, "hinban");
            return (Criteria) this;
        }

        public Criteria andHinbanNotIn(List<String> values) {
            addCriterion("hinban not in", values, "hinban");
            return (Criteria) this;
        }

        public Criteria andHinbanBetween(String value1, String value2) {
            addCriterion("hinban between", value1, value2, "hinban");
            return (Criteria) this;
        }

        public Criteria andHinbanNotBetween(String value1, String value2) {
            addCriterion("hinban not between", value1, value2, "hinban");
            return (Criteria) this;
        }

        public Criteria andTanagnkZaidIsNull() {
            addCriterion("tanagnk_zaid is null");
            return (Criteria) this;
        }

        public Criteria andTanagnkZaidIsNotNull() {
            addCriterion("tanagnk_zaid is not null");
            return (Criteria) this;
        }

        public Criteria andTanagnkZaidEqualTo(Long value) {
            addCriterion("tanagnk_zaid =", value, "tanagnkZaid");
            return (Criteria) this;
        }

        public Criteria andTanagnkZaidNotEqualTo(Long value) {
            addCriterion("tanagnk_zaid <>", value, "tanagnkZaid");
            return (Criteria) this;
        }

        public Criteria andTanagnkZaidGreaterThan(Long value) {
            addCriterion("tanagnk_zaid >", value, "tanagnkZaid");
            return (Criteria) this;
        }

        public Criteria andTanagnkZaidGreaterThanOrEqualTo(Long value) {
            addCriterion("tanagnk_zaid >=", value, "tanagnkZaid");
            return (Criteria) this;
        }

        public Criteria andTanagnkZaidLessThan(Long value) {
            addCriterion("tanagnk_zaid <", value, "tanagnkZaid");
            return (Criteria) this;
        }

        public Criteria andTanagnkZaidLessThanOrEqualTo(Long value) {
            addCriterion("tanagnk_zaid <=", value, "tanagnkZaid");
            return (Criteria) this;
        }

        public Criteria andTanagnkZaidIn(List<Long> values) {
            addCriterion("tanagnk_zaid in", values, "tanagnkZaid");
            return (Criteria) this;
        }

        public Criteria andTanagnkZaidNotIn(List<Long> values) {
            addCriterion("tanagnk_zaid not in", values, "tanagnkZaid");
            return (Criteria) this;
        }

        public Criteria andTanagnkZaidBetween(Long value1, Long value2) {
            addCriterion("tanagnk_zaid between", value1, value2, "tanagnkZaid");
            return (Criteria) this;
        }

        public Criteria andTanagnkZaidNotBetween(Long value1, Long value2) {
            addCriterion("tanagnk_zaid not between", value1, value2, "tanagnkZaid");
            return (Criteria) this;
        }

        public Criteria andInstdteIsNull() {
            addCriterion("instdte is null");
            return (Criteria) this;
        }

        public Criteria andInstdteIsNotNull() {
            addCriterion("instdte is not null");
            return (Criteria) this;
        }

        public Criteria andInstdteEqualTo(Date value) {
            addCriterion("instdte =", value, "instdte");
            return (Criteria) this;
        }

        public Criteria andInstdteNotEqualTo(Date value) {
            addCriterion("instdte <>", value, "instdte");
            return (Criteria) this;
        }

        public Criteria andInstdteGreaterThan(Date value) {
            addCriterion("instdte >", value, "instdte");
            return (Criteria) this;
        }

        public Criteria andInstdteGreaterThanOrEqualTo(Date value) {
            addCriterion("instdte >=", value, "instdte");
            return (Criteria) this;
        }

        public Criteria andInstdteLessThan(Date value) {
            addCriterion("instdte <", value, "instdte");
            return (Criteria) this;
        }

        public Criteria andInstdteLessThanOrEqualTo(Date value) {
            addCriterion("instdte <=", value, "instdte");
            return (Criteria) this;
        }

        public Criteria andInstdteIn(List<Date> values) {
            addCriterion("instdte in", values, "instdte");
            return (Criteria) this;
        }

        public Criteria andInstdteNotIn(List<Date> values) {
            addCriterion("instdte not in", values, "instdte");
            return (Criteria) this;
        }

        public Criteria andInstdteBetween(Date value1, Date value2) {
            addCriterion("instdte between", value1, value2, "instdte");
            return (Criteria) this;
        }

        public Criteria andInstdteNotBetween(Date value1, Date value2) {
            addCriterion("instdte not between", value1, value2, "instdte");
            return (Criteria) this;
        }

        public Criteria andInstusridIsNull() {
            addCriterion("instusrid is null");
            return (Criteria) this;
        }

        public Criteria andInstusridIsNotNull() {
            addCriterion("instusrid is not null");
            return (Criteria) this;
        }

        public Criteria andInstusridEqualTo(String value) {
            addCriterion("instusrid =", value, "instusrid");
            return (Criteria) this;
        }

        public Criteria andInstusridNotEqualTo(String value) {
            addCriterion("instusrid <>", value, "instusrid");
            return (Criteria) this;
        }

        public Criteria andInstusridGreaterThan(String value) {
            addCriterion("instusrid >", value, "instusrid");
            return (Criteria) this;
        }

        public Criteria andInstusridGreaterThanOrEqualTo(String value) {
            addCriterion("instusrid >=", value, "instusrid");
            return (Criteria) this;
        }

        public Criteria andInstusridLessThan(String value) {
            addCriterion("instusrid <", value, "instusrid");
            return (Criteria) this;
        }

        public Criteria andInstusridLessThanOrEqualTo(String value) {
            addCriterion("instusrid <=", value, "instusrid");
            return (Criteria) this;
        }

        public Criteria andInstusridLike(String value) {
            addCriterion("instusrid like", value, "instusrid");
            return (Criteria) this;
        }

        public Criteria andInstusridNotLike(String value) {
            addCriterion("instusrid not like", value, "instusrid");
            return (Criteria) this;
        }

        public Criteria andInstusridIn(List<String> values) {
            addCriterion("instusrid in", values, "instusrid");
            return (Criteria) this;
        }

        public Criteria andInstusridNotIn(List<String> values) {
            addCriterion("instusrid not in", values, "instusrid");
            return (Criteria) this;
        }

        public Criteria andInstusridBetween(String value1, String value2) {
            addCriterion("instusrid between", value1, value2, "instusrid");
            return (Criteria) this;
        }

        public Criteria andInstusridNotBetween(String value1, String value2) {
            addCriterion("instusrid not between", value1, value2, "instusrid");
            return (Criteria) this;
        }

        public Criteria andInstprgidIsNull() {
            addCriterion("instprgid is null");
            return (Criteria) this;
        }

        public Criteria andInstprgidIsNotNull() {
            addCriterion("instprgid is not null");
            return (Criteria) this;
        }

        public Criteria andInstprgidEqualTo(String value) {
            addCriterion("instprgid =", value, "instprgid");
            return (Criteria) this;
        }

        public Criteria andInstprgidNotEqualTo(String value) {
            addCriterion("instprgid <>", value, "instprgid");
            return (Criteria) this;
        }

        public Criteria andInstprgidGreaterThan(String value) {
            addCriterion("instprgid >", value, "instprgid");
            return (Criteria) this;
        }

        public Criteria andInstprgidGreaterThanOrEqualTo(String value) {
            addCriterion("instprgid >=", value, "instprgid");
            return (Criteria) this;
        }

        public Criteria andInstprgidLessThan(String value) {
            addCriterion("instprgid <", value, "instprgid");
            return (Criteria) this;
        }

        public Criteria andInstprgidLessThanOrEqualTo(String value) {
            addCriterion("instprgid <=", value, "instprgid");
            return (Criteria) this;
        }

        public Criteria andInstprgidLike(String value) {
            addCriterion("instprgid like", value, "instprgid");
            return (Criteria) this;
        }

        public Criteria andInstprgidNotLike(String value) {
            addCriterion("instprgid not like", value, "instprgid");
            return (Criteria) this;
        }

        public Criteria andInstprgidIn(List<String> values) {
            addCriterion("instprgid in", values, "instprgid");
            return (Criteria) this;
        }

        public Criteria andInstprgidNotIn(List<String> values) {
            addCriterion("instprgid not in", values, "instprgid");
            return (Criteria) this;
        }

        public Criteria andInstprgidBetween(String value1, String value2) {
            addCriterion("instprgid between", value1, value2, "instprgid");
            return (Criteria) this;
        }

        public Criteria andInstprgidNotBetween(String value1, String value2) {
            addCriterion("instprgid not between", value1, value2, "instprgid");
            return (Criteria) this;
        }

        public Criteria andInsipaddrIsNull() {
            addCriterion("insipaddr is null");
            return (Criteria) this;
        }

        public Criteria andInsipaddrIsNotNull() {
            addCriterion("insipaddr is not null");
            return (Criteria) this;
        }

        public Criteria andInsipaddrEqualTo(String value) {
            addCriterion("insipaddr =", value, "insipaddr");
            return (Criteria) this;
        }

        public Criteria andInsipaddrNotEqualTo(String value) {
            addCriterion("insipaddr <>", value, "insipaddr");
            return (Criteria) this;
        }

        public Criteria andInsipaddrGreaterThan(String value) {
            addCriterion("insipaddr >", value, "insipaddr");
            return (Criteria) this;
        }

        public Criteria andInsipaddrGreaterThanOrEqualTo(String value) {
            addCriterion("insipaddr >=", value, "insipaddr");
            return (Criteria) this;
        }

        public Criteria andInsipaddrLessThan(String value) {
            addCriterion("insipaddr <", value, "insipaddr");
            return (Criteria) this;
        }

        public Criteria andInsipaddrLessThanOrEqualTo(String value) {
            addCriterion("insipaddr <=", value, "insipaddr");
            return (Criteria) this;
        }

        public Criteria andInsipaddrLike(String value) {
            addCriterion("insipaddr like", value, "insipaddr");
            return (Criteria) this;
        }

        public Criteria andInsipaddrNotLike(String value) {
            addCriterion("insipaddr not like", value, "insipaddr");
            return (Criteria) this;
        }

        public Criteria andInsipaddrIn(List<String> values) {
            addCriterion("insipaddr in", values, "insipaddr");
            return (Criteria) this;
        }

        public Criteria andInsipaddrNotIn(List<String> values) {
            addCriterion("insipaddr not in", values, "insipaddr");
            return (Criteria) this;
        }

        public Criteria andInsipaddrBetween(String value1, String value2) {
            addCriterion("insipaddr between", value1, value2, "insipaddr");
            return (Criteria) this;
        }

        public Criteria andInsipaddrNotBetween(String value1, String value2) {
            addCriterion("insipaddr not between", value1, value2, "insipaddr");
            return (Criteria) this;
        }

        public Criteria andUpddteIsNull() {
            addCriterion("upddte is null");
            return (Criteria) this;
        }

        public Criteria andUpddteIsNotNull() {
            addCriterion("upddte is not null");
            return (Criteria) this;
        }

        public Criteria andUpddteEqualTo(Date value) {
            addCriterion("upddte =", value, "upddte");
            return (Criteria) this;
        }

        public Criteria andUpddteNotEqualTo(Date value) {
            addCriterion("upddte <>", value, "upddte");
            return (Criteria) this;
        }

        public Criteria andUpddteGreaterThan(Date value) {
            addCriterion("upddte >", value, "upddte");
            return (Criteria) this;
        }

        public Criteria andUpddteGreaterThanOrEqualTo(Date value) {
            addCriterion("upddte >=", value, "upddte");
            return (Criteria) this;
        }

        public Criteria andUpddteLessThan(Date value) {
            addCriterion("upddte <", value, "upddte");
            return (Criteria) this;
        }

        public Criteria andUpddteLessThanOrEqualTo(Date value) {
            addCriterion("upddte <=", value, "upddte");
            return (Criteria) this;
        }

        public Criteria andUpddteIn(List<Date> values) {
            addCriterion("upddte in", values, "upddte");
            return (Criteria) this;
        }

        public Criteria andUpddteNotIn(List<Date> values) {
            addCriterion("upddte not in", values, "upddte");
            return (Criteria) this;
        }

        public Criteria andUpddteBetween(Date value1, Date value2) {
            addCriterion("upddte between", value1, value2, "upddte");
            return (Criteria) this;
        }

        public Criteria andUpddteNotBetween(Date value1, Date value2) {
            addCriterion("upddte not between", value1, value2, "upddte");
            return (Criteria) this;
        }

        public Criteria andUpdusridIsNull() {
            addCriterion("updusrid is null");
            return (Criteria) this;
        }

        public Criteria andUpdusridIsNotNull() {
            addCriterion("updusrid is not null");
            return (Criteria) this;
        }

        public Criteria andUpdusridEqualTo(String value) {
            addCriterion("updusrid =", value, "updusrid");
            return (Criteria) this;
        }

        public Criteria andUpdusridNotEqualTo(String value) {
            addCriterion("updusrid <>", value, "updusrid");
            return (Criteria) this;
        }

        public Criteria andUpdusridGreaterThan(String value) {
            addCriterion("updusrid >", value, "updusrid");
            return (Criteria) this;
        }

        public Criteria andUpdusridGreaterThanOrEqualTo(String value) {
            addCriterion("updusrid >=", value, "updusrid");
            return (Criteria) this;
        }

        public Criteria andUpdusridLessThan(String value) {
            addCriterion("updusrid <", value, "updusrid");
            return (Criteria) this;
        }

        public Criteria andUpdusridLessThanOrEqualTo(String value) {
            addCriterion("updusrid <=", value, "updusrid");
            return (Criteria) this;
        }

        public Criteria andUpdusridLike(String value) {
            addCriterion("updusrid like", value, "updusrid");
            return (Criteria) this;
        }

        public Criteria andUpdusridNotLike(String value) {
            addCriterion("updusrid not like", value, "updusrid");
            return (Criteria) this;
        }

        public Criteria andUpdusridIn(List<String> values) {
            addCriterion("updusrid in", values, "updusrid");
            return (Criteria) this;
        }

        public Criteria andUpdusridNotIn(List<String> values) {
            addCriterion("updusrid not in", values, "updusrid");
            return (Criteria) this;
        }

        public Criteria andUpdusridBetween(String value1, String value2) {
            addCriterion("updusrid between", value1, value2, "updusrid");
            return (Criteria) this;
        }

        public Criteria andUpdusridNotBetween(String value1, String value2) {
            addCriterion("updusrid not between", value1, value2, "updusrid");
            return (Criteria) this;
        }

        public Criteria andUpdprgidIsNull() {
            addCriterion("updprgid is null");
            return (Criteria) this;
        }

        public Criteria andUpdprgidIsNotNull() {
            addCriterion("updprgid is not null");
            return (Criteria) this;
        }

        public Criteria andUpdprgidEqualTo(String value) {
            addCriterion("updprgid =", value, "updprgid");
            return (Criteria) this;
        }

        public Criteria andUpdprgidNotEqualTo(String value) {
            addCriterion("updprgid <>", value, "updprgid");
            return (Criteria) this;
        }

        public Criteria andUpdprgidGreaterThan(String value) {
            addCriterion("updprgid >", value, "updprgid");
            return (Criteria) this;
        }

        public Criteria andUpdprgidGreaterThanOrEqualTo(String value) {
            addCriterion("updprgid >=", value, "updprgid");
            return (Criteria) this;
        }

        public Criteria andUpdprgidLessThan(String value) {
            addCriterion("updprgid <", value, "updprgid");
            return (Criteria) this;
        }

        public Criteria andUpdprgidLessThanOrEqualTo(String value) {
            addCriterion("updprgid <=", value, "updprgid");
            return (Criteria) this;
        }

        public Criteria andUpdprgidLike(String value) {
            addCriterion("updprgid like", value, "updprgid");
            return (Criteria) this;
        }

        public Criteria andUpdprgidNotLike(String value) {
            addCriterion("updprgid not like", value, "updprgid");
            return (Criteria) this;
        }

        public Criteria andUpdprgidIn(List<String> values) {
            addCriterion("updprgid in", values, "updprgid");
            return (Criteria) this;
        }

        public Criteria andUpdprgidNotIn(List<String> values) {
            addCriterion("updprgid not in", values, "updprgid");
            return (Criteria) this;
        }

        public Criteria andUpdprgidBetween(String value1, String value2) {
            addCriterion("updprgid between", value1, value2, "updprgid");
            return (Criteria) this;
        }

        public Criteria andUpdprgidNotBetween(String value1, String value2) {
            addCriterion("updprgid not between", value1, value2, "updprgid");
            return (Criteria) this;
        }

        public Criteria andUpdipaddrIsNull() {
            addCriterion("updipaddr is null");
            return (Criteria) this;
        }

        public Criteria andUpdipaddrIsNotNull() {
            addCriterion("updipaddr is not null");
            return (Criteria) this;
        }

        public Criteria andUpdipaddrEqualTo(String value) {
            addCriterion("updipaddr =", value, "updipaddr");
            return (Criteria) this;
        }

        public Criteria andUpdipaddrNotEqualTo(String value) {
            addCriterion("updipaddr <>", value, "updipaddr");
            return (Criteria) this;
        }

        public Criteria andUpdipaddrGreaterThan(String value) {
            addCriterion("updipaddr >", value, "updipaddr");
            return (Criteria) this;
        }

        public Criteria andUpdipaddrGreaterThanOrEqualTo(String value) {
            addCriterion("updipaddr >=", value, "updipaddr");
            return (Criteria) this;
        }

        public Criteria andUpdipaddrLessThan(String value) {
            addCriterion("updipaddr <", value, "updipaddr");
            return (Criteria) this;
        }

        public Criteria andUpdipaddrLessThanOrEqualTo(String value) {
            addCriterion("updipaddr <=", value, "updipaddr");
            return (Criteria) this;
        }

        public Criteria andUpdipaddrLike(String value) {
            addCriterion("updipaddr like", value, "updipaddr");
            return (Criteria) this;
        }

        public Criteria andUpdipaddrNotLike(String value) {
            addCriterion("updipaddr not like", value, "updipaddr");
            return (Criteria) this;
        }

        public Criteria andUpdipaddrIn(List<String> values) {
            addCriterion("updipaddr in", values, "updipaddr");
            return (Criteria) this;
        }

        public Criteria andUpdipaddrNotIn(List<String> values) {
            addCriterion("updipaddr not in", values, "updipaddr");
            return (Criteria) this;
        }

        public Criteria andUpdipaddrBetween(String value1, String value2) {
            addCriterion("updipaddr between", value1, value2, "updipaddr");
            return (Criteria) this;
        }

        public Criteria andUpdipaddrNotBetween(String value1, String value2) {
            addCriterion("updipaddr not between", value1, value2, "updipaddr");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table lb01_pt.lbwa3_zairyozaid
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
     * This class corresponds to the database table lb01_pt.lbwa3_zairyozaid
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