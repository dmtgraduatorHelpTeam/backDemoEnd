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
public  class PictureCriteria extends GeneratedCriteria<PictureCriteria> implements Serializable{

    protected PictureCriteria() {
        super();
        criteria = new ArrayList<Criterion>();
    }

    private static final String USER_ID = "userId";   
    private static final String PICTURE_TYPE_ID = "pictureTypeId";   
    private static final String DESCRIPTION = "description";   
    private static final String OPERATOR_ID = "operatorId";   
    private static final String TIMESTAMP_TIME = "timestampTime";   

    public PictureCriteria andUserIdIsNull() {
        addCriterion("user_id is null");
        return this;
    }

    public PictureCriteria andUserIdIsNotNull() {
        addCriterion("user_id is not null");
        return this;
    }
    public PictureCriteria andUserIdEqualTo(String value) {
        addCriterion("user_id =", value, USER_ID);
        return this;
    }
    public PictureCriteria andUserIdNotEqualTo(String value) {
        addCriterion("user_id <>", value, USER_ID);
        return this;
    }    
    public PictureCriteria andUserIdGreaterThan(String value) {
        addCriterion("user_id >", value, USER_ID);
        return this;
    }    
    public PictureCriteria andUserIdGreaterThanOrEqualTo(String value) {
        addCriterion("user_id >=", value, USER_ID);
        return this;
    }    
    public PictureCriteria andUserIdLessThan(String value) {
        addCriterion("user_id <", value, USER_ID);
        return this;
    }     
    public PictureCriteria andUserIdLessThanOrEqualTo(String value) {
        addCriterion("user_id <=", value, USER_ID);
        return this;
    }
    public PictureCriteria andUserIdIn(List<String> values) {
        addCriterion("user_id in", values, USER_ID);
        return this;
    }
    public PictureCriteria andUserIdNotIn(List<String> values) {
        addCriterion("user_id not in", values, USER_ID);
        return this;
    }
    public PictureCriteria andUserIdBetween(String value1, String value2) {
        addCriterion("user_id between", value1, value2, USER_ID);
        return this;
    }
    public PictureCriteria andUserIdNotBetween(String value1, String value2) {
        addCriterion("user_id not between", value1, value2, USER_ID);
        return this;
    }
        public PictureCriteria andUserIdLike(String value) {
            addCriterion("user_id like", value, USER_ID);
            return this;
        }

        public PictureCriteria andUserIdNotLike(String value) {
            addCriterion("user_id not like", value, USER_ID);
            return this;
        }
    public PictureCriteria andPictureTypeIdIsNull() {
        addCriterion("picture_type_id is null");
        return this;
    }

    public PictureCriteria andPictureTypeIdIsNotNull() {
        addCriterion("picture_type_id is not null");
        return this;
    }
    public PictureCriteria andPictureTypeIdEqualTo(String value) {
        addCriterion("picture_type_id =", value, PICTURE_TYPE_ID);
        return this;
    }
    public PictureCriteria andPictureTypeIdNotEqualTo(String value) {
        addCriterion("picture_type_id <>", value, PICTURE_TYPE_ID);
        return this;
    }    
    public PictureCriteria andPictureTypeIdGreaterThan(String value) {
        addCriterion("picture_type_id >", value, PICTURE_TYPE_ID);
        return this;
    }    
    public PictureCriteria andPictureTypeIdGreaterThanOrEqualTo(String value) {
        addCriterion("picture_type_id >=", value, PICTURE_TYPE_ID);
        return this;
    }    
    public PictureCriteria andPictureTypeIdLessThan(String value) {
        addCriterion("picture_type_id <", value, PICTURE_TYPE_ID);
        return this;
    }     
    public PictureCriteria andPictureTypeIdLessThanOrEqualTo(String value) {
        addCriterion("picture_type_id <=", value, PICTURE_TYPE_ID);
        return this;
    }
    public PictureCriteria andPictureTypeIdIn(List<String> values) {
        addCriterion("picture_type_id in", values, PICTURE_TYPE_ID);
        return this;
    }
    public PictureCriteria andPictureTypeIdNotIn(List<String> values) {
        addCriterion("picture_type_id not in", values, PICTURE_TYPE_ID);
        return this;
    }
    public PictureCriteria andPictureTypeIdBetween(String value1, String value2) {
        addCriterion("picture_type_id between", value1, value2, PICTURE_TYPE_ID);
        return this;
    }
    public PictureCriteria andPictureTypeIdNotBetween(String value1, String value2) {
        addCriterion("picture_type_id not between", value1, value2, PICTURE_TYPE_ID);
        return this;
    }
        public PictureCriteria andPictureTypeIdLike(String value) {
            addCriterion("picture_type_id like", value, PICTURE_TYPE_ID);
            return this;
        }

        public PictureCriteria andPictureTypeIdNotLike(String value) {
            addCriterion("picture_type_id not like", value, PICTURE_TYPE_ID);
            return this;
        }
    public PictureCriteria andDescriptionIsNull() {
        addCriterion("description is null");
        return this;
    }

    public PictureCriteria andDescriptionIsNotNull() {
        addCriterion("description is not null");
        return this;
    }
    public PictureCriteria andDescriptionEqualTo(String value) {
        addCriterion("description =", value, DESCRIPTION);
        return this;
    }
    public PictureCriteria andDescriptionNotEqualTo(String value) {
        addCriterion("description <>", value, DESCRIPTION);
        return this;
    }    
    public PictureCriteria andDescriptionGreaterThan(String value) {
        addCriterion("description >", value, DESCRIPTION);
        return this;
    }    
    public PictureCriteria andDescriptionGreaterThanOrEqualTo(String value) {
        addCriterion("description >=", value, DESCRIPTION);
        return this;
    }    
    public PictureCriteria andDescriptionLessThan(String value) {
        addCriterion("description <", value, DESCRIPTION);
        return this;
    }     
    public PictureCriteria andDescriptionLessThanOrEqualTo(String value) {
        addCriterion("description <=", value, DESCRIPTION);
        return this;
    }
    public PictureCriteria andDescriptionIn(List<String> values) {
        addCriterion("description in", values, DESCRIPTION);
        return this;
    }
    public PictureCriteria andDescriptionNotIn(List<String> values) {
        addCriterion("description not in", values, DESCRIPTION);
        return this;
    }
    public PictureCriteria andDescriptionBetween(String value1, String value2) {
        addCriterion("description between", value1, value2, DESCRIPTION);
        return this;
    }
    public PictureCriteria andDescriptionNotBetween(String value1, String value2) {
        addCriterion("description not between", value1, value2, DESCRIPTION);
        return this;
    }
        public PictureCriteria andDescriptionLike(String value) {
            addCriterion("description like", value, DESCRIPTION);
            return this;
        }

        public PictureCriteria andDescriptionNotLike(String value) {
            addCriterion("description not like", value, DESCRIPTION);
            return this;
        }
    public PictureCriteria andOperatorIdIsNull() {
        addCriterion("operator_id is null");
        return this;
    }

    public PictureCriteria andOperatorIdIsNotNull() {
        addCriterion("operator_id is not null");
        return this;
    }
    public PictureCriteria andOperatorIdEqualTo(String value) {
        addCriterion("operator_id =", value, OPERATOR_ID);
        return this;
    }
    public PictureCriteria andOperatorIdNotEqualTo(String value) {
        addCriterion("operator_id <>", value, OPERATOR_ID);
        return this;
    }    
    public PictureCriteria andOperatorIdGreaterThan(String value) {
        addCriterion("operator_id >", value, OPERATOR_ID);
        return this;
    }    
    public PictureCriteria andOperatorIdGreaterThanOrEqualTo(String value) {
        addCriterion("operator_id >=", value, OPERATOR_ID);
        return this;
    }    
    public PictureCriteria andOperatorIdLessThan(String value) {
        addCriterion("operator_id <", value, OPERATOR_ID);
        return this;
    }     
    public PictureCriteria andOperatorIdLessThanOrEqualTo(String value) {
        addCriterion("operator_id <=", value, OPERATOR_ID);
        return this;
    }
    public PictureCriteria andOperatorIdIn(List<String> values) {
        addCriterion("operator_id in", values, OPERATOR_ID);
        return this;
    }
    public PictureCriteria andOperatorIdNotIn(List<String> values) {
        addCriterion("operator_id not in", values, OPERATOR_ID);
        return this;
    }
    public PictureCriteria andOperatorIdBetween(String value1, String value2) {
        addCriterion("operator_id between", value1, value2, OPERATOR_ID);
        return this;
    }
    public PictureCriteria andOperatorIdNotBetween(String value1, String value2) {
        addCriterion("operator_id not between", value1, value2, OPERATOR_ID);
        return this;
    }
        public PictureCriteria andOperatorIdLike(String value) {
            addCriterion("operator_id like", value, OPERATOR_ID);
            return this;
        }

        public PictureCriteria andOperatorIdNotLike(String value) {
            addCriterion("operator_id not like", value, OPERATOR_ID);
            return this;
        }
    public PictureCriteria andTimestampTimeIsNull() {
        addCriterion("timestamp_time is null");
        return this;
    }

    public PictureCriteria andTimestampTimeIsNotNull() {
        addCriterion("timestamp_time is not null");
        return this;
    }
    public PictureCriteria andTimestampTimeEqualTo(String value) {
        addCriterion("timestamp_time =", value, TIMESTAMP_TIME);
        return this;
    }
    public PictureCriteria andTimestampTimeNotEqualTo(String value) {
        addCriterion("timestamp_time <>", value, TIMESTAMP_TIME);
        return this;
    }    
    public PictureCriteria andTimestampTimeGreaterThan(String value) {
        addCriterion("timestamp_time >", value, TIMESTAMP_TIME);
        return this;
    }    
    public PictureCriteria andTimestampTimeGreaterThanOrEqualTo(String value) {
        addCriterion("timestamp_time >=", value, TIMESTAMP_TIME);
        return this;
    }    
    public PictureCriteria andTimestampTimeLessThan(String value) {
        addCriterion("timestamp_time <", value, TIMESTAMP_TIME);
        return this;
    }     
    public PictureCriteria andTimestampTimeLessThanOrEqualTo(String value) {
        addCriterion("timestamp_time <=", value, TIMESTAMP_TIME);
        return this;
    }
    public PictureCriteria andTimestampTimeIn(List<String> values) {
        addCriterion("timestamp_time in", values, TIMESTAMP_TIME);
        return this;
    }
    public PictureCriteria andTimestampTimeNotIn(List<String> values) {
        addCriterion("timestamp_time not in", values, TIMESTAMP_TIME);
        return this;
    }
    public PictureCriteria andTimestampTimeBetween(String value1, String value2) {
        addCriterion("timestamp_time between", value1, value2, TIMESTAMP_TIME);
        return this;
    }
    public PictureCriteria andTimestampTimeNotBetween(String value1, String value2) {
        addCriterion("timestamp_time not between", value1, value2, TIMESTAMP_TIME);
        return this;
    }
}

