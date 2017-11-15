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
public  class HomeInfoCriteria extends GeneratedCriteria<HomeInfoCriteria> implements Serializable{

    protected HomeInfoCriteria() {
        super();
        criteria = new ArrayList<Criterion>();
    }

    private static final String USER_ID = "userId";   
    private static final String FAMILY_MEM_NAME = "familyMemName";   
    private static final String RELATIONSHIP_ID = "relationshipId";   
    private static final String WORK = "work";   
    private static final String PHONE = "phone";   
    private static final String QQ = "qq";   
    private static final String WECHAT = "wechat";   
    private static final String EMAIL = "email";   
    private static final String OPERATOR_ID = "operatorId";   
    private static final String TIMESTAMP_TIME = "timestampTime";   

    public HomeInfoCriteria andUserIdIsNull() {
        addCriterion("user_id is null");
        return this;
    }

    public HomeInfoCriteria andUserIdIsNotNull() {
        addCriterion("user_id is not null");
        return this;
    }
    public HomeInfoCriteria andUserIdEqualTo(String value) {
        addCriterion("user_id =", value, USER_ID);
        return this;
    }
    public HomeInfoCriteria andUserIdNotEqualTo(String value) {
        addCriterion("user_id <>", value, USER_ID);
        return this;
    }    
    public HomeInfoCriteria andUserIdGreaterThan(String value) {
        addCriterion("user_id >", value, USER_ID);
        return this;
    }    
    public HomeInfoCriteria andUserIdGreaterThanOrEqualTo(String value) {
        addCriterion("user_id >=", value, USER_ID);
        return this;
    }    
    public HomeInfoCriteria andUserIdLessThan(String value) {
        addCriterion("user_id <", value, USER_ID);
        return this;
    }     
    public HomeInfoCriteria andUserIdLessThanOrEqualTo(String value) {
        addCriterion("user_id <=", value, USER_ID);
        return this;
    }
    public HomeInfoCriteria andUserIdIn(List<String> values) {
        addCriterion("user_id in", values, USER_ID);
        return this;
    }
    public HomeInfoCriteria andUserIdNotIn(List<String> values) {
        addCriterion("user_id not in", values, USER_ID);
        return this;
    }
    public HomeInfoCriteria andUserIdBetween(String value1, String value2) {
        addCriterion("user_id between", value1, value2, USER_ID);
        return this;
    }
    public HomeInfoCriteria andUserIdNotBetween(String value1, String value2) {
        addCriterion("user_id not between", value1, value2, USER_ID);
        return this;
    }
        public HomeInfoCriteria andUserIdLike(String value) {
            addCriterion("user_id like", value, USER_ID);
            return this;
        }

        public HomeInfoCriteria andUserIdNotLike(String value) {
            addCriterion("user_id not like", value, USER_ID);
            return this;
        }
    public HomeInfoCriteria andFamilyMemNameIsNull() {
        addCriterion("family_mem_name is null");
        return this;
    }

    public HomeInfoCriteria andFamilyMemNameIsNotNull() {
        addCriterion("family_mem_name is not null");
        return this;
    }
    public HomeInfoCriteria andFamilyMemNameEqualTo(String value) {
        addCriterion("family_mem_name =", value, FAMILY_MEM_NAME);
        return this;
    }
    public HomeInfoCriteria andFamilyMemNameNotEqualTo(String value) {
        addCriterion("family_mem_name <>", value, FAMILY_MEM_NAME);
        return this;
    }    
    public HomeInfoCriteria andFamilyMemNameGreaterThan(String value) {
        addCriterion("family_mem_name >", value, FAMILY_MEM_NAME);
        return this;
    }    
    public HomeInfoCriteria andFamilyMemNameGreaterThanOrEqualTo(String value) {
        addCriterion("family_mem_name >=", value, FAMILY_MEM_NAME);
        return this;
    }    
    public HomeInfoCriteria andFamilyMemNameLessThan(String value) {
        addCriterion("family_mem_name <", value, FAMILY_MEM_NAME);
        return this;
    }     
    public HomeInfoCriteria andFamilyMemNameLessThanOrEqualTo(String value) {
        addCriterion("family_mem_name <=", value, FAMILY_MEM_NAME);
        return this;
    }
    public HomeInfoCriteria andFamilyMemNameIn(List<String> values) {
        addCriterion("family_mem_name in", values, FAMILY_MEM_NAME);
        return this;
    }
    public HomeInfoCriteria andFamilyMemNameNotIn(List<String> values) {
        addCriterion("family_mem_name not in", values, FAMILY_MEM_NAME);
        return this;
    }
    public HomeInfoCriteria andFamilyMemNameBetween(String value1, String value2) {
        addCriterion("family_mem_name between", value1, value2, FAMILY_MEM_NAME);
        return this;
    }
    public HomeInfoCriteria andFamilyMemNameNotBetween(String value1, String value2) {
        addCriterion("family_mem_name not between", value1, value2, FAMILY_MEM_NAME);
        return this;
    }
        public HomeInfoCriteria andFamilyMemNameLike(String value) {
            addCriterion("family_mem_name like", value, FAMILY_MEM_NAME);
            return this;
        }

        public HomeInfoCriteria andFamilyMemNameNotLike(String value) {
            addCriterion("family_mem_name not like", value, FAMILY_MEM_NAME);
            return this;
        }
    public HomeInfoCriteria andRelationshipIdIsNull() {
        addCriterion("relationship_id is null");
        return this;
    }

    public HomeInfoCriteria andRelationshipIdIsNotNull() {
        addCriterion("relationship_id is not null");
        return this;
    }
    public HomeInfoCriteria andRelationshipIdEqualTo(String value) {
        addCriterion("relationship_id =", value, RELATIONSHIP_ID);
        return this;
    }
    public HomeInfoCriteria andRelationshipIdNotEqualTo(String value) {
        addCriterion("relationship_id <>", value, RELATIONSHIP_ID);
        return this;
    }    
    public HomeInfoCriteria andRelationshipIdGreaterThan(String value) {
        addCriterion("relationship_id >", value, RELATIONSHIP_ID);
        return this;
    }    
    public HomeInfoCriteria andRelationshipIdGreaterThanOrEqualTo(String value) {
        addCriterion("relationship_id >=", value, RELATIONSHIP_ID);
        return this;
    }    
    public HomeInfoCriteria andRelationshipIdLessThan(String value) {
        addCriterion("relationship_id <", value, RELATIONSHIP_ID);
        return this;
    }     
    public HomeInfoCriteria andRelationshipIdLessThanOrEqualTo(String value) {
        addCriterion("relationship_id <=", value, RELATIONSHIP_ID);
        return this;
    }
    public HomeInfoCriteria andRelationshipIdIn(List<String> values) {
        addCriterion("relationship_id in", values, RELATIONSHIP_ID);
        return this;
    }
    public HomeInfoCriteria andRelationshipIdNotIn(List<String> values) {
        addCriterion("relationship_id not in", values, RELATIONSHIP_ID);
        return this;
    }
    public HomeInfoCriteria andRelationshipIdBetween(String value1, String value2) {
        addCriterion("relationship_id between", value1, value2, RELATIONSHIP_ID);
        return this;
    }
    public HomeInfoCriteria andRelationshipIdNotBetween(String value1, String value2) {
        addCriterion("relationship_id not between", value1, value2, RELATIONSHIP_ID);
        return this;
    }
        public HomeInfoCriteria andRelationshipIdLike(String value) {
            addCriterion("relationship_id like", value, RELATIONSHIP_ID);
            return this;
        }

        public HomeInfoCriteria andRelationshipIdNotLike(String value) {
            addCriterion("relationship_id not like", value, RELATIONSHIP_ID);
            return this;
        }
    public HomeInfoCriteria andWorkIsNull() {
        addCriterion("work is null");
        return this;
    }

    public HomeInfoCriteria andWorkIsNotNull() {
        addCriterion("work is not null");
        return this;
    }
    public HomeInfoCriteria andWorkEqualTo(String value) {
        addCriterion("work =", value, WORK);
        return this;
    }
    public HomeInfoCriteria andWorkNotEqualTo(String value) {
        addCriterion("work <>", value, WORK);
        return this;
    }    
    public HomeInfoCriteria andWorkGreaterThan(String value) {
        addCriterion("work >", value, WORK);
        return this;
    }    
    public HomeInfoCriteria andWorkGreaterThanOrEqualTo(String value) {
        addCriterion("work >=", value, WORK);
        return this;
    }    
    public HomeInfoCriteria andWorkLessThan(String value) {
        addCriterion("work <", value, WORK);
        return this;
    }     
    public HomeInfoCriteria andWorkLessThanOrEqualTo(String value) {
        addCriterion("work <=", value, WORK);
        return this;
    }
    public HomeInfoCriteria andWorkIn(List<String> values) {
        addCriterion("work in", values, WORK);
        return this;
    }
    public HomeInfoCriteria andWorkNotIn(List<String> values) {
        addCriterion("work not in", values, WORK);
        return this;
    }
    public HomeInfoCriteria andWorkBetween(String value1, String value2) {
        addCriterion("work between", value1, value2, WORK);
        return this;
    }
    public HomeInfoCriteria andWorkNotBetween(String value1, String value2) {
        addCriterion("work not between", value1, value2, WORK);
        return this;
    }
        public HomeInfoCriteria andWorkLike(String value) {
            addCriterion("work like", value, WORK);
            return this;
        }

        public HomeInfoCriteria andWorkNotLike(String value) {
            addCriterion("work not like", value, WORK);
            return this;
        }
    public HomeInfoCriteria andPhoneIsNull() {
        addCriterion("phone is null");
        return this;
    }

    public HomeInfoCriteria andPhoneIsNotNull() {
        addCriterion("phone is not null");
        return this;
    }
    public HomeInfoCriteria andPhoneEqualTo(String value) {
        addCriterion("phone =", value, PHONE);
        return this;
    }
    public HomeInfoCriteria andPhoneNotEqualTo(String value) {
        addCriterion("phone <>", value, PHONE);
        return this;
    }    
    public HomeInfoCriteria andPhoneGreaterThan(String value) {
        addCriterion("phone >", value, PHONE);
        return this;
    }    
    public HomeInfoCriteria andPhoneGreaterThanOrEqualTo(String value) {
        addCriterion("phone >=", value, PHONE);
        return this;
    }    
    public HomeInfoCriteria andPhoneLessThan(String value) {
        addCriterion("phone <", value, PHONE);
        return this;
    }     
    public HomeInfoCriteria andPhoneLessThanOrEqualTo(String value) {
        addCriterion("phone <=", value, PHONE);
        return this;
    }
    public HomeInfoCriteria andPhoneIn(List<String> values) {
        addCriterion("phone in", values, PHONE);
        return this;
    }
    public HomeInfoCriteria andPhoneNotIn(List<String> values) {
        addCriterion("phone not in", values, PHONE);
        return this;
    }
    public HomeInfoCriteria andPhoneBetween(String value1, String value2) {
        addCriterion("phone between", value1, value2, PHONE);
        return this;
    }
    public HomeInfoCriteria andPhoneNotBetween(String value1, String value2) {
        addCriterion("phone not between", value1, value2, PHONE);
        return this;
    }
        public HomeInfoCriteria andPhoneLike(String value) {
            addCriterion("phone like", value, PHONE);
            return this;
        }

        public HomeInfoCriteria andPhoneNotLike(String value) {
            addCriterion("phone not like", value, PHONE);
            return this;
        }
    public HomeInfoCriteria andQqIsNull() {
        addCriterion("QQ is null");
        return this;
    }

    public HomeInfoCriteria andQqIsNotNull() {
        addCriterion("QQ is not null");
        return this;
    }
    public HomeInfoCriteria andQqEqualTo(String value) {
        addCriterion("QQ =", value, QQ);
        return this;
    }
    public HomeInfoCriteria andQqNotEqualTo(String value) {
        addCriterion("QQ <>", value, QQ);
        return this;
    }    
    public HomeInfoCriteria andQqGreaterThan(String value) {
        addCriterion("QQ >", value, QQ);
        return this;
    }    
    public HomeInfoCriteria andQqGreaterThanOrEqualTo(String value) {
        addCriterion("QQ >=", value, QQ);
        return this;
    }    
    public HomeInfoCriteria andQqLessThan(String value) {
        addCriterion("QQ <", value, QQ);
        return this;
    }     
    public HomeInfoCriteria andQqLessThanOrEqualTo(String value) {
        addCriterion("QQ <=", value, QQ);
        return this;
    }
    public HomeInfoCriteria andQqIn(List<String> values) {
        addCriterion("QQ in", values, QQ);
        return this;
    }
    public HomeInfoCriteria andQqNotIn(List<String> values) {
        addCriterion("QQ not in", values, QQ);
        return this;
    }
    public HomeInfoCriteria andQqBetween(String value1, String value2) {
        addCriterion("QQ between", value1, value2, QQ);
        return this;
    }
    public HomeInfoCriteria andQqNotBetween(String value1, String value2) {
        addCriterion("QQ not between", value1, value2, QQ);
        return this;
    }
        public HomeInfoCriteria andQqLike(String value) {
            addCriterion("QQ like", value, QQ);
            return this;
        }

        public HomeInfoCriteria andQqNotLike(String value) {
            addCriterion("QQ not like", value, QQ);
            return this;
        }
    public HomeInfoCriteria andWechatIsNull() {
        addCriterion("wechat is null");
        return this;
    }

    public HomeInfoCriteria andWechatIsNotNull() {
        addCriterion("wechat is not null");
        return this;
    }
    public HomeInfoCriteria andWechatEqualTo(String value) {
        addCriterion("wechat =", value, WECHAT);
        return this;
    }
    public HomeInfoCriteria andWechatNotEqualTo(String value) {
        addCriterion("wechat <>", value, WECHAT);
        return this;
    }    
    public HomeInfoCriteria andWechatGreaterThan(String value) {
        addCriterion("wechat >", value, WECHAT);
        return this;
    }    
    public HomeInfoCriteria andWechatGreaterThanOrEqualTo(String value) {
        addCriterion("wechat >=", value, WECHAT);
        return this;
    }    
    public HomeInfoCriteria andWechatLessThan(String value) {
        addCriterion("wechat <", value, WECHAT);
        return this;
    }     
    public HomeInfoCriteria andWechatLessThanOrEqualTo(String value) {
        addCriterion("wechat <=", value, WECHAT);
        return this;
    }
    public HomeInfoCriteria andWechatIn(List<String> values) {
        addCriterion("wechat in", values, WECHAT);
        return this;
    }
    public HomeInfoCriteria andWechatNotIn(List<String> values) {
        addCriterion("wechat not in", values, WECHAT);
        return this;
    }
    public HomeInfoCriteria andWechatBetween(String value1, String value2) {
        addCriterion("wechat between", value1, value2, WECHAT);
        return this;
    }
    public HomeInfoCriteria andWechatNotBetween(String value1, String value2) {
        addCriterion("wechat not between", value1, value2, WECHAT);
        return this;
    }
        public HomeInfoCriteria andWechatLike(String value) {
            addCriterion("wechat like", value, WECHAT);
            return this;
        }

        public HomeInfoCriteria andWechatNotLike(String value) {
            addCriterion("wechat not like", value, WECHAT);
            return this;
        }
    public HomeInfoCriteria andEmailIsNull() {
        addCriterion("email is null");
        return this;
    }

    public HomeInfoCriteria andEmailIsNotNull() {
        addCriterion("email is not null");
        return this;
    }
    public HomeInfoCriteria andEmailEqualTo(String value) {
        addCriterion("email =", value, EMAIL);
        return this;
    }
    public HomeInfoCriteria andEmailNotEqualTo(String value) {
        addCriterion("email <>", value, EMAIL);
        return this;
    }    
    public HomeInfoCriteria andEmailGreaterThan(String value) {
        addCriterion("email >", value, EMAIL);
        return this;
    }    
    public HomeInfoCriteria andEmailGreaterThanOrEqualTo(String value) {
        addCriterion("email >=", value, EMAIL);
        return this;
    }    
    public HomeInfoCriteria andEmailLessThan(String value) {
        addCriterion("email <", value, EMAIL);
        return this;
    }     
    public HomeInfoCriteria andEmailLessThanOrEqualTo(String value) {
        addCriterion("email <=", value, EMAIL);
        return this;
    }
    public HomeInfoCriteria andEmailIn(List<String> values) {
        addCriterion("email in", values, EMAIL);
        return this;
    }
    public HomeInfoCriteria andEmailNotIn(List<String> values) {
        addCriterion("email not in", values, EMAIL);
        return this;
    }
    public HomeInfoCriteria andEmailBetween(String value1, String value2) {
        addCriterion("email between", value1, value2, EMAIL);
        return this;
    }
    public HomeInfoCriteria andEmailNotBetween(String value1, String value2) {
        addCriterion("email not between", value1, value2, EMAIL);
        return this;
    }
        public HomeInfoCriteria andEmailLike(String value) {
            addCriterion("email like", value, EMAIL);
            return this;
        }

        public HomeInfoCriteria andEmailNotLike(String value) {
            addCriterion("email not like", value, EMAIL);
            return this;
        }
    public HomeInfoCriteria andOperatorIdIsNull() {
        addCriterion("operator_id is null");
        return this;
    }

    public HomeInfoCriteria andOperatorIdIsNotNull() {
        addCriterion("operator_id is not null");
        return this;
    }
    public HomeInfoCriteria andOperatorIdEqualTo(String value) {
        addCriterion("operator_id =", value, OPERATOR_ID);
        return this;
    }
    public HomeInfoCriteria andOperatorIdNotEqualTo(String value) {
        addCriterion("operator_id <>", value, OPERATOR_ID);
        return this;
    }    
    public HomeInfoCriteria andOperatorIdGreaterThan(String value) {
        addCriterion("operator_id >", value, OPERATOR_ID);
        return this;
    }    
    public HomeInfoCriteria andOperatorIdGreaterThanOrEqualTo(String value) {
        addCriterion("operator_id >=", value, OPERATOR_ID);
        return this;
    }    
    public HomeInfoCriteria andOperatorIdLessThan(String value) {
        addCriterion("operator_id <", value, OPERATOR_ID);
        return this;
    }     
    public HomeInfoCriteria andOperatorIdLessThanOrEqualTo(String value) {
        addCriterion("operator_id <=", value, OPERATOR_ID);
        return this;
    }
    public HomeInfoCriteria andOperatorIdIn(List<String> values) {
        addCriterion("operator_id in", values, OPERATOR_ID);
        return this;
    }
    public HomeInfoCriteria andOperatorIdNotIn(List<String> values) {
        addCriterion("operator_id not in", values, OPERATOR_ID);
        return this;
    }
    public HomeInfoCriteria andOperatorIdBetween(String value1, String value2) {
        addCriterion("operator_id between", value1, value2, OPERATOR_ID);
        return this;
    }
    public HomeInfoCriteria andOperatorIdNotBetween(String value1, String value2) {
        addCriterion("operator_id not between", value1, value2, OPERATOR_ID);
        return this;
    }
        public HomeInfoCriteria andOperatorIdLike(String value) {
            addCriterion("operator_id like", value, OPERATOR_ID);
            return this;
        }

        public HomeInfoCriteria andOperatorIdNotLike(String value) {
            addCriterion("operator_id not like", value, OPERATOR_ID);
            return this;
        }
    public HomeInfoCriteria andTimestampTimeIsNull() {
        addCriterion("timestamp_time is null");
        return this;
    }

    public HomeInfoCriteria andTimestampTimeIsNotNull() {
        addCriterion("timestamp_time is not null");
        return this;
    }
    public HomeInfoCriteria andTimestampTimeEqualTo(String value) {
        addCriterion("timestamp_time =", value, TIMESTAMP_TIME);
        return this;
    }
    public HomeInfoCriteria andTimestampTimeNotEqualTo(String value) {
        addCriterion("timestamp_time <>", value, TIMESTAMP_TIME);
        return this;
    }    
    public HomeInfoCriteria andTimestampTimeGreaterThan(String value) {
        addCriterion("timestamp_time >", value, TIMESTAMP_TIME);
        return this;
    }    
    public HomeInfoCriteria andTimestampTimeGreaterThanOrEqualTo(String value) {
        addCriterion("timestamp_time >=", value, TIMESTAMP_TIME);
        return this;
    }    
    public HomeInfoCriteria andTimestampTimeLessThan(String value) {
        addCriterion("timestamp_time <", value, TIMESTAMP_TIME);
        return this;
    }     
    public HomeInfoCriteria andTimestampTimeLessThanOrEqualTo(String value) {
        addCriterion("timestamp_time <=", value, TIMESTAMP_TIME);
        return this;
    }
    public HomeInfoCriteria andTimestampTimeIn(List<String> values) {
        addCriterion("timestamp_time in", values, TIMESTAMP_TIME);
        return this;
    }
    public HomeInfoCriteria andTimestampTimeNotIn(List<String> values) {
        addCriterion("timestamp_time not in", values, TIMESTAMP_TIME);
        return this;
    }
    public HomeInfoCriteria andTimestampTimeBetween(String value1, String value2) {
        addCriterion("timestamp_time between", value1, value2, TIMESTAMP_TIME);
        return this;
    }
    public HomeInfoCriteria andTimestampTimeNotBetween(String value1, String value2) {
        addCriterion("timestamp_time not between", value1, value2, TIMESTAMP_TIME);
        return this;
    }
}

