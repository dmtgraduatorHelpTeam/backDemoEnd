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
public  class LandScapeCriteria extends GeneratedCriteria<LandScapeCriteria> implements Serializable{

    protected LandScapeCriteria() {
        super();
        criteria = new ArrayList<Criterion>();
    }

    private static final String USER_ID = "userId";   
    private static final String NAME = "name";   
    private static final String DESCRIPTION = "description";   
    private static final String OPERATOR_ID = "operatorId";   
    private static final String TIMESTAMP_TIME = "timestampTime";   

    public LandScapeCriteria andUserIdIsNull() {
        addCriterion("user_id is null");
        return this;
    }

    public LandScapeCriteria andUserIdIsNotNull() {
        addCriterion("user_id is not null");
        return this;
    }
    public LandScapeCriteria andUserIdEqualTo(String value) {
        addCriterion("user_id =", value, USER_ID);
        return this;
    }
    public LandScapeCriteria andUserIdNotEqualTo(String value) {
        addCriterion("user_id <>", value, USER_ID);
        return this;
    }    
    public LandScapeCriteria andUserIdGreaterThan(String value) {
        addCriterion("user_id >", value, USER_ID);
        return this;
    }    
    public LandScapeCriteria andUserIdGreaterThanOrEqualTo(String value) {
        addCriterion("user_id >=", value, USER_ID);
        return this;
    }    
    public LandScapeCriteria andUserIdLessThan(String value) {
        addCriterion("user_id <", value, USER_ID);
        return this;
    }     
    public LandScapeCriteria andUserIdLessThanOrEqualTo(String value) {
        addCriterion("user_id <=", value, USER_ID);
        return this;
    }
    public LandScapeCriteria andUserIdIn(List<String> values) {
        addCriterion("user_id in", values, USER_ID);
        return this;
    }
    public LandScapeCriteria andUserIdNotIn(List<String> values) {
        addCriterion("user_id not in", values, USER_ID);
        return this;
    }
    public LandScapeCriteria andUserIdBetween(String value1, String value2) {
        addCriterion("user_id between", value1, value2, USER_ID);
        return this;
    }
    public LandScapeCriteria andUserIdNotBetween(String value1, String value2) {
        addCriterion("user_id not between", value1, value2, USER_ID);
        return this;
    }
        public LandScapeCriteria andUserIdLike(String value) {
            addCriterion("user_id like", value, USER_ID);
            return this;
        }

        public LandScapeCriteria andUserIdNotLike(String value) {
            addCriterion("user_id not like", value, USER_ID);
            return this;
        }
    public LandScapeCriteria andNameIsNull() {
        addCriterion("name is null");
        return this;
    }

    public LandScapeCriteria andNameIsNotNull() {
        addCriterion("name is not null");
        return this;
    }
    public LandScapeCriteria andNameEqualTo(String value) {
        addCriterion("name =", value, NAME);
        return this;
    }
    public LandScapeCriteria andNameNotEqualTo(String value) {
        addCriterion("name <>", value, NAME);
        return this;
    }    
    public LandScapeCriteria andNameGreaterThan(String value) {
        addCriterion("name >", value, NAME);
        return this;
    }    
    public LandScapeCriteria andNameGreaterThanOrEqualTo(String value) {
        addCriterion("name >=", value, NAME);
        return this;
    }    
    public LandScapeCriteria andNameLessThan(String value) {
        addCriterion("name <", value, NAME);
        return this;
    }     
    public LandScapeCriteria andNameLessThanOrEqualTo(String value) {
        addCriterion("name <=", value, NAME);
        return this;
    }
    public LandScapeCriteria andNameIn(List<String> values) {
        addCriterion("name in", values, NAME);
        return this;
    }
    public LandScapeCriteria andNameNotIn(List<String> values) {
        addCriterion("name not in", values, NAME);
        return this;
    }
    public LandScapeCriteria andNameBetween(String value1, String value2) {
        addCriterion("name between", value1, value2, NAME);
        return this;
    }
    public LandScapeCriteria andNameNotBetween(String value1, String value2) {
        addCriterion("name not between", value1, value2, NAME);
        return this;
    }
        public LandScapeCriteria andNameLike(String value) {
            addCriterion("name like", value, NAME);
            return this;
        }

        public LandScapeCriteria andNameNotLike(String value) {
            addCriterion("name not like", value, NAME);
            return this;
        }
    public LandScapeCriteria andDescriptionIsNull() {
        addCriterion("description is null");
        return this;
    }

    public LandScapeCriteria andDescriptionIsNotNull() {
        addCriterion("description is not null");
        return this;
    }
    public LandScapeCriteria andDescriptionEqualTo(String value) {
        addCriterion("description =", value, DESCRIPTION);
        return this;
    }
    public LandScapeCriteria andDescriptionNotEqualTo(String value) {
        addCriterion("description <>", value, DESCRIPTION);
        return this;
    }    
    public LandScapeCriteria andDescriptionGreaterThan(String value) {
        addCriterion("description >", value, DESCRIPTION);
        return this;
    }    
    public LandScapeCriteria andDescriptionGreaterThanOrEqualTo(String value) {
        addCriterion("description >=", value, DESCRIPTION);
        return this;
    }    
    public LandScapeCriteria andDescriptionLessThan(String value) {
        addCriterion("description <", value, DESCRIPTION);
        return this;
    }     
    public LandScapeCriteria andDescriptionLessThanOrEqualTo(String value) {
        addCriterion("description <=", value, DESCRIPTION);
        return this;
    }
    public LandScapeCriteria andDescriptionIn(List<String> values) {
        addCriterion("description in", values, DESCRIPTION);
        return this;
    }
    public LandScapeCriteria andDescriptionNotIn(List<String> values) {
        addCriterion("description not in", values, DESCRIPTION);
        return this;
    }
    public LandScapeCriteria andDescriptionBetween(String value1, String value2) {
        addCriterion("description between", value1, value2, DESCRIPTION);
        return this;
    }
    public LandScapeCriteria andDescriptionNotBetween(String value1, String value2) {
        addCriterion("description not between", value1, value2, DESCRIPTION);
        return this;
    }
        public LandScapeCriteria andDescriptionLike(String value) {
            addCriterion("description like", value, DESCRIPTION);
            return this;
        }

        public LandScapeCriteria andDescriptionNotLike(String value) {
            addCriterion("description not like", value, DESCRIPTION);
            return this;
        }
    public LandScapeCriteria andOperatorIdIsNull() {
        addCriterion("operator_id is null");
        return this;
    }

    public LandScapeCriteria andOperatorIdIsNotNull() {
        addCriterion("operator_id is not null");
        return this;
    }
    public LandScapeCriteria andOperatorIdEqualTo(String value) {
        addCriterion("operator_id =", value, OPERATOR_ID);
        return this;
    }
    public LandScapeCriteria andOperatorIdNotEqualTo(String value) {
        addCriterion("operator_id <>", value, OPERATOR_ID);
        return this;
    }    
    public LandScapeCriteria andOperatorIdGreaterThan(String value) {
        addCriterion("operator_id >", value, OPERATOR_ID);
        return this;
    }    
    public LandScapeCriteria andOperatorIdGreaterThanOrEqualTo(String value) {
        addCriterion("operator_id >=", value, OPERATOR_ID);
        return this;
    }    
    public LandScapeCriteria andOperatorIdLessThan(String value) {
        addCriterion("operator_id <", value, OPERATOR_ID);
        return this;
    }     
    public LandScapeCriteria andOperatorIdLessThanOrEqualTo(String value) {
        addCriterion("operator_id <=", value, OPERATOR_ID);
        return this;
    }
    public LandScapeCriteria andOperatorIdIn(List<String> values) {
        addCriterion("operator_id in", values, OPERATOR_ID);
        return this;
    }
    public LandScapeCriteria andOperatorIdNotIn(List<String> values) {
        addCriterion("operator_id not in", values, OPERATOR_ID);
        return this;
    }
    public LandScapeCriteria andOperatorIdBetween(String value1, String value2) {
        addCriterion("operator_id between", value1, value2, OPERATOR_ID);
        return this;
    }
    public LandScapeCriteria andOperatorIdNotBetween(String value1, String value2) {
        addCriterion("operator_id not between", value1, value2, OPERATOR_ID);
        return this;
    }
        public LandScapeCriteria andOperatorIdLike(String value) {
            addCriterion("operator_id like", value, OPERATOR_ID);
            return this;
        }

        public LandScapeCriteria andOperatorIdNotLike(String value) {
            addCriterion("operator_id not like", value, OPERATOR_ID);
            return this;
        }
    public LandScapeCriteria andTimestampTimeIsNull() {
        addCriterion("timestamp_time is null");
        return this;
    }

    public LandScapeCriteria andTimestampTimeIsNotNull() {
        addCriterion("timestamp_time is not null");
        return this;
    }
    public LandScapeCriteria andTimestampTimeEqualTo(String value) {
        addCriterion("timestamp_time =", value, TIMESTAMP_TIME);
        return this;
    }
    public LandScapeCriteria andTimestampTimeNotEqualTo(String value) {
        addCriterion("timestamp_time <>", value, TIMESTAMP_TIME);
        return this;
    }    
    public LandScapeCriteria andTimestampTimeGreaterThan(String value) {
        addCriterion("timestamp_time >", value, TIMESTAMP_TIME);
        return this;
    }    
    public LandScapeCriteria andTimestampTimeGreaterThanOrEqualTo(String value) {
        addCriterion("timestamp_time >=", value, TIMESTAMP_TIME);
        return this;
    }    
    public LandScapeCriteria andTimestampTimeLessThan(String value) {
        addCriterion("timestamp_time <", value, TIMESTAMP_TIME);
        return this;
    }     
    public LandScapeCriteria andTimestampTimeLessThanOrEqualTo(String value) {
        addCriterion("timestamp_time <=", value, TIMESTAMP_TIME);
        return this;
    }
    public LandScapeCriteria andTimestampTimeIn(List<String> values) {
        addCriterion("timestamp_time in", values, TIMESTAMP_TIME);
        return this;
    }
    public LandScapeCriteria andTimestampTimeNotIn(List<String> values) {
        addCriterion("timestamp_time not in", values, TIMESTAMP_TIME);
        return this;
    }
    public LandScapeCriteria andTimestampTimeBetween(String value1, String value2) {
        addCriterion("timestamp_time between", value1, value2, TIMESTAMP_TIME);
        return this;
    }
    public LandScapeCriteria andTimestampTimeNotBetween(String value1, String value2) {
        addCriterion("timestamp_time not between", value1, value2, TIMESTAMP_TIME);
        return this;
    }
}

