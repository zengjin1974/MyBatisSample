package com.feast.kanjo.entity;

import java.util.ArrayList;
import java.util.List;

public class Lbt84ZennenJissekiPkeyExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table lb01_pt.lbt84_zennen_jisseki_pkey
     *
     * @mbggenerated Mon Jan 22 17:43:51 CST 2018
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table lb01_pt.lbt84_zennen_jisseki_pkey
     *
     * @mbggenerated Mon Jan 22 17:43:51 CST 2018
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table lb01_pt.lbt84_zennen_jisseki_pkey
     *
     * @mbggenerated Mon Jan 22 17:43:51 CST 2018
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lb01_pt.lbt84_zennen_jisseki_pkey
     *
     * @mbggenerated Mon Jan 22 17:43:51 CST 2018
     */
    public Lbt84ZennenJissekiPkeyExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lb01_pt.lbt84_zennen_jisseki_pkey
     *
     * @mbggenerated Mon Jan 22 17:43:51 CST 2018
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lb01_pt.lbt84_zennen_jisseki_pkey
     *
     * @mbggenerated Mon Jan 22 17:43:51 CST 2018
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lb01_pt.lbt84_zennen_jisseki_pkey
     *
     * @mbggenerated Mon Jan 22 17:43:51 CST 2018
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lb01_pt.lbt84_zennen_jisseki_pkey
     *
     * @mbggenerated Mon Jan 22 17:43:51 CST 2018
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lb01_pt.lbt84_zennen_jisseki_pkey
     *
     * @mbggenerated Mon Jan 22 17:43:51 CST 2018
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lb01_pt.lbt84_zennen_jisseki_pkey
     *
     * @mbggenerated Mon Jan 22 17:43:51 CST 2018
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lb01_pt.lbt84_zennen_jisseki_pkey
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
     * This method corresponds to the database table lb01_pt.lbt84_zennen_jisseki_pkey
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
     * This method corresponds to the database table lb01_pt.lbt84_zennen_jisseki_pkey
     *
     * @mbggenerated Mon Jan 22 17:43:51 CST 2018
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table lb01_pt.lbt84_zennen_jisseki_pkey
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
     * This class corresponds to the database table lb01_pt.lbt84_zennen_jisseki_pkey
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

        public Criteria andSakuseiYmdIsNull() {
            addCriterion("sakusei_ymd is null");
            return (Criteria) this;
        }

        public Criteria andSakuseiYmdIsNotNull() {
            addCriterion("sakusei_ymd is not null");
            return (Criteria) this;
        }

        public Criteria andSakuseiYmdEqualTo(Integer value) {
            addCriterion("sakusei_ymd =", value, "sakuseiYmd");
            return (Criteria) this;
        }

        public Criteria andSakuseiYmdNotEqualTo(Integer value) {
            addCriterion("sakusei_ymd <>", value, "sakuseiYmd");
            return (Criteria) this;
        }

        public Criteria andSakuseiYmdGreaterThan(Integer value) {
            addCriterion("sakusei_ymd >", value, "sakuseiYmd");
            return (Criteria) this;
        }

        public Criteria andSakuseiYmdGreaterThanOrEqualTo(Integer value) {
            addCriterion("sakusei_ymd >=", value, "sakuseiYmd");
            return (Criteria) this;
        }

        public Criteria andSakuseiYmdLessThan(Integer value) {
            addCriterion("sakusei_ymd <", value, "sakuseiYmd");
            return (Criteria) this;
        }

        public Criteria andSakuseiYmdLessThanOrEqualTo(Integer value) {
            addCriterion("sakusei_ymd <=", value, "sakuseiYmd");
            return (Criteria) this;
        }

        public Criteria andSakuseiYmdIn(List<Integer> values) {
            addCriterion("sakusei_ymd in", values, "sakuseiYmd");
            return (Criteria) this;
        }

        public Criteria andSakuseiYmdNotIn(List<Integer> values) {
            addCriterion("sakusei_ymd not in", values, "sakuseiYmd");
            return (Criteria) this;
        }

        public Criteria andSakuseiYmdBetween(Integer value1, Integer value2) {
            addCriterion("sakusei_ymd between", value1, value2, "sakuseiYmd");
            return (Criteria) this;
        }

        public Criteria andSakuseiYmdNotBetween(Integer value1, Integer value2) {
            addCriterion("sakusei_ymd not between", value1, value2, "sakuseiYmd");
            return (Criteria) this;
        }

        public Criteria andZennenYmdIsNull() {
            addCriterion("zennen_ymd is null");
            return (Criteria) this;
        }

        public Criteria andZennenYmdIsNotNull() {
            addCriterion("zennen_ymd is not null");
            return (Criteria) this;
        }

        public Criteria andZennenYmdEqualTo(Integer value) {
            addCriterion("zennen_ymd =", value, "zennenYmd");
            return (Criteria) this;
        }

        public Criteria andZennenYmdNotEqualTo(Integer value) {
            addCriterion("zennen_ymd <>", value, "zennenYmd");
            return (Criteria) this;
        }

        public Criteria andZennenYmdGreaterThan(Integer value) {
            addCriterion("zennen_ymd >", value, "zennenYmd");
            return (Criteria) this;
        }

        public Criteria andZennenYmdGreaterThanOrEqualTo(Integer value) {
            addCriterion("zennen_ymd >=", value, "zennenYmd");
            return (Criteria) this;
        }

        public Criteria andZennenYmdLessThan(Integer value) {
            addCriterion("zennen_ymd <", value, "zennenYmd");
            return (Criteria) this;
        }

        public Criteria andZennenYmdLessThanOrEqualTo(Integer value) {
            addCriterion("zennen_ymd <=", value, "zennenYmd");
            return (Criteria) this;
        }

        public Criteria andZennenYmdIn(List<Integer> values) {
            addCriterion("zennen_ymd in", values, "zennenYmd");
            return (Criteria) this;
        }

        public Criteria andZennenYmdNotIn(List<Integer> values) {
            addCriterion("zennen_ymd not in", values, "zennenYmd");
            return (Criteria) this;
        }

        public Criteria andZennenYmdBetween(Integer value1, Integer value2) {
            addCriterion("zennen_ymd between", value1, value2, "zennenYmd");
            return (Criteria) this;
        }

        public Criteria andZennenYmdNotBetween(Integer value1, Integer value2) {
            addCriterion("zennen_ymd not between", value1, value2, "zennenYmd");
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

        public Criteria andBucdIsNull() {
            addCriterion("bucd is null");
            return (Criteria) this;
        }

        public Criteria andBucdIsNotNull() {
            addCriterion("bucd is not null");
            return (Criteria) this;
        }

        public Criteria andBucdEqualTo(String value) {
            addCriterion("bucd =", value, "bucd");
            return (Criteria) this;
        }

        public Criteria andBucdNotEqualTo(String value) {
            addCriterion("bucd <>", value, "bucd");
            return (Criteria) this;
        }

        public Criteria andBucdGreaterThan(String value) {
            addCriterion("bucd >", value, "bucd");
            return (Criteria) this;
        }

        public Criteria andBucdGreaterThanOrEqualTo(String value) {
            addCriterion("bucd >=", value, "bucd");
            return (Criteria) this;
        }

        public Criteria andBucdLessThan(String value) {
            addCriterion("bucd <", value, "bucd");
            return (Criteria) this;
        }

        public Criteria andBucdLessThanOrEqualTo(String value) {
            addCriterion("bucd <=", value, "bucd");
            return (Criteria) this;
        }

        public Criteria andBucdLike(String value) {
            addCriterion("bucd like", value, "bucd");
            return (Criteria) this;
        }

        public Criteria andBucdNotLike(String value) {
            addCriterion("bucd not like", value, "bucd");
            return (Criteria) this;
        }

        public Criteria andBucdIn(List<String> values) {
            addCriterion("bucd in", values, "bucd");
            return (Criteria) this;
        }

        public Criteria andBucdNotIn(List<String> values) {
            addCriterion("bucd not in", values, "bucd");
            return (Criteria) this;
        }

        public Criteria andBucdBetween(String value1, String value2) {
            addCriterion("bucd between", value1, value2, "bucd");
            return (Criteria) this;
        }

        public Criteria andBucdNotBetween(String value1, String value2) {
            addCriterion("bucd not between", value1, value2, "bucd");
            return (Criteria) this;
        }

        public Criteria andKacdIsNull() {
            addCriterion("kacd is null");
            return (Criteria) this;
        }

        public Criteria andKacdIsNotNull() {
            addCriterion("kacd is not null");
            return (Criteria) this;
        }

        public Criteria andKacdEqualTo(String value) {
            addCriterion("kacd =", value, "kacd");
            return (Criteria) this;
        }

        public Criteria andKacdNotEqualTo(String value) {
            addCriterion("kacd <>", value, "kacd");
            return (Criteria) this;
        }

        public Criteria andKacdGreaterThan(String value) {
            addCriterion("kacd >", value, "kacd");
            return (Criteria) this;
        }

        public Criteria andKacdGreaterThanOrEqualTo(String value) {
            addCriterion("kacd >=", value, "kacd");
            return (Criteria) this;
        }

        public Criteria andKacdLessThan(String value) {
            addCriterion("kacd <", value, "kacd");
            return (Criteria) this;
        }

        public Criteria andKacdLessThanOrEqualTo(String value) {
            addCriterion("kacd <=", value, "kacd");
            return (Criteria) this;
        }

        public Criteria andKacdLike(String value) {
            addCriterion("kacd like", value, "kacd");
            return (Criteria) this;
        }

        public Criteria andKacdNotLike(String value) {
            addCriterion("kacd not like", value, "kacd");
            return (Criteria) this;
        }

        public Criteria andKacdIn(List<String> values) {
            addCriterion("kacd in", values, "kacd");
            return (Criteria) this;
        }

        public Criteria andKacdNotIn(List<String> values) {
            addCriterion("kacd not in", values, "kacd");
            return (Criteria) this;
        }

        public Criteria andKacdBetween(String value1, String value2) {
            addCriterion("kacd between", value1, value2, "kacd");
            return (Criteria) this;
        }

        public Criteria andKacdNotBetween(String value1, String value2) {
            addCriterion("kacd not between", value1, value2, "kacd");
            return (Criteria) this;
        }

        public Criteria andKakaricdIsNull() {
            addCriterion("kakaricd is null");
            return (Criteria) this;
        }

        public Criteria andKakaricdIsNotNull() {
            addCriterion("kakaricd is not null");
            return (Criteria) this;
        }

        public Criteria andKakaricdEqualTo(String value) {
            addCriterion("kakaricd =", value, "kakaricd");
            return (Criteria) this;
        }

        public Criteria andKakaricdNotEqualTo(String value) {
            addCriterion("kakaricd <>", value, "kakaricd");
            return (Criteria) this;
        }

        public Criteria andKakaricdGreaterThan(String value) {
            addCriterion("kakaricd >", value, "kakaricd");
            return (Criteria) this;
        }

        public Criteria andKakaricdGreaterThanOrEqualTo(String value) {
            addCriterion("kakaricd >=", value, "kakaricd");
            return (Criteria) this;
        }

        public Criteria andKakaricdLessThan(String value) {
            addCriterion("kakaricd <", value, "kakaricd");
            return (Criteria) this;
        }

        public Criteria andKakaricdLessThanOrEqualTo(String value) {
            addCriterion("kakaricd <=", value, "kakaricd");
            return (Criteria) this;
        }

        public Criteria andKakaricdLike(String value) {
            addCriterion("kakaricd like", value, "kakaricd");
            return (Criteria) this;
        }

        public Criteria andKakaricdNotLike(String value) {
            addCriterion("kakaricd not like", value, "kakaricd");
            return (Criteria) this;
        }

        public Criteria andKakaricdIn(List<String> values) {
            addCriterion("kakaricd in", values, "kakaricd");
            return (Criteria) this;
        }

        public Criteria andKakaricdNotIn(List<String> values) {
            addCriterion("kakaricd not in", values, "kakaricd");
            return (Criteria) this;
        }

        public Criteria andKakaricdBetween(String value1, String value2) {
            addCriterion("kakaricd between", value1, value2, "kakaricd");
            return (Criteria) this;
        }

        public Criteria andKakaricdNotBetween(String value1, String value2) {
            addCriterion("kakaricd not between", value1, value2, "kakaricd");
            return (Criteria) this;
        }

        public Criteria andUnitcdIsNull() {
            addCriterion("unitcd is null");
            return (Criteria) this;
        }

        public Criteria andUnitcdIsNotNull() {
            addCriterion("unitcd is not null");
            return (Criteria) this;
        }

        public Criteria andUnitcdEqualTo(String value) {
            addCriterion("unitcd =", value, "unitcd");
            return (Criteria) this;
        }

        public Criteria andUnitcdNotEqualTo(String value) {
            addCriterion("unitcd <>", value, "unitcd");
            return (Criteria) this;
        }

        public Criteria andUnitcdGreaterThan(String value) {
            addCriterion("unitcd >", value, "unitcd");
            return (Criteria) this;
        }

        public Criteria andUnitcdGreaterThanOrEqualTo(String value) {
            addCriterion("unitcd >=", value, "unitcd");
            return (Criteria) this;
        }

        public Criteria andUnitcdLessThan(String value) {
            addCriterion("unitcd <", value, "unitcd");
            return (Criteria) this;
        }

        public Criteria andUnitcdLessThanOrEqualTo(String value) {
            addCriterion("unitcd <=", value, "unitcd");
            return (Criteria) this;
        }

        public Criteria andUnitcdLike(String value) {
            addCriterion("unitcd like", value, "unitcd");
            return (Criteria) this;
        }

        public Criteria andUnitcdNotLike(String value) {
            addCriterion("unitcd not like", value, "unitcd");
            return (Criteria) this;
        }

        public Criteria andUnitcdIn(List<String> values) {
            addCriterion("unitcd in", values, "unitcd");
            return (Criteria) this;
        }

        public Criteria andUnitcdNotIn(List<String> values) {
            addCriterion("unitcd not in", values, "unitcd");
            return (Criteria) this;
        }

        public Criteria andUnitcdBetween(String value1, String value2) {
            addCriterion("unitcd between", value1, value2, "unitcd");
            return (Criteria) this;
        }

        public Criteria andUnitcdNotBetween(String value1, String value2) {
            addCriterion("unitcd not between", value1, value2, "unitcd");
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

        public Criteria andJikantaiIsNull() {
            addCriterion("jikantai is null");
            return (Criteria) this;
        }

        public Criteria andJikantaiIsNotNull() {
            addCriterion("jikantai is not null");
            return (Criteria) this;
        }

        public Criteria andJikantaiEqualTo(String value) {
            addCriterion("jikantai =", value, "jikantai");
            return (Criteria) this;
        }

        public Criteria andJikantaiNotEqualTo(String value) {
            addCriterion("jikantai <>", value, "jikantai");
            return (Criteria) this;
        }

        public Criteria andJikantaiGreaterThan(String value) {
            addCriterion("jikantai >", value, "jikantai");
            return (Criteria) this;
        }

        public Criteria andJikantaiGreaterThanOrEqualTo(String value) {
            addCriterion("jikantai >=", value, "jikantai");
            return (Criteria) this;
        }

        public Criteria andJikantaiLessThan(String value) {
            addCriterion("jikantai <", value, "jikantai");
            return (Criteria) this;
        }

        public Criteria andJikantaiLessThanOrEqualTo(String value) {
            addCriterion("jikantai <=", value, "jikantai");
            return (Criteria) this;
        }

        public Criteria andJikantaiLike(String value) {
            addCriterion("jikantai like", value, "jikantai");
            return (Criteria) this;
        }

        public Criteria andJikantaiNotLike(String value) {
            addCriterion("jikantai not like", value, "jikantai");
            return (Criteria) this;
        }

        public Criteria andJikantaiIn(List<String> values) {
            addCriterion("jikantai in", values, "jikantai");
            return (Criteria) this;
        }

        public Criteria andJikantaiNotIn(List<String> values) {
            addCriterion("jikantai not in", values, "jikantai");
            return (Criteria) this;
        }

        public Criteria andJikantaiBetween(String value1, String value2) {
            addCriterion("jikantai between", value1, value2, "jikantai");
            return (Criteria) this;
        }

        public Criteria andJikantaiNotBetween(String value1, String value2) {
            addCriterion("jikantai not between", value1, value2, "jikantai");
            return (Criteria) this;
        }

        public Criteria andBashoIsNull() {
            addCriterion("basho is null");
            return (Criteria) this;
        }

        public Criteria andBashoIsNotNull() {
            addCriterion("basho is not null");
            return (Criteria) this;
        }

        public Criteria andBashoEqualTo(String value) {
            addCriterion("basho =", value, "basho");
            return (Criteria) this;
        }

        public Criteria andBashoNotEqualTo(String value) {
            addCriterion("basho <>", value, "basho");
            return (Criteria) this;
        }

        public Criteria andBashoGreaterThan(String value) {
            addCriterion("basho >", value, "basho");
            return (Criteria) this;
        }

        public Criteria andBashoGreaterThanOrEqualTo(String value) {
            addCriterion("basho >=", value, "basho");
            return (Criteria) this;
        }

        public Criteria andBashoLessThan(String value) {
            addCriterion("basho <", value, "basho");
            return (Criteria) this;
        }

        public Criteria andBashoLessThanOrEqualTo(String value) {
            addCriterion("basho <=", value, "basho");
            return (Criteria) this;
        }

        public Criteria andBashoLike(String value) {
            addCriterion("basho like", value, "basho");
            return (Criteria) this;
        }

        public Criteria andBashoNotLike(String value) {
            addCriterion("basho not like", value, "basho");
            return (Criteria) this;
        }

        public Criteria andBashoIn(List<String> values) {
            addCriterion("basho in", values, "basho");
            return (Criteria) this;
        }

        public Criteria andBashoNotIn(List<String> values) {
            addCriterion("basho not in", values, "basho");
            return (Criteria) this;
        }

        public Criteria andBashoBetween(String value1, String value2) {
            addCriterion("basho between", value1, value2, "basho");
            return (Criteria) this;
        }

        public Criteria andBashoNotBetween(String value1, String value2) {
            addCriterion("basho not between", value1, value2, "basho");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table lb01_pt.lbt84_zennen_jisseki_pkey
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
     * This class corresponds to the database table lb01_pt.lbt84_zennen_jisseki_pkey
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