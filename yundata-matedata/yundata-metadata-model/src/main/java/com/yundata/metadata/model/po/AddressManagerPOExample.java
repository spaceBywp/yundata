package com.yundata.metadata.model.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AddressManagerPOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AddressManagerPOExample() {
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

        public Criteria andAddresseeNameIsNull() {
            addCriterion("addressee_name is null");
            return (Criteria) this;
        }

        public Criteria andAddresseeNameIsNotNull() {
            addCriterion("addressee_name is not null");
            return (Criteria) this;
        }

        public Criteria andAddresseeNameEqualTo(String value) {
            addCriterion("addressee_name =", value, "addresseeName");
            return (Criteria) this;
        }

        public Criteria andAddresseeNameNotEqualTo(String value) {
            addCriterion("addressee_name <>", value, "addresseeName");
            return (Criteria) this;
        }

        public Criteria andAddresseeNameGreaterThan(String value) {
            addCriterion("addressee_name >", value, "addresseeName");
            return (Criteria) this;
        }

        public Criteria andAddresseeNameGreaterThanOrEqualTo(String value) {
            addCriterion("addressee_name >=", value, "addresseeName");
            return (Criteria) this;
        }

        public Criteria andAddresseeNameLessThan(String value) {
            addCriterion("addressee_name <", value, "addresseeName");
            return (Criteria) this;
        }

        public Criteria andAddresseeNameLessThanOrEqualTo(String value) {
            addCriterion("addressee_name <=", value, "addresseeName");
            return (Criteria) this;
        }

        public Criteria andAddresseeNameLike(String value) {
            addCriterion("addressee_name like", value, "addresseeName");
            return (Criteria) this;
        }

        public Criteria andAddresseeNameNotLike(String value) {
            addCriterion("addressee_name not like", value, "addresseeName");
            return (Criteria) this;
        }

        public Criteria andAddresseeNameIn(List<String> values) {
            addCriterion("addressee_name in", values, "addresseeName");
            return (Criteria) this;
        }

        public Criteria andAddresseeNameNotIn(List<String> values) {
            addCriterion("addressee_name not in", values, "addresseeName");
            return (Criteria) this;
        }

        public Criteria andAddresseeNameBetween(String value1, String value2) {
            addCriterion("addressee_name between", value1, value2, "addresseeName");
            return (Criteria) this;
        }

        public Criteria andAddresseeNameNotBetween(String value1, String value2) {
            addCriterion("addressee_name not between", value1, value2, "addresseeName");
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

        public Criteria andLocalProvinceIsNull() {
            addCriterion("local_province is null");
            return (Criteria) this;
        }

        public Criteria andLocalProvinceIsNotNull() {
            addCriterion("local_province is not null");
            return (Criteria) this;
        }

        public Criteria andLocalProvinceEqualTo(String value) {
            addCriterion("local_province =", value, "localProvince");
            return (Criteria) this;
        }

        public Criteria andLocalProvinceNotEqualTo(String value) {
            addCriterion("local_province <>", value, "localProvince");
            return (Criteria) this;
        }

        public Criteria andLocalProvinceGreaterThan(String value) {
            addCriterion("local_province >", value, "localProvince");
            return (Criteria) this;
        }

        public Criteria andLocalProvinceGreaterThanOrEqualTo(String value) {
            addCriterion("local_province >=", value, "localProvince");
            return (Criteria) this;
        }

        public Criteria andLocalProvinceLessThan(String value) {
            addCriterion("local_province <", value, "localProvince");
            return (Criteria) this;
        }

        public Criteria andLocalProvinceLessThanOrEqualTo(String value) {
            addCriterion("local_province <=", value, "localProvince");
            return (Criteria) this;
        }

        public Criteria andLocalProvinceLike(String value) {
            addCriterion("local_province like", value, "localProvince");
            return (Criteria) this;
        }

        public Criteria andLocalProvinceNotLike(String value) {
            addCriterion("local_province not like", value, "localProvince");
            return (Criteria) this;
        }

        public Criteria andLocalProvinceIn(List<String> values) {
            addCriterion("local_province in", values, "localProvince");
            return (Criteria) this;
        }

        public Criteria andLocalProvinceNotIn(List<String> values) {
            addCriterion("local_province not in", values, "localProvince");
            return (Criteria) this;
        }

        public Criteria andLocalProvinceBetween(String value1, String value2) {
            addCriterion("local_province between", value1, value2, "localProvince");
            return (Criteria) this;
        }

        public Criteria andLocalProvinceNotBetween(String value1, String value2) {
            addCriterion("local_province not between", value1, value2, "localProvince");
            return (Criteria) this;
        }

        public Criteria andLocalCityIsNull() {
            addCriterion("local_city is null");
            return (Criteria) this;
        }

        public Criteria andLocalCityIsNotNull() {
            addCriterion("local_city is not null");
            return (Criteria) this;
        }

        public Criteria andLocalCityEqualTo(String value) {
            addCriterion("local_city =", value, "localCity");
            return (Criteria) this;
        }

        public Criteria andLocalCityNotEqualTo(String value) {
            addCriterion("local_city <>", value, "localCity");
            return (Criteria) this;
        }

        public Criteria andLocalCityGreaterThan(String value) {
            addCriterion("local_city >", value, "localCity");
            return (Criteria) this;
        }

        public Criteria andLocalCityGreaterThanOrEqualTo(String value) {
            addCriterion("local_city >=", value, "localCity");
            return (Criteria) this;
        }

        public Criteria andLocalCityLessThan(String value) {
            addCriterion("local_city <", value, "localCity");
            return (Criteria) this;
        }

        public Criteria andLocalCityLessThanOrEqualTo(String value) {
            addCriterion("local_city <=", value, "localCity");
            return (Criteria) this;
        }

        public Criteria andLocalCityLike(String value) {
            addCriterion("local_city like", value, "localCity");
            return (Criteria) this;
        }

        public Criteria andLocalCityNotLike(String value) {
            addCriterion("local_city not like", value, "localCity");
            return (Criteria) this;
        }

        public Criteria andLocalCityIn(List<String> values) {
            addCriterion("local_city in", values, "localCity");
            return (Criteria) this;
        }

        public Criteria andLocalCityNotIn(List<String> values) {
            addCriterion("local_city not in", values, "localCity");
            return (Criteria) this;
        }

        public Criteria andLocalCityBetween(String value1, String value2) {
            addCriterion("local_city between", value1, value2, "localCity");
            return (Criteria) this;
        }

        public Criteria andLocalCityNotBetween(String value1, String value2) {
            addCriterion("local_city not between", value1, value2, "localCity");
            return (Criteria) this;
        }

        public Criteria andLocalTownIsNull() {
            addCriterion("local_town is null");
            return (Criteria) this;
        }

        public Criteria andLocalTownIsNotNull() {
            addCriterion("local_town is not null");
            return (Criteria) this;
        }

        public Criteria andLocalTownEqualTo(String value) {
            addCriterion("local_town =", value, "localTown");
            return (Criteria) this;
        }

        public Criteria andLocalTownNotEqualTo(String value) {
            addCriterion("local_town <>", value, "localTown");
            return (Criteria) this;
        }

        public Criteria andLocalTownGreaterThan(String value) {
            addCriterion("local_town >", value, "localTown");
            return (Criteria) this;
        }

        public Criteria andLocalTownGreaterThanOrEqualTo(String value) {
            addCriterion("local_town >=", value, "localTown");
            return (Criteria) this;
        }

        public Criteria andLocalTownLessThan(String value) {
            addCriterion("local_town <", value, "localTown");
            return (Criteria) this;
        }

        public Criteria andLocalTownLessThanOrEqualTo(String value) {
            addCriterion("local_town <=", value, "localTown");
            return (Criteria) this;
        }

        public Criteria andLocalTownLike(String value) {
            addCriterion("local_town like", value, "localTown");
            return (Criteria) this;
        }

        public Criteria andLocalTownNotLike(String value) {
            addCriterion("local_town not like", value, "localTown");
            return (Criteria) this;
        }

        public Criteria andLocalTownIn(List<String> values) {
            addCriterion("local_town in", values, "localTown");
            return (Criteria) this;
        }

        public Criteria andLocalTownNotIn(List<String> values) {
            addCriterion("local_town not in", values, "localTown");
            return (Criteria) this;
        }

        public Criteria andLocalTownBetween(String value1, String value2) {
            addCriterion("local_town between", value1, value2, "localTown");
            return (Criteria) this;
        }

        public Criteria andLocalTownNotBetween(String value1, String value2) {
            addCriterion("local_town not between", value1, value2, "localTown");
            return (Criteria) this;
        }

        public Criteria andStreetAddressIsNull() {
            addCriterion("street_address is null");
            return (Criteria) this;
        }

        public Criteria andStreetAddressIsNotNull() {
            addCriterion("street_address is not null");
            return (Criteria) this;
        }

        public Criteria andStreetAddressEqualTo(String value) {
            addCriterion("street_address =", value, "streetAddress");
            return (Criteria) this;
        }

        public Criteria andStreetAddressNotEqualTo(String value) {
            addCriterion("street_address <>", value, "streetAddress");
            return (Criteria) this;
        }

        public Criteria andStreetAddressGreaterThan(String value) {
            addCriterion("street_address >", value, "streetAddress");
            return (Criteria) this;
        }

        public Criteria andStreetAddressGreaterThanOrEqualTo(String value) {
            addCriterion("street_address >=", value, "streetAddress");
            return (Criteria) this;
        }

        public Criteria andStreetAddressLessThan(String value) {
            addCriterion("street_address <", value, "streetAddress");
            return (Criteria) this;
        }

        public Criteria andStreetAddressLessThanOrEqualTo(String value) {
            addCriterion("street_address <=", value, "streetAddress");
            return (Criteria) this;
        }

        public Criteria andStreetAddressLike(String value) {
            addCriterion("street_address like", value, "streetAddress");
            return (Criteria) this;
        }

        public Criteria andStreetAddressNotLike(String value) {
            addCriterion("street_address not like", value, "streetAddress");
            return (Criteria) this;
        }

        public Criteria andStreetAddressIn(List<String> values) {
            addCriterion("street_address in", values, "streetAddress");
            return (Criteria) this;
        }

        public Criteria andStreetAddressNotIn(List<String> values) {
            addCriterion("street_address not in", values, "streetAddress");
            return (Criteria) this;
        }

        public Criteria andStreetAddressBetween(String value1, String value2) {
            addCriterion("street_address between", value1, value2, "streetAddress");
            return (Criteria) this;
        }

        public Criteria andStreetAddressNotBetween(String value1, String value2) {
            addCriterion("street_address not between", value1, value2, "streetAddress");
            return (Criteria) this;
        }

        public Criteria andZipCodeIsNull() {
            addCriterion("zip_code is null");
            return (Criteria) this;
        }

        public Criteria andZipCodeIsNotNull() {
            addCriterion("zip_code is not null");
            return (Criteria) this;
        }

        public Criteria andZipCodeEqualTo(String value) {
            addCriterion("zip_code =", value, "zipCode");
            return (Criteria) this;
        }

        public Criteria andZipCodeNotEqualTo(String value) {
            addCriterion("zip_code <>", value, "zipCode");
            return (Criteria) this;
        }

        public Criteria andZipCodeGreaterThan(String value) {
            addCriterion("zip_code >", value, "zipCode");
            return (Criteria) this;
        }

        public Criteria andZipCodeGreaterThanOrEqualTo(String value) {
            addCriterion("zip_code >=", value, "zipCode");
            return (Criteria) this;
        }

        public Criteria andZipCodeLessThan(String value) {
            addCriterion("zip_code <", value, "zipCode");
            return (Criteria) this;
        }

        public Criteria andZipCodeLessThanOrEqualTo(String value) {
            addCriterion("zip_code <=", value, "zipCode");
            return (Criteria) this;
        }

        public Criteria andZipCodeLike(String value) {
            addCriterion("zip_code like", value, "zipCode");
            return (Criteria) this;
        }

        public Criteria andZipCodeNotLike(String value) {
            addCriterion("zip_code not like", value, "zipCode");
            return (Criteria) this;
        }

        public Criteria andZipCodeIn(List<String> values) {
            addCriterion("zip_code in", values, "zipCode");
            return (Criteria) this;
        }

        public Criteria andZipCodeNotIn(List<String> values) {
            addCriterion("zip_code not in", values, "zipCode");
            return (Criteria) this;
        }

        public Criteria andZipCodeBetween(String value1, String value2) {
            addCriterion("zip_code between", value1, value2, "zipCode");
            return (Criteria) this;
        }

        public Criteria andZipCodeNotBetween(String value1, String value2) {
            addCriterion("zip_code not between", value1, value2, "zipCode");
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

        public Criteria andIsDefaultIsNull() {
            addCriterion("is_default is null");
            return (Criteria) this;
        }

        public Criteria andIsDefaultIsNotNull() {
            addCriterion("is_default is not null");
            return (Criteria) this;
        }

        public Criteria andIsDefaultEqualTo(Integer value) {
            addCriterion("is_default =", value, "isDefault");
            return (Criteria) this;
        }

        public Criteria andIsDefaultNotEqualTo(Integer value) {
            addCriterion("is_default <>", value, "isDefault");
            return (Criteria) this;
        }

        public Criteria andIsDefaultGreaterThan(Integer value) {
            addCriterion("is_default >", value, "isDefault");
            return (Criteria) this;
        }

        public Criteria andIsDefaultGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_default >=", value, "isDefault");
            return (Criteria) this;
        }

        public Criteria andIsDefaultLessThan(Integer value) {
            addCriterion("is_default <", value, "isDefault");
            return (Criteria) this;
        }

        public Criteria andIsDefaultLessThanOrEqualTo(Integer value) {
            addCriterion("is_default <=", value, "isDefault");
            return (Criteria) this;
        }

        public Criteria andIsDefaultIn(List<Integer> values) {
            addCriterion("is_default in", values, "isDefault");
            return (Criteria) this;
        }

        public Criteria andIsDefaultNotIn(List<Integer> values) {
            addCriterion("is_default not in", values, "isDefault");
            return (Criteria) this;
        }

        public Criteria andIsDefaultBetween(Integer value1, Integer value2) {
            addCriterion("is_default between", value1, value2, "isDefault");
            return (Criteria) this;
        }

        public Criteria andIsDefaultNotBetween(Integer value1, Integer value2) {
            addCriterion("is_default not between", value1, value2, "isDefault");
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