package com.xingyuan.springmvcdemo.domain.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LocationlevelExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public LocationlevelExample() {
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

        public Criteria andLocationIDIsNull() {
            addCriterion("LocationID is null");
            return (Criteria) this;
        }

        public Criteria andLocationIDIsNotNull() {
            addCriterion("LocationID is not null");
            return (Criteria) this;
        }

        public Criteria andLocationIDEqualTo(Integer value) {
            addCriterion("LocationID =", value, "locationID");
            return (Criteria) this;
        }

        public Criteria andLocationIDNotEqualTo(Integer value) {
            addCriterion("LocationID <>", value, "locationID");
            return (Criteria) this;
        }

        public Criteria andLocationIDGreaterThan(Integer value) {
            addCriterion("LocationID >", value, "locationID");
            return (Criteria) this;
        }

        public Criteria andLocationIDGreaterThanOrEqualTo(Integer value) {
            addCriterion("LocationID >=", value, "locationID");
            return (Criteria) this;
        }

        public Criteria andLocationIDLessThan(Integer value) {
            addCriterion("LocationID <", value, "locationID");
            return (Criteria) this;
        }

        public Criteria andLocationIDLessThanOrEqualTo(Integer value) {
            addCriterion("LocationID <=", value, "locationID");
            return (Criteria) this;
        }

        public Criteria andLocationIDIn(List<Integer> values) {
            addCriterion("LocationID in", values, "locationID");
            return (Criteria) this;
        }

        public Criteria andLocationIDNotIn(List<Integer> values) {
            addCriterion("LocationID not in", values, "locationID");
            return (Criteria) this;
        }

        public Criteria andLocationIDBetween(Integer value1, Integer value2) {
            addCriterion("LocationID between", value1, value2, "locationID");
            return (Criteria) this;
        }

        public Criteria andLocationIDNotBetween(Integer value1, Integer value2) {
            addCriterion("LocationID not between", value1, value2, "locationID");
            return (Criteria) this;
        }

        public Criteria andLocationNameIsNull() {
            addCriterion("LocationName is null");
            return (Criteria) this;
        }

        public Criteria andLocationNameIsNotNull() {
            addCriterion("LocationName is not null");
            return (Criteria) this;
        }

        public Criteria andLocationNameEqualTo(String value) {
            addCriterion("LocationName =", value, "locationName");
            return (Criteria) this;
        }

        public Criteria andLocationNameNotEqualTo(String value) {
            addCriterion("LocationName <>", value, "locationName");
            return (Criteria) this;
        }

        public Criteria andLocationNameGreaterThan(String value) {
            addCriterion("LocationName >", value, "locationName");
            return (Criteria) this;
        }

        public Criteria andLocationNameGreaterThanOrEqualTo(String value) {
            addCriterion("LocationName >=", value, "locationName");
            return (Criteria) this;
        }

        public Criteria andLocationNameLessThan(String value) {
            addCriterion("LocationName <", value, "locationName");
            return (Criteria) this;
        }

        public Criteria andLocationNameLessThanOrEqualTo(String value) {
            addCriterion("LocationName <=", value, "locationName");
            return (Criteria) this;
        }

        public Criteria andLocationNameLike(String value) {
            addCriterion("LocationName like", value, "locationName");
            return (Criteria) this;
        }

        public Criteria andLocationNameNotLike(String value) {
            addCriterion("LocationName not like", value, "locationName");
            return (Criteria) this;
        }

        public Criteria andLocationNameIn(List<String> values) {
            addCriterion("LocationName in", values, "locationName");
            return (Criteria) this;
        }

        public Criteria andLocationNameNotIn(List<String> values) {
            addCriterion("LocationName not in", values, "locationName");
            return (Criteria) this;
        }

        public Criteria andLocationNameBetween(String value1, String value2) {
            addCriterion("LocationName between", value1, value2, "locationName");
            return (Criteria) this;
        }

        public Criteria andLocationNameNotBetween(String value1, String value2) {
            addCriterion("LocationName not between", value1, value2, "locationName");
            return (Criteria) this;
        }

        public Criteria andLocationLevelNameIsNull() {
            addCriterion("LocationLevelName is null");
            return (Criteria) this;
        }

        public Criteria andLocationLevelNameIsNotNull() {
            addCriterion("LocationLevelName is not null");
            return (Criteria) this;
        }

        public Criteria andLocationLevelNameEqualTo(String value) {
            addCriterion("LocationLevelName =", value, "locationLevelName");
            return (Criteria) this;
        }

        public Criteria andLocationLevelNameNotEqualTo(String value) {
            addCriterion("LocationLevelName <>", value, "locationLevelName");
            return (Criteria) this;
        }

        public Criteria andLocationLevelNameGreaterThan(String value) {
            addCriterion("LocationLevelName >", value, "locationLevelName");
            return (Criteria) this;
        }

        public Criteria andLocationLevelNameGreaterThanOrEqualTo(String value) {
            addCriterion("LocationLevelName >=", value, "locationLevelName");
            return (Criteria) this;
        }

        public Criteria andLocationLevelNameLessThan(String value) {
            addCriterion("LocationLevelName <", value, "locationLevelName");
            return (Criteria) this;
        }

        public Criteria andLocationLevelNameLessThanOrEqualTo(String value) {
            addCriterion("LocationLevelName <=", value, "locationLevelName");
            return (Criteria) this;
        }

        public Criteria andLocationLevelNameLike(String value) {
            addCriterion("LocationLevelName like", value, "locationLevelName");
            return (Criteria) this;
        }

        public Criteria andLocationLevelNameNotLike(String value) {
            addCriterion("LocationLevelName not like", value, "locationLevelName");
            return (Criteria) this;
        }

        public Criteria andLocationLevelNameIn(List<String> values) {
            addCriterion("LocationLevelName in", values, "locationLevelName");
            return (Criteria) this;
        }

        public Criteria andLocationLevelNameNotIn(List<String> values) {
            addCriterion("LocationLevelName not in", values, "locationLevelName");
            return (Criteria) this;
        }

        public Criteria andLocationLevelNameBetween(String value1, String value2) {
            addCriterion("LocationLevelName between", value1, value2, "locationLevelName");
            return (Criteria) this;
        }

        public Criteria andLocationLevelNameNotBetween(String value1, String value2) {
            addCriterion("LocationLevelName not between", value1, value2, "locationLevelName");
            return (Criteria) this;
        }

        public Criteria andLocationLevelIsNull() {
            addCriterion("LocationLevel is null");
            return (Criteria) this;
        }

        public Criteria andLocationLevelIsNotNull() {
            addCriterion("LocationLevel is not null");
            return (Criteria) this;
        }

        public Criteria andLocationLevelEqualTo(Short value) {
            addCriterion("LocationLevel =", value, "locationLevel");
            return (Criteria) this;
        }

        public Criteria andLocationLevelNotEqualTo(Short value) {
            addCriterion("LocationLevel <>", value, "locationLevel");
            return (Criteria) this;
        }

        public Criteria andLocationLevelGreaterThan(Short value) {
            addCriterion("LocationLevel >", value, "locationLevel");
            return (Criteria) this;
        }

        public Criteria andLocationLevelGreaterThanOrEqualTo(Short value) {
            addCriterion("LocationLevel >=", value, "locationLevel");
            return (Criteria) this;
        }

        public Criteria andLocationLevelLessThan(Short value) {
            addCriterion("LocationLevel <", value, "locationLevel");
            return (Criteria) this;
        }

        public Criteria andLocationLevelLessThanOrEqualTo(Short value) {
            addCriterion("LocationLevel <=", value, "locationLevel");
            return (Criteria) this;
        }

        public Criteria andLocationLevelIn(List<Short> values) {
            addCriterion("LocationLevel in", values, "locationLevel");
            return (Criteria) this;
        }

        public Criteria andLocationLevelNotIn(List<Short> values) {
            addCriterion("LocationLevel not in", values, "locationLevel");
            return (Criteria) this;
        }

        public Criteria andLocationLevelBetween(Short value1, Short value2) {
            addCriterion("LocationLevel between", value1, value2, "locationLevel");
            return (Criteria) this;
        }

        public Criteria andLocationLevelNotBetween(Short value1, Short value2) {
            addCriterion("LocationLevel not between", value1, value2, "locationLevel");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("UpdateTime is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("UpdateTime is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("UpdateTime =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("UpdateTime <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("UpdateTime >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("UpdateTime >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("UpdateTime <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("UpdateTime <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("UpdateTime in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("UpdateTime not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("UpdateTime between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("UpdateTime not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andIsActiveIsNull() {
            addCriterion("IsActive is null");
            return (Criteria) this;
        }

        public Criteria andIsActiveIsNotNull() {
            addCriterion("IsActive is not null");
            return (Criteria) this;
        }

        public Criteria andIsActiveEqualTo(Short value) {
            addCriterion("IsActive =", value, "isActive");
            return (Criteria) this;
        }

        public Criteria andIsActiveNotEqualTo(Short value) {
            addCriterion("IsActive <>", value, "isActive");
            return (Criteria) this;
        }

        public Criteria andIsActiveGreaterThan(Short value) {
            addCriterion("IsActive >", value, "isActive");
            return (Criteria) this;
        }

        public Criteria andIsActiveGreaterThanOrEqualTo(Short value) {
            addCriterion("IsActive >=", value, "isActive");
            return (Criteria) this;
        }

        public Criteria andIsActiveLessThan(Short value) {
            addCriterion("IsActive <", value, "isActive");
            return (Criteria) this;
        }

        public Criteria andIsActiveLessThanOrEqualTo(Short value) {
            addCriterion("IsActive <=", value, "isActive");
            return (Criteria) this;
        }

        public Criteria andIsActiveIn(List<Short> values) {
            addCriterion("IsActive in", values, "isActive");
            return (Criteria) this;
        }

        public Criteria andIsActiveNotIn(List<Short> values) {
            addCriterion("IsActive not in", values, "isActive");
            return (Criteria) this;
        }

        public Criteria andIsActiveBetween(Short value1, Short value2) {
            addCriterion("IsActive between", value1, value2, "isActive");
            return (Criteria) this;
        }

        public Criteria andIsActiveNotBetween(Short value1, Short value2) {
            addCriterion("IsActive not between", value1, value2, "isActive");
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