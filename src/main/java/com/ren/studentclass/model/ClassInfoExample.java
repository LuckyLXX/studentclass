package com.ren.studentclass.model;

import java.util.ArrayList;
import java.util.List;

public class ClassInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ClassInfoExample() {
        oredCriteria = new ArrayList<>();
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

        public Criteria andCourseIdIsNull() {
            addCriterion("course_id is null");
            return (Criteria) this;
        }

        public Criteria andCourseIdIsNotNull() {
            addCriterion("course_id is not null");
            return (Criteria) this;
        }

        public Criteria andCourseIdEqualTo(Integer value) {
            addCriterion("course_id =", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdNotEqualTo(Integer value) {
            addCriterion("course_id <>", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdGreaterThan(Integer value) {
            addCriterion("course_id >", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("course_id >=", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdLessThan(Integer value) {
            addCriterion("course_id <", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdLessThanOrEqualTo(Integer value) {
            addCriterion("course_id <=", value, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdIn(List<Integer> values) {
            addCriterion("course_id in", values, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdNotIn(List<Integer> values) {
            addCriterion("course_id not in", values, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdBetween(Integer value1, Integer value2) {
            addCriterion("course_id between", value1, value2, "courseId");
            return (Criteria) this;
        }

        public Criteria andCourseIdNotBetween(Integer value1, Integer value2) {
            addCriterion("course_id not between", value1, value2, "courseId");
            return (Criteria) this;
        }

        public Criteria andAllNumIsNull() {
            addCriterion("all_num is null");
            return (Criteria) this;
        }

        public Criteria andAllNumIsNotNull() {
            addCriterion("all_num is not null");
            return (Criteria) this;
        }

        public Criteria andAllNumEqualTo(Integer value) {
            addCriterion("all_num =", value, "allNum");
            return (Criteria) this;
        }

        public Criteria andAllNumNotEqualTo(Integer value) {
            addCriterion("all_num <>", value, "allNum");
            return (Criteria) this;
        }

        public Criteria andAllNumGreaterThan(Integer value) {
            addCriterion("all_num >", value, "allNum");
            return (Criteria) this;
        }

        public Criteria andAllNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("all_num >=", value, "allNum");
            return (Criteria) this;
        }

        public Criteria andAllNumLessThan(Integer value) {
            addCriterion("all_num <", value, "allNum");
            return (Criteria) this;
        }

        public Criteria andAllNumLessThanOrEqualTo(Integer value) {
            addCriterion("all_num <=", value, "allNum");
            return (Criteria) this;
        }

        public Criteria andAllNumIn(List<Integer> values) {
            addCriterion("all_num in", values, "allNum");
            return (Criteria) this;
        }

        public Criteria andAllNumNotIn(List<Integer> values) {
            addCriterion("all_num not in", values, "allNum");
            return (Criteria) this;
        }

        public Criteria andAllNumBetween(Integer value1, Integer value2) {
            addCriterion("all_num between", value1, value2, "allNum");
            return (Criteria) this;
        }

        public Criteria andAllNumNotBetween(Integer value1, Integer value2) {
            addCriterion("all_num not between", value1, value2, "allNum");
            return (Criteria) this;
        }

        public Criteria andTaskNumIsNull() {
            addCriterion("task_num is null");
            return (Criteria) this;
        }

        public Criteria andTaskNumIsNotNull() {
            addCriterion("task_num is not null");
            return (Criteria) this;
        }

        public Criteria andTaskNumEqualTo(Integer value) {
            addCriterion("task_num =", value, "taskNum");
            return (Criteria) this;
        }

        public Criteria andTaskNumNotEqualTo(Integer value) {
            addCriterion("task_num <>", value, "taskNum");
            return (Criteria) this;
        }

        public Criteria andTaskNumGreaterThan(Integer value) {
            addCriterion("task_num >", value, "taskNum");
            return (Criteria) this;
        }

        public Criteria andTaskNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("task_num >=", value, "taskNum");
            return (Criteria) this;
        }

        public Criteria andTaskNumLessThan(Integer value) {
            addCriterion("task_num <", value, "taskNum");
            return (Criteria) this;
        }

        public Criteria andTaskNumLessThanOrEqualTo(Integer value) {
            addCriterion("task_num <=", value, "taskNum");
            return (Criteria) this;
        }

        public Criteria andTaskNumIn(List<Integer> values) {
            addCriterion("task_num in", values, "taskNum");
            return (Criteria) this;
        }

        public Criteria andTaskNumNotIn(List<Integer> values) {
            addCriterion("task_num not in", values, "taskNum");
            return (Criteria) this;
        }

        public Criteria andTaskNumBetween(Integer value1, Integer value2) {
            addCriterion("task_num between", value1, value2, "taskNum");
            return (Criteria) this;
        }

        public Criteria andTaskNumNotBetween(Integer value1, Integer value2) {
            addCriterion("task_num not between", value1, value2, "taskNum");
            return (Criteria) this;
        }

        public Criteria andTestNumIsNull() {
            addCriterion("test_num is null");
            return (Criteria) this;
        }

        public Criteria andTestNumIsNotNull() {
            addCriterion("test_num is not null");
            return (Criteria) this;
        }

        public Criteria andTestNumEqualTo(Integer value) {
            addCriterion("test_num =", value, "testNum");
            return (Criteria) this;
        }

        public Criteria andTestNumNotEqualTo(Integer value) {
            addCriterion("test_num <>", value, "testNum");
            return (Criteria) this;
        }

        public Criteria andTestNumGreaterThan(Integer value) {
            addCriterion("test_num >", value, "testNum");
            return (Criteria) this;
        }

        public Criteria andTestNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("test_num >=", value, "testNum");
            return (Criteria) this;
        }

        public Criteria andTestNumLessThan(Integer value) {
            addCriterion("test_num <", value, "testNum");
            return (Criteria) this;
        }

        public Criteria andTestNumLessThanOrEqualTo(Integer value) {
            addCriterion("test_num <=", value, "testNum");
            return (Criteria) this;
        }

        public Criteria andTestNumIn(List<Integer> values) {
            addCriterion("test_num in", values, "testNum");
            return (Criteria) this;
        }

        public Criteria andTestNumNotIn(List<Integer> values) {
            addCriterion("test_num not in", values, "testNum");
            return (Criteria) this;
        }

        public Criteria andTestNumBetween(Integer value1, Integer value2) {
            addCriterion("test_num between", value1, value2, "testNum");
            return (Criteria) this;
        }

        public Criteria andTestNumNotBetween(Integer value1, Integer value2) {
            addCriterion("test_num not between", value1, value2, "testNum");
            return (Criteria) this;
        }

        public Criteria andStudentNumIsNull() {
            addCriterion("student_num is null");
            return (Criteria) this;
        }

        public Criteria andStudentNumIsNotNull() {
            addCriterion("student_num is not null");
            return (Criteria) this;
        }

        public Criteria andStudentNumEqualTo(Integer value) {
            addCriterion("student_num =", value, "studentNum");
            return (Criteria) this;
        }

        public Criteria andStudentNumNotEqualTo(Integer value) {
            addCriterion("student_num <>", value, "studentNum");
            return (Criteria) this;
        }

        public Criteria andStudentNumGreaterThan(Integer value) {
            addCriterion("student_num >", value, "studentNum");
            return (Criteria) this;
        }

        public Criteria andStudentNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("student_num >=", value, "studentNum");
            return (Criteria) this;
        }

        public Criteria andStudentNumLessThan(Integer value) {
            addCriterion("student_num <", value, "studentNum");
            return (Criteria) this;
        }

        public Criteria andStudentNumLessThanOrEqualTo(Integer value) {
            addCriterion("student_num <=", value, "studentNum");
            return (Criteria) this;
        }

        public Criteria andStudentNumIn(List<Integer> values) {
            addCriterion("student_num in", values, "studentNum");
            return (Criteria) this;
        }

        public Criteria andStudentNumNotIn(List<Integer> values) {
            addCriterion("student_num not in", values, "studentNum");
            return (Criteria) this;
        }

        public Criteria andStudentNumBetween(Integer value1, Integer value2) {
            addCriterion("student_num between", value1, value2, "studentNum");
            return (Criteria) this;
        }

        public Criteria andStudentNumNotBetween(Integer value1, Integer value2) {
            addCriterion("student_num not between", value1, value2, "studentNum");
            return (Criteria) this;
        }

        public Criteria andPvNumIsNull() {
            addCriterion("pv_num is null");
            return (Criteria) this;
        }

        public Criteria andPvNumIsNotNull() {
            addCriterion("pv_num is not null");
            return (Criteria) this;
        }

        public Criteria andPvNumEqualTo(Integer value) {
            addCriterion("pv_num =", value, "pvNum");
            return (Criteria) this;
        }

        public Criteria andPvNumNotEqualTo(Integer value) {
            addCriterion("pv_num <>", value, "pvNum");
            return (Criteria) this;
        }

        public Criteria andPvNumGreaterThan(Integer value) {
            addCriterion("pv_num >", value, "pvNum");
            return (Criteria) this;
        }

        public Criteria andPvNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("pv_num >=", value, "pvNum");
            return (Criteria) this;
        }

        public Criteria andPvNumLessThan(Integer value) {
            addCriterion("pv_num <", value, "pvNum");
            return (Criteria) this;
        }

        public Criteria andPvNumLessThanOrEqualTo(Integer value) {
            addCriterion("pv_num <=", value, "pvNum");
            return (Criteria) this;
        }

        public Criteria andPvNumIn(List<Integer> values) {
            addCriterion("pv_num in", values, "pvNum");
            return (Criteria) this;
        }

        public Criteria andPvNumNotIn(List<Integer> values) {
            addCriterion("pv_num not in", values, "pvNum");
            return (Criteria) this;
        }

        public Criteria andPvNumBetween(Integer value1, Integer value2) {
            addCriterion("pv_num between", value1, value2, "pvNum");
            return (Criteria) this;
        }

        public Criteria andPvNumNotBetween(Integer value1, Integer value2) {
            addCriterion("pv_num not between", value1, value2, "pvNum");
            return (Criteria) this;
        }

        public Criteria andJobFinishIsNull() {
            addCriterion("job_finish is null");
            return (Criteria) this;
        }

        public Criteria andJobFinishIsNotNull() {
            addCriterion("job_finish is not null");
            return (Criteria) this;
        }

        public Criteria andJobFinishEqualTo(Integer value) {
            addCriterion("job_finish =", value, "jobFinish");
            return (Criteria) this;
        }

        public Criteria andJobFinishNotEqualTo(Integer value) {
            addCriterion("job_finish <>", value, "jobFinish");
            return (Criteria) this;
        }

        public Criteria andJobFinishGreaterThan(Integer value) {
            addCriterion("job_finish >", value, "jobFinish");
            return (Criteria) this;
        }

        public Criteria andJobFinishGreaterThanOrEqualTo(Integer value) {
            addCriterion("job_finish >=", value, "jobFinish");
            return (Criteria) this;
        }

        public Criteria andJobFinishLessThan(Integer value) {
            addCriterion("job_finish <", value, "jobFinish");
            return (Criteria) this;
        }

        public Criteria andJobFinishLessThanOrEqualTo(Integer value) {
            addCriterion("job_finish <=", value, "jobFinish");
            return (Criteria) this;
        }

        public Criteria andJobFinishIn(List<Integer> values) {
            addCriterion("job_finish in", values, "jobFinish");
            return (Criteria) this;
        }

        public Criteria andJobFinishNotIn(List<Integer> values) {
            addCriterion("job_finish not in", values, "jobFinish");
            return (Criteria) this;
        }

        public Criteria andJobFinishBetween(Integer value1, Integer value2) {
            addCriterion("job_finish between", value1, value2, "jobFinish");
            return (Criteria) this;
        }

        public Criteria andJobFinishNotBetween(Integer value1, Integer value2) {
            addCriterion("job_finish not between", value1, value2, "jobFinish");
            return (Criteria) this;
        }

        public Criteria andJobGradeIsNull() {
            addCriterion("job_grade is null");
            return (Criteria) this;
        }

        public Criteria andJobGradeIsNotNull() {
            addCriterion("job_grade is not null");
            return (Criteria) this;
        }

        public Criteria andJobGradeEqualTo(Integer value) {
            addCriterion("job_grade =", value, "jobGrade");
            return (Criteria) this;
        }

        public Criteria andJobGradeNotEqualTo(Integer value) {
            addCriterion("job_grade <>", value, "jobGrade");
            return (Criteria) this;
        }

        public Criteria andJobGradeGreaterThan(Integer value) {
            addCriterion("job_grade >", value, "jobGrade");
            return (Criteria) this;
        }

        public Criteria andJobGradeGreaterThanOrEqualTo(Integer value) {
            addCriterion("job_grade >=", value, "jobGrade");
            return (Criteria) this;
        }

        public Criteria andJobGradeLessThan(Integer value) {
            addCriterion("job_grade <", value, "jobGrade");
            return (Criteria) this;
        }

        public Criteria andJobGradeLessThanOrEqualTo(Integer value) {
            addCriterion("job_grade <=", value, "jobGrade");
            return (Criteria) this;
        }

        public Criteria andJobGradeIn(List<Integer> values) {
            addCriterion("job_grade in", values, "jobGrade");
            return (Criteria) this;
        }

        public Criteria andJobGradeNotIn(List<Integer> values) {
            addCriterion("job_grade not in", values, "jobGrade");
            return (Criteria) this;
        }

        public Criteria andJobGradeBetween(Integer value1, Integer value2) {
            addCriterion("job_grade between", value1, value2, "jobGrade");
            return (Criteria) this;
        }

        public Criteria andJobGradeNotBetween(Integer value1, Integer value2) {
            addCriterion("job_grade not between", value1, value2, "jobGrade");
            return (Criteria) this;
        }

        public Criteria andExamIsNull() {
            addCriterion("exam is null");
            return (Criteria) this;
        }

        public Criteria andExamIsNotNull() {
            addCriterion("exam is not null");
            return (Criteria) this;
        }

        public Criteria andExamEqualTo(Integer value) {
            addCriterion("exam =", value, "exam");
            return (Criteria) this;
        }

        public Criteria andExamNotEqualTo(Integer value) {
            addCriterion("exam <>", value, "exam");
            return (Criteria) this;
        }

        public Criteria andExamGreaterThan(Integer value) {
            addCriterion("exam >", value, "exam");
            return (Criteria) this;
        }

        public Criteria andExamGreaterThanOrEqualTo(Integer value) {
            addCriterion("exam >=", value, "exam");
            return (Criteria) this;
        }

        public Criteria andExamLessThan(Integer value) {
            addCriterion("exam <", value, "exam");
            return (Criteria) this;
        }

        public Criteria andExamLessThanOrEqualTo(Integer value) {
            addCriterion("exam <=", value, "exam");
            return (Criteria) this;
        }

        public Criteria andExamIn(List<Integer> values) {
            addCriterion("exam in", values, "exam");
            return (Criteria) this;
        }

        public Criteria andExamNotIn(List<Integer> values) {
            addCriterion("exam not in", values, "exam");
            return (Criteria) this;
        }

        public Criteria andExamBetween(Integer value1, Integer value2) {
            addCriterion("exam between", value1, value2, "exam");
            return (Criteria) this;
        }

        public Criteria andExamNotBetween(Integer value1, Integer value2) {
            addCriterion("exam not between", value1, value2, "exam");
            return (Criteria) this;
        }

        public Criteria andExamFinishIsNull() {
            addCriterion("exam_finish is null");
            return (Criteria) this;
        }

        public Criteria andExamFinishIsNotNull() {
            addCriterion("exam_finish is not null");
            return (Criteria) this;
        }

        public Criteria andExamFinishEqualTo(String value) {
            addCriterion("exam_finish =", value, "examFinish");
            return (Criteria) this;
        }

        public Criteria andExamFinishNotEqualTo(String value) {
            addCriterion("exam_finish <>", value, "examFinish");
            return (Criteria) this;
        }

        public Criteria andExamFinishGreaterThan(String value) {
            addCriterion("exam_finish >", value, "examFinish");
            return (Criteria) this;
        }

        public Criteria andExamFinishGreaterThanOrEqualTo(String value) {
            addCriterion("exam_finish >=", value, "examFinish");
            return (Criteria) this;
        }

        public Criteria andExamFinishLessThan(String value) {
            addCriterion("exam_finish <", value, "examFinish");
            return (Criteria) this;
        }

        public Criteria andExamFinishLessThanOrEqualTo(String value) {
            addCriterion("exam_finish <=", value, "examFinish");
            return (Criteria) this;
        }

        public Criteria andExamFinishLike(String value) {
            addCriterion("exam_finish like", value, "examFinish");
            return (Criteria) this;
        }

        public Criteria andExamFinishNotLike(String value) {
            addCriterion("exam_finish not like", value, "examFinish");
            return (Criteria) this;
        }

        public Criteria andExamFinishIn(List<String> values) {
            addCriterion("exam_finish in", values, "examFinish");
            return (Criteria) this;
        }

        public Criteria andExamFinishNotIn(List<String> values) {
            addCriterion("exam_finish not in", values, "examFinish");
            return (Criteria) this;
        }

        public Criteria andExamFinishBetween(String value1, String value2) {
            addCriterion("exam_finish between", value1, value2, "examFinish");
            return (Criteria) this;
        }

        public Criteria andExamFinishNotBetween(String value1, String value2) {
            addCriterion("exam_finish not between", value1, value2, "examFinish");
            return (Criteria) this;
        }

        public Criteria andExamGradeIsNull() {
            addCriterion("exam_grade is null");
            return (Criteria) this;
        }

        public Criteria andExamGradeIsNotNull() {
            addCriterion("exam_grade is not null");
            return (Criteria) this;
        }

        public Criteria andExamGradeEqualTo(Double value) {
            addCriterion("exam_grade =", value, "examGrade");
            return (Criteria) this;
        }

        public Criteria andExamGradeNotEqualTo(Double value) {
            addCriterion("exam_grade <>", value, "examGrade");
            return (Criteria) this;
        }

        public Criteria andExamGradeGreaterThan(Double value) {
            addCriterion("exam_grade >", value, "examGrade");
            return (Criteria) this;
        }

        public Criteria andExamGradeGreaterThanOrEqualTo(Double value) {
            addCriterion("exam_grade >=", value, "examGrade");
            return (Criteria) this;
        }

        public Criteria andExamGradeLessThan(Double value) {
            addCriterion("exam_grade <", value, "examGrade");
            return (Criteria) this;
        }

        public Criteria andExamGradeLessThanOrEqualTo(Double value) {
            addCriterion("exam_grade <=", value, "examGrade");
            return (Criteria) this;
        }

        public Criteria andExamGradeIn(List<Double> values) {
            addCriterion("exam_grade in", values, "examGrade");
            return (Criteria) this;
        }

        public Criteria andExamGradeNotIn(List<Double> values) {
            addCriterion("exam_grade not in", values, "examGrade");
            return (Criteria) this;
        }

        public Criteria andExamGradeBetween(Double value1, Double value2) {
            addCriterion("exam_grade between", value1, value2, "examGrade");
            return (Criteria) this;
        }

        public Criteria andExamGradeNotBetween(Double value1, Double value2) {
            addCriterion("exam_grade not between", value1, value2, "examGrade");
            return (Criteria) this;
        }

        public Criteria andJobInNumIsNull() {
            addCriterion("job_in_num is null");
            return (Criteria) this;
        }

        public Criteria andJobInNumIsNotNull() {
            addCriterion("job_in_num is not null");
            return (Criteria) this;
        }

        public Criteria andJobInNumEqualTo(Integer value) {
            addCriterion("job_in_num =", value, "jobInNum");
            return (Criteria) this;
        }

        public Criteria andJobInNumNotEqualTo(Integer value) {
            addCriterion("job_in_num <>", value, "jobInNum");
            return (Criteria) this;
        }

        public Criteria andJobInNumGreaterThan(Integer value) {
            addCriterion("job_in_num >", value, "jobInNum");
            return (Criteria) this;
        }

        public Criteria andJobInNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("job_in_num >=", value, "jobInNum");
            return (Criteria) this;
        }

        public Criteria andJobInNumLessThan(Integer value) {
            addCriterion("job_in_num <", value, "jobInNum");
            return (Criteria) this;
        }

        public Criteria andJobInNumLessThanOrEqualTo(Integer value) {
            addCriterion("job_in_num <=", value, "jobInNum");
            return (Criteria) this;
        }

        public Criteria andJobInNumIn(List<Integer> values) {
            addCriterion("job_in_num in", values, "jobInNum");
            return (Criteria) this;
        }

        public Criteria andJobInNumNotIn(List<Integer> values) {
            addCriterion("job_in_num not in", values, "jobInNum");
            return (Criteria) this;
        }

        public Criteria andJobInNumBetween(Integer value1, Integer value2) {
            addCriterion("job_in_num between", value1, value2, "jobInNum");
            return (Criteria) this;
        }

        public Criteria andJobInNumNotBetween(Integer value1, Integer value2) {
            addCriterion("job_in_num not between", value1, value2, "jobInNum");
            return (Criteria) this;
        }

        public Criteria andExamInNumIsNull() {
            addCriterion("exam_in_num is null");
            return (Criteria) this;
        }

        public Criteria andExamInNumIsNotNull() {
            addCriterion("exam_in_num is not null");
            return (Criteria) this;
        }

        public Criteria andExamInNumEqualTo(Integer value) {
            addCriterion("exam_in_num =", value, "examInNum");
            return (Criteria) this;
        }

        public Criteria andExamInNumNotEqualTo(Integer value) {
            addCriterion("exam_in_num <>", value, "examInNum");
            return (Criteria) this;
        }

        public Criteria andExamInNumGreaterThan(Integer value) {
            addCriterion("exam_in_num >", value, "examInNum");
            return (Criteria) this;
        }

        public Criteria andExamInNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("exam_in_num >=", value, "examInNum");
            return (Criteria) this;
        }

        public Criteria andExamInNumLessThan(Integer value) {
            addCriterion("exam_in_num <", value, "examInNum");
            return (Criteria) this;
        }

        public Criteria andExamInNumLessThanOrEqualTo(Integer value) {
            addCriterion("exam_in_num <=", value, "examInNum");
            return (Criteria) this;
        }

        public Criteria andExamInNumIn(List<Integer> values) {
            addCriterion("exam_in_num in", values, "examInNum");
            return (Criteria) this;
        }

        public Criteria andExamInNumNotIn(List<Integer> values) {
            addCriterion("exam_in_num not in", values, "examInNum");
            return (Criteria) this;
        }

        public Criteria andExamInNumBetween(Integer value1, Integer value2) {
            addCriterion("exam_in_num between", value1, value2, "examInNum");
            return (Criteria) this;
        }

        public Criteria andExamInNumNotBetween(Integer value1, Integer value2) {
            addCriterion("exam_in_num not between", value1, value2, "examInNum");
            return (Criteria) this;
        }

        public Criteria andCourseInteractIsNull() {
            addCriterion("course_interact is null");
            return (Criteria) this;
        }

        public Criteria andCourseInteractIsNotNull() {
            addCriterion("course_interact is not null");
            return (Criteria) this;
        }

        public Criteria andCourseInteractEqualTo(Integer value) {
            addCriterion("course_interact =", value, "courseInteract");
            return (Criteria) this;
        }

        public Criteria andCourseInteractNotEqualTo(Integer value) {
            addCriterion("course_interact <>", value, "courseInteract");
            return (Criteria) this;
        }

        public Criteria andCourseInteractGreaterThan(Integer value) {
            addCriterion("course_interact >", value, "courseInteract");
            return (Criteria) this;
        }

        public Criteria andCourseInteractGreaterThanOrEqualTo(Integer value) {
            addCriterion("course_interact >=", value, "courseInteract");
            return (Criteria) this;
        }

        public Criteria andCourseInteractLessThan(Integer value) {
            addCriterion("course_interact <", value, "courseInteract");
            return (Criteria) this;
        }

        public Criteria andCourseInteractLessThanOrEqualTo(Integer value) {
            addCriterion("course_interact <=", value, "courseInteract");
            return (Criteria) this;
        }

        public Criteria andCourseInteractIn(List<Integer> values) {
            addCriterion("course_interact in", values, "courseInteract");
            return (Criteria) this;
        }

        public Criteria andCourseInteractNotIn(List<Integer> values) {
            addCriterion("course_interact not in", values, "courseInteract");
            return (Criteria) this;
        }

        public Criteria andCourseInteractBetween(Integer value1, Integer value2) {
            addCriterion("course_interact between", value1, value2, "courseInteract");
            return (Criteria) this;
        }

        public Criteria andCourseInteractNotBetween(Integer value1, Integer value2) {
            addCriterion("course_interact not between", value1, value2, "courseInteract");
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