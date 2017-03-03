package com.yundata.metadata.model.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class BrandInfoSbggLcStaPOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BrandInfoSbggLcStaPOExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
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

        public Criteria andIssueIsNull() {
            addCriterion("issue is null");
            return (Criteria) this;
        }

        public Criteria andIssueIsNotNull() {
            addCriterion("issue is not null");
            return (Criteria) this;
        }

        public Criteria andIssueEqualTo(Integer value) {
            addCriterion("issue =", value, "issue");
            return (Criteria) this;
        }

        public Criteria andIssueNotEqualTo(Integer value) {
            addCriterion("issue <>", value, "issue");
            return (Criteria) this;
        }

        public Criteria andIssueGreaterThan(Integer value) {
            addCriterion("issue >", value, "issue");
            return (Criteria) this;
        }

        public Criteria andIssueGreaterThanOrEqualTo(Integer value) {
            addCriterion("issue >=", value, "issue");
            return (Criteria) this;
        }

        public Criteria andIssueLessThan(Integer value) {
            addCriterion("issue <", value, "issue");
            return (Criteria) this;
        }

        public Criteria andIssueLessThanOrEqualTo(Integer value) {
            addCriterion("issue <=", value, "issue");
            return (Criteria) this;
        }

        public Criteria andIssueIn(List<Integer> values) {
            addCriterion("issue in", values, "issue");
            return (Criteria) this;
        }

        public Criteria andIssueNotIn(List<Integer> values) {
            addCriterion("issue not in", values, "issue");
            return (Criteria) this;
        }

        public Criteria andIssueBetween(Integer value1, Integer value2) {
            addCriterion("issue between", value1, value2, "issue");
            return (Criteria) this;
        }

        public Criteria andIssueNotBetween(Integer value1, Integer value2) {
            addCriterion("issue not between", value1, value2, "issue");
            return (Criteria) this;
        }

        public Criteria andSbggCategoryNameIsNull() {
            addCriterion("sbgg_category_name is null");
            return (Criteria) this;
        }

        public Criteria andSbggCategoryNameIsNotNull() {
            addCriterion("sbgg_category_name is not null");
            return (Criteria) this;
        }

        public Criteria andSbggCategoryNameEqualTo(String value) {
            addCriterion("sbgg_category_name =", value, "sbggCategoryName");
            return (Criteria) this;
        }

        public Criteria andSbggCategoryNameNotEqualTo(String value) {
            addCriterion("sbgg_category_name <>", value, "sbggCategoryName");
            return (Criteria) this;
        }

        public Criteria andSbggCategoryNameGreaterThan(String value) {
            addCriterion("sbgg_category_name >", value, "sbggCategoryName");
            return (Criteria) this;
        }

        public Criteria andSbggCategoryNameGreaterThanOrEqualTo(String value) {
            addCriterion("sbgg_category_name >=", value, "sbggCategoryName");
            return (Criteria) this;
        }

        public Criteria andSbggCategoryNameLessThan(String value) {
            addCriterion("sbgg_category_name <", value, "sbggCategoryName");
            return (Criteria) this;
        }

        public Criteria andSbggCategoryNameLessThanOrEqualTo(String value) {
            addCriterion("sbgg_category_name <=", value, "sbggCategoryName");
            return (Criteria) this;
        }

        public Criteria andSbggCategoryNameLike(String value) {
            addCriterion("sbgg_category_name like", value, "sbggCategoryName");
            return (Criteria) this;
        }

        public Criteria andSbggCategoryNameNotLike(String value) {
            addCriterion("sbgg_category_name not like", value, "sbggCategoryName");
            return (Criteria) this;
        }

        public Criteria andSbggCategoryNameIn(List<String> values) {
            addCriterion("sbgg_category_name in", values, "sbggCategoryName");
            return (Criteria) this;
        }

        public Criteria andSbggCategoryNameNotIn(List<String> values) {
            addCriterion("sbgg_category_name not in", values, "sbggCategoryName");
            return (Criteria) this;
        }

        public Criteria andSbggCategoryNameBetween(String value1, String value2) {
            addCriterion("sbgg_category_name between", value1, value2, "sbggCategoryName");
            return (Criteria) this;
        }

        public Criteria andSbggCategoryNameNotBetween(String value1, String value2) {
            addCriterion("sbgg_category_name not between", value1, value2, "sbggCategoryName");
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

        public Criteria andSbggDateIsNull() {
            addCriterion("sbgg_date is null");
            return (Criteria) this;
        }

        public Criteria andSbggDateIsNotNull() {
            addCriterion("sbgg_date is not null");
            return (Criteria) this;
        }

        public Criteria andSbggDateEqualTo(Date value) {
            addCriterionForJDBCDate("sbgg_date =", value, "sbggDate");
            return (Criteria) this;
        }

        public Criteria andSbggDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("sbgg_date <>", value, "sbggDate");
            return (Criteria) this;
        }

        public Criteria andSbggDateGreaterThan(Date value) {
            addCriterionForJDBCDate("sbgg_date >", value, "sbggDate");
            return (Criteria) this;
        }

        public Criteria andSbggDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("sbgg_date >=", value, "sbggDate");
            return (Criteria) this;
        }

        public Criteria andSbggDateLessThan(Date value) {
            addCriterionForJDBCDate("sbgg_date <", value, "sbggDate");
            return (Criteria) this;
        }

        public Criteria andSbggDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("sbgg_date <=", value, "sbggDate");
            return (Criteria) this;
        }

        public Criteria andSbggDateIn(List<Date> values) {
            addCriterionForJDBCDate("sbgg_date in", values, "sbggDate");
            return (Criteria) this;
        }

        public Criteria andSbggDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("sbgg_date not in", values, "sbggDate");
            return (Criteria) this;
        }

        public Criteria andSbggDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("sbgg_date between", value1, value2, "sbggDate");
            return (Criteria) this;
        }

        public Criteria andSbggDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("sbgg_date not between", value1, value2, "sbggDate");
            return (Criteria) this;
        }

        public Criteria andCategoryIsNull() {
            addCriterion("category is null");
            return (Criteria) this;
        }

        public Criteria andCategoryIsNotNull() {
            addCriterion("category is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryEqualTo(Integer value) {
            addCriterion("category =", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotEqualTo(Integer value) {
            addCriterion("category <>", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryGreaterThan(Integer value) {
            addCriterion("category >", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryGreaterThanOrEqualTo(Integer value) {
            addCriterion("category >=", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryLessThan(Integer value) {
            addCriterion("category <", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryLessThanOrEqualTo(Integer value) {
            addCriterion("category <=", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryIn(List<Integer> values) {
            addCriterion("category in", values, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotIn(List<Integer> values) {
            addCriterion("category not in", values, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryBetween(Integer value1, Integer value2) {
            addCriterion("category between", value1, value2, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotBetween(Integer value1, Integer value2) {
            addCriterion("category not between", value1, value2, "category");
            return (Criteria) this;
        }

        public Criteria andLastestIsNull() {
            addCriterion("lastest is null");
            return (Criteria) this;
        }

        public Criteria andLastestIsNotNull() {
            addCriterion("lastest is not null");
            return (Criteria) this;
        }

        public Criteria andLastestEqualTo(Integer value) {
            addCriterion("lastest =", value, "lastest");
            return (Criteria) this;
        }

        public Criteria andLastestNotEqualTo(Integer value) {
            addCriterion("lastest <>", value, "lastest");
            return (Criteria) this;
        }

        public Criteria andLastestGreaterThan(Integer value) {
            addCriterion("lastest >", value, "lastest");
            return (Criteria) this;
        }

        public Criteria andLastestGreaterThanOrEqualTo(Integer value) {
            addCriterion("lastest >=", value, "lastest");
            return (Criteria) this;
        }

        public Criteria andLastestLessThan(Integer value) {
            addCriterion("lastest <", value, "lastest");
            return (Criteria) this;
        }

        public Criteria andLastestLessThanOrEqualTo(Integer value) {
            addCriterion("lastest <=", value, "lastest");
            return (Criteria) this;
        }

        public Criteria andLastestIn(List<Integer> values) {
            addCriterion("lastest in", values, "lastest");
            return (Criteria) this;
        }

        public Criteria andLastestNotIn(List<Integer> values) {
            addCriterion("lastest not in", values, "lastest");
            return (Criteria) this;
        }

        public Criteria andLastestBetween(Integer value1, Integer value2) {
            addCriterion("lastest between", value1, value2, "lastest");
            return (Criteria) this;
        }

        public Criteria andLastestNotBetween(Integer value1, Integer value2) {
            addCriterion("lastest not between", value1, value2, "lastest");
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

        public Criteria andRegistrantNameIsNull() {
            addCriterion("registrant_name is null");
            return (Criteria) this;
        }

        public Criteria andRegistrantNameIsNotNull() {
            addCriterion("registrant_name is not null");
            return (Criteria) this;
        }

        public Criteria andRegistrantNameEqualTo(String value) {
            addCriterion("registrant_name =", value, "registrantName");
            return (Criteria) this;
        }

        public Criteria andRegistrantNameNotEqualTo(String value) {
            addCriterion("registrant_name <>", value, "registrantName");
            return (Criteria) this;
        }

        public Criteria andRegistrantNameGreaterThan(String value) {
            addCriterion("registrant_name >", value, "registrantName");
            return (Criteria) this;
        }

        public Criteria andRegistrantNameGreaterThanOrEqualTo(String value) {
            addCriterion("registrant_name >=", value, "registrantName");
            return (Criteria) this;
        }

        public Criteria andRegistrantNameLessThan(String value) {
            addCriterion("registrant_name <", value, "registrantName");
            return (Criteria) this;
        }

        public Criteria andRegistrantNameLessThanOrEqualTo(String value) {
            addCriterion("registrant_name <=", value, "registrantName");
            return (Criteria) this;
        }

        public Criteria andRegistrantNameLike(String value) {
            addCriterion("registrant_name like", value, "registrantName");
            return (Criteria) this;
        }

        public Criteria andRegistrantNameNotLike(String value) {
            addCriterion("registrant_name not like", value, "registrantName");
            return (Criteria) this;
        }

        public Criteria andRegistrantNameIn(List<String> values) {
            addCriterion("registrant_name in", values, "registrantName");
            return (Criteria) this;
        }

        public Criteria andRegistrantNameNotIn(List<String> values) {
            addCriterion("registrant_name not in", values, "registrantName");
            return (Criteria) this;
        }

        public Criteria andRegistrantNameBetween(String value1, String value2) {
            addCriterion("registrant_name between", value1, value2, "registrantName");
            return (Criteria) this;
        }

        public Criteria andRegistrantNameNotBetween(String value1, String value2) {
            addCriterion("registrant_name not between", value1, value2, "registrantName");
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