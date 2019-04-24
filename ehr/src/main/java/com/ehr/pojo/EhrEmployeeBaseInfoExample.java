package com.ehr.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class EhrEmployeeBaseInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EhrEmployeeBaseInfoExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andEnumberIsNull() {
            addCriterion("eNumber is null");
            return (Criteria) this;
        }

        public Criteria andEnumberIsNotNull() {
            addCriterion("eNumber is not null");
            return (Criteria) this;
        }

        public Criteria andEnumberEqualTo(String value) {
            addCriterion("eNumber =", value, "enumber");
            return (Criteria) this;
        }

        public Criteria andEnumberNotEqualTo(String value) {
            addCriterion("eNumber <>", value, "enumber");
            return (Criteria) this;
        }

        public Criteria andEnumberGreaterThan(String value) {
            addCriterion("eNumber >", value, "enumber");
            return (Criteria) this;
        }

        public Criteria andEnumberGreaterThanOrEqualTo(String value) {
            addCriterion("eNumber >=", value, "enumber");
            return (Criteria) this;
        }

        public Criteria andEnumberLessThan(String value) {
            addCriterion("eNumber <", value, "enumber");
            return (Criteria) this;
        }

        public Criteria andEnumberLessThanOrEqualTo(String value) {
            addCriterion("eNumber <=", value, "enumber");
            return (Criteria) this;
        }

        public Criteria andEnumberLike(String value) {
            addCriterion("eNumber like", value, "enumber");
            return (Criteria) this;
        }

        public Criteria andEnumberNotLike(String value) {
            addCriterion("eNumber not like", value, "enumber");
            return (Criteria) this;
        }

        public Criteria andEnumberIn(List<String> values) {
            addCriterion("eNumber in", values, "enumber");
            return (Criteria) this;
        }

        public Criteria andEnumberNotIn(List<String> values) {
            addCriterion("eNumber not in", values, "enumber");
            return (Criteria) this;
        }

        public Criteria andEnumberBetween(String value1, String value2) {
            addCriterion("eNumber between", value1, value2, "enumber");
            return (Criteria) this;
        }

        public Criteria andEnumberNotBetween(String value1, String value2) {
            addCriterion("eNumber not between", value1, value2, "enumber");
            return (Criteria) this;
        }

        public Criteria andEbirthIsNull() {
            addCriterion("eBirth is null");
            return (Criteria) this;
        }

        public Criteria andEbirthIsNotNull() {
            addCriterion("eBirth is not null");
            return (Criteria) this;
        }

        public Criteria andEbirthEqualTo(Date value) {
            addCriterionForJDBCDate("eBirth =", value, "ebirth");
            return (Criteria) this;
        }

        public Criteria andEbirthNotEqualTo(Date value) {
            addCriterionForJDBCDate("eBirth <>", value, "ebirth");
            return (Criteria) this;
        }

        public Criteria andEbirthGreaterThan(Date value) {
            addCriterionForJDBCDate("eBirth >", value, "ebirth");
            return (Criteria) this;
        }

        public Criteria andEbirthGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("eBirth >=", value, "ebirth");
            return (Criteria) this;
        }

        public Criteria andEbirthLessThan(Date value) {
            addCriterionForJDBCDate("eBirth <", value, "ebirth");
            return (Criteria) this;
        }

        public Criteria andEbirthLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("eBirth <=", value, "ebirth");
            return (Criteria) this;
        }

        public Criteria andEbirthIn(List<Date> values) {
            addCriterionForJDBCDate("eBirth in", values, "ebirth");
            return (Criteria) this;
        }

        public Criteria andEbirthNotIn(List<Date> values) {
            addCriterionForJDBCDate("eBirth not in", values, "ebirth");
            return (Criteria) this;
        }

        public Criteria andEbirthBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("eBirth between", value1, value2, "ebirth");
            return (Criteria) this;
        }

        public Criteria andEbirthNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("eBirth not between", value1, value2, "ebirth");
            return (Criteria) this;
        }

        public Criteria andEnativeplaceIsNull() {
            addCriterion("eNativePlace is null");
            return (Criteria) this;
        }

        public Criteria andEnativeplaceIsNotNull() {
            addCriterion("eNativePlace is not null");
            return (Criteria) this;
        }

        public Criteria andEnativeplaceEqualTo(String value) {
            addCriterion("eNativePlace =", value, "enativeplace");
            return (Criteria) this;
        }

        public Criteria andEnativeplaceNotEqualTo(String value) {
            addCriterion("eNativePlace <>", value, "enativeplace");
            return (Criteria) this;
        }

        public Criteria andEnativeplaceGreaterThan(String value) {
            addCriterion("eNativePlace >", value, "enativeplace");
            return (Criteria) this;
        }

        public Criteria andEnativeplaceGreaterThanOrEqualTo(String value) {
            addCriterion("eNativePlace >=", value, "enativeplace");
            return (Criteria) this;
        }

        public Criteria andEnativeplaceLessThan(String value) {
            addCriterion("eNativePlace <", value, "enativeplace");
            return (Criteria) this;
        }

        public Criteria andEnativeplaceLessThanOrEqualTo(String value) {
            addCriterion("eNativePlace <=", value, "enativeplace");
            return (Criteria) this;
        }

        public Criteria andEnativeplaceLike(String value) {
            addCriterion("eNativePlace like", value, "enativeplace");
            return (Criteria) this;
        }

        public Criteria andEnativeplaceNotLike(String value) {
            addCriterion("eNativePlace not like", value, "enativeplace");
            return (Criteria) this;
        }

        public Criteria andEnativeplaceIn(List<String> values) {
            addCriterion("eNativePlace in", values, "enativeplace");
            return (Criteria) this;
        }

        public Criteria andEnativeplaceNotIn(List<String> values) {
            addCriterion("eNativePlace not in", values, "enativeplace");
            return (Criteria) this;
        }

        public Criteria andEnativeplaceBetween(String value1, String value2) {
            addCriterion("eNativePlace between", value1, value2, "enativeplace");
            return (Criteria) this;
        }

        public Criteria andEnativeplaceNotBetween(String value1, String value2) {
            addCriterion("eNativePlace not between", value1, value2, "enativeplace");
            return (Criteria) this;
        }

        public Criteria andNationIsNull() {
            addCriterion("nation is null");
            return (Criteria) this;
        }

        public Criteria andNationIsNotNull() {
            addCriterion("nation is not null");
            return (Criteria) this;
        }

        public Criteria andNationEqualTo(String value) {
            addCriterion("nation =", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotEqualTo(String value) {
            addCriterion("nation <>", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationGreaterThan(String value) {
            addCriterion("nation >", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationGreaterThanOrEqualTo(String value) {
            addCriterion("nation >=", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationLessThan(String value) {
            addCriterion("nation <", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationLessThanOrEqualTo(String value) {
            addCriterion("nation <=", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationLike(String value) {
            addCriterion("nation like", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotLike(String value) {
            addCriterion("nation not like", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationIn(List<String> values) {
            addCriterion("nation in", values, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotIn(List<String> values) {
            addCriterion("nation not in", values, "nation");
            return (Criteria) this;
        }

        public Criteria andNationBetween(String value1, String value2) {
            addCriterion("nation between", value1, value2, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotBetween(String value1, String value2) {
            addCriterion("nation not between", value1, value2, "nation");
            return (Criteria) this;
        }

        public Criteria andMaritalstatusIsNull() {
            addCriterion("maritalStatus is null");
            return (Criteria) this;
        }

        public Criteria andMaritalstatusIsNotNull() {
            addCriterion("maritalStatus is not null");
            return (Criteria) this;
        }

        public Criteria andMaritalstatusEqualTo(String value) {
            addCriterion("maritalStatus =", value, "maritalstatus");
            return (Criteria) this;
        }

        public Criteria andMaritalstatusNotEqualTo(String value) {
            addCriterion("maritalStatus <>", value, "maritalstatus");
            return (Criteria) this;
        }

        public Criteria andMaritalstatusGreaterThan(String value) {
            addCriterion("maritalStatus >", value, "maritalstatus");
            return (Criteria) this;
        }

        public Criteria andMaritalstatusGreaterThanOrEqualTo(String value) {
            addCriterion("maritalStatus >=", value, "maritalstatus");
            return (Criteria) this;
        }

        public Criteria andMaritalstatusLessThan(String value) {
            addCriterion("maritalStatus <", value, "maritalstatus");
            return (Criteria) this;
        }

        public Criteria andMaritalstatusLessThanOrEqualTo(String value) {
            addCriterion("maritalStatus <=", value, "maritalstatus");
            return (Criteria) this;
        }

        public Criteria andMaritalstatusLike(String value) {
            addCriterion("maritalStatus like", value, "maritalstatus");
            return (Criteria) this;
        }

        public Criteria andMaritalstatusNotLike(String value) {
            addCriterion("maritalStatus not like", value, "maritalstatus");
            return (Criteria) this;
        }

        public Criteria andMaritalstatusIn(List<String> values) {
            addCriterion("maritalStatus in", values, "maritalstatus");
            return (Criteria) this;
        }

        public Criteria andMaritalstatusNotIn(List<String> values) {
            addCriterion("maritalStatus not in", values, "maritalstatus");
            return (Criteria) this;
        }

        public Criteria andMaritalstatusBetween(String value1, String value2) {
            addCriterion("maritalStatus between", value1, value2, "maritalstatus");
            return (Criteria) this;
        }

        public Criteria andMaritalstatusNotBetween(String value1, String value2) {
            addCriterion("maritalStatus not between", value1, value2, "maritalstatus");
            return (Criteria) this;
        }

        public Criteria andPoliticalstatusIsNull() {
            addCriterion("politicalStatus is null");
            return (Criteria) this;
        }

        public Criteria andPoliticalstatusIsNotNull() {
            addCriterion("politicalStatus is not null");
            return (Criteria) this;
        }

        public Criteria andPoliticalstatusEqualTo(String value) {
            addCriterion("politicalStatus =", value, "politicalstatus");
            return (Criteria) this;
        }

        public Criteria andPoliticalstatusNotEqualTo(String value) {
            addCriterion("politicalStatus <>", value, "politicalstatus");
            return (Criteria) this;
        }

        public Criteria andPoliticalstatusGreaterThan(String value) {
            addCriterion("politicalStatus >", value, "politicalstatus");
            return (Criteria) this;
        }

        public Criteria andPoliticalstatusGreaterThanOrEqualTo(String value) {
            addCriterion("politicalStatus >=", value, "politicalstatus");
            return (Criteria) this;
        }

        public Criteria andPoliticalstatusLessThan(String value) {
            addCriterion("politicalStatus <", value, "politicalstatus");
            return (Criteria) this;
        }

        public Criteria andPoliticalstatusLessThanOrEqualTo(String value) {
            addCriterion("politicalStatus <=", value, "politicalstatus");
            return (Criteria) this;
        }

        public Criteria andPoliticalstatusLike(String value) {
            addCriterion("politicalStatus like", value, "politicalstatus");
            return (Criteria) this;
        }

        public Criteria andPoliticalstatusNotLike(String value) {
            addCriterion("politicalStatus not like", value, "politicalstatus");
            return (Criteria) this;
        }

        public Criteria andPoliticalstatusIn(List<String> values) {
            addCriterion("politicalStatus in", values, "politicalstatus");
            return (Criteria) this;
        }

        public Criteria andPoliticalstatusNotIn(List<String> values) {
            addCriterion("politicalStatus not in", values, "politicalstatus");
            return (Criteria) this;
        }

        public Criteria andPoliticalstatusBetween(String value1, String value2) {
            addCriterion("politicalStatus between", value1, value2, "politicalstatus");
            return (Criteria) this;
        }

        public Criteria andPoliticalstatusNotBetween(String value1, String value2) {
            addCriterion("politicalStatus not between", value1, value2, "politicalstatus");
            return (Criteria) this;
        }

        public Criteria andHealthIsNull() {
            addCriterion("health is null");
            return (Criteria) this;
        }

        public Criteria andHealthIsNotNull() {
            addCriterion("health is not null");
            return (Criteria) this;
        }

        public Criteria andHealthEqualTo(String value) {
            addCriterion("health =", value, "health");
            return (Criteria) this;
        }

        public Criteria andHealthNotEqualTo(String value) {
            addCriterion("health <>", value, "health");
            return (Criteria) this;
        }

        public Criteria andHealthGreaterThan(String value) {
            addCriterion("health >", value, "health");
            return (Criteria) this;
        }

        public Criteria andHealthGreaterThanOrEqualTo(String value) {
            addCriterion("health >=", value, "health");
            return (Criteria) this;
        }

        public Criteria andHealthLessThan(String value) {
            addCriterion("health <", value, "health");
            return (Criteria) this;
        }

        public Criteria andHealthLessThanOrEqualTo(String value) {
            addCriterion("health <=", value, "health");
            return (Criteria) this;
        }

        public Criteria andHealthLike(String value) {
            addCriterion("health like", value, "health");
            return (Criteria) this;
        }

        public Criteria andHealthNotLike(String value) {
            addCriterion("health not like", value, "health");
            return (Criteria) this;
        }

        public Criteria andHealthIn(List<String> values) {
            addCriterion("health in", values, "health");
            return (Criteria) this;
        }

        public Criteria andHealthNotIn(List<String> values) {
            addCriterion("health not in", values, "health");
            return (Criteria) this;
        }

        public Criteria andHealthBetween(String value1, String value2) {
            addCriterion("health between", value1, value2, "health");
            return (Criteria) this;
        }

        public Criteria andHealthNotBetween(String value1, String value2) {
            addCriterion("health not between", value1, value2, "health");
            return (Criteria) this;
        }

        public Criteria andIdentitynumberIsNull() {
            addCriterion("identityNumber is null");
            return (Criteria) this;
        }

        public Criteria andIdentitynumberIsNotNull() {
            addCriterion("identityNumber is not null");
            return (Criteria) this;
        }

        public Criteria andIdentitynumberEqualTo(String value) {
            addCriterion("identityNumber =", value, "identitynumber");
            return (Criteria) this;
        }

        public Criteria andIdentitynumberNotEqualTo(String value) {
            addCriterion("identityNumber <>", value, "identitynumber");
            return (Criteria) this;
        }

        public Criteria andIdentitynumberGreaterThan(String value) {
            addCriterion("identityNumber >", value, "identitynumber");
            return (Criteria) this;
        }

        public Criteria andIdentitynumberGreaterThanOrEqualTo(String value) {
            addCriterion("identityNumber >=", value, "identitynumber");
            return (Criteria) this;
        }

        public Criteria andIdentitynumberLessThan(String value) {
            addCriterion("identityNumber <", value, "identitynumber");
            return (Criteria) this;
        }

        public Criteria andIdentitynumberLessThanOrEqualTo(String value) {
            addCriterion("identityNumber <=", value, "identitynumber");
            return (Criteria) this;
        }

        public Criteria andIdentitynumberLike(String value) {
            addCriterion("identityNumber like", value, "identitynumber");
            return (Criteria) this;
        }

        public Criteria andIdentitynumberNotLike(String value) {
            addCriterion("identityNumber not like", value, "identitynumber");
            return (Criteria) this;
        }

        public Criteria andIdentitynumberIn(List<String> values) {
            addCriterion("identityNumber in", values, "identitynumber");
            return (Criteria) this;
        }

        public Criteria andIdentitynumberNotIn(List<String> values) {
            addCriterion("identityNumber not in", values, "identitynumber");
            return (Criteria) this;
        }

        public Criteria andIdentitynumberBetween(String value1, String value2) {
            addCriterion("identityNumber between", value1, value2, "identitynumber");
            return (Criteria) this;
        }

        public Criteria andIdentitynumberNotBetween(String value1, String value2) {
            addCriterion("identityNumber not between", value1, value2, "identitynumber");
            return (Criteria) this;
        }

        public Criteria andWorkbeginningIsNull() {
            addCriterion("workBeginning is null");
            return (Criteria) this;
        }

        public Criteria andWorkbeginningIsNotNull() {
            addCriterion("workBeginning is not null");
            return (Criteria) this;
        }

        public Criteria andWorkbeginningEqualTo(String value) {
            addCriterion("workBeginning =", value, "workbeginning");
            return (Criteria) this;
        }

        public Criteria andWorkbeginningNotEqualTo(String value) {
            addCriterion("workBeginning <>", value, "workbeginning");
            return (Criteria) this;
        }

        public Criteria andWorkbeginningGreaterThan(String value) {
            addCriterion("workBeginning >", value, "workbeginning");
            return (Criteria) this;
        }

        public Criteria andWorkbeginningGreaterThanOrEqualTo(String value) {
            addCriterion("workBeginning >=", value, "workbeginning");
            return (Criteria) this;
        }

        public Criteria andWorkbeginningLessThan(String value) {
            addCriterion("workBeginning <", value, "workbeginning");
            return (Criteria) this;
        }

        public Criteria andWorkbeginningLessThanOrEqualTo(String value) {
            addCriterion("workBeginning <=", value, "workbeginning");
            return (Criteria) this;
        }

        public Criteria andWorkbeginningLike(String value) {
            addCriterion("workBeginning like", value, "workbeginning");
            return (Criteria) this;
        }

        public Criteria andWorkbeginningNotLike(String value) {
            addCriterion("workBeginning not like", value, "workbeginning");
            return (Criteria) this;
        }

        public Criteria andWorkbeginningIn(List<String> values) {
            addCriterion("workBeginning in", values, "workbeginning");
            return (Criteria) this;
        }

        public Criteria andWorkbeginningNotIn(List<String> values) {
            addCriterion("workBeginning not in", values, "workbeginning");
            return (Criteria) this;
        }

        public Criteria andWorkbeginningBetween(String value1, String value2) {
            addCriterion("workBeginning between", value1, value2, "workbeginning");
            return (Criteria) this;
        }

        public Criteria andWorkbeginningNotBetween(String value1, String value2) {
            addCriterion("workBeginning not between", value1, value2, "workbeginning");
            return (Criteria) this;
        }

        public Criteria andWorktimeIsNull() {
            addCriterion("workTime is null");
            return (Criteria) this;
        }

        public Criteria andWorktimeIsNotNull() {
            addCriterion("workTime is not null");
            return (Criteria) this;
        }

        public Criteria andWorktimeEqualTo(String value) {
            addCriterion("workTime =", value, "worktime");
            return (Criteria) this;
        }

        public Criteria andWorktimeNotEqualTo(String value) {
            addCriterion("workTime <>", value, "worktime");
            return (Criteria) this;
        }

        public Criteria andWorktimeGreaterThan(String value) {
            addCriterion("workTime >", value, "worktime");
            return (Criteria) this;
        }

        public Criteria andWorktimeGreaterThanOrEqualTo(String value) {
            addCriterion("workTime >=", value, "worktime");
            return (Criteria) this;
        }

        public Criteria andWorktimeLessThan(String value) {
            addCriterion("workTime <", value, "worktime");
            return (Criteria) this;
        }

        public Criteria andWorktimeLessThanOrEqualTo(String value) {
            addCriterion("workTime <=", value, "worktime");
            return (Criteria) this;
        }

        public Criteria andWorktimeLike(String value) {
            addCriterion("workTime like", value, "worktime");
            return (Criteria) this;
        }

        public Criteria andWorktimeNotLike(String value) {
            addCriterion("workTime not like", value, "worktime");
            return (Criteria) this;
        }

        public Criteria andWorktimeIn(List<String> values) {
            addCriterion("workTime in", values, "worktime");
            return (Criteria) this;
        }

        public Criteria andWorktimeNotIn(List<String> values) {
            addCriterion("workTime not in", values, "worktime");
            return (Criteria) this;
        }

        public Criteria andWorktimeBetween(String value1, String value2) {
            addCriterion("workTime between", value1, value2, "worktime");
            return (Criteria) this;
        }

        public Criteria andWorktimeNotBetween(String value1, String value2) {
            addCriterion("workTime not between", value1, value2, "worktime");
            return (Criteria) this;
        }

        public Criteria andEducationbgIsNull() {
            addCriterion("educationBg is null");
            return (Criteria) this;
        }

        public Criteria andEducationbgIsNotNull() {
            addCriterion("educationBg is not null");
            return (Criteria) this;
        }

        public Criteria andEducationbgEqualTo(String value) {
            addCriterion("educationBg =", value, "educationbg");
            return (Criteria) this;
        }

        public Criteria andEducationbgNotEqualTo(String value) {
            addCriterion("educationBg <>", value, "educationbg");
            return (Criteria) this;
        }

        public Criteria andEducationbgGreaterThan(String value) {
            addCriterion("educationBg >", value, "educationbg");
            return (Criteria) this;
        }

        public Criteria andEducationbgGreaterThanOrEqualTo(String value) {
            addCriterion("educationBg >=", value, "educationbg");
            return (Criteria) this;
        }

        public Criteria andEducationbgLessThan(String value) {
            addCriterion("educationBg <", value, "educationbg");
            return (Criteria) this;
        }

        public Criteria andEducationbgLessThanOrEqualTo(String value) {
            addCriterion("educationBg <=", value, "educationbg");
            return (Criteria) this;
        }

        public Criteria andEducationbgLike(String value) {
            addCriterion("educationBg like", value, "educationbg");
            return (Criteria) this;
        }

        public Criteria andEducationbgNotLike(String value) {
            addCriterion("educationBg not like", value, "educationbg");
            return (Criteria) this;
        }

        public Criteria andEducationbgIn(List<String> values) {
            addCriterion("educationBg in", values, "educationbg");
            return (Criteria) this;
        }

        public Criteria andEducationbgNotIn(List<String> values) {
            addCriterion("educationBg not in", values, "educationbg");
            return (Criteria) this;
        }

        public Criteria andEducationbgBetween(String value1, String value2) {
            addCriterion("educationBg between", value1, value2, "educationbg");
            return (Criteria) this;
        }

        public Criteria andEducationbgNotBetween(String value1, String value2) {
            addCriterion("educationBg not between", value1, value2, "educationbg");
            return (Criteria) this;
        }

        public Criteria andGraduatedschoolIsNull() {
            addCriterion("graduatedSchool is null");
            return (Criteria) this;
        }

        public Criteria andGraduatedschoolIsNotNull() {
            addCriterion("graduatedSchool is not null");
            return (Criteria) this;
        }

        public Criteria andGraduatedschoolEqualTo(String value) {
            addCriterion("graduatedSchool =", value, "graduatedschool");
            return (Criteria) this;
        }

        public Criteria andGraduatedschoolNotEqualTo(String value) {
            addCriterion("graduatedSchool <>", value, "graduatedschool");
            return (Criteria) this;
        }

        public Criteria andGraduatedschoolGreaterThan(String value) {
            addCriterion("graduatedSchool >", value, "graduatedschool");
            return (Criteria) this;
        }

        public Criteria andGraduatedschoolGreaterThanOrEqualTo(String value) {
            addCriterion("graduatedSchool >=", value, "graduatedschool");
            return (Criteria) this;
        }

        public Criteria andGraduatedschoolLessThan(String value) {
            addCriterion("graduatedSchool <", value, "graduatedschool");
            return (Criteria) this;
        }

        public Criteria andGraduatedschoolLessThanOrEqualTo(String value) {
            addCriterion("graduatedSchool <=", value, "graduatedschool");
            return (Criteria) this;
        }

        public Criteria andGraduatedschoolLike(String value) {
            addCriterion("graduatedSchool like", value, "graduatedschool");
            return (Criteria) this;
        }

        public Criteria andGraduatedschoolNotLike(String value) {
            addCriterion("graduatedSchool not like", value, "graduatedschool");
            return (Criteria) this;
        }

        public Criteria andGraduatedschoolIn(List<String> values) {
            addCriterion("graduatedSchool in", values, "graduatedschool");
            return (Criteria) this;
        }

        public Criteria andGraduatedschoolNotIn(List<String> values) {
            addCriterion("graduatedSchool not in", values, "graduatedschool");
            return (Criteria) this;
        }

        public Criteria andGraduatedschoolBetween(String value1, String value2) {
            addCriterion("graduatedSchool between", value1, value2, "graduatedschool");
            return (Criteria) this;
        }

        public Criteria andGraduatedschoolNotBetween(String value1, String value2) {
            addCriterion("graduatedSchool not between", value1, value2, "graduatedschool");
            return (Criteria) this;
        }

        public Criteria andMajorIsNull() {
            addCriterion("major is null");
            return (Criteria) this;
        }

        public Criteria andMajorIsNotNull() {
            addCriterion("major is not null");
            return (Criteria) this;
        }

        public Criteria andMajorEqualTo(String value) {
            addCriterion("major =", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorNotEqualTo(String value) {
            addCriterion("major <>", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorGreaterThan(String value) {
            addCriterion("major >", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorGreaterThanOrEqualTo(String value) {
            addCriterion("major >=", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorLessThan(String value) {
            addCriterion("major <", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorLessThanOrEqualTo(String value) {
            addCriterion("major <=", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorLike(String value) {
            addCriterion("major like", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorNotLike(String value) {
            addCriterion("major not like", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorIn(List<String> values) {
            addCriterion("major in", values, "major");
            return (Criteria) this;
        }

        public Criteria andMajorNotIn(List<String> values) {
            addCriterion("major not in", values, "major");
            return (Criteria) this;
        }

        public Criteria andMajorBetween(String value1, String value2) {
            addCriterion("major between", value1, value2, "major");
            return (Criteria) this;
        }

        public Criteria andMajorNotBetween(String value1, String value2) {
            addCriterion("major not between", value1, value2, "major");
            return (Criteria) this;
        }

        public Criteria andGraduationdateIsNull() {
            addCriterion("graduationDate is null");
            return (Criteria) this;
        }

        public Criteria andGraduationdateIsNotNull() {
            addCriterion("graduationDate is not null");
            return (Criteria) this;
        }

        public Criteria andGraduationdateEqualTo(Date value) {
            addCriterionForJDBCDate("graduationDate =", value, "graduationdate");
            return (Criteria) this;
        }

        public Criteria andGraduationdateNotEqualTo(Date value) {
            addCriterionForJDBCDate("graduationDate <>", value, "graduationdate");
            return (Criteria) this;
        }

        public Criteria andGraduationdateGreaterThan(Date value) {
            addCriterionForJDBCDate("graduationDate >", value, "graduationdate");
            return (Criteria) this;
        }

        public Criteria andGraduationdateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("graduationDate >=", value, "graduationdate");
            return (Criteria) this;
        }

        public Criteria andGraduationdateLessThan(Date value) {
            addCriterionForJDBCDate("graduationDate <", value, "graduationdate");
            return (Criteria) this;
        }

        public Criteria andGraduationdateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("graduationDate <=", value, "graduationdate");
            return (Criteria) this;
        }

        public Criteria andGraduationdateIn(List<Date> values) {
            addCriterionForJDBCDate("graduationDate in", values, "graduationdate");
            return (Criteria) this;
        }

        public Criteria andGraduationdateNotIn(List<Date> values) {
            addCriterionForJDBCDate("graduationDate not in", values, "graduationdate");
            return (Criteria) this;
        }

        public Criteria andGraduationdateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("graduationDate between", value1, value2, "graduationdate");
            return (Criteria) this;
        }

        public Criteria andGraduationdateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("graduationDate not between", value1, value2, "graduationdate");
            return (Criteria) this;
        }

        public Criteria andForeignlanguageIsNull() {
            addCriterion("foreignLanguage is null");
            return (Criteria) this;
        }

        public Criteria andForeignlanguageIsNotNull() {
            addCriterion("foreignLanguage is not null");
            return (Criteria) this;
        }

        public Criteria andForeignlanguageEqualTo(String value) {
            addCriterion("foreignLanguage =", value, "foreignlanguage");
            return (Criteria) this;
        }

        public Criteria andForeignlanguageNotEqualTo(String value) {
            addCriterion("foreignLanguage <>", value, "foreignlanguage");
            return (Criteria) this;
        }

        public Criteria andForeignlanguageGreaterThan(String value) {
            addCriterion("foreignLanguage >", value, "foreignlanguage");
            return (Criteria) this;
        }

        public Criteria andForeignlanguageGreaterThanOrEqualTo(String value) {
            addCriterion("foreignLanguage >=", value, "foreignlanguage");
            return (Criteria) this;
        }

        public Criteria andForeignlanguageLessThan(String value) {
            addCriterion("foreignLanguage <", value, "foreignlanguage");
            return (Criteria) this;
        }

        public Criteria andForeignlanguageLessThanOrEqualTo(String value) {
            addCriterion("foreignLanguage <=", value, "foreignlanguage");
            return (Criteria) this;
        }

        public Criteria andForeignlanguageLike(String value) {
            addCriterion("foreignLanguage like", value, "foreignlanguage");
            return (Criteria) this;
        }

        public Criteria andForeignlanguageNotLike(String value) {
            addCriterion("foreignLanguage not like", value, "foreignlanguage");
            return (Criteria) this;
        }

        public Criteria andForeignlanguageIn(List<String> values) {
            addCriterion("foreignLanguage in", values, "foreignlanguage");
            return (Criteria) this;
        }

        public Criteria andForeignlanguageNotIn(List<String> values) {
            addCriterion("foreignLanguage not in", values, "foreignlanguage");
            return (Criteria) this;
        }

        public Criteria andForeignlanguageBetween(String value1, String value2) {
            addCriterion("foreignLanguage between", value1, value2, "foreignlanguage");
            return (Criteria) this;
        }

        public Criteria andForeignlanguageNotBetween(String value1, String value2) {
            addCriterion("foreignLanguage not between", value1, value2, "foreignlanguage");
            return (Criteria) this;
        }

        public Criteria andLanguagelevelIsNull() {
            addCriterion("languageLevel is null");
            return (Criteria) this;
        }

        public Criteria andLanguagelevelIsNotNull() {
            addCriterion("languageLevel is not null");
            return (Criteria) this;
        }

        public Criteria andLanguagelevelEqualTo(String value) {
            addCriterion("languageLevel =", value, "languagelevel");
            return (Criteria) this;
        }

        public Criteria andLanguagelevelNotEqualTo(String value) {
            addCriterion("languageLevel <>", value, "languagelevel");
            return (Criteria) this;
        }

        public Criteria andLanguagelevelGreaterThan(String value) {
            addCriterion("languageLevel >", value, "languagelevel");
            return (Criteria) this;
        }

        public Criteria andLanguagelevelGreaterThanOrEqualTo(String value) {
            addCriterion("languageLevel >=", value, "languagelevel");
            return (Criteria) this;
        }

        public Criteria andLanguagelevelLessThan(String value) {
            addCriterion("languageLevel <", value, "languagelevel");
            return (Criteria) this;
        }

        public Criteria andLanguagelevelLessThanOrEqualTo(String value) {
            addCriterion("languageLevel <=", value, "languagelevel");
            return (Criteria) this;
        }

        public Criteria andLanguagelevelLike(String value) {
            addCriterion("languageLevel like", value, "languagelevel");
            return (Criteria) this;
        }

        public Criteria andLanguagelevelNotLike(String value) {
            addCriterion("languageLevel not like", value, "languagelevel");
            return (Criteria) this;
        }

        public Criteria andLanguagelevelIn(List<String> values) {
            addCriterion("languageLevel in", values, "languagelevel");
            return (Criteria) this;
        }

        public Criteria andLanguagelevelNotIn(List<String> values) {
            addCriterion("languageLevel not in", values, "languagelevel");
            return (Criteria) this;
        }

        public Criteria andLanguagelevelBetween(String value1, String value2) {
            addCriterion("languageLevel between", value1, value2, "languagelevel");
            return (Criteria) this;
        }

        public Criteria andLanguagelevelNotBetween(String value1, String value2) {
            addCriterion("languageLevel not between", value1, value2, "languagelevel");
            return (Criteria) this;
        }

        public Criteria andComputerskillsIsNull() {
            addCriterion("computerSkills is null");
            return (Criteria) this;
        }

        public Criteria andComputerskillsIsNotNull() {
            addCriterion("computerSkills is not null");
            return (Criteria) this;
        }

        public Criteria andComputerskillsEqualTo(String value) {
            addCriterion("computerSkills =", value, "computerskills");
            return (Criteria) this;
        }

        public Criteria andComputerskillsNotEqualTo(String value) {
            addCriterion("computerSkills <>", value, "computerskills");
            return (Criteria) this;
        }

        public Criteria andComputerskillsGreaterThan(String value) {
            addCriterion("computerSkills >", value, "computerskills");
            return (Criteria) this;
        }

        public Criteria andComputerskillsGreaterThanOrEqualTo(String value) {
            addCriterion("computerSkills >=", value, "computerskills");
            return (Criteria) this;
        }

        public Criteria andComputerskillsLessThan(String value) {
            addCriterion("computerSkills <", value, "computerskills");
            return (Criteria) this;
        }

        public Criteria andComputerskillsLessThanOrEqualTo(String value) {
            addCriterion("computerSkills <=", value, "computerskills");
            return (Criteria) this;
        }

        public Criteria andComputerskillsLike(String value) {
            addCriterion("computerSkills like", value, "computerskills");
            return (Criteria) this;
        }

        public Criteria andComputerskillsNotLike(String value) {
            addCriterion("computerSkills not like", value, "computerskills");
            return (Criteria) this;
        }

        public Criteria andComputerskillsIn(List<String> values) {
            addCriterion("computerSkills in", values, "computerskills");
            return (Criteria) this;
        }

        public Criteria andComputerskillsNotIn(List<String> values) {
            addCriterion("computerSkills not in", values, "computerskills");
            return (Criteria) this;
        }

        public Criteria andComputerskillsBetween(String value1, String value2) {
            addCriterion("computerSkills between", value1, value2, "computerskills");
            return (Criteria) this;
        }

        public Criteria andComputerskillsNotBetween(String value1, String value2) {
            addCriterion("computerSkills not between", value1, value2, "computerskills");
            return (Criteria) this;
        }

        public Criteria andComputergradeIsNull() {
            addCriterion("computerGrade is null");
            return (Criteria) this;
        }

        public Criteria andComputergradeIsNotNull() {
            addCriterion("computerGrade is not null");
            return (Criteria) this;
        }

        public Criteria andComputergradeEqualTo(String value) {
            addCriterion("computerGrade =", value, "computergrade");
            return (Criteria) this;
        }

        public Criteria andComputergradeNotEqualTo(String value) {
            addCriterion("computerGrade <>", value, "computergrade");
            return (Criteria) this;
        }

        public Criteria andComputergradeGreaterThan(String value) {
            addCriterion("computerGrade >", value, "computergrade");
            return (Criteria) this;
        }

        public Criteria andComputergradeGreaterThanOrEqualTo(String value) {
            addCriterion("computerGrade >=", value, "computergrade");
            return (Criteria) this;
        }

        public Criteria andComputergradeLessThan(String value) {
            addCriterion("computerGrade <", value, "computergrade");
            return (Criteria) this;
        }

        public Criteria andComputergradeLessThanOrEqualTo(String value) {
            addCriterion("computerGrade <=", value, "computergrade");
            return (Criteria) this;
        }

        public Criteria andComputergradeLike(String value) {
            addCriterion("computerGrade like", value, "computergrade");
            return (Criteria) this;
        }

        public Criteria andComputergradeNotLike(String value) {
            addCriterion("computerGrade not like", value, "computergrade");
            return (Criteria) this;
        }

        public Criteria andComputergradeIn(List<String> values) {
            addCriterion("computerGrade in", values, "computergrade");
            return (Criteria) this;
        }

        public Criteria andComputergradeNotIn(List<String> values) {
            addCriterion("computerGrade not in", values, "computergrade");
            return (Criteria) this;
        }

        public Criteria andComputergradeBetween(String value1, String value2) {
            addCriterion("computerGrade between", value1, value2, "computergrade");
            return (Criteria) this;
        }

        public Criteria andComputergradeNotBetween(String value1, String value2) {
            addCriterion("computerGrade not between", value1, value2, "computergrade");
            return (Criteria) this;
        }

        public Criteria andCertificateIsNull() {
            addCriterion("certificate is null");
            return (Criteria) this;
        }

        public Criteria andCertificateIsNotNull() {
            addCriterion("certificate is not null");
            return (Criteria) this;
        }

        public Criteria andCertificateEqualTo(String value) {
            addCriterion("certificate =", value, "certificate");
            return (Criteria) this;
        }

        public Criteria andCertificateNotEqualTo(String value) {
            addCriterion("certificate <>", value, "certificate");
            return (Criteria) this;
        }

        public Criteria andCertificateGreaterThan(String value) {
            addCriterion("certificate >", value, "certificate");
            return (Criteria) this;
        }

        public Criteria andCertificateGreaterThanOrEqualTo(String value) {
            addCriterion("certificate >=", value, "certificate");
            return (Criteria) this;
        }

        public Criteria andCertificateLessThan(String value) {
            addCriterion("certificate <", value, "certificate");
            return (Criteria) this;
        }

        public Criteria andCertificateLessThanOrEqualTo(String value) {
            addCriterion("certificate <=", value, "certificate");
            return (Criteria) this;
        }

        public Criteria andCertificateLike(String value) {
            addCriterion("certificate like", value, "certificate");
            return (Criteria) this;
        }

        public Criteria andCertificateNotLike(String value) {
            addCriterion("certificate not like", value, "certificate");
            return (Criteria) this;
        }

        public Criteria andCertificateIn(List<String> values) {
            addCriterion("certificate in", values, "certificate");
            return (Criteria) this;
        }

        public Criteria andCertificateNotIn(List<String> values) {
            addCriterion("certificate not in", values, "certificate");
            return (Criteria) this;
        }

        public Criteria andCertificateBetween(String value1, String value2) {
            addCriterion("certificate between", value1, value2, "certificate");
            return (Criteria) this;
        }

        public Criteria andCertificateNotBetween(String value1, String value2) {
            addCriterion("certificate not between", value1, value2, "certificate");
            return (Criteria) this;
        }

        public Criteria andEducationexperienceIsNull() {
            addCriterion("educationExperience is null");
            return (Criteria) this;
        }

        public Criteria andEducationexperienceIsNotNull() {
            addCriterion("educationExperience is not null");
            return (Criteria) this;
        }

        public Criteria andEducationexperienceEqualTo(String value) {
            addCriterion("educationExperience =", value, "educationexperience");
            return (Criteria) this;
        }

        public Criteria andEducationexperienceNotEqualTo(String value) {
            addCriterion("educationExperience <>", value, "educationexperience");
            return (Criteria) this;
        }

        public Criteria andEducationexperienceGreaterThan(String value) {
            addCriterion("educationExperience >", value, "educationexperience");
            return (Criteria) this;
        }

        public Criteria andEducationexperienceGreaterThanOrEqualTo(String value) {
            addCriterion("educationExperience >=", value, "educationexperience");
            return (Criteria) this;
        }

        public Criteria andEducationexperienceLessThan(String value) {
            addCriterion("educationExperience <", value, "educationexperience");
            return (Criteria) this;
        }

        public Criteria andEducationexperienceLessThanOrEqualTo(String value) {
            addCriterion("educationExperience <=", value, "educationexperience");
            return (Criteria) this;
        }

        public Criteria andEducationexperienceLike(String value) {
            addCriterion("educationExperience like", value, "educationexperience");
            return (Criteria) this;
        }

        public Criteria andEducationexperienceNotLike(String value) {
            addCriterion("educationExperience not like", value, "educationexperience");
            return (Criteria) this;
        }

        public Criteria andEducationexperienceIn(List<String> values) {
            addCriterion("educationExperience in", values, "educationexperience");
            return (Criteria) this;
        }

        public Criteria andEducationexperienceNotIn(List<String> values) {
            addCriterion("educationExperience not in", values, "educationexperience");
            return (Criteria) this;
        }

        public Criteria andEducationexperienceBetween(String value1, String value2) {
            addCriterion("educationExperience between", value1, value2, "educationexperience");
            return (Criteria) this;
        }

        public Criteria andEducationexperienceNotBetween(String value1, String value2) {
            addCriterion("educationExperience not between", value1, value2, "educationexperience");
            return (Criteria) this;
        }

        public Criteria andSpecialityIsNull() {
            addCriterion("speciality is null");
            return (Criteria) this;
        }

        public Criteria andSpecialityIsNotNull() {
            addCriterion("speciality is not null");
            return (Criteria) this;
        }

        public Criteria andSpecialityEqualTo(String value) {
            addCriterion("speciality =", value, "speciality");
            return (Criteria) this;
        }

        public Criteria andSpecialityNotEqualTo(String value) {
            addCriterion("speciality <>", value, "speciality");
            return (Criteria) this;
        }

        public Criteria andSpecialityGreaterThan(String value) {
            addCriterion("speciality >", value, "speciality");
            return (Criteria) this;
        }

        public Criteria andSpecialityGreaterThanOrEqualTo(String value) {
            addCriterion("speciality >=", value, "speciality");
            return (Criteria) this;
        }

        public Criteria andSpecialityLessThan(String value) {
            addCriterion("speciality <", value, "speciality");
            return (Criteria) this;
        }

        public Criteria andSpecialityLessThanOrEqualTo(String value) {
            addCriterion("speciality <=", value, "speciality");
            return (Criteria) this;
        }

        public Criteria andSpecialityLike(String value) {
            addCriterion("speciality like", value, "speciality");
            return (Criteria) this;
        }

        public Criteria andSpecialityNotLike(String value) {
            addCriterion("speciality not like", value, "speciality");
            return (Criteria) this;
        }

        public Criteria andSpecialityIn(List<String> values) {
            addCriterion("speciality in", values, "speciality");
            return (Criteria) this;
        }

        public Criteria andSpecialityNotIn(List<String> values) {
            addCriterion("speciality not in", values, "speciality");
            return (Criteria) this;
        }

        public Criteria andSpecialityBetween(String value1, String value2) {
            addCriterion("speciality between", value1, value2, "speciality");
            return (Criteria) this;
        }

        public Criteria andSpecialityNotBetween(String value1, String value2) {
            addCriterion("speciality not between", value1, value2, "speciality");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("email is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("email is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("email =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("email <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("email >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("email >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("email <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("email <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("email like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("email not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("email in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("email not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("email between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("email not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andHobbyIsNull() {
            addCriterion("hobby is null");
            return (Criteria) this;
        }

        public Criteria andHobbyIsNotNull() {
            addCriterion("hobby is not null");
            return (Criteria) this;
        }

        public Criteria andHobbyEqualTo(String value) {
            addCriterion("hobby =", value, "hobby");
            return (Criteria) this;
        }

        public Criteria andHobbyNotEqualTo(String value) {
            addCriterion("hobby <>", value, "hobby");
            return (Criteria) this;
        }

        public Criteria andHobbyGreaterThan(String value) {
            addCriterion("hobby >", value, "hobby");
            return (Criteria) this;
        }

        public Criteria andHobbyGreaterThanOrEqualTo(String value) {
            addCriterion("hobby >=", value, "hobby");
            return (Criteria) this;
        }

        public Criteria andHobbyLessThan(String value) {
            addCriterion("hobby <", value, "hobby");
            return (Criteria) this;
        }

        public Criteria andHobbyLessThanOrEqualTo(String value) {
            addCriterion("hobby <=", value, "hobby");
            return (Criteria) this;
        }

        public Criteria andHobbyLike(String value) {
            addCriterion("hobby like", value, "hobby");
            return (Criteria) this;
        }

        public Criteria andHobbyNotLike(String value) {
            addCriterion("hobby not like", value, "hobby");
            return (Criteria) this;
        }

        public Criteria andHobbyIn(List<String> values) {
            addCriterion("hobby in", values, "hobby");
            return (Criteria) this;
        }

        public Criteria andHobbyNotIn(List<String> values) {
            addCriterion("hobby not in", values, "hobby");
            return (Criteria) this;
        }

        public Criteria andHobbyBetween(String value1, String value2) {
            addCriterion("hobby between", value1, value2, "hobby");
            return (Criteria) this;
        }

        public Criteria andHobbyNotBetween(String value1, String value2) {
            addCriterion("hobby not between", value1, value2, "hobby");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andPostalcodeIsNull() {
            addCriterion("postalCode is null");
            return (Criteria) this;
        }

        public Criteria andPostalcodeIsNotNull() {
            addCriterion("postalCode is not null");
            return (Criteria) this;
        }

        public Criteria andPostalcodeEqualTo(String value) {
            addCriterion("postalCode =", value, "postalcode");
            return (Criteria) this;
        }

        public Criteria andPostalcodeNotEqualTo(String value) {
            addCriterion("postalCode <>", value, "postalcode");
            return (Criteria) this;
        }

        public Criteria andPostalcodeGreaterThan(String value) {
            addCriterion("postalCode >", value, "postalcode");
            return (Criteria) this;
        }

        public Criteria andPostalcodeGreaterThanOrEqualTo(String value) {
            addCriterion("postalCode >=", value, "postalcode");
            return (Criteria) this;
        }

        public Criteria andPostalcodeLessThan(String value) {
            addCriterion("postalCode <", value, "postalcode");
            return (Criteria) this;
        }

        public Criteria andPostalcodeLessThanOrEqualTo(String value) {
            addCriterion("postalCode <=", value, "postalcode");
            return (Criteria) this;
        }

        public Criteria andPostalcodeLike(String value) {
            addCriterion("postalCode like", value, "postalcode");
            return (Criteria) this;
        }

        public Criteria andPostalcodeNotLike(String value) {
            addCriterion("postalCode not like", value, "postalcode");
            return (Criteria) this;
        }

        public Criteria andPostalcodeIn(List<String> values) {
            addCriterion("postalCode in", values, "postalcode");
            return (Criteria) this;
        }

        public Criteria andPostalcodeNotIn(List<String> values) {
            addCriterion("postalCode not in", values, "postalcode");
            return (Criteria) this;
        }

        public Criteria andPostalcodeBetween(String value1, String value2) {
            addCriterion("postalCode between", value1, value2, "postalcode");
            return (Criteria) this;
        }

        public Criteria andPostalcodeNotBetween(String value1, String value2) {
            addCriterion("postalCode not between", value1, value2, "postalcode");
            return (Criteria) this;
        }

        public Criteria andRecruitmentwayIsNull() {
            addCriterion("recruitmentWay is null");
            return (Criteria) this;
        }

        public Criteria andRecruitmentwayIsNotNull() {
            addCriterion("recruitmentWay is not null");
            return (Criteria) this;
        }

        public Criteria andRecruitmentwayEqualTo(String value) {
            addCriterion("recruitmentWay =", value, "recruitmentway");
            return (Criteria) this;
        }

        public Criteria andRecruitmentwayNotEqualTo(String value) {
            addCriterion("recruitmentWay <>", value, "recruitmentway");
            return (Criteria) this;
        }

        public Criteria andRecruitmentwayGreaterThan(String value) {
            addCriterion("recruitmentWay >", value, "recruitmentway");
            return (Criteria) this;
        }

        public Criteria andRecruitmentwayGreaterThanOrEqualTo(String value) {
            addCriterion("recruitmentWay >=", value, "recruitmentway");
            return (Criteria) this;
        }

        public Criteria andRecruitmentwayLessThan(String value) {
            addCriterion("recruitmentWay <", value, "recruitmentway");
            return (Criteria) this;
        }

        public Criteria andRecruitmentwayLessThanOrEqualTo(String value) {
            addCriterion("recruitmentWay <=", value, "recruitmentway");
            return (Criteria) this;
        }

        public Criteria andRecruitmentwayLike(String value) {
            addCriterion("recruitmentWay like", value, "recruitmentway");
            return (Criteria) this;
        }

        public Criteria andRecruitmentwayNotLike(String value) {
            addCriterion("recruitmentWay not like", value, "recruitmentway");
            return (Criteria) this;
        }

        public Criteria andRecruitmentwayIn(List<String> values) {
            addCriterion("recruitmentWay in", values, "recruitmentway");
            return (Criteria) this;
        }

        public Criteria andRecruitmentwayNotIn(List<String> values) {
            addCriterion("recruitmentWay not in", values, "recruitmentway");
            return (Criteria) this;
        }

        public Criteria andRecruitmentwayBetween(String value1, String value2) {
            addCriterion("recruitmentWay between", value1, value2, "recruitmentway");
            return (Criteria) this;
        }

        public Criteria andRecruitmentwayNotBetween(String value1, String value2) {
            addCriterion("recruitmentWay not between", value1, value2, "recruitmentway");
            return (Criteria) this;
        }

        public Criteria andReferreridIsNull() {
            addCriterion("referrerID is null");
            return (Criteria) this;
        }

        public Criteria andReferreridIsNotNull() {
            addCriterion("referrerID is not null");
            return (Criteria) this;
        }

        public Criteria andReferreridEqualTo(String value) {
            addCriterion("referrerID =", value, "referrerid");
            return (Criteria) this;
        }

        public Criteria andReferreridNotEqualTo(String value) {
            addCriterion("referrerID <>", value, "referrerid");
            return (Criteria) this;
        }

        public Criteria andReferreridGreaterThan(String value) {
            addCriterion("referrerID >", value, "referrerid");
            return (Criteria) this;
        }

        public Criteria andReferreridGreaterThanOrEqualTo(String value) {
            addCriterion("referrerID >=", value, "referrerid");
            return (Criteria) this;
        }

        public Criteria andReferreridLessThan(String value) {
            addCriterion("referrerID <", value, "referrerid");
            return (Criteria) this;
        }

        public Criteria andReferreridLessThanOrEqualTo(String value) {
            addCriterion("referrerID <=", value, "referrerid");
            return (Criteria) this;
        }

        public Criteria andReferreridLike(String value) {
            addCriterion("referrerID like", value, "referrerid");
            return (Criteria) this;
        }

        public Criteria andReferreridNotLike(String value) {
            addCriterion("referrerID not like", value, "referrerid");
            return (Criteria) this;
        }

        public Criteria andReferreridIn(List<String> values) {
            addCriterion("referrerID in", values, "referrerid");
            return (Criteria) this;
        }

        public Criteria andReferreridNotIn(List<String> values) {
            addCriterion("referrerID not in", values, "referrerid");
            return (Criteria) this;
        }

        public Criteria andReferreridBetween(String value1, String value2) {
            addCriterion("referrerID between", value1, value2, "referrerid");
            return (Criteria) this;
        }

        public Criteria andReferreridNotBetween(String value1, String value2) {
            addCriterion("referrerID not between", value1, value2, "referrerid");
            return (Criteria) this;
        }

        public Criteria andSocialrelationshipIsNull() {
            addCriterion("socialRelationship is null");
            return (Criteria) this;
        }

        public Criteria andSocialrelationshipIsNotNull() {
            addCriterion("socialRelationship is not null");
            return (Criteria) this;
        }

        public Criteria andSocialrelationshipEqualTo(String value) {
            addCriterion("socialRelationship =", value, "socialrelationship");
            return (Criteria) this;
        }

        public Criteria andSocialrelationshipNotEqualTo(String value) {
            addCriterion("socialRelationship <>", value, "socialrelationship");
            return (Criteria) this;
        }

        public Criteria andSocialrelationshipGreaterThan(String value) {
            addCriterion("socialRelationship >", value, "socialrelationship");
            return (Criteria) this;
        }

        public Criteria andSocialrelationshipGreaterThanOrEqualTo(String value) {
            addCriterion("socialRelationship >=", value, "socialrelationship");
            return (Criteria) this;
        }

        public Criteria andSocialrelationshipLessThan(String value) {
            addCriterion("socialRelationship <", value, "socialrelationship");
            return (Criteria) this;
        }

        public Criteria andSocialrelationshipLessThanOrEqualTo(String value) {
            addCriterion("socialRelationship <=", value, "socialrelationship");
            return (Criteria) this;
        }

        public Criteria andSocialrelationshipLike(String value) {
            addCriterion("socialRelationship like", value, "socialrelationship");
            return (Criteria) this;
        }

        public Criteria andSocialrelationshipNotLike(String value) {
            addCriterion("socialRelationship not like", value, "socialrelationship");
            return (Criteria) this;
        }

        public Criteria andSocialrelationshipIn(List<String> values) {
            addCriterion("socialRelationship in", values, "socialrelationship");
            return (Criteria) this;
        }

        public Criteria andSocialrelationshipNotIn(List<String> values) {
            addCriterion("socialRelationship not in", values, "socialrelationship");
            return (Criteria) this;
        }

        public Criteria andSocialrelationshipBetween(String value1, String value2) {
            addCriterion("socialRelationship between", value1, value2, "socialrelationship");
            return (Criteria) this;
        }

        public Criteria andSocialrelationshipNotBetween(String value1, String value2) {
            addCriterion("socialRelationship not between", value1, value2, "socialrelationship");
            return (Criteria) this;
        }

        public Criteria andWorkexperienceIsNull() {
            addCriterion("workExperience is null");
            return (Criteria) this;
        }

        public Criteria andWorkexperienceIsNotNull() {
            addCriterion("workExperience is not null");
            return (Criteria) this;
        }

        public Criteria andWorkexperienceEqualTo(String value) {
            addCriterion("workExperience =", value, "workexperience");
            return (Criteria) this;
        }

        public Criteria andWorkexperienceNotEqualTo(String value) {
            addCriterion("workExperience <>", value, "workexperience");
            return (Criteria) this;
        }

        public Criteria andWorkexperienceGreaterThan(String value) {
            addCriterion("workExperience >", value, "workexperience");
            return (Criteria) this;
        }

        public Criteria andWorkexperienceGreaterThanOrEqualTo(String value) {
            addCriterion("workExperience >=", value, "workexperience");
            return (Criteria) this;
        }

        public Criteria andWorkexperienceLessThan(String value) {
            addCriterion("workExperience <", value, "workexperience");
            return (Criteria) this;
        }

        public Criteria andWorkexperienceLessThanOrEqualTo(String value) {
            addCriterion("workExperience <=", value, "workexperience");
            return (Criteria) this;
        }

        public Criteria andWorkexperienceLike(String value) {
            addCriterion("workExperience like", value, "workexperience");
            return (Criteria) this;
        }

        public Criteria andWorkexperienceNotLike(String value) {
            addCriterion("workExperience not like", value, "workexperience");
            return (Criteria) this;
        }

        public Criteria andWorkexperienceIn(List<String> values) {
            addCriterion("workExperience in", values, "workexperience");
            return (Criteria) this;
        }

        public Criteria andWorkexperienceNotIn(List<String> values) {
            addCriterion("workExperience not in", values, "workexperience");
            return (Criteria) this;
        }

        public Criteria andWorkexperienceBetween(String value1, String value2) {
            addCriterion("workExperience between", value1, value2, "workexperience");
            return (Criteria) this;
        }

        public Criteria andWorkexperienceNotBetween(String value1, String value2) {
            addCriterion("workExperience not between", value1, value2, "workexperience");
            return (Criteria) this;
        }

        public Criteria andLearningexperienceIsNull() {
            addCriterion("learningExperience is null");
            return (Criteria) this;
        }

        public Criteria andLearningexperienceIsNotNull() {
            addCriterion("learningExperience is not null");
            return (Criteria) this;
        }

        public Criteria andLearningexperienceEqualTo(String value) {
            addCriterion("learningExperience =", value, "learningexperience");
            return (Criteria) this;
        }

        public Criteria andLearningexperienceNotEqualTo(String value) {
            addCriterion("learningExperience <>", value, "learningexperience");
            return (Criteria) this;
        }

        public Criteria andLearningexperienceGreaterThan(String value) {
            addCriterion("learningExperience >", value, "learningexperience");
            return (Criteria) this;
        }

        public Criteria andLearningexperienceGreaterThanOrEqualTo(String value) {
            addCriterion("learningExperience >=", value, "learningexperience");
            return (Criteria) this;
        }

        public Criteria andLearningexperienceLessThan(String value) {
            addCriterion("learningExperience <", value, "learningexperience");
            return (Criteria) this;
        }

        public Criteria andLearningexperienceLessThanOrEqualTo(String value) {
            addCriterion("learningExperience <=", value, "learningexperience");
            return (Criteria) this;
        }

        public Criteria andLearningexperienceLike(String value) {
            addCriterion("learningExperience like", value, "learningexperience");
            return (Criteria) this;
        }

        public Criteria andLearningexperienceNotLike(String value) {
            addCriterion("learningExperience not like", value, "learningexperience");
            return (Criteria) this;
        }

        public Criteria andLearningexperienceIn(List<String> values) {
            addCriterion("learningExperience in", values, "learningexperience");
            return (Criteria) this;
        }

        public Criteria andLearningexperienceNotIn(List<String> values) {
            addCriterion("learningExperience not in", values, "learningexperience");
            return (Criteria) this;
        }

        public Criteria andLearningexperienceBetween(String value1, String value2) {
            addCriterion("learningExperience between", value1, value2, "learningexperience");
            return (Criteria) this;
        }

        public Criteria andLearningexperienceNotBetween(String value1, String value2) {
            addCriterion("learningExperience not between", value1, value2, "learningexperience");
            return (Criteria) this;
        }

        public Criteria andRemarksIsNull() {
            addCriterion("remarks is null");
            return (Criteria) this;
        }

        public Criteria andRemarksIsNotNull() {
            addCriterion("remarks is not null");
            return (Criteria) this;
        }

        public Criteria andRemarksEqualTo(String value) {
            addCriterion("remarks =", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotEqualTo(String value) {
            addCriterion("remarks <>", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksGreaterThan(String value) {
            addCriterion("remarks >", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksGreaterThanOrEqualTo(String value) {
            addCriterion("remarks >=", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLessThan(String value) {
            addCriterion("remarks <", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLessThanOrEqualTo(String value) {
            addCriterion("remarks <=", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLike(String value) {
            addCriterion("remarks like", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotLike(String value) {
            addCriterion("remarks not like", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksIn(List<String> values) {
            addCriterion("remarks in", values, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotIn(List<String> values) {
            addCriterion("remarks not in", values, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksBetween(String value1, String value2) {
            addCriterion("remarks between", value1, value2, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotBetween(String value1, String value2) {
            addCriterion("remarks not between", value1, value2, "remarks");
            return (Criteria) this;
        }

        public Criteria andDateofentryIsNull() {
            addCriterion("dateOfEntry is null");
            return (Criteria) this;
        }

        public Criteria andDateofentryIsNotNull() {
            addCriterion("dateOfEntry is not null");
            return (Criteria) this;
        }

        public Criteria andDateofentryEqualTo(String value) {
            addCriterion("dateOfEntry =", value, "dateofentry");
            return (Criteria) this;
        }

        public Criteria andDateofentryNotEqualTo(String value) {
            addCriterion("dateOfEntry <>", value, "dateofentry");
            return (Criteria) this;
        }

        public Criteria andDateofentryGreaterThan(String value) {
            addCriterion("dateOfEntry >", value, "dateofentry");
            return (Criteria) this;
        }

        public Criteria andDateofentryGreaterThanOrEqualTo(String value) {
            addCriterion("dateOfEntry >=", value, "dateofentry");
            return (Criteria) this;
        }

        public Criteria andDateofentryLessThan(String value) {
            addCriterion("dateOfEntry <", value, "dateofentry");
            return (Criteria) this;
        }

        public Criteria andDateofentryLessThanOrEqualTo(String value) {
            addCriterion("dateOfEntry <=", value, "dateofentry");
            return (Criteria) this;
        }

        public Criteria andDateofentryLike(String value) {
            addCriterion("dateOfEntry like", value, "dateofentry");
            return (Criteria) this;
        }

        public Criteria andDateofentryNotLike(String value) {
            addCriterion("dateOfEntry not like", value, "dateofentry");
            return (Criteria) this;
        }

        public Criteria andDateofentryIn(List<String> values) {
            addCriterion("dateOfEntry in", values, "dateofentry");
            return (Criteria) this;
        }

        public Criteria andDateofentryNotIn(List<String> values) {
            addCriterion("dateOfEntry not in", values, "dateofentry");
            return (Criteria) this;
        }

        public Criteria andDateofentryBetween(String value1, String value2) {
            addCriterion("dateOfEntry between", value1, value2, "dateofentry");
            return (Criteria) this;
        }

        public Criteria andDateofentryNotBetween(String value1, String value2) {
            addCriterion("dateOfEntry not between", value1, value2, "dateofentry");
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