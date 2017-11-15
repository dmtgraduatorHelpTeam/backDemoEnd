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
public  class PersonalInfoCriteria extends GeneratedCriteria<PersonalInfoCriteria> implements Serializable{

    protected PersonalInfoCriteria() {
        super();
        criteria = new ArrayList<Criterion>();
    }

    private static final String LOGIN_ID = "loginId";   
    private static final String NAME = "name";   
    private static final String ENGLISH_NAME = "englishName";   
    private static final String GRADE = "grade";   
    private static final String SEX = "sex";   
    private static final String BIRTHDAY = "birthday";   
    private static final String EMAIL = "email";   
    private static final String PHONE = "phone";   
    private static final String EMERG_PHONE = "emergPhone";   
    private static final String EMERG_NAME = "emergName";   
    private static final String EMERG_RELATION = "emergRelation";   
    private static final String WECHAT = "wechat";   
    private static final String QQ = "qq";   
    private static final String ENTER_DMT_TIME = "enterDmtTime";   
    private static final String GRADUATE_DMT_TIME = "graduateDmtTime";   
    private static final String ENTER_COLLEGE_TIME = "enterCollegeTime";   
    private static final String GRADUATE_COLLEGE_TIME = "graduateCollegeTime";   
    private static final String NATIVE_PLACE = "nativePlace";   
    private static final String ADDRESS = "address";   
    private static final String PROFESSIONAL_FIELD = "professionalField";   
    private static final String OPERATOR_NAME = "operatorName";   
    private static final String OPERATOR_ID = "operatorId";   
    private static final String TIMESTAMP_TIME = "timestampTime";   

    public PersonalInfoCriteria andLoginIdIsNull() {
        addCriterion("login_id is null");
        return this;
    }

    public PersonalInfoCriteria andLoginIdIsNotNull() {
        addCriterion("login_id is not null");
        return this;
    }
    public PersonalInfoCriteria andLoginIdEqualTo(String value) {
        addCriterion("login_id =", value, LOGIN_ID);
        return this;
    }
    public PersonalInfoCriteria andLoginIdNotEqualTo(String value) {
        addCriterion("login_id <>", value, LOGIN_ID);
        return this;
    }    
    public PersonalInfoCriteria andLoginIdGreaterThan(String value) {
        addCriterion("login_id >", value, LOGIN_ID);
        return this;
    }    
    public PersonalInfoCriteria andLoginIdGreaterThanOrEqualTo(String value) {
        addCriterion("login_id >=", value, LOGIN_ID);
        return this;
    }    
    public PersonalInfoCriteria andLoginIdLessThan(String value) {
        addCriterion("login_id <", value, LOGIN_ID);
        return this;
    }     
    public PersonalInfoCriteria andLoginIdLessThanOrEqualTo(String value) {
        addCriterion("login_id <=", value, LOGIN_ID);
        return this;
    }
    public PersonalInfoCriteria andLoginIdIn(List<String> values) {
        addCriterion("login_id in", values, LOGIN_ID);
        return this;
    }
    public PersonalInfoCriteria andLoginIdNotIn(List<String> values) {
        addCriterion("login_id not in", values, LOGIN_ID);
        return this;
    }
    public PersonalInfoCriteria andLoginIdBetween(String value1, String value2) {
        addCriterion("login_id between", value1, value2, LOGIN_ID);
        return this;
    }
    public PersonalInfoCriteria andLoginIdNotBetween(String value1, String value2) {
        addCriterion("login_id not between", value1, value2, LOGIN_ID);
        return this;
    }
        public PersonalInfoCriteria andLoginIdLike(String value) {
            addCriterion("login_id like", value, LOGIN_ID);
            return this;
        }

        public PersonalInfoCriteria andLoginIdNotLike(String value) {
            addCriterion("login_id not like", value, LOGIN_ID);
            return this;
        }
    public PersonalInfoCriteria andNameIsNull() {
        addCriterion("name is null");
        return this;
    }

    public PersonalInfoCriteria andNameIsNotNull() {
        addCriterion("name is not null");
        return this;
    }
    public PersonalInfoCriteria andNameEqualTo(String value) {
        addCriterion("name =", value, NAME);
        return this;
    }
    public PersonalInfoCriteria andNameNotEqualTo(String value) {
        addCriterion("name <>", value, NAME);
        return this;
    }    
    public PersonalInfoCriteria andNameGreaterThan(String value) {
        addCriterion("name >", value, NAME);
        return this;
    }    
    public PersonalInfoCriteria andNameGreaterThanOrEqualTo(String value) {
        addCriterion("name >=", value, NAME);
        return this;
    }    
    public PersonalInfoCriteria andNameLessThan(String value) {
        addCriterion("name <", value, NAME);
        return this;
    }     
    public PersonalInfoCriteria andNameLessThanOrEqualTo(String value) {
        addCriterion("name <=", value, NAME);
        return this;
    }
    public PersonalInfoCriteria andNameIn(List<String> values) {
        addCriterion("name in", values, NAME);
        return this;
    }
    public PersonalInfoCriteria andNameNotIn(List<String> values) {
        addCriterion("name not in", values, NAME);
        return this;
    }
    public PersonalInfoCriteria andNameBetween(String value1, String value2) {
        addCriterion("name between", value1, value2, NAME);
        return this;
    }
    public PersonalInfoCriteria andNameNotBetween(String value1, String value2) {
        addCriterion("name not between", value1, value2, NAME);
        return this;
    }
        public PersonalInfoCriteria andNameLike(String value) {
            addCriterion("name like", value, NAME);
            return this;
        }

        public PersonalInfoCriteria andNameNotLike(String value) {
            addCriterion("name not like", value, NAME);
            return this;
        }
    public PersonalInfoCriteria andEnglishNameIsNull() {
        addCriterion("english_name is null");
        return this;
    }

    public PersonalInfoCriteria andEnglishNameIsNotNull() {
        addCriterion("english_name is not null");
        return this;
    }
    public PersonalInfoCriteria andEnglishNameEqualTo(String value) {
        addCriterion("english_name =", value, ENGLISH_NAME);
        return this;
    }
    public PersonalInfoCriteria andEnglishNameNotEqualTo(String value) {
        addCriterion("english_name <>", value, ENGLISH_NAME);
        return this;
    }    
    public PersonalInfoCriteria andEnglishNameGreaterThan(String value) {
        addCriterion("english_name >", value, ENGLISH_NAME);
        return this;
    }    
    public PersonalInfoCriteria andEnglishNameGreaterThanOrEqualTo(String value) {
        addCriterion("english_name >=", value, ENGLISH_NAME);
        return this;
    }    
    public PersonalInfoCriteria andEnglishNameLessThan(String value) {
        addCriterion("english_name <", value, ENGLISH_NAME);
        return this;
    }     
    public PersonalInfoCriteria andEnglishNameLessThanOrEqualTo(String value) {
        addCriterion("english_name <=", value, ENGLISH_NAME);
        return this;
    }
    public PersonalInfoCriteria andEnglishNameIn(List<String> values) {
        addCriterion("english_name in", values, ENGLISH_NAME);
        return this;
    }
    public PersonalInfoCriteria andEnglishNameNotIn(List<String> values) {
        addCriterion("english_name not in", values, ENGLISH_NAME);
        return this;
    }
    public PersonalInfoCriteria andEnglishNameBetween(String value1, String value2) {
        addCriterion("english_name between", value1, value2, ENGLISH_NAME);
        return this;
    }
    public PersonalInfoCriteria andEnglishNameNotBetween(String value1, String value2) {
        addCriterion("english_name not between", value1, value2, ENGLISH_NAME);
        return this;
    }
        public PersonalInfoCriteria andEnglishNameLike(String value) {
            addCriterion("english_name like", value, ENGLISH_NAME);
            return this;
        }

        public PersonalInfoCriteria andEnglishNameNotLike(String value) {
            addCriterion("english_name not like", value, ENGLISH_NAME);
            return this;
        }
    public PersonalInfoCriteria andGradeIsNull() {
        addCriterion("grade is null");
        return this;
    }

    public PersonalInfoCriteria andGradeIsNotNull() {
        addCriterion("grade is not null");
        return this;
    }
    public PersonalInfoCriteria andGradeEqualTo(String value) {
        addCriterion("grade =", value, GRADE);
        return this;
    }
    public PersonalInfoCriteria andGradeNotEqualTo(String value) {
        addCriterion("grade <>", value, GRADE);
        return this;
    }    
    public PersonalInfoCriteria andGradeGreaterThan(String value) {
        addCriterion("grade >", value, GRADE);
        return this;
    }    
    public PersonalInfoCriteria andGradeGreaterThanOrEqualTo(String value) {
        addCriterion("grade >=", value, GRADE);
        return this;
    }    
    public PersonalInfoCriteria andGradeLessThan(String value) {
        addCriterion("grade <", value, GRADE);
        return this;
    }     
    public PersonalInfoCriteria andGradeLessThanOrEqualTo(String value) {
        addCriterion("grade <=", value, GRADE);
        return this;
    }
    public PersonalInfoCriteria andGradeIn(List<String> values) {
        addCriterion("grade in", values, GRADE);
        return this;
    }
    public PersonalInfoCriteria andGradeNotIn(List<String> values) {
        addCriterion("grade not in", values, GRADE);
        return this;
    }
    public PersonalInfoCriteria andGradeBetween(String value1, String value2) {
        addCriterion("grade between", value1, value2, GRADE);
        return this;
    }
    public PersonalInfoCriteria andGradeNotBetween(String value1, String value2) {
        addCriterion("grade not between", value1, value2, GRADE);
        return this;
    }
        public PersonalInfoCriteria andGradeLike(String value) {
            addCriterion("grade like", value, GRADE);
            return this;
        }

        public PersonalInfoCriteria andGradeNotLike(String value) {
            addCriterion("grade not like", value, GRADE);
            return this;
        }
    public PersonalInfoCriteria andSexIsNull() {
        addCriterion("sex is null");
        return this;
    }

    public PersonalInfoCriteria andSexIsNotNull() {
        addCriterion("sex is not null");
        return this;
    }
    public PersonalInfoCriteria andSexEqualTo(String value) {
        addCriterion("sex =", value, SEX);
        return this;
    }
    public PersonalInfoCriteria andSexNotEqualTo(String value) {
        addCriterion("sex <>", value, SEX);
        return this;
    }    
    public PersonalInfoCriteria andSexGreaterThan(String value) {
        addCriterion("sex >", value, SEX);
        return this;
    }    
    public PersonalInfoCriteria andSexGreaterThanOrEqualTo(String value) {
        addCriterion("sex >=", value, SEX);
        return this;
    }    
    public PersonalInfoCriteria andSexLessThan(String value) {
        addCriterion("sex <", value, SEX);
        return this;
    }     
    public PersonalInfoCriteria andSexLessThanOrEqualTo(String value) {
        addCriterion("sex <=", value, SEX);
        return this;
    }
    public PersonalInfoCriteria andSexIn(List<String> values) {
        addCriterion("sex in", values, SEX);
        return this;
    }
    public PersonalInfoCriteria andSexNotIn(List<String> values) {
        addCriterion("sex not in", values, SEX);
        return this;
    }
    public PersonalInfoCriteria andSexBetween(String value1, String value2) {
        addCriterion("sex between", value1, value2, SEX);
        return this;
    }
    public PersonalInfoCriteria andSexNotBetween(String value1, String value2) {
        addCriterion("sex not between", value1, value2, SEX);
        return this;
    }
        public PersonalInfoCriteria andSexLike(String value) {
            addCriterion("sex like", value, SEX);
            return this;
        }

        public PersonalInfoCriteria andSexNotLike(String value) {
            addCriterion("sex not like", value, SEX);
            return this;
        }
    public PersonalInfoCriteria andBirthdayIsNull() {
        addCriterion("birthday is null");
        return this;
    }

    public PersonalInfoCriteria andBirthdayIsNotNull() {
        addCriterion("birthday is not null");
        return this;
    }
    public PersonalInfoCriteria andBirthdayEqualTo(Date value) {
        addCriterion("birthday =", value, BIRTHDAY);
        return this;
    }
    public PersonalInfoCriteria andBirthdayNotEqualTo(Date value) {
        addCriterion("birthday <>", value, BIRTHDAY);
        return this;
    }    
    public PersonalInfoCriteria andBirthdayGreaterThan(Date value) {
        addCriterion("birthday >", value, BIRTHDAY);
        return this;
    }    
    public PersonalInfoCriteria andBirthdayGreaterThanOrEqualTo(Date value) {
        addCriterion("birthday >=", value, BIRTHDAY);
        return this;
    }    
    public PersonalInfoCriteria andBirthdayLessThan(Date value) {
        addCriterion("birthday <", value, BIRTHDAY);
        return this;
    }     
    public PersonalInfoCriteria andBirthdayLessThanOrEqualTo(Date value) {
        addCriterion("birthday <=", value, BIRTHDAY);
        return this;
    }
    public PersonalInfoCriteria andBirthdayIn(List<Date> values) {
        addCriterion("birthday in", values, BIRTHDAY);
        return this;
    }
    public PersonalInfoCriteria andBirthdayNotIn(List<Date> values) {
        addCriterion("birthday not in", values, BIRTHDAY);
        return this;
    }
    public PersonalInfoCriteria andBirthdayBetween(Date value1, Date value2) {
        addCriterion("birthday between", value1, value2, BIRTHDAY);
        return this;
    }
    public PersonalInfoCriteria andBirthdayNotBetween(Date value1, Date value2) {
        addCriterion("birthday not between", value1, value2, BIRTHDAY);
        return this;
    }
    public PersonalInfoCriteria andEmailIsNull() {
        addCriterion("email is null");
        return this;
    }

    public PersonalInfoCriteria andEmailIsNotNull() {
        addCriterion("email is not null");
        return this;
    }
    public PersonalInfoCriteria andEmailEqualTo(String value) {
        addCriterion("email =", value, EMAIL);
        return this;
    }
    public PersonalInfoCriteria andEmailNotEqualTo(String value) {
        addCriterion("email <>", value, EMAIL);
        return this;
    }    
    public PersonalInfoCriteria andEmailGreaterThan(String value) {
        addCriterion("email >", value, EMAIL);
        return this;
    }    
    public PersonalInfoCriteria andEmailGreaterThanOrEqualTo(String value) {
        addCriterion("email >=", value, EMAIL);
        return this;
    }    
    public PersonalInfoCriteria andEmailLessThan(String value) {
        addCriterion("email <", value, EMAIL);
        return this;
    }     
    public PersonalInfoCriteria andEmailLessThanOrEqualTo(String value) {
        addCriterion("email <=", value, EMAIL);
        return this;
    }
    public PersonalInfoCriteria andEmailIn(List<String> values) {
        addCriterion("email in", values, EMAIL);
        return this;
    }
    public PersonalInfoCriteria andEmailNotIn(List<String> values) {
        addCriterion("email not in", values, EMAIL);
        return this;
    }
    public PersonalInfoCriteria andEmailBetween(String value1, String value2) {
        addCriterion("email between", value1, value2, EMAIL);
        return this;
    }
    public PersonalInfoCriteria andEmailNotBetween(String value1, String value2) {
        addCriterion("email not between", value1, value2, EMAIL);
        return this;
    }
        public PersonalInfoCriteria andEmailLike(String value) {
            addCriterion("email like", value, EMAIL);
            return this;
        }

        public PersonalInfoCriteria andEmailNotLike(String value) {
            addCriterion("email not like", value, EMAIL);
            return this;
        }
    public PersonalInfoCriteria andPhoneIsNull() {
        addCriterion("phone is null");
        return this;
    }

    public PersonalInfoCriteria andPhoneIsNotNull() {
        addCriterion("phone is not null");
        return this;
    }
    public PersonalInfoCriteria andPhoneEqualTo(String value) {
        addCriterion("phone =", value, PHONE);
        return this;
    }
    public PersonalInfoCriteria andPhoneNotEqualTo(String value) {
        addCriterion("phone <>", value, PHONE);
        return this;
    }    
    public PersonalInfoCriteria andPhoneGreaterThan(String value) {
        addCriterion("phone >", value, PHONE);
        return this;
    }    
    public PersonalInfoCriteria andPhoneGreaterThanOrEqualTo(String value) {
        addCriterion("phone >=", value, PHONE);
        return this;
    }    
    public PersonalInfoCriteria andPhoneLessThan(String value) {
        addCriterion("phone <", value, PHONE);
        return this;
    }     
    public PersonalInfoCriteria andPhoneLessThanOrEqualTo(String value) {
        addCriterion("phone <=", value, PHONE);
        return this;
    }
    public PersonalInfoCriteria andPhoneIn(List<String> values) {
        addCriterion("phone in", values, PHONE);
        return this;
    }
    public PersonalInfoCriteria andPhoneNotIn(List<String> values) {
        addCriterion("phone not in", values, PHONE);
        return this;
    }
    public PersonalInfoCriteria andPhoneBetween(String value1, String value2) {
        addCriterion("phone between", value1, value2, PHONE);
        return this;
    }
    public PersonalInfoCriteria andPhoneNotBetween(String value1, String value2) {
        addCriterion("phone not between", value1, value2, PHONE);
        return this;
    }
        public PersonalInfoCriteria andPhoneLike(String value) {
            addCriterion("phone like", value, PHONE);
            return this;
        }

        public PersonalInfoCriteria andPhoneNotLike(String value) {
            addCriterion("phone not like", value, PHONE);
            return this;
        }
    public PersonalInfoCriteria andEmergPhoneIsNull() {
        addCriterion("emerg_phone is null");
        return this;
    }

    public PersonalInfoCriteria andEmergPhoneIsNotNull() {
        addCriterion("emerg_phone is not null");
        return this;
    }
    public PersonalInfoCriteria andEmergPhoneEqualTo(String value) {
        addCriterion("emerg_phone =", value, EMERG_PHONE);
        return this;
    }
    public PersonalInfoCriteria andEmergPhoneNotEqualTo(String value) {
        addCriterion("emerg_phone <>", value, EMERG_PHONE);
        return this;
    }    
    public PersonalInfoCriteria andEmergPhoneGreaterThan(String value) {
        addCriterion("emerg_phone >", value, EMERG_PHONE);
        return this;
    }    
    public PersonalInfoCriteria andEmergPhoneGreaterThanOrEqualTo(String value) {
        addCriterion("emerg_phone >=", value, EMERG_PHONE);
        return this;
    }    
    public PersonalInfoCriteria andEmergPhoneLessThan(String value) {
        addCriterion("emerg_phone <", value, EMERG_PHONE);
        return this;
    }     
    public PersonalInfoCriteria andEmergPhoneLessThanOrEqualTo(String value) {
        addCriterion("emerg_phone <=", value, EMERG_PHONE);
        return this;
    }
    public PersonalInfoCriteria andEmergPhoneIn(List<String> values) {
        addCriterion("emerg_phone in", values, EMERG_PHONE);
        return this;
    }
    public PersonalInfoCriteria andEmergPhoneNotIn(List<String> values) {
        addCriterion("emerg_phone not in", values, EMERG_PHONE);
        return this;
    }
    public PersonalInfoCriteria andEmergPhoneBetween(String value1, String value2) {
        addCriterion("emerg_phone between", value1, value2, EMERG_PHONE);
        return this;
    }
    public PersonalInfoCriteria andEmergPhoneNotBetween(String value1, String value2) {
        addCriterion("emerg_phone not between", value1, value2, EMERG_PHONE);
        return this;
    }
        public PersonalInfoCriteria andEmergPhoneLike(String value) {
            addCriterion("emerg_phone like", value, EMERG_PHONE);
            return this;
        }

        public PersonalInfoCriteria andEmergPhoneNotLike(String value) {
            addCriterion("emerg_phone not like", value, EMERG_PHONE);
            return this;
        }
    public PersonalInfoCriteria andEmergNameIsNull() {
        addCriterion("emerg_name is null");
        return this;
    }

    public PersonalInfoCriteria andEmergNameIsNotNull() {
        addCriterion("emerg_name is not null");
        return this;
    }
    public PersonalInfoCriteria andEmergNameEqualTo(String value) {
        addCriterion("emerg_name =", value, EMERG_NAME);
        return this;
    }
    public PersonalInfoCriteria andEmergNameNotEqualTo(String value) {
        addCriterion("emerg_name <>", value, EMERG_NAME);
        return this;
    }    
    public PersonalInfoCriteria andEmergNameGreaterThan(String value) {
        addCriterion("emerg_name >", value, EMERG_NAME);
        return this;
    }    
    public PersonalInfoCriteria andEmergNameGreaterThanOrEqualTo(String value) {
        addCriterion("emerg_name >=", value, EMERG_NAME);
        return this;
    }    
    public PersonalInfoCriteria andEmergNameLessThan(String value) {
        addCriterion("emerg_name <", value, EMERG_NAME);
        return this;
    }     
    public PersonalInfoCriteria andEmergNameLessThanOrEqualTo(String value) {
        addCriterion("emerg_name <=", value, EMERG_NAME);
        return this;
    }
    public PersonalInfoCriteria andEmergNameIn(List<String> values) {
        addCriterion("emerg_name in", values, EMERG_NAME);
        return this;
    }
    public PersonalInfoCriteria andEmergNameNotIn(List<String> values) {
        addCriterion("emerg_name not in", values, EMERG_NAME);
        return this;
    }
    public PersonalInfoCriteria andEmergNameBetween(String value1, String value2) {
        addCriterion("emerg_name between", value1, value2, EMERG_NAME);
        return this;
    }
    public PersonalInfoCriteria andEmergNameNotBetween(String value1, String value2) {
        addCriterion("emerg_name not between", value1, value2, EMERG_NAME);
        return this;
    }
        public PersonalInfoCriteria andEmergNameLike(String value) {
            addCriterion("emerg_name like", value, EMERG_NAME);
            return this;
        }

        public PersonalInfoCriteria andEmergNameNotLike(String value) {
            addCriterion("emerg_name not like", value, EMERG_NAME);
            return this;
        }
    public PersonalInfoCriteria andEmergRelationIsNull() {
        addCriterion("emerg_relation is null");
        return this;
    }

    public PersonalInfoCriteria andEmergRelationIsNotNull() {
        addCriterion("emerg_relation is not null");
        return this;
    }
    public PersonalInfoCriteria andEmergRelationEqualTo(String value) {
        addCriterion("emerg_relation =", value, EMERG_RELATION);
        return this;
    }
    public PersonalInfoCriteria andEmergRelationNotEqualTo(String value) {
        addCriterion("emerg_relation <>", value, EMERG_RELATION);
        return this;
    }    
    public PersonalInfoCriteria andEmergRelationGreaterThan(String value) {
        addCriterion("emerg_relation >", value, EMERG_RELATION);
        return this;
    }    
    public PersonalInfoCriteria andEmergRelationGreaterThanOrEqualTo(String value) {
        addCriterion("emerg_relation >=", value, EMERG_RELATION);
        return this;
    }    
    public PersonalInfoCriteria andEmergRelationLessThan(String value) {
        addCriterion("emerg_relation <", value, EMERG_RELATION);
        return this;
    }     
    public PersonalInfoCriteria andEmergRelationLessThanOrEqualTo(String value) {
        addCriterion("emerg_relation <=", value, EMERG_RELATION);
        return this;
    }
    public PersonalInfoCriteria andEmergRelationIn(List<String> values) {
        addCriterion("emerg_relation in", values, EMERG_RELATION);
        return this;
    }
    public PersonalInfoCriteria andEmergRelationNotIn(List<String> values) {
        addCriterion("emerg_relation not in", values, EMERG_RELATION);
        return this;
    }
    public PersonalInfoCriteria andEmergRelationBetween(String value1, String value2) {
        addCriterion("emerg_relation between", value1, value2, EMERG_RELATION);
        return this;
    }
    public PersonalInfoCriteria andEmergRelationNotBetween(String value1, String value2) {
        addCriterion("emerg_relation not between", value1, value2, EMERG_RELATION);
        return this;
    }
        public PersonalInfoCriteria andEmergRelationLike(String value) {
            addCriterion("emerg_relation like", value, EMERG_RELATION);
            return this;
        }

        public PersonalInfoCriteria andEmergRelationNotLike(String value) {
            addCriterion("emerg_relation not like", value, EMERG_RELATION);
            return this;
        }
    public PersonalInfoCriteria andWechatIsNull() {
        addCriterion("wechat is null");
        return this;
    }

    public PersonalInfoCriteria andWechatIsNotNull() {
        addCriterion("wechat is not null");
        return this;
    }
    public PersonalInfoCriteria andWechatEqualTo(String value) {
        addCriterion("wechat =", value, WECHAT);
        return this;
    }
    public PersonalInfoCriteria andWechatNotEqualTo(String value) {
        addCriterion("wechat <>", value, WECHAT);
        return this;
    }    
    public PersonalInfoCriteria andWechatGreaterThan(String value) {
        addCriterion("wechat >", value, WECHAT);
        return this;
    }    
    public PersonalInfoCriteria andWechatGreaterThanOrEqualTo(String value) {
        addCriterion("wechat >=", value, WECHAT);
        return this;
    }    
    public PersonalInfoCriteria andWechatLessThan(String value) {
        addCriterion("wechat <", value, WECHAT);
        return this;
    }     
    public PersonalInfoCriteria andWechatLessThanOrEqualTo(String value) {
        addCriterion("wechat <=", value, WECHAT);
        return this;
    }
    public PersonalInfoCriteria andWechatIn(List<String> values) {
        addCriterion("wechat in", values, WECHAT);
        return this;
    }
    public PersonalInfoCriteria andWechatNotIn(List<String> values) {
        addCriterion("wechat not in", values, WECHAT);
        return this;
    }
    public PersonalInfoCriteria andWechatBetween(String value1, String value2) {
        addCriterion("wechat between", value1, value2, WECHAT);
        return this;
    }
    public PersonalInfoCriteria andWechatNotBetween(String value1, String value2) {
        addCriterion("wechat not between", value1, value2, WECHAT);
        return this;
    }
        public PersonalInfoCriteria andWechatLike(String value) {
            addCriterion("wechat like", value, WECHAT);
            return this;
        }

        public PersonalInfoCriteria andWechatNotLike(String value) {
            addCriterion("wechat not like", value, WECHAT);
            return this;
        }
    public PersonalInfoCriteria andQqIsNull() {
        addCriterion("qq is null");
        return this;
    }

    public PersonalInfoCriteria andQqIsNotNull() {
        addCriterion("qq is not null");
        return this;
    }
    public PersonalInfoCriteria andQqEqualTo(String value) {
        addCriterion("qq =", value, QQ);
        return this;
    }
    public PersonalInfoCriteria andQqNotEqualTo(String value) {
        addCriterion("qq <>", value, QQ);
        return this;
    }    
    public PersonalInfoCriteria andQqGreaterThan(String value) {
        addCriterion("qq >", value, QQ);
        return this;
    }    
    public PersonalInfoCriteria andQqGreaterThanOrEqualTo(String value) {
        addCriterion("qq >=", value, QQ);
        return this;
    }    
    public PersonalInfoCriteria andQqLessThan(String value) {
        addCriterion("qq <", value, QQ);
        return this;
    }     
    public PersonalInfoCriteria andQqLessThanOrEqualTo(String value) {
        addCriterion("qq <=", value, QQ);
        return this;
    }
    public PersonalInfoCriteria andQqIn(List<String> values) {
        addCriterion("qq in", values, QQ);
        return this;
    }
    public PersonalInfoCriteria andQqNotIn(List<String> values) {
        addCriterion("qq not in", values, QQ);
        return this;
    }
    public PersonalInfoCriteria andQqBetween(String value1, String value2) {
        addCriterion("qq between", value1, value2, QQ);
        return this;
    }
    public PersonalInfoCriteria andQqNotBetween(String value1, String value2) {
        addCriterion("qq not between", value1, value2, QQ);
        return this;
    }
        public PersonalInfoCriteria andQqLike(String value) {
            addCriterion("qq like", value, QQ);
            return this;
        }

        public PersonalInfoCriteria andQqNotLike(String value) {
            addCriterion("qq not like", value, QQ);
            return this;
        }
    public PersonalInfoCriteria andEnterDmtTimeIsNull() {
        addCriterion("enter_dmt_time is null");
        return this;
    }

    public PersonalInfoCriteria andEnterDmtTimeIsNotNull() {
        addCriterion("enter_dmt_time is not null");
        return this;
    }
    public PersonalInfoCriteria andEnterDmtTimeEqualTo(Date value) {
        addCriterion("enter_dmt_time =", value, ENTER_DMT_TIME);
        return this;
    }
    public PersonalInfoCriteria andEnterDmtTimeNotEqualTo(Date value) {
        addCriterion("enter_dmt_time <>", value, ENTER_DMT_TIME);
        return this;
    }    
    public PersonalInfoCriteria andEnterDmtTimeGreaterThan(Date value) {
        addCriterion("enter_dmt_time >", value, ENTER_DMT_TIME);
        return this;
    }    
    public PersonalInfoCriteria andEnterDmtTimeGreaterThanOrEqualTo(Date value) {
        addCriterion("enter_dmt_time >=", value, ENTER_DMT_TIME);
        return this;
    }    
    public PersonalInfoCriteria andEnterDmtTimeLessThan(Date value) {
        addCriterion("enter_dmt_time <", value, ENTER_DMT_TIME);
        return this;
    }     
    public PersonalInfoCriteria andEnterDmtTimeLessThanOrEqualTo(Date value) {
        addCriterion("enter_dmt_time <=", value, ENTER_DMT_TIME);
        return this;
    }
    public PersonalInfoCriteria andEnterDmtTimeIn(List<Date> values) {
        addCriterion("enter_dmt_time in", values, ENTER_DMT_TIME);
        return this;
    }
    public PersonalInfoCriteria andEnterDmtTimeNotIn(List<Date> values) {
        addCriterion("enter_dmt_time not in", values, ENTER_DMT_TIME);
        return this;
    }
    public PersonalInfoCriteria andEnterDmtTimeBetween(Date value1, Date value2) {
        addCriterion("enter_dmt_time between", value1, value2, ENTER_DMT_TIME);
        return this;
    }
    public PersonalInfoCriteria andEnterDmtTimeNotBetween(Date value1, Date value2) {
        addCriterion("enter_dmt_time not between", value1, value2, ENTER_DMT_TIME);
        return this;
    }
    public PersonalInfoCriteria andGraduateDmtTimeIsNull() {
        addCriterion("graduate_dmt_time is null");
        return this;
    }

    public PersonalInfoCriteria andGraduateDmtTimeIsNotNull() {
        addCriterion("graduate_dmt_time is not null");
        return this;
    }
    public PersonalInfoCriteria andGraduateDmtTimeEqualTo(Date value) {
        addCriterion("graduate_dmt_time =", value, GRADUATE_DMT_TIME);
        return this;
    }
    public PersonalInfoCriteria andGraduateDmtTimeNotEqualTo(Date value) {
        addCriterion("graduate_dmt_time <>", value, GRADUATE_DMT_TIME);
        return this;
    }    
    public PersonalInfoCriteria andGraduateDmtTimeGreaterThan(Date value) {
        addCriterion("graduate_dmt_time >", value, GRADUATE_DMT_TIME);
        return this;
    }    
    public PersonalInfoCriteria andGraduateDmtTimeGreaterThanOrEqualTo(Date value) {
        addCriterion("graduate_dmt_time >=", value, GRADUATE_DMT_TIME);
        return this;
    }    
    public PersonalInfoCriteria andGraduateDmtTimeLessThan(Date value) {
        addCriterion("graduate_dmt_time <", value, GRADUATE_DMT_TIME);
        return this;
    }     
    public PersonalInfoCriteria andGraduateDmtTimeLessThanOrEqualTo(Date value) {
        addCriterion("graduate_dmt_time <=", value, GRADUATE_DMT_TIME);
        return this;
    }
    public PersonalInfoCriteria andGraduateDmtTimeIn(List<Date> values) {
        addCriterion("graduate_dmt_time in", values, GRADUATE_DMT_TIME);
        return this;
    }
    public PersonalInfoCriteria andGraduateDmtTimeNotIn(List<Date> values) {
        addCriterion("graduate_dmt_time not in", values, GRADUATE_DMT_TIME);
        return this;
    }
    public PersonalInfoCriteria andGraduateDmtTimeBetween(Date value1, Date value2) {
        addCriterion("graduate_dmt_time between", value1, value2, GRADUATE_DMT_TIME);
        return this;
    }
    public PersonalInfoCriteria andGraduateDmtTimeNotBetween(Date value1, Date value2) {
        addCriterion("graduate_dmt_time not between", value1, value2, GRADUATE_DMT_TIME);
        return this;
    }
    public PersonalInfoCriteria andEnterCollegeTimeIsNull() {
        addCriterion("enter_college_time is null");
        return this;
    }

    public PersonalInfoCriteria andEnterCollegeTimeIsNotNull() {
        addCriterion("enter_college_time is not null");
        return this;
    }
    public PersonalInfoCriteria andEnterCollegeTimeEqualTo(Date value) {
        addCriterion("enter_college_time =", value, ENTER_COLLEGE_TIME);
        return this;
    }
    public PersonalInfoCriteria andEnterCollegeTimeNotEqualTo(Date value) {
        addCriterion("enter_college_time <>", value, ENTER_COLLEGE_TIME);
        return this;
    }    
    public PersonalInfoCriteria andEnterCollegeTimeGreaterThan(Date value) {
        addCriterion("enter_college_time >", value, ENTER_COLLEGE_TIME);
        return this;
    }    
    public PersonalInfoCriteria andEnterCollegeTimeGreaterThanOrEqualTo(Date value) {
        addCriterion("enter_college_time >=", value, ENTER_COLLEGE_TIME);
        return this;
    }    
    public PersonalInfoCriteria andEnterCollegeTimeLessThan(Date value) {
        addCriterion("enter_college_time <", value, ENTER_COLLEGE_TIME);
        return this;
    }     
    public PersonalInfoCriteria andEnterCollegeTimeLessThanOrEqualTo(Date value) {
        addCriterion("enter_college_time <=", value, ENTER_COLLEGE_TIME);
        return this;
    }
    public PersonalInfoCriteria andEnterCollegeTimeIn(List<Date> values) {
        addCriterion("enter_college_time in", values, ENTER_COLLEGE_TIME);
        return this;
    }
    public PersonalInfoCriteria andEnterCollegeTimeNotIn(List<Date> values) {
        addCriterion("enter_college_time not in", values, ENTER_COLLEGE_TIME);
        return this;
    }
    public PersonalInfoCriteria andEnterCollegeTimeBetween(Date value1, Date value2) {
        addCriterion("enter_college_time between", value1, value2, ENTER_COLLEGE_TIME);
        return this;
    }
    public PersonalInfoCriteria andEnterCollegeTimeNotBetween(Date value1, Date value2) {
        addCriterion("enter_college_time not between", value1, value2, ENTER_COLLEGE_TIME);
        return this;
    }
    public PersonalInfoCriteria andGraduateCollegeTimeIsNull() {
        addCriterion("graduate_college_time is null");
        return this;
    }

    public PersonalInfoCriteria andGraduateCollegeTimeIsNotNull() {
        addCriterion("graduate_college_time is not null");
        return this;
    }
    public PersonalInfoCriteria andGraduateCollegeTimeEqualTo(Date value) {
        addCriterion("graduate_college_time =", value, GRADUATE_COLLEGE_TIME);
        return this;
    }
    public PersonalInfoCriteria andGraduateCollegeTimeNotEqualTo(Date value) {
        addCriterion("graduate_college_time <>", value, GRADUATE_COLLEGE_TIME);
        return this;
    }    
    public PersonalInfoCriteria andGraduateCollegeTimeGreaterThan(Date value) {
        addCriterion("graduate_college_time >", value, GRADUATE_COLLEGE_TIME);
        return this;
    }    
    public PersonalInfoCriteria andGraduateCollegeTimeGreaterThanOrEqualTo(Date value) {
        addCriterion("graduate_college_time >=", value, GRADUATE_COLLEGE_TIME);
        return this;
    }    
    public PersonalInfoCriteria andGraduateCollegeTimeLessThan(Date value) {
        addCriterion("graduate_college_time <", value, GRADUATE_COLLEGE_TIME);
        return this;
    }     
    public PersonalInfoCriteria andGraduateCollegeTimeLessThanOrEqualTo(Date value) {
        addCriterion("graduate_college_time <=", value, GRADUATE_COLLEGE_TIME);
        return this;
    }
    public PersonalInfoCriteria andGraduateCollegeTimeIn(List<Date> values) {
        addCriterion("graduate_college_time in", values, GRADUATE_COLLEGE_TIME);
        return this;
    }
    public PersonalInfoCriteria andGraduateCollegeTimeNotIn(List<Date> values) {
        addCriterion("graduate_college_time not in", values, GRADUATE_COLLEGE_TIME);
        return this;
    }
    public PersonalInfoCriteria andGraduateCollegeTimeBetween(Date value1, Date value2) {
        addCriterion("graduate_college_time between", value1, value2, GRADUATE_COLLEGE_TIME);
        return this;
    }
    public PersonalInfoCriteria andGraduateCollegeTimeNotBetween(Date value1, Date value2) {
        addCriterion("graduate_college_time not between", value1, value2, GRADUATE_COLLEGE_TIME);
        return this;
    }
    public PersonalInfoCriteria andNativePlaceIsNull() {
        addCriterion("native_place is null");
        return this;
    }

    public PersonalInfoCriteria andNativePlaceIsNotNull() {
        addCriterion("native_place is not null");
        return this;
    }
    public PersonalInfoCriteria andNativePlaceEqualTo(String value) {
        addCriterion("native_place =", value, NATIVE_PLACE);
        return this;
    }
    public PersonalInfoCriteria andNativePlaceNotEqualTo(String value) {
        addCriterion("native_place <>", value, NATIVE_PLACE);
        return this;
    }    
    public PersonalInfoCriteria andNativePlaceGreaterThan(String value) {
        addCriterion("native_place >", value, NATIVE_PLACE);
        return this;
    }    
    public PersonalInfoCriteria andNativePlaceGreaterThanOrEqualTo(String value) {
        addCriterion("native_place >=", value, NATIVE_PLACE);
        return this;
    }    
    public PersonalInfoCriteria andNativePlaceLessThan(String value) {
        addCriterion("native_place <", value, NATIVE_PLACE);
        return this;
    }     
    public PersonalInfoCriteria andNativePlaceLessThanOrEqualTo(String value) {
        addCriterion("native_place <=", value, NATIVE_PLACE);
        return this;
    }
    public PersonalInfoCriteria andNativePlaceIn(List<String> values) {
        addCriterion("native_place in", values, NATIVE_PLACE);
        return this;
    }
    public PersonalInfoCriteria andNativePlaceNotIn(List<String> values) {
        addCriterion("native_place not in", values, NATIVE_PLACE);
        return this;
    }
    public PersonalInfoCriteria andNativePlaceBetween(String value1, String value2) {
        addCriterion("native_place between", value1, value2, NATIVE_PLACE);
        return this;
    }
    public PersonalInfoCriteria andNativePlaceNotBetween(String value1, String value2) {
        addCriterion("native_place not between", value1, value2, NATIVE_PLACE);
        return this;
    }
        public PersonalInfoCriteria andNativePlaceLike(String value) {
            addCriterion("native_place like", value, NATIVE_PLACE);
            return this;
        }

        public PersonalInfoCriteria andNativePlaceNotLike(String value) {
            addCriterion("native_place not like", value, NATIVE_PLACE);
            return this;
        }
    public PersonalInfoCriteria andAddressIsNull() {
        addCriterion("address is null");
        return this;
    }

    public PersonalInfoCriteria andAddressIsNotNull() {
        addCriterion("address is not null");
        return this;
    }
    public PersonalInfoCriteria andAddressEqualTo(String value) {
        addCriterion("address =", value, ADDRESS);
        return this;
    }
    public PersonalInfoCriteria andAddressNotEqualTo(String value) {
        addCriterion("address <>", value, ADDRESS);
        return this;
    }    
    public PersonalInfoCriteria andAddressGreaterThan(String value) {
        addCriterion("address >", value, ADDRESS);
        return this;
    }    
    public PersonalInfoCriteria andAddressGreaterThanOrEqualTo(String value) {
        addCriterion("address >=", value, ADDRESS);
        return this;
    }    
    public PersonalInfoCriteria andAddressLessThan(String value) {
        addCriterion("address <", value, ADDRESS);
        return this;
    }     
    public PersonalInfoCriteria andAddressLessThanOrEqualTo(String value) {
        addCriterion("address <=", value, ADDRESS);
        return this;
    }
    public PersonalInfoCriteria andAddressIn(List<String> values) {
        addCriterion("address in", values, ADDRESS);
        return this;
    }
    public PersonalInfoCriteria andAddressNotIn(List<String> values) {
        addCriterion("address not in", values, ADDRESS);
        return this;
    }
    public PersonalInfoCriteria andAddressBetween(String value1, String value2) {
        addCriterion("address between", value1, value2, ADDRESS);
        return this;
    }
    public PersonalInfoCriteria andAddressNotBetween(String value1, String value2) {
        addCriterion("address not between", value1, value2, ADDRESS);
        return this;
    }
        public PersonalInfoCriteria andAddressLike(String value) {
            addCriterion("address like", value, ADDRESS);
            return this;
        }

        public PersonalInfoCriteria andAddressNotLike(String value) {
            addCriterion("address not like", value, ADDRESS);
            return this;
        }
    public PersonalInfoCriteria andProfessionalFieldIsNull() {
        addCriterion("professional_field is null");
        return this;
    }

    public PersonalInfoCriteria andProfessionalFieldIsNotNull() {
        addCriterion("professional_field is not null");
        return this;
    }
    public PersonalInfoCriteria andProfessionalFieldEqualTo(String value) {
        addCriterion("professional_field =", value, PROFESSIONAL_FIELD);
        return this;
    }
    public PersonalInfoCriteria andProfessionalFieldNotEqualTo(String value) {
        addCriterion("professional_field <>", value, PROFESSIONAL_FIELD);
        return this;
    }    
    public PersonalInfoCriteria andProfessionalFieldGreaterThan(String value) {
        addCriterion("professional_field >", value, PROFESSIONAL_FIELD);
        return this;
    }    
    public PersonalInfoCriteria andProfessionalFieldGreaterThanOrEqualTo(String value) {
        addCriterion("professional_field >=", value, PROFESSIONAL_FIELD);
        return this;
    }    
    public PersonalInfoCriteria andProfessionalFieldLessThan(String value) {
        addCriterion("professional_field <", value, PROFESSIONAL_FIELD);
        return this;
    }     
    public PersonalInfoCriteria andProfessionalFieldLessThanOrEqualTo(String value) {
        addCriterion("professional_field <=", value, PROFESSIONAL_FIELD);
        return this;
    }
    public PersonalInfoCriteria andProfessionalFieldIn(List<String> values) {
        addCriterion("professional_field in", values, PROFESSIONAL_FIELD);
        return this;
    }
    public PersonalInfoCriteria andProfessionalFieldNotIn(List<String> values) {
        addCriterion("professional_field not in", values, PROFESSIONAL_FIELD);
        return this;
    }
    public PersonalInfoCriteria andProfessionalFieldBetween(String value1, String value2) {
        addCriterion("professional_field between", value1, value2, PROFESSIONAL_FIELD);
        return this;
    }
    public PersonalInfoCriteria andProfessionalFieldNotBetween(String value1, String value2) {
        addCriterion("professional_field not between", value1, value2, PROFESSIONAL_FIELD);
        return this;
    }
        public PersonalInfoCriteria andProfessionalFieldLike(String value) {
            addCriterion("professional_field like", value, PROFESSIONAL_FIELD);
            return this;
        }

        public PersonalInfoCriteria andProfessionalFieldNotLike(String value) {
            addCriterion("professional_field not like", value, PROFESSIONAL_FIELD);
            return this;
        }
    public PersonalInfoCriteria andOperatorNameIsNull() {
        addCriterion("operator_name is null");
        return this;
    }

    public PersonalInfoCriteria andOperatorNameIsNotNull() {
        addCriterion("operator_name is not null");
        return this;
    }
    public PersonalInfoCriteria andOperatorNameEqualTo(String value) {
        addCriterion("operator_name =", value, OPERATOR_NAME);
        return this;
    }
    public PersonalInfoCriteria andOperatorNameNotEqualTo(String value) {
        addCriterion("operator_name <>", value, OPERATOR_NAME);
        return this;
    }    
    public PersonalInfoCriteria andOperatorNameGreaterThan(String value) {
        addCriterion("operator_name >", value, OPERATOR_NAME);
        return this;
    }    
    public PersonalInfoCriteria andOperatorNameGreaterThanOrEqualTo(String value) {
        addCriterion("operator_name >=", value, OPERATOR_NAME);
        return this;
    }    
    public PersonalInfoCriteria andOperatorNameLessThan(String value) {
        addCriterion("operator_name <", value, OPERATOR_NAME);
        return this;
    }     
    public PersonalInfoCriteria andOperatorNameLessThanOrEqualTo(String value) {
        addCriterion("operator_name <=", value, OPERATOR_NAME);
        return this;
    }
    public PersonalInfoCriteria andOperatorNameIn(List<String> values) {
        addCriterion("operator_name in", values, OPERATOR_NAME);
        return this;
    }
    public PersonalInfoCriteria andOperatorNameNotIn(List<String> values) {
        addCriterion("operator_name not in", values, OPERATOR_NAME);
        return this;
    }
    public PersonalInfoCriteria andOperatorNameBetween(String value1, String value2) {
        addCriterion("operator_name between", value1, value2, OPERATOR_NAME);
        return this;
    }
    public PersonalInfoCriteria andOperatorNameNotBetween(String value1, String value2) {
        addCriterion("operator_name not between", value1, value2, OPERATOR_NAME);
        return this;
    }
        public PersonalInfoCriteria andOperatorNameLike(String value) {
            addCriterion("operator_name like", value, OPERATOR_NAME);
            return this;
        }

        public PersonalInfoCriteria andOperatorNameNotLike(String value) {
            addCriterion("operator_name not like", value, OPERATOR_NAME);
            return this;
        }
    public PersonalInfoCriteria andOperatorIdIsNull() {
        addCriterion("operator_id is null");
        return this;
    }

    public PersonalInfoCriteria andOperatorIdIsNotNull() {
        addCriterion("operator_id is not null");
        return this;
    }
    public PersonalInfoCriteria andOperatorIdEqualTo(String value) {
        addCriterion("operator_id =", value, OPERATOR_ID);
        return this;
    }
    public PersonalInfoCriteria andOperatorIdNotEqualTo(String value) {
        addCriterion("operator_id <>", value, OPERATOR_ID);
        return this;
    }    
    public PersonalInfoCriteria andOperatorIdGreaterThan(String value) {
        addCriterion("operator_id >", value, OPERATOR_ID);
        return this;
    }    
    public PersonalInfoCriteria andOperatorIdGreaterThanOrEqualTo(String value) {
        addCriterion("operator_id >=", value, OPERATOR_ID);
        return this;
    }    
    public PersonalInfoCriteria andOperatorIdLessThan(String value) {
        addCriterion("operator_id <", value, OPERATOR_ID);
        return this;
    }     
    public PersonalInfoCriteria andOperatorIdLessThanOrEqualTo(String value) {
        addCriterion("operator_id <=", value, OPERATOR_ID);
        return this;
    }
    public PersonalInfoCriteria andOperatorIdIn(List<String> values) {
        addCriterion("operator_id in", values, OPERATOR_ID);
        return this;
    }
    public PersonalInfoCriteria andOperatorIdNotIn(List<String> values) {
        addCriterion("operator_id not in", values, OPERATOR_ID);
        return this;
    }
    public PersonalInfoCriteria andOperatorIdBetween(String value1, String value2) {
        addCriterion("operator_id between", value1, value2, OPERATOR_ID);
        return this;
    }
    public PersonalInfoCriteria andOperatorIdNotBetween(String value1, String value2) {
        addCriterion("operator_id not between", value1, value2, OPERATOR_ID);
        return this;
    }
        public PersonalInfoCriteria andOperatorIdLike(String value) {
            addCriterion("operator_id like", value, OPERATOR_ID);
            return this;
        }

        public PersonalInfoCriteria andOperatorIdNotLike(String value) {
            addCriterion("operator_id not like", value, OPERATOR_ID);
            return this;
        }
    public PersonalInfoCriteria andTimestampTimeIsNull() {
        addCriterion("timestamp_time is null");
        return this;
    }

    public PersonalInfoCriteria andTimestampTimeIsNotNull() {
        addCriterion("timestamp_time is not null");
        return this;
    }
    public PersonalInfoCriteria andTimestampTimeEqualTo(String value) {
        addCriterion("timestamp_time =", value, TIMESTAMP_TIME);
        return this;
    }
    public PersonalInfoCriteria andTimestampTimeNotEqualTo(String value) {
        addCriterion("timestamp_time <>", value, TIMESTAMP_TIME);
        return this;
    }    
    public PersonalInfoCriteria andTimestampTimeGreaterThan(String value) {
        addCriterion("timestamp_time >", value, TIMESTAMP_TIME);
        return this;
    }    
    public PersonalInfoCriteria andTimestampTimeGreaterThanOrEqualTo(String value) {
        addCriterion("timestamp_time >=", value, TIMESTAMP_TIME);
        return this;
    }    
    public PersonalInfoCriteria andTimestampTimeLessThan(String value) {
        addCriterion("timestamp_time <", value, TIMESTAMP_TIME);
        return this;
    }     
    public PersonalInfoCriteria andTimestampTimeLessThanOrEqualTo(String value) {
        addCriterion("timestamp_time <=", value, TIMESTAMP_TIME);
        return this;
    }
    public PersonalInfoCriteria andTimestampTimeIn(List<String> values) {
        addCriterion("timestamp_time in", values, TIMESTAMP_TIME);
        return this;
    }
    public PersonalInfoCriteria andTimestampTimeNotIn(List<String> values) {
        addCriterion("timestamp_time not in", values, TIMESTAMP_TIME);
        return this;
    }
    public PersonalInfoCriteria andTimestampTimeBetween(String value1, String value2) {
        addCriterion("timestamp_time between", value1, value2, TIMESTAMP_TIME);
        return this;
    }
    public PersonalInfoCriteria andTimestampTimeNotBetween(String value1, String value2) {
        addCriterion("timestamp_time not between", value1, value2, TIMESTAMP_TIME);
        return this;
    }
}

