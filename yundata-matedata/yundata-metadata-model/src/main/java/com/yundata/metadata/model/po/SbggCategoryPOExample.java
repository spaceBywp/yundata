package com.yundata.metadata.model.po;

import java.util.ArrayList;
import java.util.List;

public class SbggCategoryPOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SbggCategoryPOExample() {
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

        public Criteria andSbggIdIsNull() {
            addCriterion("sbgg_id is null");
            return (Criteria) this;
        }

        public Criteria andSbggIdIsNotNull() {
            addCriterion("sbgg_id is not null");
            return (Criteria) this;
        }

        public Criteria andSbggIdEqualTo(String value) {
            addCriterion("sbgg_id =", value, "sbggId");
            return (Criteria) this;
        }

        public Criteria andSbggIdNotEqualTo(String value) {
            addCriterion("sbgg_id <>", value, "sbggId");
            return (Criteria) this;
        }

        public Criteria andSbggIdGreaterThan(String value) {
            addCriterion("sbgg_id >", value, "sbggId");
            return (Criteria) this;
        }

        public Criteria andSbggIdGreaterThanOrEqualTo(String value) {
            addCriterion("sbgg_id >=", value, "sbggId");
            return (Criteria) this;
        }

        public Criteria andSbggIdLessThan(String value) {
            addCriterion("sbgg_id <", value, "sbggId");
            return (Criteria) this;
        }

        public Criteria andSbggIdLessThanOrEqualTo(String value) {
            addCriterion("sbgg_id <=", value, "sbggId");
            return (Criteria) this;
        }

        public Criteria andSbggIdLike(String value) {
            addCriterion("sbgg_id like", value, "sbggId");
            return (Criteria) this;
        }

        public Criteria andSbggIdNotLike(String value) {
            addCriterion("sbgg_id not like", value, "sbggId");
            return (Criteria) this;
        }

        public Criteria andSbggIdIn(List<String> values) {
            addCriterion("sbgg_id in", values, "sbggId");
            return (Criteria) this;
        }

        public Criteria andSbggIdNotIn(List<String> values) {
            addCriterion("sbgg_id not in", values, "sbggId");
            return (Criteria) this;
        }

        public Criteria andSbggIdBetween(String value1, String value2) {
            addCriterion("sbgg_id between", value1, value2, "sbggId");
            return (Criteria) this;
        }

        public Criteria andSbggIdNotBetween(String value1, String value2) {
            addCriterion("sbgg_id not between", value1, value2, "sbggId");
            return (Criteria) this;
        }

        public Criteria andCategoryNameIsNull() {
            addCriterion("category_name is null");
            return (Criteria) this;
        }

        public Criteria andCategoryNameIsNotNull() {
            addCriterion("category_name is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryNameEqualTo(String value) {
            addCriterion("category_name =", value, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryNameNotEqualTo(String value) {
            addCriterion("category_name <>", value, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryNameGreaterThan(String value) {
            addCriterion("category_name >", value, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryNameGreaterThanOrEqualTo(String value) {
            addCriterion("category_name >=", value, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryNameLessThan(String value) {
            addCriterion("category_name <", value, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryNameLessThanOrEqualTo(String value) {
            addCriterion("category_name <=", value, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryNameLike(String value) {
            addCriterion("category_name like", value, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryNameNotLike(String value) {
            addCriterion("category_name not like", value, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryNameIn(List<String> values) {
            addCriterion("category_name in", values, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryNameNotIn(List<String> values) {
            addCriterion("category_name not in", values, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryNameBetween(String value1, String value2) {
            addCriterion("category_name between", value1, value2, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryNameNotBetween(String value1, String value2) {
            addCriterion("category_name not between", value1, value2, "categoryName");
            return (Criteria) this;
        }

        public Criteria andStartPageIsNull() {
            addCriterion("start_page is null");
            return (Criteria) this;
        }

        public Criteria andStartPageIsNotNull() {
            addCriterion("start_page is not null");
            return (Criteria) this;
        }

        public Criteria andStartPageEqualTo(Integer value) {
            addCriterion("start_page =", value, "startPage");
            return (Criteria) this;
        }

        public Criteria andStartPageNotEqualTo(Integer value) {
            addCriterion("start_page <>", value, "startPage");
            return (Criteria) this;
        }

        public Criteria andStartPageGreaterThan(Integer value) {
            addCriterion("start_page >", value, "startPage");
            return (Criteria) this;
        }

        public Criteria andStartPageGreaterThanOrEqualTo(Integer value) {
            addCriterion("start_page >=", value, "startPage");
            return (Criteria) this;
        }

        public Criteria andStartPageLessThan(Integer value) {
            addCriterion("start_page <", value, "startPage");
            return (Criteria) this;
        }

        public Criteria andStartPageLessThanOrEqualTo(Integer value) {
            addCriterion("start_page <=", value, "startPage");
            return (Criteria) this;
        }

        public Criteria andStartPageIn(List<Integer> values) {
            addCriterion("start_page in", values, "startPage");
            return (Criteria) this;
        }

        public Criteria andStartPageNotIn(List<Integer> values) {
            addCriterion("start_page not in", values, "startPage");
            return (Criteria) this;
        }

        public Criteria andStartPageBetween(Integer value1, Integer value2) {
            addCriterion("start_page between", value1, value2, "startPage");
            return (Criteria) this;
        }

        public Criteria andStartPageNotBetween(Integer value1, Integer value2) {
            addCriterion("start_page not between", value1, value2, "startPage");
            return (Criteria) this;
        }

        public Criteria andEndPageIsNull() {
            addCriterion("end_page is null");
            return (Criteria) this;
        }

        public Criteria andEndPageIsNotNull() {
            addCriterion("end_page is not null");
            return (Criteria) this;
        }

        public Criteria andEndPageEqualTo(Integer value) {
            addCriterion("end_page =", value, "endPage");
            return (Criteria) this;
        }

        public Criteria andEndPageNotEqualTo(Integer value) {
            addCriterion("end_page <>", value, "endPage");
            return (Criteria) this;
        }

        public Criteria andEndPageGreaterThan(Integer value) {
            addCriterion("end_page >", value, "endPage");
            return (Criteria) this;
        }

        public Criteria andEndPageGreaterThanOrEqualTo(Integer value) {
            addCriterion("end_page >=", value, "endPage");
            return (Criteria) this;
        }

        public Criteria andEndPageLessThan(Integer value) {
            addCriterion("end_page <", value, "endPage");
            return (Criteria) this;
        }

        public Criteria andEndPageLessThanOrEqualTo(Integer value) {
            addCriterion("end_page <=", value, "endPage");
            return (Criteria) this;
        }

        public Criteria andEndPageIn(List<Integer> values) {
            addCriterion("end_page in", values, "endPage");
            return (Criteria) this;
        }

        public Criteria andEndPageNotIn(List<Integer> values) {
            addCriterion("end_page not in", values, "endPage");
            return (Criteria) this;
        }

        public Criteria andEndPageBetween(Integer value1, Integer value2) {
            addCriterion("end_page between", value1, value2, "endPage");
            return (Criteria) this;
        }

        public Criteria andEndPageNotBetween(Integer value1, Integer value2) {
            addCriterion("end_page not between", value1, value2, "endPage");
            return (Criteria) this;
        }

        public Criteria andFinishedDownloadGifIsNull() {
            addCriterion("finished_download_gif is null");
            return (Criteria) this;
        }

        public Criteria andFinishedDownloadGifIsNotNull() {
            addCriterion("finished_download_gif is not null");
            return (Criteria) this;
        }

        public Criteria andFinishedDownloadGifEqualTo(Integer value) {
            addCriterion("finished_download_gif =", value, "finishedDownloadGif");
            return (Criteria) this;
        }

        public Criteria andFinishedDownloadGifNotEqualTo(Integer value) {
            addCriterion("finished_download_gif <>", value, "finishedDownloadGif");
            return (Criteria) this;
        }

        public Criteria andFinishedDownloadGifGreaterThan(Integer value) {
            addCriterion("finished_download_gif >", value, "finishedDownloadGif");
            return (Criteria) this;
        }

        public Criteria andFinishedDownloadGifGreaterThanOrEqualTo(Integer value) {
            addCriterion("finished_download_gif >=", value, "finishedDownloadGif");
            return (Criteria) this;
        }

        public Criteria andFinishedDownloadGifLessThan(Integer value) {
            addCriterion("finished_download_gif <", value, "finishedDownloadGif");
            return (Criteria) this;
        }

        public Criteria andFinishedDownloadGifLessThanOrEqualTo(Integer value) {
            addCriterion("finished_download_gif <=", value, "finishedDownloadGif");
            return (Criteria) this;
        }

        public Criteria andFinishedDownloadGifIn(List<Integer> values) {
            addCriterion("finished_download_gif in", values, "finishedDownloadGif");
            return (Criteria) this;
        }

        public Criteria andFinishedDownloadGifNotIn(List<Integer> values) {
            addCriterion("finished_download_gif not in", values, "finishedDownloadGif");
            return (Criteria) this;
        }

        public Criteria andFinishedDownloadGifBetween(Integer value1, Integer value2) {
            addCriterion("finished_download_gif between", value1, value2, "finishedDownloadGif");
            return (Criteria) this;
        }

        public Criteria andFinishedDownloadGifNotBetween(Integer value1, Integer value2) {
            addCriterion("finished_download_gif not between", value1, value2, "finishedDownloadGif");
            return (Criteria) this;
        }

        public Criteria andFinishedOcrIsNull() {
            addCriterion("finished_ocr is null");
            return (Criteria) this;
        }

        public Criteria andFinishedOcrIsNotNull() {
            addCriterion("finished_ocr is not null");
            return (Criteria) this;
        }

        public Criteria andFinishedOcrEqualTo(Integer value) {
            addCriterion("finished_ocr =", value, "finishedOcr");
            return (Criteria) this;
        }

        public Criteria andFinishedOcrNotEqualTo(Integer value) {
            addCriterion("finished_ocr <>", value, "finishedOcr");
            return (Criteria) this;
        }

        public Criteria andFinishedOcrGreaterThan(Integer value) {
            addCriterion("finished_ocr >", value, "finishedOcr");
            return (Criteria) this;
        }

        public Criteria andFinishedOcrGreaterThanOrEqualTo(Integer value) {
            addCriterion("finished_ocr >=", value, "finishedOcr");
            return (Criteria) this;
        }

        public Criteria andFinishedOcrLessThan(Integer value) {
            addCriterion("finished_ocr <", value, "finishedOcr");
            return (Criteria) this;
        }

        public Criteria andFinishedOcrLessThanOrEqualTo(Integer value) {
            addCriterion("finished_ocr <=", value, "finishedOcr");
            return (Criteria) this;
        }

        public Criteria andFinishedOcrIn(List<Integer> values) {
            addCriterion("finished_ocr in", values, "finishedOcr");
            return (Criteria) this;
        }

        public Criteria andFinishedOcrNotIn(List<Integer> values) {
            addCriterion("finished_ocr not in", values, "finishedOcr");
            return (Criteria) this;
        }

        public Criteria andFinishedOcrBetween(Integer value1, Integer value2) {
            addCriterion("finished_ocr between", value1, value2, "finishedOcr");
            return (Criteria) this;
        }

        public Criteria andFinishedOcrNotBetween(Integer value1, Integer value2) {
            addCriterion("finished_ocr not between", value1, value2, "finishedOcr");
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