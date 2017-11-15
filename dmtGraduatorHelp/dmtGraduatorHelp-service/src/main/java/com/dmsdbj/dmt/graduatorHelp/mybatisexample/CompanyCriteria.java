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
public  class CompanyCriteria extends GeneratedCriteria<CompanyCriteria> implements Serializable{

    protected CompanyCriteria() {
        super();
        criteria = new ArrayList<Criterion>();
    }

    private static final String COMPANY_NAME = "companyName";   
    private static final String COMPANY_TEL = "companyTel";   
    private static final String ENTRY_TIME = "entryTime";   
    private static final String QUIT_TIME = "quitTime";   
    private static final String FUNNY_THING = "funnyThing";   
    private static final String COMPANY_ADDRESS = "companyAddress";   
    private static final String OPERATOR_ID = "operatorId";   
    private static final String TIMESTAMP_TIME = "timestampTime";   

    public CompanyCriteria andCompanyNameIsNull() {
        addCriterion("company_name is null");
        return this;
    }

    public CompanyCriteria andCompanyNameIsNotNull() {
        addCriterion("company_name is not null");
        return this;
    }
    public CompanyCriteria andCompanyNameEqualTo(String value) {
        addCriterion("company_name =", value, COMPANY_NAME);
        return this;
    }
    public CompanyCriteria andCompanyNameNotEqualTo(String value) {
        addCriterion("company_name <>", value, COMPANY_NAME);
        return this;
    }    
    public CompanyCriteria andCompanyNameGreaterThan(String value) {
        addCriterion("company_name >", value, COMPANY_NAME);
        return this;
    }    
    public CompanyCriteria andCompanyNameGreaterThanOrEqualTo(String value) {
        addCriterion("company_name >=", value, COMPANY_NAME);
        return this;
    }    
    public CompanyCriteria andCompanyNameLessThan(String value) {
        addCriterion("company_name <", value, COMPANY_NAME);
        return this;
    }     
    public CompanyCriteria andCompanyNameLessThanOrEqualTo(String value) {
        addCriterion("company_name <=", value, COMPANY_NAME);
        return this;
    }
    public CompanyCriteria andCompanyNameIn(List<String> values) {
        addCriterion("company_name in", values, COMPANY_NAME);
        return this;
    }
    public CompanyCriteria andCompanyNameNotIn(List<String> values) {
        addCriterion("company_name not in", values, COMPANY_NAME);
        return this;
    }
    public CompanyCriteria andCompanyNameBetween(String value1, String value2) {
        addCriterion("company_name between", value1, value2, COMPANY_NAME);
        return this;
    }
    public CompanyCriteria andCompanyNameNotBetween(String value1, String value2) {
        addCriterion("company_name not between", value1, value2, COMPANY_NAME);
        return this;
    }
        public CompanyCriteria andCompanyNameLike(String value) {
            addCriterion("company_name like", value, COMPANY_NAME);
            return this;
        }

        public CompanyCriteria andCompanyNameNotLike(String value) {
            addCriterion("company_name not like", value, COMPANY_NAME);
            return this;
        }
    public CompanyCriteria andCompanyTelIsNull() {
        addCriterion("company_tel is null");
        return this;
    }

    public CompanyCriteria andCompanyTelIsNotNull() {
        addCriterion("company_tel is not null");
        return this;
    }
    public CompanyCriteria andCompanyTelEqualTo(String value) {
        addCriterion("company_tel =", value, COMPANY_TEL);
        return this;
    }
    public CompanyCriteria andCompanyTelNotEqualTo(String value) {
        addCriterion("company_tel <>", value, COMPANY_TEL);
        return this;
    }    
    public CompanyCriteria andCompanyTelGreaterThan(String value) {
        addCriterion("company_tel >", value, COMPANY_TEL);
        return this;
    }    
    public CompanyCriteria andCompanyTelGreaterThanOrEqualTo(String value) {
        addCriterion("company_tel >=", value, COMPANY_TEL);
        return this;
    }    
    public CompanyCriteria andCompanyTelLessThan(String value) {
        addCriterion("company_tel <", value, COMPANY_TEL);
        return this;
    }     
    public CompanyCriteria andCompanyTelLessThanOrEqualTo(String value) {
        addCriterion("company_tel <=", value, COMPANY_TEL);
        return this;
    }
    public CompanyCriteria andCompanyTelIn(List<String> values) {
        addCriterion("company_tel in", values, COMPANY_TEL);
        return this;
    }
    public CompanyCriteria andCompanyTelNotIn(List<String> values) {
        addCriterion("company_tel not in", values, COMPANY_TEL);
        return this;
    }
    public CompanyCriteria andCompanyTelBetween(String value1, String value2) {
        addCriterion("company_tel between", value1, value2, COMPANY_TEL);
        return this;
    }
    public CompanyCriteria andCompanyTelNotBetween(String value1, String value2) {
        addCriterion("company_tel not between", value1, value2, COMPANY_TEL);
        return this;
    }
        public CompanyCriteria andCompanyTelLike(String value) {
            addCriterion("company_tel like", value, COMPANY_TEL);
            return this;
        }

        public CompanyCriteria andCompanyTelNotLike(String value) {
            addCriterion("company_tel not like", value, COMPANY_TEL);
            return this;
        }
    public CompanyCriteria andEntryTimeIsNull() {
        addCriterion("entry_time is null");
        return this;
    }

    public CompanyCriteria andEntryTimeIsNotNull() {
        addCriterion("entry_time is not null");
        return this;
    }
    public CompanyCriteria andEntryTimeEqualTo(Date value) {
        addCriterion("entry_time =", value, ENTRY_TIME);
        return this;
    }
    public CompanyCriteria andEntryTimeNotEqualTo(Date value) {
        addCriterion("entry_time <>", value, ENTRY_TIME);
        return this;
    }    
    public CompanyCriteria andEntryTimeGreaterThan(Date value) {
        addCriterion("entry_time >", value, ENTRY_TIME);
        return this;
    }    
    public CompanyCriteria andEntryTimeGreaterThanOrEqualTo(Date value) {
        addCriterion("entry_time >=", value, ENTRY_TIME);
        return this;
    }    
    public CompanyCriteria andEntryTimeLessThan(Date value) {
        addCriterion("entry_time <", value, ENTRY_TIME);
        return this;
    }     
    public CompanyCriteria andEntryTimeLessThanOrEqualTo(Date value) {
        addCriterion("entry_time <=", value, ENTRY_TIME);
        return this;
    }
    public CompanyCriteria andEntryTimeIn(List<Date> values) {
        addCriterion("entry_time in", values, ENTRY_TIME);
        return this;
    }
    public CompanyCriteria andEntryTimeNotIn(List<Date> values) {
        addCriterion("entry_time not in", values, ENTRY_TIME);
        return this;
    }
    public CompanyCriteria andEntryTimeBetween(Date value1, Date value2) {
        addCriterion("entry_time between", value1, value2, ENTRY_TIME);
        return this;
    }
    public CompanyCriteria andEntryTimeNotBetween(Date value1, Date value2) {
        addCriterion("entry_time not between", value1, value2, ENTRY_TIME);
        return this;
    }
    public CompanyCriteria andQuitTimeIsNull() {
        addCriterion("quit_time is null");
        return this;
    }

    public CompanyCriteria andQuitTimeIsNotNull() {
        addCriterion("quit_time is not null");
        return this;
    }
    public CompanyCriteria andQuitTimeEqualTo(Date value) {
        addCriterion("quit_time =", value, QUIT_TIME);
        return this;
    }
    public CompanyCriteria andQuitTimeNotEqualTo(Date value) {
        addCriterion("quit_time <>", value, QUIT_TIME);
        return this;
    }    
    public CompanyCriteria andQuitTimeGreaterThan(Date value) {
        addCriterion("quit_time >", value, QUIT_TIME);
        return this;
    }    
    public CompanyCriteria andQuitTimeGreaterThanOrEqualTo(Date value) {
        addCriterion("quit_time >=", value, QUIT_TIME);
        return this;
    }    
    public CompanyCriteria andQuitTimeLessThan(Date value) {
        addCriterion("quit_time <", value, QUIT_TIME);
        return this;
    }     
    public CompanyCriteria andQuitTimeLessThanOrEqualTo(Date value) {
        addCriterion("quit_time <=", value, QUIT_TIME);
        return this;
    }
    public CompanyCriteria andQuitTimeIn(List<Date> values) {
        addCriterion("quit_time in", values, QUIT_TIME);
        return this;
    }
    public CompanyCriteria andQuitTimeNotIn(List<Date> values) {
        addCriterion("quit_time not in", values, QUIT_TIME);
        return this;
    }
    public CompanyCriteria andQuitTimeBetween(Date value1, Date value2) {
        addCriterion("quit_time between", value1, value2, QUIT_TIME);
        return this;
    }
    public CompanyCriteria andQuitTimeNotBetween(Date value1, Date value2) {
        addCriterion("quit_time not between", value1, value2, QUIT_TIME);
        return this;
    }
    public CompanyCriteria andFunnyThingIsNull() {
        addCriterion("funny_thing is null");
        return this;
    }

    public CompanyCriteria andFunnyThingIsNotNull() {
        addCriterion("funny_thing is not null");
        return this;
    }
    public CompanyCriteria andFunnyThingEqualTo(String value) {
        addCriterion("funny_thing =", value, FUNNY_THING);
        return this;
    }
    public CompanyCriteria andFunnyThingNotEqualTo(String value) {
        addCriterion("funny_thing <>", value, FUNNY_THING);
        return this;
    }    
    public CompanyCriteria andFunnyThingGreaterThan(String value) {
        addCriterion("funny_thing >", value, FUNNY_THING);
        return this;
    }    
    public CompanyCriteria andFunnyThingGreaterThanOrEqualTo(String value) {
        addCriterion("funny_thing >=", value, FUNNY_THING);
        return this;
    }    
    public CompanyCriteria andFunnyThingLessThan(String value) {
        addCriterion("funny_thing <", value, FUNNY_THING);
        return this;
    }     
    public CompanyCriteria andFunnyThingLessThanOrEqualTo(String value) {
        addCriterion("funny_thing <=", value, FUNNY_THING);
        return this;
    }
    public CompanyCriteria andFunnyThingIn(List<String> values) {
        addCriterion("funny_thing in", values, FUNNY_THING);
        return this;
    }
    public CompanyCriteria andFunnyThingNotIn(List<String> values) {
        addCriterion("funny_thing not in", values, FUNNY_THING);
        return this;
    }
    public CompanyCriteria andFunnyThingBetween(String value1, String value2) {
        addCriterion("funny_thing between", value1, value2, FUNNY_THING);
        return this;
    }
    public CompanyCriteria andFunnyThingNotBetween(String value1, String value2) {
        addCriterion("funny_thing not between", value1, value2, FUNNY_THING);
        return this;
    }
        public CompanyCriteria andFunnyThingLike(String value) {
            addCriterion("funny_thing like", value, FUNNY_THING);
            return this;
        }

        public CompanyCriteria andFunnyThingNotLike(String value) {
            addCriterion("funny_thing not like", value, FUNNY_THING);
            return this;
        }
    public CompanyCriteria andCompanyAddressIsNull() {
        addCriterion("company_address is null");
        return this;
    }

    public CompanyCriteria andCompanyAddressIsNotNull() {
        addCriterion("company_address is not null");
        return this;
    }
    public CompanyCriteria andCompanyAddressEqualTo(String value) {
        addCriterion("company_address =", value, COMPANY_ADDRESS);
        return this;
    }
    public CompanyCriteria andCompanyAddressNotEqualTo(String value) {
        addCriterion("company_address <>", value, COMPANY_ADDRESS);
        return this;
    }    
    public CompanyCriteria andCompanyAddressGreaterThan(String value) {
        addCriterion("company_address >", value, COMPANY_ADDRESS);
        return this;
    }    
    public CompanyCriteria andCompanyAddressGreaterThanOrEqualTo(String value) {
        addCriterion("company_address >=", value, COMPANY_ADDRESS);
        return this;
    }    
    public CompanyCriteria andCompanyAddressLessThan(String value) {
        addCriterion("company_address <", value, COMPANY_ADDRESS);
        return this;
    }     
    public CompanyCriteria andCompanyAddressLessThanOrEqualTo(String value) {
        addCriterion("company_address <=", value, COMPANY_ADDRESS);
        return this;
    }
    public CompanyCriteria andCompanyAddressIn(List<String> values) {
        addCriterion("company_address in", values, COMPANY_ADDRESS);
        return this;
    }
    public CompanyCriteria andCompanyAddressNotIn(List<String> values) {
        addCriterion("company_address not in", values, COMPANY_ADDRESS);
        return this;
    }
    public CompanyCriteria andCompanyAddressBetween(String value1, String value2) {
        addCriterion("company_address between", value1, value2, COMPANY_ADDRESS);
        return this;
    }
    public CompanyCriteria andCompanyAddressNotBetween(String value1, String value2) {
        addCriterion("company_address not between", value1, value2, COMPANY_ADDRESS);
        return this;
    }
        public CompanyCriteria andCompanyAddressLike(String value) {
            addCriterion("company_address like", value, COMPANY_ADDRESS);
            return this;
        }

        public CompanyCriteria andCompanyAddressNotLike(String value) {
            addCriterion("company_address not like", value, COMPANY_ADDRESS);
            return this;
        }
    public CompanyCriteria andOperatorIdIsNull() {
        addCriterion("operator_id is null");
        return this;
    }

    public CompanyCriteria andOperatorIdIsNotNull() {
        addCriterion("operator_id is not null");
        return this;
    }
    public CompanyCriteria andOperatorIdEqualTo(String value) {
        addCriterion("operator_id =", value, OPERATOR_ID);
        return this;
    }
    public CompanyCriteria andOperatorIdNotEqualTo(String value) {
        addCriterion("operator_id <>", value, OPERATOR_ID);
        return this;
    }    
    public CompanyCriteria andOperatorIdGreaterThan(String value) {
        addCriterion("operator_id >", value, OPERATOR_ID);
        return this;
    }    
    public CompanyCriteria andOperatorIdGreaterThanOrEqualTo(String value) {
        addCriterion("operator_id >=", value, OPERATOR_ID);
        return this;
    }    
    public CompanyCriteria andOperatorIdLessThan(String value) {
        addCriterion("operator_id <", value, OPERATOR_ID);
        return this;
    }     
    public CompanyCriteria andOperatorIdLessThanOrEqualTo(String value) {
        addCriterion("operator_id <=", value, OPERATOR_ID);
        return this;
    }
    public CompanyCriteria andOperatorIdIn(List<String> values) {
        addCriterion("operator_id in", values, OPERATOR_ID);
        return this;
    }
    public CompanyCriteria andOperatorIdNotIn(List<String> values) {
        addCriterion("operator_id not in", values, OPERATOR_ID);
        return this;
    }
    public CompanyCriteria andOperatorIdBetween(String value1, String value2) {
        addCriterion("operator_id between", value1, value2, OPERATOR_ID);
        return this;
    }
    public CompanyCriteria andOperatorIdNotBetween(String value1, String value2) {
        addCriterion("operator_id not between", value1, value2, OPERATOR_ID);
        return this;
    }
        public CompanyCriteria andOperatorIdLike(String value) {
            addCriterion("operator_id like", value, OPERATOR_ID);
            return this;
        }

        public CompanyCriteria andOperatorIdNotLike(String value) {
            addCriterion("operator_id not like", value, OPERATOR_ID);
            return this;
        }
    public CompanyCriteria andTimestampTimeIsNull() {
        addCriterion("timestamp_time is null");
        return this;
    }

    public CompanyCriteria andTimestampTimeIsNotNull() {
        addCriterion("timestamp_time is not null");
        return this;
    }
    public CompanyCriteria andTimestampTimeEqualTo(String value) {
        addCriterion("timestamp_time =", value, TIMESTAMP_TIME);
        return this;
    }
    public CompanyCriteria andTimestampTimeNotEqualTo(String value) {
        addCriterion("timestamp_time <>", value, TIMESTAMP_TIME);
        return this;
    }    
    public CompanyCriteria andTimestampTimeGreaterThan(String value) {
        addCriterion("timestamp_time >", value, TIMESTAMP_TIME);
        return this;
    }    
    public CompanyCriteria andTimestampTimeGreaterThanOrEqualTo(String value) {
        addCriterion("timestamp_time >=", value, TIMESTAMP_TIME);
        return this;
    }    
    public CompanyCriteria andTimestampTimeLessThan(String value) {
        addCriterion("timestamp_time <", value, TIMESTAMP_TIME);
        return this;
    }     
    public CompanyCriteria andTimestampTimeLessThanOrEqualTo(String value) {
        addCriterion("timestamp_time <=", value, TIMESTAMP_TIME);
        return this;
    }
    public CompanyCriteria andTimestampTimeIn(List<String> values) {
        addCriterion("timestamp_time in", values, TIMESTAMP_TIME);
        return this;
    }
    public CompanyCriteria andTimestampTimeNotIn(List<String> values) {
        addCriterion("timestamp_time not in", values, TIMESTAMP_TIME);
        return this;
    }
    public CompanyCriteria andTimestampTimeBetween(String value1, String value2) {
        addCriterion("timestamp_time between", value1, value2, TIMESTAMP_TIME);
        return this;
    }
    public CompanyCriteria andTimestampTimeNotBetween(String value1, String value2) {
        addCriterion("timestamp_time not between", value1, value2, TIMESTAMP_TIME);
        return this;
    }
}

