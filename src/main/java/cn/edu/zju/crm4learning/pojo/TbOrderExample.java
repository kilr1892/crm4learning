package cn.edu.zju.crm4learning.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class TbOrderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbOrderExample() {
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

        public Criteria andPrimaryKeyForOrderIsNull() {
            addCriterion("primary_key_for_order is null");
            return (Criteria) this;
        }

        public Criteria andPrimaryKeyForOrderIsNotNull() {
            addCriterion("primary_key_for_order is not null");
            return (Criteria) this;
        }

        public Criteria andPrimaryKeyForOrderEqualTo(Integer value) {
            addCriterion("primary_key_for_order =", value, "primaryKeyForOrder");
            return (Criteria) this;
        }

        public Criteria andPrimaryKeyForOrderNotEqualTo(Integer value) {
            addCriterion("primary_key_for_order <>", value, "primaryKeyForOrder");
            return (Criteria) this;
        }

        public Criteria andPrimaryKeyForOrderGreaterThan(Integer value) {
            addCriterion("primary_key_for_order >", value, "primaryKeyForOrder");
            return (Criteria) this;
        }

        public Criteria andPrimaryKeyForOrderGreaterThanOrEqualTo(Integer value) {
            addCriterion("primary_key_for_order >=", value, "primaryKeyForOrder");
            return (Criteria) this;
        }

        public Criteria andPrimaryKeyForOrderLessThan(Integer value) {
            addCriterion("primary_key_for_order <", value, "primaryKeyForOrder");
            return (Criteria) this;
        }

        public Criteria andPrimaryKeyForOrderLessThanOrEqualTo(Integer value) {
            addCriterion("primary_key_for_order <=", value, "primaryKeyForOrder");
            return (Criteria) this;
        }

        public Criteria andPrimaryKeyForOrderIn(List<Integer> values) {
            addCriterion("primary_key_for_order in", values, "primaryKeyForOrder");
            return (Criteria) this;
        }

        public Criteria andPrimaryKeyForOrderNotIn(List<Integer> values) {
            addCriterion("primary_key_for_order not in", values, "primaryKeyForOrder");
            return (Criteria) this;
        }

        public Criteria andPrimaryKeyForOrderBetween(Integer value1, Integer value2) {
            addCriterion("primary_key_for_order between", value1, value2, "primaryKeyForOrder");
            return (Criteria) this;
        }

        public Criteria andPrimaryKeyForOrderNotBetween(Integer value1, Integer value2) {
            addCriterion("primary_key_for_order not between", value1, value2, "primaryKeyForOrder");
            return (Criteria) this;
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
            addCriterionForJDBCDate("order_date =", value, "orderDate");
            return (Criteria) this;
        }

        public Criteria andOrderDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("order_date <>", value, "orderDate");
            return (Criteria) this;
        }

        public Criteria andOrderDateGreaterThan(Date value) {
            addCriterionForJDBCDate("order_date >", value, "orderDate");
            return (Criteria) this;
        }

        public Criteria andOrderDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("order_date >=", value, "orderDate");
            return (Criteria) this;
        }

        public Criteria andOrderDateLessThan(Date value) {
            addCriterionForJDBCDate("order_date <", value, "orderDate");
            return (Criteria) this;
        }

        public Criteria andOrderDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("order_date <=", value, "orderDate");
            return (Criteria) this;
        }

        public Criteria andOrderDateIn(List<Date> values) {
            addCriterionForJDBCDate("order_date in", values, "orderDate");
            return (Criteria) this;
        }

        public Criteria andOrderDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("order_date not in", values, "orderDate");
            return (Criteria) this;
        }

        public Criteria andOrderDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("order_date between", value1, value2, "orderDate");
            return (Criteria) this;
        }

        public Criteria andOrderDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("order_date not between", value1, value2, "orderDate");
            return (Criteria) this;
        }

        public Criteria andOrderDeliveryDateIsNull() {
            addCriterion("order_delivery_date is null");
            return (Criteria) this;
        }

        public Criteria andOrderDeliveryDateIsNotNull() {
            addCriterion("order_delivery_date is not null");
            return (Criteria) this;
        }

        public Criteria andOrderDeliveryDateEqualTo(Date value) {
            addCriterionForJDBCDate("order_delivery_date =", value, "orderDeliveryDate");
            return (Criteria) this;
        }

        public Criteria andOrderDeliveryDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("order_delivery_date <>", value, "orderDeliveryDate");
            return (Criteria) this;
        }

        public Criteria andOrderDeliveryDateGreaterThan(Date value) {
            addCriterionForJDBCDate("order_delivery_date >", value, "orderDeliveryDate");
            return (Criteria) this;
        }

        public Criteria andOrderDeliveryDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("order_delivery_date >=", value, "orderDeliveryDate");
            return (Criteria) this;
        }

        public Criteria andOrderDeliveryDateLessThan(Date value) {
            addCriterionForJDBCDate("order_delivery_date <", value, "orderDeliveryDate");
            return (Criteria) this;
        }

        public Criteria andOrderDeliveryDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("order_delivery_date <=", value, "orderDeliveryDate");
            return (Criteria) this;
        }

        public Criteria andOrderDeliveryDateIn(List<Date> values) {
            addCriterionForJDBCDate("order_delivery_date in", values, "orderDeliveryDate");
            return (Criteria) this;
        }

        public Criteria andOrderDeliveryDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("order_delivery_date not in", values, "orderDeliveryDate");
            return (Criteria) this;
        }

        public Criteria andOrderDeliveryDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("order_delivery_date between", value1, value2, "orderDeliveryDate");
            return (Criteria) this;
        }

        public Criteria andOrderDeliveryDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("order_delivery_date not between", value1, value2, "orderDeliveryDate");
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

        public Criteria andOrderCustomerPhoneIsNull() {
            addCriterion("order_customer_phone is null");
            return (Criteria) this;
        }

        public Criteria andOrderCustomerPhoneIsNotNull() {
            addCriterion("order_customer_phone is not null");
            return (Criteria) this;
        }

        public Criteria andOrderCustomerPhoneEqualTo(String value) {
            addCriterion("order_customer_phone =", value, "orderCustomerPhone");
            return (Criteria) this;
        }

        public Criteria andOrderCustomerPhoneNotEqualTo(String value) {
            addCriterion("order_customer_phone <>", value, "orderCustomerPhone");
            return (Criteria) this;
        }

        public Criteria andOrderCustomerPhoneGreaterThan(String value) {
            addCriterion("order_customer_phone >", value, "orderCustomerPhone");
            return (Criteria) this;
        }

        public Criteria andOrderCustomerPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("order_customer_phone >=", value, "orderCustomerPhone");
            return (Criteria) this;
        }

        public Criteria andOrderCustomerPhoneLessThan(String value) {
            addCriterion("order_customer_phone <", value, "orderCustomerPhone");
            return (Criteria) this;
        }

        public Criteria andOrderCustomerPhoneLessThanOrEqualTo(String value) {
            addCriterion("order_customer_phone <=", value, "orderCustomerPhone");
            return (Criteria) this;
        }

        public Criteria andOrderCustomerPhoneLike(String value) {
            addCriterion("order_customer_phone like", value, "orderCustomerPhone");
            return (Criteria) this;
        }

        public Criteria andOrderCustomerPhoneNotLike(String value) {
            addCriterion("order_customer_phone not like", value, "orderCustomerPhone");
            return (Criteria) this;
        }

        public Criteria andOrderCustomerPhoneIn(List<String> values) {
            addCriterion("order_customer_phone in", values, "orderCustomerPhone");
            return (Criteria) this;
        }

        public Criteria andOrderCustomerPhoneNotIn(List<String> values) {
            addCriterion("order_customer_phone not in", values, "orderCustomerPhone");
            return (Criteria) this;
        }

        public Criteria andOrderCustomerPhoneBetween(String value1, String value2) {
            addCriterion("order_customer_phone between", value1, value2, "orderCustomerPhone");
            return (Criteria) this;
        }

        public Criteria andOrderCustomerPhoneNotBetween(String value1, String value2) {
            addCriterion("order_customer_phone not between", value1, value2, "orderCustomerPhone");
            return (Criteria) this;
        }

        public Criteria andOrderCustomerAddressIsNull() {
            addCriterion("order_customer_address is null");
            return (Criteria) this;
        }

        public Criteria andOrderCustomerAddressIsNotNull() {
            addCriterion("order_customer_address is not null");
            return (Criteria) this;
        }

        public Criteria andOrderCustomerAddressEqualTo(String value) {
            addCriterion("order_customer_address =", value, "orderCustomerAddress");
            return (Criteria) this;
        }

        public Criteria andOrderCustomerAddressNotEqualTo(String value) {
            addCriterion("order_customer_address <>", value, "orderCustomerAddress");
            return (Criteria) this;
        }

        public Criteria andOrderCustomerAddressGreaterThan(String value) {
            addCriterion("order_customer_address >", value, "orderCustomerAddress");
            return (Criteria) this;
        }

        public Criteria andOrderCustomerAddressGreaterThanOrEqualTo(String value) {
            addCriterion("order_customer_address >=", value, "orderCustomerAddress");
            return (Criteria) this;
        }

        public Criteria andOrderCustomerAddressLessThan(String value) {
            addCriterion("order_customer_address <", value, "orderCustomerAddress");
            return (Criteria) this;
        }

        public Criteria andOrderCustomerAddressLessThanOrEqualTo(String value) {
            addCriterion("order_customer_address <=", value, "orderCustomerAddress");
            return (Criteria) this;
        }

        public Criteria andOrderCustomerAddressLike(String value) {
            addCriterion("order_customer_address like", value, "orderCustomerAddress");
            return (Criteria) this;
        }

        public Criteria andOrderCustomerAddressNotLike(String value) {
            addCriterion("order_customer_address not like", value, "orderCustomerAddress");
            return (Criteria) this;
        }

        public Criteria andOrderCustomerAddressIn(List<String> values) {
            addCriterion("order_customer_address in", values, "orderCustomerAddress");
            return (Criteria) this;
        }

        public Criteria andOrderCustomerAddressNotIn(List<String> values) {
            addCriterion("order_customer_address not in", values, "orderCustomerAddress");
            return (Criteria) this;
        }

        public Criteria andOrderCustomerAddressBetween(String value1, String value2) {
            addCriterion("order_customer_address between", value1, value2, "orderCustomerAddress");
            return (Criteria) this;
        }

        public Criteria andOrderCustomerAddressNotBetween(String value1, String value2) {
            addCriterion("order_customer_address not between", value1, value2, "orderCustomerAddress");
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

        public Criteria andOrderMaterialColorIsNull() {
            addCriterion("order_material_color is null");
            return (Criteria) this;
        }

        public Criteria andOrderMaterialColorIsNotNull() {
            addCriterion("order_material_color is not null");
            return (Criteria) this;
        }

        public Criteria andOrderMaterialColorEqualTo(String value) {
            addCriterion("order_material_color =", value, "orderMaterialColor");
            return (Criteria) this;
        }

        public Criteria andOrderMaterialColorNotEqualTo(String value) {
            addCriterion("order_material_color <>", value, "orderMaterialColor");
            return (Criteria) this;
        }

        public Criteria andOrderMaterialColorGreaterThan(String value) {
            addCriterion("order_material_color >", value, "orderMaterialColor");
            return (Criteria) this;
        }

        public Criteria andOrderMaterialColorGreaterThanOrEqualTo(String value) {
            addCriterion("order_material_color >=", value, "orderMaterialColor");
            return (Criteria) this;
        }

        public Criteria andOrderMaterialColorLessThan(String value) {
            addCriterion("order_material_color <", value, "orderMaterialColor");
            return (Criteria) this;
        }

        public Criteria andOrderMaterialColorLessThanOrEqualTo(String value) {
            addCriterion("order_material_color <=", value, "orderMaterialColor");
            return (Criteria) this;
        }

        public Criteria andOrderMaterialColorLike(String value) {
            addCriterion("order_material_color like", value, "orderMaterialColor");
            return (Criteria) this;
        }

        public Criteria andOrderMaterialColorNotLike(String value) {
            addCriterion("order_material_color not like", value, "orderMaterialColor");
            return (Criteria) this;
        }

        public Criteria andOrderMaterialColorIn(List<String> values) {
            addCriterion("order_material_color in", values, "orderMaterialColor");
            return (Criteria) this;
        }

        public Criteria andOrderMaterialColorNotIn(List<String> values) {
            addCriterion("order_material_color not in", values, "orderMaterialColor");
            return (Criteria) this;
        }

        public Criteria andOrderMaterialColorBetween(String value1, String value2) {
            addCriterion("order_material_color between", value1, value2, "orderMaterialColor");
            return (Criteria) this;
        }

        public Criteria andOrderMaterialColorNotBetween(String value1, String value2) {
            addCriterion("order_material_color not between", value1, value2, "orderMaterialColor");
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

        public Criteria andOrderMaterialMeterIsNull() {
            addCriterion("order_material_meter is null");
            return (Criteria) this;
        }

        public Criteria andOrderMaterialMeterIsNotNull() {
            addCriterion("order_material_meter is not null");
            return (Criteria) this;
        }

        public Criteria andOrderMaterialMeterEqualTo(String value) {
            addCriterion("order_material_meter =", value, "orderMaterialMeter");
            return (Criteria) this;
        }

        public Criteria andOrderMaterialMeterNotEqualTo(String value) {
            addCriterion("order_material_meter <>", value, "orderMaterialMeter");
            return (Criteria) this;
        }

        public Criteria andOrderMaterialMeterGreaterThan(String value) {
            addCriterion("order_material_meter >", value, "orderMaterialMeter");
            return (Criteria) this;
        }

        public Criteria andOrderMaterialMeterGreaterThanOrEqualTo(String value) {
            addCriterion("order_material_meter >=", value, "orderMaterialMeter");
            return (Criteria) this;
        }

        public Criteria andOrderMaterialMeterLessThan(String value) {
            addCriterion("order_material_meter <", value, "orderMaterialMeter");
            return (Criteria) this;
        }

        public Criteria andOrderMaterialMeterLessThanOrEqualTo(String value) {
            addCriterion("order_material_meter <=", value, "orderMaterialMeter");
            return (Criteria) this;
        }

        public Criteria andOrderMaterialMeterLike(String value) {
            addCriterion("order_material_meter like", value, "orderMaterialMeter");
            return (Criteria) this;
        }

        public Criteria andOrderMaterialMeterNotLike(String value) {
            addCriterion("order_material_meter not like", value, "orderMaterialMeter");
            return (Criteria) this;
        }

        public Criteria andOrderMaterialMeterIn(List<String> values) {
            addCriterion("order_material_meter in", values, "orderMaterialMeter");
            return (Criteria) this;
        }

        public Criteria andOrderMaterialMeterNotIn(List<String> values) {
            addCriterion("order_material_meter not in", values, "orderMaterialMeter");
            return (Criteria) this;
        }

        public Criteria andOrderMaterialMeterBetween(String value1, String value2) {
            addCriterion("order_material_meter between", value1, value2, "orderMaterialMeter");
            return (Criteria) this;
        }

        public Criteria andOrderMaterialMeterNotBetween(String value1, String value2) {
            addCriterion("order_material_meter not between", value1, value2, "orderMaterialMeter");
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

        public Criteria andOrderMaterialWeightEqualTo(BigDecimal value) {
            addCriterion("order_material_weight =", value, "orderMaterialWeight");
            return (Criteria) this;
        }

        public Criteria andOrderMaterialWeightNotEqualTo(BigDecimal value) {
            addCriterion("order_material_weight <>", value, "orderMaterialWeight");
            return (Criteria) this;
        }

        public Criteria andOrderMaterialWeightGreaterThan(BigDecimal value) {
            addCriterion("order_material_weight >", value, "orderMaterialWeight");
            return (Criteria) this;
        }

        public Criteria andOrderMaterialWeightGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("order_material_weight >=", value, "orderMaterialWeight");
            return (Criteria) this;
        }

        public Criteria andOrderMaterialWeightLessThan(BigDecimal value) {
            addCriterion("order_material_weight <", value, "orderMaterialWeight");
            return (Criteria) this;
        }

        public Criteria andOrderMaterialWeightLessThanOrEqualTo(BigDecimal value) {
            addCriterion("order_material_weight <=", value, "orderMaterialWeight");
            return (Criteria) this;
        }

        public Criteria andOrderMaterialWeightIn(List<BigDecimal> values) {
            addCriterion("order_material_weight in", values, "orderMaterialWeight");
            return (Criteria) this;
        }

        public Criteria andOrderMaterialWeightNotIn(List<BigDecimal> values) {
            addCriterion("order_material_weight not in", values, "orderMaterialWeight");
            return (Criteria) this;
        }

        public Criteria andOrderMaterialWeightBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("order_material_weight between", value1, value2, "orderMaterialWeight");
            return (Criteria) this;
        }

        public Criteria andOrderMaterialWeightNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("order_material_weight not between", value1, value2, "orderMaterialWeight");
            return (Criteria) this;
        }

        public Criteria andOrderMaterialCoronaIsNull() {
            addCriterion("order_material_corona is null");
            return (Criteria) this;
        }

        public Criteria andOrderMaterialCoronaIsNotNull() {
            addCriterion("order_material_corona is not null");
            return (Criteria) this;
        }

        public Criteria andOrderMaterialCoronaEqualTo(String value) {
            addCriterion("order_material_corona =", value, "orderMaterialCorona");
            return (Criteria) this;
        }

        public Criteria andOrderMaterialCoronaNotEqualTo(String value) {
            addCriterion("order_material_corona <>", value, "orderMaterialCorona");
            return (Criteria) this;
        }

        public Criteria andOrderMaterialCoronaGreaterThan(String value) {
            addCriterion("order_material_corona >", value, "orderMaterialCorona");
            return (Criteria) this;
        }

        public Criteria andOrderMaterialCoronaGreaterThanOrEqualTo(String value) {
            addCriterion("order_material_corona >=", value, "orderMaterialCorona");
            return (Criteria) this;
        }

        public Criteria andOrderMaterialCoronaLessThan(String value) {
            addCriterion("order_material_corona <", value, "orderMaterialCorona");
            return (Criteria) this;
        }

        public Criteria andOrderMaterialCoronaLessThanOrEqualTo(String value) {
            addCriterion("order_material_corona <=", value, "orderMaterialCorona");
            return (Criteria) this;
        }

        public Criteria andOrderMaterialCoronaLike(String value) {
            addCriterion("order_material_corona like", value, "orderMaterialCorona");
            return (Criteria) this;
        }

        public Criteria andOrderMaterialCoronaNotLike(String value) {
            addCriterion("order_material_corona not like", value, "orderMaterialCorona");
            return (Criteria) this;
        }

        public Criteria andOrderMaterialCoronaIn(List<String> values) {
            addCriterion("order_material_corona in", values, "orderMaterialCorona");
            return (Criteria) this;
        }

        public Criteria andOrderMaterialCoronaNotIn(List<String> values) {
            addCriterion("order_material_corona not in", values, "orderMaterialCorona");
            return (Criteria) this;
        }

        public Criteria andOrderMaterialCoronaBetween(String value1, String value2) {
            addCriterion("order_material_corona between", value1, value2, "orderMaterialCorona");
            return (Criteria) this;
        }

        public Criteria andOrderMaterialCoronaNotBetween(String value1, String value2) {
            addCriterion("order_material_corona not between", value1, value2, "orderMaterialCorona");
            return (Criteria) this;
        }

        public Criteria andOrderMaterialFoldingMouthIsNull() {
            addCriterion("order_material_folding_mouth is null");
            return (Criteria) this;
        }

        public Criteria andOrderMaterialFoldingMouthIsNotNull() {
            addCriterion("order_material_folding_mouth is not null");
            return (Criteria) this;
        }

        public Criteria andOrderMaterialFoldingMouthEqualTo(String value) {
            addCriterion("order_material_folding_mouth =", value, "orderMaterialFoldingMouth");
            return (Criteria) this;
        }

        public Criteria andOrderMaterialFoldingMouthNotEqualTo(String value) {
            addCriterion("order_material_folding_mouth <>", value, "orderMaterialFoldingMouth");
            return (Criteria) this;
        }

        public Criteria andOrderMaterialFoldingMouthGreaterThan(String value) {
            addCriterion("order_material_folding_mouth >", value, "orderMaterialFoldingMouth");
            return (Criteria) this;
        }

        public Criteria andOrderMaterialFoldingMouthGreaterThanOrEqualTo(String value) {
            addCriterion("order_material_folding_mouth >=", value, "orderMaterialFoldingMouth");
            return (Criteria) this;
        }

        public Criteria andOrderMaterialFoldingMouthLessThan(String value) {
            addCriterion("order_material_folding_mouth <", value, "orderMaterialFoldingMouth");
            return (Criteria) this;
        }

        public Criteria andOrderMaterialFoldingMouthLessThanOrEqualTo(String value) {
            addCriterion("order_material_folding_mouth <=", value, "orderMaterialFoldingMouth");
            return (Criteria) this;
        }

        public Criteria andOrderMaterialFoldingMouthLike(String value) {
            addCriterion("order_material_folding_mouth like", value, "orderMaterialFoldingMouth");
            return (Criteria) this;
        }

        public Criteria andOrderMaterialFoldingMouthNotLike(String value) {
            addCriterion("order_material_folding_mouth not like", value, "orderMaterialFoldingMouth");
            return (Criteria) this;
        }

        public Criteria andOrderMaterialFoldingMouthIn(List<String> values) {
            addCriterion("order_material_folding_mouth in", values, "orderMaterialFoldingMouth");
            return (Criteria) this;
        }

        public Criteria andOrderMaterialFoldingMouthNotIn(List<String> values) {
            addCriterion("order_material_folding_mouth not in", values, "orderMaterialFoldingMouth");
            return (Criteria) this;
        }

        public Criteria andOrderMaterialFoldingMouthBetween(String value1, String value2) {
            addCriterion("order_material_folding_mouth between", value1, value2, "orderMaterialFoldingMouth");
            return (Criteria) this;
        }

        public Criteria andOrderMaterialFoldingMouthNotBetween(String value1, String value2) {
            addCriterion("order_material_folding_mouth not between", value1, value2, "orderMaterialFoldingMouth");
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

        public Criteria andOrderRemarksIsNull() {
            addCriterion("order_remarks is null");
            return (Criteria) this;
        }

        public Criteria andOrderRemarksIsNotNull() {
            addCriterion("order_remarks is not null");
            return (Criteria) this;
        }

        public Criteria andOrderRemarksEqualTo(String value) {
            addCriterion("order_remarks =", value, "orderRemarks");
            return (Criteria) this;
        }

        public Criteria andOrderRemarksNotEqualTo(String value) {
            addCriterion("order_remarks <>", value, "orderRemarks");
            return (Criteria) this;
        }

        public Criteria andOrderRemarksGreaterThan(String value) {
            addCriterion("order_remarks >", value, "orderRemarks");
            return (Criteria) this;
        }

        public Criteria andOrderRemarksGreaterThanOrEqualTo(String value) {
            addCriterion("order_remarks >=", value, "orderRemarks");
            return (Criteria) this;
        }

        public Criteria andOrderRemarksLessThan(String value) {
            addCriterion("order_remarks <", value, "orderRemarks");
            return (Criteria) this;
        }

        public Criteria andOrderRemarksLessThanOrEqualTo(String value) {
            addCriterion("order_remarks <=", value, "orderRemarks");
            return (Criteria) this;
        }

        public Criteria andOrderRemarksLike(String value) {
            addCriterion("order_remarks like", value, "orderRemarks");
            return (Criteria) this;
        }

        public Criteria andOrderRemarksNotLike(String value) {
            addCriterion("order_remarks not like", value, "orderRemarks");
            return (Criteria) this;
        }

        public Criteria andOrderRemarksIn(List<String> values) {
            addCriterion("order_remarks in", values, "orderRemarks");
            return (Criteria) this;
        }

        public Criteria andOrderRemarksNotIn(List<String> values) {
            addCriterion("order_remarks not in", values, "orderRemarks");
            return (Criteria) this;
        }

        public Criteria andOrderRemarksBetween(String value1, String value2) {
            addCriterion("order_remarks between", value1, value2, "orderRemarks");
            return (Criteria) this;
        }

        public Criteria andOrderRemarksNotBetween(String value1, String value2) {
            addCriterion("order_remarks not between", value1, value2, "orderRemarks");
            return (Criteria) this;
        }

        public Criteria andOrderCuttingWageIsNull() {
            addCriterion("order_cutting_wage is null");
            return (Criteria) this;
        }

        public Criteria andOrderCuttingWageIsNotNull() {
            addCriterion("order_cutting_wage is not null");
            return (Criteria) this;
        }

        public Criteria andOrderCuttingWageEqualTo(BigDecimal value) {
            addCriterion("order_cutting_wage =", value, "orderCuttingWage");
            return (Criteria) this;
        }

        public Criteria andOrderCuttingWageNotEqualTo(BigDecimal value) {
            addCriterion("order_cutting_wage <>", value, "orderCuttingWage");
            return (Criteria) this;
        }

        public Criteria andOrderCuttingWageGreaterThan(BigDecimal value) {
            addCriterion("order_cutting_wage >", value, "orderCuttingWage");
            return (Criteria) this;
        }

        public Criteria andOrderCuttingWageGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("order_cutting_wage >=", value, "orderCuttingWage");
            return (Criteria) this;
        }

        public Criteria andOrderCuttingWageLessThan(BigDecimal value) {
            addCriterion("order_cutting_wage <", value, "orderCuttingWage");
            return (Criteria) this;
        }

        public Criteria andOrderCuttingWageLessThanOrEqualTo(BigDecimal value) {
            addCriterion("order_cutting_wage <=", value, "orderCuttingWage");
            return (Criteria) this;
        }

        public Criteria andOrderCuttingWageIn(List<BigDecimal> values) {
            addCriterion("order_cutting_wage in", values, "orderCuttingWage");
            return (Criteria) this;
        }

        public Criteria andOrderCuttingWageNotIn(List<BigDecimal> values) {
            addCriterion("order_cutting_wage not in", values, "orderCuttingWage");
            return (Criteria) this;
        }

        public Criteria andOrderCuttingWageBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("order_cutting_wage between", value1, value2, "orderCuttingWage");
            return (Criteria) this;
        }

        public Criteria andOrderCuttingWageNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("order_cutting_wage not between", value1, value2, "orderCuttingWage");
            return (Criteria) this;
        }

        public Criteria andOrderTaxPointIsNull() {
            addCriterion("order_tax_point is null");
            return (Criteria) this;
        }

        public Criteria andOrderTaxPointIsNotNull() {
            addCriterion("order_tax_point is not null");
            return (Criteria) this;
        }

        public Criteria andOrderTaxPointEqualTo(BigDecimal value) {
            addCriterion("order_tax_point =", value, "orderTaxPoint");
            return (Criteria) this;
        }

        public Criteria andOrderTaxPointNotEqualTo(BigDecimal value) {
            addCriterion("order_tax_point <>", value, "orderTaxPoint");
            return (Criteria) this;
        }

        public Criteria andOrderTaxPointGreaterThan(BigDecimal value) {
            addCriterion("order_tax_point >", value, "orderTaxPoint");
            return (Criteria) this;
        }

        public Criteria andOrderTaxPointGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("order_tax_point >=", value, "orderTaxPoint");
            return (Criteria) this;
        }

        public Criteria andOrderTaxPointLessThan(BigDecimal value) {
            addCriterion("order_tax_point <", value, "orderTaxPoint");
            return (Criteria) this;
        }

        public Criteria andOrderTaxPointLessThanOrEqualTo(BigDecimal value) {
            addCriterion("order_tax_point <=", value, "orderTaxPoint");
            return (Criteria) this;
        }

        public Criteria andOrderTaxPointIn(List<BigDecimal> values) {
            addCriterion("order_tax_point in", values, "orderTaxPoint");
            return (Criteria) this;
        }

        public Criteria andOrderTaxPointNotIn(List<BigDecimal> values) {
            addCriterion("order_tax_point not in", values, "orderTaxPoint");
            return (Criteria) this;
        }

        public Criteria andOrderTaxPointBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("order_tax_point between", value1, value2, "orderTaxPoint");
            return (Criteria) this;
        }

        public Criteria andOrderTaxPointNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("order_tax_point not between", value1, value2, "orderTaxPoint");
            return (Criteria) this;
        }

        public Criteria andOrderStrikeIsNull() {
            addCriterion("order_strike is null");
            return (Criteria) this;
        }

        public Criteria andOrderStrikeIsNotNull() {
            addCriterion("order_strike is not null");
            return (Criteria) this;
        }

        public Criteria andOrderStrikeEqualTo(BigDecimal value) {
            addCriterion("order_strike =", value, "orderStrike");
            return (Criteria) this;
        }

        public Criteria andOrderStrikeNotEqualTo(BigDecimal value) {
            addCriterion("order_strike <>", value, "orderStrike");
            return (Criteria) this;
        }

        public Criteria andOrderStrikeGreaterThan(BigDecimal value) {
            addCriterion("order_strike >", value, "orderStrike");
            return (Criteria) this;
        }

        public Criteria andOrderStrikeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("order_strike >=", value, "orderStrike");
            return (Criteria) this;
        }

        public Criteria andOrderStrikeLessThan(BigDecimal value) {
            addCriterion("order_strike <", value, "orderStrike");
            return (Criteria) this;
        }

        public Criteria andOrderStrikeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("order_strike <=", value, "orderStrike");
            return (Criteria) this;
        }

        public Criteria andOrderStrikeIn(List<BigDecimal> values) {
            addCriterion("order_strike in", values, "orderStrike");
            return (Criteria) this;
        }

        public Criteria andOrderStrikeNotIn(List<BigDecimal> values) {
            addCriterion("order_strike not in", values, "orderStrike");
            return (Criteria) this;
        }

        public Criteria andOrderStrikeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("order_strike between", value1, value2, "orderStrike");
            return (Criteria) this;
        }

        public Criteria andOrderStrikeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("order_strike not between", value1, value2, "orderStrike");
            return (Criteria) this;
        }

        public Criteria andPaymentInputMoneyIsNull() {
            addCriterion("payment_input_money is null");
            return (Criteria) this;
        }

        public Criteria andPaymentInputMoneyIsNotNull() {
            addCriterion("payment_input_money is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentInputMoneyEqualTo(BigDecimal value) {
            addCriterion("payment_input_money =", value, "paymentInputMoney");
            return (Criteria) this;
        }

        public Criteria andPaymentInputMoneyNotEqualTo(BigDecimal value) {
            addCriterion("payment_input_money <>", value, "paymentInputMoney");
            return (Criteria) this;
        }

        public Criteria andPaymentInputMoneyGreaterThan(BigDecimal value) {
            addCriterion("payment_input_money >", value, "paymentInputMoney");
            return (Criteria) this;
        }

        public Criteria andPaymentInputMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("payment_input_money >=", value, "paymentInputMoney");
            return (Criteria) this;
        }

        public Criteria andPaymentInputMoneyLessThan(BigDecimal value) {
            addCriterion("payment_input_money <", value, "paymentInputMoney");
            return (Criteria) this;
        }

        public Criteria andPaymentInputMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("payment_input_money <=", value, "paymentInputMoney");
            return (Criteria) this;
        }

        public Criteria andPaymentInputMoneyIn(List<BigDecimal> values) {
            addCriterion("payment_input_money in", values, "paymentInputMoney");
            return (Criteria) this;
        }

        public Criteria andPaymentInputMoneyNotIn(List<BigDecimal> values) {
            addCriterion("payment_input_money not in", values, "paymentInputMoney");
            return (Criteria) this;
        }

        public Criteria andPaymentInputMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("payment_input_money between", value1, value2, "paymentInputMoney");
            return (Criteria) this;
        }

        public Criteria andPaymentInputMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("payment_input_money not between", value1, value2, "paymentInputMoney");
            return (Criteria) this;
        }

        public Criteria andShowEveryReceivablesIsNull() {
            addCriterion("show_every_receivables is null");
            return (Criteria) this;
        }

        public Criteria andShowEveryReceivablesIsNotNull() {
            addCriterion("show_every_receivables is not null");
            return (Criteria) this;
        }

        public Criteria andShowEveryReceivablesEqualTo(BigDecimal value) {
            addCriterion("show_every_receivables =", value, "showEveryReceivables");
            return (Criteria) this;
        }

        public Criteria andShowEveryReceivablesNotEqualTo(BigDecimal value) {
            addCriterion("show_every_receivables <>", value, "showEveryReceivables");
            return (Criteria) this;
        }

        public Criteria andShowEveryReceivablesGreaterThan(BigDecimal value) {
            addCriterion("show_every_receivables >", value, "showEveryReceivables");
            return (Criteria) this;
        }

        public Criteria andShowEveryReceivablesGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("show_every_receivables >=", value, "showEveryReceivables");
            return (Criteria) this;
        }

        public Criteria andShowEveryReceivablesLessThan(BigDecimal value) {
            addCriterion("show_every_receivables <", value, "showEveryReceivables");
            return (Criteria) this;
        }

        public Criteria andShowEveryReceivablesLessThanOrEqualTo(BigDecimal value) {
            addCriterion("show_every_receivables <=", value, "showEveryReceivables");
            return (Criteria) this;
        }

        public Criteria andShowEveryReceivablesIn(List<BigDecimal> values) {
            addCriterion("show_every_receivables in", values, "showEveryReceivables");
            return (Criteria) this;
        }

        public Criteria andShowEveryReceivablesNotIn(List<BigDecimal> values) {
            addCriterion("show_every_receivables not in", values, "showEveryReceivables");
            return (Criteria) this;
        }

        public Criteria andShowEveryReceivablesBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("show_every_receivables between", value1, value2, "showEveryReceivables");
            return (Criteria) this;
        }

        public Criteria andShowEveryReceivablesNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("show_every_receivables not between", value1, value2, "showEveryReceivables");
            return (Criteria) this;
        }

        public Criteria andPaymentMethodIsNull() {
            addCriterion("payment_method is null");
            return (Criteria) this;
        }

        public Criteria andPaymentMethodIsNotNull() {
            addCriterion("payment_method is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentMethodEqualTo(String value) {
            addCriterion("payment_method =", value, "paymentMethod");
            return (Criteria) this;
        }

        public Criteria andPaymentMethodNotEqualTo(String value) {
            addCriterion("payment_method <>", value, "paymentMethod");
            return (Criteria) this;
        }

        public Criteria andPaymentMethodGreaterThan(String value) {
            addCriterion("payment_method >", value, "paymentMethod");
            return (Criteria) this;
        }

        public Criteria andPaymentMethodGreaterThanOrEqualTo(String value) {
            addCriterion("payment_method >=", value, "paymentMethod");
            return (Criteria) this;
        }

        public Criteria andPaymentMethodLessThan(String value) {
            addCriterion("payment_method <", value, "paymentMethod");
            return (Criteria) this;
        }

        public Criteria andPaymentMethodLessThanOrEqualTo(String value) {
            addCriterion("payment_method <=", value, "paymentMethod");
            return (Criteria) this;
        }

        public Criteria andPaymentMethodLike(String value) {
            addCriterion("payment_method like", value, "paymentMethod");
            return (Criteria) this;
        }

        public Criteria andPaymentMethodNotLike(String value) {
            addCriterion("payment_method not like", value, "paymentMethod");
            return (Criteria) this;
        }

        public Criteria andPaymentMethodIn(List<String> values) {
            addCriterion("payment_method in", values, "paymentMethod");
            return (Criteria) this;
        }

        public Criteria andPaymentMethodNotIn(List<String> values) {
            addCriterion("payment_method not in", values, "paymentMethod");
            return (Criteria) this;
        }

        public Criteria andPaymentMethodBetween(String value1, String value2) {
            addCriterion("payment_method between", value1, value2, "paymentMethod");
            return (Criteria) this;
        }

        public Criteria andPaymentMethodNotBetween(String value1, String value2) {
            addCriterion("payment_method not between", value1, value2, "paymentMethod");
            return (Criteria) this;
        }

        public Criteria andPaymentRemarksIsNull() {
            addCriterion("payment_remarks is null");
            return (Criteria) this;
        }

        public Criteria andPaymentRemarksIsNotNull() {
            addCriterion("payment_remarks is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentRemarksEqualTo(String value) {
            addCriterion("payment_remarks =", value, "paymentRemarks");
            return (Criteria) this;
        }

        public Criteria andPaymentRemarksNotEqualTo(String value) {
            addCriterion("payment_remarks <>", value, "paymentRemarks");
            return (Criteria) this;
        }

        public Criteria andPaymentRemarksGreaterThan(String value) {
            addCriterion("payment_remarks >", value, "paymentRemarks");
            return (Criteria) this;
        }

        public Criteria andPaymentRemarksGreaterThanOrEqualTo(String value) {
            addCriterion("payment_remarks >=", value, "paymentRemarks");
            return (Criteria) this;
        }

        public Criteria andPaymentRemarksLessThan(String value) {
            addCriterion("payment_remarks <", value, "paymentRemarks");
            return (Criteria) this;
        }

        public Criteria andPaymentRemarksLessThanOrEqualTo(String value) {
            addCriterion("payment_remarks <=", value, "paymentRemarks");
            return (Criteria) this;
        }

        public Criteria andPaymentRemarksLike(String value) {
            addCriterion("payment_remarks like", value, "paymentRemarks");
            return (Criteria) this;
        }

        public Criteria andPaymentRemarksNotLike(String value) {
            addCriterion("payment_remarks not like", value, "paymentRemarks");
            return (Criteria) this;
        }

        public Criteria andPaymentRemarksIn(List<String> values) {
            addCriterion("payment_remarks in", values, "paymentRemarks");
            return (Criteria) this;
        }

        public Criteria andPaymentRemarksNotIn(List<String> values) {
            addCriterion("payment_remarks not in", values, "paymentRemarks");
            return (Criteria) this;
        }

        public Criteria andPaymentRemarksBetween(String value1, String value2) {
            addCriterion("payment_remarks between", value1, value2, "paymentRemarks");
            return (Criteria) this;
        }

        public Criteria andPaymentRemarksNotBetween(String value1, String value2) {
            addCriterion("payment_remarks not between", value1, value2, "paymentRemarks");
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