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
public  class LocalProductCriteria extends GeneratedCriteria<LocalProductCriteria> implements Serializable{

    protected LocalProductCriteria() {
        super();
        criteria = new ArrayList<Criterion>();
    }

    private static final String USER_ID = "userId";   
    private static final String NAME = "name";   
    private static final String DESCRIPTION = "description";   
    private static final String OPERATOR_ID = "operatorId";   
    private static final String TIMESTAMP_TIME = "timestampTime";   

    public LocalProductCriteria andUserIdIsNull() {
        addCriterion("user_id is null");
        return this;
    }

    public LocalProductCriteria andUserIdIsNotNull() {
        addCriterion("user_id is not null");
        return this;
    }
    public LocalProductCriteria andUserIdEqualTo(String value) {
        addCriterion("user_id =", value, USER_ID);
        return this;
    }
    public LocalProductCriteria andUserIdNotEqualTo(String value) {
        addCriterion("user_id <>", value, USER_ID);
        return this;
    }    
    public LocalProductCriteria andUserIdGreaterThan(String value) {
        addCriterion("user_id >", value, USER_ID);
        return this;
    }    
    public LocalProductCriteria andUserIdGreaterThanOrEqualTo(String value) {
        addCriterion("user_id >=", value, USER_ID);
        return this;
    }    
    public LocalProductCriteria andUserIdLessThan(String value) {
        addCriterion("user_id <", value, USER_ID);
        return this;
    }     
    public LocalProductCriteria andUserIdLessThanOrEqualTo(String value) {
        addCriterion("user_id <=", value, USER_ID);
        return this;
    }
    public LocalProductCriteria andUserIdIn(List<String> values) {
        addCriterion("user_id in", values, USER_ID);
        return this;
    }
    public LocalProductCriteria andUserIdNotIn(List<String> values) {
        addCriterion("user_id not in", values, USER_ID);
        return this;
    }
    public LocalProductCriteria andUserIdBetween(String value1, String value2) {
        addCriterion("user_id between", value1, value2, USER_ID);
        return this;
    }
    public LocalProductCriteria andUserIdNotBetween(String value1, String value2) {
        addCriterion("user_id not between", value1, value2, USER_ID);
        return this;
    }
        public LocalProductCriteria andUserIdLike(String value) {
            addCriterion("user_id like", value, USER_ID);
            return this;
        }

        public LocalProductCriteria andUserIdNotLike(String value) {
            addCriterion("user_id not like", value, USER_ID);
            return this;
        }
    public LocalProductCriteria andNameIsNull() {
        addCriterion("name is null");
        return this;
    }

    public LocalProductCriteria andNameIsNotNull() {
        addCriterion("name is not null");
        return this;
    }
    public LocalProductCriteria andNameEqualTo(String value) {
        addCriterion("name =", value, NAME);
        return this;
    }
    public LocalProductCriteria andNameNotEqualTo(String value) {
        addCriterion("name <>", value, NAME);
        return this;
    }    
    public LocalProductCriteria andNameGreaterThan(String value) {
        addCriterion("name >", value, NAME);
        return this;
    }    
    public LocalProductCriteria andNameGreaterThanOrEqualTo(String value) {
        addCriterion("name >=", value, NAME);
        return this;
    }    
    public LocalProductCriteria andNameLessThan(String value) {
        addCriterion("name <", value, NAME);
        return this;
    }     
    public LocalProductCriteria andNameLessThanOrEqualTo(String value) {
        addCriterion("name <=", value, NAME);
        return this;
    }
    public LocalProductCriteria andNameIn(List<String> values) {
        addCriterion("name in", values, NAME);
        return this;
    }
    public LocalProductCriteria andNameNotIn(List<String> values) {
        addCriterion("name not in", values, NAME);
        return this;
    }
    public LocalProductCriteria andNameBetween(String value1, String value2) {
        addCriterion("name between", value1, value2, NAME);
        return this;
    }
    public LocalProductCriteria andNameNotBetween(String value1, String value2) {
        addCriterion("name not between", value1, value2, NAME);
        return this;
    }
        public LocalProductCriteria andNameLike(String value) {
            addCriterion("name like", value, NAME);
            return this;
        }

        public LocalProductCriteria andNameNotLike(String value) {
            addCriterion("name not like", value, NAME);
            return this;
        }
    public LocalProductCriteria andDescriptionIsNull() {
        addCriterion("description is null");
        return this;
    }

    public LocalProductCriteria andDescriptionIsNotNull() {
        addCriterion("description is not null");
        return this;
    }
    public LocalProductCriteria andDescriptionEqualTo(String value) {
        addCriterion("description =", value, DESCRIPTION);
        return this;
    }
    public LocalProductCriteria andDescriptionNotEqualTo(String value) {
        addCriterion("description <>", value, DESCRIPTION);
        return this;
    }    
    public LocalProductCriteria andDescriptionGreaterThan(String value) {
        addCriterion("description >", value, DESCRIPTION);
        return this;
    }    
    public LocalProductCriteria andDescriptionGreaterThanOrEqualTo(String value) {
        addCriterion("description >=", value, DESCRIPTION);
        return this;
    }    
    public LocalProductCriteria andDescriptionLessThan(String value) {
        addCriterion("description <", value, DESCRIPTION);
        return this;
    }     
    public LocalProductCriteria andDescriptionLessThanOrEqualTo(String value) {
        addCriterion("description <=", value, DESCRIPTION);
        return this;
    }
    public LocalProductCriteria andDescriptionIn(List<String> values) {
        addCriterion("description in", values, DESCRIPTION);
        return this;
    }
    public LocalProductCriteria andDescriptionNotIn(List<String> values) {
        addCriterion("description not in", values, DESCRIPTION);
        return this;
    }
    public LocalProductCriteria andDescriptionBetween(String value1, String value2) {
        addCriterion("description between", value1, value2, DESCRIPTION);
        return this;
    }
    public LocalProductCriteria andDescriptionNotBetween(String value1, String value2) {
        addCriterion("description not between", value1, value2, DESCRIPTION);
        return this;
    }
        public LocalProductCriteria andDescriptionLike(String value) {
            addCriterion("description like", value, DESCRIPTION);
            return this;
        }

        public LocalProductCriteria andDescriptionNotLike(String value) {
            addCriterion("description not like", value, DESCRIPTION);
            return this;
        }
    public LocalProductCriteria andOperatorIdIsNull() {
        addCriterion("operator_id is null");
        return this;
    }

    public LocalProductCriteria andOperatorIdIsNotNull() {
        addCriterion("operator_id is not null");
        return this;
    }
    public LocalProductCriteria andOperatorIdEqualTo(String value) {
        addCriterion("operator_id =", value, OPERATOR_ID);
        return this;
    }
    public LocalProductCriteria andOperatorIdNotEqualTo(String value) {
        addCriterion("operator_id <>", value, OPERATOR_ID);
        return this;
    }    
    public LocalProductCriteria andOperatorIdGreaterThan(String value) {
        addCriterion("operator_id >", value, OPERATOR_ID);
        return this;
    }    
    public LocalProductCriteria andOperatorIdGreaterThanOrEqualTo(String value) {
        addCriterion("operator_id >=", value, OPERATOR_ID);
        return this;
    }    
    public LocalProductCriteria andOperatorIdLessThan(String value) {
        addCriterion("operator_id <", value, OPERATOR_ID);
        return this;
    }     
    public LocalProductCriteria andOperatorIdLessThanOrEqualTo(String value) {
        addCriterion("operator_id <=", value, OPERATOR_ID);
        return this;
    }
    public LocalProductCriteria andOperatorIdIn(List<String> values) {
        addCriterion("operator_id in", values, OPERATOR_ID);
        return this;
    }
    public LocalProductCriteria andOperatorIdNotIn(List<String> values) {
        addCriterion("operator_id not in", values, OPERATOR_ID);
        return this;
    }
    public LocalProductCriteria andOperatorIdBetween(String value1, String value2) {
        addCriterion("operator_id between", value1, value2, OPERATOR_ID);
        return this;
    }
    public LocalProductCriteria andOperatorIdNotBetween(String value1, String value2) {
        addCriterion("operator_id not between", value1, value2, OPERATOR_ID);
        return this;
    }
        public LocalProductCriteria andOperatorIdLike(String value) {
            addCriterion("operator_id like", value, OPERATOR_ID);
            return this;
        }

        public LocalProductCriteria andOperatorIdNotLike(String value) {
            addCriterion("operator_id not like", value, OPERATOR_ID);
            return this;
        }
    public LocalProductCriteria andTimestampTimeIsNull() {
        addCriterion("timestamp_time is null");
        return this;
    }

    public LocalProductCriteria andTimestampTimeIsNotNull() {
        addCriterion("timestamp_time is not null");
        return this;
    }
    public LocalProductCriteria andTimestampTimeEqualTo(String value) {
        addCriterion("timestamp_time =", value, TIMESTAMP_TIME);
        return this;
    }
    public LocalProductCriteria andTimestampTimeNotEqualTo(String value) {
        addCriterion("timestamp_time <>", value, TIMESTAMP_TIME);
        return this;
    }    
    public LocalProductCriteria andTimestampTimeGreaterThan(String value) {
        addCriterion("timestamp_time >", value, TIMESTAMP_TIME);
        return this;
    }    
    public LocalProductCriteria andTimestampTimeGreaterThanOrEqualTo(String value) {
        addCriterion("timestamp_time >=", value, TIMESTAMP_TIME);
        return this;
    }    
    public LocalProductCriteria andTimestampTimeLessThan(String value) {
        addCriterion("timestamp_time <", value, TIMESTAMP_TIME);
        return this;
    }     
    public LocalProductCriteria andTimestampTimeLessThanOrEqualTo(String value) {
        addCriterion("timestamp_time <=", value, TIMESTAMP_TIME);
        return this;
    }
    public LocalProductCriteria andTimestampTimeIn(List<String> values) {
        addCriterion("timestamp_time in", values, TIMESTAMP_TIME);
        return this;
    }
    public LocalProductCriteria andTimestampTimeNotIn(List<String> values) {
        addCriterion("timestamp_time not in", values, TIMESTAMP_TIME);
        return this;
    }
    public LocalProductCriteria andTimestampTimeBetween(String value1, String value2) {
        addCriterion("timestamp_time between", value1, value2, TIMESTAMP_TIME);
        return this;
    }
    public LocalProductCriteria andTimestampTimeNotBetween(String value1, String value2) {
        addCriterion("timestamp_time not between", value1, value2, TIMESTAMP_TIME);
        return this;
    }
}

