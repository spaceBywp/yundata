package com.yundata.metadata.model.po;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrderAttachementPOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrderAttachementPOExample() {
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

        public Criteria andOrderIdIsNull() {
            addCriterion("order_id is null");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNotNull() {
            addCriterion("order_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrderIdEqualTo(String value) {
            addCriterion("order_id =", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotEqualTo(String value) {
            addCriterion("order_id <>", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThan(String value) {
            addCriterion("order_id >", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThanOrEqualTo(String value) {
            addCriterion("order_id >=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThan(String value) {
            addCriterion("order_id <", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThanOrEqualTo(String value) {
            addCriterion("order_id <=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLike(String value) {
            addCriterion("order_id like", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotLike(String value) {
            addCriterion("order_id not like", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdIn(List<String> values) {
            addCriterion("order_id in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotIn(List<String> values) {
            addCriterion("order_id not in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdBetween(String value1, String value2) {
            addCriterion("order_id between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotBetween(String value1, String value2) {
            addCriterion("order_id not between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andFileNameIsNull() {
            addCriterion("file_name is null");
            return (Criteria) this;
        }

        public Criteria andFileNameIsNotNull() {
            addCriterion("file_name is not null");
            return (Criteria) this;
        }

        public Criteria andFileNameEqualTo(String value) {
            addCriterion("file_name =", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameNotEqualTo(String value) {
            addCriterion("file_name <>", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameGreaterThan(String value) {
            addCriterion("file_name >", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameGreaterThanOrEqualTo(String value) {
            addCriterion("file_name >=", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameLessThan(String value) {
            addCriterion("file_name <", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameLessThanOrEqualTo(String value) {
            addCriterion("file_name <=", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameLike(String value) {
            addCriterion("file_name like", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameNotLike(String value) {
            addCriterion("file_name not like", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameIn(List<String> values) {
            addCriterion("file_name in", values, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameNotIn(List<String> values) {
            addCriterion("file_name not in", values, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameBetween(String value1, String value2) {
            addCriterion("file_name between", value1, value2, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameNotBetween(String value1, String value2) {
            addCriterion("file_name not between", value1, value2, "fileName");
            return (Criteria) this;
        }

        public Criteria andPathIsNull() {
            addCriterion("path is null");
            return (Criteria) this;
        }

        public Criteria andPathIsNotNull() {
            addCriterion("path is not null");
            return (Criteria) this;
        }

        public Criteria andPathEqualTo(String value) {
            addCriterion("path =", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathNotEqualTo(String value) {
            addCriterion("path <>", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathGreaterThan(String value) {
            addCriterion("path >", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathGreaterThanOrEqualTo(String value) {
            addCriterion("path >=", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathLessThan(String value) {
            addCriterion("path <", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathLessThanOrEqualTo(String value) {
            addCriterion("path <=", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathLike(String value) {
            addCriterion("path like", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathNotLike(String value) {
            addCriterion("path not like", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathIn(List<String> values) {
            addCriterion("path in", values, "path");
            return (Criteria) this;
        }

        public Criteria andPathNotIn(List<String> values) {
            addCriterion("path not in", values, "path");
            return (Criteria) this;
        }

        public Criteria andPathBetween(String value1, String value2) {
            addCriterion("path between", value1, value2, "path");
            return (Criteria) this;
        }

        public Criteria andPathNotBetween(String value1, String value2) {
            addCriterion("path not between", value1, value2, "path");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
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

        public Criteria andSubTypeIsNull() {
            addCriterion("sub_type is null");
            return (Criteria) this;
        }

        public Criteria andSubTypeIsNotNull() {
            addCriterion("sub_type is not null");
            return (Criteria) this;
        }

        public Criteria andSubTypeEqualTo(Integer value) {
            addCriterion("sub_type =", value, "subType");
            return (Criteria) this;
        }

        public Criteria andSubTypeNotEqualTo(Integer value) {
            addCriterion("sub_type <>", value, "subType");
            return (Criteria) this;
        }

        public Criteria andSubTypeGreaterThan(Integer value) {
            addCriterion("sub_type >", value, "subType");
            return (Criteria) this;
        }

        public Criteria andSubTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("sub_type >=", value, "subType");
            return (Criteria) this;
        }

        public Criteria andSubTypeLessThan(Integer value) {
            addCriterion("sub_type <", value, "subType");
            return (Criteria) this;
        }

        public Criteria andSubTypeLessThanOrEqualTo(Integer value) {
            addCriterion("sub_type <=", value, "subType");
            return (Criteria) this;
        }

        public Criteria andSubTypeIn(List<Integer> values) {
            addCriterion("sub_type in", values, "subType");
            return (Criteria) this;
        }

        public Criteria andSubTypeNotIn(List<Integer> values) {
            addCriterion("sub_type not in", values, "subType");
            return (Criteria) this;
        }

        public Criteria andSubTypeBetween(Integer value1, Integer value2) {
            addCriterion("sub_type between", value1, value2, "subType");
            return (Criteria) this;
        }

        public Criteria andSubTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("sub_type not between", value1, value2, "subType");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNull() {
            addCriterion("phone is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("phone is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("phone =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("phone <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("phone >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("phone >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("phone <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("phone <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("phone like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("phone not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("phone in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("phone not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("phone between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("phone not between", value1, value2, "phone");
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

        public Criteria andRemitBankNumIsNull() {
            addCriterion("remit_bank_num is null");
            return (Criteria) this;
        }

        public Criteria andRemitBankNumIsNotNull() {
            addCriterion("remit_bank_num is not null");
            return (Criteria) this;
        }

        public Criteria andRemitBankNumEqualTo(String value) {
            addCriterion("remit_bank_num =", value, "remitBankNum");
            return (Criteria) this;
        }

        public Criteria andRemitBankNumNotEqualTo(String value) {
            addCriterion("remit_bank_num <>", value, "remitBankNum");
            return (Criteria) this;
        }

        public Criteria andRemitBankNumGreaterThan(String value) {
            addCriterion("remit_bank_num >", value, "remitBankNum");
            return (Criteria) this;
        }

        public Criteria andRemitBankNumGreaterThanOrEqualTo(String value) {
            addCriterion("remit_bank_num >=", value, "remitBankNum");
            return (Criteria) this;
        }

        public Criteria andRemitBankNumLessThan(String value) {
            addCriterion("remit_bank_num <", value, "remitBankNum");
            return (Criteria) this;
        }

        public Criteria andRemitBankNumLessThanOrEqualTo(String value) {
            addCriterion("remit_bank_num <=", value, "remitBankNum");
            return (Criteria) this;
        }

        public Criteria andRemitBankNumLike(String value) {
            addCriterion("remit_bank_num like", value, "remitBankNum");
            return (Criteria) this;
        }

        public Criteria andRemitBankNumNotLike(String value) {
            addCriterion("remit_bank_num not like", value, "remitBankNum");
            return (Criteria) this;
        }

        public Criteria andRemitBankNumIn(List<String> values) {
            addCriterion("remit_bank_num in", values, "remitBankNum");
            return (Criteria) this;
        }

        public Criteria andRemitBankNumNotIn(List<String> values) {
            addCriterion("remit_bank_num not in", values, "remitBankNum");
            return (Criteria) this;
        }

        public Criteria andRemitBankNumBetween(String value1, String value2) {
            addCriterion("remit_bank_num between", value1, value2, "remitBankNum");
            return (Criteria) this;
        }

        public Criteria andRemitBankNumNotBetween(String value1, String value2) {
            addCriterion("remit_bank_num not between", value1, value2, "remitBankNum");
            return (Criteria) this;
        }

        public Criteria andRemitNameIsNull() {
            addCriterion("remit_name is null");
            return (Criteria) this;
        }

        public Criteria andRemitNameIsNotNull() {
            addCriterion("remit_name is not null");
            return (Criteria) this;
        }

        public Criteria andRemitNameEqualTo(String value) {
            addCriterion("remit_name =", value, "remitName");
            return (Criteria) this;
        }

        public Criteria andRemitNameNotEqualTo(String value) {
            addCriterion("remit_name <>", value, "remitName");
            return (Criteria) this;
        }

        public Criteria andRemitNameGreaterThan(String value) {
            addCriterion("remit_name >", value, "remitName");
            return (Criteria) this;
        }

        public Criteria andRemitNameGreaterThanOrEqualTo(String value) {
            addCriterion("remit_name >=", value, "remitName");
            return (Criteria) this;
        }

        public Criteria andRemitNameLessThan(String value) {
            addCriterion("remit_name <", value, "remitName");
            return (Criteria) this;
        }

        public Criteria andRemitNameLessThanOrEqualTo(String value) {
            addCriterion("remit_name <=", value, "remitName");
            return (Criteria) this;
        }

        public Criteria andRemitNameLike(String value) {
            addCriterion("remit_name like", value, "remitName");
            return (Criteria) this;
        }

        public Criteria andRemitNameNotLike(String value) {
            addCriterion("remit_name not like", value, "remitName");
            return (Criteria) this;
        }

        public Criteria andRemitNameIn(List<String> values) {
            addCriterion("remit_name in", values, "remitName");
            return (Criteria) this;
        }

        public Criteria andRemitNameNotIn(List<String> values) {
            addCriterion("remit_name not in", values, "remitName");
            return (Criteria) this;
        }

        public Criteria andRemitNameBetween(String value1, String value2) {
            addCriterion("remit_name between", value1, value2, "remitName");
            return (Criteria) this;
        }

        public Criteria andRemitNameNotBetween(String value1, String value2) {
            addCriterion("remit_name not between", value1, value2, "remitName");
            return (Criteria) this;
        }

        public Criteria andRemitPriceIsNull() {
            addCriterion("remit_price is null");
            return (Criteria) this;
        }

        public Criteria andRemitPriceIsNotNull() {
            addCriterion("remit_price is not null");
            return (Criteria) this;
        }

        public Criteria andRemitPriceEqualTo(BigDecimal value) {
            addCriterion("remit_price =", value, "remitPrice");
            return (Criteria) this;
        }

        public Criteria andRemitPriceNotEqualTo(BigDecimal value) {
            addCriterion("remit_price <>", value, "remitPrice");
            return (Criteria) this;
        }

        public Criteria andRemitPriceGreaterThan(BigDecimal value) {
            addCriterion("remit_price >", value, "remitPrice");
            return (Criteria) this;
        }

        public Criteria andRemitPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("remit_price >=", value, "remitPrice");
            return (Criteria) this;
        }

        public Criteria andRemitPriceLessThan(BigDecimal value) {
            addCriterion("remit_price <", value, "remitPrice");
            return (Criteria) this;
        }

        public Criteria andRemitPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("remit_price <=", value, "remitPrice");
            return (Criteria) this;
        }

        public Criteria andRemitPriceIn(List<BigDecimal> values) {
            addCriterion("remit_price in", values, "remitPrice");
            return (Criteria) this;
        }

        public Criteria andRemitPriceNotIn(List<BigDecimal> values) {
            addCriterion("remit_price not in", values, "remitPrice");
            return (Criteria) this;
        }

        public Criteria andRemitPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("remit_price between", value1, value2, "remitPrice");
            return (Criteria) this;
        }

        public Criteria andRemitPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("remit_price not between", value1, value2, "remitPrice");
            return (Criteria) this;
        }

        public Criteria andAmountInWordsIsNull() {
            addCriterion("amount_in_words is null");
            return (Criteria) this;
        }

        public Criteria andAmountInWordsIsNotNull() {
            addCriterion("amount_in_words is not null");
            return (Criteria) this;
        }

        public Criteria andAmountInWordsEqualTo(String value) {
            addCriterion("amount_in_words =", value, "amountInWords");
            return (Criteria) this;
        }

        public Criteria andAmountInWordsNotEqualTo(String value) {
            addCriterion("amount_in_words <>", value, "amountInWords");
            return (Criteria) this;
        }

        public Criteria andAmountInWordsGreaterThan(String value) {
            addCriterion("amount_in_words >", value, "amountInWords");
            return (Criteria) this;
        }

        public Criteria andAmountInWordsGreaterThanOrEqualTo(String value) {
            addCriterion("amount_in_words >=", value, "amountInWords");
            return (Criteria) this;
        }

        public Criteria andAmountInWordsLessThan(String value) {
            addCriterion("amount_in_words <", value, "amountInWords");
            return (Criteria) this;
        }

        public Criteria andAmountInWordsLessThanOrEqualTo(String value) {
            addCriterion("amount_in_words <=", value, "amountInWords");
            return (Criteria) this;
        }

        public Criteria andAmountInWordsLike(String value) {
            addCriterion("amount_in_words like", value, "amountInWords");
            return (Criteria) this;
        }

        public Criteria andAmountInWordsNotLike(String value) {
            addCriterion("amount_in_words not like", value, "amountInWords");
            return (Criteria) this;
        }

        public Criteria andAmountInWordsIn(List<String> values) {
            addCriterion("amount_in_words in", values, "amountInWords");
            return (Criteria) this;
        }

        public Criteria andAmountInWordsNotIn(List<String> values) {
            addCriterion("amount_in_words not in", values, "amountInWords");
            return (Criteria) this;
        }

        public Criteria andAmountInWordsBetween(String value1, String value2) {
            addCriterion("amount_in_words between", value1, value2, "amountInWords");
            return (Criteria) this;
        }

        public Criteria andAmountInWordsNotBetween(String value1, String value2) {
            addCriterion("amount_in_words not between", value1, value2, "amountInWords");
            return (Criteria) this;
        }

        public Criteria andRemitDateIsNull() {
            addCriterion("remit_date is null");
            return (Criteria) this;
        }

        public Criteria andRemitDateIsNotNull() {
            addCriterion("remit_date is not null");
            return (Criteria) this;
        }

        public Criteria andRemitDateEqualTo(Date value) {
            addCriterion("remit_date =", value, "remitDate");
            return (Criteria) this;
        }

        public Criteria andRemitDateNotEqualTo(Date value) {
            addCriterion("remit_date <>", value, "remitDate");
            return (Criteria) this;
        }

        public Criteria andRemitDateGreaterThan(Date value) {
            addCriterion("remit_date >", value, "remitDate");
            return (Criteria) this;
        }

        public Criteria andRemitDateGreaterThanOrEqualTo(Date value) {
            addCriterion("remit_date >=", value, "remitDate");
            return (Criteria) this;
        }

        public Criteria andRemitDateLessThan(Date value) {
            addCriterion("remit_date <", value, "remitDate");
            return (Criteria) this;
        }

        public Criteria andRemitDateLessThanOrEqualTo(Date value) {
            addCriterion("remit_date <=", value, "remitDate");
            return (Criteria) this;
        }

        public Criteria andRemitDateIn(List<Date> values) {
            addCriterion("remit_date in", values, "remitDate");
            return (Criteria) this;
        }

        public Criteria andRemitDateNotIn(List<Date> values) {
            addCriterion("remit_date not in", values, "remitDate");
            return (Criteria) this;
        }

        public Criteria andRemitDateBetween(Date value1, Date value2) {
            addCriterion("remit_date between", value1, value2, "remitDate");
            return (Criteria) this;
        }

        public Criteria andRemitDateNotBetween(Date value1, Date value2) {
            addCriterion("remit_date not between", value1, value2, "remitDate");
            return (Criteria) this;
        }

        public Criteria andOperatingPersonnelIdIsNull() {
            addCriterion("operating_personnel_id is null");
            return (Criteria) this;
        }

        public Criteria andOperatingPersonnelIdIsNotNull() {
            addCriterion("operating_personnel_id is not null");
            return (Criteria) this;
        }

        public Criteria andOperatingPersonnelIdEqualTo(String value) {
            addCriterion("operating_personnel_id =", value, "operatingPersonnelId");
            return (Criteria) this;
        }

        public Criteria andOperatingPersonnelIdNotEqualTo(String value) {
            addCriterion("operating_personnel_id <>", value, "operatingPersonnelId");
            return (Criteria) this;
        }

        public Criteria andOperatingPersonnelIdGreaterThan(String value) {
            addCriterion("operating_personnel_id >", value, "operatingPersonnelId");
            return (Criteria) this;
        }

        public Criteria andOperatingPersonnelIdGreaterThanOrEqualTo(String value) {
            addCriterion("operating_personnel_id >=", value, "operatingPersonnelId");
            return (Criteria) this;
        }

        public Criteria andOperatingPersonnelIdLessThan(String value) {
            addCriterion("operating_personnel_id <", value, "operatingPersonnelId");
            return (Criteria) this;
        }

        public Criteria andOperatingPersonnelIdLessThanOrEqualTo(String value) {
            addCriterion("operating_personnel_id <=", value, "operatingPersonnelId");
            return (Criteria) this;
        }

        public Criteria andOperatingPersonnelIdLike(String value) {
            addCriterion("operating_personnel_id like", value, "operatingPersonnelId");
            return (Criteria) this;
        }

        public Criteria andOperatingPersonnelIdNotLike(String value) {
            addCriterion("operating_personnel_id not like", value, "operatingPersonnelId");
            return (Criteria) this;
        }

        public Criteria andOperatingPersonnelIdIn(List<String> values) {
            addCriterion("operating_personnel_id in", values, "operatingPersonnelId");
            return (Criteria) this;
        }

        public Criteria andOperatingPersonnelIdNotIn(List<String> values) {
            addCriterion("operating_personnel_id not in", values, "operatingPersonnelId");
            return (Criteria) this;
        }

        public Criteria andOperatingPersonnelIdBetween(String value1, String value2) {
            addCriterion("operating_personnel_id between", value1, value2, "operatingPersonnelId");
            return (Criteria) this;
        }

        public Criteria andOperatingPersonnelIdNotBetween(String value1, String value2) {
            addCriterion("operating_personnel_id not between", value1, value2, "operatingPersonnelId");
            return (Criteria) this;
        }

        public Criteria andAuditingStatusIsNull() {
            addCriterion("auditing_status is null");
            return (Criteria) this;
        }

        public Criteria andAuditingStatusIsNotNull() {
            addCriterion("auditing_status is not null");
            return (Criteria) this;
        }

        public Criteria andAuditingStatusEqualTo(Integer value) {
            addCriterion("auditing_status =", value, "auditingStatus");
            return (Criteria) this;
        }

        public Criteria andAuditingStatusNotEqualTo(Integer value) {
            addCriterion("auditing_status <>", value, "auditingStatus");
            return (Criteria) this;
        }

        public Criteria andAuditingStatusGreaterThan(Integer value) {
            addCriterion("auditing_status >", value, "auditingStatus");
            return (Criteria) this;
        }

        public Criteria andAuditingStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("auditing_status >=", value, "auditingStatus");
            return (Criteria) this;
        }

        public Criteria andAuditingStatusLessThan(Integer value) {
            addCriterion("auditing_status <", value, "auditingStatus");
            return (Criteria) this;
        }

        public Criteria andAuditingStatusLessThanOrEqualTo(Integer value) {
            addCriterion("auditing_status <=", value, "auditingStatus");
            return (Criteria) this;
        }

        public Criteria andAuditingStatusIn(List<Integer> values) {
            addCriterion("auditing_status in", values, "auditingStatus");
            return (Criteria) this;
        }

        public Criteria andAuditingStatusNotIn(List<Integer> values) {
            addCriterion("auditing_status not in", values, "auditingStatus");
            return (Criteria) this;
        }

        public Criteria andAuditingStatusBetween(Integer value1, Integer value2) {
            addCriterion("auditing_status between", value1, value2, "auditingStatus");
            return (Criteria) this;
        }

        public Criteria andAuditingStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("auditing_status not between", value1, value2, "auditingStatus");
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