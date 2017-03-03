package com.yundata.metadata.model.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BrandInfoOtherinfoPOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BrandInfoOtherinfoPOExample() {
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

        public Criteria andSfgysbIsNull() {
            addCriterion("sfgysb is null");
            return (Criteria) this;
        }

        public Criteria andSfgysbIsNotNull() {
            addCriterion("sfgysb is not null");
            return (Criteria) this;
        }

        public Criteria andSfgysbEqualTo(String value) {
            addCriterion("sfgysb =", value, "sfgysb");
            return (Criteria) this;
        }

        public Criteria andSfgysbNotEqualTo(String value) {
            addCriterion("sfgysb <>", value, "sfgysb");
            return (Criteria) this;
        }

        public Criteria andSfgysbGreaterThan(String value) {
            addCriterion("sfgysb >", value, "sfgysb");
            return (Criteria) this;
        }

        public Criteria andSfgysbGreaterThanOrEqualTo(String value) {
            addCriterion("sfgysb >=", value, "sfgysb");
            return (Criteria) this;
        }

        public Criteria andSfgysbLessThan(String value) {
            addCriterion("sfgysb <", value, "sfgysb");
            return (Criteria) this;
        }

        public Criteria andSfgysbLessThanOrEqualTo(String value) {
            addCriterion("sfgysb <=", value, "sfgysb");
            return (Criteria) this;
        }

        public Criteria andSfgysbLike(String value) {
            addCriterion("sfgysb like", value, "sfgysb");
            return (Criteria) this;
        }

        public Criteria andSfgysbNotLike(String value) {
            addCriterion("sfgysb not like", value, "sfgysb");
            return (Criteria) this;
        }

        public Criteria andSfgysbIn(List<String> values) {
            addCriterion("sfgysb in", values, "sfgysb");
            return (Criteria) this;
        }

        public Criteria andSfgysbNotIn(List<String> values) {
            addCriterion("sfgysb not in", values, "sfgysb");
            return (Criteria) this;
        }

        public Criteria andSfgysbBetween(String value1, String value2) {
            addCriterion("sfgysb between", value1, value2, "sfgysb");
            return (Criteria) this;
        }

        public Criteria andSfgysbNotBetween(String value1, String value2) {
            addCriterion("sfgysb not between", value1, value2, "sfgysb");
            return (Criteria) this;
        }

        public Criteria andSblxIsNull() {
            addCriterion("sblx is null");
            return (Criteria) this;
        }

        public Criteria andSblxIsNotNull() {
            addCriterion("sblx is not null");
            return (Criteria) this;
        }

        public Criteria andSblxEqualTo(String value) {
            addCriterion("sblx =", value, "sblx");
            return (Criteria) this;
        }

        public Criteria andSblxNotEqualTo(String value) {
            addCriterion("sblx <>", value, "sblx");
            return (Criteria) this;
        }

        public Criteria andSblxGreaterThan(String value) {
            addCriterion("sblx >", value, "sblx");
            return (Criteria) this;
        }

        public Criteria andSblxGreaterThanOrEqualTo(String value) {
            addCriterion("sblx >=", value, "sblx");
            return (Criteria) this;
        }

        public Criteria andSblxLessThan(String value) {
            addCriterion("sblx <", value, "sblx");
            return (Criteria) this;
        }

        public Criteria andSblxLessThanOrEqualTo(String value) {
            addCriterion("sblx <=", value, "sblx");
            return (Criteria) this;
        }

        public Criteria andSblxLike(String value) {
            addCriterion("sblx like", value, "sblx");
            return (Criteria) this;
        }

        public Criteria andSblxNotLike(String value) {
            addCriterion("sblx not like", value, "sblx");
            return (Criteria) this;
        }

        public Criteria andSblxIn(List<String> values) {
            addCriterion("sblx in", values, "sblx");
            return (Criteria) this;
        }

        public Criteria andSblxNotIn(List<String> values) {
            addCriterion("sblx not in", values, "sblx");
            return (Criteria) this;
        }

        public Criteria andSblxBetween(String value1, String value2) {
            addCriterion("sblx between", value1, value2, "sblx");
            return (Criteria) this;
        }

        public Criteria andSblxNotBetween(String value1, String value2) {
            addCriterion("sblx not between", value1, value2, "sblx");
            return (Criteria) this;
        }

        public Criteria andColorgroupIsNull() {
            addCriterion("colorgroup is null");
            return (Criteria) this;
        }

        public Criteria andColorgroupIsNotNull() {
            addCriterion("colorgroup is not null");
            return (Criteria) this;
        }

        public Criteria andColorgroupEqualTo(Double value) {
            addCriterion("colorgroup =", value, "colorgroup");
            return (Criteria) this;
        }

        public Criteria andColorgroupNotEqualTo(Double value) {
            addCriterion("colorgroup <>", value, "colorgroup");
            return (Criteria) this;
        }

        public Criteria andColorgroupGreaterThan(Double value) {
            addCriterion("colorgroup >", value, "colorgroup");
            return (Criteria) this;
        }

        public Criteria andColorgroupGreaterThanOrEqualTo(Double value) {
            addCriterion("colorgroup >=", value, "colorgroup");
            return (Criteria) this;
        }

        public Criteria andColorgroupLessThan(Double value) {
            addCriterion("colorgroup <", value, "colorgroup");
            return (Criteria) this;
        }

        public Criteria andColorgroupLessThanOrEqualTo(Double value) {
            addCriterion("colorgroup <=", value, "colorgroup");
            return (Criteria) this;
        }

        public Criteria andColorgroupIn(List<Double> values) {
            addCriterion("colorgroup in", values, "colorgroup");
            return (Criteria) this;
        }

        public Criteria andColorgroupNotIn(List<Double> values) {
            addCriterion("colorgroup not in", values, "colorgroup");
            return (Criteria) this;
        }

        public Criteria andColorgroupBetween(Double value1, Double value2) {
            addCriterion("colorgroup between", value1, value2, "colorgroup");
            return (Criteria) this;
        }

        public Criteria andColorgroupNotBetween(Double value1, Double value2) {
            addCriterion("colorgroup not between", value1, value2, "colorgroup");
            return (Criteria) this;
        }

        public Criteria andHqzdrqIsNull() {
            addCriterion("hqzdrq is null");
            return (Criteria) this;
        }

        public Criteria andHqzdrqIsNotNull() {
            addCriterion("hqzdrq is not null");
            return (Criteria) this;
        }

        public Criteria andHqzdrqEqualTo(Date value) {
            addCriterion("hqzdrq =", value, "hqzdrq");
            return (Criteria) this;
        }

        public Criteria andHqzdrqNotEqualTo(Date value) {
            addCriterion("hqzdrq <>", value, "hqzdrq");
            return (Criteria) this;
        }

        public Criteria andHqzdrqGreaterThan(Date value) {
            addCriterion("hqzdrq >", value, "hqzdrq");
            return (Criteria) this;
        }

        public Criteria andHqzdrqGreaterThanOrEqualTo(Date value) {
            addCriterion("hqzdrq >=", value, "hqzdrq");
            return (Criteria) this;
        }

        public Criteria andHqzdrqLessThan(Date value) {
            addCriterion("hqzdrq <", value, "hqzdrq");
            return (Criteria) this;
        }

        public Criteria andHqzdrqLessThanOrEqualTo(Date value) {
            addCriterion("hqzdrq <=", value, "hqzdrq");
            return (Criteria) this;
        }

        public Criteria andHqzdrqIn(List<Date> values) {
            addCriterion("hqzdrq in", values, "hqzdrq");
            return (Criteria) this;
        }

        public Criteria andHqzdrqNotIn(List<Date> values) {
            addCriterion("hqzdrq not in", values, "hqzdrq");
            return (Criteria) this;
        }

        public Criteria andHqzdrqBetween(Date value1, Date value2) {
            addCriterion("hqzdrq between", value1, value2, "hqzdrq");
            return (Criteria) this;
        }

        public Criteria andHqzdrqNotBetween(Date value1, Date value2) {
            addCriterion("hqzdrq not between", value1, value2, "hqzdrq");
            return (Criteria) this;
        }

        public Criteria andGjzcrqIsNull() {
            addCriterion("gjzcrq is null");
            return (Criteria) this;
        }

        public Criteria andGjzcrqIsNotNull() {
            addCriterion("gjzcrq is not null");
            return (Criteria) this;
        }

        public Criteria andGjzcrqEqualTo(Date value) {
            addCriterion("gjzcrq =", value, "gjzcrq");
            return (Criteria) this;
        }

        public Criteria andGjzcrqNotEqualTo(Date value) {
            addCriterion("gjzcrq <>", value, "gjzcrq");
            return (Criteria) this;
        }

        public Criteria andGjzcrqGreaterThan(Date value) {
            addCriterion("gjzcrq >", value, "gjzcrq");
            return (Criteria) this;
        }

        public Criteria andGjzcrqGreaterThanOrEqualTo(Date value) {
            addCriterion("gjzcrq >=", value, "gjzcrq");
            return (Criteria) this;
        }

        public Criteria andGjzcrqLessThan(Date value) {
            addCriterion("gjzcrq <", value, "gjzcrq");
            return (Criteria) this;
        }

        public Criteria andGjzcrqLessThanOrEqualTo(Date value) {
            addCriterion("gjzcrq <=", value, "gjzcrq");
            return (Criteria) this;
        }

        public Criteria andGjzcrqIn(List<Date> values) {
            addCriterion("gjzcrq in", values, "gjzcrq");
            return (Criteria) this;
        }

        public Criteria andGjzcrqNotIn(List<Date> values) {
            addCriterion("gjzcrq not in", values, "gjzcrq");
            return (Criteria) this;
        }

        public Criteria andGjzcrqBetween(Date value1, Date value2) {
            addCriterion("gjzcrq between", value1, value2, "gjzcrq");
            return (Criteria) this;
        }

        public Criteria andGjzcrqNotBetween(Date value1, Date value2) {
            addCriterion("gjzcrq not between", value1, value2, "gjzcrq");
            return (Criteria) this;
        }

        public Criteria andYxqrqIsNull() {
            addCriterion("yxqrq is null");
            return (Criteria) this;
        }

        public Criteria andYxqrqIsNotNull() {
            addCriterion("yxqrq is not null");
            return (Criteria) this;
        }

        public Criteria andYxqrqEqualTo(Date value) {
            addCriterion("yxqrq =", value, "yxqrq");
            return (Criteria) this;
        }

        public Criteria andYxqrqNotEqualTo(Date value) {
            addCriterion("yxqrq <>", value, "yxqrq");
            return (Criteria) this;
        }

        public Criteria andYxqrqGreaterThan(Date value) {
            addCriterion("yxqrq >", value, "yxqrq");
            return (Criteria) this;
        }

        public Criteria andYxqrqGreaterThanOrEqualTo(Date value) {
            addCriterion("yxqrq >=", value, "yxqrq");
            return (Criteria) this;
        }

        public Criteria andYxqrqLessThan(Date value) {
            addCriterion("yxqrq <", value, "yxqrq");
            return (Criteria) this;
        }

        public Criteria andYxqrqLessThanOrEqualTo(Date value) {
            addCriterion("yxqrq <=", value, "yxqrq");
            return (Criteria) this;
        }

        public Criteria andYxqrqIn(List<Date> values) {
            addCriterion("yxqrq in", values, "yxqrq");
            return (Criteria) this;
        }

        public Criteria andYxqrqNotIn(List<Date> values) {
            addCriterion("yxqrq not in", values, "yxqrq");
            return (Criteria) this;
        }

        public Criteria andYxqrqBetween(Date value1, Date value2) {
            addCriterion("yxqrq between", value1, value2, "yxqrq");
            return (Criteria) this;
        }

        public Criteria andYxqrqNotBetween(Date value1, Date value2) {
            addCriterion("yxqrq not between", value1, value2, "yxqrq");
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