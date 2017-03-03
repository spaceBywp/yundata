package com.yundata.metadata.model.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class SbztMonitorManagerPOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SbztMonitorManagerPOExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andSbztIdIsNull() {
            addCriterion("sbzt_id is null");
            return (Criteria) this;
        }

        public Criteria andSbztIdIsNotNull() {
            addCriterion("sbzt_id is not null");
            return (Criteria) this;
        }

        public Criteria andSbztIdEqualTo(String value) {
            addCriterion("sbzt_id =", value, "sbztId");
            return (Criteria) this;
        }

        public Criteria andSbztIdNotEqualTo(String value) {
            addCriterion("sbzt_id <>", value, "sbztId");
            return (Criteria) this;
        }

        public Criteria andSbztIdGreaterThan(String value) {
            addCriterion("sbzt_id >", value, "sbztId");
            return (Criteria) this;
        }

        public Criteria andSbztIdGreaterThanOrEqualTo(String value) {
            addCriterion("sbzt_id >=", value, "sbztId");
            return (Criteria) this;
        }

        public Criteria andSbztIdLessThan(String value) {
            addCriterion("sbzt_id <", value, "sbztId");
            return (Criteria) this;
        }

        public Criteria andSbztIdLessThanOrEqualTo(String value) {
            addCriterion("sbzt_id <=", value, "sbztId");
            return (Criteria) this;
        }

        public Criteria andSbztIdLike(String value) {
            addCriterion("sbzt_id like", value, "sbztId");
            return (Criteria) this;
        }

        public Criteria andSbztIdNotLike(String value) {
            addCriterion("sbzt_id not like", value, "sbztId");
            return (Criteria) this;
        }

        public Criteria andSbztIdIn(List<String> values) {
            addCriterion("sbzt_id in", values, "sbztId");
            return (Criteria) this;
        }

        public Criteria andSbztIdNotIn(List<String> values) {
            addCriterion("sbzt_id not in", values, "sbztId");
            return (Criteria) this;
        }

        public Criteria andSbztIdBetween(String value1, String value2) {
            addCriterion("sbzt_id between", value1, value2, "sbztId");
            return (Criteria) this;
        }

        public Criteria andSbztIdNotBetween(String value1, String value2) {
            addCriterion("sbzt_id not between", value1, value2, "sbztId");
            return (Criteria) this;
        }

        public Criteria andBrandNameIsNull() {
            addCriterion("brand_name is null");
            return (Criteria) this;
        }

        public Criteria andBrandNameIsNotNull() {
            addCriterion("brand_name is not null");
            return (Criteria) this;
        }

        public Criteria andBrandNameEqualTo(String value) {
            addCriterion("brand_name =", value, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameNotEqualTo(String value) {
            addCriterion("brand_name <>", value, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameGreaterThan(String value) {
            addCriterion("brand_name >", value, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameGreaterThanOrEqualTo(String value) {
            addCriterion("brand_name >=", value, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameLessThan(String value) {
            addCriterion("brand_name <", value, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameLessThanOrEqualTo(String value) {
            addCriterion("brand_name <=", value, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameLike(String value) {
            addCriterion("brand_name like", value, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameNotLike(String value) {
            addCriterion("brand_name not like", value, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameIn(List<String> values) {
            addCriterion("brand_name in", values, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameNotIn(List<String> values) {
            addCriterion("brand_name not in", values, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameBetween(String value1, String value2) {
            addCriterion("brand_name between", value1, value2, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameNotBetween(String value1, String value2) {
            addCriterion("brand_name not between", value1, value2, "brandName");
            return (Criteria) this;
        }

        public Criteria andRegistNumIsNull() {
            addCriterion("regist_num is null");
            return (Criteria) this;
        }

        public Criteria andRegistNumIsNotNull() {
            addCriterion("regist_num is not null");
            return (Criteria) this;
        }

        public Criteria andRegistNumEqualTo(String value) {
            addCriterion("regist_num =", value, "registNum");
            return (Criteria) this;
        }

        public Criteria andRegistNumNotEqualTo(String value) {
            addCriterion("regist_num <>", value, "registNum");
            return (Criteria) this;
        }

        public Criteria andRegistNumGreaterThan(String value) {
            addCriterion("regist_num >", value, "registNum");
            return (Criteria) this;
        }

        public Criteria andRegistNumGreaterThanOrEqualTo(String value) {
            addCriterion("regist_num >=", value, "registNum");
            return (Criteria) this;
        }

        public Criteria andRegistNumLessThan(String value) {
            addCriterion("regist_num <", value, "registNum");
            return (Criteria) this;
        }

        public Criteria andRegistNumLessThanOrEqualTo(String value) {
            addCriterion("regist_num <=", value, "registNum");
            return (Criteria) this;
        }

        public Criteria andRegistNumLike(String value) {
            addCriterion("regist_num like", value, "registNum");
            return (Criteria) this;
        }

        public Criteria andRegistNumNotLike(String value) {
            addCriterion("regist_num not like", value, "registNum");
            return (Criteria) this;
        }

        public Criteria andRegistNumIn(List<String> values) {
            addCriterion("regist_num in", values, "registNum");
            return (Criteria) this;
        }

        public Criteria andRegistNumNotIn(List<String> values) {
            addCriterion("regist_num not in", values, "registNum");
            return (Criteria) this;
        }

        public Criteria andRegistNumBetween(String value1, String value2) {
            addCriterion("regist_num between", value1, value2, "registNum");
            return (Criteria) this;
        }

        public Criteria andRegistNumNotBetween(String value1, String value2) {
            addCriterion("regist_num not between", value1, value2, "registNum");
            return (Criteria) this;
        }

        public Criteria andBrandTypeIsNull() {
            addCriterion("brand_type is null");
            return (Criteria) this;
        }

        public Criteria andBrandTypeIsNotNull() {
            addCriterion("brand_type is not null");
            return (Criteria) this;
        }

        public Criteria andBrandTypeEqualTo(String value) {
            addCriterion("brand_type =", value, "brandType");
            return (Criteria) this;
        }

        public Criteria andBrandTypeNotEqualTo(String value) {
            addCriterion("brand_type <>", value, "brandType");
            return (Criteria) this;
        }

        public Criteria andBrandTypeGreaterThan(String value) {
            addCriterion("brand_type >", value, "brandType");
            return (Criteria) this;
        }

        public Criteria andBrandTypeGreaterThanOrEqualTo(String value) {
            addCriterion("brand_type >=", value, "brandType");
            return (Criteria) this;
        }

        public Criteria andBrandTypeLessThan(String value) {
            addCriterion("brand_type <", value, "brandType");
            return (Criteria) this;
        }

        public Criteria andBrandTypeLessThanOrEqualTo(String value) {
            addCriterion("brand_type <=", value, "brandType");
            return (Criteria) this;
        }

        public Criteria andBrandTypeLike(String value) {
            addCriterion("brand_type like", value, "brandType");
            return (Criteria) this;
        }

        public Criteria andBrandTypeNotLike(String value) {
            addCriterion("brand_type not like", value, "brandType");
            return (Criteria) this;
        }

        public Criteria andBrandTypeIn(List<String> values) {
            addCriterion("brand_type in", values, "brandType");
            return (Criteria) this;
        }

        public Criteria andBrandTypeNotIn(List<String> values) {
            addCriterion("brand_type not in", values, "brandType");
            return (Criteria) this;
        }

        public Criteria andBrandTypeBetween(String value1, String value2) {
            addCriterion("brand_type between", value1, value2, "brandType");
            return (Criteria) this;
        }

        public Criteria andBrandTypeNotBetween(String value1, String value2) {
            addCriterion("brand_type not between", value1, value2, "brandType");
            return (Criteria) this;
        }

        public Criteria andBrandGroupIsNull() {
            addCriterion("brand_group is null");
            return (Criteria) this;
        }

        public Criteria andBrandGroupIsNotNull() {
            addCriterion("brand_group is not null");
            return (Criteria) this;
        }

        public Criteria andBrandGroupEqualTo(String value) {
            addCriterion("brand_group =", value, "brandGroup");
            return (Criteria) this;
        }

        public Criteria andBrandGroupNotEqualTo(String value) {
            addCriterion("brand_group <>", value, "brandGroup");
            return (Criteria) this;
        }

        public Criteria andBrandGroupGreaterThan(String value) {
            addCriterion("brand_group >", value, "brandGroup");
            return (Criteria) this;
        }

        public Criteria andBrandGroupGreaterThanOrEqualTo(String value) {
            addCriterion("brand_group >=", value, "brandGroup");
            return (Criteria) this;
        }

        public Criteria andBrandGroupLessThan(String value) {
            addCriterion("brand_group <", value, "brandGroup");
            return (Criteria) this;
        }

        public Criteria andBrandGroupLessThanOrEqualTo(String value) {
            addCriterion("brand_group <=", value, "brandGroup");
            return (Criteria) this;
        }

        public Criteria andBrandGroupLike(String value) {
            addCriterion("brand_group like", value, "brandGroup");
            return (Criteria) this;
        }

        public Criteria andBrandGroupNotLike(String value) {
            addCriterion("brand_group not like", value, "brandGroup");
            return (Criteria) this;
        }

        public Criteria andBrandGroupIn(List<String> values) {
            addCriterion("brand_group in", values, "brandGroup");
            return (Criteria) this;
        }

        public Criteria andBrandGroupNotIn(List<String> values) {
            addCriterion("brand_group not in", values, "brandGroup");
            return (Criteria) this;
        }

        public Criteria andBrandGroupBetween(String value1, String value2) {
            addCriterion("brand_group between", value1, value2, "brandGroup");
            return (Criteria) this;
        }

        public Criteria andBrandGroupNotBetween(String value1, String value2) {
            addCriterion("brand_group not between", value1, value2, "brandGroup");
            return (Criteria) this;
        }

        public Criteria andApplyDateIsNull() {
            addCriterion("apply_date is null");
            return (Criteria) this;
        }

        public Criteria andApplyDateIsNotNull() {
            addCriterion("apply_date is not null");
            return (Criteria) this;
        }

        public Criteria andApplyDateEqualTo(Date value) {
            addCriterionForJDBCDate("apply_date =", value, "applyDate");
            return (Criteria) this;
        }

        public Criteria andApplyDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("apply_date <>", value, "applyDate");
            return (Criteria) this;
        }

        public Criteria andApplyDateGreaterThan(Date value) {
            addCriterionForJDBCDate("apply_date >", value, "applyDate");
            return (Criteria) this;
        }

        public Criteria andApplyDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("apply_date >=", value, "applyDate");
            return (Criteria) this;
        }

        public Criteria andApplyDateLessThan(Date value) {
            addCriterionForJDBCDate("apply_date <", value, "applyDate");
            return (Criteria) this;
        }

        public Criteria andApplyDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("apply_date <=", value, "applyDate");
            return (Criteria) this;
        }

        public Criteria andApplyDateIn(List<Date> values) {
            addCriterionForJDBCDate("apply_date in", values, "applyDate");
            return (Criteria) this;
        }

        public Criteria andApplyDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("apply_date not in", values, "applyDate");
            return (Criteria) this;
        }

        public Criteria andApplyDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("apply_date between", value1, value2, "applyDate");
            return (Criteria) this;
        }

        public Criteria andApplyDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("apply_date not between", value1, value2, "applyDate");
            return (Criteria) this;
        }

        public Criteria andRegistrantNameIsNull() {
            addCriterion("registrant_name is null");
            return (Criteria) this;
        }

        public Criteria andRegistrantNameIsNotNull() {
            addCriterion("registrant_name is not null");
            return (Criteria) this;
        }

        public Criteria andRegistrantNameEqualTo(String value) {
            addCriterion("registrant_name =", value, "registrantName");
            return (Criteria) this;
        }

        public Criteria andRegistrantNameNotEqualTo(String value) {
            addCriterion("registrant_name <>", value, "registrantName");
            return (Criteria) this;
        }

        public Criteria andRegistrantNameGreaterThan(String value) {
            addCriterion("registrant_name >", value, "registrantName");
            return (Criteria) this;
        }

        public Criteria andRegistrantNameGreaterThanOrEqualTo(String value) {
            addCriterion("registrant_name >=", value, "registrantName");
            return (Criteria) this;
        }

        public Criteria andRegistrantNameLessThan(String value) {
            addCriterion("registrant_name <", value, "registrantName");
            return (Criteria) this;
        }

        public Criteria andRegistrantNameLessThanOrEqualTo(String value) {
            addCriterion("registrant_name <=", value, "registrantName");
            return (Criteria) this;
        }

        public Criteria andRegistrantNameLike(String value) {
            addCriterion("registrant_name like", value, "registrantName");
            return (Criteria) this;
        }

        public Criteria andRegistrantNameNotLike(String value) {
            addCriterion("registrant_name not like", value, "registrantName");
            return (Criteria) this;
        }

        public Criteria andRegistrantNameIn(List<String> values) {
            addCriterion("registrant_name in", values, "registrantName");
            return (Criteria) this;
        }

        public Criteria andRegistrantNameNotIn(List<String> values) {
            addCriterion("registrant_name not in", values, "registrantName");
            return (Criteria) this;
        }

        public Criteria andRegistrantNameBetween(String value1, String value2) {
            addCriterion("registrant_name between", value1, value2, "registrantName");
            return (Criteria) this;
        }

        public Criteria andRegistrantNameNotBetween(String value1, String value2) {
            addCriterion("registrant_name not between", value1, value2, "registrantName");
            return (Criteria) this;
        }

        public Criteria andRegistrantNameIdCardIsNull() {
            addCriterion("registrant_name_id_card is null");
            return (Criteria) this;
        }

        public Criteria andRegistrantNameIdCardIsNotNull() {
            addCriterion("registrant_name_id_card is not null");
            return (Criteria) this;
        }

        public Criteria andRegistrantNameIdCardEqualTo(String value) {
            addCriterion("registrant_name_id_card =", value, "registrantNameIdCard");
            return (Criteria) this;
        }

        public Criteria andRegistrantNameIdCardNotEqualTo(String value) {
            addCriterion("registrant_name_id_card <>", value, "registrantNameIdCard");
            return (Criteria) this;
        }

        public Criteria andRegistrantNameIdCardGreaterThan(String value) {
            addCriterion("registrant_name_id_card >", value, "registrantNameIdCard");
            return (Criteria) this;
        }

        public Criteria andRegistrantNameIdCardGreaterThanOrEqualTo(String value) {
            addCriterion("registrant_name_id_card >=", value, "registrantNameIdCard");
            return (Criteria) this;
        }

        public Criteria andRegistrantNameIdCardLessThan(String value) {
            addCriterion("registrant_name_id_card <", value, "registrantNameIdCard");
            return (Criteria) this;
        }

        public Criteria andRegistrantNameIdCardLessThanOrEqualTo(String value) {
            addCriterion("registrant_name_id_card <=", value, "registrantNameIdCard");
            return (Criteria) this;
        }

        public Criteria andRegistrantNameIdCardLike(String value) {
            addCriterion("registrant_name_id_card like", value, "registrantNameIdCard");
            return (Criteria) this;
        }

        public Criteria andRegistrantNameIdCardNotLike(String value) {
            addCriterion("registrant_name_id_card not like", value, "registrantNameIdCard");
            return (Criteria) this;
        }

        public Criteria andRegistrantNameIdCardIn(List<String> values) {
            addCriterion("registrant_name_id_card in", values, "registrantNameIdCard");
            return (Criteria) this;
        }

        public Criteria andRegistrantNameIdCardNotIn(List<String> values) {
            addCriterion("registrant_name_id_card not in", values, "registrantNameIdCard");
            return (Criteria) this;
        }

        public Criteria andRegistrantNameIdCardBetween(String value1, String value2) {
            addCriterion("registrant_name_id_card between", value1, value2, "registrantNameIdCard");
            return (Criteria) this;
        }

        public Criteria andRegistrantNameIdCardNotBetween(String value1, String value2) {
            addCriterion("registrant_name_id_card not between", value1, value2, "registrantNameIdCard");
            return (Criteria) this;
        }

        public Criteria andApplyIdIsNull() {
            addCriterion("apply_id is null");
            return (Criteria) this;
        }

        public Criteria andApplyIdIsNotNull() {
            addCriterion("apply_id is not null");
            return (Criteria) this;
        }

        public Criteria andApplyIdEqualTo(String value) {
            addCriterion("apply_id =", value, "applyId");
            return (Criteria) this;
        }

        public Criteria andApplyIdNotEqualTo(String value) {
            addCriterion("apply_id <>", value, "applyId");
            return (Criteria) this;
        }

        public Criteria andApplyIdGreaterThan(String value) {
            addCriterion("apply_id >", value, "applyId");
            return (Criteria) this;
        }

        public Criteria andApplyIdGreaterThanOrEqualTo(String value) {
            addCriterion("apply_id >=", value, "applyId");
            return (Criteria) this;
        }

        public Criteria andApplyIdLessThan(String value) {
            addCriterion("apply_id <", value, "applyId");
            return (Criteria) this;
        }

        public Criteria andApplyIdLessThanOrEqualTo(String value) {
            addCriterion("apply_id <=", value, "applyId");
            return (Criteria) this;
        }

        public Criteria andApplyIdLike(String value) {
            addCriterion("apply_id like", value, "applyId");
            return (Criteria) this;
        }

        public Criteria andApplyIdNotLike(String value) {
            addCriterion("apply_id not like", value, "applyId");
            return (Criteria) this;
        }

        public Criteria andApplyIdIn(List<String> values) {
            addCriterion("apply_id in", values, "applyId");
            return (Criteria) this;
        }

        public Criteria andApplyIdNotIn(List<String> values) {
            addCriterion("apply_id not in", values, "applyId");
            return (Criteria) this;
        }

        public Criteria andApplyIdBetween(String value1, String value2) {
            addCriterion("apply_id between", value1, value2, "applyId");
            return (Criteria) this;
        }

        public Criteria andApplyIdNotBetween(String value1, String value2) {
            addCriterion("apply_id not between", value1, value2, "applyId");
            return (Criteria) this;
        }

        public Criteria andNoticeNoIsNull() {
            addCriterion("notice_no is null");
            return (Criteria) this;
        }

        public Criteria andNoticeNoIsNotNull() {
            addCriterion("notice_no is not null");
            return (Criteria) this;
        }

        public Criteria andNoticeNoEqualTo(String value) {
            addCriterion("notice_no =", value, "noticeNo");
            return (Criteria) this;
        }

        public Criteria andNoticeNoNotEqualTo(String value) {
            addCriterion("notice_no <>", value, "noticeNo");
            return (Criteria) this;
        }

        public Criteria andNoticeNoGreaterThan(String value) {
            addCriterion("notice_no >", value, "noticeNo");
            return (Criteria) this;
        }

        public Criteria andNoticeNoGreaterThanOrEqualTo(String value) {
            addCriterion("notice_no >=", value, "noticeNo");
            return (Criteria) this;
        }

        public Criteria andNoticeNoLessThan(String value) {
            addCriterion("notice_no <", value, "noticeNo");
            return (Criteria) this;
        }

        public Criteria andNoticeNoLessThanOrEqualTo(String value) {
            addCriterion("notice_no <=", value, "noticeNo");
            return (Criteria) this;
        }

        public Criteria andNoticeNoLike(String value) {
            addCriterion("notice_no like", value, "noticeNo");
            return (Criteria) this;
        }

        public Criteria andNoticeNoNotLike(String value) {
            addCriterion("notice_no not like", value, "noticeNo");
            return (Criteria) this;
        }

        public Criteria andNoticeNoIn(List<String> values) {
            addCriterion("notice_no in", values, "noticeNo");
            return (Criteria) this;
        }

        public Criteria andNoticeNoNotIn(List<String> values) {
            addCriterion("notice_no not in", values, "noticeNo");
            return (Criteria) this;
        }

        public Criteria andNoticeNoBetween(String value1, String value2) {
            addCriterion("notice_no between", value1, value2, "noticeNo");
            return (Criteria) this;
        }

        public Criteria andNoticeNoNotBetween(String value1, String value2) {
            addCriterion("notice_no not between", value1, value2, "noticeNo");
            return (Criteria) this;
        }

        public Criteria andAdminUserInfoIdIsNull() {
            addCriterion("admin_user_info_id is null");
            return (Criteria) this;
        }

        public Criteria andAdminUserInfoIdIsNotNull() {
            addCriterion("admin_user_info_id is not null");
            return (Criteria) this;
        }

        public Criteria andAdminUserInfoIdEqualTo(String value) {
            addCriterion("admin_user_info_id =", value, "adminUserInfoId");
            return (Criteria) this;
        }

        public Criteria andAdminUserInfoIdNotEqualTo(String value) {
            addCriterion("admin_user_info_id <>", value, "adminUserInfoId");
            return (Criteria) this;
        }

        public Criteria andAdminUserInfoIdGreaterThan(String value) {
            addCriterion("admin_user_info_id >", value, "adminUserInfoId");
            return (Criteria) this;
        }

        public Criteria andAdminUserInfoIdGreaterThanOrEqualTo(String value) {
            addCriterion("admin_user_info_id >=", value, "adminUserInfoId");
            return (Criteria) this;
        }

        public Criteria andAdminUserInfoIdLessThan(String value) {
            addCriterion("admin_user_info_id <", value, "adminUserInfoId");
            return (Criteria) this;
        }

        public Criteria andAdminUserInfoIdLessThanOrEqualTo(String value) {
            addCriterion("admin_user_info_id <=", value, "adminUserInfoId");
            return (Criteria) this;
        }

        public Criteria andAdminUserInfoIdLike(String value) {
            addCriterion("admin_user_info_id like", value, "adminUserInfoId");
            return (Criteria) this;
        }

        public Criteria andAdminUserInfoIdNotLike(String value) {
            addCriterion("admin_user_info_id not like", value, "adminUserInfoId");
            return (Criteria) this;
        }

        public Criteria andAdminUserInfoIdIn(List<String> values) {
            addCriterion("admin_user_info_id in", values, "adminUserInfoId");
            return (Criteria) this;
        }

        public Criteria andAdminUserInfoIdNotIn(List<String> values) {
            addCriterion("admin_user_info_id not in", values, "adminUserInfoId");
            return (Criteria) this;
        }

        public Criteria andAdminUserInfoIdBetween(String value1, String value2) {
            addCriterion("admin_user_info_id between", value1, value2, "adminUserInfoId");
            return (Criteria) this;
        }

        public Criteria andAdminUserInfoIdNotBetween(String value1, String value2) {
            addCriterion("admin_user_info_id not between", value1, value2, "adminUserInfoId");
            return (Criteria) this;
        }

        public Criteria andChildUserInfoIdIsNull() {
            addCriterion("child_user_info_id is null");
            return (Criteria) this;
        }

        public Criteria andChildUserInfoIdIsNotNull() {
            addCriterion("child_user_info_id is not null");
            return (Criteria) this;
        }

        public Criteria andChildUserInfoIdEqualTo(String value) {
            addCriterion("child_user_info_id =", value, "childUserInfoId");
            return (Criteria) this;
        }

        public Criteria andChildUserInfoIdNotEqualTo(String value) {
            addCriterion("child_user_info_id <>", value, "childUserInfoId");
            return (Criteria) this;
        }

        public Criteria andChildUserInfoIdGreaterThan(String value) {
            addCriterion("child_user_info_id >", value, "childUserInfoId");
            return (Criteria) this;
        }

        public Criteria andChildUserInfoIdGreaterThanOrEqualTo(String value) {
            addCriterion("child_user_info_id >=", value, "childUserInfoId");
            return (Criteria) this;
        }

        public Criteria andChildUserInfoIdLessThan(String value) {
            addCriterion("child_user_info_id <", value, "childUserInfoId");
            return (Criteria) this;
        }

        public Criteria andChildUserInfoIdLessThanOrEqualTo(String value) {
            addCriterion("child_user_info_id <=", value, "childUserInfoId");
            return (Criteria) this;
        }

        public Criteria andChildUserInfoIdLike(String value) {
            addCriterion("child_user_info_id like", value, "childUserInfoId");
            return (Criteria) this;
        }

        public Criteria andChildUserInfoIdNotLike(String value) {
            addCriterion("child_user_info_id not like", value, "childUserInfoId");
            return (Criteria) this;
        }

        public Criteria andChildUserInfoIdIn(List<String> values) {
            addCriterion("child_user_info_id in", values, "childUserInfoId");
            return (Criteria) this;
        }

        public Criteria andChildUserInfoIdNotIn(List<String> values) {
            addCriterion("child_user_info_id not in", values, "childUserInfoId");
            return (Criteria) this;
        }

        public Criteria andChildUserInfoIdBetween(String value1, String value2) {
            addCriterion("child_user_info_id between", value1, value2, "childUserInfoId");
            return (Criteria) this;
        }

        public Criteria andChildUserInfoIdNotBetween(String value1, String value2) {
            addCriterion("child_user_info_id not between", value1, value2, "childUserInfoId");
            return (Criteria) this;
        }

        public Criteria andAddTypeIsNull() {
            addCriterion("add_type is null");
            return (Criteria) this;
        }

        public Criteria andAddTypeIsNotNull() {
            addCriterion("add_type is not null");
            return (Criteria) this;
        }

        public Criteria andAddTypeEqualTo(String value) {
            addCriterion("add_type =", value, "addType");
            return (Criteria) this;
        }

        public Criteria andAddTypeNotEqualTo(String value) {
            addCriterion("add_type <>", value, "addType");
            return (Criteria) this;
        }

        public Criteria andAddTypeGreaterThan(String value) {
            addCriterion("add_type >", value, "addType");
            return (Criteria) this;
        }

        public Criteria andAddTypeGreaterThanOrEqualTo(String value) {
            addCriterion("add_type >=", value, "addType");
            return (Criteria) this;
        }

        public Criteria andAddTypeLessThan(String value) {
            addCriterion("add_type <", value, "addType");
            return (Criteria) this;
        }

        public Criteria andAddTypeLessThanOrEqualTo(String value) {
            addCriterion("add_type <=", value, "addType");
            return (Criteria) this;
        }

        public Criteria andAddTypeLike(String value) {
            addCriterion("add_type like", value, "addType");
            return (Criteria) this;
        }

        public Criteria andAddTypeNotLike(String value) {
            addCriterion("add_type not like", value, "addType");
            return (Criteria) this;
        }

        public Criteria andAddTypeIn(List<String> values) {
            addCriterion("add_type in", values, "addType");
            return (Criteria) this;
        }

        public Criteria andAddTypeNotIn(List<String> values) {
            addCriterion("add_type not in", values, "addType");
            return (Criteria) this;
        }

        public Criteria andAddTypeBetween(String value1, String value2) {
            addCriterion("add_type between", value1, value2, "addType");
            return (Criteria) this;
        }

        public Criteria andAddTypeNotBetween(String value1, String value2) {
            addCriterion("add_type not between", value1, value2, "addType");
            return (Criteria) this;
        }

        public Criteria andMonitStatusIsNull() {
            addCriterion("monit_status is null");
            return (Criteria) this;
        }

        public Criteria andMonitStatusIsNotNull() {
            addCriterion("monit_status is not null");
            return (Criteria) this;
        }

        public Criteria andMonitStatusEqualTo(String value) {
            addCriterion("monit_status =", value, "monitStatus");
            return (Criteria) this;
        }

        public Criteria andMonitStatusNotEqualTo(String value) {
            addCriterion("monit_status <>", value, "monitStatus");
            return (Criteria) this;
        }

        public Criteria andMonitStatusGreaterThan(String value) {
            addCriterion("monit_status >", value, "monitStatus");
            return (Criteria) this;
        }

        public Criteria andMonitStatusGreaterThanOrEqualTo(String value) {
            addCriterion("monit_status >=", value, "monitStatus");
            return (Criteria) this;
        }

        public Criteria andMonitStatusLessThan(String value) {
            addCriterion("monit_status <", value, "monitStatus");
            return (Criteria) this;
        }

        public Criteria andMonitStatusLessThanOrEqualTo(String value) {
            addCriterion("monit_status <=", value, "monitStatus");
            return (Criteria) this;
        }

        public Criteria andMonitStatusLike(String value) {
            addCriterion("monit_status like", value, "monitStatus");
            return (Criteria) this;
        }

        public Criteria andMonitStatusNotLike(String value) {
            addCriterion("monit_status not like", value, "monitStatus");
            return (Criteria) this;
        }

        public Criteria andMonitStatusIn(List<String> values) {
            addCriterion("monit_status in", values, "monitStatus");
            return (Criteria) this;
        }

        public Criteria andMonitStatusNotIn(List<String> values) {
            addCriterion("monit_status not in", values, "monitStatus");
            return (Criteria) this;
        }

        public Criteria andMonitStatusBetween(String value1, String value2) {
            addCriterion("monit_status between", value1, value2, "monitStatus");
            return (Criteria) this;
        }

        public Criteria andMonitStatusNotBetween(String value1, String value2) {
            addCriterion("monit_status not between", value1, value2, "monitStatus");
            return (Criteria) this;
        }

        public Criteria andIsAttentionIsNull() {
            addCriterion("is_attention is null");
            return (Criteria) this;
        }

        public Criteria andIsAttentionIsNotNull() {
            addCriterion("is_attention is not null");
            return (Criteria) this;
        }

        public Criteria andIsAttentionEqualTo(Integer value) {
            addCriterion("is_attention =", value, "isAttention");
            return (Criteria) this;
        }

        public Criteria andIsAttentionNotEqualTo(Integer value) {
            addCriterion("is_attention <>", value, "isAttention");
            return (Criteria) this;
        }

        public Criteria andIsAttentionGreaterThan(Integer value) {
            addCriterion("is_attention >", value, "isAttention");
            return (Criteria) this;
        }

        public Criteria andIsAttentionGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_attention >=", value, "isAttention");
            return (Criteria) this;
        }

        public Criteria andIsAttentionLessThan(Integer value) {
            addCriterion("is_attention <", value, "isAttention");
            return (Criteria) this;
        }

        public Criteria andIsAttentionLessThanOrEqualTo(Integer value) {
            addCriterion("is_attention <=", value, "isAttention");
            return (Criteria) this;
        }

        public Criteria andIsAttentionIn(List<Integer> values) {
            addCriterion("is_attention in", values, "isAttention");
            return (Criteria) this;
        }

        public Criteria andIsAttentionNotIn(List<Integer> values) {
            addCriterion("is_attention not in", values, "isAttention");
            return (Criteria) this;
        }

        public Criteria andIsAttentionBetween(Integer value1, Integer value2) {
            addCriterion("is_attention between", value1, value2, "isAttention");
            return (Criteria) this;
        }

        public Criteria andIsAttentionNotBetween(Integer value1, Integer value2) {
            addCriterion("is_attention not between", value1, value2, "isAttention");
            return (Criteria) this;
        }

        public Criteria andAddTimeIsNull() {
            addCriterion("add_time is null");
            return (Criteria) this;
        }

        public Criteria andAddTimeIsNotNull() {
            addCriterion("add_time is not null");
            return (Criteria) this;
        }

        public Criteria andAddTimeEqualTo(Date value) {
            addCriterion("add_time =", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotEqualTo(Date value) {
            addCriterion("add_time <>", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeGreaterThan(Date value) {
            addCriterion("add_time >", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("add_time >=", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeLessThan(Date value) {
            addCriterion("add_time <", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeLessThanOrEqualTo(Date value) {
            addCriterion("add_time <=", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeIn(List<Date> values) {
            addCriterion("add_time in", values, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotIn(List<Date> values) {
            addCriterion("add_time not in", values, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeBetween(Date value1, Date value2) {
            addCriterion("add_time between", value1, value2, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotBetween(Date value1, Date value2) {
            addCriterion("add_time not between", value1, value2, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddUserIdIsNull() {
            addCriterion("add_user_id is null");
            return (Criteria) this;
        }

        public Criteria andAddUserIdIsNotNull() {
            addCriterion("add_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andAddUserIdEqualTo(String value) {
            addCriterion("add_user_id =", value, "addUserId");
            return (Criteria) this;
        }

        public Criteria andAddUserIdNotEqualTo(String value) {
            addCriterion("add_user_id <>", value, "addUserId");
            return (Criteria) this;
        }

        public Criteria andAddUserIdGreaterThan(String value) {
            addCriterion("add_user_id >", value, "addUserId");
            return (Criteria) this;
        }

        public Criteria andAddUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("add_user_id >=", value, "addUserId");
            return (Criteria) this;
        }

        public Criteria andAddUserIdLessThan(String value) {
            addCriterion("add_user_id <", value, "addUserId");
            return (Criteria) this;
        }

        public Criteria andAddUserIdLessThanOrEqualTo(String value) {
            addCriterion("add_user_id <=", value, "addUserId");
            return (Criteria) this;
        }

        public Criteria andAddUserIdLike(String value) {
            addCriterion("add_user_id like", value, "addUserId");
            return (Criteria) this;
        }

        public Criteria andAddUserIdNotLike(String value) {
            addCriterion("add_user_id not like", value, "addUserId");
            return (Criteria) this;
        }

        public Criteria andAddUserIdIn(List<String> values) {
            addCriterion("add_user_id in", values, "addUserId");
            return (Criteria) this;
        }

        public Criteria andAddUserIdNotIn(List<String> values) {
            addCriterion("add_user_id not in", values, "addUserId");
            return (Criteria) this;
        }

        public Criteria andAddUserIdBetween(String value1, String value2) {
            addCriterion("add_user_id between", value1, value2, "addUserId");
            return (Criteria) this;
        }

        public Criteria andAddUserIdNotBetween(String value1, String value2) {
            addCriterion("add_user_id not between", value1, value2, "addUserId");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdIsNull() {
            addCriterion("update_user_id is null");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdIsNotNull() {
            addCriterion("update_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdEqualTo(String value) {
            addCriterion("update_user_id =", value, "updateUserId");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdNotEqualTo(String value) {
            addCriterion("update_user_id <>", value, "updateUserId");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdGreaterThan(String value) {
            addCriterion("update_user_id >", value, "updateUserId");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("update_user_id >=", value, "updateUserId");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdLessThan(String value) {
            addCriterion("update_user_id <", value, "updateUserId");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdLessThanOrEqualTo(String value) {
            addCriterion("update_user_id <=", value, "updateUserId");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdLike(String value) {
            addCriterion("update_user_id like", value, "updateUserId");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdNotLike(String value) {
            addCriterion("update_user_id not like", value, "updateUserId");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdIn(List<String> values) {
            addCriterion("update_user_id in", values, "updateUserId");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdNotIn(List<String> values) {
            addCriterion("update_user_id not in", values, "updateUserId");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdBetween(String value1, String value2) {
            addCriterion("update_user_id between", value1, value2, "updateUserId");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdNotBetween(String value1, String value2) {
            addCriterion("update_user_id not between", value1, value2, "updateUserId");
            return (Criteria) this;
        }

        public Criteria andIsDelIsNull() {
            addCriterion("is_del is null");
            return (Criteria) this;
        }

        public Criteria andIsDelIsNotNull() {
            addCriterion("is_del is not null");
            return (Criteria) this;
        }

        public Criteria andIsDelEqualTo(Integer value) {
            addCriterion("is_del =", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelNotEqualTo(Integer value) {
            addCriterion("is_del <>", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelGreaterThan(Integer value) {
            addCriterion("is_del >", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_del >=", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelLessThan(Integer value) {
            addCriterion("is_del <", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelLessThanOrEqualTo(Integer value) {
            addCriterion("is_del <=", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelIn(List<Integer> values) {
            addCriterion("is_del in", values, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelNotIn(List<Integer> values) {
            addCriterion("is_del not in", values, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelBetween(Integer value1, Integer value2) {
            addCriterion("is_del between", value1, value2, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelNotBetween(Integer value1, Integer value2) {
            addCriterion("is_del not between", value1, value2, "isDel");
            return (Criteria) this;
        }

        public Criteria andAgentIsNull() {
            addCriterion("agent is null");
            return (Criteria) this;
        }

        public Criteria andAgentIsNotNull() {
            addCriterion("agent is not null");
            return (Criteria) this;
        }

        public Criteria andAgentEqualTo(String value) {
            addCriterion("agent =", value, "agent");
            return (Criteria) this;
        }

        public Criteria andAgentNotEqualTo(String value) {
            addCriterion("agent <>", value, "agent");
            return (Criteria) this;
        }

        public Criteria andAgentGreaterThan(String value) {
            addCriterion("agent >", value, "agent");
            return (Criteria) this;
        }

        public Criteria andAgentGreaterThanOrEqualTo(String value) {
            addCriterion("agent >=", value, "agent");
            return (Criteria) this;
        }

        public Criteria andAgentLessThan(String value) {
            addCriterion("agent <", value, "agent");
            return (Criteria) this;
        }

        public Criteria andAgentLessThanOrEqualTo(String value) {
            addCriterion("agent <=", value, "agent");
            return (Criteria) this;
        }

        public Criteria andAgentLike(String value) {
            addCriterion("agent like", value, "agent");
            return (Criteria) this;
        }

        public Criteria andAgentNotLike(String value) {
            addCriterion("agent not like", value, "agent");
            return (Criteria) this;
        }

        public Criteria andAgentIn(List<String> values) {
            addCriterion("agent in", values, "agent");
            return (Criteria) this;
        }

        public Criteria andAgentNotIn(List<String> values) {
            addCriterion("agent not in", values, "agent");
            return (Criteria) this;
        }

        public Criteria andAgentBetween(String value1, String value2) {
            addCriterion("agent between", value1, value2, "agent");
            return (Criteria) this;
        }

        public Criteria andAgentNotBetween(String value1, String value2) {
            addCriterion("agent not between", value1, value2, "agent");
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