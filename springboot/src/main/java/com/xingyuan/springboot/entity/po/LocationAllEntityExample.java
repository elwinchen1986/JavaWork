package com.xingyuan.springboot.entity.po;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * The type Location all entity example.
 */
@Component
public class LocationAllEntityExample {
    /**
     * The Order by clause.
     */
    protected String orderByClause;

    /**
     * The Distinct.
     */
    protected boolean distinct;

    /**
     * The Ored criteria.
     */
    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    /**
     * Instantiates a new Location all entity example.
     */
    public LocationAllEntityExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * Sets order by clause.
     *
     * @param orderByClause the order by clause
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * Gets order by clause.
     *
     * @return the order by clause
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * Sets distinct.
     *
     * @param distinct the distinct
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * Is distinct boolean.
     *
     * @return the boolean
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * Gets ored criteria.
     *
     * @return the ored criteria
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * Or.
     *
     * @param criteria the criteria
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * Or criteria.
     *
     * @return the criteria
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * Create criteria criteria.
     *
     * @return the criteria
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * Create criteria internal criteria.
     *
     * @return the criteria
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * Clear.
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * Sets limit.
     *
     * @param limit the limit
     */
    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    /**
     * Gets limit.
     *
     * @return the limit
     */
    public Integer getLimit() {
        return limit;
    }

    /**
     * Sets offset.
     *
     * @param offset the offset
     */
    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    /**
     * Gets offset.
     *
     * @return the offset
     */
    public Integer getOffset() {
        return offset;
    }

    /**
     * The type Generated criteria.
     */
    protected abstract static class GeneratedCriteria {
        /**
         * The Criteria.
         */
        protected List<Criterion> criteria;

        /**
         * Instantiates a new Generated criteria.
         */
        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        /**
         * Is valid boolean.
         *
         * @return the boolean
         */
        public boolean isValid() {
            return criteria.size() > 0;
        }

        /**
         * Gets all criteria.
         *
         * @return the all criteria
         */
        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        /**
         * Gets criteria.
         *
         * @return the criteria
         */
        public List<Criterion> getCriteria() {
            return criteria;
        }

        /**
         * Add criterion.
         *
         * @param condition the condition
         */
        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        /**
         * Add criterion.
         *
         * @param condition the condition
         * @param value     the value
         * @param property  the property
         */
        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        /**
         * Add criterion.
         *
         * @param condition the condition
         * @param value1    the value 1
         * @param value2    the value 2
         * @param property  the property
         */
        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        /**
         * And locationid is null criteria.
         *
         * @return the criteria
         */
        public Criteria andLocationidIsNull() {
            addCriterion("locationId is null");
            return (Criteria) this;
        }

        /**
         * And locationid is not null criteria.
         *
         * @return the criteria
         */
        public Criteria andLocationidIsNotNull() {
            addCriterion("locationId is not null");
            return (Criteria) this;
        }

        /**
         * And locationid equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andLocationidEqualTo(Integer value) {
            addCriterion("locationId =", value, "locationid");
            return (Criteria) this;
        }

        /**
         * And locationid not equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andLocationidNotEqualTo(Integer value) {
            addCriterion("locationId <>", value, "locationid");
            return (Criteria) this;
        }

        /**
         * And locationid greater than criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andLocationidGreaterThan(Integer value) {
            addCriterion("locationId >", value, "locationid");
            return (Criteria) this;
        }

        /**
         * And locationid greater than or equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andLocationidGreaterThanOrEqualTo(Integer value) {
            addCriterion("locationId >=", value, "locationid");
            return (Criteria) this;
        }

        /**
         * And locationid less than criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andLocationidLessThan(Integer value) {
            addCriterion("locationId <", value, "locationid");
            return (Criteria) this;
        }

        /**
         * And locationid less than or equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andLocationidLessThanOrEqualTo(Integer value) {
            addCriterion("locationId <=", value, "locationid");
            return (Criteria) this;
        }

        /**
         * And locationid in criteria.
         *
         * @param values the values
         * @return the criteria
         */
        public Criteria andLocationidIn(List<Integer> values) {
            addCriterion("locationId in", values, "locationid");
            return (Criteria) this;
        }

        /**
         * And locationid not in criteria.
         *
         * @param values the values
         * @return the criteria
         */
        public Criteria andLocationidNotIn(List<Integer> values) {
            addCriterion("locationId not in", values, "locationid");
            return (Criteria) this;
        }

        /**
         * And locationid between criteria.
         *
         * @param value1 the value 1
         * @param value2 the value 2
         * @return the criteria
         */
        public Criteria andLocationidBetween(Integer value1, Integer value2) {
            addCriterion("locationId between", value1, value2, "locationid");
            return (Criteria) this;
        }

        /**
         * And locationid not between criteria.
         *
         * @param value1 the value 1
         * @param value2 the value 2
         * @return the criteria
         */
        public Criteria andLocationidNotBetween(Integer value1, Integer value2) {
            addCriterion("locationId not between", value1, value2, "locationid");
            return (Criteria) this;
        }

        /**
         * And locationname is null criteria.
         *
         * @return the criteria
         */
        public Criteria andLocationnameIsNull() {
            addCriterion("locationName is null");
            return (Criteria) this;
        }

        /**
         * And locationname is not null criteria.
         *
         * @return the criteria
         */
        public Criteria andLocationnameIsNotNull() {
            addCriterion("locationName is not null");
            return (Criteria) this;
        }

        /**
         * And locationname equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andLocationnameEqualTo(String value) {
            addCriterion("locationName =", value, "locationname");
            return (Criteria) this;
        }

        /**
         * And locationname not equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andLocationnameNotEqualTo(String value) {
            addCriterion("locationName <>", value, "locationname");
            return (Criteria) this;
        }

        /**
         * And locationname greater than criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andLocationnameGreaterThan(String value) {
            addCriterion("locationName >", value, "locationname");
            return (Criteria) this;
        }

        /**
         * And locationname greater than or equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andLocationnameGreaterThanOrEqualTo(String value) {
            addCriterion("locationName >=", value, "locationname");
            return (Criteria) this;
        }

        /**
         * And locationname less than criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andLocationnameLessThan(String value) {
            addCriterion("locationName <", value, "locationname");
            return (Criteria) this;
        }

        /**
         * And locationname less than or equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andLocationnameLessThanOrEqualTo(String value) {
            addCriterion("locationName <=", value, "locationname");
            return (Criteria) this;
        }

        /**
         * And locationname like criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andLocationnameLike(String value) {
            addCriterion("locationName like", value, "locationname");
            return (Criteria) this;
        }

        /**
         * And locationname not like criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andLocationnameNotLike(String value) {
            addCriterion("locationName not like", value, "locationname");
            return (Criteria) this;
        }

        /**
         * And locationname in criteria.
         *
         * @param values the values
         * @return the criteria
         */
        public Criteria andLocationnameIn(List<String> values) {
            addCriterion("locationName in", values, "locationname");
            return (Criteria) this;
        }

        /**
         * And locationname not in criteria.
         *
         * @param values the values
         * @return the criteria
         */
        public Criteria andLocationnameNotIn(List<String> values) {
            addCriterion("locationName not in", values, "locationname");
            return (Criteria) this;
        }

        /**
         * And locationname between criteria.
         *
         * @param value1 the value 1
         * @param value2 the value 2
         * @return the criteria
         */
        public Criteria andLocationnameBetween(String value1, String value2) {
            addCriterion("locationName between", value1, value2, "locationname");
            return (Criteria) this;
        }

        /**
         * And locationname not between criteria.
         *
         * @param value1 the value 1
         * @param value2 the value 2
         * @return the criteria
         */
        public Criteria andLocationnameNotBetween(String value1, String value2) {
            addCriterion("locationName not between", value1, value2, "locationname");
            return (Criteria) this;
        }

        /**
         * And locationshortname is null criteria.
         *
         * @return the criteria
         */
        public Criteria andLocationshortnameIsNull() {
            addCriterion("locationShortName is null");
            return (Criteria) this;
        }

        /**
         * And locationshortname is not null criteria.
         *
         * @return the criteria
         */
        public Criteria andLocationshortnameIsNotNull() {
            addCriterion("locationShortName is not null");
            return (Criteria) this;
        }

        /**
         * And locationshortname equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andLocationshortnameEqualTo(String value) {
            addCriterion("locationShortName =", value, "locationshortname");
            return (Criteria) this;
        }

        /**
         * And locationshortname not equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andLocationshortnameNotEqualTo(String value) {
            addCriterion("locationShortName <>", value, "locationshortname");
            return (Criteria) this;
        }

        /**
         * And locationshortname greater than criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andLocationshortnameGreaterThan(String value) {
            addCriterion("locationShortName >", value, "locationshortname");
            return (Criteria) this;
        }

        /**
         * And locationshortname greater than or equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andLocationshortnameGreaterThanOrEqualTo(String value) {
            addCriterion("locationShortName >=", value, "locationshortname");
            return (Criteria) this;
        }

        /**
         * And locationshortname less than criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andLocationshortnameLessThan(String value) {
            addCriterion("locationShortName <", value, "locationshortname");
            return (Criteria) this;
        }

        /**
         * And locationshortname less than or equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andLocationshortnameLessThanOrEqualTo(String value) {
            addCriterion("locationShortName <=", value, "locationshortname");
            return (Criteria) this;
        }

        /**
         * And locationshortname like criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andLocationshortnameLike(String value) {
            addCriterion("locationShortName like", value, "locationshortname");
            return (Criteria) this;
        }

        /**
         * And locationshortname not like criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andLocationshortnameNotLike(String value) {
            addCriterion("locationShortName not like", value, "locationshortname");
            return (Criteria) this;
        }

        /**
         * And locationshortname in criteria.
         *
         * @param values the values
         * @return the criteria
         */
        public Criteria andLocationshortnameIn(List<String> values) {
            addCriterion("locationShortName in", values, "locationshortname");
            return (Criteria) this;
        }

        /**
         * And locationshortname not in criteria.
         *
         * @param values the values
         * @return the criteria
         */
        public Criteria andLocationshortnameNotIn(List<String> values) {
            addCriterion("locationShortName not in", values, "locationshortname");
            return (Criteria) this;
        }

        /**
         * And locationshortname between criteria.
         *
         * @param value1 the value 1
         * @param value2 the value 2
         * @return the criteria
         */
        public Criteria andLocationshortnameBetween(String value1, String value2) {
            addCriterion("locationShortName between", value1, value2, "locationshortname");
            return (Criteria) this;
        }

        /**
         * And locationshortname not between criteria.
         *
         * @param value1 the value 1
         * @param value2 the value 2
         * @return the criteria
         */
        public Criteria andLocationshortnameNotBetween(String value1, String value2) {
            addCriterion("locationShortName not between", value1, value2, "locationshortname");
            return (Criteria) this;
        }

        /**
         * And locationpath is null criteria.
         *
         * @return the criteria
         */
        public Criteria andLocationpathIsNull() {
            addCriterion("locationPath is null");
            return (Criteria) this;
        }

        /**
         * And locationpath is not null criteria.
         *
         * @return the criteria
         */
        public Criteria andLocationpathIsNotNull() {
            addCriterion("locationPath is not null");
            return (Criteria) this;
        }

        /**
         * And locationpath equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andLocationpathEqualTo(String value) {
            addCriterion("locationPath =", value, "locationpath");
            return (Criteria) this;
        }

        /**
         * And locationpath not equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andLocationpathNotEqualTo(String value) {
            addCriterion("locationPath <>", value, "locationpath");
            return (Criteria) this;
        }

        /**
         * And locationpath greater than criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andLocationpathGreaterThan(String value) {
            addCriterion("locationPath >", value, "locationpath");
            return (Criteria) this;
        }

        /**
         * And locationpath greater than or equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andLocationpathGreaterThanOrEqualTo(String value) {
            addCriterion("locationPath >=", value, "locationpath");
            return (Criteria) this;
        }

        /**
         * And locationpath less than criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andLocationpathLessThan(String value) {
            addCriterion("locationPath <", value, "locationpath");
            return (Criteria) this;
        }

        /**
         * And locationpath less than or equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andLocationpathLessThanOrEqualTo(String value) {
            addCriterion("locationPath <=", value, "locationpath");
            return (Criteria) this;
        }

        /**
         * And locationpath like criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andLocationpathLike(String value) {
            addCriterion("locationPath like", value, "locationpath");
            return (Criteria) this;
        }

        /**
         * And locationpath not like criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andLocationpathNotLike(String value) {
            addCriterion("locationPath not like", value, "locationpath");
            return (Criteria) this;
        }

        /**
         * And locationpath in criteria.
         *
         * @param values the values
         * @return the criteria
         */
        public Criteria andLocationpathIn(List<String> values) {
            addCriterion("locationPath in", values, "locationpath");
            return (Criteria) this;
        }

        /**
         * And locationpath not in criteria.
         *
         * @param values the values
         * @return the criteria
         */
        public Criteria andLocationpathNotIn(List<String> values) {
            addCriterion("locationPath not in", values, "locationpath");
            return (Criteria) this;
        }

        /**
         * And locationpath between criteria.
         *
         * @param value1 the value 1
         * @param value2 the value 2
         * @return the criteria
         */
        public Criteria andLocationpathBetween(String value1, String value2) {
            addCriterion("locationPath between", value1, value2, "locationpath");
            return (Criteria) this;
        }

        /**
         * And locationpath not between criteria.
         *
         * @param value1 the value 1
         * @param value2 the value 2
         * @return the criteria
         */
        public Criteria andLocationpathNotBetween(String value1, String value2) {
            addCriterion("locationPath not between", value1, value2, "locationpath");
            return (Criteria) this;
        }

        /**
         * And locationspellname is null criteria.
         *
         * @return the criteria
         */
        public Criteria andLocationspellnameIsNull() {
            addCriterion("locationSpellName is null");
            return (Criteria) this;
        }

        /**
         * And locationspellname is not null criteria.
         *
         * @return the criteria
         */
        public Criteria andLocationspellnameIsNotNull() {
            addCriterion("locationSpellName is not null");
            return (Criteria) this;
        }

        /**
         * And locationspellname equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andLocationspellnameEqualTo(String value) {
            addCriterion("locationSpellName =", value, "locationspellname");
            return (Criteria) this;
        }

        /**
         * And locationspellname not equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andLocationspellnameNotEqualTo(String value) {
            addCriterion("locationSpellName <>", value, "locationspellname");
            return (Criteria) this;
        }

        /**
         * And locationspellname greater than criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andLocationspellnameGreaterThan(String value) {
            addCriterion("locationSpellName >", value, "locationspellname");
            return (Criteria) this;
        }

        /**
         * And locationspellname greater than or equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andLocationspellnameGreaterThanOrEqualTo(String value) {
            addCriterion("locationSpellName >=", value, "locationspellname");
            return (Criteria) this;
        }

        /**
         * And locationspellname less than criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andLocationspellnameLessThan(String value) {
            addCriterion("locationSpellName <", value, "locationspellname");
            return (Criteria) this;
        }

        /**
         * And locationspellname less than or equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andLocationspellnameLessThanOrEqualTo(String value) {
            addCriterion("locationSpellName <=", value, "locationspellname");
            return (Criteria) this;
        }

        /**
         * And locationspellname like criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andLocationspellnameLike(String value) {
            addCriterion("locationSpellName like", value, "locationspellname");
            return (Criteria) this;
        }

        /**
         * And locationspellname not like criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andLocationspellnameNotLike(String value) {
            addCriterion("locationSpellName not like", value, "locationspellname");
            return (Criteria) this;
        }

        /**
         * And locationspellname in criteria.
         *
         * @param values the values
         * @return the criteria
         */
        public Criteria andLocationspellnameIn(List<String> values) {
            addCriterion("locationSpellName in", values, "locationspellname");
            return (Criteria) this;
        }

        /**
         * And locationspellname not in criteria.
         *
         * @param values the values
         * @return the criteria
         */
        public Criteria andLocationspellnameNotIn(List<String> values) {
            addCriterion("locationSpellName not in", values, "locationspellname");
            return (Criteria) this;
        }

        /**
         * And locationspellname between criteria.
         *
         * @param value1 the value 1
         * @param value2 the value 2
         * @return the criteria
         */
        public Criteria andLocationspellnameBetween(String value1, String value2) {
            addCriterion("locationSpellName between", value1, value2, "locationspellname");
            return (Criteria) this;
        }

        /**
         * And locationspellname not between criteria.
         *
         * @param value1 the value 1
         * @param value2 the value 2
         * @return the criteria
         */
        public Criteria andLocationspellnameNotBetween(String value1, String value2) {
            addCriterion("locationSpellName not between", value1, value2, "locationspellname");
            return (Criteria) this;
        }

        /**
         * And locationbusinesstypeid is null criteria.
         *
         * @return the criteria
         */
        public Criteria andLocationbusinesstypeidIsNull() {
            addCriterion("locationbusinessTypeId is null");
            return (Criteria) this;
        }

        /**
         * And locationbusinesstypeid is not null criteria.
         *
         * @return the criteria
         */
        public Criteria andLocationbusinesstypeidIsNotNull() {
            addCriterion("locationbusinessTypeId is not null");
            return (Criteria) this;
        }

        /**
         * And locationbusinesstypeid equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andLocationbusinesstypeidEqualTo(Integer value) {
            addCriterion("locationbusinessTypeId =", value, "locationbusinesstypeid");
            return (Criteria) this;
        }

        /**
         * And locationbusinesstypeid not equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andLocationbusinesstypeidNotEqualTo(Integer value) {
            addCriterion("locationbusinessTypeId <>", value, "locationbusinesstypeid");
            return (Criteria) this;
        }

        /**
         * And locationbusinesstypeid greater than criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andLocationbusinesstypeidGreaterThan(Integer value) {
            addCriterion("locationbusinessTypeId >", value, "locationbusinesstypeid");
            return (Criteria) this;
        }

        /**
         * And locationbusinesstypeid greater than or equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andLocationbusinesstypeidGreaterThanOrEqualTo(Integer value) {
            addCriterion("locationbusinessTypeId >=", value, "locationbusinesstypeid");
            return (Criteria) this;
        }

        /**
         * And locationbusinesstypeid less than criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andLocationbusinesstypeidLessThan(Integer value) {
            addCriterion("locationbusinessTypeId <", value, "locationbusinesstypeid");
            return (Criteria) this;
        }

        /**
         * And locationbusinesstypeid less than or equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andLocationbusinesstypeidLessThanOrEqualTo(Integer value) {
            addCriterion("locationbusinessTypeId <=", value, "locationbusinesstypeid");
            return (Criteria) this;
        }

        /**
         * And locationbusinesstypeid in criteria.
         *
         * @param values the values
         * @return the criteria
         */
        public Criteria andLocationbusinesstypeidIn(List<Integer> values) {
            addCriterion("locationbusinessTypeId in", values, "locationbusinesstypeid");
            return (Criteria) this;
        }

        /**
         * And locationbusinesstypeid not in criteria.
         *
         * @param values the values
         * @return the criteria
         */
        public Criteria andLocationbusinesstypeidNotIn(List<Integer> values) {
            addCriterion("locationbusinessTypeId not in", values, "locationbusinesstypeid");
            return (Criteria) this;
        }

        /**
         * And locationbusinesstypeid between criteria.
         *
         * @param value1 the value 1
         * @param value2 the value 2
         * @return the criteria
         */
        public Criteria andLocationbusinesstypeidBetween(Integer value1, Integer value2) {
            addCriterion("locationbusinessTypeId between", value1, value2, "locationbusinesstypeid");
            return (Criteria) this;
        }

        /**
         * And locationbusinesstypeid not between criteria.
         *
         * @param value1 the value 1
         * @param value2 the value 2
         * @return the criteria
         */
        public Criteria andLocationbusinesstypeidNotBetween(Integer value1, Integer value2) {
            addCriterion("locationbusinessTypeId not between", value1, value2, "locationbusinesstypeid");
            return (Criteria) this;
        }

        /**
         * And cid is null criteria.
         *
         * @return the criteria
         */
        public Criteria andCidIsNull() {
            addCriterion("cId is null");
            return (Criteria) this;
        }

        /**
         * And cid is not null criteria.
         *
         * @return the criteria
         */
        public Criteria andCidIsNotNull() {
            addCriterion("cId is not null");
            return (Criteria) this;
        }

        /**
         * And cid equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andCidEqualTo(Integer value) {
            addCriterion("cId =", value, "cid");
            return (Criteria) this;
        }

        /**
         * And cid not equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andCidNotEqualTo(Integer value) {
            addCriterion("cId <>", value, "cid");
            return (Criteria) this;
        }

        /**
         * And cid greater than criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andCidGreaterThan(Integer value) {
            addCriterion("cId >", value, "cid");
            return (Criteria) this;
        }

        /**
         * And cid greater than or equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andCidGreaterThanOrEqualTo(Integer value) {
            addCriterion("cId >=", value, "cid");
            return (Criteria) this;
        }

        /**
         * And cid less than criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andCidLessThan(Integer value) {
            addCriterion("cId <", value, "cid");
            return (Criteria) this;
        }

        /**
         * And cid less than or equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andCidLessThanOrEqualTo(Integer value) {
            addCriterion("cId <=", value, "cid");
            return (Criteria) this;
        }

        /**
         * And cid in criteria.
         *
         * @param values the values
         * @return the criteria
         */
        public Criteria andCidIn(List<Integer> values) {
            addCriterion("cId in", values, "cid");
            return (Criteria) this;
        }

        /**
         * And cid not in criteria.
         *
         * @param values the values
         * @return the criteria
         */
        public Criteria andCidNotIn(List<Integer> values) {
            addCriterion("cId not in", values, "cid");
            return (Criteria) this;
        }

        /**
         * And cid between criteria.
         *
         * @param value1 the value 1
         * @param value2 the value 2
         * @return the criteria
         */
        public Criteria andCidBetween(Integer value1, Integer value2) {
            addCriterion("cId between", value1, value2, "cid");
            return (Criteria) this;
        }

        /**
         * And cid not between criteria.
         *
         * @param value1 the value 1
         * @param value2 the value 2
         * @return the criteria
         */
        public Criteria andCidNotBetween(Integer value1, Integer value2) {
            addCriterion("cId not between", value1, value2, "cid");
            return (Criteria) this;
        }

        /**
         * And cname is null criteria.
         *
         * @return the criteria
         */
        public Criteria andCnameIsNull() {
            addCriterion("cName is null");
            return (Criteria) this;
        }

        /**
         * And cname is not null criteria.
         *
         * @return the criteria
         */
        public Criteria andCnameIsNotNull() {
            addCriterion("cName is not null");
            return (Criteria) this;
        }

        /**
         * And cname equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andCnameEqualTo(String value) {
            addCriterion("cName =", value, "cname");
            return (Criteria) this;
        }

        /**
         * And cname not equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andCnameNotEqualTo(String value) {
            addCriterion("cName <>", value, "cname");
            return (Criteria) this;
        }

        /**
         * And cname greater than criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andCnameGreaterThan(String value) {
            addCriterion("cName >", value, "cname");
            return (Criteria) this;
        }

        /**
         * And cname greater than or equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andCnameGreaterThanOrEqualTo(String value) {
            addCriterion("cName >=", value, "cname");
            return (Criteria) this;
        }

        /**
         * And cname less than criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andCnameLessThan(String value) {
            addCriterion("cName <", value, "cname");
            return (Criteria) this;
        }

        /**
         * And cname less than or equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andCnameLessThanOrEqualTo(String value) {
            addCriterion("cName <=", value, "cname");
            return (Criteria) this;
        }

        /**
         * And cname like criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andCnameLike(String value) {
            addCriterion("cName like", value, "cname");
            return (Criteria) this;
        }

        /**
         * And cname not like criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andCnameNotLike(String value) {
            addCriterion("cName not like", value, "cname");
            return (Criteria) this;
        }

        /**
         * And cname in criteria.
         *
         * @param values the values
         * @return the criteria
         */
        public Criteria andCnameIn(List<String> values) {
            addCriterion("cName in", values, "cname");
            return (Criteria) this;
        }

        /**
         * And cname not in criteria.
         *
         * @param values the values
         * @return the criteria
         */
        public Criteria andCnameNotIn(List<String> values) {
            addCriterion("cName not in", values, "cname");
            return (Criteria) this;
        }

        /**
         * And cname between criteria.
         *
         * @param value1 the value 1
         * @param value2 the value 2
         * @return the criteria
         */
        public Criteria andCnameBetween(String value1, String value2) {
            addCriterion("cName between", value1, value2, "cname");
            return (Criteria) this;
        }

        /**
         * And cname not between criteria.
         *
         * @param value1 the value 1
         * @param value2 the value 2
         * @return the criteria
         */
        public Criteria andCnameNotBetween(String value1, String value2) {
            addCriterion("cName not between", value1, value2, "cname");
            return (Criteria) this;
        }

        /**
         * And cspellname is null criteria.
         *
         * @return the criteria
         */
        public Criteria andCspellnameIsNull() {
            addCriterion("cSpellName is null");
            return (Criteria) this;
        }

        /**
         * And cspellname is not null criteria.
         *
         * @return the criteria
         */
        public Criteria andCspellnameIsNotNull() {
            addCriterion("cSpellName is not null");
            return (Criteria) this;
        }

        /**
         * And cspellname equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andCspellnameEqualTo(String value) {
            addCriterion("cSpellName =", value, "cspellname");
            return (Criteria) this;
        }

        /**
         * And cspellname not equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andCspellnameNotEqualTo(String value) {
            addCriterion("cSpellName <>", value, "cspellname");
            return (Criteria) this;
        }

        /**
         * And cspellname greater than criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andCspellnameGreaterThan(String value) {
            addCriterion("cSpellName >", value, "cspellname");
            return (Criteria) this;
        }

        /**
         * And cspellname greater than or equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andCspellnameGreaterThanOrEqualTo(String value) {
            addCriterion("cSpellName >=", value, "cspellname");
            return (Criteria) this;
        }

        /**
         * And cspellname less than criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andCspellnameLessThan(String value) {
            addCriterion("cSpellName <", value, "cspellname");
            return (Criteria) this;
        }

        /**
         * And cspellname less than or equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andCspellnameLessThanOrEqualTo(String value) {
            addCriterion("cSpellName <=", value, "cspellname");
            return (Criteria) this;
        }

        /**
         * And cspellname like criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andCspellnameLike(String value) {
            addCriterion("cSpellName like", value, "cspellname");
            return (Criteria) this;
        }

        /**
         * And cspellname not like criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andCspellnameNotLike(String value) {
            addCriterion("cSpellName not like", value, "cspellname");
            return (Criteria) this;
        }

        /**
         * And cspellname in criteria.
         *
         * @param values the values
         * @return the criteria
         */
        public Criteria andCspellnameIn(List<String> values) {
            addCriterion("cSpellName in", values, "cspellname");
            return (Criteria) this;
        }

        /**
         * And cspellname not in criteria.
         *
         * @param values the values
         * @return the criteria
         */
        public Criteria andCspellnameNotIn(List<String> values) {
            addCriterion("cSpellName not in", values, "cspellname");
            return (Criteria) this;
        }

        /**
         * And cspellname between criteria.
         *
         * @param value1 the value 1
         * @param value2 the value 2
         * @return the criteria
         */
        public Criteria andCspellnameBetween(String value1, String value2) {
            addCriterion("cSpellName between", value1, value2, "cspellname");
            return (Criteria) this;
        }

        /**
         * And cspellname not between criteria.
         *
         * @param value1 the value 1
         * @param value2 the value 2
         * @return the criteria
         */
        public Criteria andCspellnameNotBetween(String value1, String value2) {
            addCriterion("cSpellName not between", value1, value2, "cspellname");
            return (Criteria) this;
        }

        /**
         * And pid is null criteria.
         *
         * @return the criteria
         */
        public Criteria andPidIsNull() {
            addCriterion("Pid is null");
            return (Criteria) this;
        }

        /**
         * And pid is not null criteria.
         *
         * @return the criteria
         */
        public Criteria andPidIsNotNull() {
            addCriterion("Pid is not null");
            return (Criteria) this;
        }

        /**
         * And pid equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andPidEqualTo(Integer value) {
            addCriterion("Pid =", value, "pid");
            return (Criteria) this;
        }

        /**
         * And pid not equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andPidNotEqualTo(Integer value) {
            addCriterion("Pid <>", value, "pid");
            return (Criteria) this;
        }

        /**
         * And pid greater than criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andPidGreaterThan(Integer value) {
            addCriterion("Pid >", value, "pid");
            return (Criteria) this;
        }

        /**
         * And pid greater than or equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andPidGreaterThanOrEqualTo(Integer value) {
            addCriterion("Pid >=", value, "pid");
            return (Criteria) this;
        }

        /**
         * And pid less than criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andPidLessThan(Integer value) {
            addCriterion("Pid <", value, "pid");
            return (Criteria) this;
        }

        /**
         * And pid less than or equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andPidLessThanOrEqualTo(Integer value) {
            addCriterion("Pid <=", value, "pid");
            return (Criteria) this;
        }

        /**
         * And pid in criteria.
         *
         * @param values the values
         * @return the criteria
         */
        public Criteria andPidIn(List<Integer> values) {
            addCriterion("Pid in", values, "pid");
            return (Criteria) this;
        }

        /**
         * And pid not in criteria.
         *
         * @param values the values
         * @return the criteria
         */
        public Criteria andPidNotIn(List<Integer> values) {
            addCriterion("Pid not in", values, "pid");
            return (Criteria) this;
        }

        /**
         * And pid between criteria.
         *
         * @param value1 the value 1
         * @param value2 the value 2
         * @return the criteria
         */
        public Criteria andPidBetween(Integer value1, Integer value2) {
            addCriterion("Pid between", value1, value2, "pid");
            return (Criteria) this;
        }

        /**
         * And pid not between criteria.
         *
         * @param value1 the value 1
         * @param value2 the value 2
         * @return the criteria
         */
        public Criteria andPidNotBetween(Integer value1, Integer value2) {
            addCriterion("Pid not between", value1, value2, "pid");
            return (Criteria) this;
        }

        /**
         * And pname is null criteria.
         *
         * @return the criteria
         */
        public Criteria andPnameIsNull() {
            addCriterion("pName is null");
            return (Criteria) this;
        }

        /**
         * And pname is not null criteria.
         *
         * @return the criteria
         */
        public Criteria andPnameIsNotNull() {
            addCriterion("pName is not null");
            return (Criteria) this;
        }

        /**
         * And pname equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andPnameEqualTo(String value) {
            addCriterion("pName =", value, "pname");
            return (Criteria) this;
        }

        /**
         * And pname not equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andPnameNotEqualTo(String value) {
            addCriterion("pName <>", value, "pname");
            return (Criteria) this;
        }

        /**
         * And pname greater than criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andPnameGreaterThan(String value) {
            addCriterion("pName >", value, "pname");
            return (Criteria) this;
        }

        /**
         * And pname greater than or equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andPnameGreaterThanOrEqualTo(String value) {
            addCriterion("pName >=", value, "pname");
            return (Criteria) this;
        }

        /**
         * And pname less than criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andPnameLessThan(String value) {
            addCriterion("pName <", value, "pname");
            return (Criteria) this;
        }

        /**
         * And pname less than or equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andPnameLessThanOrEqualTo(String value) {
            addCriterion("pName <=", value, "pname");
            return (Criteria) this;
        }

        /**
         * And pname like criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andPnameLike(String value) {
            addCriterion("pName like", value, "pname");
            return (Criteria) this;
        }

        /**
         * And pname not like criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andPnameNotLike(String value) {
            addCriterion("pName not like", value, "pname");
            return (Criteria) this;
        }

        /**
         * And pname in criteria.
         *
         * @param values the values
         * @return the criteria
         */
        public Criteria andPnameIn(List<String> values) {
            addCriterion("pName in", values, "pname");
            return (Criteria) this;
        }

        /**
         * And pname not in criteria.
         *
         * @param values the values
         * @return the criteria
         */
        public Criteria andPnameNotIn(List<String> values) {
            addCriterion("pName not in", values, "pname");
            return (Criteria) this;
        }

        /**
         * And pname between criteria.
         *
         * @param value1 the value 1
         * @param value2 the value 2
         * @return the criteria
         */
        public Criteria andPnameBetween(String value1, String value2) {
            addCriterion("pName between", value1, value2, "pname");
            return (Criteria) this;
        }

        /**
         * And pname not between criteria.
         *
         * @param value1 the value 1
         * @param value2 the value 2
         * @return the criteria
         */
        public Criteria andPnameNotBetween(String value1, String value2) {
            addCriterion("pName not between", value1, value2, "pname");
            return (Criteria) this;
        }

        /**
         * And pspellname is null criteria.
         *
         * @return the criteria
         */
        public Criteria andPspellnameIsNull() {
            addCriterion("pspellName is null");
            return (Criteria) this;
        }

        /**
         * And pspellname is not null criteria.
         *
         * @return the criteria
         */
        public Criteria andPspellnameIsNotNull() {
            addCriterion("pspellName is not null");
            return (Criteria) this;
        }

        /**
         * And pspellname equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andPspellnameEqualTo(String value) {
            addCriterion("pspellName =", value, "pspellname");
            return (Criteria) this;
        }

        /**
         * And pspellname not equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andPspellnameNotEqualTo(String value) {
            addCriterion("pspellName <>", value, "pspellname");
            return (Criteria) this;
        }

        /**
         * And pspellname greater than criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andPspellnameGreaterThan(String value) {
            addCriterion("pspellName >", value, "pspellname");
            return (Criteria) this;
        }

        /**
         * And pspellname greater than or equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andPspellnameGreaterThanOrEqualTo(String value) {
            addCriterion("pspellName >=", value, "pspellname");
            return (Criteria) this;
        }

        /**
         * And pspellname less than criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andPspellnameLessThan(String value) {
            addCriterion("pspellName <", value, "pspellname");
            return (Criteria) this;
        }

        /**
         * And pspellname less than or equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andPspellnameLessThanOrEqualTo(String value) {
            addCriterion("pspellName <=", value, "pspellname");
            return (Criteria) this;
        }

        /**
         * And pspellname like criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andPspellnameLike(String value) {
            addCriterion("pspellName like", value, "pspellname");
            return (Criteria) this;
        }

        /**
         * And pspellname not like criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andPspellnameNotLike(String value) {
            addCriterion("pspellName not like", value, "pspellname");
            return (Criteria) this;
        }

        /**
         * And pspellname in criteria.
         *
         * @param values the values
         * @return the criteria
         */
        public Criteria andPspellnameIn(List<String> values) {
            addCriterion("pspellName in", values, "pspellname");
            return (Criteria) this;
        }

        /**
         * And pspellname not in criteria.
         *
         * @param values the values
         * @return the criteria
         */
        public Criteria andPspellnameNotIn(List<String> values) {
            addCriterion("pspellName not in", values, "pspellname");
            return (Criteria) this;
        }

        /**
         * And pspellname between criteria.
         *
         * @param value1 the value 1
         * @param value2 the value 2
         * @return the criteria
         */
        public Criteria andPspellnameBetween(String value1, String value2) {
            addCriterion("pspellName between", value1, value2, "pspellname");
            return (Criteria) this;
        }

        /**
         * And pspellname not between criteria.
         *
         * @param value1 the value 1
         * @param value2 the value 2
         * @return the criteria
         */
        public Criteria andPspellnameNotBetween(String value1, String value2) {
            addCriterion("pspellName not between", value1, value2, "pspellname");
            return (Criteria) this;
        }

        /**
         * And inimportant is null criteria.
         *
         * @return the criteria
         */
        public Criteria andInimportantIsNull() {
            addCriterion("inImportant is null");
            return (Criteria) this;
        }

        /**
         * And inimportant is not null criteria.
         *
         * @return the criteria
         */
        public Criteria andInimportantIsNotNull() {
            addCriterion("inImportant is not null");
            return (Criteria) this;
        }

        /**
         * And inimportant equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andInimportantEqualTo(Integer value) {
            addCriterion("inImportant =", value, "inimportant");
            return (Criteria) this;
        }

        /**
         * And inimportant not equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andInimportantNotEqualTo(Integer value) {
            addCriterion("inImportant <>", value, "inimportant");
            return (Criteria) this;
        }

        /**
         * And inimportant greater than criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andInimportantGreaterThan(Integer value) {
            addCriterion("inImportant >", value, "inimportant");
            return (Criteria) this;
        }

        /**
         * And inimportant greater than or equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andInimportantGreaterThanOrEqualTo(Integer value) {
            addCriterion("inImportant >=", value, "inimportant");
            return (Criteria) this;
        }

        /**
         * And inimportant less than criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andInimportantLessThan(Integer value) {
            addCriterion("inImportant <", value, "inimportant");
            return (Criteria) this;
        }

        /**
         * And inimportant less than or equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andInimportantLessThanOrEqualTo(Integer value) {
            addCriterion("inImportant <=", value, "inimportant");
            return (Criteria) this;
        }

        /**
         * And inimportant in criteria.
         *
         * @param values the values
         * @return the criteria
         */
        public Criteria andInimportantIn(List<Integer> values) {
            addCriterion("inImportant in", values, "inimportant");
            return (Criteria) this;
        }

        /**
         * And inimportant not in criteria.
         *
         * @param values the values
         * @return the criteria
         */
        public Criteria andInimportantNotIn(List<Integer> values) {
            addCriterion("inImportant not in", values, "inimportant");
            return (Criteria) this;
        }

        /**
         * And inimportant between criteria.
         *
         * @param value1 the value 1
         * @param value2 the value 2
         * @return the criteria
         */
        public Criteria andInimportantBetween(Integer value1, Integer value2) {
            addCriterion("inImportant between", value1, value2, "inimportant");
            return (Criteria) this;
        }

        /**
         * And inimportant not between criteria.
         *
         * @param value1 the value 1
         * @param value2 the value 2
         * @return the criteria
         */
        public Criteria andInimportantNotBetween(Integer value1, Integer value2) {
            addCriterion("inImportant not between", value1, value2, "inimportant");
            return (Criteria) this;
        }

        /**
         * And locationgroupid is null criteria.
         *
         * @return the criteria
         */
        public Criteria andLocationgroupidIsNull() {
            addCriterion("LocationGroupId is null");
            return (Criteria) this;
        }

        /**
         * And locationgroupid is not null criteria.
         *
         * @return the criteria
         */
        public Criteria andLocationgroupidIsNotNull() {
            addCriterion("LocationGroupId is not null");
            return (Criteria) this;
        }

        /**
         * And locationgroupid equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andLocationgroupidEqualTo(Integer value) {
            addCriterion("LocationGroupId =", value, "locationgroupid");
            return (Criteria) this;
        }

        /**
         * And locationgroupid not equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andLocationgroupidNotEqualTo(Integer value) {
            addCriterion("LocationGroupId <>", value, "locationgroupid");
            return (Criteria) this;
        }

        /**
         * And locationgroupid greater than criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andLocationgroupidGreaterThan(Integer value) {
            addCriterion("LocationGroupId >", value, "locationgroupid");
            return (Criteria) this;
        }

        /**
         * And locationgroupid greater than or equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andLocationgroupidGreaterThanOrEqualTo(Integer value) {
            addCriterion("LocationGroupId >=", value, "locationgroupid");
            return (Criteria) this;
        }

        /**
         * And locationgroupid less than criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andLocationgroupidLessThan(Integer value) {
            addCriterion("LocationGroupId <", value, "locationgroupid");
            return (Criteria) this;
        }

        /**
         * And locationgroupid less than or equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andLocationgroupidLessThanOrEqualTo(Integer value) {
            addCriterion("LocationGroupId <=", value, "locationgroupid");
            return (Criteria) this;
        }

        /**
         * And locationgroupid in criteria.
         *
         * @param values the values
         * @return the criteria
         */
        public Criteria andLocationgroupidIn(List<Integer> values) {
            addCriterion("LocationGroupId in", values, "locationgroupid");
            return (Criteria) this;
        }

        /**
         * And locationgroupid not in criteria.
         *
         * @param values the values
         * @return the criteria
         */
        public Criteria andLocationgroupidNotIn(List<Integer> values) {
            addCriterion("LocationGroupId not in", values, "locationgroupid");
            return (Criteria) this;
        }

        /**
         * And locationgroupid between criteria.
         *
         * @param value1 the value 1
         * @param value2 the value 2
         * @return the criteria
         */
        public Criteria andLocationgroupidBetween(Integer value1, Integer value2) {
            addCriterion("LocationGroupId between", value1, value2, "locationgroupid");
            return (Criteria) this;
        }

        /**
         * And locationgroupid not between criteria.
         *
         * @param value1 the value 1
         * @param value2 the value 2
         * @return the criteria
         */
        public Criteria andLocationgroupidNotBetween(Integer value1, Integer value2) {
            addCriterion("LocationGroupId not between", value1, value2, "locationgroupid");
            return (Criteria) this;
        }

        /**
         * And locationfullname is null criteria.
         *
         * @return the criteria
         */
        public Criteria andLocationfullnameIsNull() {
            addCriterion("LocationFullName is null");
            return (Criteria) this;
        }

        /**
         * And locationfullname is not null criteria.
         *
         * @return the criteria
         */
        public Criteria andLocationfullnameIsNotNull() {
            addCriterion("LocationFullName is not null");
            return (Criteria) this;
        }

        /**
         * And locationfullname equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andLocationfullnameEqualTo(String value) {
            addCriterion("LocationFullName =", value, "locationfullname");
            return (Criteria) this;
        }

        /**
         * And locationfullname not equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andLocationfullnameNotEqualTo(String value) {
            addCriterion("LocationFullName <>", value, "locationfullname");
            return (Criteria) this;
        }

        /**
         * And locationfullname greater than criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andLocationfullnameGreaterThan(String value) {
            addCriterion("LocationFullName >", value, "locationfullname");
            return (Criteria) this;
        }

        /**
         * And locationfullname greater than or equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andLocationfullnameGreaterThanOrEqualTo(String value) {
            addCriterion("LocationFullName >=", value, "locationfullname");
            return (Criteria) this;
        }

        /**
         * And locationfullname less than criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andLocationfullnameLessThan(String value) {
            addCriterion("LocationFullName <", value, "locationfullname");
            return (Criteria) this;
        }

        /**
         * And locationfullname less than or equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andLocationfullnameLessThanOrEqualTo(String value) {
            addCriterion("LocationFullName <=", value, "locationfullname");
            return (Criteria) this;
        }

        /**
         * And locationfullname like criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andLocationfullnameLike(String value) {
            addCriterion("LocationFullName like", value, "locationfullname");
            return (Criteria) this;
        }

        /**
         * And locationfullname not like criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andLocationfullnameNotLike(String value) {
            addCriterion("LocationFullName not like", value, "locationfullname");
            return (Criteria) this;
        }

        /**
         * And locationfullname in criteria.
         *
         * @param values the values
         * @return the criteria
         */
        public Criteria andLocationfullnameIn(List<String> values) {
            addCriterion("LocationFullName in", values, "locationfullname");
            return (Criteria) this;
        }

        /**
         * And locationfullname not in criteria.
         *
         * @param values the values
         * @return the criteria
         */
        public Criteria andLocationfullnameNotIn(List<String> values) {
            addCriterion("LocationFullName not in", values, "locationfullname");
            return (Criteria) this;
        }

        /**
         * And locationfullname between criteria.
         *
         * @param value1 the value 1
         * @param value2 the value 2
         * @return the criteria
         */
        public Criteria andLocationfullnameBetween(String value1, String value2) {
            addCriterion("LocationFullName between", value1, value2, "locationfullname");
            return (Criteria) this;
        }

        /**
         * And locationfullname not between criteria.
         *
         * @param value1 the value 1
         * @param value2 the value 2
         * @return the criteria
         */
        public Criteria andLocationfullnameNotBetween(String value1, String value2) {
            addCriterion("LocationFullName not between", value1, value2, "locationfullname");
            return (Criteria) this;
        }

        /**
         * And level is null criteria.
         *
         * @return the criteria
         */
        public Criteria andLevelIsNull() {
            addCriterion("Level is null");
            return (Criteria) this;
        }

        /**
         * And level is not null criteria.
         *
         * @return the criteria
         */
        public Criteria andLevelIsNotNull() {
            addCriterion("Level is not null");
            return (Criteria) this;
        }

        /**
         * And level equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andLevelEqualTo(Integer value) {
            addCriterion("Level =", value, "level");
            return (Criteria) this;
        }

        /**
         * And level not equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andLevelNotEqualTo(Integer value) {
            addCriterion("Level <>", value, "level");
            return (Criteria) this;
        }

        /**
         * And level greater than criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andLevelGreaterThan(Integer value) {
            addCriterion("Level >", value, "level");
            return (Criteria) this;
        }

        /**
         * And level greater than or equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andLevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("Level >=", value, "level");
            return (Criteria) this;
        }

        /**
         * And level less than criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andLevelLessThan(Integer value) {
            addCriterion("Level <", value, "level");
            return (Criteria) this;
        }

        /**
         * And level less than or equal to criteria.
         *
         * @param value the value
         * @return the criteria
         */
        public Criteria andLevelLessThanOrEqualTo(Integer value) {
            addCriterion("Level <=", value, "level");
            return (Criteria) this;
        }

        /**
         * And level in criteria.
         *
         * @param values the values
         * @return the criteria
         */
        public Criteria andLevelIn(List<Integer> values) {
            addCriterion("Level in", values, "level");
            return (Criteria) this;
        }

        /**
         * And level not in criteria.
         *
         * @param values the values
         * @return the criteria
         */
        public Criteria andLevelNotIn(List<Integer> values) {
            addCriterion("Level not in", values, "level");
            return (Criteria) this;
        }

        /**
         * And level between criteria.
         *
         * @param value1 the value 1
         * @param value2 the value 2
         * @return the criteria
         */
        public Criteria andLevelBetween(Integer value1, Integer value2) {
            addCriterion("Level between", value1, value2, "level");
            return (Criteria) this;
        }

        /**
         * And level not between criteria.
         *
         * @param value1 the value 1
         * @param value2 the value 2
         * @return the criteria
         */
        public Criteria andLevelNotBetween(Integer value1, Integer value2) {
            addCriterion("Level not between", value1, value2, "level");
            return (Criteria) this;
        }
    }

    /**
     * The type Criteria.
     */
    public static class Criteria extends GeneratedCriteria {

        /**
         * Instantiates a new Criteria.
         */
        protected Criteria() {
            super();
        }
    }

    /**
     * The type Criterion.
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

        /**
         * Gets condition.
         *
         * @return the condition
         */
        public String getCondition() {
            return condition;
        }

        /**
         * Gets value.
         *
         * @return the value
         */
        public Object getValue() {
            return value;
        }

        /**
         * Gets second value.
         *
         * @return the second value
         */
        public Object getSecondValue() {
            return secondValue;
        }

        /**
         * Is no value boolean.
         *
         * @return the boolean
         */
        public boolean isNoValue() {
            return noValue;
        }

        /**
         * Is single value boolean.
         *
         * @return the boolean
         */
        public boolean isSingleValue() {
            return singleValue;
        }

        /**
         * Is between value boolean.
         *
         * @return the boolean
         */
        public boolean isBetweenValue() {
            return betweenValue;
        }

        /**
         * Is list value boolean.
         *
         * @return the boolean
         */
        public boolean isListValue() {
            return listValue;
        }

        /**
         * Gets type handler.
         *
         * @return the type handler
         */
        public String getTypeHandler() {
            return typeHandler;
        }

        /**
         * Instantiates a new Criterion.
         *
         * @param condition the condition
         */
        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        /**
         * Instantiates a new Criterion.
         *
         * @param condition   the condition
         * @param value       the value
         * @param typeHandler the type handler
         */
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

        /**
         * Instantiates a new Criterion.
         *
         * @param condition the condition
         * @param value     the value
         */
        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        /**
         * Instantiates a new Criterion.
         *
         * @param condition   the condition
         * @param value       the value
         * @param secondValue the second value
         * @param typeHandler the type handler
         */
        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        /**
         * Instantiates a new Criterion.
         *
         * @param condition   the condition
         * @param value       the value
         * @param secondValue the second value
         */
        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}