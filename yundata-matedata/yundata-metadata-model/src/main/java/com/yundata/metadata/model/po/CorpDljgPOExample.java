package com.yundata.metadata.model.po;

import java.util.ArrayList;
import java.util.List;

public class CorpDljgPOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CorpDljgPOExample() {
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

        public Criteria andCorpNameIsNull() {
            addCriterion("corp_name is null");
            return (Criteria) this;
        }

        public Criteria andCorpNameIsNotNull() {
            addCriterion("corp_name is not null");
            return (Criteria) this;
        }

        public Criteria andCorpNameEqualTo(String value) {
            addCriterion("corp_name =", value, "corpName");
            return (Criteria) this;
        }

        public Criteria andCorpNameNotEqualTo(String value) {
            addCriterion("corp_name <>", value, "corpName");
            return (Criteria) this;
        }

        public Criteria andCorpNameGreaterThan(String value) {
            addCriterion("corp_name >", value, "corpName");
            return (Criteria) this;
        }

        public Criteria andCorpNameGreaterThanOrEqualTo(String value) {
            addCriterion("corp_name >=", value, "corpName");
            return (Criteria) this;
        }

        public Criteria andCorpNameLessThan(String value) {
            addCriterion("corp_name <", value, "corpName");
            return (Criteria) this;
        }

        public Criteria andCorpNameLessThanOrEqualTo(String value) {
            addCriterion("corp_name <=", value, "corpName");
            return (Criteria) this;
        }

        public Criteria andCorpNameLike(String value) {
            addCriterion("corp_name like", value, "corpName");
            return (Criteria) this;
        }

        public Criteria andCorpNameNotLike(String value) {
            addCriterion("corp_name not like", value, "corpName");
            return (Criteria) this;
        }

        public Criteria andCorpNameIn(List<String> values) {
            addCriterion("corp_name in", values, "corpName");
            return (Criteria) this;
        }

        public Criteria andCorpNameNotIn(List<String> values) {
            addCriterion("corp_name not in", values, "corpName");
            return (Criteria) this;
        }

        public Criteria andCorpNameBetween(String value1, String value2) {
            addCriterion("corp_name between", value1, value2, "corpName");
            return (Criteria) this;
        }

        public Criteria andCorpNameNotBetween(String value1, String value2) {
            addCriterion("corp_name not between", value1, value2, "corpName");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andTelephoneIsNull() {
            addCriterion("telephone is null");
            return (Criteria) this;
        }

        public Criteria andTelephoneIsNotNull() {
            addCriterion("telephone is not null");
            return (Criteria) this;
        }

        public Criteria andTelephoneEqualTo(String value) {
            addCriterion("telephone =", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotEqualTo(String value) {
            addCriterion("telephone <>", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneGreaterThan(String value) {
            addCriterion("telephone >", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneGreaterThanOrEqualTo(String value) {
            addCriterion("telephone >=", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneLessThan(String value) {
            addCriterion("telephone <", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneLessThanOrEqualTo(String value) {
            addCriterion("telephone <=", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneLike(String value) {
            addCriterion("telephone like", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotLike(String value) {
            addCriterion("telephone not like", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneIn(List<String> values) {
            addCriterion("telephone in", values, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotIn(List<String> values) {
            addCriterion("telephone not in", values, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneBetween(String value1, String value2) {
            addCriterion("telephone between", value1, value2, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotBetween(String value1, String value2) {
            addCriterion("telephone not between", value1, value2, "telephone");
            return (Criteria) this;
        }

        public Criteria andOtherNameIsNull() {
            addCriterion("other_name is null");
            return (Criteria) this;
        }

        public Criteria andOtherNameIsNotNull() {
            addCriterion("other_name is not null");
            return (Criteria) this;
        }

        public Criteria andOtherNameEqualTo(String value) {
            addCriterion("other_name =", value, "otherName");
            return (Criteria) this;
        }

        public Criteria andOtherNameNotEqualTo(String value) {
            addCriterion("other_name <>", value, "otherName");
            return (Criteria) this;
        }

        public Criteria andOtherNameGreaterThan(String value) {
            addCriterion("other_name >", value, "otherName");
            return (Criteria) this;
        }

        public Criteria andOtherNameGreaterThanOrEqualTo(String value) {
            addCriterion("other_name >=", value, "otherName");
            return (Criteria) this;
        }

        public Criteria andOtherNameLessThan(String value) {
            addCriterion("other_name <", value, "otherName");
            return (Criteria) this;
        }

        public Criteria andOtherNameLessThanOrEqualTo(String value) {
            addCriterion("other_name <=", value, "otherName");
            return (Criteria) this;
        }

        public Criteria andOtherNameLike(String value) {
            addCriterion("other_name like", value, "otherName");
            return (Criteria) this;
        }

        public Criteria andOtherNameNotLike(String value) {
            addCriterion("other_name not like", value, "otherName");
            return (Criteria) this;
        }

        public Criteria andOtherNameIn(List<String> values) {
            addCriterion("other_name in", values, "otherName");
            return (Criteria) this;
        }

        public Criteria andOtherNameNotIn(List<String> values) {
            addCriterion("other_name not in", values, "otherName");
            return (Criteria) this;
        }

        public Criteria andOtherNameBetween(String value1, String value2) {
            addCriterion("other_name between", value1, value2, "otherName");
            return (Criteria) this;
        }

        public Criteria andOtherNameNotBetween(String value1, String value2) {
            addCriterion("other_name not between", value1, value2, "otherName");
            return (Criteria) this;
        }

        public Criteria andQqIsNull() {
            addCriterion("qq is null");
            return (Criteria) this;
        }

        public Criteria andQqIsNotNull() {
            addCriterion("qq is not null");
            return (Criteria) this;
        }

        public Criteria andQqEqualTo(String value) {
            addCriterion("qq =", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqNotEqualTo(String value) {
            addCriterion("qq <>", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqGreaterThan(String value) {
            addCriterion("qq >", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqGreaterThanOrEqualTo(String value) {
            addCriterion("qq >=", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqLessThan(String value) {
            addCriterion("qq <", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqLessThanOrEqualTo(String value) {
            addCriterion("qq <=", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqLike(String value) {
            addCriterion("qq like", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqNotLike(String value) {
            addCriterion("qq not like", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqIn(List<String> values) {
            addCriterion("qq in", values, "qq");
            return (Criteria) this;
        }

        public Criteria andQqNotIn(List<String> values) {
            addCriterion("qq not in", values, "qq");
            return (Criteria) this;
        }

        public Criteria andQqBetween(String value1, String value2) {
            addCriterion("qq between", value1, value2, "qq");
            return (Criteria) this;
        }

        public Criteria andQqNotBetween(String value1, String value2) {
            addCriterion("qq not between", value1, value2, "qq");
            return (Criteria) this;
        }

        public Criteria andShengfenIsNull() {
            addCriterion("shengfen is null");
            return (Criteria) this;
        }

        public Criteria andShengfenIsNotNull() {
            addCriterion("shengfen is not null");
            return (Criteria) this;
        }

        public Criteria andShengfenEqualTo(String value) {
            addCriterion("shengfen =", value, "shengfen");
            return (Criteria) this;
        }

        public Criteria andShengfenNotEqualTo(String value) {
            addCriterion("shengfen <>", value, "shengfen");
            return (Criteria) this;
        }

        public Criteria andShengfenGreaterThan(String value) {
            addCriterion("shengfen >", value, "shengfen");
            return (Criteria) this;
        }

        public Criteria andShengfenGreaterThanOrEqualTo(String value) {
            addCriterion("shengfen >=", value, "shengfen");
            return (Criteria) this;
        }

        public Criteria andShengfenLessThan(String value) {
            addCriterion("shengfen <", value, "shengfen");
            return (Criteria) this;
        }

        public Criteria andShengfenLessThanOrEqualTo(String value) {
            addCriterion("shengfen <=", value, "shengfen");
            return (Criteria) this;
        }

        public Criteria andShengfenLike(String value) {
            addCriterion("shengfen like", value, "shengfen");
            return (Criteria) this;
        }

        public Criteria andShengfenNotLike(String value) {
            addCriterion("shengfen not like", value, "shengfen");
            return (Criteria) this;
        }

        public Criteria andShengfenIn(List<String> values) {
            addCriterion("shengfen in", values, "shengfen");
            return (Criteria) this;
        }

        public Criteria andShengfenNotIn(List<String> values) {
            addCriterion("shengfen not in", values, "shengfen");
            return (Criteria) this;
        }

        public Criteria andShengfenBetween(String value1, String value2) {
            addCriterion("shengfen between", value1, value2, "shengfen");
            return (Criteria) this;
        }

        public Criteria andShengfenNotBetween(String value1, String value2) {
            addCriterion("shengfen not between", value1, value2, "shengfen");
            return (Criteria) this;
        }

        public Criteria andCityIsNull() {
            addCriterion("city is null");
            return (Criteria) this;
        }

        public Criteria andCityIsNotNull() {
            addCriterion("city is not null");
            return (Criteria) this;
        }

        public Criteria andCityEqualTo(String value) {
            addCriterion("city =", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotEqualTo(String value) {
            addCriterion("city <>", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThan(String value) {
            addCriterion("city >", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThanOrEqualTo(String value) {
            addCriterion("city >=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThan(String value) {
            addCriterion("city <", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThanOrEqualTo(String value) {
            addCriterion("city <=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLike(String value) {
            addCriterion("city like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotLike(String value) {
            addCriterion("city not like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityIn(List<String> values) {
            addCriterion("city in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotIn(List<String> values) {
            addCriterion("city not in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityBetween(String value1, String value2) {
            addCriterion("city between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotBetween(String value1, String value2) {
            addCriterion("city not between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andSimpleNameIsNull() {
            addCriterion("simple_name is null");
            return (Criteria) this;
        }

        public Criteria andSimpleNameIsNotNull() {
            addCriterion("simple_name is not null");
            return (Criteria) this;
        }

        public Criteria andSimpleNameEqualTo(String value) {
            addCriterion("simple_name =", value, "simpleName");
            return (Criteria) this;
        }

        public Criteria andSimpleNameNotEqualTo(String value) {
            addCriterion("simple_name <>", value, "simpleName");
            return (Criteria) this;
        }

        public Criteria andSimpleNameGreaterThan(String value) {
            addCriterion("simple_name >", value, "simpleName");
            return (Criteria) this;
        }

        public Criteria andSimpleNameGreaterThanOrEqualTo(String value) {
            addCriterion("simple_name >=", value, "simpleName");
            return (Criteria) this;
        }

        public Criteria andSimpleNameLessThan(String value) {
            addCriterion("simple_name <", value, "simpleName");
            return (Criteria) this;
        }

        public Criteria andSimpleNameLessThanOrEqualTo(String value) {
            addCriterion("simple_name <=", value, "simpleName");
            return (Criteria) this;
        }

        public Criteria andSimpleNameLike(String value) {
            addCriterion("simple_name like", value, "simpleName");
            return (Criteria) this;
        }

        public Criteria andSimpleNameNotLike(String value) {
            addCriterion("simple_name not like", value, "simpleName");
            return (Criteria) this;
        }

        public Criteria andSimpleNameIn(List<String> values) {
            addCriterion("simple_name in", values, "simpleName");
            return (Criteria) this;
        }

        public Criteria andSimpleNameNotIn(List<String> values) {
            addCriterion("simple_name not in", values, "simpleName");
            return (Criteria) this;
        }

        public Criteria andSimpleNameBetween(String value1, String value2) {
            addCriterion("simple_name between", value1, value2, "simpleName");
            return (Criteria) this;
        }

        public Criteria andSimpleNameNotBetween(String value1, String value2) {
            addCriterion("simple_name not between", value1, value2, "simpleName");
            return (Criteria) this;
        }

        public Criteria andShengfenCnIsNull() {
            addCriterion("shengfen_cn is null");
            return (Criteria) this;
        }

        public Criteria andShengfenCnIsNotNull() {
            addCriterion("shengfen_cn is not null");
            return (Criteria) this;
        }

        public Criteria andShengfenCnEqualTo(String value) {
            addCriterion("shengfen_cn =", value, "shengfenCn");
            return (Criteria) this;
        }

        public Criteria andShengfenCnNotEqualTo(String value) {
            addCriterion("shengfen_cn <>", value, "shengfenCn");
            return (Criteria) this;
        }

        public Criteria andShengfenCnGreaterThan(String value) {
            addCriterion("shengfen_cn >", value, "shengfenCn");
            return (Criteria) this;
        }

        public Criteria andShengfenCnGreaterThanOrEqualTo(String value) {
            addCriterion("shengfen_cn >=", value, "shengfenCn");
            return (Criteria) this;
        }

        public Criteria andShengfenCnLessThan(String value) {
            addCriterion("shengfen_cn <", value, "shengfenCn");
            return (Criteria) this;
        }

        public Criteria andShengfenCnLessThanOrEqualTo(String value) {
            addCriterion("shengfen_cn <=", value, "shengfenCn");
            return (Criteria) this;
        }

        public Criteria andShengfenCnLike(String value) {
            addCriterion("shengfen_cn like", value, "shengfenCn");
            return (Criteria) this;
        }

        public Criteria andShengfenCnNotLike(String value) {
            addCriterion("shengfen_cn not like", value, "shengfenCn");
            return (Criteria) this;
        }

        public Criteria andShengfenCnIn(List<String> values) {
            addCriterion("shengfen_cn in", values, "shengfenCn");
            return (Criteria) this;
        }

        public Criteria andShengfenCnNotIn(List<String> values) {
            addCriterion("shengfen_cn not in", values, "shengfenCn");
            return (Criteria) this;
        }

        public Criteria andShengfenCnBetween(String value1, String value2) {
            addCriterion("shengfen_cn between", value1, value2, "shengfenCn");
            return (Criteria) this;
        }

        public Criteria andShengfenCnNotBetween(String value1, String value2) {
            addCriterion("shengfen_cn not between", value1, value2, "shengfenCn");
            return (Criteria) this;
        }

        public Criteria andCityCnIsNull() {
            addCriterion("city_cn is null");
            return (Criteria) this;
        }

        public Criteria andCityCnIsNotNull() {
            addCriterion("city_cn is not null");
            return (Criteria) this;
        }

        public Criteria andCityCnEqualTo(String value) {
            addCriterion("city_cn =", value, "cityCn");
            return (Criteria) this;
        }

        public Criteria andCityCnNotEqualTo(String value) {
            addCriterion("city_cn <>", value, "cityCn");
            return (Criteria) this;
        }

        public Criteria andCityCnGreaterThan(String value) {
            addCriterion("city_cn >", value, "cityCn");
            return (Criteria) this;
        }

        public Criteria andCityCnGreaterThanOrEqualTo(String value) {
            addCriterion("city_cn >=", value, "cityCn");
            return (Criteria) this;
        }

        public Criteria andCityCnLessThan(String value) {
            addCriterion("city_cn <", value, "cityCn");
            return (Criteria) this;
        }

        public Criteria andCityCnLessThanOrEqualTo(String value) {
            addCriterion("city_cn <=", value, "cityCn");
            return (Criteria) this;
        }

        public Criteria andCityCnLike(String value) {
            addCriterion("city_cn like", value, "cityCn");
            return (Criteria) this;
        }

        public Criteria andCityCnNotLike(String value) {
            addCriterion("city_cn not like", value, "cityCn");
            return (Criteria) this;
        }

        public Criteria andCityCnIn(List<String> values) {
            addCriterion("city_cn in", values, "cityCn");
            return (Criteria) this;
        }

        public Criteria andCityCnNotIn(List<String> values) {
            addCriterion("city_cn not in", values, "cityCn");
            return (Criteria) this;
        }

        public Criteria andCityCnBetween(String value1, String value2) {
            addCriterion("city_cn between", value1, value2, "cityCn");
            return (Criteria) this;
        }

        public Criteria andCityCnNotBetween(String value1, String value2) {
            addCriterion("city_cn not between", value1, value2, "cityCn");
            return (Criteria) this;
        }

        public Criteria andPcIsNull() {
            addCriterion("pc is null");
            return (Criteria) this;
        }

        public Criteria andPcIsNotNull() {
            addCriterion("pc is not null");
            return (Criteria) this;
        }

        public Criteria andPcEqualTo(String value) {
            addCriterion("pc =", value, "pc");
            return (Criteria) this;
        }

        public Criteria andPcNotEqualTo(String value) {
            addCriterion("pc <>", value, "pc");
            return (Criteria) this;
        }

        public Criteria andPcGreaterThan(String value) {
            addCriterion("pc >", value, "pc");
            return (Criteria) this;
        }

        public Criteria andPcGreaterThanOrEqualTo(String value) {
            addCriterion("pc >=", value, "pc");
            return (Criteria) this;
        }

        public Criteria andPcLessThan(String value) {
            addCriterion("pc <", value, "pc");
            return (Criteria) this;
        }

        public Criteria andPcLessThanOrEqualTo(String value) {
            addCriterion("pc <=", value, "pc");
            return (Criteria) this;
        }

        public Criteria andPcLike(String value) {
            addCriterion("pc like", value, "pc");
            return (Criteria) this;
        }

        public Criteria andPcNotLike(String value) {
            addCriterion("pc not like", value, "pc");
            return (Criteria) this;
        }

        public Criteria andPcIn(List<String> values) {
            addCriterion("pc in", values, "pc");
            return (Criteria) this;
        }

        public Criteria andPcNotIn(List<String> values) {
            addCriterion("pc not in", values, "pc");
            return (Criteria) this;
        }

        public Criteria andPcBetween(String value1, String value2) {
            addCriterion("pc between", value1, value2, "pc");
            return (Criteria) this;
        }

        public Criteria andPcNotBetween(String value1, String value2) {
            addCriterion("pc not between", value1, value2, "pc");
            return (Criteria) this;
        }

        public Criteria andGraspedCountIsNull() {
            addCriterion("grasped_count is null");
            return (Criteria) this;
        }

        public Criteria andGraspedCountIsNotNull() {
            addCriterion("grasped_count is not null");
            return (Criteria) this;
        }

        public Criteria andGraspedCountEqualTo(Short value) {
            addCriterion("grasped_count =", value, "graspedCount");
            return (Criteria) this;
        }

        public Criteria andGraspedCountNotEqualTo(Short value) {
            addCriterion("grasped_count <>", value, "graspedCount");
            return (Criteria) this;
        }

        public Criteria andGraspedCountGreaterThan(Short value) {
            addCriterion("grasped_count >", value, "graspedCount");
            return (Criteria) this;
        }

        public Criteria andGraspedCountGreaterThanOrEqualTo(Short value) {
            addCriterion("grasped_count >=", value, "graspedCount");
            return (Criteria) this;
        }

        public Criteria andGraspedCountLessThan(Short value) {
            addCriterion("grasped_count <", value, "graspedCount");
            return (Criteria) this;
        }

        public Criteria andGraspedCountLessThanOrEqualTo(Short value) {
            addCriterion("grasped_count <=", value, "graspedCount");
            return (Criteria) this;
        }

        public Criteria andGraspedCountIn(List<Short> values) {
            addCriterion("grasped_count in", values, "graspedCount");
            return (Criteria) this;
        }

        public Criteria andGraspedCountNotIn(List<Short> values) {
            addCriterion("grasped_count not in", values, "graspedCount");
            return (Criteria) this;
        }

        public Criteria andGraspedCountBetween(Short value1, Short value2) {
            addCriterion("grasped_count between", value1, value2, "graspedCount");
            return (Criteria) this;
        }

        public Criteria andGraspedCountNotBetween(Short value1, Short value2) {
            addCriterion("grasped_count not between", value1, value2, "graspedCount");
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

        public Criteria andSynDlrIsNull() {
            addCriterion("syn_dlr is null");
            return (Criteria) this;
        }

        public Criteria andSynDlrIsNotNull() {
            addCriterion("syn_dlr is not null");
            return (Criteria) this;
        }

        public Criteria andSynDlrEqualTo(Double value) {
            addCriterion("syn_dlr =", value, "synDlr");
            return (Criteria) this;
        }

        public Criteria andSynDlrNotEqualTo(Double value) {
            addCriterion("syn_dlr <>", value, "synDlr");
            return (Criteria) this;
        }

        public Criteria andSynDlrGreaterThan(Double value) {
            addCriterion("syn_dlr >", value, "synDlr");
            return (Criteria) this;
        }

        public Criteria andSynDlrGreaterThanOrEqualTo(Double value) {
            addCriterion("syn_dlr >=", value, "synDlr");
            return (Criteria) this;
        }

        public Criteria andSynDlrLessThan(Double value) {
            addCriterion("syn_dlr <", value, "synDlr");
            return (Criteria) this;
        }

        public Criteria andSynDlrLessThanOrEqualTo(Double value) {
            addCriterion("syn_dlr <=", value, "synDlr");
            return (Criteria) this;
        }

        public Criteria andSynDlrIn(List<Double> values) {
            addCriterion("syn_dlr in", values, "synDlr");
            return (Criteria) this;
        }

        public Criteria andSynDlrNotIn(List<Double> values) {
            addCriterion("syn_dlr not in", values, "synDlr");
            return (Criteria) this;
        }

        public Criteria andSynDlrBetween(Double value1, Double value2) {
            addCriterion("syn_dlr between", value1, value2, "synDlr");
            return (Criteria) this;
        }

        public Criteria andSynDlrNotBetween(Double value1, Double value2) {
            addCriterion("syn_dlr not between", value1, value2, "synDlr");
            return (Criteria) this;
        }

        public Criteria andContactPhoneIsNull() {
            addCriterion("contact_phone is null");
            return (Criteria) this;
        }

        public Criteria andContactPhoneIsNotNull() {
            addCriterion("contact_phone is not null");
            return (Criteria) this;
        }

        public Criteria andContactPhoneEqualTo(String value) {
            addCriterion("contact_phone =", value, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneNotEqualTo(String value) {
            addCriterion("contact_phone <>", value, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneGreaterThan(String value) {
            addCriterion("contact_phone >", value, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("contact_phone >=", value, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneLessThan(String value) {
            addCriterion("contact_phone <", value, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneLessThanOrEqualTo(String value) {
            addCriterion("contact_phone <=", value, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneLike(String value) {
            addCriterion("contact_phone like", value, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneNotLike(String value) {
            addCriterion("contact_phone not like", value, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneIn(List<String> values) {
            addCriterion("contact_phone in", values, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneNotIn(List<String> values) {
            addCriterion("contact_phone not in", values, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneBetween(String value1, String value2) {
            addCriterion("contact_phone between", value1, value2, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneNotBetween(String value1, String value2) {
            addCriterion("contact_phone not between", value1, value2, "contactPhone");
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