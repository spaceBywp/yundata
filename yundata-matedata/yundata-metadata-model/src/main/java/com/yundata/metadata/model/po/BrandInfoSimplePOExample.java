package com.yundata.metadata.model.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BrandInfoSimplePOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BrandInfoSimplePOExample() {
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

        public Criteria andCsggqhIsNull() {
            addCriterion("csggqh is null");
            return (Criteria) this;
        }

        public Criteria andCsggqhIsNotNull() {
            addCriterion("csggqh is not null");
            return (Criteria) this;
        }

        public Criteria andCsggqhEqualTo(String value) {
            addCriterion("csggqh =", value, "csggqh");
            return (Criteria) this;
        }

        public Criteria andCsggqhNotEqualTo(String value) {
            addCriterion("csggqh <>", value, "csggqh");
            return (Criteria) this;
        }

        public Criteria andCsggqhGreaterThan(String value) {
            addCriterion("csggqh >", value, "csggqh");
            return (Criteria) this;
        }

        public Criteria andCsggqhGreaterThanOrEqualTo(String value) {
            addCriterion("csggqh >=", value, "csggqh");
            return (Criteria) this;
        }

        public Criteria andCsggqhLessThan(String value) {
            addCriterion("csggqh <", value, "csggqh");
            return (Criteria) this;
        }

        public Criteria andCsggqhLessThanOrEqualTo(String value) {
            addCriterion("csggqh <=", value, "csggqh");
            return (Criteria) this;
        }

        public Criteria andCsggqhLike(String value) {
            addCriterion("csggqh like", value, "csggqh");
            return (Criteria) this;
        }

        public Criteria andCsggqhNotLike(String value) {
            addCriterion("csggqh not like", value, "csggqh");
            return (Criteria) this;
        }

        public Criteria andCsggqhIn(List<String> values) {
            addCriterion("csggqh in", values, "csggqh");
            return (Criteria) this;
        }

        public Criteria andCsggqhNotIn(List<String> values) {
            addCriterion("csggqh not in", values, "csggqh");
            return (Criteria) this;
        }

        public Criteria andCsggqhBetween(String value1, String value2) {
            addCriterion("csggqh between", value1, value2, "csggqh");
            return (Criteria) this;
        }

        public Criteria andCsggqhNotBetween(String value1, String value2) {
            addCriterion("csggqh not between", value1, value2, "csggqh");
            return (Criteria) this;
        }

        public Criteria andCsggrqIsNull() {
            addCriterion("csggrq is null");
            return (Criteria) this;
        }

        public Criteria andCsggrqIsNotNull() {
            addCriterion("csggrq is not null");
            return (Criteria) this;
        }

        public Criteria andCsggrqEqualTo(Date value) {
            addCriterion("csggrq =", value, "csggrq");
            return (Criteria) this;
        }

        public Criteria andCsggrqNotEqualTo(Date value) {
            addCriterion("csggrq <>", value, "csggrq");
            return (Criteria) this;
        }

        public Criteria andCsggrqGreaterThan(Date value) {
            addCriterion("csggrq >", value, "csggrq");
            return (Criteria) this;
        }

        public Criteria andCsggrqGreaterThanOrEqualTo(Date value) {
            addCriterion("csggrq >=", value, "csggrq");
            return (Criteria) this;
        }

        public Criteria andCsggrqLessThan(Date value) {
            addCriterion("csggrq <", value, "csggrq");
            return (Criteria) this;
        }

        public Criteria andCsggrqLessThanOrEqualTo(Date value) {
            addCriterion("csggrq <=", value, "csggrq");
            return (Criteria) this;
        }

        public Criteria andCsggrqIn(List<Date> values) {
            addCriterion("csggrq in", values, "csggrq");
            return (Criteria) this;
        }

        public Criteria andCsggrqNotIn(List<Date> values) {
            addCriterion("csggrq not in", values, "csggrq");
            return (Criteria) this;
        }

        public Criteria andCsggrqBetween(Date value1, Date value2) {
            addCriterion("csggrq between", value1, value2, "csggrq");
            return (Criteria) this;
        }

        public Criteria andCsggrqNotBetween(Date value1, Date value2) {
            addCriterion("csggrq not between", value1, value2, "csggrq");
            return (Criteria) this;
        }

        public Criteria andZcggqhIsNull() {
            addCriterion("zcggqh is null");
            return (Criteria) this;
        }

        public Criteria andZcggqhIsNotNull() {
            addCriterion("zcggqh is not null");
            return (Criteria) this;
        }

        public Criteria andZcggqhEqualTo(String value) {
            addCriterion("zcggqh =", value, "zcggqh");
            return (Criteria) this;
        }

        public Criteria andZcggqhNotEqualTo(String value) {
            addCriterion("zcggqh <>", value, "zcggqh");
            return (Criteria) this;
        }

        public Criteria andZcggqhGreaterThan(String value) {
            addCriterion("zcggqh >", value, "zcggqh");
            return (Criteria) this;
        }

        public Criteria andZcggqhGreaterThanOrEqualTo(String value) {
            addCriterion("zcggqh >=", value, "zcggqh");
            return (Criteria) this;
        }

        public Criteria andZcggqhLessThan(String value) {
            addCriterion("zcggqh <", value, "zcggqh");
            return (Criteria) this;
        }

        public Criteria andZcggqhLessThanOrEqualTo(String value) {
            addCriterion("zcggqh <=", value, "zcggqh");
            return (Criteria) this;
        }

        public Criteria andZcggqhLike(String value) {
            addCriterion("zcggqh like", value, "zcggqh");
            return (Criteria) this;
        }

        public Criteria andZcggqhNotLike(String value) {
            addCriterion("zcggqh not like", value, "zcggqh");
            return (Criteria) this;
        }

        public Criteria andZcggqhIn(List<String> values) {
            addCriterion("zcggqh in", values, "zcggqh");
            return (Criteria) this;
        }

        public Criteria andZcggqhNotIn(List<String> values) {
            addCriterion("zcggqh not in", values, "zcggqh");
            return (Criteria) this;
        }

        public Criteria andZcggqhBetween(String value1, String value2) {
            addCriterion("zcggqh between", value1, value2, "zcggqh");
            return (Criteria) this;
        }

        public Criteria andZcggqhNotBetween(String value1, String value2) {
            addCriterion("zcggqh not between", value1, value2, "zcggqh");
            return (Criteria) this;
        }

        public Criteria andZcggrqIsNull() {
            addCriterion("zcggrq is null");
            return (Criteria) this;
        }

        public Criteria andZcggrqIsNotNull() {
            addCriterion("zcggrq is not null");
            return (Criteria) this;
        }

        public Criteria andZcggrqEqualTo(Date value) {
            addCriterion("zcggrq =", value, "zcggrq");
            return (Criteria) this;
        }

        public Criteria andZcggrqNotEqualTo(Date value) {
            addCriterion("zcggrq <>", value, "zcggrq");
            return (Criteria) this;
        }

        public Criteria andZcggrqGreaterThan(Date value) {
            addCriterion("zcggrq >", value, "zcggrq");
            return (Criteria) this;
        }

        public Criteria andZcggrqGreaterThanOrEqualTo(Date value) {
            addCriterion("zcggrq >=", value, "zcggrq");
            return (Criteria) this;
        }

        public Criteria andZcggrqLessThan(Date value) {
            addCriterion("zcggrq <", value, "zcggrq");
            return (Criteria) this;
        }

        public Criteria andZcggrqLessThanOrEqualTo(Date value) {
            addCriterion("zcggrq <=", value, "zcggrq");
            return (Criteria) this;
        }

        public Criteria andZcggrqIn(List<Date> values) {
            addCriterion("zcggrq in", values, "zcggrq");
            return (Criteria) this;
        }

        public Criteria andZcggrqNotIn(List<Date> values) {
            addCriterion("zcggrq not in", values, "zcggrq");
            return (Criteria) this;
        }

        public Criteria andZcggrqBetween(Date value1, Date value2) {
            addCriterion("zcggrq between", value1, value2, "zcggrq");
            return (Criteria) this;
        }

        public Criteria andZcggrqNotBetween(Date value1, Date value2) {
            addCriterion("zcggrq not between", value1, value2, "zcggrq");
            return (Criteria) this;
        }

        public Criteria andDlrmcIsNull() {
            addCriterion("dlrmc is null");
            return (Criteria) this;
        }

        public Criteria andDlrmcIsNotNull() {
            addCriterion("dlrmc is not null");
            return (Criteria) this;
        }

        public Criteria andDlrmcEqualTo(String value) {
            addCriterion("dlrmc =", value, "dlrmc");
            return (Criteria) this;
        }

        public Criteria andDlrmcNotEqualTo(String value) {
            addCriterion("dlrmc <>", value, "dlrmc");
            return (Criteria) this;
        }

        public Criteria andDlrmcGreaterThan(String value) {
            addCriterion("dlrmc >", value, "dlrmc");
            return (Criteria) this;
        }

        public Criteria andDlrmcGreaterThanOrEqualTo(String value) {
            addCriterion("dlrmc >=", value, "dlrmc");
            return (Criteria) this;
        }

        public Criteria andDlrmcLessThan(String value) {
            addCriterion("dlrmc <", value, "dlrmc");
            return (Criteria) this;
        }

        public Criteria andDlrmcLessThanOrEqualTo(String value) {
            addCriterion("dlrmc <=", value, "dlrmc");
            return (Criteria) this;
        }

        public Criteria andDlrmcLike(String value) {
            addCriterion("dlrmc like", value, "dlrmc");
            return (Criteria) this;
        }

        public Criteria andDlrmcNotLike(String value) {
            addCriterion("dlrmc not like", value, "dlrmc");
            return (Criteria) this;
        }

        public Criteria andDlrmcIn(List<String> values) {
            addCriterion("dlrmc in", values, "dlrmc");
            return (Criteria) this;
        }

        public Criteria andDlrmcNotIn(List<String> values) {
            addCriterion("dlrmc not in", values, "dlrmc");
            return (Criteria) this;
        }

        public Criteria andDlrmcBetween(String value1, String value2) {
            addCriterion("dlrmc between", value1, value2, "dlrmc");
            return (Criteria) this;
        }

        public Criteria andDlrmcNotBetween(String value1, String value2) {
            addCriterion("dlrmc not between", value1, value2, "dlrmc");
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

        public Criteria andNeedAttentionEqualTo(Short value) {
            addCriterion("need_attention =", value, "needAttention");
            return (Criteria) this;
        }

        public Criteria andNeedAttentionNotEqualTo(Short value) {
            addCriterion("need_attention <>", value, "needAttention");
            return (Criteria) this;
        }

        public Criteria andNeedAttentionGreaterThan(Short value) {
            addCriterion("need_attention >", value, "needAttention");
            return (Criteria) this;
        }

        public Criteria andNeedAttentionGreaterThanOrEqualTo(Short value) {
            addCriterion("need_attention >=", value, "needAttention");
            return (Criteria) this;
        }

        public Criteria andNeedAttentionLessThan(Short value) {
            addCriterion("need_attention <", value, "needAttention");
            return (Criteria) this;
        }

        public Criteria andNeedAttentionLessThanOrEqualTo(Short value) {
            addCriterion("need_attention <=", value, "needAttention");
            return (Criteria) this;
        }

        public Criteria andNeedAttentionIn(List<Short> values) {
            addCriterion("need_attention in", values, "needAttention");
            return (Criteria) this;
        }

        public Criteria andNeedAttentionNotIn(List<Short> values) {
            addCriterion("need_attention not in", values, "needAttention");
            return (Criteria) this;
        }

        public Criteria andNeedAttentionBetween(Short value1, Short value2) {
            addCriterion("need_attention between", value1, value2, "needAttention");
            return (Criteria) this;
        }

        public Criteria andNeedAttentionNotBetween(Short value1, Short value2) {
            addCriterion("need_attention not between", value1, value2, "needAttention");
            return (Criteria) this;
        }

        public Criteria andNewProcessIsNull() {
            addCriterion("new_process is null");
            return (Criteria) this;
        }

        public Criteria andNewProcessIsNotNull() {
            addCriterion("new_process is not null");
            return (Criteria) this;
        }

        public Criteria andNewProcessEqualTo(String value) {
            addCriterion("new_process =", value, "newProcess");
            return (Criteria) this;
        }

        public Criteria andNewProcessNotEqualTo(String value) {
            addCriterion("new_process <>", value, "newProcess");
            return (Criteria) this;
        }

        public Criteria andNewProcessGreaterThan(String value) {
            addCriterion("new_process >", value, "newProcess");
            return (Criteria) this;
        }

        public Criteria andNewProcessGreaterThanOrEqualTo(String value) {
            addCriterion("new_process >=", value, "newProcess");
            return (Criteria) this;
        }

        public Criteria andNewProcessLessThan(String value) {
            addCriterion("new_process <", value, "newProcess");
            return (Criteria) this;
        }

        public Criteria andNewProcessLessThanOrEqualTo(String value) {
            addCriterion("new_process <=", value, "newProcess");
            return (Criteria) this;
        }

        public Criteria andNewProcessLike(String value) {
            addCriterion("new_process like", value, "newProcess");
            return (Criteria) this;
        }

        public Criteria andNewProcessNotLike(String value) {
            addCriterion("new_process not like", value, "newProcess");
            return (Criteria) this;
        }

        public Criteria andNewProcessIn(List<String> values) {
            addCriterion("new_process in", values, "newProcess");
            return (Criteria) this;
        }

        public Criteria andNewProcessNotIn(List<String> values) {
            addCriterion("new_process not in", values, "newProcess");
            return (Criteria) this;
        }

        public Criteria andNewProcessBetween(String value1, String value2) {
            addCriterion("new_process between", value1, value2, "newProcess");
            return (Criteria) this;
        }

        public Criteria andNewProcessNotBetween(String value1, String value2) {
            addCriterion("new_process not between", value1, value2, "newProcess");
            return (Criteria) this;
        }

        public Criteria andNewProcessDateIsNull() {
            addCriterion("new_process_date is null");
            return (Criteria) this;
        }

        public Criteria andNewProcessDateIsNotNull() {
            addCriterion("new_process_date is not null");
            return (Criteria) this;
        }

        public Criteria andNewProcessDateEqualTo(Date value) {
            addCriterion("new_process_date =", value, "newProcessDate");
            return (Criteria) this;
        }

        public Criteria andNewProcessDateNotEqualTo(Date value) {
            addCriterion("new_process_date <>", value, "newProcessDate");
            return (Criteria) this;
        }

        public Criteria andNewProcessDateGreaterThan(Date value) {
            addCriterion("new_process_date >", value, "newProcessDate");
            return (Criteria) this;
        }

        public Criteria andNewProcessDateGreaterThanOrEqualTo(Date value) {
            addCriterion("new_process_date >=", value, "newProcessDate");
            return (Criteria) this;
        }

        public Criteria andNewProcessDateLessThan(Date value) {
            addCriterion("new_process_date <", value, "newProcessDate");
            return (Criteria) this;
        }

        public Criteria andNewProcessDateLessThanOrEqualTo(Date value) {
            addCriterion("new_process_date <=", value, "newProcessDate");
            return (Criteria) this;
        }

        public Criteria andNewProcessDateIn(List<Date> values) {
            addCriterion("new_process_date in", values, "newProcessDate");
            return (Criteria) this;
        }

        public Criteria andNewProcessDateNotIn(List<Date> values) {
            addCriterion("new_process_date not in", values, "newProcessDate");
            return (Criteria) this;
        }

        public Criteria andNewProcessDateBetween(Date value1, Date value2) {
            addCriterion("new_process_date between", value1, value2, "newProcessDate");
            return (Criteria) this;
        }

        public Criteria andNewProcessDateNotBetween(Date value1, Date value2) {
            addCriterion("new_process_date not between", value1, value2, "newProcessDate");
            return (Criteria) this;
        }

        public Criteria andZyqqxEndIsNull() {
            addCriterion("zyqqx_end is null");
            return (Criteria) this;
        }

        public Criteria andZyqqxEndIsNotNull() {
            addCriterion("zyqqx_end is not null");
            return (Criteria) this;
        }

        public Criteria andZyqqxEndEqualTo(Date value) {
            addCriterion("zyqqx_end =", value, "zyqqxEnd");
            return (Criteria) this;
        }

        public Criteria andZyqqxEndNotEqualTo(Date value) {
            addCriterion("zyqqx_end <>", value, "zyqqxEnd");
            return (Criteria) this;
        }

        public Criteria andZyqqxEndGreaterThan(Date value) {
            addCriterion("zyqqx_end >", value, "zyqqxEnd");
            return (Criteria) this;
        }

        public Criteria andZyqqxEndGreaterThanOrEqualTo(Date value) {
            addCriterion("zyqqx_end >=", value, "zyqqxEnd");
            return (Criteria) this;
        }

        public Criteria andZyqqxEndLessThan(Date value) {
            addCriterion("zyqqx_end <", value, "zyqqxEnd");
            return (Criteria) this;
        }

        public Criteria andZyqqxEndLessThanOrEqualTo(Date value) {
            addCriterion("zyqqx_end <=", value, "zyqqxEnd");
            return (Criteria) this;
        }

        public Criteria andZyqqxEndIn(List<Date> values) {
            addCriterion("zyqqx_end in", values, "zyqqxEnd");
            return (Criteria) this;
        }

        public Criteria andZyqqxEndNotIn(List<Date> values) {
            addCriterion("zyqqx_end not in", values, "zyqqxEnd");
            return (Criteria) this;
        }

        public Criteria andZyqqxEndBetween(Date value1, Date value2) {
            addCriterion("zyqqx_end between", value1, value2, "zyqqxEnd");
            return (Criteria) this;
        }

        public Criteria andZyqqxEndNotBetween(Date value1, Date value2) {
            addCriterion("zyqqx_end not between", value1, value2, "zyqqxEnd");
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

        public Criteria andSblxIsNull() {
            addCriterion("sblx is null");
            return (Criteria) this;
        }

        public Criteria andSblxIsNotNull() {
            addCriterion("sblx is not null");
            return (Criteria) this;
        }

        public Criteria andSblxEqualTo(String value) {
            addCriterion("sblx =", value, "sblx");
            return (Criteria) this;
        }

        public Criteria andSblxNotEqualTo(String value) {
            addCriterion("sblx <>", value, "sblx");
            return (Criteria) this;
        }

        public Criteria andSblxGreaterThan(String value) {
            addCriterion("sblx >", value, "sblx");
            return (Criteria) this;
        }

        public Criteria andSblxGreaterThanOrEqualTo(String value) {
            addCriterion("sblx >=", value, "sblx");
            return (Criteria) this;
        }

        public Criteria andSblxLessThan(String value) {
            addCriterion("sblx <", value, "sblx");
            return (Criteria) this;
        }

        public Criteria andSblxLessThanOrEqualTo(String value) {
            addCriterion("sblx <=", value, "sblx");
            return (Criteria) this;
        }

        public Criteria andSblxLike(String value) {
            addCriterion("sblx like", value, "sblx");
            return (Criteria) this;
        }

        public Criteria andSblxNotLike(String value) {
            addCriterion("sblx not like", value, "sblx");
            return (Criteria) this;
        }

        public Criteria andSblxIn(List<String> values) {
            addCriterion("sblx in", values, "sblx");
            return (Criteria) this;
        }

        public Criteria andSblxNotIn(List<String> values) {
            addCriterion("sblx not in", values, "sblx");
            return (Criteria) this;
        }

        public Criteria andSblxBetween(String value1, String value2) {
            addCriterion("sblx between", value1, value2, "sblx");
            return (Criteria) this;
        }

        public Criteria andSblxNotBetween(String value1, String value2) {
            addCriterion("sblx not between", value1, value2, "sblx");
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

        public Criteria andShengfenCodeIsNull() {
            addCriterion("shengfen_code is null");
            return (Criteria) this;
        }

        public Criteria andShengfenCodeIsNotNull() {
            addCriterion("shengfen_code is not null");
            return (Criteria) this;
        }

        public Criteria andShengfenCodeEqualTo(String value) {
            addCriterion("shengfen_code =", value, "shengfenCode");
            return (Criteria) this;
        }

        public Criteria andShengfenCodeNotEqualTo(String value) {
            addCriterion("shengfen_code <>", value, "shengfenCode");
            return (Criteria) this;
        }

        public Criteria andShengfenCodeGreaterThan(String value) {
            addCriterion("shengfen_code >", value, "shengfenCode");
            return (Criteria) this;
        }

        public Criteria andShengfenCodeGreaterThanOrEqualTo(String value) {
            addCriterion("shengfen_code >=", value, "shengfenCode");
            return (Criteria) this;
        }

        public Criteria andShengfenCodeLessThan(String value) {
            addCriterion("shengfen_code <", value, "shengfenCode");
            return (Criteria) this;
        }

        public Criteria andShengfenCodeLessThanOrEqualTo(String value) {
            addCriterion("shengfen_code <=", value, "shengfenCode");
            return (Criteria) this;
        }

        public Criteria andShengfenCodeLike(String value) {
            addCriterion("shengfen_code like", value, "shengfenCode");
            return (Criteria) this;
        }

        public Criteria andShengfenCodeNotLike(String value) {
            addCriterion("shengfen_code not like", value, "shengfenCode");
            return (Criteria) this;
        }

        public Criteria andShengfenCodeIn(List<String> values) {
            addCriterion("shengfen_code in", values, "shengfenCode");
            return (Criteria) this;
        }

        public Criteria andShengfenCodeNotIn(List<String> values) {
            addCriterion("shengfen_code not in", values, "shengfenCode");
            return (Criteria) this;
        }

        public Criteria andShengfenCodeBetween(String value1, String value2) {
            addCriterion("shengfen_code between", value1, value2, "shengfenCode");
            return (Criteria) this;
        }

        public Criteria andShengfenCodeNotBetween(String value1, String value2) {
            addCriterion("shengfen_code not between", value1, value2, "shengfenCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeIsNull() {
            addCriterion("city_code is null");
            return (Criteria) this;
        }

        public Criteria andCityCodeIsNotNull() {
            addCriterion("city_code is not null");
            return (Criteria) this;
        }

        public Criteria andCityCodeEqualTo(String value) {
            addCriterion("city_code =", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeNotEqualTo(String value) {
            addCriterion("city_code <>", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeGreaterThan(String value) {
            addCriterion("city_code >", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeGreaterThanOrEqualTo(String value) {
            addCriterion("city_code >=", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeLessThan(String value) {
            addCriterion("city_code <", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeLessThanOrEqualTo(String value) {
            addCriterion("city_code <=", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeLike(String value) {
            addCriterion("city_code like", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeNotLike(String value) {
            addCriterion("city_code not like", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeIn(List<String> values) {
            addCriterion("city_code in", values, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeNotIn(List<String> values) {
            addCriterion("city_code not in", values, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeBetween(String value1, String value2) {
            addCriterion("city_code between", value1, value2, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeNotBetween(String value1, String value2) {
            addCriterion("city_code not between", value1, value2, "cityCode");
            return (Criteria) this;
        }

        public Criteria andHasXuzhanIsNull() {
            addCriterion("has_xuzhan is null");
            return (Criteria) this;
        }

        public Criteria andHasXuzhanIsNotNull() {
            addCriterion("has_xuzhan is not null");
            return (Criteria) this;
        }

        public Criteria andHasXuzhanEqualTo(Short value) {
            addCriterion("has_xuzhan =", value, "hasXuzhan");
            return (Criteria) this;
        }

        public Criteria andHasXuzhanNotEqualTo(Short value) {
            addCriterion("has_xuzhan <>", value, "hasXuzhan");
            return (Criteria) this;
        }

        public Criteria andHasXuzhanGreaterThan(Short value) {
            addCriterion("has_xuzhan >", value, "hasXuzhan");
            return (Criteria) this;
        }

        public Criteria andHasXuzhanGreaterThanOrEqualTo(Short value) {
            addCriterion("has_xuzhan >=", value, "hasXuzhan");
            return (Criteria) this;
        }

        public Criteria andHasXuzhanLessThan(Short value) {
            addCriterion("has_xuzhan <", value, "hasXuzhan");
            return (Criteria) this;
        }

        public Criteria andHasXuzhanLessThanOrEqualTo(Short value) {
            addCriterion("has_xuzhan <=", value, "hasXuzhan");
            return (Criteria) this;
        }

        public Criteria andHasXuzhanIn(List<Short> values) {
            addCriterion("has_xuzhan in", values, "hasXuzhan");
            return (Criteria) this;
        }

        public Criteria andHasXuzhanNotIn(List<Short> values) {
            addCriterion("has_xuzhan not in", values, "hasXuzhan");
            return (Criteria) this;
        }

        public Criteria andHasXuzhanBetween(Short value1, Short value2) {
            addCriterion("has_xuzhan between", value1, value2, "hasXuzhan");
            return (Criteria) this;
        }

        public Criteria andHasXuzhanNotBetween(Short value1, Short value2) {
            addCriterion("has_xuzhan not between", value1, value2, "hasXuzhan");
            return (Criteria) this;
        }

        public Criteria andCountryCodeIsNull() {
            addCriterion("country_code is null");
            return (Criteria) this;
        }

        public Criteria andCountryCodeIsNotNull() {
            addCriterion("country_code is not null");
            return (Criteria) this;
        }

        public Criteria andCountryCodeEqualTo(String value) {
            addCriterion("country_code =", value, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeNotEqualTo(String value) {
            addCriterion("country_code <>", value, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeGreaterThan(String value) {
            addCriterion("country_code >", value, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeGreaterThanOrEqualTo(String value) {
            addCriterion("country_code >=", value, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeLessThan(String value) {
            addCriterion("country_code <", value, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeLessThanOrEqualTo(String value) {
            addCriterion("country_code <=", value, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeLike(String value) {
            addCriterion("country_code like", value, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeNotLike(String value) {
            addCriterion("country_code not like", value, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeIn(List<String> values) {
            addCriterion("country_code in", values, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeNotIn(List<String> values) {
            addCriterion("country_code not in", values, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeBetween(String value1, String value2) {
            addCriterion("country_code between", value1, value2, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeNotBetween(String value1, String value2) {
            addCriterion("country_code not between", value1, value2, "countryCode");
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

        public Criteria andLastsblcitemIsNull() {
            addCriterion("lastsblcitem is null");
            return (Criteria) this;
        }

        public Criteria andLastsblcitemIsNotNull() {
            addCriterion("lastsblcitem is not null");
            return (Criteria) this;
        }

        public Criteria andLastsblcitemEqualTo(String value) {
            addCriterion("lastsblcitem =", value, "lastsblcitem");
            return (Criteria) this;
        }

        public Criteria andLastsblcitemNotEqualTo(String value) {
            addCriterion("lastsblcitem <>", value, "lastsblcitem");
            return (Criteria) this;
        }

        public Criteria andLastsblcitemGreaterThan(String value) {
            addCriterion("lastsblcitem >", value, "lastsblcitem");
            return (Criteria) this;
        }

        public Criteria andLastsblcitemGreaterThanOrEqualTo(String value) {
            addCriterion("lastsblcitem >=", value, "lastsblcitem");
            return (Criteria) this;
        }

        public Criteria andLastsblcitemLessThan(String value) {
            addCriterion("lastsblcitem <", value, "lastsblcitem");
            return (Criteria) this;
        }

        public Criteria andLastsblcitemLessThanOrEqualTo(String value) {
            addCriterion("lastsblcitem <=", value, "lastsblcitem");
            return (Criteria) this;
        }

        public Criteria andLastsblcitemLike(String value) {
            addCriterion("lastsblcitem like", value, "lastsblcitem");
            return (Criteria) this;
        }

        public Criteria andLastsblcitemNotLike(String value) {
            addCriterion("lastsblcitem not like", value, "lastsblcitem");
            return (Criteria) this;
        }

        public Criteria andLastsblcitemIn(List<String> values) {
            addCriterion("lastsblcitem in", values, "lastsblcitem");
            return (Criteria) this;
        }

        public Criteria andLastsblcitemNotIn(List<String> values) {
            addCriterion("lastsblcitem not in", values, "lastsblcitem");
            return (Criteria) this;
        }

        public Criteria andLastsblcitemBetween(String value1, String value2) {
            addCriterion("lastsblcitem between", value1, value2, "lastsblcitem");
            return (Criteria) this;
        }

        public Criteria andLastsblcitemNotBetween(String value1, String value2) {
            addCriterion("lastsblcitem not between", value1, value2, "lastsblcitem");
            return (Criteria) this;
        }

        public Criteria andSyspQzcodesIsNull() {
            addCriterion("sysp_qzcodes is null");
            return (Criteria) this;
        }

        public Criteria andSyspQzcodesIsNotNull() {
            addCriterion("sysp_qzcodes is not null");
            return (Criteria) this;
        }

        public Criteria andSyspQzcodesEqualTo(String value) {
            addCriterion("sysp_qzcodes =", value, "syspQzcodes");
            return (Criteria) this;
        }

        public Criteria andSyspQzcodesNotEqualTo(String value) {
            addCriterion("sysp_qzcodes <>", value, "syspQzcodes");
            return (Criteria) this;
        }

        public Criteria andSyspQzcodesGreaterThan(String value) {
            addCriterion("sysp_qzcodes >", value, "syspQzcodes");
            return (Criteria) this;
        }

        public Criteria andSyspQzcodesGreaterThanOrEqualTo(String value) {
            addCriterion("sysp_qzcodes >=", value, "syspQzcodes");
            return (Criteria) this;
        }

        public Criteria andSyspQzcodesLessThan(String value) {
            addCriterion("sysp_qzcodes <", value, "syspQzcodes");
            return (Criteria) this;
        }

        public Criteria andSyspQzcodesLessThanOrEqualTo(String value) {
            addCriterion("sysp_qzcodes <=", value, "syspQzcodes");
            return (Criteria) this;
        }

        public Criteria andSyspQzcodesLike(String value) {
            addCriterion("sysp_qzcodes like", value, "syspQzcodes");
            return (Criteria) this;
        }

        public Criteria andSyspQzcodesNotLike(String value) {
            addCriterion("sysp_qzcodes not like", value, "syspQzcodes");
            return (Criteria) this;
        }

        public Criteria andSyspQzcodesIn(List<String> values) {
            addCriterion("sysp_qzcodes in", values, "syspQzcodes");
            return (Criteria) this;
        }

        public Criteria andSyspQzcodesNotIn(List<String> values) {
            addCriterion("sysp_qzcodes not in", values, "syspQzcodes");
            return (Criteria) this;
        }

        public Criteria andSyspQzcodesBetween(String value1, String value2) {
            addCriterion("sysp_qzcodes between", value1, value2, "syspQzcodes");
            return (Criteria) this;
        }

        public Criteria andSyspQzcodesNotBetween(String value1, String value2) {
            addCriterion("sysp_qzcodes not between", value1, value2, "syspQzcodes");
            return (Criteria) this;
        }

        public Criteria andSqrmcZwIdCardNoIsNull() {
            addCriterion("sqrmc_zw_id_card_no is null");
            return (Criteria) this;
        }

        public Criteria andSqrmcZwIdCardNoIsNotNull() {
            addCriterion("sqrmc_zw_id_card_no is not null");
            return (Criteria) this;
        }

        public Criteria andSqrmcZwIdCardNoEqualTo(String value) {
            addCriterion("sqrmc_zw_id_card_no =", value, "sqrmcZwIdCardNo");
            return (Criteria) this;
        }

        public Criteria andSqrmcZwIdCardNoNotEqualTo(String value) {
            addCriterion("sqrmc_zw_id_card_no <>", value, "sqrmcZwIdCardNo");
            return (Criteria) this;
        }

        public Criteria andSqrmcZwIdCardNoGreaterThan(String value) {
            addCriterion("sqrmc_zw_id_card_no >", value, "sqrmcZwIdCardNo");
            return (Criteria) this;
        }

        public Criteria andSqrmcZwIdCardNoGreaterThanOrEqualTo(String value) {
            addCriterion("sqrmc_zw_id_card_no >=", value, "sqrmcZwIdCardNo");
            return (Criteria) this;
        }

        public Criteria andSqrmcZwIdCardNoLessThan(String value) {
            addCriterion("sqrmc_zw_id_card_no <", value, "sqrmcZwIdCardNo");
            return (Criteria) this;
        }

        public Criteria andSqrmcZwIdCardNoLessThanOrEqualTo(String value) {
            addCriterion("sqrmc_zw_id_card_no <=", value, "sqrmcZwIdCardNo");
            return (Criteria) this;
        }

        public Criteria andSqrmcZwIdCardNoLike(String value) {
            addCriterion("sqrmc_zw_id_card_no like", value, "sqrmcZwIdCardNo");
            return (Criteria) this;
        }

        public Criteria andSqrmcZwIdCardNoNotLike(String value) {
            addCriterion("sqrmc_zw_id_card_no not like", value, "sqrmcZwIdCardNo");
            return (Criteria) this;
        }

        public Criteria andSqrmcZwIdCardNoIn(List<String> values) {
            addCriterion("sqrmc_zw_id_card_no in", values, "sqrmcZwIdCardNo");
            return (Criteria) this;
        }

        public Criteria andSqrmcZwIdCardNoNotIn(List<String> values) {
            addCriterion("sqrmc_zw_id_card_no not in", values, "sqrmcZwIdCardNo");
            return (Criteria) this;
        }

        public Criteria andSqrmcZwIdCardNoBetween(String value1, String value2) {
            addCriterion("sqrmc_zw_id_card_no between", value1, value2, "sqrmcZwIdCardNo");
            return (Criteria) this;
        }

        public Criteria andSqrmcZwIdCardNoNotBetween(String value1, String value2) {
            addCriterion("sqrmc_zw_id_card_no not between", value1, value2, "sqrmcZwIdCardNo");
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