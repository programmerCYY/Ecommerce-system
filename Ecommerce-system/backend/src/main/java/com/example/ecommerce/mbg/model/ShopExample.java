package com.example.ecommerce.mbg.model;

import java.util.ArrayList;
import java.util.List;

public class ShopExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ShopExample() {
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

        public Criteria andShopidIsNull() {
            addCriterion("ShopId is null");
            return (Criteria) this;
        }

        public Criteria andShopidIsNotNull() {
            addCriterion("ShopId is not null");
            return (Criteria) this;
        }

        public Criteria andShopidEqualTo(String value) {
            addCriterion("ShopId =", value, "shopid");
            return (Criteria) this;
        }

        public Criteria andShopidNotEqualTo(String value) {
            addCriterion("ShopId <>", value, "shopid");
            return (Criteria) this;
        }

        public Criteria andShopidGreaterThan(String value) {
            addCriterion("ShopId >", value, "shopid");
            return (Criteria) this;
        }

        public Criteria andShopidGreaterThanOrEqualTo(String value) {
            addCriterion("ShopId >=", value, "shopid");
            return (Criteria) this;
        }

        public Criteria andShopidLessThan(String value) {
            addCriterion("ShopId <", value, "shopid");
            return (Criteria) this;
        }

        public Criteria andShopidLessThanOrEqualTo(String value) {
            addCriterion("ShopId <=", value, "shopid");
            return (Criteria) this;
        }

        public Criteria andShopidLike(String value) {
            addCriterion("ShopId like", value, "shopid");
            return (Criteria) this;
        }

        public Criteria andShopidNotLike(String value) {
            addCriterion("ShopId not like", value, "shopid");
            return (Criteria) this;
        }

        public Criteria andShopidIn(List<String> values) {
            addCriterion("ShopId in", values, "shopid");
            return (Criteria) this;
        }

        public Criteria andShopidNotIn(List<String> values) {
            addCriterion("ShopId not in", values, "shopid");
            return (Criteria) this;
        }

        public Criteria andShopidBetween(String value1, String value2) {
            addCriterion("ShopId between", value1, value2, "shopid");
            return (Criteria) this;
        }

        public Criteria andShopidNotBetween(String value1, String value2) {
            addCriterion("ShopId not between", value1, value2, "shopid");
            return (Criteria) this;
        }

        public Criteria andShopnameIsNull() {
            addCriterion("Shopname is null");
            return (Criteria) this;
        }

        public Criteria andShopnameIsNotNull() {
            addCriterion("Shopname is not null");
            return (Criteria) this;
        }

        public Criteria andShopnameEqualTo(String value) {
            addCriterion("Shopname =", value, "shopname");
            return (Criteria) this;
        }

        public Criteria andShopnameNotEqualTo(String value) {
            addCriterion("Shopname <>", value, "shopname");
            return (Criteria) this;
        }

        public Criteria andShopnameGreaterThan(String value) {
            addCriterion("Shopname >", value, "shopname");
            return (Criteria) this;
        }

        public Criteria andShopnameGreaterThanOrEqualTo(String value) {
            addCriterion("Shopname >=", value, "shopname");
            return (Criteria) this;
        }

        public Criteria andShopnameLessThan(String value) {
            addCriterion("Shopname <", value, "shopname");
            return (Criteria) this;
        }

        public Criteria andShopnameLessThanOrEqualTo(String value) {
            addCriterion("Shopname <=", value, "shopname");
            return (Criteria) this;
        }

        public Criteria andShopnameLike(String value) {
            addCriterion("Shopname like", value, "shopname");
            return (Criteria) this;
        }

        public Criteria andShopnameNotLike(String value) {
            addCriterion("Shopname not like", value, "shopname");
            return (Criteria) this;
        }

        public Criteria andShopnameIn(List<String> values) {
            addCriterion("Shopname in", values, "shopname");
            return (Criteria) this;
        }

        public Criteria andShopnameNotIn(List<String> values) {
            addCriterion("Shopname not in", values, "shopname");
            return (Criteria) this;
        }

        public Criteria andShopnameBetween(String value1, String value2) {
            addCriterion("Shopname between", value1, value2, "shopname");
            return (Criteria) this;
        }

        public Criteria andShopnameNotBetween(String value1, String value2) {
            addCriterion("Shopname not between", value1, value2, "shopname");
            return (Criteria) this;
        }

        public Criteria andTotalsalesIsNull() {
            addCriterion("TotalSales is null");
            return (Criteria) this;
        }

        public Criteria andTotalsalesIsNotNull() {
            addCriterion("TotalSales is not null");
            return (Criteria) this;
        }

        public Criteria andTotalsalesEqualTo(Integer value) {
            addCriterion("TotalSales =", value, "totalsales");
            return (Criteria) this;
        }

        public Criteria andTotalsalesNotEqualTo(Integer value) {
            addCriterion("TotalSales <>", value, "totalsales");
            return (Criteria) this;
        }

        public Criteria andTotalsalesGreaterThan(Integer value) {
            addCriterion("TotalSales >", value, "totalsales");
            return (Criteria) this;
        }

        public Criteria andTotalsalesGreaterThanOrEqualTo(Integer value) {
            addCriterion("TotalSales >=", value, "totalsales");
            return (Criteria) this;
        }

        public Criteria andTotalsalesLessThan(Integer value) {
            addCriterion("TotalSales <", value, "totalsales");
            return (Criteria) this;
        }

        public Criteria andTotalsalesLessThanOrEqualTo(Integer value) {
            addCriterion("TotalSales <=", value, "totalsales");
            return (Criteria) this;
        }

        public Criteria andTotalsalesIn(List<Integer> values) {
            addCriterion("TotalSales in", values, "totalsales");
            return (Criteria) this;
        }

        public Criteria andTotalsalesNotIn(List<Integer> values) {
            addCriterion("TotalSales not in", values, "totalsales");
            return (Criteria) this;
        }

        public Criteria andTotalsalesBetween(Integer value1, Integer value2) {
            addCriterion("TotalSales between", value1, value2, "totalsales");
            return (Criteria) this;
        }

        public Criteria andTotalsalesNotBetween(Integer value1, Integer value2) {
            addCriterion("TotalSales not between", value1, value2, "totalsales");
            return (Criteria) this;
        }

        public Criteria andShopaddressIsNull() {
            addCriterion("ShopAddress is null");
            return (Criteria) this;
        }

        public Criteria andShopaddressIsNotNull() {
            addCriterion("ShopAddress is not null");
            return (Criteria) this;
        }

        public Criteria andShopaddressEqualTo(String value) {
            addCriterion("ShopAddress =", value, "shopaddress");
            return (Criteria) this;
        }

        public Criteria andShopaddressNotEqualTo(String value) {
            addCriterion("ShopAddress <>", value, "shopaddress");
            return (Criteria) this;
        }

        public Criteria andShopaddressGreaterThan(String value) {
            addCriterion("ShopAddress >", value, "shopaddress");
            return (Criteria) this;
        }

        public Criteria andShopaddressGreaterThanOrEqualTo(String value) {
            addCriterion("ShopAddress >=", value, "shopaddress");
            return (Criteria) this;
        }

        public Criteria andShopaddressLessThan(String value) {
            addCriterion("ShopAddress <", value, "shopaddress");
            return (Criteria) this;
        }

        public Criteria andShopaddressLessThanOrEqualTo(String value) {
            addCriterion("ShopAddress <=", value, "shopaddress");
            return (Criteria) this;
        }

        public Criteria andShopaddressLike(String value) {
            addCriterion("ShopAddress like", value, "shopaddress");
            return (Criteria) this;
        }

        public Criteria andShopaddressNotLike(String value) {
            addCriterion("ShopAddress not like", value, "shopaddress");
            return (Criteria) this;
        }

        public Criteria andShopaddressIn(List<String> values) {
            addCriterion("ShopAddress in", values, "shopaddress");
            return (Criteria) this;
        }

        public Criteria andShopaddressNotIn(List<String> values) {
            addCriterion("ShopAddress not in", values, "shopaddress");
            return (Criteria) this;
        }

        public Criteria andShopaddressBetween(String value1, String value2) {
            addCriterion("ShopAddress between", value1, value2, "shopaddress");
            return (Criteria) this;
        }

        public Criteria andShopaddressNotBetween(String value1, String value2) {
            addCriterion("ShopAddress not between", value1, value2, "shopaddress");
            return (Criteria) this;
        }

        public Criteria andRegisterstateIsNull() {
            addCriterion("RegisterState is null");
            return (Criteria) this;
        }

        public Criteria andRegisterstateIsNotNull() {
            addCriterion("RegisterState is not null");
            return (Criteria) this;
        }

        public Criteria andRegisterstateEqualTo(Integer value) {
            addCriterion("RegisterState =", value, "registerstate");
            return (Criteria) this;
        }

        public Criteria andRegisterstateNotEqualTo(Integer value) {
            addCriterion("RegisterState <>", value, "registerstate");
            return (Criteria) this;
        }

        public Criteria andRegisterstateGreaterThan(Integer value) {
            addCriterion("RegisterState >", value, "registerstate");
            return (Criteria) this;
        }

        public Criteria andRegisterstateGreaterThanOrEqualTo(Integer value) {
            addCriterion("RegisterState >=", value, "registerstate");
            return (Criteria) this;
        }

        public Criteria andRegisterstateLessThan(Integer value) {
            addCriterion("RegisterState <", value, "registerstate");
            return (Criteria) this;
        }

        public Criteria andRegisterstateLessThanOrEqualTo(Integer value) {
            addCriterion("RegisterState <=", value, "registerstate");
            return (Criteria) this;
        }

        public Criteria andRegisterstateIn(List<Integer> values) {
            addCriterion("RegisterState in", values, "registerstate");
            return (Criteria) this;
        }

        public Criteria andRegisterstateNotIn(List<Integer> values) {
            addCriterion("RegisterState not in", values, "registerstate");
            return (Criteria) this;
        }

        public Criteria andRegisterstateBetween(Integer value1, Integer value2) {
            addCriterion("RegisterState between", value1, value2, "registerstate");
            return (Criteria) this;
        }

        public Criteria andRegisterstateNotBetween(Integer value1, Integer value2) {
            addCriterion("RegisterState not between", value1, value2, "registerstate");
            return (Criteria) this;
        }

        public Criteria andSellerpasswordIsNull() {
            addCriterion("Sellerpassword is null");
            return (Criteria) this;
        }

        public Criteria andSellerpasswordIsNotNull() {
            addCriterion("Sellerpassword is not null");
            return (Criteria) this;
        }

        public Criteria andSellerpasswordEqualTo(String value) {
            addCriterion("Sellerpassword =", value, "sellerpassword");
            return (Criteria) this;
        }

        public Criteria andSellerpasswordNotEqualTo(String value) {
            addCriterion("Sellerpassword <>", value, "sellerpassword");
            return (Criteria) this;
        }

        public Criteria andSellerpasswordGreaterThan(String value) {
            addCriterion("Sellerpassword >", value, "sellerpassword");
            return (Criteria) this;
        }

        public Criteria andSellerpasswordGreaterThanOrEqualTo(String value) {
            addCriterion("Sellerpassword >=", value, "sellerpassword");
            return (Criteria) this;
        }

        public Criteria andSellerpasswordLessThan(String value) {
            addCriterion("Sellerpassword <", value, "sellerpassword");
            return (Criteria) this;
        }

        public Criteria andSellerpasswordLessThanOrEqualTo(String value) {
            addCriterion("Sellerpassword <=", value, "sellerpassword");
            return (Criteria) this;
        }

        public Criteria andSellerpasswordLike(String value) {
            addCriterion("Sellerpassword like", value, "sellerpassword");
            return (Criteria) this;
        }

        public Criteria andSellerpasswordNotLike(String value) {
            addCriterion("Sellerpassword not like", value, "sellerpassword");
            return (Criteria) this;
        }

        public Criteria andSellerpasswordIn(List<String> values) {
            addCriterion("Sellerpassword in", values, "sellerpassword");
            return (Criteria) this;
        }

        public Criteria andSellerpasswordNotIn(List<String> values) {
            addCriterion("Sellerpassword not in", values, "sellerpassword");
            return (Criteria) this;
        }

        public Criteria andSellerpasswordBetween(String value1, String value2) {
            addCriterion("Sellerpassword between", value1, value2, "sellerpassword");
            return (Criteria) this;
        }

        public Criteria andSellerpasswordNotBetween(String value1, String value2) {
            addCriterion("Sellerpassword not between", value1, value2, "sellerpassword");
            return (Criteria) this;
        }

        public Criteria andSellernameIsNull() {
            addCriterion("Sellername is null");
            return (Criteria) this;
        }

        public Criteria andSellernameIsNotNull() {
            addCriterion("Sellername is not null");
            return (Criteria) this;
        }

        public Criteria andSellernameEqualTo(String value) {
            addCriterion("Sellername =", value, "sellername");
            return (Criteria) this;
        }

        public Criteria andSellernameNotEqualTo(String value) {
            addCriterion("Sellername <>", value, "sellername");
            return (Criteria) this;
        }

        public Criteria andSellernameGreaterThan(String value) {
            addCriterion("Sellername >", value, "sellername");
            return (Criteria) this;
        }

        public Criteria andSellernameGreaterThanOrEqualTo(String value) {
            addCriterion("Sellername >=", value, "sellername");
            return (Criteria) this;
        }

        public Criteria andSellernameLessThan(String value) {
            addCriterion("Sellername <", value, "sellername");
            return (Criteria) this;
        }

        public Criteria andSellernameLessThanOrEqualTo(String value) {
            addCriterion("Sellername <=", value, "sellername");
            return (Criteria) this;
        }

        public Criteria andSellernameLike(String value) {
            addCriterion("Sellername like", value, "sellername");
            return (Criteria) this;
        }

        public Criteria andSellernameNotLike(String value) {
            addCriterion("Sellername not like", value, "sellername");
            return (Criteria) this;
        }

        public Criteria andSellernameIn(List<String> values) {
            addCriterion("Sellername in", values, "sellername");
            return (Criteria) this;
        }

        public Criteria andSellernameNotIn(List<String> values) {
            addCriterion("Sellername not in", values, "sellername");
            return (Criteria) this;
        }

        public Criteria andSellernameBetween(String value1, String value2) {
            addCriterion("Sellername between", value1, value2, "sellername");
            return (Criteria) this;
        }

        public Criteria andSellernameNotBetween(String value1, String value2) {
            addCriterion("Sellername not between", value1, value2, "sellername");
            return (Criteria) this;
        }

        public Criteria andSellertelephoneIsNull() {
            addCriterion("SellerTelephone is null");
            return (Criteria) this;
        }

        public Criteria andSellertelephoneIsNotNull() {
            addCriterion("SellerTelephone is not null");
            return (Criteria) this;
        }

        public Criteria andSellertelephoneEqualTo(String value) {
            addCriterion("SellerTelephone =", value, "sellertelephone");
            return (Criteria) this;
        }

        public Criteria andSellertelephoneNotEqualTo(String value) {
            addCriterion("SellerTelephone <>", value, "sellertelephone");
            return (Criteria) this;
        }

        public Criteria andSellertelephoneGreaterThan(String value) {
            addCriterion("SellerTelephone >", value, "sellertelephone");
            return (Criteria) this;
        }

        public Criteria andSellertelephoneGreaterThanOrEqualTo(String value) {
            addCriterion("SellerTelephone >=", value, "sellertelephone");
            return (Criteria) this;
        }

        public Criteria andSellertelephoneLessThan(String value) {
            addCriterion("SellerTelephone <", value, "sellertelephone");
            return (Criteria) this;
        }

        public Criteria andSellertelephoneLessThanOrEqualTo(String value) {
            addCriterion("SellerTelephone <=", value, "sellertelephone");
            return (Criteria) this;
        }

        public Criteria andSellertelephoneLike(String value) {
            addCriterion("SellerTelephone like", value, "sellertelephone");
            return (Criteria) this;
        }

        public Criteria andSellertelephoneNotLike(String value) {
            addCriterion("SellerTelephone not like", value, "sellertelephone");
            return (Criteria) this;
        }

        public Criteria andSellertelephoneIn(List<String> values) {
            addCriterion("SellerTelephone in", values, "sellertelephone");
            return (Criteria) this;
        }

        public Criteria andSellertelephoneNotIn(List<String> values) {
            addCriterion("SellerTelephone not in", values, "sellertelephone");
            return (Criteria) this;
        }

        public Criteria andSellertelephoneBetween(String value1, String value2) {
            addCriterion("SellerTelephone between", value1, value2, "sellertelephone");
            return (Criteria) this;
        }

        public Criteria andSellertelephoneNotBetween(String value1, String value2) {
            addCriterion("SellerTelephone not between", value1, value2, "sellertelephone");
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