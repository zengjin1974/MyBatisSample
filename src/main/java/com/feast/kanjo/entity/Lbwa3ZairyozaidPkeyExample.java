package com.feast.kanjo.entity;

import java.util.ArrayList;
import java.util.List;

public class Lbwa3ZairyozaidPkeyExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table lb01_pt.lbwa3_zairyozaid_pkey
     *
     * @mbggenerated Mon Jan 22 17:43:52 CST 2018
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table lb01_pt.lbwa3_zairyozaid_pkey
     *
     * @mbggenerated Mon Jan 22 17:43:52 CST 2018
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table lb01_pt.lbwa3_zairyozaid_pkey
     *
     * @mbggenerated Mon Jan 22 17:43:52 CST 2018
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lb01_pt.lbwa3_zairyozaid_pkey
     *
     * @mbggenerated Mon Jan 22 17:43:52 CST 2018
     */
    public Lbwa3ZairyozaidPkeyExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lb01_pt.lbwa3_zairyozaid_pkey
     *
     * @mbggenerated Mon Jan 22 17:43:52 CST 2018
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lb01_pt.lbwa3_zairyozaid_pkey
     *
     * @mbggenerated Mon Jan 22 17:43:52 CST 2018
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lb01_pt.lbwa3_zairyozaid_pkey
     *
     * @mbggenerated Mon Jan 22 17:43:52 CST 2018
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lb01_pt.lbwa3_zairyozaid_pkey
     *
     * @mbggenerated Mon Jan 22 17:43:52 CST 2018
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lb01_pt.lbwa3_zairyozaid_pkey
     *
     * @mbggenerated Mon Jan 22 17:43:52 CST 2018
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lb01_pt.lbwa3_zairyozaid_pkey
     *
     * @mbggenerated Mon Jan 22 17:43:52 CST 2018
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lb01_pt.lbwa3_zairyozaid_pkey
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
     * This method corresponds to the database table lb01_pt.lbwa3_zairyozaid_pkey
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
     * This method corresponds to the database table lb01_pt.lbwa3_zairyozaid_pkey
     *
     * @mbggenerated Mon Jan 22 17:43:52 CST 2018
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lb01_pt.lbwa3_zairyozaid_pkey
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
     * This class corresponds to the database table lb01_pt.lbwa3_zairyozaid_pkey
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
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table lb01_pt.lbwa3_zairyozaid_pkey
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
     * This class corresponds to the database table lb01_pt.lbwa3_zairyozaid_pkey
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