package com.example.ecommerce.mbg.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GoodsInformationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GoodsInformationExample() {
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

        public Criteria andShopidIsNull() {
            addCriterion("ShopID is null");
            return (Criteria) this;
        }

        public Criteria andShopidIsNotNull() {
            addCriterion("ShopID is not null");
            return (Criteria) this;
        }

        public Criteria andShopidEqualTo(String value) {
            addCriterion("ShopID =", value, "shopid");
            return (Criteria) this;
        }

        public Criteria andShopidNotEqualTo(String value) {
            addCriterion("ShopID <>", value, "shopid");
            return (Criteria) this;
        }

        public Criteria andShopidGreaterThan(String value) {
            addCriterion("ShopID >", value, "shopid");
            return (Criteria) this;
        }

        public Criteria andShopidGreaterThanOrEqualTo(String value) {
            addCriterion("ShopID >=", value, "shopid");
            return (Criteria) this;
        }

        public Criteria andShopidLessThan(String value) {
            addCriterion("ShopID <", value, "shopid");
            return (Criteria) this;
        }

        public Criteria andShopidLessThanOrEqualTo(String value) {
            addCriterion("ShopID <=", value, "shopid");
            return (Criteria) this;
        }

        public Criteria andShopidLike(String value) {
            addCriterion("ShopID like", value, "shopid");
            return (Criteria) this;
        }

        public Criteria andShopidNotLike(String value) {
            addCriterion("ShopID not like", value, "shopid");
            return (Criteria) this;
        }

        public Criteria andShopidIn(List<String> values) {
            addCriterion("ShopID in", values, "shopid");
            return (Criteria) this;
        }

        public Criteria andShopidNotIn(List<String> values) {
            addCriterion("ShopID not in", values, "shopid");
            return (Criteria) this;
        }

        public Criteria andShopidBetween(String value1, String value2) {
            addCriterion("ShopID between", value1, value2, "shopid");
            return (Criteria) this;
        }

        public Criteria andShopidNotBetween(String value1, String value2) {
            addCriterion("ShopID not between", value1, value2, "shopid");
            return (Criteria) this;
        }

        public Criteria andGoodnameIsNull() {
            addCriterion("Goodname is null");
            return (Criteria) this;
        }

        public Criteria andGoodnameIsNotNull() {
            addCriterion("Goodname is not null");
            return (Criteria) this;
        }

        public Criteria andGoodnameEqualTo(String value) {
            addCriterion("Goodname =", value, "goodname");
            return (Criteria) this;
        }

        public Criteria andGoodnameNotEqualTo(String value) {
            addCriterion("Goodname <>", value, "goodname");
            return (Criteria) this;
        }

        public Criteria andGoodnameGreaterThan(String value) {
            addCriterion("Goodname >", value, "goodname");
            return (Criteria) this;
        }

        public Criteria andGoodnameGreaterThanOrEqualTo(String value) {
            addCriterion("Goodname >=", value, "goodname");
            return (Criteria) this;
        }

        public Criteria andGoodnameLessThan(String value) {
            addCriterion("Goodname <", value, "goodname");
            return (Criteria) this;
        }

        public Criteria andGoodnameLessThanOrEqualTo(String value) {
            addCriterion("Goodname <=", value, "goodname");
            return (Criteria) this;
        }

        public Criteria andGoodnameLike(String value) {
            addCriterion("Goodname like", value, "goodname");
            return (Criteria) this;
        }

        public Criteria andGoodnameNotLike(String value) {
            addCriterion("Goodname not like", value, "goodname");
            return (Criteria) this;
        }

        public Criteria andGoodnameIn(List<String> values) {
            addCriterion("Goodname in", values, "goodname");
            return (Criteria) this;
        }

        public Criteria andGoodnameNotIn(List<String> values) {
            addCriterion("Goodname not in", values, "goodname");
            return (Criteria) this;
        }

        public Criteria andGoodnameBetween(String value1, String value2) {
            addCriterion("Goodname between", value1, value2, "goodname");
            return (Criteria) this;
        }

        public Criteria andGoodnameNotBetween(String value1, String value2) {
            addCriterion("Goodname not between", value1, value2, "goodname");
            return (Criteria) this;
        }

        public Criteria andGoodpictrueIsNull() {
            addCriterion("Goodpictrue is null");
            return (Criteria) this;
        }

        public Criteria andGoodpictrueIsNotNull() {
            addCriterion("Goodpictrue is not null");
            return (Criteria) this;
        }

        public Criteria andGoodpictrueEqualTo(String value) {
            addCriterion("Goodpictrue =", value, "goodpictrue");
            return (Criteria) this;
        }

        public Criteria andGoodpictrueNotEqualTo(String value) {
            addCriterion("Goodpictrue <>", value, "goodpictrue");
            return (Criteria) this;
        }

        public Criteria andGoodpictrueGreaterThan(String value) {
            addCriterion("Goodpictrue >", value, "goodpictrue");
            return (Criteria) this;
        }

        public Criteria andGoodpictrueGreaterThanOrEqualTo(String value) {
            addCriterion("Goodpictrue >=", value, "goodpictrue");
            return (Criteria) this;
        }

        public Criteria andGoodpictrueLessThan(String value) {
            addCriterion("Goodpictrue <", value, "goodpictrue");
            return (Criteria) this;
        }

        public Criteria andGoodpictrueLessThanOrEqualTo(String value) {
            addCriterion("Goodpictrue <=", value, "goodpictrue");
            return (Criteria) this;
        }

        public Criteria andGoodpictrueLike(String value) {
            addCriterion("Goodpictrue like", value, "goodpictrue");
            return (Criteria) this;
        }

        public Criteria andGoodpictrueNotLike(String value) {
            addCriterion("Goodpictrue not like", value, "goodpictrue");
            return (Criteria) this;
        }

        public Criteria andGoodpictrueIn(List<String> values) {
            addCriterion("Goodpictrue in", values, "goodpictrue");
            return (Criteria) this;
        }

        public Criteria andGoodpictrueNotIn(List<String> values) {
            addCriterion("Goodpictrue not in", values, "goodpictrue");
            return (Criteria) this;
        }

        public Criteria andGoodpictrueBetween(String value1, String value2) {
            addCriterion("Goodpictrue between", value1, value2, "goodpictrue");
            return (Criteria) this;
        }

        public Criteria andGoodpictrueNotBetween(String value1, String value2) {
            addCriterion("Goodpictrue not between", value1, value2, "goodpictrue");
            return (Criteria) this;
        }

        public Criteria andCheckstateIsNull() {
            addCriterion("CheckState is null");
            return (Criteria) this;
        }

        public Criteria andCheckstateIsNotNull() {
            addCriterion("CheckState is not null");
            return (Criteria) this;
        }

        public Criteria andCheckstateEqualTo(Integer value) {
            addCriterion("CheckState =", value, "checkstate");
            return (Criteria) this;
        }

        public Criteria andCheckstateNotEqualTo(Integer value) {
            addCriterion("CheckState <>", value, "checkstate");
            return (Criteria) this;
        }

        public Criteria andCheckstateGreaterThan(Integer value) {
            addCriterion("CheckState >", value, "checkstate");
            return (Criteria) this;
        }

        public Criteria andCheckstateGreaterThanOrEqualTo(Integer value) {
            addCriterion("CheckState >=", value, "checkstate");
            return (Criteria) this;
        }

        public Criteria andCheckstateLessThan(Integer value) {
            addCriterion("CheckState <", value, "checkstate");
            return (Criteria) this;
        }

        public Criteria andCheckstateLessThanOrEqualTo(Integer value) {
            addCriterion("CheckState <=", value, "checkstate");
            return (Criteria) this;
        }

        public Criteria andCheckstateIn(List<Integer> values) {
            addCriterion("CheckState in", values, "checkstate");
            return (Criteria) this;
        }

        public Criteria andCheckstateNotIn(List<Integer> values) {
            addCriterion("CheckState not in", values, "checkstate");
            return (Criteria) this;
        }

        public Criteria andCheckstateBetween(Integer value1, Integer value2) {
            addCriterion("CheckState between", value1, value2, "checkstate");
            return (Criteria) this;
        }

        public Criteria andCheckstateNotBetween(Integer value1, Integer value2) {
            addCriterion("CheckState not between", value1, value2, "checkstate");
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

        public Criteria andIspackageIsNull() {
            addCriterion("ispackage is null");
            return (Criteria) this;
        }

        public Criteria andIspackageIsNotNull() {
            addCriterion("ispackage is not null");
            return (Criteria) this;
        }

        public Criteria andIspackageEqualTo(Integer value) {
            addCriterion("ispackage =", value, "ispackage");
            return (Criteria) this;
        }

        public Criteria andIspackageNotEqualTo(Integer value) {
            addCriterion("ispackage <>", value, "ispackage");
            return (Criteria) this;
        }

        public Criteria andIspackageGreaterThan(Integer value) {
            addCriterion("ispackage >", value, "ispackage");
            return (Criteria) this;
        }

        public Criteria andIspackageGreaterThanOrEqualTo(Integer value) {
            addCriterion("ispackage >=", value, "ispackage");
            return (Criteria) this;
        }

        public Criteria andIspackageLessThan(Integer value) {
            addCriterion("ispackage <", value, "ispackage");
            return (Criteria) this;
        }

        public Criteria andIspackageLessThanOrEqualTo(Integer value) {
            addCriterion("ispackage <=", value, "ispackage");
            return (Criteria) this;
        }

        public Criteria andIspackageIn(List<Integer> values) {
            addCriterion("ispackage in", values, "ispackage");
            return (Criteria) this;
        }

        public Criteria andIspackageNotIn(List<Integer> values) {
            addCriterion("ispackage not in", values, "ispackage");
            return (Criteria) this;
        }

        public Criteria andIspackageBetween(Integer value1, Integer value2) {
            addCriterion("ispackage between", value1, value2, "ispackage");
            return (Criteria) this;
        }

        public Criteria andIspackageNotBetween(Integer value1, Integer value2) {
            addCriterion("ispackage not between", value1, value2, "ispackage");
            return (Criteria) this;
        }

        public Criteria andFrontpictrueIsNull() {
            addCriterion("Frontpictrue is null");
            return (Criteria) this;
        }

        public Criteria andFrontpictrueIsNotNull() {
            addCriterion("Frontpictrue is not null");
            return (Criteria) this;
        }

        public Criteria andFrontpictrueEqualTo(String value) {
            addCriterion("Frontpictrue =", value, "frontpictrue");
            return (Criteria) this;
        }

        public Criteria andFrontpictrueNotEqualTo(String value) {
            addCriterion("Frontpictrue <>", value, "frontpictrue");
            return (Criteria) this;
        }

        public Criteria andFrontpictrueGreaterThan(String value) {
            addCriterion("Frontpictrue >", value, "frontpictrue");
            return (Criteria) this;
        }

        public Criteria andFrontpictrueGreaterThanOrEqualTo(String value) {
            addCriterion("Frontpictrue >=", value, "frontpictrue");
            return (Criteria) this;
        }

        public Criteria andFrontpictrueLessThan(String value) {
            addCriterion("Frontpictrue <", value, "frontpictrue");
            return (Criteria) this;
        }

        public Criteria andFrontpictrueLessThanOrEqualTo(String value) {
            addCriterion("Frontpictrue <=", value, "frontpictrue");
            return (Criteria) this;
        }

        public Criteria andFrontpictrueLike(String value) {
            addCriterion("Frontpictrue like", value, "frontpictrue");
            return (Criteria) this;
        }

        public Criteria andFrontpictrueNotLike(String value) {
            addCriterion("Frontpictrue not like", value, "frontpictrue");
            return (Criteria) this;
        }

        public Criteria andFrontpictrueIn(List<String> values) {
            addCriterion("Frontpictrue in", values, "frontpictrue");
            return (Criteria) this;
        }

        public Criteria andFrontpictrueNotIn(List<String> values) {
            addCriterion("Frontpictrue not in", values, "frontpictrue");
            return (Criteria) this;
        }

        public Criteria andFrontpictrueBetween(String value1, String value2) {
            addCriterion("Frontpictrue between", value1, value2, "frontpictrue");
            return (Criteria) this;
        }

        public Criteria andFrontpictrueNotBetween(String value1, String value2) {
            addCriterion("Frontpictrue not between", value1, value2, "frontpictrue");
            return (Criteria) this;
        }

        public Criteria andShangtimeIsNull() {
            addCriterion("ShangTime is null");
            return (Criteria) this;
        }

        public Criteria andShangtimeIsNotNull() {
            addCriterion("ShangTime is not null");
            return (Criteria) this;
        }

        public Criteria andShangtimeEqualTo(Date value) {
            addCriterion("ShangTime =", value, "shangtime");
            return (Criteria) this;
        }

        public Criteria andShangtimeNotEqualTo(Date value) {
            addCriterion("ShangTime <>", value, "shangtime");
            return (Criteria) this;
        }

        public Criteria andShangtimeGreaterThan(Date value) {
            addCriterion("ShangTime >", value, "shangtime");
            return (Criteria) this;
        }

        public Criteria andShangtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("ShangTime >=", value, "shangtime");
            return (Criteria) this;
        }

        public Criteria andShangtimeLessThan(Date value) {
            addCriterion("ShangTime <", value, "shangtime");
            return (Criteria) this;
        }

        public Criteria andShangtimeLessThanOrEqualTo(Date value) {
            addCriterion("ShangTime <=", value, "shangtime");
            return (Criteria) this;
        }

        public Criteria andShangtimeIn(List<Date> values) {
            addCriterion("ShangTime in", values, "shangtime");
            return (Criteria) this;
        }

        public Criteria andShangtimeNotIn(List<Date> values) {
            addCriterion("ShangTime not in", values, "shangtime");
            return (Criteria) this;
        }

        public Criteria andShangtimeBetween(Date value1, Date value2) {
            addCriterion("ShangTime between", value1, value2, "shangtime");
            return (Criteria) this;
        }

        public Criteria andShangtimeNotBetween(Date value1, Date value2) {
            addCriterion("ShangTime not between", value1, value2, "shangtime");
            return (Criteria) this;
        }

        public Criteria andCategoryidIsNull() {
            addCriterion("categoryId is null");
            return (Criteria) this;
        }

        public Criteria andCategoryidIsNotNull() {
            addCriterion("categoryId is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryidEqualTo(String value) {
            addCriterion("categoryId =", value, "categoryid");
            return (Criteria) this;
        }

        public Criteria andCategoryidNotEqualTo(String value) {
            addCriterion("categoryId <>", value, "categoryid");
            return (Criteria) this;
        }

        public Criteria andCategoryidGreaterThan(String value) {
            addCriterion("categoryId >", value, "categoryid");
            return (Criteria) this;
        }

        public Criteria andCategoryidGreaterThanOrEqualTo(String value) {
            addCriterion("categoryId >=", value, "categoryid");
            return (Criteria) this;
        }

        public Criteria andCategoryidLessThan(String value) {
            addCriterion("categoryId <", value, "categoryid");
            return (Criteria) this;
        }

        public Criteria andCategoryidLessThanOrEqualTo(String value) {
            addCriterion("categoryId <=", value, "categoryid");
            return (Criteria) this;
        }

        public Criteria andCategoryidLike(String value) {
            addCriterion("categoryId like", value, "categoryid");
            return (Criteria) this;
        }

        public Criteria andCategoryidNotLike(String value) {
            addCriterion("categoryId not like", value, "categoryid");
            return (Criteria) this;
        }

        public Criteria andCategoryidIn(List<String> values) {
            addCriterion("categoryId in", values, "categoryid");
            return (Criteria) this;
        }

        public Criteria andCategoryidNotIn(List<String> values) {
            addCriterion("categoryId not in", values, "categoryid");
            return (Criteria) this;
        }

        public Criteria andCategoryidBetween(String value1, String value2) {
            addCriterion("categoryId between", value1, value2, "categoryid");
            return (Criteria) this;
        }

        public Criteria andCategoryidNotBetween(String value1, String value2) {
            addCriterion("categoryId not between", value1, value2, "categoryid");
            return (Criteria) this;
        }

        public Criteria andAllsellnumberIsNull() {
            addCriterion("AllsellNumber is null");
            return (Criteria) this;
        }

        public Criteria andAllsellnumberIsNotNull() {
            addCriterion("AllsellNumber is not null");
            return (Criteria) this;
        }

        public Criteria andAllsellnumberEqualTo(Integer value) {
            addCriterion("AllsellNumber =", value, "allsellnumber");
            return (Criteria) this;
        }

        public Criteria andAllsellnumberNotEqualTo(Integer value) {
            addCriterion("AllsellNumber <>", value, "allsellnumber");
            return (Criteria) this;
        }

        public Criteria andAllsellnumberGreaterThan(Integer value) {
            addCriterion("AllsellNumber >", value, "allsellnumber");
            return (Criteria) this;
        }

        public Criteria andAllsellnumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("AllsellNumber >=", value, "allsellnumber");
            return (Criteria) this;
        }

        public Criteria andAllsellnumberLessThan(Integer value) {
            addCriterion("AllsellNumber <", value, "allsellnumber");
            return (Criteria) this;
        }

        public Criteria andAllsellnumberLessThanOrEqualTo(Integer value) {
            addCriterion("AllsellNumber <=", value, "allsellnumber");
            return (Criteria) this;
        }

        public Criteria andAllsellnumberIn(List<Integer> values) {
            addCriterion("AllsellNumber in", values, "allsellnumber");
            return (Criteria) this;
        }

        public Criteria andAllsellnumberNotIn(List<Integer> values) {
            addCriterion("AllsellNumber not in", values, "allsellnumber");
            return (Criteria) this;
        }

        public Criteria andAllsellnumberBetween(Integer value1, Integer value2) {
            addCriterion("AllsellNumber between", value1, value2, "allsellnumber");
            return (Criteria) this;
        }

        public Criteria andAllsellnumberNotBetween(Integer value1, Integer value2) {
            addCriterion("AllsellNumber not between", value1, value2, "allsellnumber");
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