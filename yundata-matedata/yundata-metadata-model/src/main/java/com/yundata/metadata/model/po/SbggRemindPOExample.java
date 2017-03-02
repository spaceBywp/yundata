package com.yundata.metadata.model.po;

import java.util.ArrayList;
import java.util.List;

public class SbggRemindPOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SbggRemindPOExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andAdminUserInfoIdIsNull() {
            addCriterion("admin_user_info_id is null");
            return (Criteria) this;
        }

        public Criteria andAdminUserInfoIdIsNotNull() {
            addCriterion("admin_user_info_id is not null");
            return (Criteria) this;
        }

        public Criteria andAdminUserInfoIdEqualTo(String value) {
            addCriterion("admin_user_info_id =", value, "adminUserInfoId");
            return (Criteria) this;
        }

        public Criteria andAdminUserInfoIdNotEqualTo(String value) {
            addCriterion("admin_user_info_id <>", value, "adminUserInfoId");
            return (Criteria) this;
        }

        public Criteria andAdminUserInfoIdGreaterThan(String value) {
            addCriterion("admin_user_info_id >", value, "adminUserInfoId");
            return (Criteria) this;
        }

        public Criteria andAdminUserInfoIdGreaterThanOrEqualTo(String value) {
            addCriterion("admin_user_info_id >=", value, "adminUserInfoId");
            return (Criteria) this;
        }

        public Criteria andAdminUserInfoIdLessThan(String value) {
            addCriterion("admin_user_info_id <", value, "adminUserInfoId");
            return (Criteria) this;
        }

        public Criteria andAdminUserInfoIdLessThanOrEqualTo(String value) {
            addCriterion("admin_user_info_id <=", value, "adminUserInfoId");
            return (Criteria) this;
        }

        public Criteria andAdminUserInfoIdLike(String value) {
            addCriterion("admin_user_info_id like", value, "adminUserInfoId");
            return (Criteria) this;
        }

        public Criteria andAdminUserInfoIdNotLike(String value) {
            addCriterion("admin_user_info_id not like", value, "adminUserInfoId");
            return (Criteria) this;
        }

        public Criteria andAdminUserInfoIdIn(List<String> values) {
            addCriterion("admin_user_info_id in", values, "adminUserInfoId");
            return (Criteria) this;
        }

        public Criteria andAdminUserInfoIdNotIn(List<String> values) {
            addCriterion("admin_user_info_id not in", values, "adminUserInfoId");
            return (Criteria) this;
        }

        public Criteria andAdminUserInfoIdBetween(String value1, String value2) {
            addCriterion("admin_user_info_id between", value1, value2, "adminUserInfoId");
            return (Criteria) this;
        }

        public Criteria andAdminUserInfoIdNotBetween(String value1, String value2) {
            addCriterion("admin_user_info_id not between", value1, value2, "adminUserInfoId");
            return (Criteria) this;
        }

        public Criteria andRegistNumberIsNull() {
            addCriterion("regist_number is null");
            return (Criteria) this;
        }

        public Criteria andRegistNumberIsNotNull() {
            addCriterion("regist_number is not null");
            return (Criteria) this;
        }

        public Criteria andRegistNumberEqualTo(String value) {
            addCriterion("regist_number =", value, "registNumber");
            return (Criteria) this;
        }

        public Criteria andRegistNumberNotEqualTo(String value) {
            addCriterion("regist_number <>", value, "registNumber");
            return (Criteria) this;
        }

        public Criteria andRegistNumberGreaterThan(String value) {
            addCriterion("regist_number >", value, "registNumber");
            return (Criteria) this;
        }

        public Criteria andRegistNumberGreaterThanOrEqualTo(String value) {
            addCriterion("regist_number >=", value, "registNumber");
            return (Criteria) this;
        }

        public Criteria andRegistNumberLessThan(String value) {
            addCriterion("regist_number <", value, "registNumber");
            return (Criteria) this;
        }

        public Criteria andRegistNumberLessThanOrEqualTo(String value) {
            addCriterion("regist_number <=", value, "registNumber");
            return (Criteria) this;
        }

        public Criteria andRegistNumberLike(String value) {
            addCriterion("regist_number like", value, "registNumber");
            return (Criteria) this;
        }

        public Criteria andRegistNumberNotLike(String value) {
            addCriterion("regist_number not like", value, "registNumber");
            return (Criteria) this;
        }

        public Criteria andRegistNumberIn(List<String> values) {
            addCriterion("regist_number in", values, "registNumber");
            return (Criteria) this;
        }

        public Criteria andRegistNumberNotIn(List<String> values) {
            addCriterion("regist_number not in", values, "registNumber");
            return (Criteria) this;
        }

        public Criteria andRegistNumberBetween(String value1, String value2) {
            addCriterion("regist_number between", value1, value2, "registNumber");
            return (Criteria) this;
        }

        public Criteria andRegistNumberNotBetween(String value1, String value2) {
            addCriterion("regist_number not between", value1, value2, "registNumber");
            return (Criteria) this;
        }

        public Criteria andCategoryNumberIsNull() {
            addCriterion("category_number is null");
            return (Criteria) this;
        }

        public Criteria andCategoryNumberIsNotNull() {
            addCriterion("category_number is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryNumberEqualTo(Integer value) {
            addCriterion("category_number =", value, "categoryNumber");
            return (Criteria) this;
        }

        public Criteria andCategoryNumberNotEqualTo(Integer value) {
            addCriterion("category_number <>", value, "categoryNumber");
            return (Criteria) this;
        }

        public Criteria andCategoryNumberGreaterThan(Integer value) {
            addCriterion("category_number >", value, "categoryNumber");
            return (Criteria) this;
        }

        public Criteria andCategoryNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("category_number >=", value, "categoryNumber");
            return (Criteria) this;
        }

        public Criteria andCategoryNumberLessThan(Integer value) {
            addCriterion("category_number <", value, "categoryNumber");
            return (Criteria) this;
        }

        public Criteria andCategoryNumberLessThanOrEqualTo(Integer value) {
            addCriterion("category_number <=", value, "categoryNumber");
            return (Criteria) this;
        }

        public Criteria andCategoryNumberIn(List<Integer> values) {
            addCriterion("category_number in", values, "categoryNumber");
            return (Criteria) this;
        }

        public Criteria andCategoryNumberNotIn(List<Integer> values) {
            addCriterion("category_number not in", values, "categoryNumber");
            return (Criteria) this;
        }

        public Criteria andCategoryNumberBetween(Integer value1, Integer value2) {
            addCriterion("category_number between", value1, value2, "categoryNumber");
            return (Criteria) this;
        }

        public Criteria andCategoryNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("category_number not between", value1, value2, "categoryNumber");
            return (Criteria) this;
        }

        public Criteria andRemindIsNull() {
            addCriterion("remind is null");
            return (Criteria) this;
        }

        public Criteria andRemindIsNotNull() {
            addCriterion("remind is not null");
            return (Criteria) this;
        }

        public Criteria andRemindEqualTo(String value) {
            addCriterion("remind =", value, "remind");
            return (Criteria) this;
        }

        public Criteria andRemindNotEqualTo(String value) {
            addCriterion("remind <>", value, "remind");
            return (Criteria) this;
        }

        public Criteria andRemindGreaterThan(String value) {
            addCriterion("remind >", value, "remind");
            return (Criteria) this;
        }

        public Criteria andRemindGreaterThanOrEqualTo(String value) {
            addCriterion("remind >=", value, "remind");
            return (Criteria) this;
        }

        public Criteria andRemindLessThan(String value) {
            addCriterion("remind <", value, "remind");
            return (Criteria) this;
        }

        public Criteria andRemindLessThanOrEqualTo(String value) {
            addCriterion("remind <=", value, "remind");
            return (Criteria) this;
        }

        public Criteria andRemindLike(String value) {
            addCriterion("remind like", value, "remind");
            return (Criteria) this;
        }

        public Criteria andRemindNotLike(String value) {
            addCriterion("remind not like", value, "remind");
            return (Criteria) this;
        }

        public Criteria andRemindIn(List<String> values) {
            addCriterion("remind in", values, "remind");
            return (Criteria) this;
        }

        public Criteria andRemindNotIn(List<String> values) {
            addCriterion("remind not in", values, "remind");
            return (Criteria) this;
        }

        public Criteria andRemindBetween(String value1, String value2) {
            addCriterion("remind between", value1, value2, "remind");
            return (Criteria) this;
        }

        public Criteria andRemindNotBetween(String value1, String value2) {
            addCriterion("remind not between", value1, value2, "remind");
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