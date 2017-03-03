package com.yundata.metadata.model.po;

import java.util.ArrayList;
import java.util.List;

public class DictIndustryGjflPOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DictIndustryGjflPOExample() {
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

        public Criteria andGjflsIsNull() {
            addCriterion("gjfls is null");
            return (Criteria) this;
        }

        public Criteria andGjflsIsNotNull() {
            addCriterion("gjfls is not null");
            return (Criteria) this;
        }

        public Criteria andGjflsEqualTo(String value) {
            addCriterion("gjfls =", value, "gjfls");
            return (Criteria) this;
        }

        public Criteria andGjflsNotEqualTo(String value) {
            addCriterion("gjfls <>", value, "gjfls");
            return (Criteria) this;
        }

        public Criteria andGjflsGreaterThan(String value) {
            addCriterion("gjfls >", value, "gjfls");
            return (Criteria) this;
        }

        public Criteria andGjflsGreaterThanOrEqualTo(String value) {
            addCriterion("gjfls >=", value, "gjfls");
            return (Criteria) this;
        }

        public Criteria andGjflsLessThan(String value) {
            addCriterion("gjfls <", value, "gjfls");
            return (Criteria) this;
        }

        public Criteria andGjflsLessThanOrEqualTo(String value) {
            addCriterion("gjfls <=", value, "gjfls");
            return (Criteria) this;
        }

        public Criteria andGjflsLike(String value) {
            addCriterion("gjfls like", value, "gjfls");
            return (Criteria) this;
        }

        public Criteria andGjflsNotLike(String value) {
            addCriterion("gjfls not like", value, "gjfls");
            return (Criteria) this;
        }

        public Criteria andGjflsIn(List<String> values) {
            addCriterion("gjfls in", values, "gjfls");
            return (Criteria) this;
        }

        public Criteria andGjflsNotIn(List<String> values) {
            addCriterion("gjfls not in", values, "gjfls");
            return (Criteria) this;
        }

        public Criteria andGjflsBetween(String value1, String value2) {
            addCriterion("gjfls between", value1, value2, "gjfls");
            return (Criteria) this;
        }

        public Criteria andGjflsNotBetween(String value1, String value2) {
            addCriterion("gjfls not between", value1, value2, "gjfls");
            return (Criteria) this;
        }

        public Criteria andRelatedGjflsIsNull() {
            addCriterion("related_gjfls is null");
            return (Criteria) this;
        }

        public Criteria andRelatedGjflsIsNotNull() {
            addCriterion("related_gjfls is not null");
            return (Criteria) this;
        }

        public Criteria andRelatedGjflsEqualTo(String value) {
            addCriterion("related_gjfls =", value, "relatedGjfls");
            return (Criteria) this;
        }

        public Criteria andRelatedGjflsNotEqualTo(String value) {
            addCriterion("related_gjfls <>", value, "relatedGjfls");
            return (Criteria) this;
        }

        public Criteria andRelatedGjflsGreaterThan(String value) {
            addCriterion("related_gjfls >", value, "relatedGjfls");
            return (Criteria) this;
        }

        public Criteria andRelatedGjflsGreaterThanOrEqualTo(String value) {
            addCriterion("related_gjfls >=", value, "relatedGjfls");
            return (Criteria) this;
        }

        public Criteria andRelatedGjflsLessThan(String value) {
            addCriterion("related_gjfls <", value, "relatedGjfls");
            return (Criteria) this;
        }

        public Criteria andRelatedGjflsLessThanOrEqualTo(String value) {
            addCriterion("related_gjfls <=", value, "relatedGjfls");
            return (Criteria) this;
        }

        public Criteria andRelatedGjflsLike(String value) {
            addCriterion("related_gjfls like", value, "relatedGjfls");
            return (Criteria) this;
        }

        public Criteria andRelatedGjflsNotLike(String value) {
            addCriterion("related_gjfls not like", value, "relatedGjfls");
            return (Criteria) this;
        }

        public Criteria andRelatedGjflsIn(List<String> values) {
            addCriterion("related_gjfls in", values, "relatedGjfls");
            return (Criteria) this;
        }

        public Criteria andRelatedGjflsNotIn(List<String> values) {
            addCriterion("related_gjfls not in", values, "relatedGjfls");
            return (Criteria) this;
        }

        public Criteria andRelatedGjflsBetween(String value1, String value2) {
            addCriterion("related_gjfls between", value1, value2, "relatedGjfls");
            return (Criteria) this;
        }

        public Criteria andRelatedGjflsNotBetween(String value1, String value2) {
            addCriterion("related_gjfls not between", value1, value2, "relatedGjfls");
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

        public Criteria andAmountEqualTo(Double value) {
            addCriterion("amount =", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotEqualTo(Double value) {
            addCriterion("amount <>", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThan(Double value) {
            addCriterion("amount >", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThanOrEqualTo(Double value) {
            addCriterion("amount >=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThan(Double value) {
            addCriterion("amount <", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThanOrEqualTo(Double value) {
            addCriterion("amount <=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountIn(List<Double> values) {
            addCriterion("amount in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotIn(List<Double> values) {
            addCriterion("amount not in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountBetween(Double value1, Double value2) {
            addCriterion("amount between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotBetween(Double value1, Double value2) {
            addCriterion("amount not between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andGjflsNameIsNull() {
            addCriterion("gjfls_name is null");
            return (Criteria) this;
        }

        public Criteria andGjflsNameIsNotNull() {
            addCriterion("gjfls_name is not null");
            return (Criteria) this;
        }

        public Criteria andGjflsNameEqualTo(String value) {
            addCriterion("gjfls_name =", value, "gjflsName");
            return (Criteria) this;
        }

        public Criteria andGjflsNameNotEqualTo(String value) {
            addCriterion("gjfls_name <>", value, "gjflsName");
            return (Criteria) this;
        }

        public Criteria andGjflsNameGreaterThan(String value) {
            addCriterion("gjfls_name >", value, "gjflsName");
            return (Criteria) this;
        }

        public Criteria andGjflsNameGreaterThanOrEqualTo(String value) {
            addCriterion("gjfls_name >=", value, "gjflsName");
            return (Criteria) this;
        }

        public Criteria andGjflsNameLessThan(String value) {
            addCriterion("gjfls_name <", value, "gjflsName");
            return (Criteria) this;
        }

        public Criteria andGjflsNameLessThanOrEqualTo(String value) {
            addCriterion("gjfls_name <=", value, "gjflsName");
            return (Criteria) this;
        }

        public Criteria andGjflsNameLike(String value) {
            addCriterion("gjfls_name like", value, "gjflsName");
            return (Criteria) this;
        }

        public Criteria andGjflsNameNotLike(String value) {
            addCriterion("gjfls_name not like", value, "gjflsName");
            return (Criteria) this;
        }

        public Criteria andGjflsNameIn(List<String> values) {
            addCriterion("gjfls_name in", values, "gjflsName");
            return (Criteria) this;
        }

        public Criteria andGjflsNameNotIn(List<String> values) {
            addCriterion("gjfls_name not in", values, "gjflsName");
            return (Criteria) this;
        }

        public Criteria andGjflsNameBetween(String value1, String value2) {
            addCriterion("gjfls_name between", value1, value2, "gjflsName");
            return (Criteria) this;
        }

        public Criteria andGjflsNameNotBetween(String value1, String value2) {
            addCriterion("gjfls_name not between", value1, value2, "gjflsName");
            return (Criteria) this;
        }

        public Criteria andRelatedGjflsNameIsNull() {
            addCriterion("related_gjfls_name is null");
            return (Criteria) this;
        }

        public Criteria andRelatedGjflsNameIsNotNull() {
            addCriterion("related_gjfls_name is not null");
            return (Criteria) this;
        }

        public Criteria andRelatedGjflsNameEqualTo(String value) {
            addCriterion("related_gjfls_name =", value, "relatedGjflsName");
            return (Criteria) this;
        }

        public Criteria andRelatedGjflsNameNotEqualTo(String value) {
            addCriterion("related_gjfls_name <>", value, "relatedGjflsName");
            return (Criteria) this;
        }

        public Criteria andRelatedGjflsNameGreaterThan(String value) {
            addCriterion("related_gjfls_name >", value, "relatedGjflsName");
            return (Criteria) this;
        }

        public Criteria andRelatedGjflsNameGreaterThanOrEqualTo(String value) {
            addCriterion("related_gjfls_name >=", value, "relatedGjflsName");
            return (Criteria) this;
        }

        public Criteria andRelatedGjflsNameLessThan(String value) {
            addCriterion("related_gjfls_name <", value, "relatedGjflsName");
            return (Criteria) this;
        }

        public Criteria andRelatedGjflsNameLessThanOrEqualTo(String value) {
            addCriterion("related_gjfls_name <=", value, "relatedGjflsName");
            return (Criteria) this;
        }

        public Criteria andRelatedGjflsNameLike(String value) {
            addCriterion("related_gjfls_name like", value, "relatedGjflsName");
            return (Criteria) this;
        }

        public Criteria andRelatedGjflsNameNotLike(String value) {
            addCriterion("related_gjfls_name not like", value, "relatedGjflsName");
            return (Criteria) this;
        }

        public Criteria andRelatedGjflsNameIn(List<String> values) {
            addCriterion("related_gjfls_name in", values, "relatedGjflsName");
            return (Criteria) this;
        }

        public Criteria andRelatedGjflsNameNotIn(List<String> values) {
            addCriterion("related_gjfls_name not in", values, "relatedGjflsName");
            return (Criteria) this;
        }

        public Criteria andRelatedGjflsNameBetween(String value1, String value2) {
            addCriterion("related_gjfls_name between", value1, value2, "relatedGjflsName");
            return (Criteria) this;
        }

        public Criteria andRelatedGjflsNameNotBetween(String value1, String value2) {
            addCriterion("related_gjfls_name not between", value1, value2, "relatedGjflsName");
            return (Criteria) this;
        }

        public Criteria andDisplayOrderIsNull() {
            addCriterion("display_order is null");
            return (Criteria) this;
        }

        public Criteria andDisplayOrderIsNotNull() {
            addCriterion("display_order is not null");
            return (Criteria) this;
        }

        public Criteria andDisplayOrderEqualTo(Double value) {
            addCriterion("display_order =", value, "displayOrder");
            return (Criteria) this;
        }

        public Criteria andDisplayOrderNotEqualTo(Double value) {
            addCriterion("display_order <>", value, "displayOrder");
            return (Criteria) this;
        }

        public Criteria andDisplayOrderGreaterThan(Double value) {
            addCriterion("display_order >", value, "displayOrder");
            return (Criteria) this;
        }

        public Criteria andDisplayOrderGreaterThanOrEqualTo(Double value) {
            addCriterion("display_order >=", value, "displayOrder");
            return (Criteria) this;
        }

        public Criteria andDisplayOrderLessThan(Double value) {
            addCriterion("display_order <", value, "displayOrder");
            return (Criteria) this;
        }

        public Criteria andDisplayOrderLessThanOrEqualTo(Double value) {
            addCriterion("display_order <=", value, "displayOrder");
            return (Criteria) this;
        }

        public Criteria andDisplayOrderIn(List<Double> values) {
            addCriterion("display_order in", values, "displayOrder");
            return (Criteria) this;
        }

        public Criteria andDisplayOrderNotIn(List<Double> values) {
            addCriterion("display_order not in", values, "displayOrder");
            return (Criteria) this;
        }

        public Criteria andDisplayOrderBetween(Double value1, Double value2) {
            addCriterion("display_order between", value1, value2, "displayOrder");
            return (Criteria) this;
        }

        public Criteria andDisplayOrderNotBetween(Double value1, Double value2) {
            addCriterion("display_order not between", value1, value2, "displayOrder");
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