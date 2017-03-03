package com.yundata.metadata.model.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BrandInfoSblcitemPOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BrandInfoSblcitemPOExample() {
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

        public Criteria andSblcitemIsNull() {
            addCriterion("sblcitem is null");
            return (Criteria) this;
        }

        public Criteria andSblcitemIsNotNull() {
            addCriterion("sblcitem is not null");
            return (Criteria) this;
        }

        public Criteria andSblcitemEqualTo(String value) {
            addCriterion("sblcitem =", value, "sblcitem");
            return (Criteria) this;
        }

        public Criteria andSblcitemNotEqualTo(String value) {
            addCriterion("sblcitem <>", value, "sblcitem");
            return (Criteria) this;
        }

        public Criteria andSblcitemGreaterThan(String value) {
            addCriterion("sblcitem >", value, "sblcitem");
            return (Criteria) this;
        }

        public Criteria andSblcitemGreaterThanOrEqualTo(String value) {
            addCriterion("sblcitem >=", value, "sblcitem");
            return (Criteria) this;
        }

        public Criteria andSblcitemLessThan(String value) {
            addCriterion("sblcitem <", value, "sblcitem");
            return (Criteria) this;
        }

        public Criteria andSblcitemLessThanOrEqualTo(String value) {
            addCriterion("sblcitem <=", value, "sblcitem");
            return (Criteria) this;
        }

        public Criteria andSblcitemLike(String value) {
            addCriterion("sblcitem like", value, "sblcitem");
            return (Criteria) this;
        }

        public Criteria andSblcitemNotLike(String value) {
            addCriterion("sblcitem not like", value, "sblcitem");
            return (Criteria) this;
        }

        public Criteria andSblcitemIn(List<String> values) {
            addCriterion("sblcitem in", values, "sblcitem");
            return (Criteria) this;
        }

        public Criteria andSblcitemNotIn(List<String> values) {
            addCriterion("sblcitem not in", values, "sblcitem");
            return (Criteria) this;
        }

        public Criteria andSblcitemBetween(String value1, String value2) {
            addCriterion("sblcitem between", value1, value2, "sblcitem");
            return (Criteria) this;
        }

        public Criteria andSblcitemNotBetween(String value1, String value2) {
            addCriterion("sblcitem not between", value1, value2, "sblcitem");
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

        public Criteria andManualFlagIsNull() {
            addCriterion("manual_flag is null");
            return (Criteria) this;
        }

        public Criteria andManualFlagIsNotNull() {
            addCriterion("manual_flag is not null");
            return (Criteria) this;
        }

        public Criteria andManualFlagEqualTo(Double value) {
            addCriterion("manual_flag =", value, "manualFlag");
            return (Criteria) this;
        }

        public Criteria andManualFlagNotEqualTo(Double value) {
            addCriterion("manual_flag <>", value, "manualFlag");
            return (Criteria) this;
        }

        public Criteria andManualFlagGreaterThan(Double value) {
            addCriterion("manual_flag >", value, "manualFlag");
            return (Criteria) this;
        }

        public Criteria andManualFlagGreaterThanOrEqualTo(Double value) {
            addCriterion("manual_flag >=", value, "manualFlag");
            return (Criteria) this;
        }

        public Criteria andManualFlagLessThan(Double value) {
            addCriterion("manual_flag <", value, "manualFlag");
            return (Criteria) this;
        }

        public Criteria andManualFlagLessThanOrEqualTo(Double value) {
            addCriterion("manual_flag <=", value, "manualFlag");
            return (Criteria) this;
        }

        public Criteria andManualFlagIn(List<Double> values) {
            addCriterion("manual_flag in", values, "manualFlag");
            return (Criteria) this;
        }

        public Criteria andManualFlagNotIn(List<Double> values) {
            addCriterion("manual_flag not in", values, "manualFlag");
            return (Criteria) this;
        }

        public Criteria andManualFlagBetween(Double value1, Double value2) {
            addCriterion("manual_flag between", value1, value2, "manualFlag");
            return (Criteria) this;
        }

        public Criteria andManualFlagNotBetween(Double value1, Double value2) {
            addCriterion("manual_flag not between", value1, value2, "manualFlag");
            return (Criteria) this;
        }

        public Criteria andLastestIsNull() {
            addCriterion("lastest is null");
            return (Criteria) this;
        }

        public Criteria andLastestIsNotNull() {
            addCriterion("lastest is not null");
            return (Criteria) this;
        }

        public Criteria andLastestEqualTo(Double value) {
            addCriterion("lastest =", value, "lastest");
            return (Criteria) this;
        }

        public Criteria andLastestNotEqualTo(Double value) {
            addCriterion("lastest <>", value, "lastest");
            return (Criteria) this;
        }

        public Criteria andLastestGreaterThan(Double value) {
            addCriterion("lastest >", value, "lastest");
            return (Criteria) this;
        }

        public Criteria andLastestGreaterThanOrEqualTo(Double value) {
            addCriterion("lastest >=", value, "lastest");
            return (Criteria) this;
        }

        public Criteria andLastestLessThan(Double value) {
            addCriterion("lastest <", value, "lastest");
            return (Criteria) this;
        }

        public Criteria andLastestLessThanOrEqualTo(Double value) {
            addCriterion("lastest <=", value, "lastest");
            return (Criteria) this;
        }

        public Criteria andLastestIn(List<Double> values) {
            addCriterion("lastest in", values, "lastest");
            return (Criteria) this;
        }

        public Criteria andLastestNotIn(List<Double> values) {
            addCriterion("lastest not in", values, "lastest");
            return (Criteria) this;
        }

        public Criteria andLastestBetween(Double value1, Double value2) {
            addCriterion("lastest between", value1, value2, "lastest");
            return (Criteria) this;
        }

        public Criteria andLastestNotBetween(Double value1, Double value2) {
            addCriterion("lastest not between", value1, value2, "lastest");
            return (Criteria) this;
        }

        public Criteria andSblcdateIsNull() {
            addCriterion("sblcdate is null");
            return (Criteria) this;
        }

        public Criteria andSblcdateIsNotNull() {
            addCriterion("sblcdate is not null");
            return (Criteria) this;
        }

        public Criteria andSblcdateEqualTo(Date value) {
            addCriterion("sblcdate =", value, "sblcdate");
            return (Criteria) this;
        }

        public Criteria andSblcdateNotEqualTo(Date value) {
            addCriterion("sblcdate <>", value, "sblcdate");
            return (Criteria) this;
        }

        public Criteria andSblcdateGreaterThan(Date value) {
            addCriterion("sblcdate >", value, "sblcdate");
            return (Criteria) this;
        }

        public Criteria andSblcdateGreaterThanOrEqualTo(Date value) {
            addCriterion("sblcdate >=", value, "sblcdate");
            return (Criteria) this;
        }

        public Criteria andSblcdateLessThan(Date value) {
            addCriterion("sblcdate <", value, "sblcdate");
            return (Criteria) this;
        }

        public Criteria andSblcdateLessThanOrEqualTo(Date value) {
            addCriterion("sblcdate <=", value, "sblcdate");
            return (Criteria) this;
        }

        public Criteria andSblcdateIn(List<Date> values) {
            addCriterion("sblcdate in", values, "sblcdate");
            return (Criteria) this;
        }

        public Criteria andSblcdateNotIn(List<Date> values) {
            addCriterion("sblcdate not in", values, "sblcdate");
            return (Criteria) this;
        }

        public Criteria andSblcdateBetween(Date value1, Date value2) {
            addCriterion("sblcdate between", value1, value2, "sblcdate");
            return (Criteria) this;
        }

        public Criteria andSblcdateNotBetween(Date value1, Date value2) {
            addCriterion("sblcdate not between", value1, value2, "sblcdate");
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