package cn.edu.zju.crm4learning.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrderExample() {
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

        public Criteria andOrderIdIsNull() {
            addCriterion("order_id is null");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNotNull() {
            addCriterion("order_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrderIdEqualTo(String value) {
            addCriterion("order_id =", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotEqualTo(String value) {
            addCriterion("order_id <>", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThan(String value) {
            addCriterion("order_id >", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThanOrEqualTo(String value) {
            addCriterion("order_id >=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThan(String value) {
            addCriterion("order_id <", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThanOrEqualTo(String value) {
            addCriterion("order_id <=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLike(String value) {
            addCriterion("order_id like", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotLike(String value) {
            addCriterion("order_id not like", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdIn(List<String> values) {
            addCriterion("order_id in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotIn(List<String> values) {
            addCriterion("order_id not in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdBetween(String value1, String value2) {
            addCriterion("order_id between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotBetween(String value1, String value2) {
            addCriterion("order_id not between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderDateIsNull() {
            addCriterion("order_date is null");
            return (Criteria) this;
        }

        public Criteria andOrderDateIsNotNull() {
            addCriterion("order_date is not null");
            return (Criteria) this;
        }

        public Criteria andOrderDateEqualTo(Date value) {
            addCriterion("order_date =", value, "orderDate");
            return (Criteria) this;
        }

        public Criteria andOrderDateNotEqualTo(Date value) {
            addCriterion("order_date <>", value, "orderDate");
            return (Criteria) this;
        }

        public Criteria andOrderDateGreaterThan(Date value) {
            addCriterion("order_date >", value, "orderDate");
            return (Criteria) this;
        }

        public Criteria andOrderDateGreaterThanOrEqualTo(Date value) {
            addCriterion("order_date >=", value, "orderDate");
            return (Criteria) this;
        }

        public Criteria andOrderDateLessThan(Date value) {
            addCriterion("order_date <", value, "orderDate");
            return (Criteria) this;
        }

        public Criteria andOrderDateLessThanOrEqualTo(Date value) {
            addCriterion("order_date <=", value, "orderDate");
            return (Criteria) this;
        }

        public Criteria andOrderDateIn(List<Date> values) {
            addCriterion("order_date in", values, "orderDate");
            return (Criteria) this;
        }

        public Criteria andOrderDateNotIn(List<Date> values) {
            addCriterion("order_date not in", values, "orderDate");
            return (Criteria) this;
        }

        public Criteria andOrderDateBetween(Date value1, Date value2) {
            addCriterion("order_date between", value1, value2, "orderDate");
            return (Criteria) this;
        }

        public Criteria andOrderDateNotBetween(Date value1, Date value2) {
            addCriterion("order_date not between", value1, value2, "orderDate");
            return (Criteria) this;
        }

        public Criteria andOrderCustomerIdIsNull() {
            addCriterion("order_customer_id is null");
            return (Criteria) this;
        }

        public Criteria andOrderCustomerIdIsNotNull() {
            addCriterion("order_customer_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrderCustomerIdEqualTo(String value) {
            addCriterion("order_customer_id =", value, "orderCustomerId");
            return (Criteria) this;
        }

        public Criteria andOrderCustomerIdNotEqualTo(String value) {
            addCriterion("order_customer_id <>", value, "orderCustomerId");
            return (Criteria) this;
        }

        public Criteria andOrderCustomerIdGreaterThan(String value) {
            addCriterion("order_customer_id >", value, "orderCustomerId");
            return (Criteria) this;
        }

        public Criteria andOrderCustomerIdGreaterThanOrEqualTo(String value) {
            addCriterion("order_customer_id >=", value, "orderCustomerId");
            return (Criteria) this;
        }

        public Criteria andOrderCustomerIdLessThan(String value) {
            addCriterion("order_customer_id <", value, "orderCustomerId");
            return (Criteria) this;
        }

        public Criteria andOrderCustomerIdLessThanOrEqualTo(String value) {
            addCriterion("order_customer_id <=", value, "orderCustomerId");
            return (Criteria) this;
        }

        public Criteria andOrderCustomerIdLike(String value) {
            addCriterion("order_customer_id like", value, "orderCustomerId");
            return (Criteria) this;
        }

        public Criteria andOrderCustomerIdNotLike(String value) {
            addCriterion("order_customer_id not like", value, "orderCustomerId");
            return (Criteria) this;
        }

        public Criteria andOrderCustomerIdIn(List<String> values) {
            addCriterion("order_customer_id in", values, "orderCustomerId");
            return (Criteria) this;
        }

        public Criteria andOrderCustomerIdNotIn(List<String> values) {
            addCriterion("order_customer_id not in", values, "orderCustomerId");
            return (Criteria) this;
        }

        public Criteria andOrderCustomerIdBetween(String value1, String value2) {
            addCriterion("order_customer_id between", value1, value2, "orderCustomerId");
            return (Criteria) this;
        }

        public Criteria andOrderCustomerIdNotBetween(String value1, String value2) {
            addCriterion("order_customer_id not between", value1, value2, "orderCustomerId");
            return (Criteria) this;
        }

        public Criteria andOrderCustomerNameIsNull() {
            addCriterion("order_customer_name is null");
            return (Criteria) this;
        }

        public Criteria andOrderCustomerNameIsNotNull() {
            addCriterion("order_customer_name is not null");
            return (Criteria) this;
        }

        public Criteria andOrderCustomerNameEqualTo(String value) {
            addCriterion("order_customer_name =", value, "orderCustomerName");
            return (Criteria) this;
        }

        public Criteria andOrderCustomerNameNotEqualTo(String value) {
            addCriterion("order_customer_name <>", value, "orderCustomerName");
            return (Criteria) this;
        }

        public Criteria andOrderCustomerNameGreaterThan(String value) {
            addCriterion("order_customer_name >", value, "orderCustomerName");
            return (Criteria) this;
        }

        public Criteria andOrderCustomerNameGreaterThanOrEqualTo(String value) {
            addCriterion("order_customer_name >=", value, "orderCustomerName");
            return (Criteria) this;
        }

        public Criteria andOrderCustomerNameLessThan(String value) {
            addCriterion("order_customer_name <", value, "orderCustomerName");
            return (Criteria) this;
        }

        public Criteria andOrderCustomerNameLessThanOrEqualTo(String value) {
            addCriterion("order_customer_name <=", value, "orderCustomerName");
            return (Criteria) this;
        }

        public Criteria andOrderCustomerNameLike(String value) {
            addCriterion("order_customer_name like", value, "orderCustomerName");
            return (Criteria) this;
        }

        public Criteria andOrderCustomerNameNotLike(String value) {
            addCriterion("order_customer_name not like", value, "orderCustomerName");
            return (Criteria) this;
        }

        public Criteria andOrderCustomerNameIn(List<String> values) {
            addCriterion("order_customer_name in", values, "orderCustomerName");
            return (Criteria) this;
        }

        public Criteria andOrderCustomerNameNotIn(List<String> values) {
            addCriterion("order_customer_name not in", values, "orderCustomerName");
            return (Criteria) this;
        }

        public Criteria andOrderCustomerNameBetween(String value1, String value2) {
            addCriterion("order_customer_name between", value1, value2, "orderCustomerName");
            return (Criteria) this;
        }

        public Criteria andOrderCustomerNameNotBetween(String value1, String value2) {
            addCriterion("order_customer_name not between", value1, value2, "orderCustomerName");
            return (Criteria) this;
        }

        public Criteria andOrderMaterialNameIsNull() {
            addCriterion("order_material_name is null");
            return (Criteria) this;
        }

        public Criteria andOrderMaterialNameIsNotNull() {
            addCriterion("order_material_name is not null");
            return (Criteria) this;
        }

        public Criteria andOrderMaterialNameEqualTo(String value) {
            addCriterion("order_material_name =", value, "orderMaterialName");
            return (Criteria) this;
        }

        public Criteria andOrderMaterialNameNotEqualTo(String value) {
            addCriterion("order_material_name <>", value, "orderMaterialName");
            return (Criteria) this;
        }

        public Criteria andOrderMaterialNameGreaterThan(String value) {
            addCriterion("order_material_name >", value, "orderMaterialName");
            return (Criteria) this;
        }

        public Criteria andOrderMaterialNameGreaterThanOrEqualTo(String value) {
            addCriterion("order_material_name >=", value, "orderMaterialName");
            return (Criteria) this;
        }

        public Criteria andOrderMaterialNameLessThan(String value) {
            addCriterion("order_material_name <", value, "orderMaterialName");
            return (Criteria) this;
        }

        public Criteria andOrderMaterialNameLessThanOrEqualTo(String value) {
            addCriterion("order_material_name <=", value, "orderMaterialName");
            return (Criteria) this;
        }

        public Criteria andOrderMaterialNameLike(String value) {
            addCriterion("order_material_name like", value, "orderMaterialName");
            return (Criteria) this;
        }

        public Criteria andOrderMaterialNameNotLike(String value) {
            addCriterion("order_material_name not like", value, "orderMaterialName");
            return (Criteria) this;
        }

        public Criteria andOrderMaterialNameIn(List<String> values) {
            addCriterion("order_material_name in", values, "orderMaterialName");
            return (Criteria) this;
        }

        public Criteria andOrderMaterialNameNotIn(List<String> values) {
            addCriterion("order_material_name not in", values, "orderMaterialName");
            return (Criteria) this;
        }

        public Criteria andOrderMaterialNameBetween(String value1, String value2) {
            addCriterion("order_material_name between", value1, value2, "orderMaterialName");
            return (Criteria) this;
        }

        public Criteria andOrderMaterialNameNotBetween(String value1, String value2) {
            addCriterion("order_material_name not between", value1, value2, "orderMaterialName");
            return (Criteria) this;
        }

        public Criteria andOrderMaterialClolrIsNull() {
            addCriterion("order_material_clolr is null");
            return (Criteria) this;
        }

        public Criteria andOrderMaterialClolrIsNotNull() {
            addCriterion("order_material_clolr is not null");
            return (Criteria) this;
        }

        public Criteria andOrderMaterialClolrEqualTo(String value) {
            addCriterion("order_material_clolr =", value, "orderMaterialClolr");
            return (Criteria) this;
        }

        public Criteria andOrderMaterialClolrNotEqualTo(String value) {
            addCriterion("order_material_clolr <>", value, "orderMaterialClolr");
            return (Criteria) this;
        }

        public Criteria andOrderMaterialClolrGreaterThan(String value) {
            addCriterion("order_material_clolr >", value, "orderMaterialClolr");
            return (Criteria) this;
        }

        public Criteria andOrderMaterialClolrGreaterThanOrEqualTo(String value) {
            addCriterion("order_material_clolr >=", value, "orderMaterialClolr");
            return (Criteria) this;
        }

        public Criteria andOrderMaterialClolrLessThan(String value) {
            addCriterion("order_material_clolr <", value, "orderMaterialClolr");
            return (Criteria) this;
        }

        public Criteria andOrderMaterialClolrLessThanOrEqualTo(String value) {
            addCriterion("order_material_clolr <=", value, "orderMaterialClolr");
            return (Criteria) this;
        }

        public Criteria andOrderMaterialClolrLike(String value) {
            addCriterion("order_material_clolr like", value, "orderMaterialClolr");
            return (Criteria) this;
        }

        public Criteria andOrderMaterialClolrNotLike(String value) {
            addCriterion("order_material_clolr not like", value, "orderMaterialClolr");
            return (Criteria) this;
        }

        public Criteria andOrderMaterialClolrIn(List<String> values) {
            addCriterion("order_material_clolr in", values, "orderMaterialClolr");
            return (Criteria) this;
        }

        public Criteria andOrderMaterialClolrNotIn(List<String> values) {
            addCriterion("order_material_clolr not in", values, "orderMaterialClolr");
            return (Criteria) this;
        }

        public Criteria andOrderMaterialClolrBetween(String value1, String value2) {
            addCriterion("order_material_clolr between", value1, value2, "orderMaterialClolr");
            return (Criteria) this;
        }

        public Criteria andOrderMaterialClolrNotBetween(String value1, String value2) {
            addCriterion("order_material_clolr not between", value1, value2, "orderMaterialClolr");
            return (Criteria) this;
        }

        public Criteria andOrderMaterialSpecificationsIsNull() {
            addCriterion("order_material_specifications is null");
            return (Criteria) this;
        }

        public Criteria andOrderMaterialSpecificationsIsNotNull() {
            addCriterion("order_material_specifications is not null");
            return (Criteria) this;
        }

        public Criteria andOrderMaterialSpecificationsEqualTo(String value) {
            addCriterion("order_material_specifications =", value, "orderMaterialSpecifications");
            return (Criteria) this;
        }

        public Criteria andOrderMaterialSpecificationsNotEqualTo(String value) {
            addCriterion("order_material_specifications <>", value, "orderMaterialSpecifications");
            return (Criteria) this;
        }

        public Criteria andOrderMaterialSpecificationsGreaterThan(String value) {
            addCriterion("order_material_specifications >", value, "orderMaterialSpecifications");
            return (Criteria) this;
        }

        public Criteria andOrderMaterialSpecificationsGreaterThanOrEqualTo(String value) {
            addCriterion("order_material_specifications >=", value, "orderMaterialSpecifications");
            return (Criteria) this;
        }

        public Criteria andOrderMaterialSpecificationsLessThan(String value) {
            addCriterion("order_material_specifications <", value, "orderMaterialSpecifications");
            return (Criteria) this;
        }

        public Criteria andOrderMaterialSpecificationsLessThanOrEqualTo(String value) {
            addCriterion("order_material_specifications <=", value, "orderMaterialSpecifications");
            return (Criteria) this;
        }

        public Criteria andOrderMaterialSpecificationsLike(String value) {
            addCriterion("order_material_specifications like", value, "orderMaterialSpecifications");
            return (Criteria) this;
        }

        public Criteria andOrderMaterialSpecificationsNotLike(String value) {
            addCriterion("order_material_specifications not like", value, "orderMaterialSpecifications");
            return (Criteria) this;
        }

        public Criteria andOrderMaterialSpecificationsIn(List<String> values) {
            addCriterion("order_material_specifications in", values, "orderMaterialSpecifications");
            return (Criteria) this;
        }

        public Criteria andOrderMaterialSpecificationsNotIn(List<String> values) {
            addCriterion("order_material_specifications not in", values, "orderMaterialSpecifications");
            return (Criteria) this;
        }

        public Criteria andOrderMaterialSpecificationsBetween(String value1, String value2) {
            addCriterion("order_material_specifications between", value1, value2, "orderMaterialSpecifications");
            return (Criteria) this;
        }

        public Criteria andOrderMaterialSpecificationsNotBetween(String value1, String value2) {
            addCriterion("order_material_specifications not between", value1, value2, "orderMaterialSpecifications");
            return (Criteria) this;
        }

        public Criteria andOrderMaterialWeightIsNull() {
            addCriterion("order_material_weight is null");
            return (Criteria) this;
        }

        public Criteria andOrderMaterialWeightIsNotNull() {
            addCriterion("order_material_weight is not null");
            return (Criteria) this;
        }

        public Criteria andOrderMaterialWeightEqualTo(Double value) {
            addCriterion("order_material_weight =", value, "orderMaterialWeight");
            return (Criteria) this;
        }

        public Criteria andOrderMaterialWeightNotEqualTo(Double value) {
            addCriterion("order_material_weight <>", value, "orderMaterialWeight");
            return (Criteria) this;
        }

        public Criteria andOrderMaterialWeightGreaterThan(Double value) {
            addCriterion("order_material_weight >", value, "orderMaterialWeight");
            return (Criteria) this;
        }

        public Criteria andOrderMaterialWeightGreaterThanOrEqualTo(Double value) {
            addCriterion("order_material_weight >=", value, "orderMaterialWeight");
            return (Criteria) this;
        }

        public Criteria andOrderMaterialWeightLessThan(Double value) {
            addCriterion("order_material_weight <", value, "orderMaterialWeight");
            return (Criteria) this;
        }

        public Criteria andOrderMaterialWeightLessThanOrEqualTo(Double value) {
            addCriterion("order_material_weight <=", value, "orderMaterialWeight");
            return (Criteria) this;
        }

        public Criteria andOrderMaterialWeightIn(List<Double> values) {
            addCriterion("order_material_weight in", values, "orderMaterialWeight");
            return (Criteria) this;
        }

        public Criteria andOrderMaterialWeightNotIn(List<Double> values) {
            addCriterion("order_material_weight not in", values, "orderMaterialWeight");
            return (Criteria) this;
        }

        public Criteria andOrderMaterialWeightBetween(Double value1, Double value2) {
            addCriterion("order_material_weight between", value1, value2, "orderMaterialWeight");
            return (Criteria) this;
        }

        public Criteria andOrderMaterialWeightNotBetween(Double value1, Double value2) {
            addCriterion("order_material_weight not between", value1, value2, "orderMaterialWeight");
            return (Criteria) this;
        }

        public Criteria andOrderPriceIsNull() {
            addCriterion("order_price is null");
            return (Criteria) this;
        }

        public Criteria andOrderPriceIsNotNull() {
            addCriterion("order_price is not null");
            return (Criteria) this;
        }

        public Criteria andOrderPriceEqualTo(BigDecimal value) {
            addCriterion("order_price =", value, "orderPrice");
            return (Criteria) this;
        }

        public Criteria andOrderPriceNotEqualTo(BigDecimal value) {
            addCriterion("order_price <>", value, "orderPrice");
            return (Criteria) this;
        }

        public Criteria andOrderPriceGreaterThan(BigDecimal value) {
            addCriterion("order_price >", value, "orderPrice");
            return (Criteria) this;
        }

        public Criteria andOrderPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("order_price >=", value, "orderPrice");
            return (Criteria) this;
        }

        public Criteria andOrderPriceLessThan(BigDecimal value) {
            addCriterion("order_price <", value, "orderPrice");
            return (Criteria) this;
        }

        public Criteria andOrderPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("order_price <=", value, "orderPrice");
            return (Criteria) this;
        }

        public Criteria andOrderPriceIn(List<BigDecimal> values) {
            addCriterion("order_price in", values, "orderPrice");
            return (Criteria) this;
        }

        public Criteria andOrderPriceNotIn(List<BigDecimal> values) {
            addCriterion("order_price not in", values, "orderPrice");
            return (Criteria) this;
        }

        public Criteria andOrderPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("order_price between", value1, value2, "orderPrice");
            return (Criteria) this;
        }

        public Criteria andOrderPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("order_price not between", value1, value2, "orderPrice");
            return (Criteria) this;
        }

        public Criteria andOrderTotalPriceIsNull() {
            addCriterion("order_total_price is null");
            return (Criteria) this;
        }

        public Criteria andOrderTotalPriceIsNotNull() {
            addCriterion("order_total_price is not null");
            return (Criteria) this;
        }

        public Criteria andOrderTotalPriceEqualTo(BigDecimal value) {
            addCriterion("order_total_price =", value, "orderTotalPrice");
            return (Criteria) this;
        }

        public Criteria andOrderTotalPriceNotEqualTo(BigDecimal value) {
            addCriterion("order_total_price <>", value, "orderTotalPrice");
            return (Criteria) this;
        }

        public Criteria andOrderTotalPriceGreaterThan(BigDecimal value) {
            addCriterion("order_total_price >", value, "orderTotalPrice");
            return (Criteria) this;
        }

        public Criteria andOrderTotalPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("order_total_price >=", value, "orderTotalPrice");
            return (Criteria) this;
        }

        public Criteria andOrderTotalPriceLessThan(BigDecimal value) {
            addCriterion("order_total_price <", value, "orderTotalPrice");
            return (Criteria) this;
        }

        public Criteria andOrderTotalPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("order_total_price <=", value, "orderTotalPrice");
            return (Criteria) this;
        }

        public Criteria andOrderTotalPriceIn(List<BigDecimal> values) {
            addCriterion("order_total_price in", values, "orderTotalPrice");
            return (Criteria) this;
        }

        public Criteria andOrderTotalPriceNotIn(List<BigDecimal> values) {
            addCriterion("order_total_price not in", values, "orderTotalPrice");
            return (Criteria) this;
        }

        public Criteria andOrderTotalPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("order_total_price between", value1, value2, "orderTotalPrice");
            return (Criteria) this;
        }

        public Criteria andOrderTotalPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("order_total_price not between", value1, value2, "orderTotalPrice");
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