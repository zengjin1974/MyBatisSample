package com.feast.kanjo.entity;

import java.util.ArrayList;
import java.util.List;

public class Lbm82ThreadPrmPkeyExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table lb01_pt.lbm82_thread_prm_pkey
     *
     * @mbggenerated Mon Jan 22 17:43:51 CST 2018
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table lb01_pt.lbm82_thread_prm_pkey
     *
     * @mbggenerated Mon Jan 22 17:43:51 CST 2018
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table lb01_pt.lbm82_thread_prm_pkey
     *
     * @mbggenerated Mon Jan 22 17:43:51 CST 2018
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lb01_pt.lbm82_thread_prm_pkey
     *
     * @mbggenerated Mon Jan 22 17:43:51 CST 2018
     */
    public Lbm82ThreadPrmPkeyExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lb01_pt.lbm82_thread_prm_pkey
     *
     * @mbggenerated Mon Jan 22 17:43:51 CST 2018
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lb01_pt.lbm82_thread_prm_pkey
     *
     * @mbggenerated Mon Jan 22 17:43:51 CST 2018
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lb01_pt.lbm82_thread_prm_pkey
     *
     * @mbggenerated Mon Jan 22 17:43:51 CST 2018
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lb01_pt.lbm82_thread_prm_pkey
     *
     * @mbggenerated Mon Jan 22 17:43:51 CST 2018
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lb01_pt.lbm82_thread_prm_pkey
     *
     * @mbggenerated Mon Jan 22 17:43:51 CST 2018
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lb01_pt.lbm82_thread_prm_pkey
     *
     * @mbggenerated Mon Jan 22 17:43:51 CST 2018
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lb01_pt.lbm82_thread_prm_pkey
     *
     * @mbggenerated Mon Jan 22 17:43:51 CST 2018
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lb01_pt.lbm82_thread_prm_pkey
     *
     * @mbggenerated Mon Jan 22 17:43:51 CST 2018
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
     * This method corresponds to the database table lb01_pt.lbm82_thread_prm_pkey
     *
     * @mbggenerated Mon Jan 22 17:43:51 CST 2018
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lb01_pt.lbm82_thread_prm_pkey
     *
     * @mbggenerated Mon Jan 22 17:43:51 CST 2018
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table lb01_pt.lbm82_thread_prm_pkey
     *
     * @mbggenerated Mon Jan 22 17:43:51 CST 2018
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

        public Criteria andJobidIsNull() {
            addCriterion("jobid is null");
            return (Criteria) this;
        }

        public Criteria andJobidIsNotNull() {
            addCriterion("jobid is not null");
            return (Criteria) this;
        }

        public Criteria andJobidEqualTo(String value) {
            addCriterion("jobid =", value, "jobid");
            return (Criteria) this;
        }

        public Criteria andJobidNotEqualTo(String value) {
            addCriterion("jobid <>", value, "jobid");
            return (Criteria) this;
        }

        public Criteria andJobidGreaterThan(String value) {
            addCriterion("jobid >", value, "jobid");
            return (Criteria) this;
        }

        public Criteria andJobidGreaterThanOrEqualTo(String value) {
            addCriterion("jobid >=", value, "jobid");
            return (Criteria) this;
        }

        public Criteria andJobidLessThan(String value) {
            addCriterion("jobid <", value, "jobid");
            return (Criteria) this;
        }

        public Criteria andJobidLessThanOrEqualTo(String value) {
            addCriterion("jobid <=", value, "jobid");
            return (Criteria) this;
        }

        public Criteria andJobidLike(String value) {
            addCriterion("jobid like", value, "jobid");
            return (Criteria) this;
        }

        public Criteria andJobidNotLike(String value) {
            addCriterion("jobid not like", value, "jobid");
            return (Criteria) this;
        }

        public Criteria andJobidIn(List<String> values) {
            addCriterion("jobid in", values, "jobid");
            return (Criteria) this;
        }

        public Criteria andJobidNotIn(List<String> values) {
            addCriterion("jobid not in", values, "jobid");
            return (Criteria) this;
        }

        public Criteria andJobidBetween(String value1, String value2) {
            addCriterion("jobid between", value1, value2, "jobid");
            return (Criteria) this;
        }

        public Criteria andJobidNotBetween(String value1, String value2) {
            addCriterion("jobid not between", value1, value2, "jobid");
            return (Criteria) this;
        }

        public Criteria andThreadnoIsNull() {
            addCriterion("threadno is null");
            return (Criteria) this;
        }

        public Criteria andThreadnoIsNotNull() {
            addCriterion("threadno is not null");
            return (Criteria) this;
        }

        public Criteria andThreadnoEqualTo(Short value) {
            addCriterion("threadno =", value, "threadno");
            return (Criteria) this;
        }

        public Criteria andThreadnoNotEqualTo(Short value) {
            addCriterion("threadno <>", value, "threadno");
            return (Criteria) this;
        }

        public Criteria andThreadnoGreaterThan(Short value) {
            addCriterion("threadno >", value, "threadno");
            return (Criteria) this;
        }

        public Criteria andThreadnoGreaterThanOrEqualTo(Short value) {
            addCriterion("threadno >=", value, "threadno");
            return (Criteria) this;
        }

        public Criteria andThreadnoLessThan(Short value) {
            addCriterion("threadno <", value, "threadno");
            return (Criteria) this;
        }

        public Criteria andThreadnoLessThanOrEqualTo(Short value) {
            addCriterion("threadno <=", value, "threadno");
            return (Criteria) this;
        }

        public Criteria andThreadnoIn(List<Short> values) {
            addCriterion("threadno in", values, "threadno");
            return (Criteria) this;
        }

        public Criteria andThreadnoNotIn(List<Short> values) {
            addCriterion("threadno not in", values, "threadno");
            return (Criteria) this;
        }

        public Criteria andThreadnoBetween(Short value1, Short value2) {
            addCriterion("threadno between", value1, value2, "threadno");
            return (Criteria) this;
        }

        public Criteria andThreadnoNotBetween(Short value1, Short value2) {
            addCriterion("threadno not between", value1, value2, "threadno");
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
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table lb01_pt.lbm82_thread_prm_pkey
     *
     * @mbggenerated do_not_delete_during_merge Mon Jan 22 17:43:51 CST 2018
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table lb01_pt.lbm82_thread_prm_pkey
     *
     * @mbggenerated Mon Jan 22 17:43:51 CST 2018
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