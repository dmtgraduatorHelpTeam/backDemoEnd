package com.dmsdbj.dmt.graduatorHelp.mybatisexample;

import com.dmsdbj.itoo.tool.base.exampletool.Criterion;
import com.dmsdbj.itoo.tool.base.exampletool.GeneratedCriteria;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;

/**
 * 
 * @author :张欢-十二期
 * @version:V1.5
 * @DESCRIPTION:解决引用包名大写改为小写
 * @create:2017年11月4日
 * 
 */
public  class PersonCompanyCriteria extends GeneratedCriteria<PersonCompanyCriteria> implements Serializable{

    protected PersonCompanyCriteria() {
        super();
        criteria = new ArrayList<Criterion>();
    }

    private static final String USER_ID = "userId";   
    private static final String COMPANY_ID = "companyId";   
    private static final String SALARY_CHANGE_TIME = "salaryChangeTime";   
    private static final String SALARY = "salary";   
    private static final String TIMES_PER_YEAR = "timesPerYear";   
    private static final String POSSESSION = "possession";   
    private static final String WELLFARE = "wellfare";   
    private static final String OPERATOR_ID = "operatorId";   
    private static final String TIMESTAMP_TIME = "timestampTime";   

    public PersonCompanyCriteria andUserIdIsNull() {
        addCriterion("user_id is null");
        return this;
    }

    public PersonCompanyCriteria andUserIdIsNotNull() {
        addCriterion("user_id is not null");
        return this;
    }
    public PersonCompanyCriteria andUserIdEqualTo(String value) {
        addCriterion("user_id =", value, USER_ID);
        return this;
    }
    public PersonCompanyCriteria andUserIdNotEqualTo(String value) {
        addCriterion("user_id <>", value, USER_ID);
        return this;
    }    
    public PersonCompanyCriteria andUserIdGreaterThan(String value) {
        addCriterion("user_id >", value, USER_ID);
        return this;
    }    
    public PersonCompanyCriteria andUserIdGreaterThanOrEqualTo(String value) {
        addCriterion("user_id >=", value, USER_ID);
        return this;
    }    
    public PersonCompanyCriteria andUserIdLessThan(String value) {
        addCriterion("user_id <", value, USER_ID);
        return this;
    }     
    public PersonCompanyCriteria andUserIdLessThanOrEqualTo(String value) {
        addCriterion("user_id <=", value, USER_ID);
        return this;
    }
    public PersonCompanyCriteria andUserIdIn(List<String> values) {
        addCriterion("user_id in", values, USER_ID);
        return this;
    }
    public PersonCompanyCriteria andUserIdNotIn(List<String> values) {
        addCriterion("user_id not in", values, USER_ID);
        return this;
    }
    public PersonCompanyCriteria andUserIdBetween(String value1, String value2) {
        addCriterion("user_id between", value1, value2, USER_ID);
        return this;
    }
    public PersonCompanyCriteria andUserIdNotBetween(String value1, String value2) {
        addCriterion("user_id not between", value1, value2, USER_ID);
        return this;
    }
        public PersonCompanyCriteria andUserIdLike(String value) {
            addCriterion("user_id like", value, USER_ID);
            return this;
        }

        public PersonCompanyCriteria andUserIdNotLike(String value) {
            addCriterion("user_id not like", value, USER_ID);
            return this;
        }
    public PersonCompanyCriteria andCompanyIdIsNull() {
        addCriterion("company_id is null");
        return this;
    }

    public PersonCompanyCriteria andCompanyIdIsNotNull() {
        addCriterion("company_id is not null");
        return this;
    }
    public PersonCompanyCriteria andCompanyIdEqualTo(String value) {
        addCriterion("company_id =", value, COMPANY_ID);
        return this;
    }
    public PersonCompanyCriteria andCompanyIdNotEqualTo(String value) {
        addCriterion("company_id <>", value, COMPANY_ID);
        return this;
    }    
    public PersonCompanyCriteria andCompanyIdGreaterThan(String value) {
        addCriterion("company_id >", value, COMPANY_ID);
        return this;
    }    
    public PersonCompanyCriteria andCompanyIdGreaterThanOrEqualTo(String value) {
        addCriterion("company_id >=", value, COMPANY_ID);
        return this;
    }    
    public PersonCompanyCriteria andCompanyIdLessThan(String value) {
        addCriterion("company_id <", value, COMPANY_ID);
        return this;
    }     
    public PersonCompanyCriteria andCompanyIdLessThanOrEqualTo(String value) {
        addCriterion("company_id <=", value, COMPANY_ID);
        return this;
    }
    public PersonCompanyCriteria andCompanyIdIn(List<String> values) {
        addCriterion("company_id in", values, COMPANY_ID);
        return this;
    }
    public PersonCompanyCriteria andCompanyIdNotIn(List<String> values) {
        addCriterion("company_id not in", values, COMPANY_ID);
        return this;
    }
    public PersonCompanyCriteria andCompanyIdBetween(String value1, String value2) {
        addCriterion("company_id between", value1, value2, COMPANY_ID);
        return this;
    }
    public PersonCompanyCriteria andCompanyIdNotBetween(String value1, String value2) {
        addCriterion("company_id not between", value1, value2, COMPANY_ID);
        return this;
    }
        public PersonCompanyCriteria andCompanyIdLike(String value) {
            addCriterion("company_id like", value, COMPANY_ID);
            return this;
        }

        public PersonCompanyCriteria andCompanyIdNotLike(String value) {
            addCriterion("company_id not like", value, COMPANY_ID);
            return this;
        }
    public PersonCompanyCriteria andSalaryChangeTimeIsNull() {
        addCriterion("salary_change_time is null");
        return this;
    }

    public PersonCompanyCriteria andSalaryChangeTimeIsNotNull() {
        addCriterion("salary_change_time is not null");
        return this;
    }
    public PersonCompanyCriteria andSalaryChangeTimeEqualTo(Date value) {
        addCriterion("salary_change_time =", value, SALARY_CHANGE_TIME);
        return this;
    }
    public PersonCompanyCriteria andSalaryChangeTimeNotEqualTo(Date value) {
        addCriterion("salary_change_time <>", value, SALARY_CHANGE_TIME);
        return this;
    }    
    public PersonCompanyCriteria andSalaryChangeTimeGreaterThan(Date value) {
        addCriterion("salary_change_time >", value, SALARY_CHANGE_TIME);
        return this;
    }    
    public PersonCompanyCriteria andSalaryChangeTimeGreaterThanOrEqualTo(Date value) {
        addCriterion("salary_change_time >=", value, SALARY_CHANGE_TIME);
        return this;
    }    
    public PersonCompanyCriteria andSalaryChangeTimeLessThan(Date value) {
        addCriterion("salary_change_time <", value, SALARY_CHANGE_TIME);
        return this;
    }     
    public PersonCompanyCriteria andSalaryChangeTimeLessThanOrEqualTo(Date value) {
        addCriterion("salary_change_time <=", value, SALARY_CHANGE_TIME);
        return this;
    }
    public PersonCompanyCriteria andSalaryChangeTimeIn(List<Date> values) {
        addCriterion("salary_change_time in", values, SALARY_CHANGE_TIME);
        return this;
    }
    public PersonCompanyCriteria andSalaryChangeTimeNotIn(List<Date> values) {
        addCriterion("salary_change_time not in", values, SALARY_CHANGE_TIME);
        return this;
    }
    public PersonCompanyCriteria andSalaryChangeTimeBetween(Date value1, Date value2) {
        addCriterion("salary_change_time between", value1, value2, SALARY_CHANGE_TIME);
        return this;
    }
    public PersonCompanyCriteria andSalaryChangeTimeNotBetween(Date value1, Date value2) {
        addCriterion("salary_change_time not between", value1, value2, SALARY_CHANGE_TIME);
        return this;
    }
    public PersonCompanyCriteria andSalaryIsNull() {
        addCriterion("salary is null");
        return this;
    }

    public PersonCompanyCriteria andSalaryIsNotNull() {
        addCriterion("salary is not null");
        return this;
    }
    public PersonCompanyCriteria andSalaryEqualTo(Double value) {
        addCriterion("salary =", value, SALARY);
        return this;
    }
    public PersonCompanyCriteria andSalaryNotEqualTo(Double value) {
        addCriterion("salary <>", value, SALARY);
        return this;
    }    
    public PersonCompanyCriteria andSalaryGreaterThan(Double value) {
        addCriterion("salary >", value, SALARY);
        return this;
    }    
    public PersonCompanyCriteria andSalaryGreaterThanOrEqualTo(Double value) {
        addCriterion("salary >=", value, SALARY);
        return this;
    }    
    public PersonCompanyCriteria andSalaryLessThan(Double value) {
        addCriterion("salary <", value, SALARY);
        return this;
    }     
    public PersonCompanyCriteria andSalaryLessThanOrEqualTo(Double value) {
        addCriterion("salary <=", value, SALARY);
        return this;
    }
    public PersonCompanyCriteria andSalaryIn(List<Double> values) {
        addCriterion("salary in", values, SALARY);
        return this;
    }
    public PersonCompanyCriteria andSalaryNotIn(List<Double> values) {
        addCriterion("salary not in", values, SALARY);
        return this;
    }
    public PersonCompanyCriteria andSalaryBetween(Double value1, Double value2) {
        addCriterion("salary between", value1, value2, SALARY);
        return this;
    }
    public PersonCompanyCriteria andSalaryNotBetween(Double value1, Double value2) {
        addCriterion("salary not between", value1, value2, SALARY);
        return this;
    }
    public PersonCompanyCriteria andTimesPerYearIsNull() {
        addCriterion("times_per_year is null");
        return this;
    }

    public PersonCompanyCriteria andTimesPerYearIsNotNull() {
        addCriterion("times_per_year is not null");
        return this;
    }
    public PersonCompanyCriteria andTimesPerYearEqualTo(Long value) {
        addCriterion("times_per_year =", value, TIMES_PER_YEAR);
        return this;
    }
    public PersonCompanyCriteria andTimesPerYearNotEqualTo(Long value) {
        addCriterion("times_per_year <>", value, TIMES_PER_YEAR);
        return this;
    }    
    public PersonCompanyCriteria andTimesPerYearGreaterThan(Long value) {
        addCriterion("times_per_year >", value, TIMES_PER_YEAR);
        return this;
    }    
    public PersonCompanyCriteria andTimesPerYearGreaterThanOrEqualTo(Long value) {
        addCriterion("times_per_year >=", value, TIMES_PER_YEAR);
        return this;
    }    
    public PersonCompanyCriteria andTimesPerYearLessThan(Long value) {
        addCriterion("times_per_year <", value, TIMES_PER_YEAR);
        return this;
    }     
    public PersonCompanyCriteria andTimesPerYearLessThanOrEqualTo(Long value) {
        addCriterion("times_per_year <=", value, TIMES_PER_YEAR);
        return this;
    }
    public PersonCompanyCriteria andTimesPerYearIn(List<Long> values) {
        addCriterion("times_per_year in", values, TIMES_PER_YEAR);
        return this;
    }
    public PersonCompanyCriteria andTimesPerYearNotIn(List<Long> values) {
        addCriterion("times_per_year not in", values, TIMES_PER_YEAR);
        return this;
    }
    public PersonCompanyCriteria andTimesPerYearBetween(Long value1, Long value2) {
        addCriterion("times_per_year between", value1, value2, TIMES_PER_YEAR);
        return this;
    }
    public PersonCompanyCriteria andTimesPerYearNotBetween(Long value1, Long value2) {
        addCriterion("times_per_year not between", value1, value2, TIMES_PER_YEAR);
        return this;
    }
    public PersonCompanyCriteria andPossessionIsNull() {
        addCriterion("possession is null");
        return this;
    }

    public PersonCompanyCriteria andPossessionIsNotNull() {
        addCriterion("possession is not null");
        return this;
    }
    public PersonCompanyCriteria andPossessionEqualTo(String value) {
        addCriterion("possession =", value, POSSESSION);
        return this;
    }
    public PersonCompanyCriteria andPossessionNotEqualTo(String value) {
        addCriterion("possession <>", value, POSSESSION);
        return this;
    }    
    public PersonCompanyCriteria andPossessionGreaterThan(String value) {
        addCriterion("possession >", value, POSSESSION);
        return this;
    }    
    public PersonCompanyCriteria andPossessionGreaterThanOrEqualTo(String value) {
        addCriterion("possession >=", value, POSSESSION);
        return this;
    }    
    public PersonCompanyCriteria andPossessionLessThan(String value) {
        addCriterion("possession <", value, POSSESSION);
        return this;
    }     
    public PersonCompanyCriteria andPossessionLessThanOrEqualTo(String value) {
        addCriterion("possession <=", value, POSSESSION);
        return this;
    }
    public PersonCompanyCriteria andPossessionIn(List<String> values) {
        addCriterion("possession in", values, POSSESSION);
        return this;
    }
    public PersonCompanyCriteria andPossessionNotIn(List<String> values) {
        addCriterion("possession not in", values, POSSESSION);
        return this;
    }
    public PersonCompanyCriteria andPossessionBetween(String value1, String value2) {
        addCriterion("possession between", value1, value2, POSSESSION);
        return this;
    }
    public PersonCompanyCriteria andPossessionNotBetween(String value1, String value2) {
        addCriterion("possession not between", value1, value2, POSSESSION);
        return this;
    }
        public PersonCompanyCriteria andPossessionLike(String value) {
            addCriterion("possession like", value, POSSESSION);
            return this;
        }

        public PersonCompanyCriteria andPossessionNotLike(String value) {
            addCriterion("possession not like", value, POSSESSION);
            return this;
        }
    public PersonCompanyCriteria andWellfareIsNull() {
        addCriterion("wellfare is null");
        return this;
    }

    public PersonCompanyCriteria andWellfareIsNotNull() {
        addCriterion("wellfare is not null");
        return this;
    }
    public PersonCompanyCriteria andWellfareEqualTo(String value) {
        addCriterion("wellfare =", value, WELLFARE);
        return this;
    }
    public PersonCompanyCriteria andWellfareNotEqualTo(String value) {
        addCriterion("wellfare <>", value, WELLFARE);
        return this;
    }    
    public PersonCompanyCriteria andWellfareGreaterThan(String value) {
        addCriterion("wellfare >", value, WELLFARE);
        return this;
    }    
    public PersonCompanyCriteria andWellfareGreaterThanOrEqualTo(String value) {
        addCriterion("wellfare >=", value, WELLFARE);
        return this;
    }    
    public PersonCompanyCriteria andWellfareLessThan(String value) {
        addCriterion("wellfare <", value, WELLFARE);
        return this;
    }     
    public PersonCompanyCriteria andWellfareLessThanOrEqualTo(String value) {
        addCriterion("wellfare <=", value, WELLFARE);
        return this;
    }
    public PersonCompanyCriteria andWellfareIn(List<String> values) {
        addCriterion("wellfare in", values, WELLFARE);
        return this;
    }
    public PersonCompanyCriteria andWellfareNotIn(List<String> values) {
        addCriterion("wellfare not in", values, WELLFARE);
        return this;
    }
    public PersonCompanyCriteria andWellfareBetween(String value1, String value2) {
        addCriterion("wellfare between", value1, value2, WELLFARE);
        return this;
    }
    public PersonCompanyCriteria andWellfareNotBetween(String value1, String value2) {
        addCriterion("wellfare not between", value1, value2, WELLFARE);
        return this;
    }
        public PersonCompanyCriteria andWellfareLike(String value) {
            addCriterion("wellfare like", value, WELLFARE);
            return this;
        }

        public PersonCompanyCriteria andWellfareNotLike(String value) {
            addCriterion("wellfare not like", value, WELLFARE);
            return this;
        }
    public PersonCompanyCriteria andOperatorIdIsNull() {
        addCriterion("operator_id is null");
        return this;
    }

    public PersonCompanyCriteria andOperatorIdIsNotNull() {
        addCriterion("operator_id is not null");
        return this;
    }
    public PersonCompanyCriteria andOperatorIdEqualTo(String value) {
        addCriterion("operator_id =", value, OPERATOR_ID);
        return this;
    }
    public PersonCompanyCriteria andOperatorIdNotEqualTo(String value) {
        addCriterion("operator_id <>", value, OPERATOR_ID);
        return this;
    }    
    public PersonCompanyCriteria andOperatorIdGreaterThan(String value) {
        addCriterion("operator_id >", value, OPERATOR_ID);
        return this;
    }    
    public PersonCompanyCriteria andOperatorIdGreaterThanOrEqualTo(String value) {
        addCriterion("operator_id >=", value, OPERATOR_ID);
        return this;
    }    
    public PersonCompanyCriteria andOperatorIdLessThan(String value) {
        addCriterion("operator_id <", value, OPERATOR_ID);
        return this;
    }     
    public PersonCompanyCriteria andOperatorIdLessThanOrEqualTo(String value) {
        addCriterion("operator_id <=", value, OPERATOR_ID);
        return this;
    }
    public PersonCompanyCriteria andOperatorIdIn(List<String> values) {
        addCriterion("operator_id in", values, OPERATOR_ID);
        return this;
    }
    public PersonCompanyCriteria andOperatorIdNotIn(List<String> values) {
        addCriterion("operator_id not in", values, OPERATOR_ID);
        return this;
    }
    public PersonCompanyCriteria andOperatorIdBetween(String value1, String value2) {
        addCriterion("operator_id between", value1, value2, OPERATOR_ID);
        return this;
    }
    public PersonCompanyCriteria andOperatorIdNotBetween(String value1, String value2) {
        addCriterion("operator_id not between", value1, value2, OPERATOR_ID);
        return this;
    }
        public PersonCompanyCriteria andOperatorIdLike(String value) {
            addCriterion("operator_id like", value, OPERATOR_ID);
            return this;
        }

        public PersonCompanyCriteria andOperatorIdNotLike(String value) {
            addCriterion("operator_id not like", value, OPERATOR_ID);
            return this;
        }
    public PersonCompanyCriteria andTimestampTimeIsNull() {
        addCriterion("timestamp_time is null");
        return this;
    }

    public PersonCompanyCriteria andTimestampTimeIsNotNull() {
        addCriterion("timestamp_time is not null");
        return this;
    }
    public PersonCompanyCriteria andTimestampTimeEqualTo(String value) {
        addCriterion("timestamp_time =", value, TIMESTAMP_TIME);
        return this;
    }
    public PersonCompanyCriteria andTimestampTimeNotEqualTo(String value) {
        addCriterion("timestamp_time <>", value, TIMESTAMP_TIME);
        return this;
    }    
    public PersonCompanyCriteria andTimestampTimeGreaterThan(String value) {
        addCriterion("timestamp_time >", value, TIMESTAMP_TIME);
        return this;
    }    
    public PersonCompanyCriteria andTimestampTimeGreaterThanOrEqualTo(String value) {
        addCriterion("timestamp_time >=", value, TIMESTAMP_TIME);
        return this;
    }    
    public PersonCompanyCriteria andTimestampTimeLessThan(String value) {
        addCriterion("timestamp_time <", value, TIMESTAMP_TIME);
        return this;
    }     
    public PersonCompanyCriteria andTimestampTimeLessThanOrEqualTo(String value) {
        addCriterion("timestamp_time <=", value, TIMESTAMP_TIME);
        return this;
    }
    public PersonCompanyCriteria andTimestampTimeIn(List<String> values) {
        addCriterion("timestamp_time in", values, TIMESTAMP_TIME);
        return this;
    }
    public PersonCompanyCriteria andTimestampTimeNotIn(List<String> values) {
        addCriterion("timestamp_time not in", values, TIMESTAMP_TIME);
        return this;
    }
    public PersonCompanyCriteria andTimestampTimeBetween(String value1, String value2) {
        addCriterion("timestamp_time between", value1, value2, TIMESTAMP_TIME);
        return this;
    }
    public PersonCompanyCriteria andTimestampTimeNotBetween(String value1, String value2) {
        addCriterion("timestamp_time not between", value1, value2, TIMESTAMP_TIME);
        return this;
    }
}

