package demo.model.po;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class UserProxyPoExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table auth_user_proxy
     *
     * @mbg.generated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table auth_user_proxy
     *
     * @mbg.generated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table auth_user_proxy
     *
     * @mbg.generated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table auth_user_proxy
     *
     * @mbg.generated
     */
    public UserProxyPoExample() {
        oredCriteria = new ArrayList<>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table auth_user_proxy
     *
     * @mbg.generated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table auth_user_proxy
     *
     * @mbg.generated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table auth_user_proxy
     *
     * @mbg.generated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table auth_user_proxy
     *
     * @mbg.generated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table auth_user_proxy
     *
     * @mbg.generated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table auth_user_proxy
     *
     * @mbg.generated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table auth_user_proxy
     *
     * @mbg.generated
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table auth_user_proxy
     *
     * @mbg.generated
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table auth_user_proxy
     *
     * @mbg.generated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table auth_user_proxy
     *
     * @mbg.generated
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table auth_user_proxy
     *
     * @mbg.generated
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<>();
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

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andUserAIdIsNull() {
            addCriterion("user_a_id is null");
            return (Criteria) this;
        }

        public Criteria andUserAIdIsNotNull() {
            addCriterion("user_a_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserAIdEqualTo(Long value) {
            addCriterion("user_a_id =", value, "userAId");
            return (Criteria) this;
        }

        public Criteria andUserAIdNotEqualTo(Long value) {
            addCriterion("user_a_id <>", value, "userAId");
            return (Criteria) this;
        }

        public Criteria andUserAIdGreaterThan(Long value) {
            addCriterion("user_a_id >", value, "userAId");
            return (Criteria) this;
        }

        public Criteria andUserAIdGreaterThanOrEqualTo(Long value) {
            addCriterion("user_a_id >=", value, "userAId");
            return (Criteria) this;
        }

        public Criteria andUserAIdLessThan(Long value) {
            addCriterion("user_a_id <", value, "userAId");
            return (Criteria) this;
        }

        public Criteria andUserAIdLessThanOrEqualTo(Long value) {
            addCriterion("user_a_id <=", value, "userAId");
            return (Criteria) this;
        }

        public Criteria andUserAIdIn(List<Long> values) {
            addCriterion("user_a_id in", values, "userAId");
            return (Criteria) this;
        }

        public Criteria andUserAIdNotIn(List<Long> values) {
            addCriterion("user_a_id not in", values, "userAId");
            return (Criteria) this;
        }

        public Criteria andUserAIdBetween(Long value1, Long value2) {
            addCriterion("user_a_id between", value1, value2, "userAId");
            return (Criteria) this;
        }

        public Criteria andUserAIdNotBetween(Long value1, Long value2) {
            addCriterion("user_a_id not between", value1, value2, "userAId");
            return (Criteria) this;
        }

        public Criteria andUserBIdIsNull() {
            addCriterion("user_b_id is null");
            return (Criteria) this;
        }

        public Criteria andUserBIdIsNotNull() {
            addCriterion("user_b_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserBIdEqualTo(Long value) {
            addCriterion("user_b_id =", value, "userBId");
            return (Criteria) this;
        }

        public Criteria andUserBIdNotEqualTo(Long value) {
            addCriterion("user_b_id <>", value, "userBId");
            return (Criteria) this;
        }

        public Criteria andUserBIdGreaterThan(Long value) {
            addCriterion("user_b_id >", value, "userBId");
            return (Criteria) this;
        }

        public Criteria andUserBIdGreaterThanOrEqualTo(Long value) {
            addCriterion("user_b_id >=", value, "userBId");
            return (Criteria) this;
        }

        public Criteria andUserBIdLessThan(Long value) {
            addCriterion("user_b_id <", value, "userBId");
            return (Criteria) this;
        }

        public Criteria andUserBIdLessThanOrEqualTo(Long value) {
            addCriterion("user_b_id <=", value, "userBId");
            return (Criteria) this;
        }

        public Criteria andUserBIdIn(List<Long> values) {
            addCriterion("user_b_id in", values, "userBId");
            return (Criteria) this;
        }

        public Criteria andUserBIdNotIn(List<Long> values) {
            addCriterion("user_b_id not in", values, "userBId");
            return (Criteria) this;
        }

        public Criteria andUserBIdBetween(Long value1, Long value2) {
            addCriterion("user_b_id between", value1, value2, "userBId");
            return (Criteria) this;
        }

        public Criteria andUserBIdNotBetween(Long value1, Long value2) {
            addCriterion("user_b_id not between", value1, value2, "userBId");
            return (Criteria) this;
        }

        public Criteria andBeginDateIsNull() {
            addCriterion("begin_date is null");
            return (Criteria) this;
        }

        public Criteria andBeginDateIsNotNull() {
            addCriterion("begin_date is not null");
            return (Criteria) this;
        }

        public Criteria andBeginDateEqualTo(LocalDateTime value) {
            addCriterion("begin_date =", value, "beginDate");
            return (Criteria) this;
        }

        public Criteria andBeginDateNotEqualTo(LocalDateTime value) {
            addCriterion("begin_date <>", value, "beginDate");
            return (Criteria) this;
        }

        public Criteria andBeginDateGreaterThan(LocalDateTime value) {
            addCriterion("begin_date >", value, "beginDate");
            return (Criteria) this;
        }

        public Criteria andBeginDateGreaterThanOrEqualTo(LocalDateTime value) {
            addCriterion("begin_date >=", value, "beginDate");
            return (Criteria) this;
        }

        public Criteria andBeginDateLessThan(LocalDateTime value) {
            addCriterion("begin_date <", value, "beginDate");
            return (Criteria) this;
        }

        public Criteria andBeginDateLessThanOrEqualTo(LocalDateTime value) {
            addCriterion("begin_date <=", value, "beginDate");
            return (Criteria) this;
        }

        public Criteria andBeginDateIn(List<LocalDateTime> values) {
            addCriterion("begin_date in", values, "beginDate");
            return (Criteria) this;
        }

        public Criteria andBeginDateNotIn(List<LocalDateTime> values) {
            addCriterion("begin_date not in", values, "beginDate");
            return (Criteria) this;
        }

        public Criteria andBeginDateBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("begin_date between", value1, value2, "beginDate");
            return (Criteria) this;
        }

        public Criteria andBeginDateNotBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("begin_date not between", value1, value2, "beginDate");
            return (Criteria) this;
        }

        public Criteria andEndDateIsNull() {
            addCriterion("end_date is null");
            return (Criteria) this;
        }

        public Criteria andEndDateIsNotNull() {
            addCriterion("end_date is not null");
            return (Criteria) this;
        }

        public Criteria andEndDateEqualTo(LocalDateTime value) {
            addCriterion("end_date =", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateNotEqualTo(LocalDateTime value) {
            addCriterion("end_date <>", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateGreaterThan(LocalDateTime value) {
            addCriterion("end_date >", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateGreaterThanOrEqualTo(LocalDateTime value) {
            addCriterion("end_date >=", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateLessThan(LocalDateTime value) {
            addCriterion("end_date <", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateLessThanOrEqualTo(LocalDateTime value) {
            addCriterion("end_date <=", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateIn(List<LocalDateTime> values) {
            addCriterion("end_date in", values, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateNotIn(List<LocalDateTime> values) {
            addCriterion("end_date not in", values, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("end_date between", value1, value2, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateNotBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("end_date not between", value1, value2, "endDate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateIsNull() {
            addCriterion("gmt_create is null");
            return (Criteria) this;
        }

        public Criteria andGmtCreateIsNotNull() {
            addCriterion("gmt_create is not null");
            return (Criteria) this;
        }

        public Criteria andGmtCreateEqualTo(LocalDateTime value) {
            addCriterion("gmt_create =", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateNotEqualTo(LocalDateTime value) {
            addCriterion("gmt_create <>", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateGreaterThan(LocalDateTime value) {
            addCriterion("gmt_create >", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateGreaterThanOrEqualTo(LocalDateTime value) {
            addCriterion("gmt_create >=", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateLessThan(LocalDateTime value) {
            addCriterion("gmt_create <", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateLessThanOrEqualTo(LocalDateTime value) {
            addCriterion("gmt_create <=", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateIn(List<LocalDateTime> values) {
            addCriterion("gmt_create in", values, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateNotIn(List<LocalDateTime> values) {
            addCriterion("gmt_create not in", values, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("gmt_create between", value1, value2, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateNotBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("gmt_create not between", value1, value2, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andSignatureIsNull() {
            addCriterion("signature is null");
            return (Criteria) this;
        }

        public Criteria andSignatureIsNotNull() {
            addCriterion("signature is not null");
            return (Criteria) this;
        }

        public Criteria andSignatureEqualTo(String value) {
            addCriterion("signature =", value, "signature");
            return (Criteria) this;
        }

        public Criteria andSignatureNotEqualTo(String value) {
            addCriterion("signature <>", value, "signature");
            return (Criteria) this;
        }

        public Criteria andSignatureGreaterThan(String value) {
            addCriterion("signature >", value, "signature");
            return (Criteria) this;
        }

        public Criteria andSignatureGreaterThanOrEqualTo(String value) {
            addCriterion("signature >=", value, "signature");
            return (Criteria) this;
        }

        public Criteria andSignatureLessThan(String value) {
            addCriterion("signature <", value, "signature");
            return (Criteria) this;
        }

        public Criteria andSignatureLessThanOrEqualTo(String value) {
            addCriterion("signature <=", value, "signature");
            return (Criteria) this;
        }

        public Criteria andSignatureLike(String value) {
            addCriterion("signature like", value, "signature");
            return (Criteria) this;
        }

        public Criteria andSignatureNotLike(String value) {
            addCriterion("signature not like", value, "signature");
            return (Criteria) this;
        }

        public Criteria andSignatureIn(List<String> values) {
            addCriterion("signature in", values, "signature");
            return (Criteria) this;
        }

        public Criteria andSignatureNotIn(List<String> values) {
            addCriterion("signature not in", values, "signature");
            return (Criteria) this;
        }

        public Criteria andSignatureBetween(String value1, String value2) {
            addCriterion("signature between", value1, value2, "signature");
            return (Criteria) this;
        }

        public Criteria andSignatureNotBetween(String value1, String value2) {
            addCriterion("signature not between", value1, value2, "signature");
            return (Criteria) this;
        }

        public Criteria andValidIsNull() {
            addCriterion("valid is null");
            return (Criteria) this;
        }

        public Criteria andValidIsNotNull() {
            addCriterion("valid is not null");
            return (Criteria) this;
        }

        public Criteria andValidEqualTo(Byte value) {
            addCriterion("valid =", value, "valid");
            return (Criteria) this;
        }

        public Criteria andValidNotEqualTo(Byte value) {
            addCriterion("valid <>", value, "valid");
            return (Criteria) this;
        }

        public Criteria andValidGreaterThan(Byte value) {
            addCriterion("valid >", value, "valid");
            return (Criteria) this;
        }

        public Criteria andValidGreaterThanOrEqualTo(Byte value) {
            addCriterion("valid >=", value, "valid");
            return (Criteria) this;
        }

        public Criteria andValidLessThan(Byte value) {
            addCriterion("valid <", value, "valid");
            return (Criteria) this;
        }

        public Criteria andValidLessThanOrEqualTo(Byte value) {
            addCriterion("valid <=", value, "valid");
            return (Criteria) this;
        }

        public Criteria andValidIn(List<Byte> values) {
            addCriterion("valid in", values, "valid");
            return (Criteria) this;
        }

        public Criteria andValidNotIn(List<Byte> values) {
            addCriterion("valid not in", values, "valid");
            return (Criteria) this;
        }

        public Criteria andValidBetween(Byte value1, Byte value2) {
            addCriterion("valid between", value1, value2, "valid");
            return (Criteria) this;
        }

        public Criteria andValidNotBetween(Byte value1, Byte value2) {
            addCriterion("valid not between", value1, value2, "valid");
            return (Criteria) this;
        }

        public Criteria andDepartIdIsNull() {
            addCriterion("depart_id is null");
            return (Criteria) this;
        }

        public Criteria andDepartIdIsNotNull() {
            addCriterion("depart_id is not null");
            return (Criteria) this;
        }

        public Criteria andDepartIdEqualTo(Long value) {
            addCriterion("depart_id =", value, "departId");
            return (Criteria) this;
        }

        public Criteria andDepartIdNotEqualTo(Long value) {
            addCriterion("depart_id <>", value, "departId");
            return (Criteria) this;
        }

        public Criteria andDepartIdGreaterThan(Long value) {
            addCriterion("depart_id >", value, "departId");
            return (Criteria) this;
        }

        public Criteria andDepartIdGreaterThanOrEqualTo(Long value) {
            addCriterion("depart_id >=", value, "departId");
            return (Criteria) this;
        }

        public Criteria andDepartIdLessThan(Long value) {
            addCriterion("depart_id <", value, "departId");
            return (Criteria) this;
        }

        public Criteria andDepartIdLessThanOrEqualTo(Long value) {
            addCriterion("depart_id <=", value, "departId");
            return (Criteria) this;
        }

        public Criteria andDepartIdIn(List<Long> values) {
            addCriterion("depart_id in", values, "departId");
            return (Criteria) this;
        }

        public Criteria andDepartIdNotIn(List<Long> values) {
            addCriterion("depart_id not in", values, "departId");
            return (Criteria) this;
        }

        public Criteria andDepartIdBetween(Long value1, Long value2) {
            addCriterion("depart_id between", value1, value2, "departId");
            return (Criteria) this;
        }

        public Criteria andDepartIdNotBetween(Long value1, Long value2) {
            addCriterion("depart_id not between", value1, value2, "departId");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table auth_user_proxy
     *
     * @mbg.generated do_not_delete_during_merge
     */
    public static class Criteria extends GeneratedCriteria {
        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table auth_user_proxy
     *
     * @mbg.generated
     */
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