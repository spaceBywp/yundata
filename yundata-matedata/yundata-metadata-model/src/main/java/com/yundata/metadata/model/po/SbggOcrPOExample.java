package com.yundata.metadata.model.po;

import java.util.ArrayList;
import java.util.List;

public class SbggOcrPOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SbggOcrPOExample() {
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

        public Criteria andPageIsNull() {
            addCriterion("page is null");
            return (Criteria) this;
        }

        public Criteria andPageIsNotNull() {
            addCriterion("page is not null");
            return (Criteria) this;
        }

        public Criteria andPageEqualTo(Integer value) {
            addCriterion("page =", value, "page");
            return (Criteria) this;
        }

        public Criteria andPageNotEqualTo(Integer value) {
            addCriterion("page <>", value, "page");
            return (Criteria) this;
        }

        public Criteria andPageGreaterThan(Integer value) {
            addCriterion("page >", value, "page");
            return (Criteria) this;
        }

        public Criteria andPageGreaterThanOrEqualTo(Integer value) {
            addCriterion("page >=", value, "page");
            return (Criteria) this;
        }

        public Criteria andPageLessThan(Integer value) {
            addCriterion("page <", value, "page");
            return (Criteria) this;
        }

        public Criteria andPageLessThanOrEqualTo(Integer value) {
            addCriterion("page <=", value, "page");
            return (Criteria) this;
        }

        public Criteria andPageIn(List<Integer> values) {
            addCriterion("page in", values, "page");
            return (Criteria) this;
        }

        public Criteria andPageNotIn(List<Integer> values) {
            addCriterion("page not in", values, "page");
            return (Criteria) this;
        }

        public Criteria andPageBetween(Integer value1, Integer value2) {
            addCriterion("page between", value1, value2, "page");
            return (Criteria) this;
        }

        public Criteria andPageNotBetween(Integer value1, Integer value2) {
            addCriterion("page not between", value1, value2, "page");
            return (Criteria) this;
        }

        public Criteria andAnchorIsNull() {
            addCriterion("anchor is null");
            return (Criteria) this;
        }

        public Criteria andAnchorIsNotNull() {
            addCriterion("anchor is not null");
            return (Criteria) this;
        }

        public Criteria andAnchorEqualTo(String value) {
            addCriterion("anchor =", value, "anchor");
            return (Criteria) this;
        }

        public Criteria andAnchorNotEqualTo(String value) {
            addCriterion("anchor <>", value, "anchor");
            return (Criteria) this;
        }

        public Criteria andAnchorGreaterThan(String value) {
            addCriterion("anchor >", value, "anchor");
            return (Criteria) this;
        }

        public Criteria andAnchorGreaterThanOrEqualTo(String value) {
            addCriterion("anchor >=", value, "anchor");
            return (Criteria) this;
        }

        public Criteria andAnchorLessThan(String value) {
            addCriterion("anchor <", value, "anchor");
            return (Criteria) this;
        }

        public Criteria andAnchorLessThanOrEqualTo(String value) {
            addCriterion("anchor <=", value, "anchor");
            return (Criteria) this;
        }

        public Criteria andAnchorLike(String value) {
            addCriterion("anchor like", value, "anchor");
            return (Criteria) this;
        }

        public Criteria andAnchorNotLike(String value) {
            addCriterion("anchor not like", value, "anchor");
            return (Criteria) this;
        }

        public Criteria andAnchorIn(List<String> values) {
            addCriterion("anchor in", values, "anchor");
            return (Criteria) this;
        }

        public Criteria andAnchorNotIn(List<String> values) {
            addCriterion("anchor not in", values, "anchor");
            return (Criteria) this;
        }

        public Criteria andAnchorBetween(String value1, String value2) {
            addCriterion("anchor between", value1, value2, "anchor");
            return (Criteria) this;
        }

        public Criteria andAnchorNotBetween(String value1, String value2) {
            addCriterion("anchor not between", value1, value2, "anchor");
            return (Criteria) this;
        }

        public Criteria andSbggCategoryIsNull() {
            addCriterion("sbgg_category is null");
            return (Criteria) this;
        }

        public Criteria andSbggCategoryIsNotNull() {
            addCriterion("sbgg_category is not null");
            return (Criteria) this;
        }

        public Criteria andSbggCategoryEqualTo(Integer value) {
            addCriterion("sbgg_category =", value, "sbggCategory");
            return (Criteria) this;
        }

        public Criteria andSbggCategoryNotEqualTo(Integer value) {
            addCriterion("sbgg_category <>", value, "sbggCategory");
            return (Criteria) this;
        }

        public Criteria andSbggCategoryGreaterThan(Integer value) {
            addCriterion("sbgg_category >", value, "sbggCategory");
            return (Criteria) this;
        }

        public Criteria andSbggCategoryGreaterThanOrEqualTo(Integer value) {
            addCriterion("sbgg_category >=", value, "sbggCategory");
            return (Criteria) this;
        }

        public Criteria andSbggCategoryLessThan(Integer value) {
            addCriterion("sbgg_category <", value, "sbggCategory");
            return (Criteria) this;
        }

        public Criteria andSbggCategoryLessThanOrEqualTo(Integer value) {
            addCriterion("sbgg_category <=", value, "sbggCategory");
            return (Criteria) this;
        }

        public Criteria andSbggCategoryIn(List<Integer> values) {
            addCriterion("sbgg_category in", values, "sbggCategory");
            return (Criteria) this;
        }

        public Criteria andSbggCategoryNotIn(List<Integer> values) {
            addCriterion("sbgg_category not in", values, "sbggCategory");
            return (Criteria) this;
        }

        public Criteria andSbggCategoryBetween(Integer value1, Integer value2) {
            addCriterion("sbgg_category between", value1, value2, "sbggCategory");
            return (Criteria) this;
        }

        public Criteria andSbggCategoryNotBetween(Integer value1, Integer value2) {
            addCriterion("sbgg_category not between", value1, value2, "sbggCategory");
            return (Criteria) this;
        }

        public Criteria andSbggqhIsNull() {
            addCriterion("sbggqh is null");
            return (Criteria) this;
        }

        public Criteria andSbggqhIsNotNull() {
            addCriterion("sbggqh is not null");
            return (Criteria) this;
        }

        public Criteria andSbggqhEqualTo(Integer value) {
            addCriterion("sbggqh =", value, "sbggqh");
            return (Criteria) this;
        }

        public Criteria andSbggqhNotEqualTo(Integer value) {
            addCriterion("sbggqh <>", value, "sbggqh");
            return (Criteria) this;
        }

        public Criteria andSbggqhGreaterThan(Integer value) {
            addCriterion("sbggqh >", value, "sbggqh");
            return (Criteria) this;
        }

        public Criteria andSbggqhGreaterThanOrEqualTo(Integer value) {
            addCriterion("sbggqh >=", value, "sbggqh");
            return (Criteria) this;
        }

        public Criteria andSbggqhLessThan(Integer value) {
            addCriterion("sbggqh <", value, "sbggqh");
            return (Criteria) this;
        }

        public Criteria andSbggqhLessThanOrEqualTo(Integer value) {
            addCriterion("sbggqh <=", value, "sbggqh");
            return (Criteria) this;
        }

        public Criteria andSbggqhIn(List<Integer> values) {
            addCriterion("sbggqh in", values, "sbggqh");
            return (Criteria) this;
        }

        public Criteria andSbggqhNotIn(List<Integer> values) {
            addCriterion("sbggqh not in", values, "sbggqh");
            return (Criteria) this;
        }

        public Criteria andSbggqhBetween(Integer value1, Integer value2) {
            addCriterion("sbggqh between", value1, value2, "sbggqh");
            return (Criteria) this;
        }

        public Criteria andSbggqhNotBetween(Integer value1, Integer value2) {
            addCriterion("sbggqh not between", value1, value2, "sbggqh");
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