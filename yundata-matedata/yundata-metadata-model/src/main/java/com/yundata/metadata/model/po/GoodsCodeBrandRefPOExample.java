package com.yundata.metadata.model.po;

import java.util.ArrayList;
import java.util.List;

public class GoodsCodeBrandRefPOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GoodsCodeBrandRefPOExample() {
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

        public Criteria andGjflIsNull() {
            addCriterion("gjfl is null");
            return (Criteria) this;
        }

        public Criteria andGjflIsNotNull() {
            addCriterion("gjfl is not null");
            return (Criteria) this;
        }

        public Criteria andGjflEqualTo(String value) {
            addCriterion("gjfl =", value, "gjfl");
            return (Criteria) this;
        }

        public Criteria andGjflNotEqualTo(String value) {
            addCriterion("gjfl <>", value, "gjfl");
            return (Criteria) this;
        }

        public Criteria andGjflGreaterThan(String value) {
            addCriterion("gjfl >", value, "gjfl");
            return (Criteria) this;
        }

        public Criteria andGjflGreaterThanOrEqualTo(String value) {
            addCriterion("gjfl >=", value, "gjfl");
            return (Criteria) this;
        }

        public Criteria andGjflLessThan(String value) {
            addCriterion("gjfl <", value, "gjfl");
            return (Criteria) this;
        }

        public Criteria andGjflLessThanOrEqualTo(String value) {
            addCriterion("gjfl <=", value, "gjfl");
            return (Criteria) this;
        }

        public Criteria andGjflLike(String value) {
            addCriterion("gjfl like", value, "gjfl");
            return (Criteria) this;
        }

        public Criteria andGjflNotLike(String value) {
            addCriterion("gjfl not like", value, "gjfl");
            return (Criteria) this;
        }

        public Criteria andGjflIn(List<String> values) {
            addCriterion("gjfl in", values, "gjfl");
            return (Criteria) this;
        }

        public Criteria andGjflNotIn(List<String> values) {
            addCriterion("gjfl not in", values, "gjfl");
            return (Criteria) this;
        }

        public Criteria andGjflBetween(String value1, String value2) {
            addCriterion("gjfl between", value1, value2, "gjfl");
            return (Criteria) this;
        }

        public Criteria andGjflNotBetween(String value1, String value2) {
            addCriterion("gjfl not between", value1, value2, "gjfl");
            return (Criteria) this;
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

        public Criteria andFenleiNameIsNull() {
            addCriterion("fenlei_name is null");
            return (Criteria) this;
        }

        public Criteria andFenleiNameIsNotNull() {
            addCriterion("fenlei_name is not null");
            return (Criteria) this;
        }

        public Criteria andFenleiNameEqualTo(String value) {
            addCriterion("fenlei_name =", value, "fenleiName");
            return (Criteria) this;
        }

        public Criteria andFenleiNameNotEqualTo(String value) {
            addCriterion("fenlei_name <>", value, "fenleiName");
            return (Criteria) this;
        }

        public Criteria andFenleiNameGreaterThan(String value) {
            addCriterion("fenlei_name >", value, "fenleiName");
            return (Criteria) this;
        }

        public Criteria andFenleiNameGreaterThanOrEqualTo(String value) {
            addCriterion("fenlei_name >=", value, "fenleiName");
            return (Criteria) this;
        }

        public Criteria andFenleiNameLessThan(String value) {
            addCriterion("fenlei_name <", value, "fenleiName");
            return (Criteria) this;
        }

        public Criteria andFenleiNameLessThanOrEqualTo(String value) {
            addCriterion("fenlei_name <=", value, "fenleiName");
            return (Criteria) this;
        }

        public Criteria andFenleiNameLike(String value) {
            addCriterion("fenlei_name like", value, "fenleiName");
            return (Criteria) this;
        }

        public Criteria andFenleiNameNotLike(String value) {
            addCriterion("fenlei_name not like", value, "fenleiName");
            return (Criteria) this;
        }

        public Criteria andFenleiNameIn(List<String> values) {
            addCriterion("fenlei_name in", values, "fenleiName");
            return (Criteria) this;
        }

        public Criteria andFenleiNameNotIn(List<String> values) {
            addCriterion("fenlei_name not in", values, "fenleiName");
            return (Criteria) this;
        }

        public Criteria andFenleiNameBetween(String value1, String value2) {
            addCriterion("fenlei_name between", value1, value2, "fenleiName");
            return (Criteria) this;
        }

        public Criteria andFenleiNameNotBetween(String value1, String value2) {
            addCriterion("fenlei_name not between", value1, value2, "fenleiName");
            return (Criteria) this;
        }

        public Criteria andRefZchIsNull() {
            addCriterion("ref_zch is null");
            return (Criteria) this;
        }

        public Criteria andRefZchIsNotNull() {
            addCriterion("ref_zch is not null");
            return (Criteria) this;
        }

        public Criteria andRefZchEqualTo(String value) {
            addCriterion("ref_zch =", value, "refZch");
            return (Criteria) this;
        }

        public Criteria andRefZchNotEqualTo(String value) {
            addCriterion("ref_zch <>", value, "refZch");
            return (Criteria) this;
        }

        public Criteria andRefZchGreaterThan(String value) {
            addCriterion("ref_zch >", value, "refZch");
            return (Criteria) this;
        }

        public Criteria andRefZchGreaterThanOrEqualTo(String value) {
            addCriterion("ref_zch >=", value, "refZch");
            return (Criteria) this;
        }

        public Criteria andRefZchLessThan(String value) {
            addCriterion("ref_zch <", value, "refZch");
            return (Criteria) this;
        }

        public Criteria andRefZchLessThanOrEqualTo(String value) {
            addCriterion("ref_zch <=", value, "refZch");
            return (Criteria) this;
        }

        public Criteria andRefZchLike(String value) {
            addCriterion("ref_zch like", value, "refZch");
            return (Criteria) this;
        }

        public Criteria andRefZchNotLike(String value) {
            addCriterion("ref_zch not like", value, "refZch");
            return (Criteria) this;
        }

        public Criteria andRefZchIn(List<String> values) {
            addCriterion("ref_zch in", values, "refZch");
            return (Criteria) this;
        }

        public Criteria andRefZchNotIn(List<String> values) {
            addCriterion("ref_zch not in", values, "refZch");
            return (Criteria) this;
        }

        public Criteria andRefZchBetween(String value1, String value2) {
            addCriterion("ref_zch between", value1, value2, "refZch");
            return (Criteria) this;
        }

        public Criteria andRefZchNotBetween(String value1, String value2) {
            addCriterion("ref_zch not between", value1, value2, "refZch");
            return (Criteria) this;
        }

        public Criteria andIsGoodIsNull() {
            addCriterion("is_good is null");
            return (Criteria) this;
        }

        public Criteria andIsGoodIsNotNull() {
            addCriterion("is_good is not null");
            return (Criteria) this;
        }

        public Criteria andIsGoodEqualTo(Double value) {
            addCriterion("is_good =", value, "isGood");
            return (Criteria) this;
        }

        public Criteria andIsGoodNotEqualTo(Double value) {
            addCriterion("is_good <>", value, "isGood");
            return (Criteria) this;
        }

        public Criteria andIsGoodGreaterThan(Double value) {
            addCriterion("is_good >", value, "isGood");
            return (Criteria) this;
        }

        public Criteria andIsGoodGreaterThanOrEqualTo(Double value) {
            addCriterion("is_good >=", value, "isGood");
            return (Criteria) this;
        }

        public Criteria andIsGoodLessThan(Double value) {
            addCriterion("is_good <", value, "isGood");
            return (Criteria) this;
        }

        public Criteria andIsGoodLessThanOrEqualTo(Double value) {
            addCriterion("is_good <=", value, "isGood");
            return (Criteria) this;
        }

        public Criteria andIsGoodIn(List<Double> values) {
            addCriterion("is_good in", values, "isGood");
            return (Criteria) this;
        }

        public Criteria andIsGoodNotIn(List<Double> values) {
            addCriterion("is_good not in", values, "isGood");
            return (Criteria) this;
        }

        public Criteria andIsGoodBetween(Double value1, Double value2) {
            addCriterion("is_good between", value1, value2, "isGood");
            return (Criteria) this;
        }

        public Criteria andIsGoodNotBetween(Double value1, Double value2) {
            addCriterion("is_good not between", value1, value2, "isGood");
            return (Criteria) this;
        }

        public Criteria andPIdIsNull() {
            addCriterion("p_id is null");
            return (Criteria) this;
        }

        public Criteria andPIdIsNotNull() {
            addCriterion("p_id is not null");
            return (Criteria) this;
        }

        public Criteria andPIdEqualTo(String value) {
            addCriterion("p_id =", value, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdNotEqualTo(String value) {
            addCriterion("p_id <>", value, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdGreaterThan(String value) {
            addCriterion("p_id >", value, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdGreaterThanOrEqualTo(String value) {
            addCriterion("p_id >=", value, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdLessThan(String value) {
            addCriterion("p_id <", value, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdLessThanOrEqualTo(String value) {
            addCriterion("p_id <=", value, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdLike(String value) {
            addCriterion("p_id like", value, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdNotLike(String value) {
            addCriterion("p_id not like", value, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdIn(List<String> values) {
            addCriterion("p_id in", values, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdNotIn(List<String> values) {
            addCriterion("p_id not in", values, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdBetween(String value1, String value2) {
            addCriterion("p_id between", value1, value2, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdNotBetween(String value1, String value2) {
            addCriterion("p_id not between", value1, value2, "pId");
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