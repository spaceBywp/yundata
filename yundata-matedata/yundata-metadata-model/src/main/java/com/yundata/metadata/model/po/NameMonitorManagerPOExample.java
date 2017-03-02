package com.yundata.metadata.model.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class NameMonitorManagerPOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public NameMonitorManagerPOExample() {
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

        public Criteria andNameIdIsNull() {
            addCriterion("name_id is null");
            return (Criteria) this;
        }

        public Criteria andNameIdIsNotNull() {
            addCriterion("name_id is not null");
            return (Criteria) this;
        }

        public Criteria andNameIdEqualTo(String value) {
            addCriterion("name_id =", value, "nameId");
            return (Criteria) this;
        }

        public Criteria andNameIdNotEqualTo(String value) {
            addCriterion("name_id <>", value, "nameId");
            return (Criteria) this;
        }

        public Criteria andNameIdGreaterThan(String value) {
            addCriterion("name_id >", value, "nameId");
            return (Criteria) this;
        }

        public Criteria andNameIdGreaterThanOrEqualTo(String value) {
            addCriterion("name_id >=", value, "nameId");
            return (Criteria) this;
        }

        public Criteria andNameIdLessThan(String value) {
            addCriterion("name_id <", value, "nameId");
            return (Criteria) this;
        }

        public Criteria andNameIdLessThanOrEqualTo(String value) {
            addCriterion("name_id <=", value, "nameId");
            return (Criteria) this;
        }

        public Criteria andNameIdLike(String value) {
            addCriterion("name_id like", value, "nameId");
            return (Criteria) this;
        }

        public Criteria andNameIdNotLike(String value) {
            addCriterion("name_id not like", value, "nameId");
            return (Criteria) this;
        }

        public Criteria andNameIdIn(List<String> values) {
            addCriterion("name_id in", values, "nameId");
            return (Criteria) this;
        }

        public Criteria andNameIdNotIn(List<String> values) {
            addCriterion("name_id not in", values, "nameId");
            return (Criteria) this;
        }

        public Criteria andNameIdBetween(String value1, String value2) {
            addCriterion("name_id between", value1, value2, "nameId");
            return (Criteria) this;
        }

        public Criteria andNameIdNotBetween(String value1, String value2) {
            addCriterion("name_id not between", value1, value2, "nameId");
            return (Criteria) this;
        }

        public Criteria andMonitorNameIsNull() {
            addCriterion("monitor_name is null");
            return (Criteria) this;
        }

        public Criteria andMonitorNameIsNotNull() {
            addCriterion("monitor_name is not null");
            return (Criteria) this;
        }

        public Criteria andMonitorNameEqualTo(String value) {
            addCriterion("monitor_name =", value, "monitorName");
            return (Criteria) this;
        }

        public Criteria andMonitorNameNotEqualTo(String value) {
            addCriterion("monitor_name <>", value, "monitorName");
            return (Criteria) this;
        }

        public Criteria andMonitorNameGreaterThan(String value) {
            addCriterion("monitor_name >", value, "monitorName");
            return (Criteria) this;
        }

        public Criteria andMonitorNameGreaterThanOrEqualTo(String value) {
            addCriterion("monitor_name >=", value, "monitorName");
            return (Criteria) this;
        }

        public Criteria andMonitorNameLessThan(String value) {
            addCriterion("monitor_name <", value, "monitorName");
            return (Criteria) this;
        }

        public Criteria andMonitorNameLessThanOrEqualTo(String value) {
            addCriterion("monitor_name <=", value, "monitorName");
            return (Criteria) this;
        }

        public Criteria andMonitorNameLike(String value) {
            addCriterion("monitor_name like", value, "monitorName");
            return (Criteria) this;
        }

        public Criteria andMonitorNameNotLike(String value) {
            addCriterion("monitor_name not like", value, "monitorName");
            return (Criteria) this;
        }

        public Criteria andMonitorNameIn(List<String> values) {
            addCriterion("monitor_name in", values, "monitorName");
            return (Criteria) this;
        }

        public Criteria andMonitorNameNotIn(List<String> values) {
            addCriterion("monitor_name not in", values, "monitorName");
            return (Criteria) this;
        }

        public Criteria andMonitorNameBetween(String value1, String value2) {
            addCriterion("monitor_name between", value1, value2, "monitorName");
            return (Criteria) this;
        }

        public Criteria andMonitorNameNotBetween(String value1, String value2) {
            addCriterion("monitor_name not between", value1, value2, "monitorName");
            return (Criteria) this;
        }

        public Criteria andMonitorTypeIsNull() {
            addCriterion("monitor_type is null");
            return (Criteria) this;
        }

        public Criteria andMonitorTypeIsNotNull() {
            addCriterion("monitor_type is not null");
            return (Criteria) this;
        }

        public Criteria andMonitorTypeEqualTo(String value) {
            addCriterion("monitor_type =", value, "monitorType");
            return (Criteria) this;
        }

        public Criteria andMonitorTypeNotEqualTo(String value) {
            addCriterion("monitor_type <>", value, "monitorType");
            return (Criteria) this;
        }

        public Criteria andMonitorTypeGreaterThan(String value) {
            addCriterion("monitor_type >", value, "monitorType");
            return (Criteria) this;
        }

        public Criteria andMonitorTypeGreaterThanOrEqualTo(String value) {
            addCriterion("monitor_type >=", value, "monitorType");
            return (Criteria) this;
        }

        public Criteria andMonitorTypeLessThan(String value) {
            addCriterion("monitor_type <", value, "monitorType");
            return (Criteria) this;
        }

        public Criteria andMonitorTypeLessThanOrEqualTo(String value) {
            addCriterion("monitor_type <=", value, "monitorType");
            return (Criteria) this;
        }

        public Criteria andMonitorTypeLike(String value) {
            addCriterion("monitor_type like", value, "monitorType");
            return (Criteria) this;
        }

        public Criteria andMonitorTypeNotLike(String value) {
            addCriterion("monitor_type not like", value, "monitorType");
            return (Criteria) this;
        }

        public Criteria andMonitorTypeIn(List<String> values) {
            addCriterion("monitor_type in", values, "monitorType");
            return (Criteria) this;
        }

        public Criteria andMonitorTypeNotIn(List<String> values) {
            addCriterion("monitor_type not in", values, "monitorType");
            return (Criteria) this;
        }

        public Criteria andMonitorTypeBetween(String value1, String value2) {
            addCriterion("monitor_type between", value1, value2, "monitorType");
            return (Criteria) this;
        }

        public Criteria andMonitorTypeNotBetween(String value1, String value2) {
            addCriterion("monitor_type not between", value1, value2, "monitorType");
            return (Criteria) this;
        }

        public Criteria andMonitorNatureIsNull() {
            addCriterion("monitor_nature is null");
            return (Criteria) this;
        }

        public Criteria andMonitorNatureIsNotNull() {
            addCriterion("monitor_nature is not null");
            return (Criteria) this;
        }

        public Criteria andMonitorNatureEqualTo(String value) {
            addCriterion("monitor_nature =", value, "monitorNature");
            return (Criteria) this;
        }

        public Criteria andMonitorNatureNotEqualTo(String value) {
            addCriterion("monitor_nature <>", value, "monitorNature");
            return (Criteria) this;
        }

        public Criteria andMonitorNatureGreaterThan(String value) {
            addCriterion("monitor_nature >", value, "monitorNature");
            return (Criteria) this;
        }

        public Criteria andMonitorNatureGreaterThanOrEqualTo(String value) {
            addCriterion("monitor_nature >=", value, "monitorNature");
            return (Criteria) this;
        }

        public Criteria andMonitorNatureLessThan(String value) {
            addCriterion("monitor_nature <", value, "monitorNature");
            return (Criteria) this;
        }

        public Criteria andMonitorNatureLessThanOrEqualTo(String value) {
            addCriterion("monitor_nature <=", value, "monitorNature");
            return (Criteria) this;
        }

        public Criteria andMonitorNatureLike(String value) {
            addCriterion("monitor_nature like", value, "monitorNature");
            return (Criteria) this;
        }

        public Criteria andMonitorNatureNotLike(String value) {
            addCriterion("monitor_nature not like", value, "monitorNature");
            return (Criteria) this;
        }

        public Criteria andMonitorNatureIn(List<String> values) {
            addCriterion("monitor_nature in", values, "monitorNature");
            return (Criteria) this;
        }

        public Criteria andMonitorNatureNotIn(List<String> values) {
            addCriterion("monitor_nature not in", values, "monitorNature");
            return (Criteria) this;
        }

        public Criteria andMonitorNatureBetween(String value1, String value2) {
            addCriterion("monitor_nature between", value1, value2, "monitorNature");
            return (Criteria) this;
        }

        public Criteria andMonitorNatureNotBetween(String value1, String value2) {
            addCriterion("monitor_nature not between", value1, value2, "monitorNature");
            return (Criteria) this;
        }

        public Criteria andMonitorConditionsIsNull() {
            addCriterion("monitor_conditions is null");
            return (Criteria) this;
        }

        public Criteria andMonitorConditionsIsNotNull() {
            addCriterion("monitor_conditions is not null");
            return (Criteria) this;
        }

        public Criteria andMonitorConditionsEqualTo(String value) {
            addCriterion("monitor_conditions =", value, "monitorConditions");
            return (Criteria) this;
        }

        public Criteria andMonitorConditionsNotEqualTo(String value) {
            addCriterion("monitor_conditions <>", value, "monitorConditions");
            return (Criteria) this;
        }

        public Criteria andMonitorConditionsGreaterThan(String value) {
            addCriterion("monitor_conditions >", value, "monitorConditions");
            return (Criteria) this;
        }

        public Criteria andMonitorConditionsGreaterThanOrEqualTo(String value) {
            addCriterion("monitor_conditions >=", value, "monitorConditions");
            return (Criteria) this;
        }

        public Criteria andMonitorConditionsLessThan(String value) {
            addCriterion("monitor_conditions <", value, "monitorConditions");
            return (Criteria) this;
        }

        public Criteria andMonitorConditionsLessThanOrEqualTo(String value) {
            addCriterion("monitor_conditions <=", value, "monitorConditions");
            return (Criteria) this;
        }

        public Criteria andMonitorConditionsLike(String value) {
            addCriterion("monitor_conditions like", value, "monitorConditions");
            return (Criteria) this;
        }

        public Criteria andMonitorConditionsNotLike(String value) {
            addCriterion("monitor_conditions not like", value, "monitorConditions");
            return (Criteria) this;
        }

        public Criteria andMonitorConditionsIn(List<String> values) {
            addCriterion("monitor_conditions in", values, "monitorConditions");
            return (Criteria) this;
        }

        public Criteria andMonitorConditionsNotIn(List<String> values) {
            addCriterion("monitor_conditions not in", values, "monitorConditions");
            return (Criteria) this;
        }

        public Criteria andMonitorConditionsBetween(String value1, String value2) {
            addCriterion("monitor_conditions between", value1, value2, "monitorConditions");
            return (Criteria) this;
        }

        public Criteria andMonitorConditionsNotBetween(String value1, String value2) {
            addCriterion("monitor_conditions not between", value1, value2, "monitorConditions");
            return (Criteria) this;
        }

        public Criteria andMonitorCategoryIsNull() {
            addCriterion("monitor_category is null");
            return (Criteria) this;
        }

        public Criteria andMonitorCategoryIsNotNull() {
            addCriterion("monitor_category is not null");
            return (Criteria) this;
        }

        public Criteria andMonitorCategoryEqualTo(String value) {
            addCriterion("monitor_category =", value, "monitorCategory");
            return (Criteria) this;
        }

        public Criteria andMonitorCategoryNotEqualTo(String value) {
            addCriterion("monitor_category <>", value, "monitorCategory");
            return (Criteria) this;
        }

        public Criteria andMonitorCategoryGreaterThan(String value) {
            addCriterion("monitor_category >", value, "monitorCategory");
            return (Criteria) this;
        }

        public Criteria andMonitorCategoryGreaterThanOrEqualTo(String value) {
            addCriterion("monitor_category >=", value, "monitorCategory");
            return (Criteria) this;
        }

        public Criteria andMonitorCategoryLessThan(String value) {
            addCriterion("monitor_category <", value, "monitorCategory");
            return (Criteria) this;
        }

        public Criteria andMonitorCategoryLessThanOrEqualTo(String value) {
            addCriterion("monitor_category <=", value, "monitorCategory");
            return (Criteria) this;
        }

        public Criteria andMonitorCategoryLike(String value) {
            addCriterion("monitor_category like", value, "monitorCategory");
            return (Criteria) this;
        }

        public Criteria andMonitorCategoryNotLike(String value) {
            addCriterion("monitor_category not like", value, "monitorCategory");
            return (Criteria) this;
        }

        public Criteria andMonitorCategoryIn(List<String> values) {
            addCriterion("monitor_category in", values, "monitorCategory");
            return (Criteria) this;
        }

        public Criteria andMonitorCategoryNotIn(List<String> values) {
            addCriterion("monitor_category not in", values, "monitorCategory");
            return (Criteria) this;
        }

        public Criteria andMonitorCategoryBetween(String value1, String value2) {
            addCriterion("monitor_category between", value1, value2, "monitorCategory");
            return (Criteria) this;
        }

        public Criteria andMonitorCategoryNotBetween(String value1, String value2) {
            addCriterion("monitor_category not between", value1, value2, "monitorCategory");
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

        public Criteria andSubUserIdIsNull() {
            addCriterion("sub_user_id is null");
            return (Criteria) this;
        }

        public Criteria andSubUserIdIsNotNull() {
            addCriterion("sub_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andSubUserIdEqualTo(String value) {
            addCriterion("sub_user_id =", value, "subUserId");
            return (Criteria) this;
        }

        public Criteria andSubUserIdNotEqualTo(String value) {
            addCriterion("sub_user_id <>", value, "subUserId");
            return (Criteria) this;
        }

        public Criteria andSubUserIdGreaterThan(String value) {
            addCriterion("sub_user_id >", value, "subUserId");
            return (Criteria) this;
        }

        public Criteria andSubUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("sub_user_id >=", value, "subUserId");
            return (Criteria) this;
        }

        public Criteria andSubUserIdLessThan(String value) {
            addCriterion("sub_user_id <", value, "subUserId");
            return (Criteria) this;
        }

        public Criteria andSubUserIdLessThanOrEqualTo(String value) {
            addCriterion("sub_user_id <=", value, "subUserId");
            return (Criteria) this;
        }

        public Criteria andSubUserIdLike(String value) {
            addCriterion("sub_user_id like", value, "subUserId");
            return (Criteria) this;
        }

        public Criteria andSubUserIdNotLike(String value) {
            addCriterion("sub_user_id not like", value, "subUserId");
            return (Criteria) this;
        }

        public Criteria andSubUserIdIn(List<String> values) {
            addCriterion("sub_user_id in", values, "subUserId");
            return (Criteria) this;
        }

        public Criteria andSubUserIdNotIn(List<String> values) {
            addCriterion("sub_user_id not in", values, "subUserId");
            return (Criteria) this;
        }

        public Criteria andSubUserIdBetween(String value1, String value2) {
            addCriterion("sub_user_id between", value1, value2, "subUserId");
            return (Criteria) this;
        }

        public Criteria andSubUserIdNotBetween(String value1, String value2) {
            addCriterion("sub_user_id not between", value1, value2, "subUserId");
            return (Criteria) this;
        }

        public Criteria andLinkManIsNull() {
            addCriterion("link_man is null");
            return (Criteria) this;
        }

        public Criteria andLinkManIsNotNull() {
            addCriterion("link_man is not null");
            return (Criteria) this;
        }

        public Criteria andLinkManEqualTo(String value) {
            addCriterion("link_man =", value, "linkMan");
            return (Criteria) this;
        }

        public Criteria andLinkManNotEqualTo(String value) {
            addCriterion("link_man <>", value, "linkMan");
            return (Criteria) this;
        }

        public Criteria andLinkManGreaterThan(String value) {
            addCriterion("link_man >", value, "linkMan");
            return (Criteria) this;
        }

        public Criteria andLinkManGreaterThanOrEqualTo(String value) {
            addCriterion("link_man >=", value, "linkMan");
            return (Criteria) this;
        }

        public Criteria andLinkManLessThan(String value) {
            addCriterion("link_man <", value, "linkMan");
            return (Criteria) this;
        }

        public Criteria andLinkManLessThanOrEqualTo(String value) {
            addCriterion("link_man <=", value, "linkMan");
            return (Criteria) this;
        }

        public Criteria andLinkManLike(String value) {
            addCriterion("link_man like", value, "linkMan");
            return (Criteria) this;
        }

        public Criteria andLinkManNotLike(String value) {
            addCriterion("link_man not like", value, "linkMan");
            return (Criteria) this;
        }

        public Criteria andLinkManIn(List<String> values) {
            addCriterion("link_man in", values, "linkMan");
            return (Criteria) this;
        }

        public Criteria andLinkManNotIn(List<String> values) {
            addCriterion("link_man not in", values, "linkMan");
            return (Criteria) this;
        }

        public Criteria andLinkManBetween(String value1, String value2) {
            addCriterion("link_man between", value1, value2, "linkMan");
            return (Criteria) this;
        }

        public Criteria andLinkManNotBetween(String value1, String value2) {
            addCriterion("link_man not between", value1, value2, "linkMan");
            return (Criteria) this;
        }

        public Criteria andMemoIsNull() {
            addCriterion("memo is null");
            return (Criteria) this;
        }

        public Criteria andMemoIsNotNull() {
            addCriterion("memo is not null");
            return (Criteria) this;
        }

        public Criteria andMemoEqualTo(String value) {
            addCriterion("memo =", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotEqualTo(String value) {
            addCriterion("memo <>", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoGreaterThan(String value) {
            addCriterion("memo >", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoGreaterThanOrEqualTo(String value) {
            addCriterion("memo >=", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoLessThan(String value) {
            addCriterion("memo <", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoLessThanOrEqualTo(String value) {
            addCriterion("memo <=", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoLike(String value) {
            addCriterion("memo like", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotLike(String value) {
            addCriterion("memo not like", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoIn(List<String> values) {
            addCriterion("memo in", values, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotIn(List<String> values) {
            addCriterion("memo not in", values, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoBetween(String value1, String value2) {
            addCriterion("memo between", value1, value2, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotBetween(String value1, String value2) {
            addCriterion("memo not between", value1, value2, "memo");
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