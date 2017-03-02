package com.yundata.metadata.model.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SbggPOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SbggPOExample() {
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

        public Criteria andHasStaticIsNull() {
            addCriterion("has_static is null");
            return (Criteria) this;
        }

        public Criteria andHasStaticIsNotNull() {
            addCriterion("has_static is not null");
            return (Criteria) this;
        }

        public Criteria andHasStaticEqualTo(Integer value) {
            addCriterion("has_static =", value, "hasStatic");
            return (Criteria) this;
        }

        public Criteria andHasStaticNotEqualTo(Integer value) {
            addCriterion("has_static <>", value, "hasStatic");
            return (Criteria) this;
        }

        public Criteria andHasStaticGreaterThan(Integer value) {
            addCriterion("has_static >", value, "hasStatic");
            return (Criteria) this;
        }

        public Criteria andHasStaticGreaterThanOrEqualTo(Integer value) {
            addCriterion("has_static >=", value, "hasStatic");
            return (Criteria) this;
        }

        public Criteria andHasStaticLessThan(Integer value) {
            addCriterion("has_static <", value, "hasStatic");
            return (Criteria) this;
        }

        public Criteria andHasStaticLessThanOrEqualTo(Integer value) {
            addCriterion("has_static <=", value, "hasStatic");
            return (Criteria) this;
        }

        public Criteria andHasStaticIn(List<Integer> values) {
            addCriterion("has_static in", values, "hasStatic");
            return (Criteria) this;
        }

        public Criteria andHasStaticNotIn(List<Integer> values) {
            addCriterion("has_static not in", values, "hasStatic");
            return (Criteria) this;
        }

        public Criteria andHasStaticBetween(Integer value1, Integer value2) {
            addCriterion("has_static between", value1, value2, "hasStatic");
            return (Criteria) this;
        }

        public Criteria andHasStaticNotBetween(Integer value1, Integer value2) {
            addCriterion("has_static not between", value1, value2, "hasStatic");
            return (Criteria) this;
        }

        public Criteria andSbggDateIsNull() {
            addCriterion("sbgg_date is null");
            return (Criteria) this;
        }

        public Criteria andSbggDateIsNotNull() {
            addCriterion("sbgg_date is not null");
            return (Criteria) this;
        }

        public Criteria andSbggDateEqualTo(Date value) {
            addCriterion("sbgg_date =", value, "sbggDate");
            return (Criteria) this;
        }

        public Criteria andSbggDateNotEqualTo(Date value) {
            addCriterion("sbgg_date <>", value, "sbggDate");
            return (Criteria) this;
        }

        public Criteria andSbggDateGreaterThan(Date value) {
            addCriterion("sbgg_date >", value, "sbggDate");
            return (Criteria) this;
        }

        public Criteria andSbggDateGreaterThanOrEqualTo(Date value) {
            addCriterion("sbgg_date >=", value, "sbggDate");
            return (Criteria) this;
        }

        public Criteria andSbggDateLessThan(Date value) {
            addCriterion("sbgg_date <", value, "sbggDate");
            return (Criteria) this;
        }

        public Criteria andSbggDateLessThanOrEqualTo(Date value) {
            addCriterion("sbgg_date <=", value, "sbggDate");
            return (Criteria) this;
        }

        public Criteria andSbggDateIn(List<Date> values) {
            addCriterion("sbgg_date in", values, "sbggDate");
            return (Criteria) this;
        }

        public Criteria andSbggDateNotIn(List<Date> values) {
            addCriterion("sbgg_date not in", values, "sbggDate");
            return (Criteria) this;
        }

        public Criteria andSbggDateBetween(Date value1, Date value2) {
            addCriterion("sbgg_date between", value1, value2, "sbggDate");
            return (Criteria) this;
        }

        public Criteria andSbggDateNotBetween(Date value1, Date value2) {
            addCriterion("sbgg_date not between", value1, value2, "sbggDate");
            return (Criteria) this;
        }

        public Criteria andYearissueIsNull() {
            addCriterion("yearissue is null");
            return (Criteria) this;
        }

        public Criteria andYearissueIsNotNull() {
            addCriterion("yearissue is not null");
            return (Criteria) this;
        }

        public Criteria andYearissueEqualTo(Integer value) {
            addCriterion("yearissue =", value, "yearissue");
            return (Criteria) this;
        }

        public Criteria andYearissueNotEqualTo(Integer value) {
            addCriterion("yearissue <>", value, "yearissue");
            return (Criteria) this;
        }

        public Criteria andYearissueGreaterThan(Integer value) {
            addCriterion("yearissue >", value, "yearissue");
            return (Criteria) this;
        }

        public Criteria andYearissueGreaterThanOrEqualTo(Integer value) {
            addCriterion("yearissue >=", value, "yearissue");
            return (Criteria) this;
        }

        public Criteria andYearissueLessThan(Integer value) {
            addCriterion("yearissue <", value, "yearissue");
            return (Criteria) this;
        }

        public Criteria andYearissueLessThanOrEqualTo(Integer value) {
            addCriterion("yearissue <=", value, "yearissue");
            return (Criteria) this;
        }

        public Criteria andYearissueIn(List<Integer> values) {
            addCriterion("yearissue in", values, "yearissue");
            return (Criteria) this;
        }

        public Criteria andYearissueNotIn(List<Integer> values) {
            addCriterion("yearissue not in", values, "yearissue");
            return (Criteria) this;
        }

        public Criteria andYearissueBetween(Integer value1, Integer value2) {
            addCriterion("yearissue between", value1, value2, "yearissue");
            return (Criteria) this;
        }

        public Criteria andYearissueNotBetween(Integer value1, Integer value2) {
            addCriterion("yearissue not between", value1, value2, "yearissue");
            return (Criteria) this;
        }

        public Criteria andTmidIsNull() {
            addCriterion("tmid is null");
            return (Criteria) this;
        }

        public Criteria andTmidIsNotNull() {
            addCriterion("tmid is not null");
            return (Criteria) this;
        }

        public Criteria andTmidEqualTo(String value) {
            addCriterion("tmid =", value, "tmid");
            return (Criteria) this;
        }

        public Criteria andTmidNotEqualTo(String value) {
            addCriterion("tmid <>", value, "tmid");
            return (Criteria) this;
        }

        public Criteria andTmidGreaterThan(String value) {
            addCriterion("tmid >", value, "tmid");
            return (Criteria) this;
        }

        public Criteria andTmidGreaterThanOrEqualTo(String value) {
            addCriterion("tmid >=", value, "tmid");
            return (Criteria) this;
        }

        public Criteria andTmidLessThan(String value) {
            addCriterion("tmid <", value, "tmid");
            return (Criteria) this;
        }

        public Criteria andTmidLessThanOrEqualTo(String value) {
            addCriterion("tmid <=", value, "tmid");
            return (Criteria) this;
        }

        public Criteria andTmidLike(String value) {
            addCriterion("tmid like", value, "tmid");
            return (Criteria) this;
        }

        public Criteria andTmidNotLike(String value) {
            addCriterion("tmid not like", value, "tmid");
            return (Criteria) this;
        }

        public Criteria andTmidIn(List<String> values) {
            addCriterion("tmid in", values, "tmid");
            return (Criteria) this;
        }

        public Criteria andTmidNotIn(List<String> values) {
            addCriterion("tmid not in", values, "tmid");
            return (Criteria) this;
        }

        public Criteria andTmidBetween(String value1, String value2) {
            addCriterion("tmid between", value1, value2, "tmid");
            return (Criteria) this;
        }

        public Criteria andTmidNotBetween(String value1, String value2) {
            addCriterion("tmid not between", value1, value2, "tmid");
            return (Criteria) this;
        }

        public Criteria andPublishDateIsNull() {
            addCriterion("publish_date is null");
            return (Criteria) this;
        }

        public Criteria andPublishDateIsNotNull() {
            addCriterion("publish_date is not null");
            return (Criteria) this;
        }

        public Criteria andPublishDateEqualTo(Date value) {
            addCriterion("publish_date =", value, "publishDate");
            return (Criteria) this;
        }

        public Criteria andPublishDateNotEqualTo(Date value) {
            addCriterion("publish_date <>", value, "publishDate");
            return (Criteria) this;
        }

        public Criteria andPublishDateGreaterThan(Date value) {
            addCriterion("publish_date >", value, "publishDate");
            return (Criteria) this;
        }

        public Criteria andPublishDateGreaterThanOrEqualTo(Date value) {
            addCriterion("publish_date >=", value, "publishDate");
            return (Criteria) this;
        }

        public Criteria andPublishDateLessThan(Date value) {
            addCriterion("publish_date <", value, "publishDate");
            return (Criteria) this;
        }

        public Criteria andPublishDateLessThanOrEqualTo(Date value) {
            addCriterion("publish_date <=", value, "publishDate");
            return (Criteria) this;
        }

        public Criteria andPublishDateIn(List<Date> values) {
            addCriterion("publish_date in", values, "publishDate");
            return (Criteria) this;
        }

        public Criteria andPublishDateNotIn(List<Date> values) {
            addCriterion("publish_date not in", values, "publishDate");
            return (Criteria) this;
        }

        public Criteria andPublishDateBetween(Date value1, Date value2) {
            addCriterion("publish_date between", value1, value2, "publishDate");
            return (Criteria) this;
        }

        public Criteria andPublishDateNotBetween(Date value1, Date value2) {
            addCriterion("publish_date not between", value1, value2, "publishDate");
            return (Criteria) this;
        }

        public Criteria andStartDateIsNull() {
            addCriterion("start_date is null");
            return (Criteria) this;
        }

        public Criteria andStartDateIsNotNull() {
            addCriterion("start_date is not null");
            return (Criteria) this;
        }

        public Criteria andStartDateEqualTo(Date value) {
            addCriterion("start_date =", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateNotEqualTo(Date value) {
            addCriterion("start_date <>", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateGreaterThan(Date value) {
            addCriterion("start_date >", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateGreaterThanOrEqualTo(Date value) {
            addCriterion("start_date >=", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateLessThan(Date value) {
            addCriterion("start_date <", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateLessThanOrEqualTo(Date value) {
            addCriterion("start_date <=", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateIn(List<Date> values) {
            addCriterion("start_date in", values, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateNotIn(List<Date> values) {
            addCriterion("start_date not in", values, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateBetween(Date value1, Date value2) {
            addCriterion("start_date between", value1, value2, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateNotBetween(Date value1, Date value2) {
            addCriterion("start_date not between", value1, value2, "startDate");
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

        public Criteria andProgressIsNull() {
            addCriterion("progress is null");
            return (Criteria) this;
        }

        public Criteria andProgressIsNotNull() {
            addCriterion("progress is not null");
            return (Criteria) this;
        }

        public Criteria andProgressEqualTo(Integer value) {
            addCriterion("progress =", value, "progress");
            return (Criteria) this;
        }

        public Criteria andProgressNotEqualTo(Integer value) {
            addCriterion("progress <>", value, "progress");
            return (Criteria) this;
        }

        public Criteria andProgressGreaterThan(Integer value) {
            addCriterion("progress >", value, "progress");
            return (Criteria) this;
        }

        public Criteria andProgressGreaterThanOrEqualTo(Integer value) {
            addCriterion("progress >=", value, "progress");
            return (Criteria) this;
        }

        public Criteria andProgressLessThan(Integer value) {
            addCriterion("progress <", value, "progress");
            return (Criteria) this;
        }

        public Criteria andProgressLessThanOrEqualTo(Integer value) {
            addCriterion("progress <=", value, "progress");
            return (Criteria) this;
        }

        public Criteria andProgressIn(List<Integer> values) {
            addCriterion("progress in", values, "progress");
            return (Criteria) this;
        }

        public Criteria andProgressNotIn(List<Integer> values) {
            addCriterion("progress not in", values, "progress");
            return (Criteria) this;
        }

        public Criteria andProgressBetween(Integer value1, Integer value2) {
            addCriterion("progress between", value1, value2, "progress");
            return (Criteria) this;
        }

        public Criteria andProgressNotBetween(Integer value1, Integer value2) {
            addCriterion("progress not between", value1, value2, "progress");
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