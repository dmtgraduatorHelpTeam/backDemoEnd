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
public  class CommercialOppotunityCriteria extends GeneratedCriteria<CommercialOppotunityCriteria> implements Serializable{

    protected CommercialOppotunityCriteria() {
        super();
        criteria = new ArrayList<Criterion>();
    }

    private static final String USER_ID = "userId";   
    private static final String NAME = "name";   
    private static final String DESCRIPTION = "description";   
    private static final String OPERATOR_ID = "operatorId";   
    private static final String TIMESTAMP_TIME = "timestampTime";   

    public CommercialOppotunityCriteria andUserIdIsNull() {
        addCriterion("user_id is null");
        return this;
    }

    public CommercialOppotunityCriteria andUserIdIsNotNull() {
        addCriterion("user_id is not null");
        return this;
    }
    public CommercialOppotunityCriteria andUserIdEqualTo(String value) {
        addCriterion("user_id =", value, USER_ID);
        return this;
    }
    public CommercialOppotunityCriteria andUserIdNotEqualTo(String value) {
        addCriterion("user_id <>", value, USER_ID);
        return this;
    }    
    public CommercialOppotunityCriteria andUserIdGreaterThan(String value) {
        addCriterion("user_id >", value, USER_ID);
        return this;
    }    
    public CommercialOppotunityCriteria andUserIdGreaterThanOrEqualTo(String value) {
        addCriterion("user_id >=", value, USER_ID);
        return this;
    }    
    public CommercialOppotunityCriteria andUserIdLessThan(String value) {
        addCriterion("user_id <", value, USER_ID);
        return this;
    }     
    public CommercialOppotunityCriteria andUserIdLessThanOrEqualTo(String value) {
        addCriterion("user_id <=", value, USER_ID);
        return this;
    }
    public CommercialOppotunityCriteria andUserIdIn(List<String> values) {
        addCriterion("user_id in", values, USER_ID);
        return this;
    }
    public CommercialOppotunityCriteria andUserIdNotIn(List<String> values) {
        addCriterion("user_id not in", values, USER_ID);
        return this;
    }
    public CommercialOppotunityCriteria andUserIdBetween(String value1, String value2) {
        addCriterion("user_id between", value1, value2, USER_ID);
        return this;
    }
    public CommercialOppotunityCriteria andUserIdNotBetween(String value1, String value2) {
        addCriterion("user_id not between", value1, value2, USER_ID);
        return this;
    }
        public CommercialOppotunityCriteria andUserIdLike(String value) {
            addCriterion("user_id like", value, USER_ID);
            return this;
        }

        public CommercialOppotunityCriteria andUserIdNotLike(String value) {
            addCriterion("user_id not like", value, USER_ID);
            return this;
        }
    public CommercialOppotunityCriteria andNameIsNull() {
        addCriterion("name is null");
        return this;
    }

    public CommercialOppotunityCriteria andNameIsNotNull() {
        addCriterion("name is not null");
        return this;
    }
    public CommercialOppotunityCriteria andNameEqualTo(String value) {
        addCriterion("name =", value, NAME);
        return this;
    }
    public CommercialOppotunityCriteria andNameNotEqualTo(String value) {
        addCriterion("name <>", value, NAME);
        return this;
    }    
    public CommercialOppotunityCriteria andNameGreaterThan(String value) {
        addCriterion("name >", value, NAME);
        return this;
    }    
    public CommercialOppotunityCriteria andNameGreaterThanOrEqualTo(String value) {
        addCriterion("name >=", value, NAME);
        return this;
    }    
    public CommercialOppotunityCriteria andNameLessThan(String value) {
        addCriterion("name <", value, NAME);
        return this;
    }     
    public CommercialOppotunityCriteria andNameLessThanOrEqualTo(String value) {
        addCriterion("name <=", value, NAME);
        return this;
    }
    public CommercialOppotunityCriteria andNameIn(List<String> values) {
        addCriterion("name in", values, NAME);
        return this;
    }
    public CommercialOppotunityCriteria andNameNotIn(List<String> values) {
        addCriterion("name not in", values, NAME);
        return this;
    }
    public CommercialOppotunityCriteria andNameBetween(String value1, String value2) {
        addCriterion("name between", value1, value2, NAME);
        return this;
    }
    public CommercialOppotunityCriteria andNameNotBetween(String value1, String value2) {
        addCriterion("name not between", value1, value2, NAME);
        return this;
    }
        public CommercialOppotunityCriteria andNameLike(String value) {
            addCriterion("name like", value, NAME);
            return this;
        }

        public CommercialOppotunityCriteria andNameNotLike(String value) {
            addCriterion("name not like", value, NAME);
            return this;
        }
    public CommercialOppotunityCriteria andDescriptionIsNull() {
        addCriterion("description is null");
        return this;
    }

    public CommercialOppotunityCriteria andDescriptionIsNotNull() {
        addCriterion("description is not null");
        return this;
    }
    public CommercialOppotunityCriteria andDescriptionEqualTo(String value) {
        addCriterion("description =", value, DESCRIPTION);
        return this;
    }
    public CommercialOppotunityCriteria andDescriptionNotEqualTo(String value) {
        addCriterion("description <>", value, DESCRIPTION);
        return this;
    }    
    public CommercialOppotunityCriteria andDescriptionGreaterThan(String value) {
        addCriterion("description >", value, DESCRIPTION);
        return this;
    }    
    public CommercialOppotunityCriteria andDescriptionGreaterThanOrEqualTo(String value) {
        addCriterion("description >=", value, DESCRIPTION);
        return this;
    }    
    public CommercialOppotunityCriteria andDescriptionLessThan(String value) {
        addCriterion("description <", value, DESCRIPTION);
        return this;
    }     
    public CommercialOppotunityCriteria andDescriptionLessThanOrEqualTo(String value) {
        addCriterion("description <=", value, DESCRIPTION);
        return this;
    }
    public CommercialOppotunityCriteria andDescriptionIn(List<String> values) {
        addCriterion("description in", values, DESCRIPTION);
        return this;
    }
    public CommercialOppotunityCriteria andDescriptionNotIn(List<String> values) {
        addCriterion("description not in", values, DESCRIPTION);
        return this;
    }
    public CommercialOppotunityCriteria andDescriptionBetween(String value1, String value2) {
        addCriterion("description between", value1, value2, DESCRIPTION);
        return this;
    }
    public CommercialOppotunityCriteria andDescriptionNotBetween(String value1, String value2) {
        addCriterion("description not between", value1, value2, DESCRIPTION);
        return this;
    }
        public CommercialOppotunityCriteria andDescriptionLike(String value) {
            addCriterion("description like", value, DESCRIPTION);
            return this;
        }

        public CommercialOppotunityCriteria andDescriptionNotLike(String value) {
            addCriterion("description not like", value, DESCRIPTION);
            return this;
        }
    public CommercialOppotunityCriteria andOperatorIdIsNull() {
        addCriterion("operator_id is null");
        return this;
    }

    public CommercialOppotunityCriteria andOperatorIdIsNotNull() {
        addCriterion("operator_id is not null");
        return this;
    }
    public CommercialOppotunityCriteria andOperatorIdEqualTo(String value) {
        addCriterion("operator_id =", value, OPERATOR_ID);
        return this;
    }
    public CommercialOppotunityCriteria andOperatorIdNotEqualTo(String value) {
        addCriterion("operator_id <>", value, OPERATOR_ID);
        return this;
    }    
    public CommercialOppotunityCriteria andOperatorIdGreaterThan(String value) {
        addCriterion("operator_id >", value, OPERATOR_ID);
        return this;
    }    
    public CommercialOppotunityCriteria andOperatorIdGreaterThanOrEqualTo(String value) {
        addCriterion("operator_id >=", value, OPERATOR_ID);
        return this;
    }    
    public CommercialOppotunityCriteria andOperatorIdLessThan(String value) {
        addCriterion("operator_id <", value, OPERATOR_ID);
        return this;
    }     
    public CommercialOppotunityCriteria andOperatorIdLessThanOrEqualTo(String value) {
        addCriterion("operator_id <=", value, OPERATOR_ID);
        return this;
    }
    public CommercialOppotunityCriteria andOperatorIdIn(List<String> values) {
        addCriterion("operator_id in", values, OPERATOR_ID);
        return this;
    }
    public CommercialOppotunityCriteria andOperatorIdNotIn(List<String> values) {
        addCriterion("operator_id not in", values, OPERATOR_ID);
        return this;
    }
    public CommercialOppotunityCriteria andOperatorIdBetween(String value1, String value2) {
        addCriterion("operator_id between", value1, value2, OPERATOR_ID);
        return this;
    }
    public CommercialOppotunityCriteria andOperatorIdNotBetween(String value1, String value2) {
        addCriterion("operator_id not between", value1, value2, OPERATOR_ID);
        return this;
    }
        public CommercialOppotunityCriteria andOperatorIdLike(String value) {
            addCriterion("operator_id like", value, OPERATOR_ID);
            return this;
        }

        public CommercialOppotunityCriteria andOperatorIdNotLike(String value) {
            addCriterion("operator_id not like", value, OPERATOR_ID);
            return this;
        }
    public CommercialOppotunityCriteria andTimestampTimeIsNull() {
        addCriterion("timestamp_time is null");
        return this;
    }

    public CommercialOppotunityCriteria andTimestampTimeIsNotNull() {
        addCriterion("timestamp_time is not null");
        return this;
    }
    public CommercialOppotunityCriteria andTimestampTimeEqualTo(String value) {
        addCriterion("timestamp_time =", value, TIMESTAMP_TIME);
        return this;
    }
    public CommercialOppotunityCriteria andTimestampTimeNotEqualTo(String value) {
        addCriterion("timestamp_time <>", value, TIMESTAMP_TIME);
        return this;
    }    
    public CommercialOppotunityCriteria andTimestampTimeGreaterThan(String value) {
        addCriterion("timestamp_time >", value, TIMESTAMP_TIME);
        return this;
    }    
    public CommercialOppotunityCriteria andTimestampTimeGreaterThanOrEqualTo(String value) {
        addCriterion("timestamp_time >=", value, TIMESTAMP_TIME);
        return this;
    }    
    public CommercialOppotunityCriteria andTimestampTimeLessThan(String value) {
        addCriterion("timestamp_time <", value, TIMESTAMP_TIME);
        return this;
    }     
    public CommercialOppotunityCriteria andTimestampTimeLessThanOrEqualTo(String value) {
        addCriterion("timestamp_time <=", value, TIMESTAMP_TIME);
        return this;
    }
    public CommercialOppotunityCriteria andTimestampTimeIn(List<String> values) {
        addCriterion("timestamp_time in", values, TIMESTAMP_TIME);
        return this;
    }
    public CommercialOppotunityCriteria andTimestampTimeNotIn(List<String> values) {
        addCriterion("timestamp_time not in", values, TIMESTAMP_TIME);
        return this;
    }
    public CommercialOppotunityCriteria andTimestampTimeBetween(String value1, String value2) {
        addCriterion("timestamp_time between", value1, value2, TIMESTAMP_TIME);
        return this;
    }
    public CommercialOppotunityCriteria andTimestampTimeNotBetween(String value1, String value2) {
        addCriterion("timestamp_time not between", value1, value2, TIMESTAMP_TIME);
        return this;
    }
}

