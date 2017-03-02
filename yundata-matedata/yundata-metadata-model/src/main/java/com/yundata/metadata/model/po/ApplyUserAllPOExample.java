package com.yundata.metadata.model.po;

import java.util.ArrayList;
import java.util.List;

public class ApplyUserAllPOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ApplyUserAllPOExample() {
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

        public Criteria andSqrmcZwIsNull() {
            addCriterion("sqrmc_zw is null");
            return (Criteria) this;
        }

        public Criteria andSqrmcZwIsNotNull() {
            addCriterion("sqrmc_zw is not null");
            return (Criteria) this;
        }

        public Criteria andSqrmcZwEqualTo(String value) {
            addCriterion("sqrmc_zw =", value, "sqrmcZw");
            return (Criteria) this;
        }

        public Criteria andSqrmcZwNotEqualTo(String value) {
            addCriterion("sqrmc_zw <>", value, "sqrmcZw");
            return (Criteria) this;
        }

        public Criteria andSqrmcZwGreaterThan(String value) {
            addCriterion("sqrmc_zw >", value, "sqrmcZw");
            return (Criteria) this;
        }

        public Criteria andSqrmcZwGreaterThanOrEqualTo(String value) {
            addCriterion("sqrmc_zw >=", value, "sqrmcZw");
            return (Criteria) this;
        }

        public Criteria andSqrmcZwLessThan(String value) {
            addCriterion("sqrmc_zw <", value, "sqrmcZw");
            return (Criteria) this;
        }

        public Criteria andSqrmcZwLessThanOrEqualTo(String value) {
            addCriterion("sqrmc_zw <=", value, "sqrmcZw");
            return (Criteria) this;
        }

        public Criteria andSqrmcZwLike(String value) {
            addCriterion("sqrmc_zw like", value, "sqrmcZw");
            return (Criteria) this;
        }

        public Criteria andSqrmcZwNotLike(String value) {
            addCriterion("sqrmc_zw not like", value, "sqrmcZw");
            return (Criteria) this;
        }

        public Criteria andSqrmcZwIn(List<String> values) {
            addCriterion("sqrmc_zw in", values, "sqrmcZw");
            return (Criteria) this;
        }

        public Criteria andSqrmcZwNotIn(List<String> values) {
            addCriterion("sqrmc_zw not in", values, "sqrmcZw");
            return (Criteria) this;
        }

        public Criteria andSqrmcZwBetween(String value1, String value2) {
            addCriterion("sqrmc_zw between", value1, value2, "sqrmcZw");
            return (Criteria) this;
        }

        public Criteria andSqrmcZwNotBetween(String value1, String value2) {
            addCriterion("sqrmc_zw not between", value1, value2, "sqrmcZw");
            return (Criteria) this;
        }

        public Criteria andIdCardNoIsNull() {
            addCriterion("id_card_no is null");
            return (Criteria) this;
        }

        public Criteria andIdCardNoIsNotNull() {
            addCriterion("id_card_no is not null");
            return (Criteria) this;
        }

        public Criteria andIdCardNoEqualTo(String value) {
            addCriterion("id_card_no =", value, "idCardNo");
            return (Criteria) this;
        }

        public Criteria andIdCardNoNotEqualTo(String value) {
            addCriterion("id_card_no <>", value, "idCardNo");
            return (Criteria) this;
        }

        public Criteria andIdCardNoGreaterThan(String value) {
            addCriterion("id_card_no >", value, "idCardNo");
            return (Criteria) this;
        }

        public Criteria andIdCardNoGreaterThanOrEqualTo(String value) {
            addCriterion("id_card_no >=", value, "idCardNo");
            return (Criteria) this;
        }

        public Criteria andIdCardNoLessThan(String value) {
            addCriterion("id_card_no <", value, "idCardNo");
            return (Criteria) this;
        }

        public Criteria andIdCardNoLessThanOrEqualTo(String value) {
            addCriterion("id_card_no <=", value, "idCardNo");
            return (Criteria) this;
        }

        public Criteria andIdCardNoLike(String value) {
            addCriterion("id_card_no like", value, "idCardNo");
            return (Criteria) this;
        }

        public Criteria andIdCardNoNotLike(String value) {
            addCriterion("id_card_no not like", value, "idCardNo");
            return (Criteria) this;
        }

        public Criteria andIdCardNoIn(List<String> values) {
            addCriterion("id_card_no in", values, "idCardNo");
            return (Criteria) this;
        }

        public Criteria andIdCardNoNotIn(List<String> values) {
            addCriterion("id_card_no not in", values, "idCardNo");
            return (Criteria) this;
        }

        public Criteria andIdCardNoBetween(String value1, String value2) {
            addCriterion("id_card_no between", value1, value2, "idCardNo");
            return (Criteria) this;
        }

        public Criteria andIdCardNoNotBetween(String value1, String value2) {
            addCriterion("id_card_no not between", value1, value2, "idCardNo");
            return (Criteria) this;
        }

        public Criteria andBrandCountIsNull() {
            addCriterion("brand_count is null");
            return (Criteria) this;
        }

        public Criteria andBrandCountIsNotNull() {
            addCriterion("brand_count is not null");
            return (Criteria) this;
        }

        public Criteria andBrandCountEqualTo(Double value) {
            addCriterion("brand_count =", value, "brandCount");
            return (Criteria) this;
        }

        public Criteria andBrandCountNotEqualTo(Double value) {
            addCriterion("brand_count <>", value, "brandCount");
            return (Criteria) this;
        }

        public Criteria andBrandCountGreaterThan(Double value) {
            addCriterion("brand_count >", value, "brandCount");
            return (Criteria) this;
        }

        public Criteria andBrandCountGreaterThanOrEqualTo(Double value) {
            addCriterion("brand_count >=", value, "brandCount");
            return (Criteria) this;
        }

        public Criteria andBrandCountLessThan(Double value) {
            addCriterion("brand_count <", value, "brandCount");
            return (Criteria) this;
        }

        public Criteria andBrandCountLessThanOrEqualTo(Double value) {
            addCriterion("brand_count <=", value, "brandCount");
            return (Criteria) this;
        }

        public Criteria andBrandCountIn(List<Double> values) {
            addCriterion("brand_count in", values, "brandCount");
            return (Criteria) this;
        }

        public Criteria andBrandCountNotIn(List<Double> values) {
            addCriterion("brand_count not in", values, "brandCount");
            return (Criteria) this;
        }

        public Criteria andBrandCountBetween(Double value1, Double value2) {
            addCriterion("brand_count between", value1, value2, "brandCount");
            return (Criteria) this;
        }

        public Criteria andBrandCountNotBetween(Double value1, Double value2) {
            addCriterion("brand_count not between", value1, value2, "brandCount");
            return (Criteria) this;
        }

        public Criteria andShengfenCodeIsNull() {
            addCriterion("shengfen_code is null");
            return (Criteria) this;
        }

        public Criteria andShengfenCodeIsNotNull() {
            addCriterion("shengfen_code is not null");
            return (Criteria) this;
        }

        public Criteria andShengfenCodeEqualTo(String value) {
            addCriterion("shengfen_code =", value, "shengfenCode");
            return (Criteria) this;
        }

        public Criteria andShengfenCodeNotEqualTo(String value) {
            addCriterion("shengfen_code <>", value, "shengfenCode");
            return (Criteria) this;
        }

        public Criteria andShengfenCodeGreaterThan(String value) {
            addCriterion("shengfen_code >", value, "shengfenCode");
            return (Criteria) this;
        }

        public Criteria andShengfenCodeGreaterThanOrEqualTo(String value) {
            addCriterion("shengfen_code >=", value, "shengfenCode");
            return (Criteria) this;
        }

        public Criteria andShengfenCodeLessThan(String value) {
            addCriterion("shengfen_code <", value, "shengfenCode");
            return (Criteria) this;
        }

        public Criteria andShengfenCodeLessThanOrEqualTo(String value) {
            addCriterion("shengfen_code <=", value, "shengfenCode");
            return (Criteria) this;
        }

        public Criteria andShengfenCodeLike(String value) {
            addCriterion("shengfen_code like", value, "shengfenCode");
            return (Criteria) this;
        }

        public Criteria andShengfenCodeNotLike(String value) {
            addCriterion("shengfen_code not like", value, "shengfenCode");
            return (Criteria) this;
        }

        public Criteria andShengfenCodeIn(List<String> values) {
            addCriterion("shengfen_code in", values, "shengfenCode");
            return (Criteria) this;
        }

        public Criteria andShengfenCodeNotIn(List<String> values) {
            addCriterion("shengfen_code not in", values, "shengfenCode");
            return (Criteria) this;
        }

        public Criteria andShengfenCodeBetween(String value1, String value2) {
            addCriterion("shengfen_code between", value1, value2, "shengfenCode");
            return (Criteria) this;
        }

        public Criteria andShengfenCodeNotBetween(String value1, String value2) {
            addCriterion("shengfen_code not between", value1, value2, "shengfenCode");
            return (Criteria) this;
        }

        public Criteria andFilterCharIsNull() {
            addCriterion("filter_char is null");
            return (Criteria) this;
        }

        public Criteria andFilterCharIsNotNull() {
            addCriterion("filter_char is not null");
            return (Criteria) this;
        }

        public Criteria andFilterCharEqualTo(String value) {
            addCriterion("filter_char =", value, "filterChar");
            return (Criteria) this;
        }

        public Criteria andFilterCharNotEqualTo(String value) {
            addCriterion("filter_char <>", value, "filterChar");
            return (Criteria) this;
        }

        public Criteria andFilterCharGreaterThan(String value) {
            addCriterion("filter_char >", value, "filterChar");
            return (Criteria) this;
        }

        public Criteria andFilterCharGreaterThanOrEqualTo(String value) {
            addCriterion("filter_char >=", value, "filterChar");
            return (Criteria) this;
        }

        public Criteria andFilterCharLessThan(String value) {
            addCriterion("filter_char <", value, "filterChar");
            return (Criteria) this;
        }

        public Criteria andFilterCharLessThanOrEqualTo(String value) {
            addCriterion("filter_char <=", value, "filterChar");
            return (Criteria) this;
        }

        public Criteria andFilterCharLike(String value) {
            addCriterion("filter_char like", value, "filterChar");
            return (Criteria) this;
        }

        public Criteria andFilterCharNotLike(String value) {
            addCriterion("filter_char not like", value, "filterChar");
            return (Criteria) this;
        }

        public Criteria andFilterCharIn(List<String> values) {
            addCriterion("filter_char in", values, "filterChar");
            return (Criteria) this;
        }

        public Criteria andFilterCharNotIn(List<String> values) {
            addCriterion("filter_char not in", values, "filterChar");
            return (Criteria) this;
        }

        public Criteria andFilterCharBetween(String value1, String value2) {
            addCriterion("filter_char between", value1, value2, "filterChar");
            return (Criteria) this;
        }

        public Criteria andFilterCharNotBetween(String value1, String value2) {
            addCriterion("filter_char not between", value1, value2, "filterChar");
            return (Criteria) this;
        }

        public Criteria andSqrmcZwIdCardNoIsNull() {
            addCriterion("sqrmc_zw_id_card_no is null");
            return (Criteria) this;
        }

        public Criteria andSqrmcZwIdCardNoIsNotNull() {
            addCriterion("sqrmc_zw_id_card_no is not null");
            return (Criteria) this;
        }

        public Criteria andSqrmcZwIdCardNoEqualTo(String value) {
            addCriterion("sqrmc_zw_id_card_no =", value, "sqrmcZwIdCardNo");
            return (Criteria) this;
        }

        public Criteria andSqrmcZwIdCardNoNotEqualTo(String value) {
            addCriterion("sqrmc_zw_id_card_no <>", value, "sqrmcZwIdCardNo");
            return (Criteria) this;
        }

        public Criteria andSqrmcZwIdCardNoGreaterThan(String value) {
            addCriterion("sqrmc_zw_id_card_no >", value, "sqrmcZwIdCardNo");
            return (Criteria) this;
        }

        public Criteria andSqrmcZwIdCardNoGreaterThanOrEqualTo(String value) {
            addCriterion("sqrmc_zw_id_card_no >=", value, "sqrmcZwIdCardNo");
            return (Criteria) this;
        }

        public Criteria andSqrmcZwIdCardNoLessThan(String value) {
            addCriterion("sqrmc_zw_id_card_no <", value, "sqrmcZwIdCardNo");
            return (Criteria) this;
        }

        public Criteria andSqrmcZwIdCardNoLessThanOrEqualTo(String value) {
            addCriterion("sqrmc_zw_id_card_no <=", value, "sqrmcZwIdCardNo");
            return (Criteria) this;
        }

        public Criteria andSqrmcZwIdCardNoLike(String value) {
            addCriterion("sqrmc_zw_id_card_no like", value, "sqrmcZwIdCardNo");
            return (Criteria) this;
        }

        public Criteria andSqrmcZwIdCardNoNotLike(String value) {
            addCriterion("sqrmc_zw_id_card_no not like", value, "sqrmcZwIdCardNo");
            return (Criteria) this;
        }

        public Criteria andSqrmcZwIdCardNoIn(List<String> values) {
            addCriterion("sqrmc_zw_id_card_no in", values, "sqrmcZwIdCardNo");
            return (Criteria) this;
        }

        public Criteria andSqrmcZwIdCardNoNotIn(List<String> values) {
            addCriterion("sqrmc_zw_id_card_no not in", values, "sqrmcZwIdCardNo");
            return (Criteria) this;
        }

        public Criteria andSqrmcZwIdCardNoBetween(String value1, String value2) {
            addCriterion("sqrmc_zw_id_card_no between", value1, value2, "sqrmcZwIdCardNo");
            return (Criteria) this;
        }

        public Criteria andSqrmcZwIdCardNoNotBetween(String value1, String value2) {
            addCriterion("sqrmc_zw_id_card_no not between", value1, value2, "sqrmcZwIdCardNo");
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