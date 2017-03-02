package com.yundata.metadata.model.po;

import java.util.ArrayList;
import java.util.List;

public class SbggRankingStatisticsPOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SbggRankingStatisticsPOExample() {
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

        public Criteria andDlrmcIsNull() {
            addCriterion("dlrmc is null");
            return (Criteria) this;
        }

        public Criteria andDlrmcIsNotNull() {
            addCriterion("dlrmc is not null");
            return (Criteria) this;
        }

        public Criteria andDlrmcEqualTo(String value) {
            addCriterion("dlrmc =", value, "dlrmc");
            return (Criteria) this;
        }

        public Criteria andDlrmcNotEqualTo(String value) {
            addCriterion("dlrmc <>", value, "dlrmc");
            return (Criteria) this;
        }

        public Criteria andDlrmcGreaterThan(String value) {
            addCriterion("dlrmc >", value, "dlrmc");
            return (Criteria) this;
        }

        public Criteria andDlrmcGreaterThanOrEqualTo(String value) {
            addCriterion("dlrmc >=", value, "dlrmc");
            return (Criteria) this;
        }

        public Criteria andDlrmcLessThan(String value) {
            addCriterion("dlrmc <", value, "dlrmc");
            return (Criteria) this;
        }

        public Criteria andDlrmcLessThanOrEqualTo(String value) {
            addCriterion("dlrmc <=", value, "dlrmc");
            return (Criteria) this;
        }

        public Criteria andDlrmcLike(String value) {
            addCriterion("dlrmc like", value, "dlrmc");
            return (Criteria) this;
        }

        public Criteria andDlrmcNotLike(String value) {
            addCriterion("dlrmc not like", value, "dlrmc");
            return (Criteria) this;
        }

        public Criteria andDlrmcIn(List<String> values) {
            addCriterion("dlrmc in", values, "dlrmc");
            return (Criteria) this;
        }

        public Criteria andDlrmcNotIn(List<String> values) {
            addCriterion("dlrmc not in", values, "dlrmc");
            return (Criteria) this;
        }

        public Criteria andDlrmcBetween(String value1, String value2) {
            addCriterion("dlrmc between", value1, value2, "dlrmc");
            return (Criteria) this;
        }

        public Criteria andDlrmcNotBetween(String value1, String value2) {
            addCriterion("dlrmc not between", value1, value2, "dlrmc");
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

        public Criteria andCityIsNull() {
            addCriterion("city is null");
            return (Criteria) this;
        }

        public Criteria andCityIsNotNull() {
            addCriterion("city is not null");
            return (Criteria) this;
        }

        public Criteria andCityEqualTo(String value) {
            addCriterion("city =", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotEqualTo(String value) {
            addCriterion("city <>", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThan(String value) {
            addCriterion("city >", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThanOrEqualTo(String value) {
            addCriterion("city >=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThan(String value) {
            addCriterion("city <", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThanOrEqualTo(String value) {
            addCriterion("city <=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLike(String value) {
            addCriterion("city like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotLike(String value) {
            addCriterion("city not like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityIn(List<String> values) {
            addCriterion("city in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotIn(List<String> values) {
            addCriterion("city not in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityBetween(String value1, String value2) {
            addCriterion("city between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotBetween(String value1, String value2) {
            addCriterion("city not between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andChushenCountIsNull() {
            addCriterion("chushen_count is null");
            return (Criteria) this;
        }

        public Criteria andChushenCountIsNotNull() {
            addCriterion("chushen_count is not null");
            return (Criteria) this;
        }

        public Criteria andChushenCountEqualTo(Integer value) {
            addCriterion("chushen_count =", value, "chushenCount");
            return (Criteria) this;
        }

        public Criteria andChushenCountNotEqualTo(Integer value) {
            addCriterion("chushen_count <>", value, "chushenCount");
            return (Criteria) this;
        }

        public Criteria andChushenCountGreaterThan(Integer value) {
            addCriterion("chushen_count >", value, "chushenCount");
            return (Criteria) this;
        }

        public Criteria andChushenCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("chushen_count >=", value, "chushenCount");
            return (Criteria) this;
        }

        public Criteria andChushenCountLessThan(Integer value) {
            addCriterion("chushen_count <", value, "chushenCount");
            return (Criteria) this;
        }

        public Criteria andChushenCountLessThanOrEqualTo(Integer value) {
            addCriterion("chushen_count <=", value, "chushenCount");
            return (Criteria) this;
        }

        public Criteria andChushenCountIn(List<Integer> values) {
            addCriterion("chushen_count in", values, "chushenCount");
            return (Criteria) this;
        }

        public Criteria andChushenCountNotIn(List<Integer> values) {
            addCriterion("chushen_count not in", values, "chushenCount");
            return (Criteria) this;
        }

        public Criteria andChushenCountBetween(Integer value1, Integer value2) {
            addCriterion("chushen_count between", value1, value2, "chushenCount");
            return (Criteria) this;
        }

        public Criteria andChushenCountNotBetween(Integer value1, Integer value2) {
            addCriterion("chushen_count not between", value1, value2, "chushenCount");
            return (Criteria) this;
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

        public Criteria andWeiciIsNull() {
            addCriterion("weici is null");
            return (Criteria) this;
        }

        public Criteria andWeiciIsNotNull() {
            addCriterion("weici is not null");
            return (Criteria) this;
        }

        public Criteria andWeiciEqualTo(Integer value) {
            addCriterion("weici =", value, "weici");
            return (Criteria) this;
        }

        public Criteria andWeiciNotEqualTo(Integer value) {
            addCriterion("weici <>", value, "weici");
            return (Criteria) this;
        }

        public Criteria andWeiciGreaterThan(Integer value) {
            addCriterion("weici >", value, "weici");
            return (Criteria) this;
        }

        public Criteria andWeiciGreaterThanOrEqualTo(Integer value) {
            addCriterion("weici >=", value, "weici");
            return (Criteria) this;
        }

        public Criteria andWeiciLessThan(Integer value) {
            addCriterion("weici <", value, "weici");
            return (Criteria) this;
        }

        public Criteria andWeiciLessThanOrEqualTo(Integer value) {
            addCriterion("weici <=", value, "weici");
            return (Criteria) this;
        }

        public Criteria andWeiciIn(List<Integer> values) {
            addCriterion("weici in", values, "weici");
            return (Criteria) this;
        }

        public Criteria andWeiciNotIn(List<Integer> values) {
            addCriterion("weici not in", values, "weici");
            return (Criteria) this;
        }

        public Criteria andWeiciBetween(Integer value1, Integer value2) {
            addCriterion("weici between", value1, value2, "weici");
            return (Criteria) this;
        }

        public Criteria andWeiciNotBetween(Integer value1, Integer value2) {
            addCriterion("weici not between", value1, value2, "weici");
            return (Criteria) this;
        }

        public Criteria andSimpleNameIsNull() {
            addCriterion("simple_name is null");
            return (Criteria) this;
        }

        public Criteria andSimpleNameIsNotNull() {
            addCriterion("simple_name is not null");
            return (Criteria) this;
        }

        public Criteria andSimpleNameEqualTo(String value) {
            addCriterion("simple_name =", value, "simpleName");
            return (Criteria) this;
        }

        public Criteria andSimpleNameNotEqualTo(String value) {
            addCriterion("simple_name <>", value, "simpleName");
            return (Criteria) this;
        }

        public Criteria andSimpleNameGreaterThan(String value) {
            addCriterion("simple_name >", value, "simpleName");
            return (Criteria) this;
        }

        public Criteria andSimpleNameGreaterThanOrEqualTo(String value) {
            addCriterion("simple_name >=", value, "simpleName");
            return (Criteria) this;
        }

        public Criteria andSimpleNameLessThan(String value) {
            addCriterion("simple_name <", value, "simpleName");
            return (Criteria) this;
        }

        public Criteria andSimpleNameLessThanOrEqualTo(String value) {
            addCriterion("simple_name <=", value, "simpleName");
            return (Criteria) this;
        }

        public Criteria andSimpleNameLike(String value) {
            addCriterion("simple_name like", value, "simpleName");
            return (Criteria) this;
        }

        public Criteria andSimpleNameNotLike(String value) {
            addCriterion("simple_name not like", value, "simpleName");
            return (Criteria) this;
        }

        public Criteria andSimpleNameIn(List<String> values) {
            addCriterion("simple_name in", values, "simpleName");
            return (Criteria) this;
        }

        public Criteria andSimpleNameNotIn(List<String> values) {
            addCriterion("simple_name not in", values, "simpleName");
            return (Criteria) this;
        }

        public Criteria andSimpleNameBetween(String value1, String value2) {
            addCriterion("simple_name between", value1, value2, "simpleName");
            return (Criteria) this;
        }

        public Criteria andSimpleNameNotBetween(String value1, String value2) {
            addCriterion("simple_name not between", value1, value2, "simpleName");
            return (Criteria) this;
        }

        public Criteria andLastWeiciIsNull() {
            addCriterion("last_weici is null");
            return (Criteria) this;
        }

        public Criteria andLastWeiciIsNotNull() {
            addCriterion("last_weici is not null");
            return (Criteria) this;
        }

        public Criteria andLastWeiciEqualTo(Integer value) {
            addCriterion("last_weici =", value, "lastWeici");
            return (Criteria) this;
        }

        public Criteria andLastWeiciNotEqualTo(Integer value) {
            addCriterion("last_weici <>", value, "lastWeici");
            return (Criteria) this;
        }

        public Criteria andLastWeiciGreaterThan(Integer value) {
            addCriterion("last_weici >", value, "lastWeici");
            return (Criteria) this;
        }

        public Criteria andLastWeiciGreaterThanOrEqualTo(Integer value) {
            addCriterion("last_weici >=", value, "lastWeici");
            return (Criteria) this;
        }

        public Criteria andLastWeiciLessThan(Integer value) {
            addCriterion("last_weici <", value, "lastWeici");
            return (Criteria) this;
        }

        public Criteria andLastWeiciLessThanOrEqualTo(Integer value) {
            addCriterion("last_weici <=", value, "lastWeici");
            return (Criteria) this;
        }

        public Criteria andLastWeiciIn(List<Integer> values) {
            addCriterion("last_weici in", values, "lastWeici");
            return (Criteria) this;
        }

        public Criteria andLastWeiciNotIn(List<Integer> values) {
            addCriterion("last_weici not in", values, "lastWeici");
            return (Criteria) this;
        }

        public Criteria andLastWeiciBetween(Integer value1, Integer value2) {
            addCriterion("last_weici between", value1, value2, "lastWeici");
            return (Criteria) this;
        }

        public Criteria andLastWeiciNotBetween(Integer value1, Integer value2) {
            addCriterion("last_weici not between", value1, value2, "lastWeici");
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