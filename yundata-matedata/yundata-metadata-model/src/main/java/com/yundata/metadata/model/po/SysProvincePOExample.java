package com.yundata.metadata.model.po;

import java.util.ArrayList;
import java.util.List;

public class SysProvincePOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysProvincePOExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

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

        public Criteria andCodeIsNull() {
            addCriterion("code is null");
            return (Criteria) this;
        }

        public Criteria andCodeIsNotNull() {
            addCriterion("code is not null");
            return (Criteria) this;
        }

        public Criteria andCodeEqualTo(String value) {
            addCriterion("code =", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotEqualTo(String value) {
            addCriterion("code <>", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThan(String value) {
            addCriterion("code >", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThanOrEqualTo(String value) {
            addCriterion("code >=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThan(String value) {
            addCriterion("code <", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThanOrEqualTo(String value) {
            addCriterion("code <=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLike(String value) {
            addCriterion("code like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotLike(String value) {
            addCriterion("code not like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeIn(List<String> values) {
            addCriterion("code in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotIn(List<String> values) {
            addCriterion("code not in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeBetween(String value1, String value2) {
            addCriterion("code between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotBetween(String value1, String value2) {
            addCriterion("code not between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andShengfenCnIsNull() {
            addCriterion("shengfen_cn is null");
            return (Criteria) this;
        }

        public Criteria andShengfenCnIsNotNull() {
            addCriterion("shengfen_cn is not null");
            return (Criteria) this;
        }

        public Criteria andShengfenCnEqualTo(String value) {
            addCriterion("shengfen_cn =", value, "shengfenCn");
            return (Criteria) this;
        }

        public Criteria andShengfenCnNotEqualTo(String value) {
            addCriterion("shengfen_cn <>", value, "shengfenCn");
            return (Criteria) this;
        }

        public Criteria andShengfenCnGreaterThan(String value) {
            addCriterion("shengfen_cn >", value, "shengfenCn");
            return (Criteria) this;
        }

        public Criteria andShengfenCnGreaterThanOrEqualTo(String value) {
            addCriterion("shengfen_cn >=", value, "shengfenCn");
            return (Criteria) this;
        }

        public Criteria andShengfenCnLessThan(String value) {
            addCriterion("shengfen_cn <", value, "shengfenCn");
            return (Criteria) this;
        }

        public Criteria andShengfenCnLessThanOrEqualTo(String value) {
            addCriterion("shengfen_cn <=", value, "shengfenCn");
            return (Criteria) this;
        }

        public Criteria andShengfenCnLike(String value) {
            addCriterion("shengfen_cn like", value, "shengfenCn");
            return (Criteria) this;
        }

        public Criteria andShengfenCnNotLike(String value) {
            addCriterion("shengfen_cn not like", value, "shengfenCn");
            return (Criteria) this;
        }

        public Criteria andShengfenCnIn(List<String> values) {
            addCriterion("shengfen_cn in", values, "shengfenCn");
            return (Criteria) this;
        }

        public Criteria andShengfenCnNotIn(List<String> values) {
            addCriterion("shengfen_cn not in", values, "shengfenCn");
            return (Criteria) this;
        }

        public Criteria andShengfenCnBetween(String value1, String value2) {
            addCriterion("shengfen_cn between", value1, value2, "shengfenCn");
            return (Criteria) this;
        }

        public Criteria andShengfenCnNotBetween(String value1, String value2) {
            addCriterion("shengfen_cn not between", value1, value2, "shengfenCn");
            return (Criteria) this;
        }

        public Criteria andShengfenIsNull() {
            addCriterion("shengfen is null");
            return (Criteria) this;
        }

        public Criteria andShengfenIsNotNull() {
            addCriterion("shengfen is not null");
            return (Criteria) this;
        }

        public Criteria andShengfenEqualTo(String value) {
            addCriterion("shengfen =", value, "shengfen");
            return (Criteria) this;
        }

        public Criteria andShengfenNotEqualTo(String value) {
            addCriterion("shengfen <>", value, "shengfen");
            return (Criteria) this;
        }

        public Criteria andShengfenGreaterThan(String value) {
            addCriterion("shengfen >", value, "shengfen");
            return (Criteria) this;
        }

        public Criteria andShengfenGreaterThanOrEqualTo(String value) {
            addCriterion("shengfen >=", value, "shengfen");
            return (Criteria) this;
        }

        public Criteria andShengfenLessThan(String value) {
            addCriterion("shengfen <", value, "shengfen");
            return (Criteria) this;
        }

        public Criteria andShengfenLessThanOrEqualTo(String value) {
            addCriterion("shengfen <=", value, "shengfen");
            return (Criteria) this;
        }

        public Criteria andShengfenLike(String value) {
            addCriterion("shengfen like", value, "shengfen");
            return (Criteria) this;
        }

        public Criteria andShengfenNotLike(String value) {
            addCriterion("shengfen not like", value, "shengfen");
            return (Criteria) this;
        }

        public Criteria andShengfenIn(List<String> values) {
            addCriterion("shengfen in", values, "shengfen");
            return (Criteria) this;
        }

        public Criteria andShengfenNotIn(List<String> values) {
            addCriterion("shengfen not in", values, "shengfen");
            return (Criteria) this;
        }

        public Criteria andShengfenBetween(String value1, String value2) {
            addCriterion("shengfen between", value1, value2, "shengfen");
            return (Criteria) this;
        }

        public Criteria andShengfenNotBetween(String value1, String value2) {
            addCriterion("shengfen not between", value1, value2, "shengfen");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

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