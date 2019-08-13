package cn.edu.zju.crm4learning.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class TbCustomerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbCustomerExample() {
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

        public Criteria andCustomerIdIsNull() {
            addCriterion("customer_id is null");
            return (Criteria) this;
        }

        public Criteria andCustomerIdIsNotNull() {
            addCriterion("customer_id is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerIdEqualTo(Integer value) {
            addCriterion("customer_id =", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNotEqualTo(Integer value) {
            addCriterion("customer_id <>", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdGreaterThan(Integer value) {
            addCriterion("customer_id >", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("customer_id >=", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdLessThan(Integer value) {
            addCriterion("customer_id <", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdLessThanOrEqualTo(Integer value) {
            addCriterion("customer_id <=", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdIn(List<Integer> values) {
            addCriterion("customer_id in", values, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNotIn(List<Integer> values) {
            addCriterion("customer_id not in", values, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdBetween(Integer value1, Integer value2) {
            addCriterion("customer_id between", value1, value2, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNotBetween(Integer value1, Integer value2) {
            addCriterion("customer_id not between", value1, value2, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerNameIsNull() {
            addCriterion("customer_name is null");
            return (Criteria) this;
        }

        public Criteria andCustomerNameIsNotNull() {
            addCriterion("customer_name is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerNameEqualTo(String value) {
            addCriterion("customer_name =", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameNotEqualTo(String value) {
            addCriterion("customer_name <>", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameGreaterThan(String value) {
            addCriterion("customer_name >", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameGreaterThanOrEqualTo(String value) {
            addCriterion("customer_name >=", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameLessThan(String value) {
            addCriterion("customer_name <", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameLessThanOrEqualTo(String value) {
            addCriterion("customer_name <=", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameLike(String value) {
            addCriterion("customer_name like", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameNotLike(String value) {
            addCriterion("customer_name not like", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameIn(List<String> values) {
            addCriterion("customer_name in", values, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameNotIn(List<String> values) {
            addCriterion("customer_name not in", values, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameBetween(String value1, String value2) {
            addCriterion("customer_name between", value1, value2, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameNotBetween(String value1, String value2) {
            addCriterion("customer_name not between", value1, value2, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneIsNull() {
            addCriterion("customer_phone is null");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneIsNotNull() {
            addCriterion("customer_phone is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneEqualTo(String value) {
            addCriterion("customer_phone =", value, "customerPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneNotEqualTo(String value) {
            addCriterion("customer_phone <>", value, "customerPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneGreaterThan(String value) {
            addCriterion("customer_phone >", value, "customerPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("customer_phone >=", value, "customerPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneLessThan(String value) {
            addCriterion("customer_phone <", value, "customerPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneLessThanOrEqualTo(String value) {
            addCriterion("customer_phone <=", value, "customerPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneLike(String value) {
            addCriterion("customer_phone like", value, "customerPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneNotLike(String value) {
            addCriterion("customer_phone not like", value, "customerPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneIn(List<String> values) {
            addCriterion("customer_phone in", values, "customerPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneNotIn(List<String> values) {
            addCriterion("customer_phone not in", values, "customerPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneBetween(String value1, String value2) {
            addCriterion("customer_phone between", value1, value2, "customerPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneNotBetween(String value1, String value2) {
            addCriterion("customer_phone not between", value1, value2, "customerPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerRemarksIsNull() {
            addCriterion("customer_remarks is null");
            return (Criteria) this;
        }

        public Criteria andCustomerRemarksIsNotNull() {
            addCriterion("customer_remarks is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerRemarksEqualTo(String value) {
            addCriterion("customer_remarks =", value, "customerRemarks");
            return (Criteria) this;
        }

        public Criteria andCustomerRemarksNotEqualTo(String value) {
            addCriterion("customer_remarks <>", value, "customerRemarks");
            return (Criteria) this;
        }

        public Criteria andCustomerRemarksGreaterThan(String value) {
            addCriterion("customer_remarks >", value, "customerRemarks");
            return (Criteria) this;
        }

        public Criteria andCustomerRemarksGreaterThanOrEqualTo(String value) {
            addCriterion("customer_remarks >=", value, "customerRemarks");
            return (Criteria) this;
        }

        public Criteria andCustomerRemarksLessThan(String value) {
            addCriterion("customer_remarks <", value, "customerRemarks");
            return (Criteria) this;
        }

        public Criteria andCustomerRemarksLessThanOrEqualTo(String value) {
            addCriterion("customer_remarks <=", value, "customerRemarks");
            return (Criteria) this;
        }

        public Criteria andCustomerRemarksLike(String value) {
            addCriterion("customer_remarks like", value, "customerRemarks");
            return (Criteria) this;
        }

        public Criteria andCustomerRemarksNotLike(String value) {
            addCriterion("customer_remarks not like", value, "customerRemarks");
            return (Criteria) this;
        }

        public Criteria andCustomerRemarksIn(List<String> values) {
            addCriterion("customer_remarks in", values, "customerRemarks");
            return (Criteria) this;
        }

        public Criteria andCustomerRemarksNotIn(List<String> values) {
            addCriterion("customer_remarks not in", values, "customerRemarks");
            return (Criteria) this;
        }

        public Criteria andCustomerRemarksBetween(String value1, String value2) {
            addCriterion("customer_remarks between", value1, value2, "customerRemarks");
            return (Criteria) this;
        }

        public Criteria andCustomerRemarksNotBetween(String value1, String value2) {
            addCriterion("customer_remarks not between", value1, value2, "customerRemarks");
            return (Criteria) this;
        }

        public Criteria andCustomerReceivablesIsNull() {
            addCriterion("customer_receivables is null");
            return (Criteria) this;
        }

        public Criteria andCustomerReceivablesIsNotNull() {
            addCriterion("customer_receivables is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerReceivablesEqualTo(BigDecimal value) {
            addCriterion("customer_receivables =", value, "customerReceivables");
            return (Criteria) this;
        }

        public Criteria andCustomerReceivablesNotEqualTo(BigDecimal value) {
            addCriterion("customer_receivables <>", value, "customerReceivables");
            return (Criteria) this;
        }

        public Criteria andCustomerReceivablesGreaterThan(BigDecimal value) {
            addCriterion("customer_receivables >", value, "customerReceivables");
            return (Criteria) this;
        }

        public Criteria andCustomerReceivablesGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("customer_receivables >=", value, "customerReceivables");
            return (Criteria) this;
        }

        public Criteria andCustomerReceivablesLessThan(BigDecimal value) {
            addCriterion("customer_receivables <", value, "customerReceivables");
            return (Criteria) this;
        }

        public Criteria andCustomerReceivablesLessThanOrEqualTo(BigDecimal value) {
            addCriterion("customer_receivables <=", value, "customerReceivables");
            return (Criteria) this;
        }

        public Criteria andCustomerReceivablesIn(List<BigDecimal> values) {
            addCriterion("customer_receivables in", values, "customerReceivables");
            return (Criteria) this;
        }

        public Criteria andCustomerReceivablesNotIn(List<BigDecimal> values) {
            addCriterion("customer_receivables not in", values, "customerReceivables");
            return (Criteria) this;
        }

        public Criteria andCustomerReceivablesBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("customer_receivables between", value1, value2, "customerReceivables");
            return (Criteria) this;
        }

        public Criteria andCustomerReceivablesNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("customer_receivables not between", value1, value2, "customerReceivables");
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