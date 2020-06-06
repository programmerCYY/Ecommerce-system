package com.example.ecommerce.mbg.model;

import java.util.ArrayList;
import java.util.List;

public class UserrExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserrExample() {
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

        public Criteria andUseridIsNull() {
            addCriterion("UserID is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("UserID is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(String value) {
            addCriterion("UserID =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(String value) {
            addCriterion("UserID <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(String value) {
            addCriterion("UserID >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(String value) {
            addCriterion("UserID >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(String value) {
            addCriterion("UserID <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(String value) {
            addCriterion("UserID <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLike(String value) {
            addCriterion("UserID like", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotLike(String value) {
            addCriterion("UserID not like", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<String> values) {
            addCriterion("UserID in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<String> values) {
            addCriterion("UserID not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(String value1, String value2) {
            addCriterion("UserID between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(String value1, String value2) {
            addCriterion("UserID not between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUserpasswordIsNull() {
            addCriterion("Userpassword is null");
            return (Criteria) this;
        }

        public Criteria andUserpasswordIsNotNull() {
            addCriterion("Userpassword is not null");
            return (Criteria) this;
        }

        public Criteria andUserpasswordEqualTo(String value) {
            addCriterion("Userpassword =", value, "userpassword");
            return (Criteria) this;
        }

        public Criteria andUserpasswordNotEqualTo(String value) {
            addCriterion("Userpassword <>", value, "userpassword");
            return (Criteria) this;
        }

        public Criteria andUserpasswordGreaterThan(String value) {
            addCriterion("Userpassword >", value, "userpassword");
            return (Criteria) this;
        }

        public Criteria andUserpasswordGreaterThanOrEqualTo(String value) {
            addCriterion("Userpassword >=", value, "userpassword");
            return (Criteria) this;
        }

        public Criteria andUserpasswordLessThan(String value) {
            addCriterion("Userpassword <", value, "userpassword");
            return (Criteria) this;
        }

        public Criteria andUserpasswordLessThanOrEqualTo(String value) {
            addCriterion("Userpassword <=", value, "userpassword");
            return (Criteria) this;
        }

        public Criteria andUserpasswordLike(String value) {
            addCriterion("Userpassword like", value, "userpassword");
            return (Criteria) this;
        }

        public Criteria andUserpasswordNotLike(String value) {
            addCriterion("Userpassword not like", value, "userpassword");
            return (Criteria) this;
        }

        public Criteria andUserpasswordIn(List<String> values) {
            addCriterion("Userpassword in", values, "userpassword");
            return (Criteria) this;
        }

        public Criteria andUserpasswordNotIn(List<String> values) {
            addCriterion("Userpassword not in", values, "userpassword");
            return (Criteria) this;
        }

        public Criteria andUserpasswordBetween(String value1, String value2) {
            addCriterion("Userpassword between", value1, value2, "userpassword");
            return (Criteria) this;
        }

        public Criteria andUserpasswordNotBetween(String value1, String value2) {
            addCriterion("Userpassword not between", value1, value2, "userpassword");
            return (Criteria) this;
        }

        public Criteria andUseraddressIsNull() {
            addCriterion("UserAddress is null");
            return (Criteria) this;
        }

        public Criteria andUseraddressIsNotNull() {
            addCriterion("UserAddress is not null");
            return (Criteria) this;
        }

        public Criteria andUseraddressEqualTo(String value) {
            addCriterion("UserAddress =", value, "useraddress");
            return (Criteria) this;
        }

        public Criteria andUseraddressNotEqualTo(String value) {
            addCriterion("UserAddress <>", value, "useraddress");
            return (Criteria) this;
        }

        public Criteria andUseraddressGreaterThan(String value) {
            addCriterion("UserAddress >", value, "useraddress");
            return (Criteria) this;
        }

        public Criteria andUseraddressGreaterThanOrEqualTo(String value) {
            addCriterion("UserAddress >=", value, "useraddress");
            return (Criteria) this;
        }

        public Criteria andUseraddressLessThan(String value) {
            addCriterion("UserAddress <", value, "useraddress");
            return (Criteria) this;
        }

        public Criteria andUseraddressLessThanOrEqualTo(String value) {
            addCriterion("UserAddress <=", value, "useraddress");
            return (Criteria) this;
        }

        public Criteria andUseraddressLike(String value) {
            addCriterion("UserAddress like", value, "useraddress");
            return (Criteria) this;
        }

        public Criteria andUseraddressNotLike(String value) {
            addCriterion("UserAddress not like", value, "useraddress");
            return (Criteria) this;
        }

        public Criteria andUseraddressIn(List<String> values) {
            addCriterion("UserAddress in", values, "useraddress");
            return (Criteria) this;
        }

        public Criteria andUseraddressNotIn(List<String> values) {
            addCriterion("UserAddress not in", values, "useraddress");
            return (Criteria) this;
        }

        public Criteria andUseraddressBetween(String value1, String value2) {
            addCriterion("UserAddress between", value1, value2, "useraddress");
            return (Criteria) this;
        }

        public Criteria andUseraddressNotBetween(String value1, String value2) {
            addCriterion("UserAddress not between", value1, value2, "useraddress");
            return (Criteria) this;
        }

        public Criteria andUsertelephoneIsNull() {
            addCriterion("UserTelephone is null");
            return (Criteria) this;
        }

        public Criteria andUsertelephoneIsNotNull() {
            addCriterion("UserTelephone is not null");
            return (Criteria) this;
        }

        public Criteria andUsertelephoneEqualTo(String value) {
            addCriterion("UserTelephone =", value, "usertelephone");
            return (Criteria) this;
        }

        public Criteria andUsertelephoneNotEqualTo(String value) {
            addCriterion("UserTelephone <>", value, "usertelephone");
            return (Criteria) this;
        }

        public Criteria andUsertelephoneGreaterThan(String value) {
            addCriterion("UserTelephone >", value, "usertelephone");
            return (Criteria) this;
        }

        public Criteria andUsertelephoneGreaterThanOrEqualTo(String value) {
            addCriterion("UserTelephone >=", value, "usertelephone");
            return (Criteria) this;
        }

        public Criteria andUsertelephoneLessThan(String value) {
            addCriterion("UserTelephone <", value, "usertelephone");
            return (Criteria) this;
        }

        public Criteria andUsertelephoneLessThanOrEqualTo(String value) {
            addCriterion("UserTelephone <=", value, "usertelephone");
            return (Criteria) this;
        }

        public Criteria andUsertelephoneLike(String value) {
            addCriterion("UserTelephone like", value, "usertelephone");
            return (Criteria) this;
        }

        public Criteria andUsertelephoneNotLike(String value) {
            addCriterion("UserTelephone not like", value, "usertelephone");
            return (Criteria) this;
        }

        public Criteria andUsertelephoneIn(List<String> values) {
            addCriterion("UserTelephone in", values, "usertelephone");
            return (Criteria) this;
        }

        public Criteria andUsertelephoneNotIn(List<String> values) {
            addCriterion("UserTelephone not in", values, "usertelephone");
            return (Criteria) this;
        }

        public Criteria andUsertelephoneBetween(String value1, String value2) {
            addCriterion("UserTelephone between", value1, value2, "usertelephone");
            return (Criteria) this;
        }

        public Criteria andUsertelephoneNotBetween(String value1, String value2) {
            addCriterion("UserTelephone not between", value1, value2, "usertelephone");
            return (Criteria) this;
        }

        public Criteria andUserpowerIsNull() {
            addCriterion("Userpower is null");
            return (Criteria) this;
        }

        public Criteria andUserpowerIsNotNull() {
            addCriterion("Userpower is not null");
            return (Criteria) this;
        }

        public Criteria andUserpowerEqualTo(Integer value) {
            addCriterion("Userpower =", value, "userpower");
            return (Criteria) this;
        }

        public Criteria andUserpowerNotEqualTo(Integer value) {
            addCriterion("Userpower <>", value, "userpower");
            return (Criteria) this;
        }

        public Criteria andUserpowerGreaterThan(Integer value) {
            addCriterion("Userpower >", value, "userpower");
            return (Criteria) this;
        }

        public Criteria andUserpowerGreaterThanOrEqualTo(Integer value) {
            addCriterion("Userpower >=", value, "userpower");
            return (Criteria) this;
        }

        public Criteria andUserpowerLessThan(Integer value) {
            addCriterion("Userpower <", value, "userpower");
            return (Criteria) this;
        }

        public Criteria andUserpowerLessThanOrEqualTo(Integer value) {
            addCriterion("Userpower <=", value, "userpower");
            return (Criteria) this;
        }

        public Criteria andUserpowerIn(List<Integer> values) {
            addCriterion("Userpower in", values, "userpower");
            return (Criteria) this;
        }

        public Criteria andUserpowerNotIn(List<Integer> values) {
            addCriterion("Userpower not in", values, "userpower");
            return (Criteria) this;
        }

        public Criteria andUserpowerBetween(Integer value1, Integer value2) {
            addCriterion("Userpower between", value1, value2, "userpower");
            return (Criteria) this;
        }

        public Criteria andUserpowerNotBetween(Integer value1, Integer value2) {
            addCriterion("Userpower not between", value1, value2, "userpower");
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