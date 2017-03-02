package com.yundata.metadata.model.po;

import java.util.ArrayList;
import java.util.List;

public class TBrandReportPOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TBrandReportPOExample() {
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

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Long value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Long value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Long value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Long value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Long value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Long> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Long> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Long value1, Long value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Long value1, Long value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andBrandNameIsNull() {
            addCriterion("brand_name is null");
            return (Criteria) this;
        }

        public Criteria andBrandNameIsNotNull() {
            addCriterion("brand_name is not null");
            return (Criteria) this;
        }

        public Criteria andBrandNameEqualTo(String value) {
            addCriterion("brand_name =", value, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameNotEqualTo(String value) {
            addCriterion("brand_name <>", value, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameGreaterThan(String value) {
            addCriterion("brand_name >", value, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameGreaterThanOrEqualTo(String value) {
            addCriterion("brand_name >=", value, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameLessThan(String value) {
            addCriterion("brand_name <", value, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameLessThanOrEqualTo(String value) {
            addCriterion("brand_name <=", value, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameLike(String value) {
            addCriterion("brand_name like", value, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameNotLike(String value) {
            addCriterion("brand_name not like", value, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameIn(List<String> values) {
            addCriterion("brand_name in", values, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameNotIn(List<String> values) {
            addCriterion("brand_name not in", values, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameBetween(String value1, String value2) {
            addCriterion("brand_name between", value1, value2, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameNotBetween(String value1, String value2) {
            addCriterion("brand_name not between", value1, value2, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandRegIsNull() {
            addCriterion("brand_reg is null");
            return (Criteria) this;
        }

        public Criteria andBrandRegIsNotNull() {
            addCriterion("brand_reg is not null");
            return (Criteria) this;
        }

        public Criteria andBrandRegEqualTo(String value) {
            addCriterion("brand_reg =", value, "brandReg");
            return (Criteria) this;
        }

        public Criteria andBrandRegNotEqualTo(String value) {
            addCriterion("brand_reg <>", value, "brandReg");
            return (Criteria) this;
        }

        public Criteria andBrandRegGreaterThan(String value) {
            addCriterion("brand_reg >", value, "brandReg");
            return (Criteria) this;
        }

        public Criteria andBrandRegGreaterThanOrEqualTo(String value) {
            addCriterion("brand_reg >=", value, "brandReg");
            return (Criteria) this;
        }

        public Criteria andBrandRegLessThan(String value) {
            addCriterion("brand_reg <", value, "brandReg");
            return (Criteria) this;
        }

        public Criteria andBrandRegLessThanOrEqualTo(String value) {
            addCriterion("brand_reg <=", value, "brandReg");
            return (Criteria) this;
        }

        public Criteria andBrandRegLike(String value) {
            addCriterion("brand_reg like", value, "brandReg");
            return (Criteria) this;
        }

        public Criteria andBrandRegNotLike(String value) {
            addCriterion("brand_reg not like", value, "brandReg");
            return (Criteria) this;
        }

        public Criteria andBrandRegIn(List<String> values) {
            addCriterion("brand_reg in", values, "brandReg");
            return (Criteria) this;
        }

        public Criteria andBrandRegNotIn(List<String> values) {
            addCriterion("brand_reg not in", values, "brandReg");
            return (Criteria) this;
        }

        public Criteria andBrandRegBetween(String value1, String value2) {
            addCriterion("brand_reg between", value1, value2, "brandReg");
            return (Criteria) this;
        }

        public Criteria andBrandRegNotBetween(String value1, String value2) {
            addCriterion("brand_reg not between", value1, value2, "brandReg");
            return (Criteria) this;
        }

        public Criteria andBrandCategoryIsNull() {
            addCriterion("brand_category is null");
            return (Criteria) this;
        }

        public Criteria andBrandCategoryIsNotNull() {
            addCriterion("brand_category is not null");
            return (Criteria) this;
        }

        public Criteria andBrandCategoryEqualTo(String value) {
            addCriterion("brand_category =", value, "brandCategory");
            return (Criteria) this;
        }

        public Criteria andBrandCategoryNotEqualTo(String value) {
            addCriterion("brand_category <>", value, "brandCategory");
            return (Criteria) this;
        }

        public Criteria andBrandCategoryGreaterThan(String value) {
            addCriterion("brand_category >", value, "brandCategory");
            return (Criteria) this;
        }

        public Criteria andBrandCategoryGreaterThanOrEqualTo(String value) {
            addCriterion("brand_category >=", value, "brandCategory");
            return (Criteria) this;
        }

        public Criteria andBrandCategoryLessThan(String value) {
            addCriterion("brand_category <", value, "brandCategory");
            return (Criteria) this;
        }

        public Criteria andBrandCategoryLessThanOrEqualTo(String value) {
            addCriterion("brand_category <=", value, "brandCategory");
            return (Criteria) this;
        }

        public Criteria andBrandCategoryLike(String value) {
            addCriterion("brand_category like", value, "brandCategory");
            return (Criteria) this;
        }

        public Criteria andBrandCategoryNotLike(String value) {
            addCriterion("brand_category not like", value, "brandCategory");
            return (Criteria) this;
        }

        public Criteria andBrandCategoryIn(List<String> values) {
            addCriterion("brand_category in", values, "brandCategory");
            return (Criteria) this;
        }

        public Criteria andBrandCategoryNotIn(List<String> values) {
            addCriterion("brand_category not in", values, "brandCategory");
            return (Criteria) this;
        }

        public Criteria andBrandCategoryBetween(String value1, String value2) {
            addCriterion("brand_category between", value1, value2, "brandCategory");
            return (Criteria) this;
        }

        public Criteria andBrandCategoryNotBetween(String value1, String value2) {
            addCriterion("brand_category not between", value1, value2, "brandCategory");
            return (Criteria) this;
        }

        public Criteria andBrandApplyIsNull() {
            addCriterion("brand_apply is null");
            return (Criteria) this;
        }

        public Criteria andBrandApplyIsNotNull() {
            addCriterion("brand_apply is not null");
            return (Criteria) this;
        }

        public Criteria andBrandApplyEqualTo(String value) {
            addCriterion("brand_apply =", value, "brandApply");
            return (Criteria) this;
        }

        public Criteria andBrandApplyNotEqualTo(String value) {
            addCriterion("brand_apply <>", value, "brandApply");
            return (Criteria) this;
        }

        public Criteria andBrandApplyGreaterThan(String value) {
            addCriterion("brand_apply >", value, "brandApply");
            return (Criteria) this;
        }

        public Criteria andBrandApplyGreaterThanOrEqualTo(String value) {
            addCriterion("brand_apply >=", value, "brandApply");
            return (Criteria) this;
        }

        public Criteria andBrandApplyLessThan(String value) {
            addCriterion("brand_apply <", value, "brandApply");
            return (Criteria) this;
        }

        public Criteria andBrandApplyLessThanOrEqualTo(String value) {
            addCriterion("brand_apply <=", value, "brandApply");
            return (Criteria) this;
        }

        public Criteria andBrandApplyLike(String value) {
            addCriterion("brand_apply like", value, "brandApply");
            return (Criteria) this;
        }

        public Criteria andBrandApplyNotLike(String value) {
            addCriterion("brand_apply not like", value, "brandApply");
            return (Criteria) this;
        }

        public Criteria andBrandApplyIn(List<String> values) {
            addCriterion("brand_apply in", values, "brandApply");
            return (Criteria) this;
        }

        public Criteria andBrandApplyNotIn(List<String> values) {
            addCriterion("brand_apply not in", values, "brandApply");
            return (Criteria) this;
        }

        public Criteria andBrandApplyBetween(String value1, String value2) {
            addCriterion("brand_apply between", value1, value2, "brandApply");
            return (Criteria) this;
        }

        public Criteria andBrandApplyNotBetween(String value1, String value2) {
            addCriterion("brand_apply not between", value1, value2, "brandApply");
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