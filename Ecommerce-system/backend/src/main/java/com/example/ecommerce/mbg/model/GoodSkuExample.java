package com.example.ecommerce.mbg.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class GoodSkuExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GoodSkuExample() {
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

        public Criteria andSkuidIsNull() {
            addCriterion("SKUID is null");
            return (Criteria) this;
        }

        public Criteria andSkuidIsNotNull() {
            addCriterion("SKUID is not null");
            return (Criteria) this;
        }

        public Criteria andSkuidEqualTo(Integer value) {
            addCriterion("SKUID =", value, "skuid");
            return (Criteria) this;
        }

        public Criteria andSkuidNotEqualTo(Integer value) {
            addCriterion("SKUID <>", value, "skuid");
            return (Criteria) this;
        }

        public Criteria andSkuidGreaterThan(Integer value) {
            addCriterion("SKUID >", value, "skuid");
            return (Criteria) this;
        }

        public Criteria andSkuidGreaterThanOrEqualTo(Integer value) {
            addCriterion("SKUID >=", value, "skuid");
            return (Criteria) this;
        }

        public Criteria andSkuidLessThan(Integer value) {
            addCriterion("SKUID <", value, "skuid");
            return (Criteria) this;
        }

        public Criteria andSkuidLessThanOrEqualTo(Integer value) {
            addCriterion("SKUID <=", value, "skuid");
            return (Criteria) this;
        }

        public Criteria andSkuidIn(List<Integer> values) {
            addCriterion("SKUID in", values, "skuid");
            return (Criteria) this;
        }

        public Criteria andSkuidNotIn(List<Integer> values) {
            addCriterion("SKUID not in", values, "skuid");
            return (Criteria) this;
        }

        public Criteria andSkuidBetween(Integer value1, Integer value2) {
            addCriterion("SKUID between", value1, value2, "skuid");
            return (Criteria) this;
        }

        public Criteria andSkuidNotBetween(Integer value1, Integer value2) {
            addCriterion("SKUID not between", value1, value2, "skuid");
            return (Criteria) this;
        }

        public Criteria andGoodidIsNull() {
            addCriterion("goodID is null");
            return (Criteria) this;
        }

        public Criteria andGoodidIsNotNull() {
            addCriterion("goodID is not null");
            return (Criteria) this;
        }

        public Criteria andGoodidEqualTo(String value) {
            addCriterion("goodID =", value, "goodid");
            return (Criteria) this;
        }

        public Criteria andGoodidNotEqualTo(String value) {
            addCriterion("goodID <>", value, "goodid");
            return (Criteria) this;
        }

        public Criteria andGoodidGreaterThan(String value) {
            addCriterion("goodID >", value, "goodid");
            return (Criteria) this;
        }

        public Criteria andGoodidGreaterThanOrEqualTo(String value) {
            addCriterion("goodID >=", value, "goodid");
            return (Criteria) this;
        }

        public Criteria andGoodidLessThan(String value) {
            addCriterion("goodID <", value, "goodid");
            return (Criteria) this;
        }

        public Criteria andGoodidLessThanOrEqualTo(String value) {
            addCriterion("goodID <=", value, "goodid");
            return (Criteria) this;
        }

        public Criteria andGoodidLike(String value) {
            addCriterion("goodID like", value, "goodid");
            return (Criteria) this;
        }

        public Criteria andGoodidNotLike(String value) {
            addCriterion("goodID not like", value, "goodid");
            return (Criteria) this;
        }

        public Criteria andGoodidIn(List<String> values) {
            addCriterion("goodID in", values, "goodid");
            return (Criteria) this;
        }

        public Criteria andGoodidNotIn(List<String> values) {
            addCriterion("goodID not in", values, "goodid");
            return (Criteria) this;
        }

        public Criteria andGoodidBetween(String value1, String value2) {
            addCriterion("goodID between", value1, value2, "goodid");
            return (Criteria) this;
        }

        public Criteria andGoodidNotBetween(String value1, String value2) {
            addCriterion("goodID not between", value1, value2, "goodid");
            return (Criteria) this;
        }

        public Criteria andNumberIsNull() {
            addCriterion("number is null");
            return (Criteria) this;
        }

        public Criteria andNumberIsNotNull() {
            addCriterion("number is not null");
            return (Criteria) this;
        }

        public Criteria andNumberEqualTo(Integer value) {
            addCriterion("number =", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotEqualTo(Integer value) {
            addCriterion("number <>", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberGreaterThan(Integer value) {
            addCriterion("number >", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("number >=", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberLessThan(Integer value) {
            addCriterion("number <", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberLessThanOrEqualTo(Integer value) {
            addCriterion("number <=", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberIn(List<Integer> values) {
            addCriterion("number in", values, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotIn(List<Integer> values) {
            addCriterion("number not in", values, "number");
            return (Criteria) this;
        }

        public Criteria andNumberBetween(Integer value1, Integer value2) {
            addCriterion("number between", value1, value2, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("number not between", value1, value2, "number");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(BigDecimal value) {
            addCriterion("price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(BigDecimal value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(BigDecimal value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(BigDecimal value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<BigDecimal> values) {
            addCriterion("price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<BigDecimal> values) {
            addCriterion("price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("price not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andVippriceIsNull() {
            addCriterion("Vipprice is null");
            return (Criteria) this;
        }

        public Criteria andVippriceIsNotNull() {
            addCriterion("Vipprice is not null");
            return (Criteria) this;
        }

        public Criteria andVippriceEqualTo(BigDecimal value) {
            addCriterion("Vipprice =", value, "vipprice");
            return (Criteria) this;
        }

        public Criteria andVippriceNotEqualTo(BigDecimal value) {
            addCriterion("Vipprice <>", value, "vipprice");
            return (Criteria) this;
        }

        public Criteria andVippriceGreaterThan(BigDecimal value) {
            addCriterion("Vipprice >", value, "vipprice");
            return (Criteria) this;
        }

        public Criteria andVippriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("Vipprice >=", value, "vipprice");
            return (Criteria) this;
        }

        public Criteria andVippriceLessThan(BigDecimal value) {
            addCriterion("Vipprice <", value, "vipprice");
            return (Criteria) this;
        }

        public Criteria andVippriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("Vipprice <=", value, "vipprice");
            return (Criteria) this;
        }

        public Criteria andVippriceIn(List<BigDecimal> values) {
            addCriterion("Vipprice in", values, "vipprice");
            return (Criteria) this;
        }

        public Criteria andVippriceNotIn(List<BigDecimal> values) {
            addCriterion("Vipprice not in", values, "vipprice");
            return (Criteria) this;
        }

        public Criteria andVippriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("Vipprice between", value1, value2, "vipprice");
            return (Criteria) this;
        }

        public Criteria andVippriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("Vipprice not between", value1, value2, "vipprice");
            return (Criteria) this;
        }

        public Criteria andLeftNumberIsNull() {
            addCriterion("Left_number is null");
            return (Criteria) this;
        }

        public Criteria andLeftNumberIsNotNull() {
            addCriterion("Left_number is not null");
            return (Criteria) this;
        }

        public Criteria andLeftNumberEqualTo(Integer value) {
            addCriterion("Left_number =", value, "leftNumber");
            return (Criteria) this;
        }

        public Criteria andLeftNumberNotEqualTo(Integer value) {
            addCriterion("Left_number <>", value, "leftNumber");
            return (Criteria) this;
        }

        public Criteria andLeftNumberGreaterThan(Integer value) {
            addCriterion("Left_number >", value, "leftNumber");
            return (Criteria) this;
        }

        public Criteria andLeftNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("Left_number >=", value, "leftNumber");
            return (Criteria) this;
        }

        public Criteria andLeftNumberLessThan(Integer value) {
            addCriterion("Left_number <", value, "leftNumber");
            return (Criteria) this;
        }

        public Criteria andLeftNumberLessThanOrEqualTo(Integer value) {
            addCriterion("Left_number <=", value, "leftNumber");
            return (Criteria) this;
        }

        public Criteria andLeftNumberIn(List<Integer> values) {
            addCriterion("Left_number in", values, "leftNumber");
            return (Criteria) this;
        }

        public Criteria andLeftNumberNotIn(List<Integer> values) {
            addCriterion("Left_number not in", values, "leftNumber");
            return (Criteria) this;
        }

        public Criteria andLeftNumberBetween(Integer value1, Integer value2) {
            addCriterion("Left_number between", value1, value2, "leftNumber");
            return (Criteria) this;
        }

        public Criteria andLeftNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("Left_number not between", value1, value2, "leftNumber");
            return (Criteria) this;
        }

        public Criteria andSoldNumberIsNull() {
            addCriterion("Sold_number is null");
            return (Criteria) this;
        }

        public Criteria andSoldNumberIsNotNull() {
            addCriterion("Sold_number is not null");
            return (Criteria) this;
        }

        public Criteria andSoldNumberEqualTo(Integer value) {
            addCriterion("Sold_number =", value, "soldNumber");
            return (Criteria) this;
        }

        public Criteria andSoldNumberNotEqualTo(Integer value) {
            addCriterion("Sold_number <>", value, "soldNumber");
            return (Criteria) this;
        }

        public Criteria andSoldNumberGreaterThan(Integer value) {
            addCriterion("Sold_number >", value, "soldNumber");
            return (Criteria) this;
        }

        public Criteria andSoldNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("Sold_number >=", value, "soldNumber");
            return (Criteria) this;
        }

        public Criteria andSoldNumberLessThan(Integer value) {
            addCriterion("Sold_number <", value, "soldNumber");
            return (Criteria) this;
        }

        public Criteria andSoldNumberLessThanOrEqualTo(Integer value) {
            addCriterion("Sold_number <=", value, "soldNumber");
            return (Criteria) this;
        }

        public Criteria andSoldNumberIn(List<Integer> values) {
            addCriterion("Sold_number in", values, "soldNumber");
            return (Criteria) this;
        }

        public Criteria andSoldNumberNotIn(List<Integer> values) {
            addCriterion("Sold_number not in", values, "soldNumber");
            return (Criteria) this;
        }

        public Criteria andSoldNumberBetween(Integer value1, Integer value2) {
            addCriterion("Sold_number between", value1, value2, "soldNumber");
            return (Criteria) this;
        }

        public Criteria andSoldNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("Sold_number not between", value1, value2, "soldNumber");
            return (Criteria) this;
        }

        public Criteria andPictrueIsNull() {
            addCriterion("pictrue is null");
            return (Criteria) this;
        }

        public Criteria andPictrueIsNotNull() {
            addCriterion("pictrue is not null");
            return (Criteria) this;
        }

        public Criteria andPictrueEqualTo(String value) {
            addCriterion("pictrue =", value, "pictrue");
            return (Criteria) this;
        }

        public Criteria andPictrueNotEqualTo(String value) {
            addCriterion("pictrue <>", value, "pictrue");
            return (Criteria) this;
        }

        public Criteria andPictrueGreaterThan(String value) {
            addCriterion("pictrue >", value, "pictrue");
            return (Criteria) this;
        }

        public Criteria andPictrueGreaterThanOrEqualTo(String value) {
            addCriterion("pictrue >=", value, "pictrue");
            return (Criteria) this;
        }

        public Criteria andPictrueLessThan(String value) {
            addCriterion("pictrue <", value, "pictrue");
            return (Criteria) this;
        }

        public Criteria andPictrueLessThanOrEqualTo(String value) {
            addCriterion("pictrue <=", value, "pictrue");
            return (Criteria) this;
        }

        public Criteria andPictrueLike(String value) {
            addCriterion("pictrue like", value, "pictrue");
            return (Criteria) this;
        }

        public Criteria andPictrueNotLike(String value) {
            addCriterion("pictrue not like", value, "pictrue");
            return (Criteria) this;
        }

        public Criteria andPictrueIn(List<String> values) {
            addCriterion("pictrue in", values, "pictrue");
            return (Criteria) this;
        }

        public Criteria andPictrueNotIn(List<String> values) {
            addCriterion("pictrue not in", values, "pictrue");
            return (Criteria) this;
        }

        public Criteria andPictrueBetween(String value1, String value2) {
            addCriterion("pictrue between", value1, value2, "pictrue");
            return (Criteria) this;
        }

        public Criteria andPictrueNotBetween(String value1, String value2) {
            addCriterion("pictrue not between", value1, value2, "pictrue");
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