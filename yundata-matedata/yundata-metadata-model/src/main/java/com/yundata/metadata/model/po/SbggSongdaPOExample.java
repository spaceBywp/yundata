package com.yundata.metadata.model.po;

import java.util.ArrayList;
import java.util.List;

public class SbggSongdaPOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SbggSongdaPOExample() {
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

        public Criteria andSbggqhIsNull() {
            addCriterion("sbggqh is null");
            return (Criteria) this;
        }

        public Criteria andSbggqhIsNotNull() {
            addCriterion("sbggqh is not null");
            return (Criteria) this;
        }

        public Criteria andSbggqhEqualTo(Integer value) {
            addCriterion("sbggqh =", value, "sbggqh");
            return (Criteria) this;
        }

        public Criteria andSbggqhNotEqualTo(Integer value) {
            addCriterion("sbggqh <>", value, "sbggqh");
            return (Criteria) this;
        }

        public Criteria andSbggqhGreaterThan(Integer value) {
            addCriterion("sbggqh >", value, "sbggqh");
            return (Criteria) this;
        }

        public Criteria andSbggqhGreaterThanOrEqualTo(Integer value) {
            addCriterion("sbggqh >=", value, "sbggqh");
            return (Criteria) this;
        }

        public Criteria andSbggqhLessThan(Integer value) {
            addCriterion("sbggqh <", value, "sbggqh");
            return (Criteria) this;
        }

        public Criteria andSbggqhLessThanOrEqualTo(Integer value) {
            addCriterion("sbggqh <=", value, "sbggqh");
            return (Criteria) this;
        }

        public Criteria andSbggqhIn(List<Integer> values) {
            addCriterion("sbggqh in", values, "sbggqh");
            return (Criteria) this;
        }

        public Criteria andSbggqhNotIn(List<Integer> values) {
            addCriterion("sbggqh not in", values, "sbggqh");
            return (Criteria) this;
        }

        public Criteria andSbggqhBetween(Integer value1, Integer value2) {
            addCriterion("sbggqh between", value1, value2, "sbggqh");
            return (Criteria) this;
        }

        public Criteria andSbggqhNotBetween(Integer value1, Integer value2) {
            addCriterion("sbggqh not between", value1, value2, "sbggqh");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andStartPageIsNull() {
            addCriterion("start_page is null");
            return (Criteria) this;
        }

        public Criteria andStartPageIsNotNull() {
            addCriterion("start_page is not null");
            return (Criteria) this;
        }

        public Criteria andStartPageEqualTo(Integer value) {
            addCriterion("start_page =", value, "startPage");
            return (Criteria) this;
        }

        public Criteria andStartPageNotEqualTo(Integer value) {
            addCriterion("start_page <>", value, "startPage");
            return (Criteria) this;
        }

        public Criteria andStartPageGreaterThan(Integer value) {
            addCriterion("start_page >", value, "startPage");
            return (Criteria) this;
        }

        public Criteria andStartPageGreaterThanOrEqualTo(Integer value) {
            addCriterion("start_page >=", value, "startPage");
            return (Criteria) this;
        }

        public Criteria andStartPageLessThan(Integer value) {
            addCriterion("start_page <", value, "startPage");
            return (Criteria) this;
        }

        public Criteria andStartPageLessThanOrEqualTo(Integer value) {
            addCriterion("start_page <=", value, "startPage");
            return (Criteria) this;
        }

        public Criteria andStartPageIn(List<Integer> values) {
            addCriterion("start_page in", values, "startPage");
            return (Criteria) this;
        }

        public Criteria andStartPageNotIn(List<Integer> values) {
            addCriterion("start_page not in", values, "startPage");
            return (Criteria) this;
        }

        public Criteria andStartPageBetween(Integer value1, Integer value2) {
            addCriterion("start_page between", value1, value2, "startPage");
            return (Criteria) this;
        }

        public Criteria andStartPageNotBetween(Integer value1, Integer value2) {
            addCriterion("start_page not between", value1, value2, "startPage");
            return (Criteria) this;
        }

        public Criteria andStartYIsNull() {
            addCriterion("start_y is null");
            return (Criteria) this;
        }

        public Criteria andStartYIsNotNull() {
            addCriterion("start_y is not null");
            return (Criteria) this;
        }

        public Criteria andStartYEqualTo(Integer value) {
            addCriterion("start_y =", value, "startY");
            return (Criteria) this;
        }

        public Criteria andStartYNotEqualTo(Integer value) {
            addCriterion("start_y <>", value, "startY");
            return (Criteria) this;
        }

        public Criteria andStartYGreaterThan(Integer value) {
            addCriterion("start_y >", value, "startY");
            return (Criteria) this;
        }

        public Criteria andStartYGreaterThanOrEqualTo(Integer value) {
            addCriterion("start_y >=", value, "startY");
            return (Criteria) this;
        }

        public Criteria andStartYLessThan(Integer value) {
            addCriterion("start_y <", value, "startY");
            return (Criteria) this;
        }

        public Criteria andStartYLessThanOrEqualTo(Integer value) {
            addCriterion("start_y <=", value, "startY");
            return (Criteria) this;
        }

        public Criteria andStartYIn(List<Integer> values) {
            addCriterion("start_y in", values, "startY");
            return (Criteria) this;
        }

        public Criteria andStartYNotIn(List<Integer> values) {
            addCriterion("start_y not in", values, "startY");
            return (Criteria) this;
        }

        public Criteria andStartYBetween(Integer value1, Integer value2) {
            addCriterion("start_y between", value1, value2, "startY");
            return (Criteria) this;
        }

        public Criteria andStartYNotBetween(Integer value1, Integer value2) {
            addCriterion("start_y not between", value1, value2, "startY");
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