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
public  class EducationCriteria extends GeneratedCriteria<EducationCriteria> implements Serializable{

    protected EducationCriteria() {
        super();
        criteria = new ArrayList<Criterion>();
    }

    private static final String USER_ID = "userId";   
    private static final String IS_IN_DMT = "isInDmt";   
    private static final String CERTIFICATE_NO = "certificateNo";   
    private static final String CERTIFICATE_NAME = "certificateName";   
    private static final String CERTIFICATE_TYPE = "certificateType";   
    private static final String RECEIVE_TIME = "receiveTime";   
    private static final String OPERATOR_ID = "operatorId";   
    private static final String TIMESTAMP_TIME = "timestampTime";   

    public EducationCriteria andUserIdIsNull() {
        addCriterion("user_id is null");
        return this;
    }

    public EducationCriteria andUserIdIsNotNull() {
        addCriterion("user_id is not null");
        return this;
    }
    public EducationCriteria andUserIdEqualTo(String value) {
        addCriterion("user_id =", value, USER_ID);
        return this;
    }
    public EducationCriteria andUserIdNotEqualTo(String value) {
        addCriterion("user_id <>", value, USER_ID);
        return this;
    }    
    public EducationCriteria andUserIdGreaterThan(String value) {
        addCriterion("user_id >", value, USER_ID);
        return this;
    }    
    public EducationCriteria andUserIdGreaterThanOrEqualTo(String value) {
        addCriterion("user_id >=", value, USER_ID);
        return this;
    }    
    public EducationCriteria andUserIdLessThan(String value) {
        addCriterion("user_id <", value, USER_ID);
        return this;
    }     
    public EducationCriteria andUserIdLessThanOrEqualTo(String value) {
        addCriterion("user_id <=", value, USER_ID);
        return this;
    }
    public EducationCriteria andUserIdIn(List<String> values) {
        addCriterion("user_id in", values, USER_ID);
        return this;
    }
    public EducationCriteria andUserIdNotIn(List<String> values) {
        addCriterion("user_id not in", values, USER_ID);
        return this;
    }
    public EducationCriteria andUserIdBetween(String value1, String value2) {
        addCriterion("user_id between", value1, value2, USER_ID);
        return this;
    }
    public EducationCriteria andUserIdNotBetween(String value1, String value2) {
        addCriterion("user_id not between", value1, value2, USER_ID);
        return this;
    }
        public EducationCriteria andUserIdLike(String value) {
            addCriterion("user_id like", value, USER_ID);
            return this;
        }

        public EducationCriteria andUserIdNotLike(String value) {
            addCriterion("user_id not like", value, USER_ID);
            return this;
        }
    public EducationCriteria andIsInDmtIsNull() {
        addCriterion("is_In_dmt is null");
        return this;
    }

    public EducationCriteria andIsInDmtIsNotNull() {
        addCriterion("is_In_dmt is not null");
        return this;
    }
    public EducationCriteria andIsInDmtEqualTo(Integer value) {
        addCriterion("is_In_dmt =", value, IS_IN_DMT);
        return this;
    }
    public EducationCriteria andIsInDmtNotEqualTo(Integer value) {
        addCriterion("is_In_dmt <>", value, IS_IN_DMT);
        return this;
    }    
    public EducationCriteria andIsInDmtGreaterThan(Integer value) {
        addCriterion("is_In_dmt >", value, IS_IN_DMT);
        return this;
    }    
    public EducationCriteria andIsInDmtGreaterThanOrEqualTo(Integer value) {
        addCriterion("is_In_dmt >=", value, IS_IN_DMT);
        return this;
    }    
    public EducationCriteria andIsInDmtLessThan(Integer value) {
        addCriterion("is_In_dmt <", value, IS_IN_DMT);
        return this;
    }     
    public EducationCriteria andIsInDmtLessThanOrEqualTo(Integer value) {
        addCriterion("is_In_dmt <=", value, IS_IN_DMT);
        return this;
    }
    public EducationCriteria andIsInDmtIn(List<Integer> values) {
        addCriterion("is_In_dmt in", values, IS_IN_DMT);
        return this;
    }
    public EducationCriteria andIsInDmtNotIn(List<Integer> values) {
        addCriterion("is_In_dmt not in", values, IS_IN_DMT);
        return this;
    }
    public EducationCriteria andIsInDmtBetween(Integer value1, Integer value2) {
        addCriterion("is_In_dmt between", value1, value2, IS_IN_DMT);
        return this;
    }
    public EducationCriteria andIsInDmtNotBetween(Integer value1, Integer value2) {
        addCriterion("is_In_dmt not between", value1, value2, IS_IN_DMT);
        return this;
    }
    public EducationCriteria andCertificateNoIsNull() {
        addCriterion("certificate_no is null");
        return this;
    }

    public EducationCriteria andCertificateNoIsNotNull() {
        addCriterion("certificate_no is not null");
        return this;
    }
    public EducationCriteria andCertificateNoEqualTo(String value) {
        addCriterion("certificate_no =", value, CERTIFICATE_NO);
        return this;
    }
    public EducationCriteria andCertificateNoNotEqualTo(String value) {
        addCriterion("certificate_no <>", value, CERTIFICATE_NO);
        return this;
    }    
    public EducationCriteria andCertificateNoGreaterThan(String value) {
        addCriterion("certificate_no >", value, CERTIFICATE_NO);
        return this;
    }    
    public EducationCriteria andCertificateNoGreaterThanOrEqualTo(String value) {
        addCriterion("certificate_no >=", value, CERTIFICATE_NO);
        return this;
    }    
    public EducationCriteria andCertificateNoLessThan(String value) {
        addCriterion("certificate_no <", value, CERTIFICATE_NO);
        return this;
    }     
    public EducationCriteria andCertificateNoLessThanOrEqualTo(String value) {
        addCriterion("certificate_no <=", value, CERTIFICATE_NO);
        return this;
    }
    public EducationCriteria andCertificateNoIn(List<String> values) {
        addCriterion("certificate_no in", values, CERTIFICATE_NO);
        return this;
    }
    public EducationCriteria andCertificateNoNotIn(List<String> values) {
        addCriterion("certificate_no not in", values, CERTIFICATE_NO);
        return this;
    }
    public EducationCriteria andCertificateNoBetween(String value1, String value2) {
        addCriterion("certificate_no between", value1, value2, CERTIFICATE_NO);
        return this;
    }
    public EducationCriteria andCertificateNoNotBetween(String value1, String value2) {
        addCriterion("certificate_no not between", value1, value2, CERTIFICATE_NO);
        return this;
    }
        public EducationCriteria andCertificateNoLike(String value) {
            addCriterion("certificate_no like", value, CERTIFICATE_NO);
            return this;
        }

        public EducationCriteria andCertificateNoNotLike(String value) {
            addCriterion("certificate_no not like", value, CERTIFICATE_NO);
            return this;
        }
    public EducationCriteria andCertificateNameIsNull() {
        addCriterion("certificate_name is null");
        return this;
    }

    public EducationCriteria andCertificateNameIsNotNull() {
        addCriterion("certificate_name is not null");
        return this;
    }
    public EducationCriteria andCertificateNameEqualTo(String value) {
        addCriterion("certificate_name =", value, CERTIFICATE_NAME);
        return this;
    }
    public EducationCriteria andCertificateNameNotEqualTo(String value) {
        addCriterion("certificate_name <>", value, CERTIFICATE_NAME);
        return this;
    }    
    public EducationCriteria andCertificateNameGreaterThan(String value) {
        addCriterion("certificate_name >", value, CERTIFICATE_NAME);
        return this;
    }    
    public EducationCriteria andCertificateNameGreaterThanOrEqualTo(String value) {
        addCriterion("certificate_name >=", value, CERTIFICATE_NAME);
        return this;
    }    
    public EducationCriteria andCertificateNameLessThan(String value) {
        addCriterion("certificate_name <", value, CERTIFICATE_NAME);
        return this;
    }     
    public EducationCriteria andCertificateNameLessThanOrEqualTo(String value) {
        addCriterion("certificate_name <=", value, CERTIFICATE_NAME);
        return this;
    }
    public EducationCriteria andCertificateNameIn(List<String> values) {
        addCriterion("certificate_name in", values, CERTIFICATE_NAME);
        return this;
    }
    public EducationCriteria andCertificateNameNotIn(List<String> values) {
        addCriterion("certificate_name not in", values, CERTIFICATE_NAME);
        return this;
    }
    public EducationCriteria andCertificateNameBetween(String value1, String value2) {
        addCriterion("certificate_name between", value1, value2, CERTIFICATE_NAME);
        return this;
    }
    public EducationCriteria andCertificateNameNotBetween(String value1, String value2) {
        addCriterion("certificate_name not between", value1, value2, CERTIFICATE_NAME);
        return this;
    }
        public EducationCriteria andCertificateNameLike(String value) {
            addCriterion("certificate_name like", value, CERTIFICATE_NAME);
            return this;
        }

        public EducationCriteria andCertificateNameNotLike(String value) {
            addCriterion("certificate_name not like", value, CERTIFICATE_NAME);
            return this;
        }
    public EducationCriteria andCertificateTypeIsNull() {
        addCriterion("certificate_type is null");
        return this;
    }

    public EducationCriteria andCertificateTypeIsNotNull() {
        addCriterion("certificate_type is not null");
        return this;
    }
    public EducationCriteria andCertificateTypeEqualTo(Byte value) {
        addCriterion("certificate_type =", value, CERTIFICATE_TYPE);
        return this;
    }
    public EducationCriteria andCertificateTypeNotEqualTo(Byte value) {
        addCriterion("certificate_type <>", value, CERTIFICATE_TYPE);
        return this;
    }    
    public EducationCriteria andCertificateTypeGreaterThan(Byte value) {
        addCriterion("certificate_type >", value, CERTIFICATE_TYPE);
        return this;
    }    
    public EducationCriteria andCertificateTypeGreaterThanOrEqualTo(Byte value) {
        addCriterion("certificate_type >=", value, CERTIFICATE_TYPE);
        return this;
    }    
    public EducationCriteria andCertificateTypeLessThan(Byte value) {
        addCriterion("certificate_type <", value, CERTIFICATE_TYPE);
        return this;
    }     
    public EducationCriteria andCertificateTypeLessThanOrEqualTo(Byte value) {
        addCriterion("certificate_type <=", value, CERTIFICATE_TYPE);
        return this;
    }
    public EducationCriteria andCertificateTypeIn(List<Byte> values) {
        addCriterion("certificate_type in", values, CERTIFICATE_TYPE);
        return this;
    }
    public EducationCriteria andCertificateTypeNotIn(List<Byte> values) {
        addCriterion("certificate_type not in", values, CERTIFICATE_TYPE);
        return this;
    }
    public EducationCriteria andCertificateTypeBetween(Byte value1, Byte value2) {
        addCriterion("certificate_type between", value1, value2, CERTIFICATE_TYPE);
        return this;
    }
    public EducationCriteria andCertificateTypeNotBetween(Byte value1, Byte value2) {
        addCriterion("certificate_type not between", value1, value2, CERTIFICATE_TYPE);
        return this;
    }
    public EducationCriteria andReceiveTimeIsNull() {
        addCriterion("receive_time is null");
        return this;
    }

    public EducationCriteria andReceiveTimeIsNotNull() {
        addCriterion("receive_time is not null");
        return this;
    }
    public EducationCriteria andReceiveTimeEqualTo(Date value) {
        addCriterion("receive_time =", value, RECEIVE_TIME);
        return this;
    }
    public EducationCriteria andReceiveTimeNotEqualTo(Date value) {
        addCriterion("receive_time <>", value, RECEIVE_TIME);
        return this;
    }    
    public EducationCriteria andReceiveTimeGreaterThan(Date value) {
        addCriterion("receive_time >", value, RECEIVE_TIME);
        return this;
    }    
    public EducationCriteria andReceiveTimeGreaterThanOrEqualTo(Date value) {
        addCriterion("receive_time >=", value, RECEIVE_TIME);
        return this;
    }    
    public EducationCriteria andReceiveTimeLessThan(Date value) {
        addCriterion("receive_time <", value, RECEIVE_TIME);
        return this;
    }     
    public EducationCriteria andReceiveTimeLessThanOrEqualTo(Date value) {
        addCriterion("receive_time <=", value, RECEIVE_TIME);
        return this;
    }
    public EducationCriteria andReceiveTimeIn(List<Date> values) {
        addCriterion("receive_time in", values, RECEIVE_TIME);
        return this;
    }
    public EducationCriteria andReceiveTimeNotIn(List<Date> values) {
        addCriterion("receive_time not in", values, RECEIVE_TIME);
        return this;
    }
    public EducationCriteria andReceiveTimeBetween(Date value1, Date value2) {
        addCriterion("receive_time between", value1, value2, RECEIVE_TIME);
        return this;
    }
    public EducationCriteria andReceiveTimeNotBetween(Date value1, Date value2) {
        addCriterion("receive_time not between", value1, value2, RECEIVE_TIME);
        return this;
    }
    public EducationCriteria andOperatorIdIsNull() {
        addCriterion("operator_id is null");
        return this;
    }

    public EducationCriteria andOperatorIdIsNotNull() {
        addCriterion("operator_id is not null");
        return this;
    }
    public EducationCriteria andOperatorIdEqualTo(String value) {
        addCriterion("operator_id =", value, OPERATOR_ID);
        return this;
    }
    public EducationCriteria andOperatorIdNotEqualTo(String value) {
        addCriterion("operator_id <>", value, OPERATOR_ID);
        return this;
    }    
    public EducationCriteria andOperatorIdGreaterThan(String value) {
        addCriterion("operator_id >", value, OPERATOR_ID);
        return this;
    }    
    public EducationCriteria andOperatorIdGreaterThanOrEqualTo(String value) {
        addCriterion("operator_id >=", value, OPERATOR_ID);
        return this;
    }    
    public EducationCriteria andOperatorIdLessThan(String value) {
        addCriterion("operator_id <", value, OPERATOR_ID);
        return this;
    }     
    public EducationCriteria andOperatorIdLessThanOrEqualTo(String value) {
        addCriterion("operator_id <=", value, OPERATOR_ID);
        return this;
    }
    public EducationCriteria andOperatorIdIn(List<String> values) {
        addCriterion("operator_id in", values, OPERATOR_ID);
        return this;
    }
    public EducationCriteria andOperatorIdNotIn(List<String> values) {
        addCriterion("operator_id not in", values, OPERATOR_ID);
        return this;
    }
    public EducationCriteria andOperatorIdBetween(String value1, String value2) {
        addCriterion("operator_id between", value1, value2, OPERATOR_ID);
        return this;
    }
    public EducationCriteria andOperatorIdNotBetween(String value1, String value2) {
        addCriterion("operator_id not between", value1, value2, OPERATOR_ID);
        return this;
    }
        public EducationCriteria andOperatorIdLike(String value) {
            addCriterion("operator_id like", value, OPERATOR_ID);
            return this;
        }

        public EducationCriteria andOperatorIdNotLike(String value) {
            addCriterion("operator_id not like", value, OPERATOR_ID);
            return this;
        }
    public EducationCriteria andTimestampTimeIsNull() {
        addCriterion("timestamp_time is null");
        return this;
    }

    public EducationCriteria andTimestampTimeIsNotNull() {
        addCriterion("timestamp_time is not null");
        return this;
    }
    public EducationCriteria andTimestampTimeEqualTo(String value) {
        addCriterion("timestamp_time =", value, TIMESTAMP_TIME);
        return this;
    }
    public EducationCriteria andTimestampTimeNotEqualTo(String value) {
        addCriterion("timestamp_time <>", value, TIMESTAMP_TIME);
        return this;
    }    
    public EducationCriteria andTimestampTimeGreaterThan(String value) {
        addCriterion("timestamp_time >", value, TIMESTAMP_TIME);
        return this;
    }    
    public EducationCriteria andTimestampTimeGreaterThanOrEqualTo(String value) {
        addCriterion("timestamp_time >=", value, TIMESTAMP_TIME);
        return this;
    }    
    public EducationCriteria andTimestampTimeLessThan(String value) {
        addCriterion("timestamp_time <", value, TIMESTAMP_TIME);
        return this;
    }     
    public EducationCriteria andTimestampTimeLessThanOrEqualTo(String value) {
        addCriterion("timestamp_time <=", value, TIMESTAMP_TIME);
        return this;
    }
    public EducationCriteria andTimestampTimeIn(List<String> values) {
        addCriterion("timestamp_time in", values, TIMESTAMP_TIME);
        return this;
    }
    public EducationCriteria andTimestampTimeNotIn(List<String> values) {
        addCriterion("timestamp_time not in", values, TIMESTAMP_TIME);
        return this;
    }
    public EducationCriteria andTimestampTimeBetween(String value1, String value2) {
        addCriterion("timestamp_time between", value1, value2, TIMESTAMP_TIME);
        return this;
    }
    public EducationCriteria andTimestampTimeNotBetween(String value1, String value2) {
        addCriterion("timestamp_time not between", value1, value2, TIMESTAMP_TIME);
        return this;
    }
}

