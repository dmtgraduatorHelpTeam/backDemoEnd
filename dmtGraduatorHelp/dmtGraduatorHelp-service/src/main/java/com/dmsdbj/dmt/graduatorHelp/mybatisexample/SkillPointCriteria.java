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
public  class SkillPointCriteria extends GeneratedCriteria<SkillPointCriteria> implements Serializable{

    protected SkillPointCriteria() {
        super();
        criteria = new ArrayList<Criterion>();
    }

    private static final String P_ID = "pId";   
    private static final String USER_ID = "userId";   
    private static final String COMPANY_ID = "companyId";   
    private static final String TECH_NAME = "techName";   
    private static final String OPERATOR_ID = "operatorId";   
    private static final String TIMESTAMP_TIME = "timestampTime";   

    public SkillPointCriteria andPIdIsNull() {
        addCriterion("p_id is null");
        return this;
    }

    public SkillPointCriteria andPIdIsNotNull() {
        addCriterion("p_id is not null");
        return this;
    }
    public SkillPointCriteria andPIdEqualTo(String value) {
        addCriterion("p_id =", value, P_ID);
        return this;
    }
    public SkillPointCriteria andPIdNotEqualTo(String value) {
        addCriterion("p_id <>", value, P_ID);
        return this;
    }    
    public SkillPointCriteria andPIdGreaterThan(String value) {
        addCriterion("p_id >", value, P_ID);
        return this;
    }    
    public SkillPointCriteria andPIdGreaterThanOrEqualTo(String value) {
        addCriterion("p_id >=", value, P_ID);
        return this;
    }    
    public SkillPointCriteria andPIdLessThan(String value) {
        addCriterion("p_id <", value, P_ID);
        return this;
    }     
    public SkillPointCriteria andPIdLessThanOrEqualTo(String value) {
        addCriterion("p_id <=", value, P_ID);
        return this;
    }
    public SkillPointCriteria andPIdIn(List<String> values) {
        addCriterion("p_id in", values, P_ID);
        return this;
    }
    public SkillPointCriteria andPIdNotIn(List<String> values) {
        addCriterion("p_id not in", values, P_ID);
        return this;
    }
    public SkillPointCriteria andPIdBetween(String value1, String value2) {
        addCriterion("p_id between", value1, value2, P_ID);
        return this;
    }
    public SkillPointCriteria andPIdNotBetween(String value1, String value2) {
        addCriterion("p_id not between", value1, value2, P_ID);
        return this;
    }
        public SkillPointCriteria andPIdLike(String value) {
            addCriterion("p_id like", value, P_ID);
            return this;
        }

        public SkillPointCriteria andPIdNotLike(String value) {
            addCriterion("p_id not like", value, P_ID);
            return this;
        }
    public SkillPointCriteria andUserIdIsNull() {
        addCriterion("user_id is null");
        return this;
    }

    public SkillPointCriteria andUserIdIsNotNull() {
        addCriterion("user_id is not null");
        return this;
    }
    public SkillPointCriteria andUserIdEqualTo(String value) {
        addCriterion("user_id =", value, USER_ID);
        return this;
    }
    public SkillPointCriteria andUserIdNotEqualTo(String value) {
        addCriterion("user_id <>", value, USER_ID);
        return this;
    }    
    public SkillPointCriteria andUserIdGreaterThan(String value) {
        addCriterion("user_id >", value, USER_ID);
        return this;
    }    
    public SkillPointCriteria andUserIdGreaterThanOrEqualTo(String value) {
        addCriterion("user_id >=", value, USER_ID);
        return this;
    }    
    public SkillPointCriteria andUserIdLessThan(String value) {
        addCriterion("user_id <", value, USER_ID);
        return this;
    }     
    public SkillPointCriteria andUserIdLessThanOrEqualTo(String value) {
        addCriterion("user_id <=", value, USER_ID);
        return this;
    }
    public SkillPointCriteria andUserIdIn(List<String> values) {
        addCriterion("user_id in", values, USER_ID);
        return this;
    }
    public SkillPointCriteria andUserIdNotIn(List<String> values) {
        addCriterion("user_id not in", values, USER_ID);
        return this;
    }
    public SkillPointCriteria andUserIdBetween(String value1, String value2) {
        addCriterion("user_id between", value1, value2, USER_ID);
        return this;
    }
    public SkillPointCriteria andUserIdNotBetween(String value1, String value2) {
        addCriterion("user_id not between", value1, value2, USER_ID);
        return this;
    }
        public SkillPointCriteria andUserIdLike(String value) {
            addCriterion("user_id like", value, USER_ID);
            return this;
        }

        public SkillPointCriteria andUserIdNotLike(String value) {
            addCriterion("user_id not like", value, USER_ID);
            return this;
        }
    public SkillPointCriteria andCompanyIdIsNull() {
        addCriterion("company_id is null");
        return this;
    }

    public SkillPointCriteria andCompanyIdIsNotNull() {
        addCriterion("company_id is not null");
        return this;
    }
    public SkillPointCriteria andCompanyIdEqualTo(String value) {
        addCriterion("company_id =", value, COMPANY_ID);
        return this;
    }
    public SkillPointCriteria andCompanyIdNotEqualTo(String value) {
        addCriterion("company_id <>", value, COMPANY_ID);
        return this;
    }    
    public SkillPointCriteria andCompanyIdGreaterThan(String value) {
        addCriterion("company_id >", value, COMPANY_ID);
        return this;
    }    
    public SkillPointCriteria andCompanyIdGreaterThanOrEqualTo(String value) {
        addCriterion("company_id >=", value, COMPANY_ID);
        return this;
    }    
    public SkillPointCriteria andCompanyIdLessThan(String value) {
        addCriterion("company_id <", value, COMPANY_ID);
        return this;
    }     
    public SkillPointCriteria andCompanyIdLessThanOrEqualTo(String value) {
        addCriterion("company_id <=", value, COMPANY_ID);
        return this;
    }
    public SkillPointCriteria andCompanyIdIn(List<String> values) {
        addCriterion("company_id in", values, COMPANY_ID);
        return this;
    }
    public SkillPointCriteria andCompanyIdNotIn(List<String> values) {
        addCriterion("company_id not in", values, COMPANY_ID);
        return this;
    }
    public SkillPointCriteria andCompanyIdBetween(String value1, String value2) {
        addCriterion("company_id between", value1, value2, COMPANY_ID);
        return this;
    }
    public SkillPointCriteria andCompanyIdNotBetween(String value1, String value2) {
        addCriterion("company_id not between", value1, value2, COMPANY_ID);
        return this;
    }
        public SkillPointCriteria andCompanyIdLike(String value) {
            addCriterion("company_id like", value, COMPANY_ID);
            return this;
        }

        public SkillPointCriteria andCompanyIdNotLike(String value) {
            addCriterion("company_id not like", value, COMPANY_ID);
            return this;
        }
    public SkillPointCriteria andTechNameIsNull() {
        addCriterion("tech_name is null");
        return this;
    }

    public SkillPointCriteria andTechNameIsNotNull() {
        addCriterion("tech_name is not null");
        return this;
    }
    public SkillPointCriteria andTechNameEqualTo(String value) {
        addCriterion("tech_name =", value, TECH_NAME);
        return this;
    }
    public SkillPointCriteria andTechNameNotEqualTo(String value) {
        addCriterion("tech_name <>", value, TECH_NAME);
        return this;
    }    
    public SkillPointCriteria andTechNameGreaterThan(String value) {
        addCriterion("tech_name >", value, TECH_NAME);
        return this;
    }    
    public SkillPointCriteria andTechNameGreaterThanOrEqualTo(String value) {
        addCriterion("tech_name >=", value, TECH_NAME);
        return this;
    }    
    public SkillPointCriteria andTechNameLessThan(String value) {
        addCriterion("tech_name <", value, TECH_NAME);
        return this;
    }     
    public SkillPointCriteria andTechNameLessThanOrEqualTo(String value) {
        addCriterion("tech_name <=", value, TECH_NAME);
        return this;
    }
    public SkillPointCriteria andTechNameIn(List<String> values) {
        addCriterion("tech_name in", values, TECH_NAME);
        return this;
    }
    public SkillPointCriteria andTechNameNotIn(List<String> values) {
        addCriterion("tech_name not in", values, TECH_NAME);
        return this;
    }
    public SkillPointCriteria andTechNameBetween(String value1, String value2) {
        addCriterion("tech_name between", value1, value2, TECH_NAME);
        return this;
    }
    public SkillPointCriteria andTechNameNotBetween(String value1, String value2) {
        addCriterion("tech_name not between", value1, value2, TECH_NAME);
        return this;
    }
        public SkillPointCriteria andTechNameLike(String value) {
            addCriterion("tech_name like", value, TECH_NAME);
            return this;
        }

        public SkillPointCriteria andTechNameNotLike(String value) {
            addCriterion("tech_name not like", value, TECH_NAME);
            return this;
        }
    public SkillPointCriteria andOperatorIdIsNull() {
        addCriterion("operator_id is null");
        return this;
    }

    public SkillPointCriteria andOperatorIdIsNotNull() {
        addCriterion("operator_id is not null");
        return this;
    }
    public SkillPointCriteria andOperatorIdEqualTo(String value) {
        addCriterion("operator_id =", value, OPERATOR_ID);
        return this;
    }
    public SkillPointCriteria andOperatorIdNotEqualTo(String value) {
        addCriterion("operator_id <>", value, OPERATOR_ID);
        return this;
    }    
    public SkillPointCriteria andOperatorIdGreaterThan(String value) {
        addCriterion("operator_id >", value, OPERATOR_ID);
        return this;
    }    
    public SkillPointCriteria andOperatorIdGreaterThanOrEqualTo(String value) {
        addCriterion("operator_id >=", value, OPERATOR_ID);
        return this;
    }    
    public SkillPointCriteria andOperatorIdLessThan(String value) {
        addCriterion("operator_id <", value, OPERATOR_ID);
        return this;
    }     
    public SkillPointCriteria andOperatorIdLessThanOrEqualTo(String value) {
        addCriterion("operator_id <=", value, OPERATOR_ID);
        return this;
    }
    public SkillPointCriteria andOperatorIdIn(List<String> values) {
        addCriterion("operator_id in", values, OPERATOR_ID);
        return this;
    }
    public SkillPointCriteria andOperatorIdNotIn(List<String> values) {
        addCriterion("operator_id not in", values, OPERATOR_ID);
        return this;
    }
    public SkillPointCriteria andOperatorIdBetween(String value1, String value2) {
        addCriterion("operator_id between", value1, value2, OPERATOR_ID);
        return this;
    }
    public SkillPointCriteria andOperatorIdNotBetween(String value1, String value2) {
        addCriterion("operator_id not between", value1, value2, OPERATOR_ID);
        return this;
    }
        public SkillPointCriteria andOperatorIdLike(String value) {
            addCriterion("operator_id like", value, OPERATOR_ID);
            return this;
        }

        public SkillPointCriteria andOperatorIdNotLike(String value) {
            addCriterion("operator_id not like", value, OPERATOR_ID);
            return this;
        }
    public SkillPointCriteria andTimestampTimeIsNull() {
        addCriterion("timestamp_time is null");
        return this;
    }

    public SkillPointCriteria andTimestampTimeIsNotNull() {
        addCriterion("timestamp_time is not null");
        return this;
    }
    public SkillPointCriteria andTimestampTimeEqualTo(String value) {
        addCriterion("timestamp_time =", value, TIMESTAMP_TIME);
        return this;
    }
    public SkillPointCriteria andTimestampTimeNotEqualTo(String value) {
        addCriterion("timestamp_time <>", value, TIMESTAMP_TIME);
        return this;
    }    
    public SkillPointCriteria andTimestampTimeGreaterThan(String value) {
        addCriterion("timestamp_time >", value, TIMESTAMP_TIME);
        return this;
    }    
    public SkillPointCriteria andTimestampTimeGreaterThanOrEqualTo(String value) {
        addCriterion("timestamp_time >=", value, TIMESTAMP_TIME);
        return this;
    }    
    public SkillPointCriteria andTimestampTimeLessThan(String value) {
        addCriterion("timestamp_time <", value, TIMESTAMP_TIME);
        return this;
    }     
    public SkillPointCriteria andTimestampTimeLessThanOrEqualTo(String value) {
        addCriterion("timestamp_time <=", value, TIMESTAMP_TIME);
        return this;
    }
    public SkillPointCriteria andTimestampTimeIn(List<String> values) {
        addCriterion("timestamp_time in", values, TIMESTAMP_TIME);
        return this;
    }
    public SkillPointCriteria andTimestampTimeNotIn(List<String> values) {
        addCriterion("timestamp_time not in", values, TIMESTAMP_TIME);
        return this;
    }
    public SkillPointCriteria andTimestampTimeBetween(String value1, String value2) {
        addCriterion("timestamp_time between", value1, value2, TIMESTAMP_TIME);
        return this;
    }
    public SkillPointCriteria andTimestampTimeNotBetween(String value1, String value2) {
        addCriterion("timestamp_time not between", value1, value2, TIMESTAMP_TIME);
        return this;
    }
}

