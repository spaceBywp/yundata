package com.yundata.metadata.model.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BrandInfoGonggaoinfoPOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BrandInfoGonggaoinfoPOExample() {
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

        public Criteria andZyqqxIsNull() {
            addCriterion("zyqqx is null");
            return (Criteria) this;
        }

        public Criteria andZyqqxIsNotNull() {
            addCriterion("zyqqx is not null");
            return (Criteria) this;
        }

        public Criteria andZyqqxEqualTo(String value) {
            addCriterion("zyqqx =", value, "zyqqx");
            return (Criteria) this;
        }

        public Criteria andZyqqxNotEqualTo(String value) {
            addCriterion("zyqqx <>", value, "zyqqx");
            return (Criteria) this;
        }

        public Criteria andZyqqxGreaterThan(String value) {
            addCriterion("zyqqx >", value, "zyqqx");
            return (Criteria) this;
        }

        public Criteria andZyqqxGreaterThanOrEqualTo(String value) {
            addCriterion("zyqqx >=", value, "zyqqx");
            return (Criteria) this;
        }

        public Criteria andZyqqxLessThan(String value) {
            addCriterion("zyqqx <", value, "zyqqx");
            return (Criteria) this;
        }

        public Criteria andZyqqxLessThanOrEqualTo(String value) {
            addCriterion("zyqqx <=", value, "zyqqx");
            return (Criteria) this;
        }

        public Criteria andZyqqxLike(String value) {
            addCriterion("zyqqx like", value, "zyqqx");
            return (Criteria) this;
        }

        public Criteria andZyqqxNotLike(String value) {
            addCriterion("zyqqx not like", value, "zyqqx");
            return (Criteria) this;
        }

        public Criteria andZyqqxIn(List<String> values) {
            addCriterion("zyqqx in", values, "zyqqx");
            return (Criteria) this;
        }

        public Criteria andZyqqxNotIn(List<String> values) {
            addCriterion("zyqqx not in", values, "zyqqx");
            return (Criteria) this;
        }

        public Criteria andZyqqxBetween(String value1, String value2) {
            addCriterion("zyqqx between", value1, value2, "zyqqx");
            return (Criteria) this;
        }

        public Criteria andZyqqxNotBetween(String value1, String value2) {
            addCriterion("zyqqx not between", value1, value2, "zyqqx");
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

        public Criteria andHasXuzhanIsNull() {
            addCriterion("has_xuzhan is null");
            return (Criteria) this;
        }

        public Criteria andHasXuzhanIsNotNull() {
            addCriterion("has_xuzhan is not null");
            return (Criteria) this;
        }

        public Criteria andHasXuzhanEqualTo(Double value) {
            addCriterion("has_xuzhan =", value, "hasXuzhan");
            return (Criteria) this;
        }

        public Criteria andHasXuzhanNotEqualTo(Double value) {
            addCriterion("has_xuzhan <>", value, "hasXuzhan");
            return (Criteria) this;
        }

        public Criteria andHasXuzhanGreaterThan(Double value) {
            addCriterion("has_xuzhan >", value, "hasXuzhan");
            return (Criteria) this;
        }

        public Criteria andHasXuzhanGreaterThanOrEqualTo(Double value) {
            addCriterion("has_xuzhan >=", value, "hasXuzhan");
            return (Criteria) this;
        }

        public Criteria andHasXuzhanLessThan(Double value) {
            addCriterion("has_xuzhan <", value, "hasXuzhan");
            return (Criteria) this;
        }

        public Criteria andHasXuzhanLessThanOrEqualTo(Double value) {
            addCriterion("has_xuzhan <=", value, "hasXuzhan");
            return (Criteria) this;
        }

        public Criteria andHasXuzhanIn(List<Double> values) {
            addCriterion("has_xuzhan in", values, "hasXuzhan");
            return (Criteria) this;
        }

        public Criteria andHasXuzhanNotIn(List<Double> values) {
            addCriterion("has_xuzhan not in", values, "hasXuzhan");
            return (Criteria) this;
        }

        public Criteria andHasXuzhanBetween(Double value1, Double value2) {
            addCriterion("has_xuzhan between", value1, value2, "hasXuzhan");
            return (Criteria) this;
        }

        public Criteria andHasXuzhanNotBetween(Double value1, Double value2) {
            addCriterion("has_xuzhan not between", value1, value2, "hasXuzhan");
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