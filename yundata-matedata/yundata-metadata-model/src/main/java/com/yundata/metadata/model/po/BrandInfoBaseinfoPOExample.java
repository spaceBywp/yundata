package com.yundata.metadata.model.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BrandInfoBaseinfoPOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BrandInfoBaseinfoPOExample() {
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

        public Criteria andSbwzLsIsNull() {
            addCriterion("sbwz_ls is null");
            return (Criteria) this;
        }

        public Criteria andSbwzLsIsNotNull() {
            addCriterion("sbwz_ls is not null");
            return (Criteria) this;
        }

        public Criteria andSbwzLsEqualTo(String value) {
            addCriterion("sbwz_ls =", value, "sbwzLs");
            return (Criteria) this;
        }

        public Criteria andSbwzLsNotEqualTo(String value) {
            addCriterion("sbwz_ls <>", value, "sbwzLs");
            return (Criteria) this;
        }

        public Criteria andSbwzLsGreaterThan(String value) {
            addCriterion("sbwz_ls >", value, "sbwzLs");
            return (Criteria) this;
        }

        public Criteria andSbwzLsGreaterThanOrEqualTo(String value) {
            addCriterion("sbwz_ls >=", value, "sbwzLs");
            return (Criteria) this;
        }

        public Criteria andSbwzLsLessThan(String value) {
            addCriterion("sbwz_ls <", value, "sbwzLs");
            return (Criteria) this;
        }

        public Criteria andSbwzLsLessThanOrEqualTo(String value) {
            addCriterion("sbwz_ls <=", value, "sbwzLs");
            return (Criteria) this;
        }

        public Criteria andSbwzLsLike(String value) {
            addCriterion("sbwz_ls like", value, "sbwzLs");
            return (Criteria) this;
        }

        public Criteria andSbwzLsNotLike(String value) {
            addCriterion("sbwz_ls not like", value, "sbwzLs");
            return (Criteria) this;
        }

        public Criteria andSbwzLsIn(List<String> values) {
            addCriterion("sbwz_ls in", values, "sbwzLs");
            return (Criteria) this;
        }

        public Criteria andSbwzLsNotIn(List<String> values) {
            addCriterion("sbwz_ls not in", values, "sbwzLs");
            return (Criteria) this;
        }

        public Criteria andSbwzLsBetween(String value1, String value2) {
            addCriterion("sbwz_ls between", value1, value2, "sbwzLs");
            return (Criteria) this;
        }

        public Criteria andSbwzLsNotBetween(String value1, String value2) {
            addCriterion("sbwz_ls not between", value1, value2, "sbwzLs");
            return (Criteria) this;
        }

        public Criteria andSqrqIsNull() {
            addCriterion("sqrq is null");
            return (Criteria) this;
        }

        public Criteria andSqrqIsNotNull() {
            addCriterion("sqrq is not null");
            return (Criteria) this;
        }

        public Criteria andSqrqEqualTo(Date value) {
            addCriterion("sqrq =", value, "sqrq");
            return (Criteria) this;
        }

        public Criteria andSqrqNotEqualTo(Date value) {
            addCriterion("sqrq <>", value, "sqrq");
            return (Criteria) this;
        }

        public Criteria andSqrqGreaterThan(Date value) {
            addCriterion("sqrq >", value, "sqrq");
            return (Criteria) this;
        }

        public Criteria andSqrqGreaterThanOrEqualTo(Date value) {
            addCriterion("sqrq >=", value, "sqrq");
            return (Criteria) this;
        }

        public Criteria andSqrqLessThan(Date value) {
            addCriterion("sqrq <", value, "sqrq");
            return (Criteria) this;
        }

        public Criteria andSqrqLessThanOrEqualTo(Date value) {
            addCriterion("sqrq <=", value, "sqrq");
            return (Criteria) this;
        }

        public Criteria andSqrqIn(List<Date> values) {
            addCriterion("sqrq in", values, "sqrq");
            return (Criteria) this;
        }

        public Criteria andSqrqNotIn(List<Date> values) {
            addCriterion("sqrq not in", values, "sqrq");
            return (Criteria) this;
        }

        public Criteria andSqrqBetween(Date value1, Date value2) {
            addCriterion("sqrq between", value1, value2, "sqrq");
            return (Criteria) this;
        }

        public Criteria andSqrqNotBetween(Date value1, Date value2) {
            addCriterion("sqrq not between", value1, value2, "sqrq");
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

        public Criteria andNeedAttentionIsNull() {
            addCriterion("need_attention is null");
            return (Criteria) this;
        }

        public Criteria andNeedAttentionIsNotNull() {
            addCriterion("need_attention is not null");
            return (Criteria) this;
        }

        public Criteria andNeedAttentionEqualTo(Double value) {
            addCriterion("need_attention =", value, "needAttention");
            return (Criteria) this;
        }

        public Criteria andNeedAttentionNotEqualTo(Double value) {
            addCriterion("need_attention <>", value, "needAttention");
            return (Criteria) this;
        }

        public Criteria andNeedAttentionGreaterThan(Double value) {
            addCriterion("need_attention >", value, "needAttention");
            return (Criteria) this;
        }

        public Criteria andNeedAttentionGreaterThanOrEqualTo(Double value) {
            addCriterion("need_attention >=", value, "needAttention");
            return (Criteria) this;
        }

        public Criteria andNeedAttentionLessThan(Double value) {
            addCriterion("need_attention <", value, "needAttention");
            return (Criteria) this;
        }

        public Criteria andNeedAttentionLessThanOrEqualTo(Double value) {
            addCriterion("need_attention <=", value, "needAttention");
            return (Criteria) this;
        }

        public Criteria andNeedAttentionIn(List<Double> values) {
            addCriterion("need_attention in", values, "needAttention");
            return (Criteria) this;
        }

        public Criteria andNeedAttentionNotIn(List<Double> values) {
            addCriterion("need_attention not in", values, "needAttention");
            return (Criteria) this;
        }

        public Criteria andNeedAttentionBetween(Double value1, Double value2) {
            addCriterion("need_attention between", value1, value2, "needAttention");
            return (Criteria) this;
        }

        public Criteria andNeedAttentionNotBetween(Double value1, Double value2) {
            addCriterion("need_attention not between", value1, value2, "needAttention");
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

        public Criteria andSourcetypeIsNull() {
            addCriterion("sourcetype is null");
            return (Criteria) this;
        }

        public Criteria andSourcetypeIsNotNull() {
            addCriterion("sourcetype is not null");
            return (Criteria) this;
        }

        public Criteria andSourcetypeEqualTo(Double value) {
            addCriterion("sourcetype =", value, "sourcetype");
            return (Criteria) this;
        }

        public Criteria andSourcetypeNotEqualTo(Double value) {
            addCriterion("sourcetype <>", value, "sourcetype");
            return (Criteria) this;
        }

        public Criteria andSourcetypeGreaterThan(Double value) {
            addCriterion("sourcetype >", value, "sourcetype");
            return (Criteria) this;
        }

        public Criteria andSourcetypeGreaterThanOrEqualTo(Double value) {
            addCriterion("sourcetype >=", value, "sourcetype");
            return (Criteria) this;
        }

        public Criteria andSourcetypeLessThan(Double value) {
            addCriterion("sourcetype <", value, "sourcetype");
            return (Criteria) this;
        }

        public Criteria andSourcetypeLessThanOrEqualTo(Double value) {
            addCriterion("sourcetype <=", value, "sourcetype");
            return (Criteria) this;
        }

        public Criteria andSourcetypeIn(List<Double> values) {
            addCriterion("sourcetype in", values, "sourcetype");
            return (Criteria) this;
        }

        public Criteria andSourcetypeNotIn(List<Double> values) {
            addCriterion("sourcetype not in", values, "sourcetype");
            return (Criteria) this;
        }

        public Criteria andSourcetypeBetween(Double value1, Double value2) {
            addCriterion("sourcetype between", value1, value2, "sourcetype");
            return (Criteria) this;
        }

        public Criteria andSourcetypeNotBetween(Double value1, Double value2) {
            addCriterion("sourcetype not between", value1, value2, "sourcetype");
            return (Criteria) this;
        }

        public Criteria andBlindperiodIsNull() {
            addCriterion("blindperiod is null");
            return (Criteria) this;
        }

        public Criteria andBlindperiodIsNotNull() {
            addCriterion("blindperiod is not null");
            return (Criteria) this;
        }

        public Criteria andBlindperiodEqualTo(Double value) {
            addCriterion("blindperiod =", value, "blindperiod");
            return (Criteria) this;
        }

        public Criteria andBlindperiodNotEqualTo(Double value) {
            addCriterion("blindperiod <>", value, "blindperiod");
            return (Criteria) this;
        }

        public Criteria andBlindperiodGreaterThan(Double value) {
            addCriterion("blindperiod >", value, "blindperiod");
            return (Criteria) this;
        }

        public Criteria andBlindperiodGreaterThanOrEqualTo(Double value) {
            addCriterion("blindperiod >=", value, "blindperiod");
            return (Criteria) this;
        }

        public Criteria andBlindperiodLessThan(Double value) {
            addCriterion("blindperiod <", value, "blindperiod");
            return (Criteria) this;
        }

        public Criteria andBlindperiodLessThanOrEqualTo(Double value) {
            addCriterion("blindperiod <=", value, "blindperiod");
            return (Criteria) this;
        }

        public Criteria andBlindperiodIn(List<Double> values) {
            addCriterion("blindperiod in", values, "blindperiod");
            return (Criteria) this;
        }

        public Criteria andBlindperiodNotIn(List<Double> values) {
            addCriterion("blindperiod not in", values, "blindperiod");
            return (Criteria) this;
        }

        public Criteria andBlindperiodBetween(Double value1, Double value2) {
            addCriterion("blindperiod between", value1, value2, "blindperiod");
            return (Criteria) this;
        }

        public Criteria andBlindperiodNotBetween(Double value1, Double value2) {
            addCriterion("blindperiod not between", value1, value2, "blindperiod");
            return (Criteria) this;
        }

        public Criteria andTagsIsNull() {
            addCriterion("tags is null");
            return (Criteria) this;
        }

        public Criteria andTagsIsNotNull() {
            addCriterion("tags is not null");
            return (Criteria) this;
        }

        public Criteria andTagsEqualTo(String value) {
            addCriterion("tags =", value, "tags");
            return (Criteria) this;
        }

        public Criteria andTagsNotEqualTo(String value) {
            addCriterion("tags <>", value, "tags");
            return (Criteria) this;
        }

        public Criteria andTagsGreaterThan(String value) {
            addCriterion("tags >", value, "tags");
            return (Criteria) this;
        }

        public Criteria andTagsGreaterThanOrEqualTo(String value) {
            addCriterion("tags >=", value, "tags");
            return (Criteria) this;
        }

        public Criteria andTagsLessThan(String value) {
            addCriterion("tags <", value, "tags");
            return (Criteria) this;
        }

        public Criteria andTagsLessThanOrEqualTo(String value) {
            addCriterion("tags <=", value, "tags");
            return (Criteria) this;
        }

        public Criteria andTagsLike(String value) {
            addCriterion("tags like", value, "tags");
            return (Criteria) this;
        }

        public Criteria andTagsNotLike(String value) {
            addCriterion("tags not like", value, "tags");
            return (Criteria) this;
        }

        public Criteria andTagsIn(List<String> values) {
            addCriterion("tags in", values, "tags");
            return (Criteria) this;
        }

        public Criteria andTagsNotIn(List<String> values) {
            addCriterion("tags not in", values, "tags");
            return (Criteria) this;
        }

        public Criteria andTagsBetween(String value1, String value2) {
            addCriterion("tags between", value1, value2, "tags");
            return (Criteria) this;
        }

        public Criteria andTagsNotBetween(String value1, String value2) {
            addCriterion("tags not between", value1, value2, "tags");
            return (Criteria) this;
        }

        public Criteria andZchNumberIsNull() {
            addCriterion("zch_number is null");
            return (Criteria) this;
        }

        public Criteria andZchNumberIsNotNull() {
            addCriterion("zch_number is not null");
            return (Criteria) this;
        }

        public Criteria andZchNumberEqualTo(String value) {
            addCriterion("zch_number =", value, "zchNumber");
            return (Criteria) this;
        }

        public Criteria andZchNumberNotEqualTo(String value) {
            addCriterion("zch_number <>", value, "zchNumber");
            return (Criteria) this;
        }

        public Criteria andZchNumberGreaterThan(String value) {
            addCriterion("zch_number >", value, "zchNumber");
            return (Criteria) this;
        }

        public Criteria andZchNumberGreaterThanOrEqualTo(String value) {
            addCriterion("zch_number >=", value, "zchNumber");
            return (Criteria) this;
        }

        public Criteria andZchNumberLessThan(String value) {
            addCriterion("zch_number <", value, "zchNumber");
            return (Criteria) this;
        }

        public Criteria andZchNumberLessThanOrEqualTo(String value) {
            addCriterion("zch_number <=", value, "zchNumber");
            return (Criteria) this;
        }

        public Criteria andZchNumberLike(String value) {
            addCriterion("zch_number like", value, "zchNumber");
            return (Criteria) this;
        }

        public Criteria andZchNumberNotLike(String value) {
            addCriterion("zch_number not like", value, "zchNumber");
            return (Criteria) this;
        }

        public Criteria andZchNumberIn(List<String> values) {
            addCriterion("zch_number in", values, "zchNumber");
            return (Criteria) this;
        }

        public Criteria andZchNumberNotIn(List<String> values) {
            addCriterion("zch_number not in", values, "zchNumber");
            return (Criteria) this;
        }

        public Criteria andZchNumberBetween(String value1, String value2) {
            addCriterion("zch_number between", value1, value2, "zchNumber");
            return (Criteria) this;
        }

        public Criteria andZchNumberNotBetween(String value1, String value2) {
            addCriterion("zch_number not between", value1, value2, "zchNumber");
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