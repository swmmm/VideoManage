package pers.swmmm.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class VideoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public VideoExample() {
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

        public Criteria andVideoIdIsNull() {
            addCriterion("video_id is null");
            return (Criteria) this;
        }

        public Criteria andVideoIdIsNotNull() {
            addCriterion("video_id is not null");
            return (Criteria) this;
        }

        public Criteria andVideoIdEqualTo(Integer value) {
            addCriterion("video_id =", value, "videoId");
            return (Criteria) this;
        }

        public Criteria andVideoIdNotEqualTo(Integer value) {
            addCriterion("video_id <>", value, "videoId");
            return (Criteria) this;
        }

        public Criteria andVideoIdGreaterThan(Integer value) {
            addCriterion("video_id >", value, "videoId");
            return (Criteria) this;
        }

        public Criteria andVideoIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("video_id >=", value, "videoId");
            return (Criteria) this;
        }

        public Criteria andVideoIdLessThan(Integer value) {
            addCriterion("video_id <", value, "videoId");
            return (Criteria) this;
        }

        public Criteria andVideoIdLessThanOrEqualTo(Integer value) {
            addCriterion("video_id <=", value, "videoId");
            return (Criteria) this;
        }

        public Criteria andVideoIdIn(List<Integer> values) {
            addCriterion("video_id in", values, "videoId");
            return (Criteria) this;
        }

        public Criteria andVideoIdNotIn(List<Integer> values) {
            addCriterion("video_id not in", values, "videoId");
            return (Criteria) this;
        }

        public Criteria andVideoIdBetween(Integer value1, Integer value2) {
            addCriterion("video_id between", value1, value2, "videoId");
            return (Criteria) this;
        }

        public Criteria andVideoIdNotBetween(Integer value1, Integer value2) {
            addCriterion("video_id not between", value1, value2, "videoId");
            return (Criteria) this;
        }

        public Criteria andVideoNameIsNull() {
            addCriterion("video_name is null");
            return (Criteria) this;
        }

        public Criteria andVideoNameIsNotNull() {
            addCriterion("video_name is not null");
            return (Criteria) this;
        }

        public Criteria andVideoNameEqualTo(String value) {
            addCriterion("video_name =", value, "videoName");
            return (Criteria) this;
        }

        public Criteria andVideoNameNotEqualTo(String value) {
            addCriterion("video_name <>", value, "videoName");
            return (Criteria) this;
        }

        public Criteria andVideoNameGreaterThan(String value) {
            addCriterion("video_name >", value, "videoName");
            return (Criteria) this;
        }

        public Criteria andVideoNameGreaterThanOrEqualTo(String value) {
            addCriterion("video_name >=", value, "videoName");
            return (Criteria) this;
        }

        public Criteria andVideoNameLessThan(String value) {
            addCriterion("video_name <", value, "videoName");
            return (Criteria) this;
        }

        public Criteria andVideoNameLessThanOrEqualTo(String value) {
            addCriterion("video_name <=", value, "videoName");
            return (Criteria) this;
        }

        public Criteria andVideoNameLike(String value) {
            addCriterion("video_name like", value, "videoName");
            return (Criteria) this;
        }

        public Criteria andVideoNameNotLike(String value) {
            addCriterion("video_name not like", value, "videoName");
            return (Criteria) this;
        }

        public Criteria andVideoNameIn(List<String> values) {
            addCriterion("video_name in", values, "videoName");
            return (Criteria) this;
        }

        public Criteria andVideoNameNotIn(List<String> values) {
            addCriterion("video_name not in", values, "videoName");
            return (Criteria) this;
        }

        public Criteria andVideoNameBetween(String value1, String value2) {
            addCriterion("video_name between", value1, value2, "videoName");
            return (Criteria) this;
        }

        public Criteria andVideoNameNotBetween(String value1, String value2) {
            addCriterion("video_name not between", value1, value2, "videoName");
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

        public Criteria andLanguageIsNull() {
            addCriterion("language is null");
            return (Criteria) this;
        }

        public Criteria andLanguageIsNotNull() {
            addCriterion("language is not null");
            return (Criteria) this;
        }

        public Criteria andLanguageEqualTo(String value) {
            addCriterion("language =", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageNotEqualTo(String value) {
            addCriterion("language <>", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageGreaterThan(String value) {
            addCriterion("language >", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageGreaterThanOrEqualTo(String value) {
            addCriterion("language >=", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageLessThan(String value) {
            addCriterion("language <", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageLessThanOrEqualTo(String value) {
            addCriterion("language <=", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageLike(String value) {
            addCriterion("language like", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageNotLike(String value) {
            addCriterion("language not like", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageIn(List<String> values) {
            addCriterion("language in", values, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageNotIn(List<String> values) {
            addCriterion("language not in", values, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageBetween(String value1, String value2) {
            addCriterion("language between", value1, value2, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageNotBetween(String value1, String value2) {
            addCriterion("language not between", value1, value2, "language");
            return (Criteria) this;
        }

        public Criteria andShowdateIsNull() {
            addCriterion("showdate is null");
            return (Criteria) this;
        }

        public Criteria andShowdateIsNotNull() {
            addCriterion("showdate is not null");
            return (Criteria) this;
        }

        public Criteria andShowdateEqualTo(Date value) {
            addCriterionForJDBCDate("showdate =", value, "showdate");
            return (Criteria) this;
        }

        public Criteria andShowdateNotEqualTo(Date value) {
            addCriterionForJDBCDate("showdate <>", value, "showdate");
            return (Criteria) this;
        }

        public Criteria andShowdateGreaterThan(Date value) {
            addCriterionForJDBCDate("showdate >", value, "showdate");
            return (Criteria) this;
        }

        public Criteria andShowdateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("showdate >=", value, "showdate");
            return (Criteria) this;
        }

        public Criteria andShowdateLessThan(Date value) {
            addCriterionForJDBCDate("showdate <", value, "showdate");
            return (Criteria) this;
        }

        public Criteria andShowdateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("showdate <=", value, "showdate");
            return (Criteria) this;
        }

        public Criteria andShowdateIn(List<Date> values) {
            addCriterionForJDBCDate("showdate in", values, "showdate");
            return (Criteria) this;
        }

        public Criteria andShowdateNotIn(List<Date> values) {
            addCriterionForJDBCDate("showdate not in", values, "showdate");
            return (Criteria) this;
        }

        public Criteria andShowdateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("showdate between", value1, value2, "showdate");
            return (Criteria) this;
        }

        public Criteria andShowdateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("showdate not between", value1, value2, "showdate");
            return (Criteria) this;
        }

        public Criteria andTvstationIsNull() {
            addCriterion("TVstation is null");
            return (Criteria) this;
        }

        public Criteria andTvstationIsNotNull() {
            addCriterion("TVstation is not null");
            return (Criteria) this;
        }

        public Criteria andTvstationEqualTo(String value) {
            addCriterion("TVstation =", value, "tvstation");
            return (Criteria) this;
        }

        public Criteria andTvstationNotEqualTo(String value) {
            addCriterion("TVstation <>", value, "tvstation");
            return (Criteria) this;
        }

        public Criteria andTvstationGreaterThan(String value) {
            addCriterion("TVstation >", value, "tvstation");
            return (Criteria) this;
        }

        public Criteria andTvstationGreaterThanOrEqualTo(String value) {
            addCriterion("TVstation >=", value, "tvstation");
            return (Criteria) this;
        }

        public Criteria andTvstationLessThan(String value) {
            addCriterion("TVstation <", value, "tvstation");
            return (Criteria) this;
        }

        public Criteria andTvstationLessThanOrEqualTo(String value) {
            addCriterion("TVstation <=", value, "tvstation");
            return (Criteria) this;
        }

        public Criteria andTvstationLike(String value) {
            addCriterion("TVstation like", value, "tvstation");
            return (Criteria) this;
        }

        public Criteria andTvstationNotLike(String value) {
            addCriterion("TVstation not like", value, "tvstation");
            return (Criteria) this;
        }

        public Criteria andTvstationIn(List<String> values) {
            addCriterion("TVstation in", values, "tvstation");
            return (Criteria) this;
        }

        public Criteria andTvstationNotIn(List<String> values) {
            addCriterion("TVstation not in", values, "tvstation");
            return (Criteria) this;
        }

        public Criteria andTvstationBetween(String value1, String value2) {
            addCriterion("TVstation between", value1, value2, "tvstation");
            return (Criteria) this;
        }

        public Criteria andTvstationNotBetween(String value1, String value2) {
            addCriterion("TVstation not between", value1, value2, "tvstation");
            return (Criteria) this;
        }

        public Criteria andCategoryIsNull() {
            addCriterion("category is null");
            return (Criteria) this;
        }

        public Criteria andCategoryIsNotNull() {
            addCriterion("category is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryEqualTo(String value) {
            addCriterion("category =", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotEqualTo(String value) {
            addCriterion("category <>", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryGreaterThan(String value) {
            addCriterion("category >", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryGreaterThanOrEqualTo(String value) {
            addCriterion("category >=", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryLessThan(String value) {
            addCriterion("category <", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryLessThanOrEqualTo(String value) {
            addCriterion("category <=", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryLike(String value) {
            addCriterion("category like", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotLike(String value) {
            addCriterion("category not like", value, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryIn(List<String> values) {
            addCriterion("category in", values, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotIn(List<String> values) {
            addCriterion("category not in", values, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryBetween(String value1, String value2) {
            addCriterion("category between", value1, value2, "category");
            return (Criteria) this;
        }

        public Criteria andCategoryNotBetween(String value1, String value2) {
            addCriterion("category not between", value1, value2, "category");
            return (Criteria) this;
        }

        public Criteria andAliasIsNull() {
            addCriterion("alias is null");
            return (Criteria) this;
        }

        public Criteria andAliasIsNotNull() {
            addCriterion("alias is not null");
            return (Criteria) this;
        }

        public Criteria andAliasEqualTo(String value) {
            addCriterion("alias =", value, "alias");
            return (Criteria) this;
        }

        public Criteria andAliasNotEqualTo(String value) {
            addCriterion("alias <>", value, "alias");
            return (Criteria) this;
        }

        public Criteria andAliasGreaterThan(String value) {
            addCriterion("alias >", value, "alias");
            return (Criteria) this;
        }

        public Criteria andAliasGreaterThanOrEqualTo(String value) {
            addCriterion("alias >=", value, "alias");
            return (Criteria) this;
        }

        public Criteria andAliasLessThan(String value) {
            addCriterion("alias <", value, "alias");
            return (Criteria) this;
        }

        public Criteria andAliasLessThanOrEqualTo(String value) {
            addCriterion("alias <=", value, "alias");
            return (Criteria) this;
        }

        public Criteria andAliasLike(String value) {
            addCriterion("alias like", value, "alias");
            return (Criteria) this;
        }

        public Criteria andAliasNotLike(String value) {
            addCriterion("alias not like", value, "alias");
            return (Criteria) this;
        }

        public Criteria andAliasIn(List<String> values) {
            addCriterion("alias in", values, "alias");
            return (Criteria) this;
        }

        public Criteria andAliasNotIn(List<String> values) {
            addCriterion("alias not in", values, "alias");
            return (Criteria) this;
        }

        public Criteria andAliasBetween(String value1, String value2) {
            addCriterion("alias between", value1, value2, "alias");
            return (Criteria) this;
        }

        public Criteria andAliasNotBetween(String value1, String value2) {
            addCriterion("alias not between", value1, value2, "alias");
            return (Criteria) this;
        }

        public Criteria andScreenwriterIsNull() {
            addCriterion("screenwriter is null");
            return (Criteria) this;
        }

        public Criteria andScreenwriterIsNotNull() {
            addCriterion("screenwriter is not null");
            return (Criteria) this;
        }

        public Criteria andScreenwriterEqualTo(String value) {
            addCriterion("screenwriter =", value, "screenwriter");
            return (Criteria) this;
        }

        public Criteria andScreenwriterNotEqualTo(String value) {
            addCriterion("screenwriter <>", value, "screenwriter");
            return (Criteria) this;
        }

        public Criteria andScreenwriterGreaterThan(String value) {
            addCriterion("screenwriter >", value, "screenwriter");
            return (Criteria) this;
        }

        public Criteria andScreenwriterGreaterThanOrEqualTo(String value) {
            addCriterion("screenwriter >=", value, "screenwriter");
            return (Criteria) this;
        }

        public Criteria andScreenwriterLessThan(String value) {
            addCriterion("screenwriter <", value, "screenwriter");
            return (Criteria) this;
        }

        public Criteria andScreenwriterLessThanOrEqualTo(String value) {
            addCriterion("screenwriter <=", value, "screenwriter");
            return (Criteria) this;
        }

        public Criteria andScreenwriterLike(String value) {
            addCriterion("screenwriter like", value, "screenwriter");
            return (Criteria) this;
        }

        public Criteria andScreenwriterNotLike(String value) {
            addCriterion("screenwriter not like", value, "screenwriter");
            return (Criteria) this;
        }

        public Criteria andScreenwriterIn(List<String> values) {
            addCriterion("screenwriter in", values, "screenwriter");
            return (Criteria) this;
        }

        public Criteria andScreenwriterNotIn(List<String> values) {
            addCriterion("screenwriter not in", values, "screenwriter");
            return (Criteria) this;
        }

        public Criteria andScreenwriterBetween(String value1, String value2) {
            addCriterion("screenwriter between", value1, value2, "screenwriter");
            return (Criteria) this;
        }

        public Criteria andScreenwriterNotBetween(String value1, String value2) {
            addCriterion("screenwriter not between", value1, value2, "screenwriter");
            return (Criteria) this;
        }

        public Criteria andDirectorIsNull() {
            addCriterion("director is null");
            return (Criteria) this;
        }

        public Criteria andDirectorIsNotNull() {
            addCriterion("director is not null");
            return (Criteria) this;
        }

        public Criteria andDirectorEqualTo(String value) {
            addCriterion("director =", value, "director");
            return (Criteria) this;
        }

        public Criteria andDirectorNotEqualTo(String value) {
            addCriterion("director <>", value, "director");
            return (Criteria) this;
        }

        public Criteria andDirectorGreaterThan(String value) {
            addCriterion("director >", value, "director");
            return (Criteria) this;
        }

        public Criteria andDirectorGreaterThanOrEqualTo(String value) {
            addCriterion("director >=", value, "director");
            return (Criteria) this;
        }

        public Criteria andDirectorLessThan(String value) {
            addCriterion("director <", value, "director");
            return (Criteria) this;
        }

        public Criteria andDirectorLessThanOrEqualTo(String value) {
            addCriterion("director <=", value, "director");
            return (Criteria) this;
        }

        public Criteria andDirectorLike(String value) {
            addCriterion("director like", value, "director");
            return (Criteria) this;
        }

        public Criteria andDirectorNotLike(String value) {
            addCriterion("director not like", value, "director");
            return (Criteria) this;
        }

        public Criteria andDirectorIn(List<String> values) {
            addCriterion("director in", values, "director");
            return (Criteria) this;
        }

        public Criteria andDirectorNotIn(List<String> values) {
            addCriterion("director not in", values, "director");
            return (Criteria) this;
        }

        public Criteria andDirectorBetween(String value1, String value2) {
            addCriterion("director between", value1, value2, "director");
            return (Criteria) this;
        }

        public Criteria andDirectorNotBetween(String value1, String value2) {
            addCriterion("director not between", value1, value2, "director");
            return (Criteria) this;
        }

        public Criteria andLeadactorIsNull() {
            addCriterion("leadactor is null");
            return (Criteria) this;
        }

        public Criteria andLeadactorIsNotNull() {
            addCriterion("leadactor is not null");
            return (Criteria) this;
        }

        public Criteria andLeadactorEqualTo(String value) {
            addCriterion("leadactor =", value, "leadactor");
            return (Criteria) this;
        }

        public Criteria andLeadactorNotEqualTo(String value) {
            addCriterion("leadactor <>", value, "leadactor");
            return (Criteria) this;
        }

        public Criteria andLeadactorGreaterThan(String value) {
            addCriterion("leadactor >", value, "leadactor");
            return (Criteria) this;
        }

        public Criteria andLeadactorGreaterThanOrEqualTo(String value) {
            addCriterion("leadactor >=", value, "leadactor");
            return (Criteria) this;
        }

        public Criteria andLeadactorLessThan(String value) {
            addCriterion("leadactor <", value, "leadactor");
            return (Criteria) this;
        }

        public Criteria andLeadactorLessThanOrEqualTo(String value) {
            addCriterion("leadactor <=", value, "leadactor");
            return (Criteria) this;
        }

        public Criteria andLeadactorLike(String value) {
            addCriterion("leadactor like", value, "leadactor");
            return (Criteria) this;
        }

        public Criteria andLeadactorNotLike(String value) {
            addCriterion("leadactor not like", value, "leadactor");
            return (Criteria) this;
        }

        public Criteria andLeadactorIn(List<String> values) {
            addCriterion("leadactor in", values, "leadactor");
            return (Criteria) this;
        }

        public Criteria andLeadactorNotIn(List<String> values) {
            addCriterion("leadactor not in", values, "leadactor");
            return (Criteria) this;
        }

        public Criteria andLeadactorBetween(String value1, String value2) {
            addCriterion("leadactor between", value1, value2, "leadactor");
            return (Criteria) this;
        }

        public Criteria andLeadactorNotBetween(String value1, String value2) {
            addCriterion("leadactor not between", value1, value2, "leadactor");
            return (Criteria) this;
        }

        public Criteria andEpisodesIsNull() {
            addCriterion("episodes is null");
            return (Criteria) this;
        }

        public Criteria andEpisodesIsNotNull() {
            addCriterion("episodes is not null");
            return (Criteria) this;
        }

        public Criteria andEpisodesEqualTo(Short value) {
            addCriterion("episodes =", value, "episodes");
            return (Criteria) this;
        }

        public Criteria andEpisodesNotEqualTo(Short value) {
            addCriterion("episodes <>", value, "episodes");
            return (Criteria) this;
        }

        public Criteria andEpisodesGreaterThan(Short value) {
            addCriterion("episodes >", value, "episodes");
            return (Criteria) this;
        }

        public Criteria andEpisodesGreaterThanOrEqualTo(Short value) {
            addCriterion("episodes >=", value, "episodes");
            return (Criteria) this;
        }

        public Criteria andEpisodesLessThan(Short value) {
            addCriterion("episodes <", value, "episodes");
            return (Criteria) this;
        }

        public Criteria andEpisodesLessThanOrEqualTo(Short value) {
            addCriterion("episodes <=", value, "episodes");
            return (Criteria) this;
        }

        public Criteria andEpisodesIn(List<Short> values) {
            addCriterion("episodes in", values, "episodes");
            return (Criteria) this;
        }

        public Criteria andEpisodesNotIn(List<Short> values) {
            addCriterion("episodes not in", values, "episodes");
            return (Criteria) this;
        }

        public Criteria andEpisodesBetween(Short value1, Short value2) {
            addCriterion("episodes between", value1, value2, "episodes");
            return (Criteria) this;
        }

        public Criteria andEpisodesNotBetween(Short value1, Short value2) {
            addCriterion("episodes not between", value1, value2, "episodes");
            return (Criteria) this;
        }

        public Criteria andStatuIsNull() {
            addCriterion("statu is null");
            return (Criteria) this;
        }

        public Criteria andStatuIsNotNull() {
            addCriterion("statu is not null");
            return (Criteria) this;
        }

        public Criteria andStatuEqualTo(String value) {
            addCriterion("statu =", value, "statu");
            return (Criteria) this;
        }

        public Criteria andStatuNotEqualTo(String value) {
            addCriterion("statu <>", value, "statu");
            return (Criteria) this;
        }

        public Criteria andStatuGreaterThan(String value) {
            addCriterion("statu >", value, "statu");
            return (Criteria) this;
        }

        public Criteria andStatuGreaterThanOrEqualTo(String value) {
            addCriterion("statu >=", value, "statu");
            return (Criteria) this;
        }

        public Criteria andStatuLessThan(String value) {
            addCriterion("statu <", value, "statu");
            return (Criteria) this;
        }

        public Criteria andStatuLessThanOrEqualTo(String value) {
            addCriterion("statu <=", value, "statu");
            return (Criteria) this;
        }

        public Criteria andStatuLike(String value) {
            addCriterion("statu like", value, "statu");
            return (Criteria) this;
        }

        public Criteria andStatuNotLike(String value) {
            addCriterion("statu not like", value, "statu");
            return (Criteria) this;
        }

        public Criteria andStatuIn(List<String> values) {
            addCriterion("statu in", values, "statu");
            return (Criteria) this;
        }

        public Criteria andStatuNotIn(List<String> values) {
            addCriterion("statu not in", values, "statu");
            return (Criteria) this;
        }

        public Criteria andStatuBetween(String value1, String value2) {
            addCriterion("statu between", value1, value2, "statu");
            return (Criteria) this;
        }

        public Criteria andStatuNotBetween(String value1, String value2) {
            addCriterion("statu not between", value1, value2, "statu");
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