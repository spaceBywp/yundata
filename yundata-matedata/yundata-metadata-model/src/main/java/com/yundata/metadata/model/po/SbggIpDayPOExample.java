package com.yundata.metadata.model.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SbggIpDayPOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SbggIpDayPOExample() {
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

        public Criteria andIpIsNull() {
            addCriterion("ip is null");
            return (Criteria) this;
        }

        public Criteria andIpIsNotNull() {
            addCriterion("ip is not null");
            return (Criteria) this;
        }

        public Criteria andIpEqualTo(String value) {
            addCriterion("ip =", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotEqualTo(String value) {
            addCriterion("ip <>", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpGreaterThan(String value) {
            addCriterion("ip >", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpGreaterThanOrEqualTo(String value) {
            addCriterion("ip >=", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpLessThan(String value) {
            addCriterion("ip <", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpLessThanOrEqualTo(String value) {
            addCriterion("ip <=", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpLike(String value) {
            addCriterion("ip like", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotLike(String value) {
            addCriterion("ip not like", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpIn(List<String> values) {
            addCriterion("ip in", values, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotIn(List<String> values) {
            addCriterion("ip not in", values, "ip");
            return (Criteria) this;
        }

        public Criteria andIpBetween(String value1, String value2) {
            addCriterion("ip between", value1, value2, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotBetween(String value1, String value2) {
            addCriterion("ip not between", value1, value2, "ip");
            return (Criteria) this;
        }

        public Criteria andLoginCodeIsNull() {
            addCriterion("login_code is null");
            return (Criteria) this;
        }

        public Criteria andLoginCodeIsNotNull() {
            addCriterion("login_code is not null");
            return (Criteria) this;
        }

        public Criteria andLoginCodeEqualTo(String value) {
            addCriterion("login_code =", value, "loginCode");
            return (Criteria) this;
        }

        public Criteria andLoginCodeNotEqualTo(String value) {
            addCriterion("login_code <>", value, "loginCode");
            return (Criteria) this;
        }

        public Criteria andLoginCodeGreaterThan(String value) {
            addCriterion("login_code >", value, "loginCode");
            return (Criteria) this;
        }

        public Criteria andLoginCodeGreaterThanOrEqualTo(String value) {
            addCriterion("login_code >=", value, "loginCode");
            return (Criteria) this;
        }

        public Criteria andLoginCodeLessThan(String value) {
            addCriterion("login_code <", value, "loginCode");
            return (Criteria) this;
        }

        public Criteria andLoginCodeLessThanOrEqualTo(String value) {
            addCriterion("login_code <=", value, "loginCode");
            return (Criteria) this;
        }

        public Criteria andLoginCodeLike(String value) {
            addCriterion("login_code like", value, "loginCode");
            return (Criteria) this;
        }

        public Criteria andLoginCodeNotLike(String value) {
            addCriterion("login_code not like", value, "loginCode");
            return (Criteria) this;
        }

        public Criteria andLoginCodeIn(List<String> values) {
            addCriterion("login_code in", values, "loginCode");
            return (Criteria) this;
        }

        public Criteria andLoginCodeNotIn(List<String> values) {
            addCriterion("login_code not in", values, "loginCode");
            return (Criteria) this;
        }

        public Criteria andLoginCodeBetween(String value1, String value2) {
            addCriterion("login_code between", value1, value2, "loginCode");
            return (Criteria) this;
        }

        public Criteria andLoginCodeNotBetween(String value1, String value2) {
            addCriterion("login_code not between", value1, value2, "loginCode");
            return (Criteria) this;
        }

        public Criteria andSearchDateIsNull() {
            addCriterion("search_date is null");
            return (Criteria) this;
        }

        public Criteria andSearchDateIsNotNull() {
            addCriterion("search_date is not null");
            return (Criteria) this;
        }

        public Criteria andSearchDateEqualTo(Date value) {
            addCriterion("search_date =", value, "searchDate");
            return (Criteria) this;
        }

        public Criteria andSearchDateNotEqualTo(Date value) {
            addCriterion("search_date <>", value, "searchDate");
            return (Criteria) this;
        }

        public Criteria andSearchDateGreaterThan(Date value) {
            addCriterion("search_date >", value, "searchDate");
            return (Criteria) this;
        }

        public Criteria andSearchDateGreaterThanOrEqualTo(Date value) {
            addCriterion("search_date >=", value, "searchDate");
            return (Criteria) this;
        }

        public Criteria andSearchDateLessThan(Date value) {
            addCriterion("search_date <", value, "searchDate");
            return (Criteria) this;
        }

        public Criteria andSearchDateLessThanOrEqualTo(Date value) {
            addCriterion("search_date <=", value, "searchDate");
            return (Criteria) this;
        }

        public Criteria andSearchDateIn(List<Date> values) {
            addCriterion("search_date in", values, "searchDate");
            return (Criteria) this;
        }

        public Criteria andSearchDateNotIn(List<Date> values) {
            addCriterion("search_date not in", values, "searchDate");
            return (Criteria) this;
        }

        public Criteria andSearchDateBetween(Date value1, Date value2) {
            addCriterion("search_date between", value1, value2, "searchDate");
            return (Criteria) this;
        }

        public Criteria andSearchDateNotBetween(Date value1, Date value2) {
            addCriterion("search_date not between", value1, value2, "searchDate");
            return (Criteria) this;
        }

        public Criteria andLookCountIsNull() {
            addCriterion("look_count is null");
            return (Criteria) this;
        }

        public Criteria andLookCountIsNotNull() {
            addCriterion("look_count is not null");
            return (Criteria) this;
        }

        public Criteria andLookCountEqualTo(Integer value) {
            addCriterion("look_count =", value, "lookCount");
            return (Criteria) this;
        }

        public Criteria andLookCountNotEqualTo(Integer value) {
            addCriterion("look_count <>", value, "lookCount");
            return (Criteria) this;
        }

        public Criteria andLookCountGreaterThan(Integer value) {
            addCriterion("look_count >", value, "lookCount");
            return (Criteria) this;
        }

        public Criteria andLookCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("look_count >=", value, "lookCount");
            return (Criteria) this;
        }

        public Criteria andLookCountLessThan(Integer value) {
            addCriterion("look_count <", value, "lookCount");
            return (Criteria) this;
        }

        public Criteria andLookCountLessThanOrEqualTo(Integer value) {
            addCriterion("look_count <=", value, "lookCount");
            return (Criteria) this;
        }

        public Criteria andLookCountIn(List<Integer> values) {
            addCriterion("look_count in", values, "lookCount");
            return (Criteria) this;
        }

        public Criteria andLookCountNotIn(List<Integer> values) {
            addCriterion("look_count not in", values, "lookCount");
            return (Criteria) this;
        }

        public Criteria andLookCountBetween(Integer value1, Integer value2) {
            addCriterion("look_count between", value1, value2, "lookCount");
            return (Criteria) this;
        }

        public Criteria andLookCountNotBetween(Integer value1, Integer value2) {
            addCriterion("look_count not between", value1, value2, "lookCount");
            return (Criteria) this;
        }

        public Criteria andSearchCountIsNull() {
            addCriterion("search_count is null");
            return (Criteria) this;
        }

        public Criteria andSearchCountIsNotNull() {
            addCriterion("search_count is not null");
            return (Criteria) this;
        }

        public Criteria andSearchCountEqualTo(Integer value) {
            addCriterion("search_count =", value, "searchCount");
            return (Criteria) this;
        }

        public Criteria andSearchCountNotEqualTo(Integer value) {
            addCriterion("search_count <>", value, "searchCount");
            return (Criteria) this;
        }

        public Criteria andSearchCountGreaterThan(Integer value) {
            addCriterion("search_count >", value, "searchCount");
            return (Criteria) this;
        }

        public Criteria andSearchCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("search_count >=", value, "searchCount");
            return (Criteria) this;
        }

        public Criteria andSearchCountLessThan(Integer value) {
            addCriterion("search_count <", value, "searchCount");
            return (Criteria) this;
        }

        public Criteria andSearchCountLessThanOrEqualTo(Integer value) {
            addCriterion("search_count <=", value, "searchCount");
            return (Criteria) this;
        }

        public Criteria andSearchCountIn(List<Integer> values) {
            addCriterion("search_count in", values, "searchCount");
            return (Criteria) this;
        }

        public Criteria andSearchCountNotIn(List<Integer> values) {
            addCriterion("search_count not in", values, "searchCount");
            return (Criteria) this;
        }

        public Criteria andSearchCountBetween(Integer value1, Integer value2) {
            addCriterion("search_count between", value1, value2, "searchCount");
            return (Criteria) this;
        }

        public Criteria andSearchCountNotBetween(Integer value1, Integer value2) {
            addCriterion("search_count not between", value1, value2, "searchCount");
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