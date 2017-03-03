package com.yundata.metadata.model.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BrandInfoStatusinfoPOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BrandInfoStatusinfoPOExample() {
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

        public Criteria andZchIsNull() {
            addCriterion("zch is null");
            return (Criteria) this;
        }

        public Criteria andZchIsNotNull() {
            addCriterion("zch is not null");
            return (Criteria) this;
        }

        public Criteria andZchEqualTo(String value) {
            addCriterion("zch =", value, "zch");
            return (Criteria) this;
        }

        public Criteria andZchNotEqualTo(String value) {
            addCriterion("zch <>", value, "zch");
            return (Criteria) this;
        }

        public Criteria andZchGreaterThan(String value) {
            addCriterion("zch >", value, "zch");
            return (Criteria) this;
        }

        public Criteria andZchGreaterThanOrEqualTo(String value) {
            addCriterion("zch >=", value, "zch");
            return (Criteria) this;
        }

        public Criteria andZchLessThan(String value) {
            addCriterion("zch <", value, "zch");
            return (Criteria) this;
        }

        public Criteria andZchLessThanOrEqualTo(String value) {
            addCriterion("zch <=", value, "zch");
            return (Criteria) this;
        }

        public Criteria andZchLike(String value) {
            addCriterion("zch like", value, "zch");
            return (Criteria) this;
        }

        public Criteria andZchNotLike(String value) {
            addCriterion("zch not like", value, "zch");
            return (Criteria) this;
        }

        public Criteria andZchIn(List<String> values) {
            addCriterion("zch in", values, "zch");
            return (Criteria) this;
        }

        public Criteria andZchNotIn(List<String> values) {
            addCriterion("zch not in", values, "zch");
            return (Criteria) this;
        }

        public Criteria andZchBetween(String value1, String value2) {
            addCriterion("zch between", value1, value2, "zch");
            return (Criteria) this;
        }

        public Criteria andZchNotBetween(String value1, String value2) {
            addCriterion("zch not between", value1, value2, "zch");
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

        public Criteria andNewProcessDateIsNull() {
            addCriterion("new_process_date is null");
            return (Criteria) this;
        }

        public Criteria andNewProcessDateIsNotNull() {
            addCriterion("new_process_date is not null");
            return (Criteria) this;
        }

        public Criteria andNewProcessDateEqualTo(Date value) {
            addCriterion("new_process_date =", value, "newProcessDate");
            return (Criteria) this;
        }

        public Criteria andNewProcessDateNotEqualTo(Date value) {
            addCriterion("new_process_date <>", value, "newProcessDate");
            return (Criteria) this;
        }

        public Criteria andNewProcessDateGreaterThan(Date value) {
            addCriterion("new_process_date >", value, "newProcessDate");
            return (Criteria) this;
        }

        public Criteria andNewProcessDateGreaterThanOrEqualTo(Date value) {
            addCriterion("new_process_date >=", value, "newProcessDate");
            return (Criteria) this;
        }

        public Criteria andNewProcessDateLessThan(Date value) {
            addCriterion("new_process_date <", value, "newProcessDate");
            return (Criteria) this;
        }

        public Criteria andNewProcessDateLessThanOrEqualTo(Date value) {
            addCriterion("new_process_date <=", value, "newProcessDate");
            return (Criteria) this;
        }

        public Criteria andNewProcessDateIn(List<Date> values) {
            addCriterion("new_process_date in", values, "newProcessDate");
            return (Criteria) this;
        }

        public Criteria andNewProcessDateNotIn(List<Date> values) {
            addCriterion("new_process_date not in", values, "newProcessDate");
            return (Criteria) this;
        }

        public Criteria andNewProcessDateBetween(Date value1, Date value2) {
            addCriterion("new_process_date between", value1, value2, "newProcessDate");
            return (Criteria) this;
        }

        public Criteria andNewProcessDateNotBetween(Date value1, Date value2) {
            addCriterion("new_process_date not between", value1, value2, "newProcessDate");
            return (Criteria) this;
        }

        public Criteria andLastsblcitemIsNull() {
            addCriterion("lastsblcitem is null");
            return (Criteria) this;
        }

        public Criteria andLastsblcitemIsNotNull() {
            addCriterion("lastsblcitem is not null");
            return (Criteria) this;
        }

        public Criteria andLastsblcitemEqualTo(String value) {
            addCriterion("lastsblcitem =", value, "lastsblcitem");
            return (Criteria) this;
        }

        public Criteria andLastsblcitemNotEqualTo(String value) {
            addCriterion("lastsblcitem <>", value, "lastsblcitem");
            return (Criteria) this;
        }

        public Criteria andLastsblcitemGreaterThan(String value) {
            addCriterion("lastsblcitem >", value, "lastsblcitem");
            return (Criteria) this;
        }

        public Criteria andLastsblcitemGreaterThanOrEqualTo(String value) {
            addCriterion("lastsblcitem >=", value, "lastsblcitem");
            return (Criteria) this;
        }

        public Criteria andLastsblcitemLessThan(String value) {
            addCriterion("lastsblcitem <", value, "lastsblcitem");
            return (Criteria) this;
        }

        public Criteria andLastsblcitemLessThanOrEqualTo(String value) {
            addCriterion("lastsblcitem <=", value, "lastsblcitem");
            return (Criteria) this;
        }

        public Criteria andLastsblcitemLike(String value) {
            addCriterion("lastsblcitem like", value, "lastsblcitem");
            return (Criteria) this;
        }

        public Criteria andLastsblcitemNotLike(String value) {
            addCriterion("lastsblcitem not like", value, "lastsblcitem");
            return (Criteria) this;
        }

        public Criteria andLastsblcitemIn(List<String> values) {
            addCriterion("lastsblcitem in", values, "lastsblcitem");
            return (Criteria) this;
        }

        public Criteria andLastsblcitemNotIn(List<String> values) {
            addCriterion("lastsblcitem not in", values, "lastsblcitem");
            return (Criteria) this;
        }

        public Criteria andLastsblcitemBetween(String value1, String value2) {
            addCriterion("lastsblcitem between", value1, value2, "lastsblcitem");
            return (Criteria) this;
        }

        public Criteria andLastsblcitemNotBetween(String value1, String value2) {
            addCriterion("lastsblcitem not between", value1, value2, "lastsblcitem");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Double value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Double value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Double value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Double value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Double value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Double value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Double> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Double> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Double value1, Double value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Double value1, Double value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateIsNull() {
            addCriterion("last_update_date is null");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateIsNotNull() {
            addCriterion("last_update_date is not null");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateEqualTo(Date value) {
            addCriterion("last_update_date =", value, "lastUpdateDate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateNotEqualTo(Date value) {
            addCriterion("last_update_date <>", value, "lastUpdateDate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateGreaterThan(Date value) {
            addCriterion("last_update_date >", value, "lastUpdateDate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("last_update_date >=", value, "lastUpdateDate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateLessThan(Date value) {
            addCriterion("last_update_date <", value, "lastUpdateDate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateLessThanOrEqualTo(Date value) {
            addCriterion("last_update_date <=", value, "lastUpdateDate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateIn(List<Date> values) {
            addCriterion("last_update_date in", values, "lastUpdateDate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateNotIn(List<Date> values) {
            addCriterion("last_update_date not in", values, "lastUpdateDate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateBetween(Date value1, Date value2) {
            addCriterion("last_update_date between", value1, value2, "lastUpdateDate");
            return (Criteria) this;
        }

        public Criteria andLastUpdateDateNotBetween(Date value1, Date value2) {
            addCriterion("last_update_date not between", value1, value2, "lastUpdateDate");
            return (Criteria) this;
        }

        public Criteria andProgressIsNull() {
            addCriterion("progress is null");
            return (Criteria) this;
        }

        public Criteria andProgressIsNotNull() {
            addCriterion("progress is not null");
            return (Criteria) this;
        }

        public Criteria andProgressEqualTo(Double value) {
            addCriterion("progress =", value, "progress");
            return (Criteria) this;
        }

        public Criteria andProgressNotEqualTo(Double value) {
            addCriterion("progress <>", value, "progress");
            return (Criteria) this;
        }

        public Criteria andProgressGreaterThan(Double value) {
            addCriterion("progress >", value, "progress");
            return (Criteria) this;
        }

        public Criteria andProgressGreaterThanOrEqualTo(Double value) {
            addCriterion("progress >=", value, "progress");
            return (Criteria) this;
        }

        public Criteria andProgressLessThan(Double value) {
            addCriterion("progress <", value, "progress");
            return (Criteria) this;
        }

        public Criteria andProgressLessThanOrEqualTo(Double value) {
            addCriterion("progress <=", value, "progress");
            return (Criteria) this;
        }

        public Criteria andProgressIn(List<Double> values) {
            addCriterion("progress in", values, "progress");
            return (Criteria) this;
        }

        public Criteria andProgressNotIn(List<Double> values) {
            addCriterion("progress not in", values, "progress");
            return (Criteria) this;
        }

        public Criteria andProgressBetween(Double value1, Double value2) {
            addCriterion("progress between", value1, value2, "progress");
            return (Criteria) this;
        }

        public Criteria andProgressNotBetween(Double value1, Double value2) {
            addCriterion("progress not between", value1, value2, "progress");
            return (Criteria) this;
        }

        public Criteria andNewProcessIsNull() {
            addCriterion("new_process is null");
            return (Criteria) this;
        }

        public Criteria andNewProcessIsNotNull() {
            addCriterion("new_process is not null");
            return (Criteria) this;
        }

        public Criteria andNewProcessEqualTo(String value) {
            addCriterion("new_process =", value, "newProcess");
            return (Criteria) this;
        }

        public Criteria andNewProcessNotEqualTo(String value) {
            addCriterion("new_process <>", value, "newProcess");
            return (Criteria) this;
        }

        public Criteria andNewProcessGreaterThan(String value) {
            addCriterion("new_process >", value, "newProcess");
            return (Criteria) this;
        }

        public Criteria andNewProcessGreaterThanOrEqualTo(String value) {
            addCriterion("new_process >=", value, "newProcess");
            return (Criteria) this;
        }

        public Criteria andNewProcessLessThan(String value) {
            addCriterion("new_process <", value, "newProcess");
            return (Criteria) this;
        }

        public Criteria andNewProcessLessThanOrEqualTo(String value) {
            addCriterion("new_process <=", value, "newProcess");
            return (Criteria) this;
        }

        public Criteria andNewProcessLike(String value) {
            addCriterion("new_process like", value, "newProcess");
            return (Criteria) this;
        }

        public Criteria andNewProcessNotLike(String value) {
            addCriterion("new_process not like", value, "newProcess");
            return (Criteria) this;
        }

        public Criteria andNewProcessIn(List<String> values) {
            addCriterion("new_process in", values, "newProcess");
            return (Criteria) this;
        }

        public Criteria andNewProcessNotIn(List<String> values) {
            addCriterion("new_process not in", values, "newProcess");
            return (Criteria) this;
        }

        public Criteria andNewProcessBetween(String value1, String value2) {
            addCriterion("new_process between", value1, value2, "newProcess");
            return (Criteria) this;
        }

        public Criteria andNewProcessNotBetween(String value1, String value2) {
            addCriterion("new_process not between", value1, value2, "newProcess");
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