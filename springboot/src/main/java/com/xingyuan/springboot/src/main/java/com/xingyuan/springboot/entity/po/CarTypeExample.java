package com.xingyuan.springboot.entity.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CarTypeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public CarTypeExample() {
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

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public Integer getOffset() {
        return offset;
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

        public Criteria andCarTypeIdIsNull() {
            addCriterion("car_type_id is null");
            return (Criteria) this;
        }

        public Criteria andCarTypeIdIsNotNull() {
            addCriterion("car_type_id is not null");
            return (Criteria) this;
        }

        public Criteria andCarTypeIdEqualTo(Integer value) {
            addCriterion("car_type_id =", value, "carTypeId");
            return (Criteria) this;
        }

        public Criteria andCarTypeIdNotEqualTo(Integer value) {
            addCriterion("car_type_id <>", value, "carTypeId");
            return (Criteria) this;
        }

        public Criteria andCarTypeIdGreaterThan(Integer value) {
            addCriterion("car_type_id >", value, "carTypeId");
            return (Criteria) this;
        }

        public Criteria andCarTypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("car_type_id >=", value, "carTypeId");
            return (Criteria) this;
        }

        public Criteria andCarTypeIdLessThan(Integer value) {
            addCriterion("car_type_id <", value, "carTypeId");
            return (Criteria) this;
        }

        public Criteria andCarTypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("car_type_id <=", value, "carTypeId");
            return (Criteria) this;
        }

        public Criteria andCarTypeIdIn(List<Integer> values) {
            addCriterion("car_type_id in", values, "carTypeId");
            return (Criteria) this;
        }

        public Criteria andCarTypeIdNotIn(List<Integer> values) {
            addCriterion("car_type_id not in", values, "carTypeId");
            return (Criteria) this;
        }

        public Criteria andCarTypeIdBetween(Integer value1, Integer value2) {
            addCriterion("car_type_id between", value1, value2, "carTypeId");
            return (Criteria) this;
        }

        public Criteria andCarTypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("car_type_id not between", value1, value2, "carTypeId");
            return (Criteria) this;
        }

        public Criteria andCarTypeNameIsNull() {
            addCriterion("car_type_name is null");
            return (Criteria) this;
        }

        public Criteria andCarTypeNameIsNotNull() {
            addCriterion("car_type_name is not null");
            return (Criteria) this;
        }

        public Criteria andCarTypeNameEqualTo(String value) {
            addCriterion("car_type_name =", value, "carTypeName");
            return (Criteria) this;
        }

        public Criteria andCarTypeNameNotEqualTo(String value) {
            addCriterion("car_type_name <>", value, "carTypeName");
            return (Criteria) this;
        }

        public Criteria andCarTypeNameGreaterThan(String value) {
            addCriterion("car_type_name >", value, "carTypeName");
            return (Criteria) this;
        }

        public Criteria andCarTypeNameGreaterThanOrEqualTo(String value) {
            addCriterion("car_type_name >=", value, "carTypeName");
            return (Criteria) this;
        }

        public Criteria andCarTypeNameLessThan(String value) {
            addCriterion("car_type_name <", value, "carTypeName");
            return (Criteria) this;
        }

        public Criteria andCarTypeNameLessThanOrEqualTo(String value) {
            addCriterion("car_type_name <=", value, "carTypeName");
            return (Criteria) this;
        }

        public Criteria andCarTypeNameLike(String value) {
            addCriterion("car_type_name like", value, "carTypeName");
            return (Criteria) this;
        }

        public Criteria andCarTypeNameNotLike(String value) {
            addCriterion("car_type_name not like", value, "carTypeName");
            return (Criteria) this;
        }

        public Criteria andCarTypeNameIn(List<String> values) {
            addCriterion("car_type_name in", values, "carTypeName");
            return (Criteria) this;
        }

        public Criteria andCarTypeNameNotIn(List<String> values) {
            addCriterion("car_type_name not in", values, "carTypeName");
            return (Criteria) this;
        }

        public Criteria andCarTypeNameBetween(String value1, String value2) {
            addCriterion("car_type_name between", value1, value2, "carTypeName");
            return (Criteria) this;
        }

        public Criteria andCarTypeNameNotBetween(String value1, String value2) {
            addCriterion("car_type_name not between", value1, value2, "carTypeName");
            return (Criteria) this;
        }

        public Criteria andCarTypeFullPathIsNull() {
            addCriterion("car_type_full_path is null");
            return (Criteria) this;
        }

        public Criteria andCarTypeFullPathIsNotNull() {
            addCriterion("car_type_full_path is not null");
            return (Criteria) this;
        }

        public Criteria andCarTypeFullPathEqualTo(String value) {
            addCriterion("car_type_full_path =", value, "carTypeFullPath");
            return (Criteria) this;
        }

        public Criteria andCarTypeFullPathNotEqualTo(String value) {
            addCriterion("car_type_full_path <>", value, "carTypeFullPath");
            return (Criteria) this;
        }

        public Criteria andCarTypeFullPathGreaterThan(String value) {
            addCriterion("car_type_full_path >", value, "carTypeFullPath");
            return (Criteria) this;
        }

        public Criteria andCarTypeFullPathGreaterThanOrEqualTo(String value) {
            addCriterion("car_type_full_path >=", value, "carTypeFullPath");
            return (Criteria) this;
        }

        public Criteria andCarTypeFullPathLessThan(String value) {
            addCriterion("car_type_full_path <", value, "carTypeFullPath");
            return (Criteria) this;
        }

        public Criteria andCarTypeFullPathLessThanOrEqualTo(String value) {
            addCriterion("car_type_full_path <=", value, "carTypeFullPath");
            return (Criteria) this;
        }

        public Criteria andCarTypeFullPathLike(String value) {
            addCriterion("car_type_full_path like", value, "carTypeFullPath");
            return (Criteria) this;
        }

        public Criteria andCarTypeFullPathNotLike(String value) {
            addCriterion("car_type_full_path not like", value, "carTypeFullPath");
            return (Criteria) this;
        }

        public Criteria andCarTypeFullPathIn(List<String> values) {
            addCriterion("car_type_full_path in", values, "carTypeFullPath");
            return (Criteria) this;
        }

        public Criteria andCarTypeFullPathNotIn(List<String> values) {
            addCriterion("car_type_full_path not in", values, "carTypeFullPath");
            return (Criteria) this;
        }

        public Criteria andCarTypeFullPathBetween(String value1, String value2) {
            addCriterion("car_type_full_path between", value1, value2, "carTypeFullPath");
            return (Criteria) this;
        }

        public Criteria andCarTypeFullPathNotBetween(String value1, String value2) {
            addCriterion("car_type_full_path not between", value1, value2, "carTypeFullPath");
            return (Criteria) this;
        }

        public Criteria andParentCarTypeIdIsNull() {
            addCriterion("parent_car_type_id is null");
            return (Criteria) this;
        }

        public Criteria andParentCarTypeIdIsNotNull() {
            addCriterion("parent_car_type_id is not null");
            return (Criteria) this;
        }

        public Criteria andParentCarTypeIdEqualTo(Integer value) {
            addCriterion("parent_car_type_id =", value, "parentCarTypeId");
            return (Criteria) this;
        }

        public Criteria andParentCarTypeIdNotEqualTo(Integer value) {
            addCriterion("parent_car_type_id <>", value, "parentCarTypeId");
            return (Criteria) this;
        }

        public Criteria andParentCarTypeIdGreaterThan(Integer value) {
            addCriterion("parent_car_type_id >", value, "parentCarTypeId");
            return (Criteria) this;
        }

        public Criteria andParentCarTypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("parent_car_type_id >=", value, "parentCarTypeId");
            return (Criteria) this;
        }

        public Criteria andParentCarTypeIdLessThan(Integer value) {
            addCriterion("parent_car_type_id <", value, "parentCarTypeId");
            return (Criteria) this;
        }

        public Criteria andParentCarTypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("parent_car_type_id <=", value, "parentCarTypeId");
            return (Criteria) this;
        }

        public Criteria andParentCarTypeIdIn(List<Integer> values) {
            addCriterion("parent_car_type_id in", values, "parentCarTypeId");
            return (Criteria) this;
        }

        public Criteria andParentCarTypeIdNotIn(List<Integer> values) {
            addCriterion("parent_car_type_id not in", values, "parentCarTypeId");
            return (Criteria) this;
        }

        public Criteria andParentCarTypeIdBetween(Integer value1, Integer value2) {
            addCriterion("parent_car_type_id between", value1, value2, "parentCarTypeId");
            return (Criteria) this;
        }

        public Criteria andParentCarTypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("parent_car_type_id not between", value1, value2, "parentCarTypeId");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNull() {
            addCriterion("description is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNotNull() {
            addCriterion("description is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionEqualTo(String value) {
            addCriterion("description =", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotEqualTo(String value) {
            addCriterion("description <>", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThan(String value) {
            addCriterion("description >", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("description >=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThan(String value) {
            addCriterion("description <", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            addCriterion("description <=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLike(String value) {
            addCriterion("description like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotLike(String value) {
            addCriterion("description not like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionIn(List<String> values) {
            addCriterion("description in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotIn(List<String> values) {
            addCriterion("description not in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionBetween(String value1, String value2) {
            addCriterion("description between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotBetween(String value1, String value2) {
            addCriterion("description not between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }
    }

    /**
     */
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