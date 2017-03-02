package com.yundata.metadata.model.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserMcBrandMessagePOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserMcBrandMessagePOExample() {
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

        public Criteria andMcMsgIdIsNull() {
            addCriterion("mc_msg_id is null");
            return (Criteria) this;
        }

        public Criteria andMcMsgIdIsNotNull() {
            addCriterion("mc_msg_id is not null");
            return (Criteria) this;
        }

        public Criteria andMcMsgIdEqualTo(String value) {
            addCriterion("mc_msg_id =", value, "mcMsgId");
            return (Criteria) this;
        }

        public Criteria andMcMsgIdNotEqualTo(String value) {
            addCriterion("mc_msg_id <>", value, "mcMsgId");
            return (Criteria) this;
        }

        public Criteria andMcMsgIdGreaterThan(String value) {
            addCriterion("mc_msg_id >", value, "mcMsgId");
            return (Criteria) this;
        }

        public Criteria andMcMsgIdGreaterThanOrEqualTo(String value) {
            addCriterion("mc_msg_id >=", value, "mcMsgId");
            return (Criteria) this;
        }

        public Criteria andMcMsgIdLessThan(String value) {
            addCriterion("mc_msg_id <", value, "mcMsgId");
            return (Criteria) this;
        }

        public Criteria andMcMsgIdLessThanOrEqualTo(String value) {
            addCriterion("mc_msg_id <=", value, "mcMsgId");
            return (Criteria) this;
        }

        public Criteria andMcMsgIdLike(String value) {
            addCriterion("mc_msg_id like", value, "mcMsgId");
            return (Criteria) this;
        }

        public Criteria andMcMsgIdNotLike(String value) {
            addCriterion("mc_msg_id not like", value, "mcMsgId");
            return (Criteria) this;
        }

        public Criteria andMcMsgIdIn(List<String> values) {
            addCriterion("mc_msg_id in", values, "mcMsgId");
            return (Criteria) this;
        }

        public Criteria andMcMsgIdNotIn(List<String> values) {
            addCriterion("mc_msg_id not in", values, "mcMsgId");
            return (Criteria) this;
        }

        public Criteria andMcMsgIdBetween(String value1, String value2) {
            addCriterion("mc_msg_id between", value1, value2, "mcMsgId");
            return (Criteria) this;
        }

        public Criteria andMcMsgIdNotBetween(String value1, String value2) {
            addCriterion("mc_msg_id not between", value1, value2, "mcMsgId");
            return (Criteria) this;
        }

        public Criteria andUserInfoIdIsNull() {
            addCriterion("user_info_id is null");
            return (Criteria) this;
        }

        public Criteria andUserInfoIdIsNotNull() {
            addCriterion("user_info_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserInfoIdEqualTo(String value) {
            addCriterion("user_info_id =", value, "userInfoId");
            return (Criteria) this;
        }

        public Criteria andUserInfoIdNotEqualTo(String value) {
            addCriterion("user_info_id <>", value, "userInfoId");
            return (Criteria) this;
        }

        public Criteria andUserInfoIdGreaterThan(String value) {
            addCriterion("user_info_id >", value, "userInfoId");
            return (Criteria) this;
        }

        public Criteria andUserInfoIdGreaterThanOrEqualTo(String value) {
            addCriterion("user_info_id >=", value, "userInfoId");
            return (Criteria) this;
        }

        public Criteria andUserInfoIdLessThan(String value) {
            addCriterion("user_info_id <", value, "userInfoId");
            return (Criteria) this;
        }

        public Criteria andUserInfoIdLessThanOrEqualTo(String value) {
            addCriterion("user_info_id <=", value, "userInfoId");
            return (Criteria) this;
        }

        public Criteria andUserInfoIdLike(String value) {
            addCriterion("user_info_id like", value, "userInfoId");
            return (Criteria) this;
        }

        public Criteria andUserInfoIdNotLike(String value) {
            addCriterion("user_info_id not like", value, "userInfoId");
            return (Criteria) this;
        }

        public Criteria andUserInfoIdIn(List<String> values) {
            addCriterion("user_info_id in", values, "userInfoId");
            return (Criteria) this;
        }

        public Criteria andUserInfoIdNotIn(List<String> values) {
            addCriterion("user_info_id not in", values, "userInfoId");
            return (Criteria) this;
        }

        public Criteria andUserInfoIdBetween(String value1, String value2) {
            addCriterion("user_info_id between", value1, value2, "userInfoId");
            return (Criteria) this;
        }

        public Criteria andUserInfoIdNotBetween(String value1, String value2) {
            addCriterion("user_info_id not between", value1, value2, "userInfoId");
            return (Criteria) this;
        }

        public Criteria andRegNumIsNull() {
            addCriterion("reg_num is null");
            return (Criteria) this;
        }

        public Criteria andRegNumIsNotNull() {
            addCriterion("reg_num is not null");
            return (Criteria) this;
        }

        public Criteria andRegNumEqualTo(String value) {
            addCriterion("reg_num =", value, "regNum");
            return (Criteria) this;
        }

        public Criteria andRegNumNotEqualTo(String value) {
            addCriterion("reg_num <>", value, "regNum");
            return (Criteria) this;
        }

        public Criteria andRegNumGreaterThan(String value) {
            addCriterion("reg_num >", value, "regNum");
            return (Criteria) this;
        }

        public Criteria andRegNumGreaterThanOrEqualTo(String value) {
            addCriterion("reg_num >=", value, "regNum");
            return (Criteria) this;
        }

        public Criteria andRegNumLessThan(String value) {
            addCriterion("reg_num <", value, "regNum");
            return (Criteria) this;
        }

        public Criteria andRegNumLessThanOrEqualTo(String value) {
            addCriterion("reg_num <=", value, "regNum");
            return (Criteria) this;
        }

        public Criteria andRegNumLike(String value) {
            addCriterion("reg_num like", value, "regNum");
            return (Criteria) this;
        }

        public Criteria andRegNumNotLike(String value) {
            addCriterion("reg_num not like", value, "regNum");
            return (Criteria) this;
        }

        public Criteria andRegNumIn(List<String> values) {
            addCriterion("reg_num in", values, "regNum");
            return (Criteria) this;
        }

        public Criteria andRegNumNotIn(List<String> values) {
            addCriterion("reg_num not in", values, "regNum");
            return (Criteria) this;
        }

        public Criteria andRegNumBetween(String value1, String value2) {
            addCriterion("reg_num between", value1, value2, "regNum");
            return (Criteria) this;
        }

        public Criteria andRegNumNotBetween(String value1, String value2) {
            addCriterion("reg_num not between", value1, value2, "regNum");
            return (Criteria) this;
        }

        public Criteria andIntclsIsNull() {
            addCriterion("intcls is null");
            return (Criteria) this;
        }

        public Criteria andIntclsIsNotNull() {
            addCriterion("intcls is not null");
            return (Criteria) this;
        }

        public Criteria andIntclsEqualTo(String value) {
            addCriterion("intcls =", value, "intcls");
            return (Criteria) this;
        }

        public Criteria andIntclsNotEqualTo(String value) {
            addCriterion("intcls <>", value, "intcls");
            return (Criteria) this;
        }

        public Criteria andIntclsGreaterThan(String value) {
            addCriterion("intcls >", value, "intcls");
            return (Criteria) this;
        }

        public Criteria andIntclsGreaterThanOrEqualTo(String value) {
            addCriterion("intcls >=", value, "intcls");
            return (Criteria) this;
        }

        public Criteria andIntclsLessThan(String value) {
            addCriterion("intcls <", value, "intcls");
            return (Criteria) this;
        }

        public Criteria andIntclsLessThanOrEqualTo(String value) {
            addCriterion("intcls <=", value, "intcls");
            return (Criteria) this;
        }

        public Criteria andIntclsLike(String value) {
            addCriterion("intcls like", value, "intcls");
            return (Criteria) this;
        }

        public Criteria andIntclsNotLike(String value) {
            addCriterion("intcls not like", value, "intcls");
            return (Criteria) this;
        }

        public Criteria andIntclsIn(List<String> values) {
            addCriterion("intcls in", values, "intcls");
            return (Criteria) this;
        }

        public Criteria andIntclsNotIn(List<String> values) {
            addCriterion("intcls not in", values, "intcls");
            return (Criteria) this;
        }

        public Criteria andIntclsBetween(String value1, String value2) {
            addCriterion("intcls between", value1, value2, "intcls");
            return (Criteria) this;
        }

        public Criteria andIntclsNotBetween(String value1, String value2) {
            addCriterion("intcls not between", value1, value2, "intcls");
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