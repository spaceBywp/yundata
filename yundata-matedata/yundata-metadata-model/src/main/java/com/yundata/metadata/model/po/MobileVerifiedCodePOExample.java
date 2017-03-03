package com.yundata.metadata.model.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MobileVerifiedCodePOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MobileVerifiedCodePOExample() {
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

        public Criteria andMobileIsNull() {
            addCriterion("mobile is null");
            return (Criteria) this;
        }

        public Criteria andMobileIsNotNull() {
            addCriterion("mobile is not null");
            return (Criteria) this;
        }

        public Criteria andMobileEqualTo(String value) {
            addCriterion("mobile =", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotEqualTo(String value) {
            addCriterion("mobile <>", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThan(String value) {
            addCriterion("mobile >", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThanOrEqualTo(String value) {
            addCriterion("mobile >=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThan(String value) {
            addCriterion("mobile <", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThanOrEqualTo(String value) {
            addCriterion("mobile <=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLike(String value) {
            addCriterion("mobile like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotLike(String value) {
            addCriterion("mobile not like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileIn(List<String> values) {
            addCriterion("mobile in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotIn(List<String> values) {
            addCriterion("mobile not in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileBetween(String value1, String value2) {
            addCriterion("mobile between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotBetween(String value1, String value2) {
            addCriterion("mobile not between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andCodeIsNull() {
            addCriterion("code is null");
            return (Criteria) this;
        }

        public Criteria andCodeIsNotNull() {
            addCriterion("code is not null");
            return (Criteria) this;
        }

        public Criteria andCodeEqualTo(String value) {
            addCriterion("code =", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotEqualTo(String value) {
            addCriterion("code <>", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThan(String value) {
            addCriterion("code >", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThanOrEqualTo(String value) {
            addCriterion("code >=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThan(String value) {
            addCriterion("code <", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThanOrEqualTo(String value) {
            addCriterion("code <=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLike(String value) {
            addCriterion("code like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotLike(String value) {
            addCriterion("code not like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeIn(List<String> values) {
            addCriterion("code in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotIn(List<String> values) {
            addCriterion("code not in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeBetween(String value1, String value2) {
            addCriterion("code between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotBetween(String value1, String value2) {
            addCriterion("code not between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andCodeTypeIsNull() {
            addCriterion("code_type is null");
            return (Criteria) this;
        }

        public Criteria andCodeTypeIsNotNull() {
            addCriterion("code_type is not null");
            return (Criteria) this;
        }

        public Criteria andCodeTypeEqualTo(Integer value) {
            addCriterion("code_type =", value, "codeType");
            return (Criteria) this;
        }

        public Criteria andCodeTypeNotEqualTo(Integer value) {
            addCriterion("code_type <>", value, "codeType");
            return (Criteria) this;
        }

        public Criteria andCodeTypeGreaterThan(Integer value) {
            addCriterion("code_type >", value, "codeType");
            return (Criteria) this;
        }

        public Criteria andCodeTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("code_type >=", value, "codeType");
            return (Criteria) this;
        }

        public Criteria andCodeTypeLessThan(Integer value) {
            addCriterion("code_type <", value, "codeType");
            return (Criteria) this;
        }

        public Criteria andCodeTypeLessThanOrEqualTo(Integer value) {
            addCriterion("code_type <=", value, "codeType");
            return (Criteria) this;
        }

        public Criteria andCodeTypeIn(List<Integer> values) {
            addCriterion("code_type in", values, "codeType");
            return (Criteria) this;
        }

        public Criteria andCodeTypeNotIn(List<Integer> values) {
            addCriterion("code_type not in", values, "codeType");
            return (Criteria) this;
        }

        public Criteria andCodeTypeBetween(Integer value1, Integer value2) {
            addCriterion("code_type between", value1, value2, "codeType");
            return (Criteria) this;
        }

        public Criteria andCodeTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("code_type not between", value1, value2, "codeType");
            return (Criteria) this;
        }

        public Criteria andSendCountIsNull() {
            addCriterion("send_count is null");
            return (Criteria) this;
        }

        public Criteria andSendCountIsNotNull() {
            addCriterion("send_count is not null");
            return (Criteria) this;
        }

        public Criteria andSendCountEqualTo(Integer value) {
            addCriterion("send_count =", value, "sendCount");
            return (Criteria) this;
        }

        public Criteria andSendCountNotEqualTo(Integer value) {
            addCriterion("send_count <>", value, "sendCount");
            return (Criteria) this;
        }

        public Criteria andSendCountGreaterThan(Integer value) {
            addCriterion("send_count >", value, "sendCount");
            return (Criteria) this;
        }

        public Criteria andSendCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("send_count >=", value, "sendCount");
            return (Criteria) this;
        }

        public Criteria andSendCountLessThan(Integer value) {
            addCriterion("send_count <", value, "sendCount");
            return (Criteria) this;
        }

        public Criteria andSendCountLessThanOrEqualTo(Integer value) {
            addCriterion("send_count <=", value, "sendCount");
            return (Criteria) this;
        }

        public Criteria andSendCountIn(List<Integer> values) {
            addCriterion("send_count in", values, "sendCount");
            return (Criteria) this;
        }

        public Criteria andSendCountNotIn(List<Integer> values) {
            addCriterion("send_count not in", values, "sendCount");
            return (Criteria) this;
        }

        public Criteria andSendCountBetween(Integer value1, Integer value2) {
            addCriterion("send_count between", value1, value2, "sendCount");
            return (Criteria) this;
        }

        public Criteria andSendCountNotBetween(Integer value1, Integer value2) {
            addCriterion("send_count not between", value1, value2, "sendCount");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("email is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("email is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("email =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("email <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("email >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("email >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("email <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("email <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("email like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("email not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("email in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("email not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("email between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("email not between", value1, value2, "email");
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

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNull() {
            addCriterion("create_date is null");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNotNull() {
            addCriterion("create_date is not null");
            return (Criteria) this;
        }

        public Criteria andCreateDateEqualTo(Date value) {
            addCriterion("create_date =", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotEqualTo(Date value) {
            addCriterion("create_date <>", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThan(Date value) {
            addCriterion("create_date >", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("create_date >=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThan(Date value) {
            addCriterion("create_date <", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThanOrEqualTo(Date value) {
            addCriterion("create_date <=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateIn(List<Date> values) {
            addCriterion("create_date in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotIn(List<Date> values) {
            addCriterion("create_date not in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateBetween(Date value1, Date value2) {
            addCriterion("create_date between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotBetween(Date value1, Date value2) {
            addCriterion("create_date not between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIsNull() {
            addCriterion("update_date is null");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIsNotNull() {
            addCriterion("update_date is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateDateEqualTo(Date value) {
            addCriterion("update_date =", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotEqualTo(Date value) {
            addCriterion("update_date <>", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateGreaterThan(Date value) {
            addCriterion("update_date >", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("update_date >=", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateLessThan(Date value) {
            addCriterion("update_date <", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateLessThanOrEqualTo(Date value) {
            addCriterion("update_date <=", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIn(List<Date> values) {
            addCriterion("update_date in", values, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotIn(List<Date> values) {
            addCriterion("update_date not in", values, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateBetween(Date value1, Date value2) {
            addCriterion("update_date between", value1, value2, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotBetween(Date value1, Date value2) {
            addCriterion("update_date not between", value1, value2, "updateDate");
            return (Criteria) this;
        }

        public Criteria andAddUserInfoIdIsNull() {
            addCriterion("add_user_info_id is null");
            return (Criteria) this;
        }

        public Criteria andAddUserInfoIdIsNotNull() {
            addCriterion("add_user_info_id is not null");
            return (Criteria) this;
        }

        public Criteria andAddUserInfoIdEqualTo(String value) {
            addCriterion("add_user_info_id =", value, "addUserInfoId");
            return (Criteria) this;
        }

        public Criteria andAddUserInfoIdNotEqualTo(String value) {
            addCriterion("add_user_info_id <>", value, "addUserInfoId");
            return (Criteria) this;
        }

        public Criteria andAddUserInfoIdGreaterThan(String value) {
            addCriterion("add_user_info_id >", value, "addUserInfoId");
            return (Criteria) this;
        }

        public Criteria andAddUserInfoIdGreaterThanOrEqualTo(String value) {
            addCriterion("add_user_info_id >=", value, "addUserInfoId");
            return (Criteria) this;
        }

        public Criteria andAddUserInfoIdLessThan(String value) {
            addCriterion("add_user_info_id <", value, "addUserInfoId");
            return (Criteria) this;
        }

        public Criteria andAddUserInfoIdLessThanOrEqualTo(String value) {
            addCriterion("add_user_info_id <=", value, "addUserInfoId");
            return (Criteria) this;
        }

        public Criteria andAddUserInfoIdLike(String value) {
            addCriterion("add_user_info_id like", value, "addUserInfoId");
            return (Criteria) this;
        }

        public Criteria andAddUserInfoIdNotLike(String value) {
            addCriterion("add_user_info_id not like", value, "addUserInfoId");
            return (Criteria) this;
        }

        public Criteria andAddUserInfoIdIn(List<String> values) {
            addCriterion("add_user_info_id in", values, "addUserInfoId");
            return (Criteria) this;
        }

        public Criteria andAddUserInfoIdNotIn(List<String> values) {
            addCriterion("add_user_info_id not in", values, "addUserInfoId");
            return (Criteria) this;
        }

        public Criteria andAddUserInfoIdBetween(String value1, String value2) {
            addCriterion("add_user_info_id between", value1, value2, "addUserInfoId");
            return (Criteria) this;
        }

        public Criteria andAddUserInfoIdNotBetween(String value1, String value2) {
            addCriterion("add_user_info_id not between", value1, value2, "addUserInfoId");
            return (Criteria) this;
        }

        public Criteria andUpdateUserInfoIdIsNull() {
            addCriterion("update_user_info_id is null");
            return (Criteria) this;
        }

        public Criteria andUpdateUserInfoIdIsNotNull() {
            addCriterion("update_user_info_id is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateUserInfoIdEqualTo(String value) {
            addCriterion("update_user_info_id =", value, "updateUserInfoId");
            return (Criteria) this;
        }

        public Criteria andUpdateUserInfoIdNotEqualTo(String value) {
            addCriterion("update_user_info_id <>", value, "updateUserInfoId");
            return (Criteria) this;
        }

        public Criteria andUpdateUserInfoIdGreaterThan(String value) {
            addCriterion("update_user_info_id >", value, "updateUserInfoId");
            return (Criteria) this;
        }

        public Criteria andUpdateUserInfoIdGreaterThanOrEqualTo(String value) {
            addCriterion("update_user_info_id >=", value, "updateUserInfoId");
            return (Criteria) this;
        }

        public Criteria andUpdateUserInfoIdLessThan(String value) {
            addCriterion("update_user_info_id <", value, "updateUserInfoId");
            return (Criteria) this;
        }

        public Criteria andUpdateUserInfoIdLessThanOrEqualTo(String value) {
            addCriterion("update_user_info_id <=", value, "updateUserInfoId");
            return (Criteria) this;
        }

        public Criteria andUpdateUserInfoIdLike(String value) {
            addCriterion("update_user_info_id like", value, "updateUserInfoId");
            return (Criteria) this;
        }

        public Criteria andUpdateUserInfoIdNotLike(String value) {
            addCriterion("update_user_info_id not like", value, "updateUserInfoId");
            return (Criteria) this;
        }

        public Criteria andUpdateUserInfoIdIn(List<String> values) {
            addCriterion("update_user_info_id in", values, "updateUserInfoId");
            return (Criteria) this;
        }

        public Criteria andUpdateUserInfoIdNotIn(List<String> values) {
            addCriterion("update_user_info_id not in", values, "updateUserInfoId");
            return (Criteria) this;
        }

        public Criteria andUpdateUserInfoIdBetween(String value1, String value2) {
            addCriterion("update_user_info_id between", value1, value2, "updateUserInfoId");
            return (Criteria) this;
        }

        public Criteria andUpdateUserInfoIdNotBetween(String value1, String value2) {
            addCriterion("update_user_info_id not between", value1, value2, "updateUserInfoId");
            return (Criteria) this;
        }

        public Criteria andTermOfValidityIsNull() {
            addCriterion("term_of_validity is null");
            return (Criteria) this;
        }

        public Criteria andTermOfValidityIsNotNull() {
            addCriterion("term_of_validity is not null");
            return (Criteria) this;
        }

        public Criteria andTermOfValidityEqualTo(Date value) {
            addCriterion("term_of_validity =", value, "termOfValidity");
            return (Criteria) this;
        }

        public Criteria andTermOfValidityNotEqualTo(Date value) {
            addCriterion("term_of_validity <>", value, "termOfValidity");
            return (Criteria) this;
        }

        public Criteria andTermOfValidityGreaterThan(Date value) {
            addCriterion("term_of_validity >", value, "termOfValidity");
            return (Criteria) this;
        }

        public Criteria andTermOfValidityGreaterThanOrEqualTo(Date value) {
            addCriterion("term_of_validity >=", value, "termOfValidity");
            return (Criteria) this;
        }

        public Criteria andTermOfValidityLessThan(Date value) {
            addCriterion("term_of_validity <", value, "termOfValidity");
            return (Criteria) this;
        }

        public Criteria andTermOfValidityLessThanOrEqualTo(Date value) {
            addCriterion("term_of_validity <=", value, "termOfValidity");
            return (Criteria) this;
        }

        public Criteria andTermOfValidityIn(List<Date> values) {
            addCriterion("term_of_validity in", values, "termOfValidity");
            return (Criteria) this;
        }

        public Criteria andTermOfValidityNotIn(List<Date> values) {
            addCriterion("term_of_validity not in", values, "termOfValidity");
            return (Criteria) this;
        }

        public Criteria andTermOfValidityBetween(Date value1, Date value2) {
            addCriterion("term_of_validity between", value1, value2, "termOfValidity");
            return (Criteria) this;
        }

        public Criteria andTermOfValidityNotBetween(Date value1, Date value2) {
            addCriterion("term_of_validity not between", value1, value2, "termOfValidity");
            return (Criteria) this;
        }

        public Criteria andProofTimeIsNull() {
            addCriterion("proof_time is null");
            return (Criteria) this;
        }

        public Criteria andProofTimeIsNotNull() {
            addCriterion("proof_time is not null");
            return (Criteria) this;
        }

        public Criteria andProofTimeEqualTo(Date value) {
            addCriterion("proof_time =", value, "proofTime");
            return (Criteria) this;
        }

        public Criteria andProofTimeNotEqualTo(Date value) {
            addCriterion("proof_time <>", value, "proofTime");
            return (Criteria) this;
        }

        public Criteria andProofTimeGreaterThan(Date value) {
            addCriterion("proof_time >", value, "proofTime");
            return (Criteria) this;
        }

        public Criteria andProofTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("proof_time >=", value, "proofTime");
            return (Criteria) this;
        }

        public Criteria andProofTimeLessThan(Date value) {
            addCriterion("proof_time <", value, "proofTime");
            return (Criteria) this;
        }

        public Criteria andProofTimeLessThanOrEqualTo(Date value) {
            addCriterion("proof_time <=", value, "proofTime");
            return (Criteria) this;
        }

        public Criteria andProofTimeIn(List<Date> values) {
            addCriterion("proof_time in", values, "proofTime");
            return (Criteria) this;
        }

        public Criteria andProofTimeNotIn(List<Date> values) {
            addCriterion("proof_time not in", values, "proofTime");
            return (Criteria) this;
        }

        public Criteria andProofTimeBetween(Date value1, Date value2) {
            addCriterion("proof_time between", value1, value2, "proofTime");
            return (Criteria) this;
        }

        public Criteria andProofTimeNotBetween(Date value1, Date value2) {
            addCriterion("proof_time not between", value1, value2, "proofTime");
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