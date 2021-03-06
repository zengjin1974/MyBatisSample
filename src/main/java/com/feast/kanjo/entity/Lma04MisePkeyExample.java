package com.feast.kanjo.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Lma04MisePkeyExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table lb01_pt.lma04_mise_pkey
     *
     * @mbggenerated Mon Jan 22 17:43:52 CST 2018
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table lb01_pt.lma04_mise_pkey
     *
     * @mbggenerated Mon Jan 22 17:43:52 CST 2018
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table lb01_pt.lma04_mise_pkey
     *
     * @mbggenerated Mon Jan 22 17:43:52 CST 2018
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lb01_pt.lma04_mise_pkey
     *
     * @mbggenerated Mon Jan 22 17:43:52 CST 2018
     */
    public Lma04MisePkeyExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lb01_pt.lma04_mise_pkey
     *
     * @mbggenerated Mon Jan 22 17:43:52 CST 2018
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lb01_pt.lma04_mise_pkey
     *
     * @mbggenerated Mon Jan 22 17:43:52 CST 2018
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lb01_pt.lma04_mise_pkey
     *
     * @mbggenerated Mon Jan 22 17:43:52 CST 2018
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lb01_pt.lma04_mise_pkey
     *
     * @mbggenerated Mon Jan 22 17:43:52 CST 2018
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lb01_pt.lma04_mise_pkey
     *
     * @mbggenerated Mon Jan 22 17:43:52 CST 2018
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lb01_pt.lma04_mise_pkey
     *
     * @mbggenerated Mon Jan 22 17:43:52 CST 2018
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lb01_pt.lma04_mise_pkey
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
     * This method corresponds to the database table lb01_pt.lma04_mise_pkey
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
     * This method corresponds to the database table lb01_pt.lma04_mise_pkey
     *
     * @mbggenerated Mon Jan 22 17:43:52 CST 2018
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lb01_pt.lma04_mise_pkey
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
     * This class corresponds to the database table lb01_pt.lma04_mise_pkey
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

        public Criteria andMisecdIsNull() {
            addCriterion("misecd is null");
            return (Criteria) this;
        }

        public Criteria andMisecdIsNotNull() {
            addCriterion("misecd is not null");
            return (Criteria) this;
        }

        public Criteria andMisecdEqualTo(String value) {
            addCriterion("misecd =", value, "misecd");
            return (Criteria) this;
        }

        public Criteria andMisecdNotEqualTo(String value) {
            addCriterion("misecd <>", value, "misecd");
            return (Criteria) this;
        }

        public Criteria andMisecdGreaterThan(String value) {
            addCriterion("misecd >", value, "misecd");
            return (Criteria) this;
        }

        public Criteria andMisecdGreaterThanOrEqualTo(String value) {
            addCriterion("misecd >=", value, "misecd");
            return (Criteria) this;
        }

        public Criteria andMisecdLessThan(String value) {
            addCriterion("misecd <", value, "misecd");
            return (Criteria) this;
        }

        public Criteria andMisecdLessThanOrEqualTo(String value) {
            addCriterion("misecd <=", value, "misecd");
            return (Criteria) this;
        }

        public Criteria andMisecdLike(String value) {
            addCriterion("misecd like", value, "misecd");
            return (Criteria) this;
        }

        public Criteria andMisecdNotLike(String value) {
            addCriterion("misecd not like", value, "misecd");
            return (Criteria) this;
        }

        public Criteria andMisecdIn(List<String> values) {
            addCriterion("misecd in", values, "misecd");
            return (Criteria) this;
        }

        public Criteria andMisecdNotIn(List<String> values) {
            addCriterion("misecd not in", values, "misecd");
            return (Criteria) this;
        }

        public Criteria andMisecdBetween(String value1, String value2) {
            addCriterion("misecd between", value1, value2, "misecd");
            return (Criteria) this;
        }

        public Criteria andMisecdNotBetween(String value1, String value2) {
            addCriterion("misecd not between", value1, value2, "misecd");
            return (Criteria) this;
        }

        public Criteria andStartymdIsNull() {
            addCriterion("startymd is null");
            return (Criteria) this;
        }

        public Criteria andStartymdIsNotNull() {
            addCriterion("startymd is not null");
            return (Criteria) this;
        }

        public Criteria andStartymdEqualTo(Date value) {
            addCriterion("startymd =", value, "startymd");
            return (Criteria) this;
        }

        public Criteria andStartymdNotEqualTo(Date value) {
            addCriterion("startymd <>", value, "startymd");
            return (Criteria) this;
        }

        public Criteria andStartymdGreaterThan(Date value) {
            addCriterion("startymd >", value, "startymd");
            return (Criteria) this;
        }

        public Criteria andStartymdGreaterThanOrEqualTo(Date value) {
            addCriterion("startymd >=", value, "startymd");
            return (Criteria) this;
        }

        public Criteria andStartymdLessThan(Date value) {
            addCriterion("startymd <", value, "startymd");
            return (Criteria) this;
        }

        public Criteria andStartymdLessThanOrEqualTo(Date value) {
            addCriterion("startymd <=", value, "startymd");
            return (Criteria) this;
        }

        public Criteria andStartymdIn(List<Date> values) {
            addCriterion("startymd in", values, "startymd");
            return (Criteria) this;
        }

        public Criteria andStartymdNotIn(List<Date> values) {
            addCriterion("startymd not in", values, "startymd");
            return (Criteria) this;
        }

        public Criteria andStartymdBetween(Date value1, Date value2) {
            addCriterion("startymd between", value1, value2, "startymd");
            return (Criteria) this;
        }

        public Criteria andStartymdNotBetween(Date value1, Date value2) {
            addCriterion("startymd not between", value1, value2, "startymd");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table lb01_pt.lma04_mise_pkey
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
     * This class corresponds to the database table lb01_pt.lma04_mise_pkey
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