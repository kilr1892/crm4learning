package cn.edu.zju.crm4learning.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PaymentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PaymentExample() {
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

        public Criteria andPaymentOrderIdIsNull() {
            addCriterion("payment_order_id is null");
            return (Criteria) this;
        }

        public Criteria andPaymentOrderIdIsNotNull() {
            addCriterion("payment_order_id is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentOrderIdEqualTo(String value) {
            addCriterion("payment_order_id =", value, "paymentOrderId");
            return (Criteria) this;
        }

        public Criteria andPaymentOrderIdNotEqualTo(String value) {
            addCriterion("payment_order_id <>", value, "paymentOrderId");
            return (Criteria) this;
        }

        public Criteria andPaymentOrderIdGreaterThan(String value) {
            addCriterion("payment_order_id >", value, "paymentOrderId");
            return (Criteria) this;
        }

        public Criteria andPaymentOrderIdGreaterThanOrEqualTo(String value) {
            addCriterion("payment_order_id >=", value, "paymentOrderId");
            return (Criteria) this;
        }

        public Criteria andPaymentOrderIdLessThan(String value) {
            addCriterion("payment_order_id <", value, "paymentOrderId");
            return (Criteria) this;
        }

        public Criteria andPaymentOrderIdLessThanOrEqualTo(String value) {
            addCriterion("payment_order_id <=", value, "paymentOrderId");
            return (Criteria) this;
        }

        public Criteria andPaymentOrderIdLike(String value) {
            addCriterion("payment_order_id like", value, "paymentOrderId");
            return (Criteria) this;
        }

        public Criteria andPaymentOrderIdNotLike(String value) {
            addCriterion("payment_order_id not like", value, "paymentOrderId");
            return (Criteria) this;
        }

        public Criteria andPaymentOrderIdIn(List<String> values) {
            addCriterion("payment_order_id in", values, "paymentOrderId");
            return (Criteria) this;
        }

        public Criteria andPaymentOrderIdNotIn(List<String> values) {
            addCriterion("payment_order_id not in", values, "paymentOrderId");
            return (Criteria) this;
        }

        public Criteria andPaymentOrderIdBetween(String value1, String value2) {
            addCriterion("payment_order_id between", value1, value2, "paymentOrderId");
            return (Criteria) this;
        }

        public Criteria andPaymentOrderIdNotBetween(String value1, String value2) {
            addCriterion("payment_order_id not between", value1, value2, "paymentOrderId");
            return (Criteria) this;
        }

        public Criteria andPaymentDateIsNull() {
            addCriterion("payment_date is null");
            return (Criteria) this;
        }

        public Criteria andPaymentDateIsNotNull() {
            addCriterion("payment_date is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentDateEqualTo(Date value) {
            addCriterion("payment_date =", value, "paymentDate");
            return (Criteria) this;
        }

        public Criteria andPaymentDateNotEqualTo(Date value) {
            addCriterion("payment_date <>", value, "paymentDate");
            return (Criteria) this;
        }

        public Criteria andPaymentDateGreaterThan(Date value) {
            addCriterion("payment_date >", value, "paymentDate");
            return (Criteria) this;
        }

        public Criteria andPaymentDateGreaterThanOrEqualTo(Date value) {
            addCriterion("payment_date >=", value, "paymentDate");
            return (Criteria) this;
        }

        public Criteria andPaymentDateLessThan(Date value) {
            addCriterion("payment_date <", value, "paymentDate");
            return (Criteria) this;
        }

        public Criteria andPaymentDateLessThanOrEqualTo(Date value) {
            addCriterion("payment_date <=", value, "paymentDate");
            return (Criteria) this;
        }

        public Criteria andPaymentDateIn(List<Date> values) {
            addCriterion("payment_date in", values, "paymentDate");
            return (Criteria) this;
        }

        public Criteria andPaymentDateNotIn(List<Date> values) {
            addCriterion("payment_date not in", values, "paymentDate");
            return (Criteria) this;
        }

        public Criteria andPaymentDateBetween(Date value1, Date value2) {
            addCriterion("payment_date between", value1, value2, "paymentDate");
            return (Criteria) this;
        }

        public Criteria andPaymentDateNotBetween(Date value1, Date value2) {
            addCriterion("payment_date not between", value1, value2, "paymentDate");
            return (Criteria) this;
        }

        public Criteria andPaymentCuttingWageIsNull() {
            addCriterion("payment_cutting_wage is null");
            return (Criteria) this;
        }

        public Criteria andPaymentCuttingWageIsNotNull() {
            addCriterion("payment_cutting_wage is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentCuttingWageEqualTo(BigDecimal value) {
            addCriterion("payment_cutting_wage =", value, "paymentCuttingWage");
            return (Criteria) this;
        }

        public Criteria andPaymentCuttingWageNotEqualTo(BigDecimal value) {
            addCriterion("payment_cutting_wage <>", value, "paymentCuttingWage");
            return (Criteria) this;
        }

        public Criteria andPaymentCuttingWageGreaterThan(BigDecimal value) {
            addCriterion("payment_cutting_wage >", value, "paymentCuttingWage");
            return (Criteria) this;
        }

        public Criteria andPaymentCuttingWageGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("payment_cutting_wage >=", value, "paymentCuttingWage");
            return (Criteria) this;
        }

        public Criteria andPaymentCuttingWageLessThan(BigDecimal value) {
            addCriterion("payment_cutting_wage <", value, "paymentCuttingWage");
            return (Criteria) this;
        }

        public Criteria andPaymentCuttingWageLessThanOrEqualTo(BigDecimal value) {
            addCriterion("payment_cutting_wage <=", value, "paymentCuttingWage");
            return (Criteria) this;
        }

        public Criteria andPaymentCuttingWageIn(List<BigDecimal> values) {
            addCriterion("payment_cutting_wage in", values, "paymentCuttingWage");
            return (Criteria) this;
        }

        public Criteria andPaymentCuttingWageNotIn(List<BigDecimal> values) {
            addCriterion("payment_cutting_wage not in", values, "paymentCuttingWage");
            return (Criteria) this;
        }

        public Criteria andPaymentCuttingWageBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("payment_cutting_wage between", value1, value2, "paymentCuttingWage");
            return (Criteria) this;
        }

        public Criteria andPaymentCuttingWageNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("payment_cutting_wage not between", value1, value2, "paymentCuttingWage");
            return (Criteria) this;
        }

        public Criteria andPaymentTaxPointIsNull() {
            addCriterion("payment_tax_point is null");
            return (Criteria) this;
        }

        public Criteria andPaymentTaxPointIsNotNull() {
            addCriterion("payment_tax_point is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentTaxPointEqualTo(BigDecimal value) {
            addCriterion("payment_tax_point =", value, "paymentTaxPoint");
            return (Criteria) this;
        }

        public Criteria andPaymentTaxPointNotEqualTo(BigDecimal value) {
            addCriterion("payment_tax_point <>", value, "paymentTaxPoint");
            return (Criteria) this;
        }

        public Criteria andPaymentTaxPointGreaterThan(BigDecimal value) {
            addCriterion("payment_tax_point >", value, "paymentTaxPoint");
            return (Criteria) this;
        }

        public Criteria andPaymentTaxPointGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("payment_tax_point >=", value, "paymentTaxPoint");
            return (Criteria) this;
        }

        public Criteria andPaymentTaxPointLessThan(BigDecimal value) {
            addCriterion("payment_tax_point <", value, "paymentTaxPoint");
            return (Criteria) this;
        }

        public Criteria andPaymentTaxPointLessThanOrEqualTo(BigDecimal value) {
            addCriterion("payment_tax_point <=", value, "paymentTaxPoint");
            return (Criteria) this;
        }

        public Criteria andPaymentTaxPointIn(List<BigDecimal> values) {
            addCriterion("payment_tax_point in", values, "paymentTaxPoint");
            return (Criteria) this;
        }

        public Criteria andPaymentTaxPointNotIn(List<BigDecimal> values) {
            addCriterion("payment_tax_point not in", values, "paymentTaxPoint");
            return (Criteria) this;
        }

        public Criteria andPaymentTaxPointBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("payment_tax_point between", value1, value2, "paymentTaxPoint");
            return (Criteria) this;
        }

        public Criteria andPaymentTaxPointNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("payment_tax_point not between", value1, value2, "paymentTaxPoint");
            return (Criteria) this;
        }

        public Criteria andPaymentStrikeIsNull() {
            addCriterion("payment_strike is null");
            return (Criteria) this;
        }

        public Criteria andPaymentStrikeIsNotNull() {
            addCriterion("payment_strike is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentStrikeEqualTo(BigDecimal value) {
            addCriterion("payment_strike =", value, "paymentStrike");
            return (Criteria) this;
        }

        public Criteria andPaymentStrikeNotEqualTo(BigDecimal value) {
            addCriterion("payment_strike <>", value, "paymentStrike");
            return (Criteria) this;
        }

        public Criteria andPaymentStrikeGreaterThan(BigDecimal value) {
            addCriterion("payment_strike >", value, "paymentStrike");
            return (Criteria) this;
        }

        public Criteria andPaymentStrikeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("payment_strike >=", value, "paymentStrike");
            return (Criteria) this;
        }

        public Criteria andPaymentStrikeLessThan(BigDecimal value) {
            addCriterion("payment_strike <", value, "paymentStrike");
            return (Criteria) this;
        }

        public Criteria andPaymentStrikeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("payment_strike <=", value, "paymentStrike");
            return (Criteria) this;
        }

        public Criteria andPaymentStrikeIn(List<BigDecimal> values) {
            addCriterion("payment_strike in", values, "paymentStrike");
            return (Criteria) this;
        }

        public Criteria andPaymentStrikeNotIn(List<BigDecimal> values) {
            addCriterion("payment_strike not in", values, "paymentStrike");
            return (Criteria) this;
        }

        public Criteria andPaymentStrikeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("payment_strike between", value1, value2, "paymentStrike");
            return (Criteria) this;
        }

        public Criteria andPaymentStrikeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("payment_strike not between", value1, value2, "paymentStrike");
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