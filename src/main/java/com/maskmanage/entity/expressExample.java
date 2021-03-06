package com.maskmanage.entity;

import java.util.ArrayList;
import java.util.List;

public class expressExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table express
     *
     * @mbggenerated Wed May 27 13:01:29 CST 2020
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table express
     *
     * @mbggenerated Wed May 27 13:01:29 CST 2020
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table express
     *
     * @mbggenerated Wed May 27 13:01:29 CST 2020
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table express
     *
     * @mbggenerated Wed May 27 13:01:29 CST 2020
     */
    public expressExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table express
     *
     * @mbggenerated Wed May 27 13:01:29 CST 2020
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table express
     *
     * @mbggenerated Wed May 27 13:01:29 CST 2020
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table express
     *
     * @mbggenerated Wed May 27 13:01:29 CST 2020
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table express
     *
     * @mbggenerated Wed May 27 13:01:29 CST 2020
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table express
     *
     * @mbggenerated Wed May 27 13:01:29 CST 2020
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table express
     *
     * @mbggenerated Wed May 27 13:01:29 CST 2020
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table express
     *
     * @mbggenerated Wed May 27 13:01:29 CST 2020
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table express
     *
     * @mbggenerated Wed May 27 13:01:29 CST 2020
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
     * This method corresponds to the database table express
     *
     * @mbggenerated Wed May 27 13:01:29 CST 2020
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table express
     *
     * @mbggenerated Wed May 27 13:01:29 CST 2020
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table express
     *
     * @mbggenerated Wed May 27 13:01:29 CST 2020
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

        public Criteria andExpressidIsNull() {
            addCriterion("expressId is null");
            return (Criteria) this;
        }

        public Criteria andExpressidIsNotNull() {
            addCriterion("expressId is not null");
            return (Criteria) this;
        }

        public Criteria andExpressidEqualTo(Integer value) {
            addCriterion("expressId =", value, "expressid");
            return (Criteria) this;
        }

        public Criteria andExpressidNotEqualTo(Integer value) {
            addCriterion("expressId <>", value, "expressid");
            return (Criteria) this;
        }

        public Criteria andExpressidGreaterThan(Integer value) {
            addCriterion("expressId >", value, "expressid");
            return (Criteria) this;
        }

        public Criteria andExpressidGreaterThanOrEqualTo(Integer value) {
            addCriterion("expressId >=", value, "expressid");
            return (Criteria) this;
        }

        public Criteria andExpressidLessThan(Integer value) {
            addCriterion("expressId <", value, "expressid");
            return (Criteria) this;
        }

        public Criteria andExpressidLessThanOrEqualTo(Integer value) {
            addCriterion("expressId <=", value, "expressid");
            return (Criteria) this;
        }

        public Criteria andExpressidIn(List<Integer> values) {
            addCriterion("expressId in", values, "expressid");
            return (Criteria) this;
        }

        public Criteria andExpressidNotIn(List<Integer> values) {
            addCriterion("expressId not in", values, "expressid");
            return (Criteria) this;
        }

        public Criteria andExpressidBetween(Integer value1, Integer value2) {
            addCriterion("expressId between", value1, value2, "expressid");
            return (Criteria) this;
        }

        public Criteria andExpressidNotBetween(Integer value1, Integer value2) {
            addCriterion("expressId not between", value1, value2, "expressid");
            return (Criteria) this;
        }

        public Criteria andExpresstitleIsNull() {
            addCriterion("expressTitle is null");
            return (Criteria) this;
        }

        public Criteria andExpresstitleIsNotNull() {
            addCriterion("expressTitle is not null");
            return (Criteria) this;
        }

        public Criteria andExpresstitleEqualTo(String value) {
            addCriterion("expressTitle =", value, "expresstitle");
            return (Criteria) this;
        }

        public Criteria andExpresstitleNotEqualTo(String value) {
            addCriterion("expressTitle <>", value, "expresstitle");
            return (Criteria) this;
        }

        public Criteria andExpresstitleGreaterThan(String value) {
            addCriterion("expressTitle >", value, "expresstitle");
            return (Criteria) this;
        }

        public Criteria andExpresstitleGreaterThanOrEqualTo(String value) {
            addCriterion("expressTitle >=", value, "expresstitle");
            return (Criteria) this;
        }

        public Criteria andExpresstitleLessThan(String value) {
            addCriterion("expressTitle <", value, "expresstitle");
            return (Criteria) this;
        }

        public Criteria andExpresstitleLessThanOrEqualTo(String value) {
            addCriterion("expressTitle <=", value, "expresstitle");
            return (Criteria) this;
        }

        public Criteria andExpresstitleLike(String value) {
            addCriterion("expressTitle like", value, "expresstitle");
            return (Criteria) this;
        }

        public Criteria andExpresstitleNotLike(String value) {
            addCriterion("expressTitle not like", value, "expresstitle");
            return (Criteria) this;
        }

        public Criteria andExpresstitleIn(List<String> values) {
            addCriterion("expressTitle in", values, "expresstitle");
            return (Criteria) this;
        }

        public Criteria andExpresstitleNotIn(List<String> values) {
            addCriterion("expressTitle not in", values, "expresstitle");
            return (Criteria) this;
        }

        public Criteria andExpresstitleBetween(String value1, String value2) {
            addCriterion("expressTitle between", value1, value2, "expresstitle");
            return (Criteria) this;
        }

        public Criteria andExpresstitleNotBetween(String value1, String value2) {
            addCriterion("expressTitle not between", value1, value2, "expresstitle");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(Integer value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(Integer value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(Integer value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(Integer value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(Integer value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<Integer> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<Integer> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(Integer value1, Integer value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andAmountIsNull() {
            addCriterion("amount is null");
            return (Criteria) this;
        }

        public Criteria andAmountIsNotNull() {
            addCriterion("amount is not null");
            return (Criteria) this;
        }

        public Criteria andAmountEqualTo(Integer value) {
            addCriterion("amount =", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotEqualTo(Integer value) {
            addCriterion("amount <>", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThan(Integer value) {
            addCriterion("amount >", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThanOrEqualTo(Integer value) {
            addCriterion("amount >=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThan(Integer value) {
            addCriterion("amount <", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThanOrEqualTo(Integer value) {
            addCriterion("amount <=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountIn(List<Integer> values) {
            addCriterion("amount in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotIn(List<Integer> values) {
            addCriterion("amount not in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountBetween(Integer value1, Integer value2) {
            addCriterion("amount between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotBetween(Integer value1, Integer value2) {
            addCriterion("amount not between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andExpressapiIsNull() {
            addCriterion("expressApi is null");
            return (Criteria) this;
        }

        public Criteria andExpressapiIsNotNull() {
            addCriterion("expressApi is not null");
            return (Criteria) this;
        }

        public Criteria andExpressapiEqualTo(String value) {
            addCriterion("expressApi =", value, "expressapi");
            return (Criteria) this;
        }

        public Criteria andExpressapiNotEqualTo(String value) {
            addCriterion("expressApi <>", value, "expressapi");
            return (Criteria) this;
        }

        public Criteria andExpressapiGreaterThan(String value) {
            addCriterion("expressApi >", value, "expressapi");
            return (Criteria) this;
        }

        public Criteria andExpressapiGreaterThanOrEqualTo(String value) {
            addCriterion("expressApi >=", value, "expressapi");
            return (Criteria) this;
        }

        public Criteria andExpressapiLessThan(String value) {
            addCriterion("expressApi <", value, "expressapi");
            return (Criteria) this;
        }

        public Criteria andExpressapiLessThanOrEqualTo(String value) {
            addCriterion("expressApi <=", value, "expressapi");
            return (Criteria) this;
        }

        public Criteria andExpressapiLike(String value) {
            addCriterion("expressApi like", value, "expressapi");
            return (Criteria) this;
        }

        public Criteria andExpressapiNotLike(String value) {
            addCriterion("expressApi not like", value, "expressapi");
            return (Criteria) this;
        }

        public Criteria andExpressapiIn(List<String> values) {
            addCriterion("expressApi in", values, "expressapi");
            return (Criteria) this;
        }

        public Criteria andExpressapiNotIn(List<String> values) {
            addCriterion("expressApi not in", values, "expressapi");
            return (Criteria) this;
        }

        public Criteria andExpressapiBetween(String value1, String value2) {
            addCriterion("expressApi between", value1, value2, "expressapi");
            return (Criteria) this;
        }

        public Criteria andExpressapiNotBetween(String value1, String value2) {
            addCriterion("expressApi not between", value1, value2, "expressapi");
            return (Criteria) this;
        }

        public Criteria andReqridIsNull() {
            addCriterion("reqrId is null");
            return (Criteria) this;
        }

        public Criteria andReqridIsNotNull() {
            addCriterion("reqrId is not null");
            return (Criteria) this;
        }

        public Criteria andReqridEqualTo(Integer value) {
            addCriterion("reqrId =", value, "reqrid");
            return (Criteria) this;
        }

        public Criteria andReqridNotEqualTo(Integer value) {
            addCriterion("reqrId <>", value, "reqrid");
            return (Criteria) this;
        }

        public Criteria andReqridGreaterThan(Integer value) {
            addCriterion("reqrId >", value, "reqrid");
            return (Criteria) this;
        }

        public Criteria andReqridGreaterThanOrEqualTo(Integer value) {
            addCriterion("reqrId >=", value, "reqrid");
            return (Criteria) this;
        }

        public Criteria andReqridLessThan(Integer value) {
            addCriterion("reqrId <", value, "reqrid");
            return (Criteria) this;
        }

        public Criteria andReqridLessThanOrEqualTo(Integer value) {
            addCriterion("reqrId <=", value, "reqrid");
            return (Criteria) this;
        }

        public Criteria andReqridIn(List<Integer> values) {
            addCriterion("reqrId in", values, "reqrid");
            return (Criteria) this;
        }

        public Criteria andReqridNotIn(List<Integer> values) {
            addCriterion("reqrId not in", values, "reqrid");
            return (Criteria) this;
        }

        public Criteria andReqridBetween(Integer value1, Integer value2) {
            addCriterion("reqrId between", value1, value2, "reqrid");
            return (Criteria) this;
        }

        public Criteria andReqridNotBetween(Integer value1, Integer value2) {
            addCriterion("reqrId not between", value1, value2, "reqrid");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table express
     *
     * @mbggenerated do_not_delete_during_merge Wed May 27 13:01:29 CST 2020
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table express
     *
     * @mbggenerated Wed May 27 13:01:29 CST 2020
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