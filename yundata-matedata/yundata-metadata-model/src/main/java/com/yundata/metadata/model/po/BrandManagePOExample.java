package com.yundata.metadata.model.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BrandManagePOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BrandManagePOExample() {
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

        public Criteria andRegistrantTimeIsNull() {
            addCriterion("registrant_time is null");
            return (Criteria) this;
        }

        public Criteria andRegistrantTimeIsNotNull() {
            addCriterion("registrant_time is not null");
            return (Criteria) this;
        }

        public Criteria andRegistrantTimeEqualTo(Date value) {
            addCriterion("registrant_time =", value, "registrantTime");
            return (Criteria) this;
        }

        public Criteria andRegistrantTimeNotEqualTo(Date value) {
            addCriterion("registrant_time <>", value, "registrantTime");
            return (Criteria) this;
        }

        public Criteria andRegistrantTimeGreaterThan(Date value) {
            addCriterion("registrant_time >", value, "registrantTime");
            return (Criteria) this;
        }

        public Criteria andRegistrantTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("registrant_time >=", value, "registrantTime");
            return (Criteria) this;
        }

        public Criteria andRegistrantTimeLessThan(Date value) {
            addCriterion("registrant_time <", value, "registrantTime");
            return (Criteria) this;
        }

        public Criteria andRegistrantTimeLessThanOrEqualTo(Date value) {
            addCriterion("registrant_time <=", value, "registrantTime");
            return (Criteria) this;
        }

        public Criteria andRegistrantTimeIn(List<Date> values) {
            addCriterion("registrant_time in", values, "registrantTime");
            return (Criteria) this;
        }

        public Criteria andRegistrantTimeNotIn(List<Date> values) {
            addCriterion("registrant_time not in", values, "registrantTime");
            return (Criteria) this;
        }

        public Criteria andRegistrantTimeBetween(Date value1, Date value2) {
            addCriterion("registrant_time between", value1, value2, "registrantTime");
            return (Criteria) this;
        }

        public Criteria andRegistrantTimeNotBetween(Date value1, Date value2) {
            addCriterion("registrant_time not between", value1, value2, "registrantTime");
            return (Criteria) this;
        }

        public Criteria andDljgNameIsNull() {
            addCriterion("dljg_name is null");
            return (Criteria) this;
        }

        public Criteria andDljgNameIsNotNull() {
            addCriterion("dljg_name is not null");
            return (Criteria) this;
        }

        public Criteria andDljgNameEqualTo(String value) {
            addCriterion("dljg_name =", value, "dljgName");
            return (Criteria) this;
        }

        public Criteria andDljgNameNotEqualTo(String value) {
            addCriterion("dljg_name <>", value, "dljgName");
            return (Criteria) this;
        }

        public Criteria andDljgNameGreaterThan(String value) {
            addCriterion("dljg_name >", value, "dljgName");
            return (Criteria) this;
        }

        public Criteria andDljgNameGreaterThanOrEqualTo(String value) {
            addCriterion("dljg_name >=", value, "dljgName");
            return (Criteria) this;
        }

        public Criteria andDljgNameLessThan(String value) {
            addCriterion("dljg_name <", value, "dljgName");
            return (Criteria) this;
        }

        public Criteria andDljgNameLessThanOrEqualTo(String value) {
            addCriterion("dljg_name <=", value, "dljgName");
            return (Criteria) this;
        }

        public Criteria andDljgNameLike(String value) {
            addCriterion("dljg_name like", value, "dljgName");
            return (Criteria) this;
        }

        public Criteria andDljgNameNotLike(String value) {
            addCriterion("dljg_name not like", value, "dljgName");
            return (Criteria) this;
        }

        public Criteria andDljgNameIn(List<String> values) {
            addCriterion("dljg_name in", values, "dljgName");
            return (Criteria) this;
        }

        public Criteria andDljgNameNotIn(List<String> values) {
            addCriterion("dljg_name not in", values, "dljgName");
            return (Criteria) this;
        }

        public Criteria andDljgNameBetween(String value1, String value2) {
            addCriterion("dljg_name between", value1, value2, "dljgName");
            return (Criteria) this;
        }

        public Criteria andDljgNameNotBetween(String value1, String value2) {
            addCriterion("dljg_name not between", value1, value2, "dljgName");
            return (Criteria) this;
        }

        public Criteria andInNoticeIsNull() {
            addCriterion("in_notice is null");
            return (Criteria) this;
        }

        public Criteria andInNoticeIsNotNull() {
            addCriterion("in_notice is not null");
            return (Criteria) this;
        }

        public Criteria andInNoticeEqualTo(Integer value) {
            addCriterion("in_notice =", value, "inNotice");
            return (Criteria) this;
        }

        public Criteria andInNoticeNotEqualTo(Integer value) {
            addCriterion("in_notice <>", value, "inNotice");
            return (Criteria) this;
        }

        public Criteria andInNoticeGreaterThan(Integer value) {
            addCriterion("in_notice >", value, "inNotice");
            return (Criteria) this;
        }

        public Criteria andInNoticeGreaterThanOrEqualTo(Integer value) {
            addCriterion("in_notice >=", value, "inNotice");
            return (Criteria) this;
        }

        public Criteria andInNoticeLessThan(Integer value) {
            addCriterion("in_notice <", value, "inNotice");
            return (Criteria) this;
        }

        public Criteria andInNoticeLessThanOrEqualTo(Integer value) {
            addCriterion("in_notice <=", value, "inNotice");
            return (Criteria) this;
        }

        public Criteria andInNoticeIn(List<Integer> values) {
            addCriterion("in_notice in", values, "inNotice");
            return (Criteria) this;
        }

        public Criteria andInNoticeNotIn(List<Integer> values) {
            addCriterion("in_notice not in", values, "inNotice");
            return (Criteria) this;
        }

        public Criteria andInNoticeBetween(Integer value1, Integer value2) {
            addCriterion("in_notice between", value1, value2, "inNotice");
            return (Criteria) this;
        }

        public Criteria andInNoticeNotBetween(Integer value1, Integer value2) {
            addCriterion("in_notice not between", value1, value2, "inNotice");
            return (Criteria) this;
        }

        public Criteria andInSimilarIsNull() {
            addCriterion("in_similar is null");
            return (Criteria) this;
        }

        public Criteria andInSimilarIsNotNull() {
            addCriterion("in_similar is not null");
            return (Criteria) this;
        }

        public Criteria andInSimilarEqualTo(Integer value) {
            addCriterion("in_similar =", value, "inSimilar");
            return (Criteria) this;
        }

        public Criteria andInSimilarNotEqualTo(Integer value) {
            addCriterion("in_similar <>", value, "inSimilar");
            return (Criteria) this;
        }

        public Criteria andInSimilarGreaterThan(Integer value) {
            addCriterion("in_similar >", value, "inSimilar");
            return (Criteria) this;
        }

        public Criteria andInSimilarGreaterThanOrEqualTo(Integer value) {
            addCriterion("in_similar >=", value, "inSimilar");
            return (Criteria) this;
        }

        public Criteria andInSimilarLessThan(Integer value) {
            addCriterion("in_similar <", value, "inSimilar");
            return (Criteria) this;
        }

        public Criteria andInSimilarLessThanOrEqualTo(Integer value) {
            addCriterion("in_similar <=", value, "inSimilar");
            return (Criteria) this;
        }

        public Criteria andInSimilarIn(List<Integer> values) {
            addCriterion("in_similar in", values, "inSimilar");
            return (Criteria) this;
        }

        public Criteria andInSimilarNotIn(List<Integer> values) {
            addCriterion("in_similar not in", values, "inSimilar");
            return (Criteria) this;
        }

        public Criteria andInSimilarBetween(Integer value1, Integer value2) {
            addCriterion("in_similar between", value1, value2, "inSimilar");
            return (Criteria) this;
        }

        public Criteria andInSimilarNotBetween(Integer value1, Integer value2) {
            addCriterion("in_similar not between", value1, value2, "inSimilar");
            return (Criteria) this;
        }

        public Criteria andInStatusIsNull() {
            addCriterion("in_status is null");
            return (Criteria) this;
        }

        public Criteria andInStatusIsNotNull() {
            addCriterion("in_status is not null");
            return (Criteria) this;
        }

        public Criteria andInStatusEqualTo(Integer value) {
            addCriterion("in_status =", value, "inStatus");
            return (Criteria) this;
        }

        public Criteria andInStatusNotEqualTo(Integer value) {
            addCriterion("in_status <>", value, "inStatus");
            return (Criteria) this;
        }

        public Criteria andInStatusGreaterThan(Integer value) {
            addCriterion("in_status >", value, "inStatus");
            return (Criteria) this;
        }

        public Criteria andInStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("in_status >=", value, "inStatus");
            return (Criteria) this;
        }

        public Criteria andInStatusLessThan(Integer value) {
            addCriterion("in_status <", value, "inStatus");
            return (Criteria) this;
        }

        public Criteria andInStatusLessThanOrEqualTo(Integer value) {
            addCriterion("in_status <=", value, "inStatus");
            return (Criteria) this;
        }

        public Criteria andInStatusIn(List<Integer> values) {
            addCriterion("in_status in", values, "inStatus");
            return (Criteria) this;
        }

        public Criteria andInStatusNotIn(List<Integer> values) {
            addCriterion("in_status not in", values, "inStatus");
            return (Criteria) this;
        }

        public Criteria andInStatusBetween(Integer value1, Integer value2) {
            addCriterion("in_status between", value1, value2, "inStatus");
            return (Criteria) this;
        }

        public Criteria andInStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("in_status not between", value1, value2, "inStatus");
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

        public Criteria andBrandStatusIsNull() {
            addCriterion("brand_status is null");
            return (Criteria) this;
        }

        public Criteria andBrandStatusIsNotNull() {
            addCriterion("brand_status is not null");
            return (Criteria) this;
        }

        public Criteria andBrandStatusEqualTo(Integer value) {
            addCriterion("brand_status =", value, "brandStatus");
            return (Criteria) this;
        }

        public Criteria andBrandStatusNotEqualTo(Integer value) {
            addCriterion("brand_status <>", value, "brandStatus");
            return (Criteria) this;
        }

        public Criteria andBrandStatusGreaterThan(Integer value) {
            addCriterion("brand_status >", value, "brandStatus");
            return (Criteria) this;
        }

        public Criteria andBrandStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("brand_status >=", value, "brandStatus");
            return (Criteria) this;
        }

        public Criteria andBrandStatusLessThan(Integer value) {
            addCriterion("brand_status <", value, "brandStatus");
            return (Criteria) this;
        }

        public Criteria andBrandStatusLessThanOrEqualTo(Integer value) {
            addCriterion("brand_status <=", value, "brandStatus");
            return (Criteria) this;
        }

        public Criteria andBrandStatusIn(List<Integer> values) {
            addCriterion("brand_status in", values, "brandStatus");
            return (Criteria) this;
        }

        public Criteria andBrandStatusNotIn(List<Integer> values) {
            addCriterion("brand_status not in", values, "brandStatus");
            return (Criteria) this;
        }

        public Criteria andBrandStatusBetween(Integer value1, Integer value2) {
            addCriterion("brand_status between", value1, value2, "brandStatus");
            return (Criteria) this;
        }

        public Criteria andBrandStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("brand_status not between", value1, value2, "brandStatus");
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