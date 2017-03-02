package com.yundata.metadata.model.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BrandInfoSqrinfoPOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BrandInfoSqrinfoPOExample() {
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

        public Criteria andSqrmcYwIsNull() {
            addCriterion("sqrmc_yw is null");
            return (Criteria) this;
        }

        public Criteria andSqrmcYwIsNotNull() {
            addCriterion("sqrmc_yw is not null");
            return (Criteria) this;
        }

        public Criteria andSqrmcYwEqualTo(String value) {
            addCriterion("sqrmc_yw =", value, "sqrmcYw");
            return (Criteria) this;
        }

        public Criteria andSqrmcYwNotEqualTo(String value) {
            addCriterion("sqrmc_yw <>", value, "sqrmcYw");
            return (Criteria) this;
        }

        public Criteria andSqrmcYwGreaterThan(String value) {
            addCriterion("sqrmc_yw >", value, "sqrmcYw");
            return (Criteria) this;
        }

        public Criteria andSqrmcYwGreaterThanOrEqualTo(String value) {
            addCriterion("sqrmc_yw >=", value, "sqrmcYw");
            return (Criteria) this;
        }

        public Criteria andSqrmcYwLessThan(String value) {
            addCriterion("sqrmc_yw <", value, "sqrmcYw");
            return (Criteria) this;
        }

        public Criteria andSqrmcYwLessThanOrEqualTo(String value) {
            addCriterion("sqrmc_yw <=", value, "sqrmcYw");
            return (Criteria) this;
        }

        public Criteria andSqrmcYwLike(String value) {
            addCriterion("sqrmc_yw like", value, "sqrmcYw");
            return (Criteria) this;
        }

        public Criteria andSqrmcYwNotLike(String value) {
            addCriterion("sqrmc_yw not like", value, "sqrmcYw");
            return (Criteria) this;
        }

        public Criteria andSqrmcYwIn(List<String> values) {
            addCriterion("sqrmc_yw in", values, "sqrmcYw");
            return (Criteria) this;
        }

        public Criteria andSqrmcYwNotIn(List<String> values) {
            addCriterion("sqrmc_yw not in", values, "sqrmcYw");
            return (Criteria) this;
        }

        public Criteria andSqrmcYwBetween(String value1, String value2) {
            addCriterion("sqrmc_yw between", value1, value2, "sqrmcYw");
            return (Criteria) this;
        }

        public Criteria andSqrmcYwNotBetween(String value1, String value2) {
            addCriterion("sqrmc_yw not between", value1, value2, "sqrmcYw");
            return (Criteria) this;
        }

        public Criteria andSqrdzZwIsNull() {
            addCriterion("sqrdz_zw is null");
            return (Criteria) this;
        }

        public Criteria andSqrdzZwIsNotNull() {
            addCriterion("sqrdz_zw is not null");
            return (Criteria) this;
        }

        public Criteria andSqrdzZwEqualTo(String value) {
            addCriterion("sqrdz_zw =", value, "sqrdzZw");
            return (Criteria) this;
        }

        public Criteria andSqrdzZwNotEqualTo(String value) {
            addCriterion("sqrdz_zw <>", value, "sqrdzZw");
            return (Criteria) this;
        }

        public Criteria andSqrdzZwGreaterThan(String value) {
            addCriterion("sqrdz_zw >", value, "sqrdzZw");
            return (Criteria) this;
        }

        public Criteria andSqrdzZwGreaterThanOrEqualTo(String value) {
            addCriterion("sqrdz_zw >=", value, "sqrdzZw");
            return (Criteria) this;
        }

        public Criteria andSqrdzZwLessThan(String value) {
            addCriterion("sqrdz_zw <", value, "sqrdzZw");
            return (Criteria) this;
        }

        public Criteria andSqrdzZwLessThanOrEqualTo(String value) {
            addCriterion("sqrdz_zw <=", value, "sqrdzZw");
            return (Criteria) this;
        }

        public Criteria andSqrdzZwLike(String value) {
            addCriterion("sqrdz_zw like", value, "sqrdzZw");
            return (Criteria) this;
        }

        public Criteria andSqrdzZwNotLike(String value) {
            addCriterion("sqrdz_zw not like", value, "sqrdzZw");
            return (Criteria) this;
        }

        public Criteria andSqrdzZwIn(List<String> values) {
            addCriterion("sqrdz_zw in", values, "sqrdzZw");
            return (Criteria) this;
        }

        public Criteria andSqrdzZwNotIn(List<String> values) {
            addCriterion("sqrdz_zw not in", values, "sqrdzZw");
            return (Criteria) this;
        }

        public Criteria andSqrdzZwBetween(String value1, String value2) {
            addCriterion("sqrdz_zw between", value1, value2, "sqrdzZw");
            return (Criteria) this;
        }

        public Criteria andSqrdzZwNotBetween(String value1, String value2) {
            addCriterion("sqrdz_zw not between", value1, value2, "sqrdzZw");
            return (Criteria) this;
        }

        public Criteria andSqrdzYwIsNull() {
            addCriterion("sqrdz_yw is null");
            return (Criteria) this;
        }

        public Criteria andSqrdzYwIsNotNull() {
            addCriterion("sqrdz_yw is not null");
            return (Criteria) this;
        }

        public Criteria andSqrdzYwEqualTo(String value) {
            addCriterion("sqrdz_yw =", value, "sqrdzYw");
            return (Criteria) this;
        }

        public Criteria andSqrdzYwNotEqualTo(String value) {
            addCriterion("sqrdz_yw <>", value, "sqrdzYw");
            return (Criteria) this;
        }

        public Criteria andSqrdzYwGreaterThan(String value) {
            addCriterion("sqrdz_yw >", value, "sqrdzYw");
            return (Criteria) this;
        }

        public Criteria andSqrdzYwGreaterThanOrEqualTo(String value) {
            addCriterion("sqrdz_yw >=", value, "sqrdzYw");
            return (Criteria) this;
        }

        public Criteria andSqrdzYwLessThan(String value) {
            addCriterion("sqrdz_yw <", value, "sqrdzYw");
            return (Criteria) this;
        }

        public Criteria andSqrdzYwLessThanOrEqualTo(String value) {
            addCriterion("sqrdz_yw <=", value, "sqrdzYw");
            return (Criteria) this;
        }

        public Criteria andSqrdzYwLike(String value) {
            addCriterion("sqrdz_yw like", value, "sqrdzYw");
            return (Criteria) this;
        }

        public Criteria andSqrdzYwNotLike(String value) {
            addCriterion("sqrdz_yw not like", value, "sqrdzYw");
            return (Criteria) this;
        }

        public Criteria andSqrdzYwIn(List<String> values) {
            addCriterion("sqrdz_yw in", values, "sqrdzYw");
            return (Criteria) this;
        }

        public Criteria andSqrdzYwNotIn(List<String> values) {
            addCriterion("sqrdz_yw not in", values, "sqrdzYw");
            return (Criteria) this;
        }

        public Criteria andSqrdzYwBetween(String value1, String value2) {
            addCriterion("sqrdz_yw between", value1, value2, "sqrdzYw");
            return (Criteria) this;
        }

        public Criteria andSqrdzYwNotBetween(String value1, String value2) {
            addCriterion("sqrdz_yw not between", value1, value2, "sqrdzYw");
            return (Criteria) this;
        }

        public Criteria andIdCardNoIsNull() {
            addCriterion("id_card_no is null");
            return (Criteria) this;
        }

        public Criteria andIdCardNoIsNotNull() {
            addCriterion("id_card_no is not null");
            return (Criteria) this;
        }

        public Criteria andIdCardNoEqualTo(String value) {
            addCriterion("id_card_no =", value, "idCardNo");
            return (Criteria) this;
        }

        public Criteria andIdCardNoNotEqualTo(String value) {
            addCriterion("id_card_no <>", value, "idCardNo");
            return (Criteria) this;
        }

        public Criteria andIdCardNoGreaterThan(String value) {
            addCriterion("id_card_no >", value, "idCardNo");
            return (Criteria) this;
        }

        public Criteria andIdCardNoGreaterThanOrEqualTo(String value) {
            addCriterion("id_card_no >=", value, "idCardNo");
            return (Criteria) this;
        }

        public Criteria andIdCardNoLessThan(String value) {
            addCriterion("id_card_no <", value, "idCardNo");
            return (Criteria) this;
        }

        public Criteria andIdCardNoLessThanOrEqualTo(String value) {
            addCriterion("id_card_no <=", value, "idCardNo");
            return (Criteria) this;
        }

        public Criteria andIdCardNoLike(String value) {
            addCriterion("id_card_no like", value, "idCardNo");
            return (Criteria) this;
        }

        public Criteria andIdCardNoNotLike(String value) {
            addCriterion("id_card_no not like", value, "idCardNo");
            return (Criteria) this;
        }

        public Criteria andIdCardNoIn(List<String> values) {
            addCriterion("id_card_no in", values, "idCardNo");
            return (Criteria) this;
        }

        public Criteria andIdCardNoNotIn(List<String> values) {
            addCriterion("id_card_no not in", values, "idCardNo");
            return (Criteria) this;
        }

        public Criteria andIdCardNoBetween(String value1, String value2) {
            addCriterion("id_card_no between", value1, value2, "idCardNo");
            return (Criteria) this;
        }

        public Criteria andIdCardNoNotBetween(String value1, String value2) {
            addCriterion("id_card_no not between", value1, value2, "idCardNo");
            return (Criteria) this;
        }

        public Criteria andSqr2IsNull() {
            addCriterion("sqr2 is null");
            return (Criteria) this;
        }

        public Criteria andSqr2IsNotNull() {
            addCriterion("sqr2 is not null");
            return (Criteria) this;
        }

        public Criteria andSqr2EqualTo(String value) {
            addCriterion("sqr2 =", value, "sqr2");
            return (Criteria) this;
        }

        public Criteria andSqr2NotEqualTo(String value) {
            addCriterion("sqr2 <>", value, "sqr2");
            return (Criteria) this;
        }

        public Criteria andSqr2GreaterThan(String value) {
            addCriterion("sqr2 >", value, "sqr2");
            return (Criteria) this;
        }

        public Criteria andSqr2GreaterThanOrEqualTo(String value) {
            addCriterion("sqr2 >=", value, "sqr2");
            return (Criteria) this;
        }

        public Criteria andSqr2LessThan(String value) {
            addCriterion("sqr2 <", value, "sqr2");
            return (Criteria) this;
        }

        public Criteria andSqr2LessThanOrEqualTo(String value) {
            addCriterion("sqr2 <=", value, "sqr2");
            return (Criteria) this;
        }

        public Criteria andSqr2Like(String value) {
            addCriterion("sqr2 like", value, "sqr2");
            return (Criteria) this;
        }

        public Criteria andSqr2NotLike(String value) {
            addCriterion("sqr2 not like", value, "sqr2");
            return (Criteria) this;
        }

        public Criteria andSqr2In(List<String> values) {
            addCriterion("sqr2 in", values, "sqr2");
            return (Criteria) this;
        }

        public Criteria andSqr2NotIn(List<String> values) {
            addCriterion("sqr2 not in", values, "sqr2");
            return (Criteria) this;
        }

        public Criteria andSqr2Between(String value1, String value2) {
            addCriterion("sqr2 between", value1, value2, "sqr2");
            return (Criteria) this;
        }

        public Criteria andSqr2NotBetween(String value1, String value2) {
            addCriterion("sqr2 not between", value1, value2, "sqr2");
            return (Criteria) this;
        }

        public Criteria andSqr3IsNull() {
            addCriterion("sqr3 is null");
            return (Criteria) this;
        }

        public Criteria andSqr3IsNotNull() {
            addCriterion("sqr3 is not null");
            return (Criteria) this;
        }

        public Criteria andSqr3EqualTo(String value) {
            addCriterion("sqr3 =", value, "sqr3");
            return (Criteria) this;
        }

        public Criteria andSqr3NotEqualTo(String value) {
            addCriterion("sqr3 <>", value, "sqr3");
            return (Criteria) this;
        }

        public Criteria andSqr3GreaterThan(String value) {
            addCriterion("sqr3 >", value, "sqr3");
            return (Criteria) this;
        }

        public Criteria andSqr3GreaterThanOrEqualTo(String value) {
            addCriterion("sqr3 >=", value, "sqr3");
            return (Criteria) this;
        }

        public Criteria andSqr3LessThan(String value) {
            addCriterion("sqr3 <", value, "sqr3");
            return (Criteria) this;
        }

        public Criteria andSqr3LessThanOrEqualTo(String value) {
            addCriterion("sqr3 <=", value, "sqr3");
            return (Criteria) this;
        }

        public Criteria andSqr3Like(String value) {
            addCriterion("sqr3 like", value, "sqr3");
            return (Criteria) this;
        }

        public Criteria andSqr3NotLike(String value) {
            addCriterion("sqr3 not like", value, "sqr3");
            return (Criteria) this;
        }

        public Criteria andSqr3In(List<String> values) {
            addCriterion("sqr3 in", values, "sqr3");
            return (Criteria) this;
        }

        public Criteria andSqr3NotIn(List<String> values) {
            addCriterion("sqr3 not in", values, "sqr3");
            return (Criteria) this;
        }

        public Criteria andSqr3Between(String value1, String value2) {
            addCriterion("sqr3 between", value1, value2, "sqr3");
            return (Criteria) this;
        }

        public Criteria andSqr3NotBetween(String value1, String value2) {
            addCriterion("sqr3 not between", value1, value2, "sqr3");
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