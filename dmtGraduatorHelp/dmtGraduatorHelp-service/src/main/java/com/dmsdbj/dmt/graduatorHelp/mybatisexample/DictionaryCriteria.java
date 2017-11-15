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
public  class DictionaryCriteria extends GeneratedCriteria<DictionaryCriteria> implements Serializable{

    protected DictionaryCriteria() {
        super();
        criteria = new ArrayList<Criterion>();
    }

    private static final String DICT_NAME = "dictName";   
    private static final String DICT_TYPE_NAME = "dictTypeName";   
    private static final String OPERATOR_ID = "operatorId";   
    private static final String TIMESTAMP_TIME = "timestampTime";   

    public DictionaryCriteria andDictNameIsNull() {
        addCriterion("dict_name is null");
        return this;
    }

    public DictionaryCriteria andDictNameIsNotNull() {
        addCriterion("dict_name is not null");
        return this;
    }
    public DictionaryCriteria andDictNameEqualTo(String value) {
        addCriterion("dict_name =", value, DICT_NAME);
        return this;
    }
    public DictionaryCriteria andDictNameNotEqualTo(String value) {
        addCriterion("dict_name <>", value, DICT_NAME);
        return this;
    }    
    public DictionaryCriteria andDictNameGreaterThan(String value) {
        addCriterion("dict_name >", value, DICT_NAME);
        return this;
    }    
    public DictionaryCriteria andDictNameGreaterThanOrEqualTo(String value) {
        addCriterion("dict_name >=", value, DICT_NAME);
        return this;
    }    
    public DictionaryCriteria andDictNameLessThan(String value) {
        addCriterion("dict_name <", value, DICT_NAME);
        return this;
    }     
    public DictionaryCriteria andDictNameLessThanOrEqualTo(String value) {
        addCriterion("dict_name <=", value, DICT_NAME);
        return this;
    }
    public DictionaryCriteria andDictNameIn(List<String> values) {
        addCriterion("dict_name in", values, DICT_NAME);
        return this;
    }
    public DictionaryCriteria andDictNameNotIn(List<String> values) {
        addCriterion("dict_name not in", values, DICT_NAME);
        return this;
    }
    public DictionaryCriteria andDictNameBetween(String value1, String value2) {
        addCriterion("dict_name between", value1, value2, DICT_NAME);
        return this;
    }
    public DictionaryCriteria andDictNameNotBetween(String value1, String value2) {
        addCriterion("dict_name not between", value1, value2, DICT_NAME);
        return this;
    }
        public DictionaryCriteria andDictNameLike(String value) {
            addCriterion("dict_name like", value, DICT_NAME);
            return this;
        }

        public DictionaryCriteria andDictNameNotLike(String value) {
            addCriterion("dict_name not like", value, DICT_NAME);
            return this;
        }
    public DictionaryCriteria andDictTypeNameIsNull() {
        addCriterion("dict_type_name is null");
        return this;
    }

    public DictionaryCriteria andDictTypeNameIsNotNull() {
        addCriterion("dict_type_name is not null");
        return this;
    }
    public DictionaryCriteria andDictTypeNameEqualTo(String value) {
        addCriterion("dict_type_name =", value, DICT_TYPE_NAME);
        return this;
    }
    public DictionaryCriteria andDictTypeNameNotEqualTo(String value) {
        addCriterion("dict_type_name <>", value, DICT_TYPE_NAME);
        return this;
    }    
    public DictionaryCriteria andDictTypeNameGreaterThan(String value) {
        addCriterion("dict_type_name >", value, DICT_TYPE_NAME);
        return this;
    }    
    public DictionaryCriteria andDictTypeNameGreaterThanOrEqualTo(String value) {
        addCriterion("dict_type_name >=", value, DICT_TYPE_NAME);
        return this;
    }    
    public DictionaryCriteria andDictTypeNameLessThan(String value) {
        addCriterion("dict_type_name <", value, DICT_TYPE_NAME);
        return this;
    }     
    public DictionaryCriteria andDictTypeNameLessThanOrEqualTo(String value) {
        addCriterion("dict_type_name <=", value, DICT_TYPE_NAME);
        return this;
    }
    public DictionaryCriteria andDictTypeNameIn(List<String> values) {
        addCriterion("dict_type_name in", values, DICT_TYPE_NAME);
        return this;
    }
    public DictionaryCriteria andDictTypeNameNotIn(List<String> values) {
        addCriterion("dict_type_name not in", values, DICT_TYPE_NAME);
        return this;
    }
    public DictionaryCriteria andDictTypeNameBetween(String value1, String value2) {
        addCriterion("dict_type_name between", value1, value2, DICT_TYPE_NAME);
        return this;
    }
    public DictionaryCriteria andDictTypeNameNotBetween(String value1, String value2) {
        addCriterion("dict_type_name not between", value1, value2, DICT_TYPE_NAME);
        return this;
    }
        public DictionaryCriteria andDictTypeNameLike(String value) {
            addCriterion("dict_type_name like", value, DICT_TYPE_NAME);
            return this;
        }

        public DictionaryCriteria andDictTypeNameNotLike(String value) {
            addCriterion("dict_type_name not like", value, DICT_TYPE_NAME);
            return this;
        }
    public DictionaryCriteria andOperatorIdIsNull() {
        addCriterion("operator_id is null");
        return this;
    }

    public DictionaryCriteria andOperatorIdIsNotNull() {
        addCriterion("operator_id is not null");
        return this;
    }
    public DictionaryCriteria andOperatorIdEqualTo(String value) {
        addCriterion("operator_id =", value, OPERATOR_ID);
        return this;
    }
    public DictionaryCriteria andOperatorIdNotEqualTo(String value) {
        addCriterion("operator_id <>", value, OPERATOR_ID);
        return this;
    }    
    public DictionaryCriteria andOperatorIdGreaterThan(String value) {
        addCriterion("operator_id >", value, OPERATOR_ID);
        return this;
    }    
    public DictionaryCriteria andOperatorIdGreaterThanOrEqualTo(String value) {
        addCriterion("operator_id >=", value, OPERATOR_ID);
        return this;
    }    
    public DictionaryCriteria andOperatorIdLessThan(String value) {
        addCriterion("operator_id <", value, OPERATOR_ID);
        return this;
    }     
    public DictionaryCriteria andOperatorIdLessThanOrEqualTo(String value) {
        addCriterion("operator_id <=", value, OPERATOR_ID);
        return this;
    }
    public DictionaryCriteria andOperatorIdIn(List<String> values) {
        addCriterion("operator_id in", values, OPERATOR_ID);
        return this;
    }
    public DictionaryCriteria andOperatorIdNotIn(List<String> values) {
        addCriterion("operator_id not in", values, OPERATOR_ID);
        return this;
    }
    public DictionaryCriteria andOperatorIdBetween(String value1, String value2) {
        addCriterion("operator_id between", value1, value2, OPERATOR_ID);
        return this;
    }
    public DictionaryCriteria andOperatorIdNotBetween(String value1, String value2) {
        addCriterion("operator_id not between", value1, value2, OPERATOR_ID);
        return this;
    }
        public DictionaryCriteria andOperatorIdLike(String value) {
            addCriterion("operator_id like", value, OPERATOR_ID);
            return this;
        }

        public DictionaryCriteria andOperatorIdNotLike(String value) {
            addCriterion("operator_id not like", value, OPERATOR_ID);
            return this;
        }
    public DictionaryCriteria andTimestampTimeIsNull() {
        addCriterion("timestamp_time is null");
        return this;
    }

    public DictionaryCriteria andTimestampTimeIsNotNull() {
        addCriterion("timestamp_time is not null");
        return this;
    }
    public DictionaryCriteria andTimestampTimeEqualTo(String value) {
        addCriterion("timestamp_time =", value, TIMESTAMP_TIME);
        return this;
    }
    public DictionaryCriteria andTimestampTimeNotEqualTo(String value) {
        addCriterion("timestamp_time <>", value, TIMESTAMP_TIME);
        return this;
    }    
    public DictionaryCriteria andTimestampTimeGreaterThan(String value) {
        addCriterion("timestamp_time >", value, TIMESTAMP_TIME);
        return this;
    }    
    public DictionaryCriteria andTimestampTimeGreaterThanOrEqualTo(String value) {
        addCriterion("timestamp_time >=", value, TIMESTAMP_TIME);
        return this;
    }    
    public DictionaryCriteria andTimestampTimeLessThan(String value) {
        addCriterion("timestamp_time <", value, TIMESTAMP_TIME);
        return this;
    }     
    public DictionaryCriteria andTimestampTimeLessThanOrEqualTo(String value) {
        addCriterion("timestamp_time <=", value, TIMESTAMP_TIME);
        return this;
    }
    public DictionaryCriteria andTimestampTimeIn(List<String> values) {
        addCriterion("timestamp_time in", values, TIMESTAMP_TIME);
        return this;
    }
    public DictionaryCriteria andTimestampTimeNotIn(List<String> values) {
        addCriterion("timestamp_time not in", values, TIMESTAMP_TIME);
        return this;
    }
    public DictionaryCriteria andTimestampTimeBetween(String value1, String value2) {
        addCriterion("timestamp_time between", value1, value2, TIMESTAMP_TIME);
        return this;
    }
    public DictionaryCriteria andTimestampTimeNotBetween(String value1, String value2) {
        addCriterion("timestamp_time not between", value1, value2, TIMESTAMP_TIME);
        return this;
    }
}

