package com.dmsdbj.itoo.demo.mybatisexample;

import com.dmsdbj.itoo.tool.base.exampletool.Criterion;
import com.dmsdbj.itoo.tool.base.exampletool.GeneratedCriteria;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author :张晗-十一期
 * @version:V1.4
 * @DESCRIPTION:解决sonar检查问题定义变量来替换
 * @create:2017年8月15日
 * 
 */
public  class ClassCriteria extends GeneratedCriteria<ClassCriteria> implements Serializable{

    protected ClassCriteria() {
        super();
        criteria = new ArrayList<Criterion>();
    }

    private static final String CLASS_CODE = "classCode";   
    private static final String CLASS_NAME = "className";   
    private static final String GRADE = "grade";   
    private static final String PROFESSION_ID = "professionId";   
    private static final String CAMPUSE = "campuse";   

    public ClassCriteria andClassCodeIsNull() {
        addCriterion("class_code is null");
        return this;
    }

    public ClassCriteria andClassCodeIsNotNull() {
        addCriterion("class_code is not null");
        return this;
    }
    public ClassCriteria andClassCodeEqualTo(String value) {
        addCriterion("class_code =", value, CLASS_CODE);
        return this;
    }
    public ClassCriteria andClassCodeNotEqualTo(String value) {
        addCriterion("class_code <>", value, CLASS_CODE);
        return this;
    }    
    public ClassCriteria andClassCodeGreaterThan(String value) {
        addCriterion("class_code >", value, CLASS_CODE);
        return this;
    }    
    public ClassCriteria andClassCodeGreaterThanOrEqualTo(String value) {
        addCriterion("class_code >=", value, CLASS_CODE);
        return this;
    }    
    public ClassCriteria andClassCodeLessThan(String value) {
        addCriterion("class_code <", value, CLASS_CODE);
        return this;
    }     
    public ClassCriteria andClassCodeLessThanOrEqualTo(String value) {
        addCriterion("class_code <=", value, CLASS_CODE);
        return this;
    }
    public ClassCriteria andClassCodeIn(List<String> values) {
        addCriterion("class_code in", values, CLASS_CODE);
        return this;
    }
    public ClassCriteria andClassCodeNotIn(List<String> values) {
        addCriterion("class_code not in", values, CLASS_CODE);
        return this;
    }
    public ClassCriteria andClassCodeBetween(String value1, String value2) {
        addCriterion("class_code between", value1, value2, CLASS_CODE);
        return this;
    }
    public ClassCriteria andClassCodeNotBetween(String value1, String value2) {
        addCriterion("class_code not between", value1, value2, CLASS_CODE);
        return this;
    }
        public ClassCriteria andClassCodeLike(String value) {
            addCriterion("class_code like", value, CLASS_CODE);
            return this;
        }

        public ClassCriteria andClassCodeNotLike(String value) {
            addCriterion("class_code not like", value, CLASS_CODE);
            return this;
        }
    public ClassCriteria andClassNameIsNull() {
        addCriterion("class_name is null");
        return this;
    }

    public ClassCriteria andClassNameIsNotNull() {
        addCriterion("class_name is not null");
        return this;
    }
    public ClassCriteria andClassNameEqualTo(String value) {
        addCriterion("class_name =", value, CLASS_NAME);
        return this;
    }
    public ClassCriteria andClassNameNotEqualTo(String value) {
        addCriterion("class_name <>", value, CLASS_NAME);
        return this;
    }    
    public ClassCriteria andClassNameGreaterThan(String value) {
        addCriterion("class_name >", value, CLASS_NAME);
        return this;
    }    
    public ClassCriteria andClassNameGreaterThanOrEqualTo(String value) {
        addCriterion("class_name >=", value, CLASS_NAME);
        return this;
    }    
    public ClassCriteria andClassNameLessThan(String value) {
        addCriterion("class_name <", value, CLASS_NAME);
        return this;
    }     
    public ClassCriteria andClassNameLessThanOrEqualTo(String value) {
        addCriterion("class_name <=", value, CLASS_NAME);
        return this;
    }
    public ClassCriteria andClassNameIn(List<String> values) {
        addCriterion("class_name in", values, CLASS_NAME);
        return this;
    }
    public ClassCriteria andClassNameNotIn(List<String> values) {
        addCriterion("class_name not in", values, CLASS_NAME);
        return this;
    }
    public ClassCriteria andClassNameBetween(String value1, String value2) {
        addCriterion("class_name between", value1, value2, CLASS_NAME);
        return this;
    }
    public ClassCriteria andClassNameNotBetween(String value1, String value2) {
        addCriterion("class_name not between", value1, value2, CLASS_NAME);
        return this;
    }
        public ClassCriteria andClassNameLike(String value) {
            addCriterion("class_name like", value, CLASS_NAME);
            return this;
        }

        public ClassCriteria andClassNameNotLike(String value) {
            addCriterion("class_name not like", value, CLASS_NAME);
            return this;
        }
    public ClassCriteria andGradeIsNull() {
        addCriterion("grade is null");
        return this;
    }

    public ClassCriteria andGradeIsNotNull() {
        addCriterion("grade is not null");
        return this;
    }
    public ClassCriteria andGradeEqualTo(String value) {
        addCriterion("grade =", value, GRADE);
        return this;
    }
    public ClassCriteria andGradeNotEqualTo(String value) {
        addCriterion("grade <>", value, GRADE);
        return this;
    }    
    public ClassCriteria andGradeGreaterThan(String value) {
        addCriterion("grade >", value, GRADE);
        return this;
    }    
    public ClassCriteria andGradeGreaterThanOrEqualTo(String value) {
        addCriterion("grade >=", value, GRADE);
        return this;
    }    
    public ClassCriteria andGradeLessThan(String value) {
        addCriterion("grade <", value, GRADE);
        return this;
    }     
    public ClassCriteria andGradeLessThanOrEqualTo(String value) {
        addCriterion("grade <=", value, GRADE);
        return this;
    }
    public ClassCriteria andGradeIn(List<String> values) {
        addCriterion("grade in", values, GRADE);
        return this;
    }
    public ClassCriteria andGradeNotIn(List<String> values) {
        addCriterion("grade not in", values, GRADE);
        return this;
    }
    public ClassCriteria andGradeBetween(String value1, String value2) {
        addCriterion("grade between", value1, value2, GRADE);
        return this;
    }
    public ClassCriteria andGradeNotBetween(String value1, String value2) {
        addCriterion("grade not between", value1, value2, GRADE);
        return this;
    }
        public ClassCriteria andGradeLike(String value) {
            addCriterion("grade like", value, GRADE);
            return this;
        }

        public ClassCriteria andGradeNotLike(String value) {
            addCriterion("grade not like", value, GRADE);
            return this;
        }
    public ClassCriteria andProfessionIdIsNull() {
        addCriterion("profession_id is null");
        return this;
    }

    public ClassCriteria andProfessionIdIsNotNull() {
        addCriterion("profession_id is not null");
        return this;
    }
    public ClassCriteria andProfessionIdEqualTo(String value) {
        addCriterion("profession_id =", value, PROFESSION_ID);
        return this;
    }
    public ClassCriteria andProfessionIdNotEqualTo(String value) {
        addCriterion("profession_id <>", value, PROFESSION_ID);
        return this;
    }    
    public ClassCriteria andProfessionIdGreaterThan(String value) {
        addCriterion("profession_id >", value, PROFESSION_ID);
        return this;
    }    
    public ClassCriteria andProfessionIdGreaterThanOrEqualTo(String value) {
        addCriterion("profession_id >=", value, PROFESSION_ID);
        return this;
    }    
    public ClassCriteria andProfessionIdLessThan(String value) {
        addCriterion("profession_id <", value, PROFESSION_ID);
        return this;
    }     
    public ClassCriteria andProfessionIdLessThanOrEqualTo(String value) {
        addCriterion("profession_id <=", value, PROFESSION_ID);
        return this;
    }
    public ClassCriteria andProfessionIdIn(List<String> values) {
        addCriterion("profession_id in", values, PROFESSION_ID);
        return this;
    }
    public ClassCriteria andProfessionIdNotIn(List<String> values) {
        addCriterion("profession_id not in", values, PROFESSION_ID);
        return this;
    }
    public ClassCriteria andProfessionIdBetween(String value1, String value2) {
        addCriterion("profession_id between", value1, value2, PROFESSION_ID);
        return this;
    }
    public ClassCriteria andProfessionIdNotBetween(String value1, String value2) {
        addCriterion("profession_id not between", value1, value2, PROFESSION_ID);
        return this;
    }
        public ClassCriteria andProfessionIdLike(String value) {
            addCriterion("profession_id like", value, PROFESSION_ID);
            return this;
        }

        public ClassCriteria andProfessionIdNotLike(String value) {
            addCriterion("profession_id not like", value, PROFESSION_ID);
            return this;
        }
    public ClassCriteria andCampuseIsNull() {
        addCriterion("campuse is null");
        return this;
    }

    public ClassCriteria andCampuseIsNotNull() {
        addCriterion("campuse is not null");
        return this;
    }
    public ClassCriteria andCampuseEqualTo(String value) {
        addCriterion("campuse =", value, CAMPUSE);
        return this;
    }
    public ClassCriteria andCampuseNotEqualTo(String value) {
        addCriterion("campuse <>", value, CAMPUSE);
        return this;
    }    
    public ClassCriteria andCampuseGreaterThan(String value) {
        addCriterion("campuse >", value, CAMPUSE);
        return this;
    }    
    public ClassCriteria andCampuseGreaterThanOrEqualTo(String value) {
        addCriterion("campuse >=", value, CAMPUSE);
        return this;
    }    
    public ClassCriteria andCampuseLessThan(String value) {
        addCriterion("campuse <", value, CAMPUSE);
        return this;
    }     
    public ClassCriteria andCampuseLessThanOrEqualTo(String value) {
        addCriterion("campuse <=", value, CAMPUSE);
        return this;
    }
    public ClassCriteria andCampuseIn(List<String> values) {
        addCriterion("campuse in", values, CAMPUSE);
        return this;
    }
    public ClassCriteria andCampuseNotIn(List<String> values) {
        addCriterion("campuse not in", values, CAMPUSE);
        return this;
    }
    public ClassCriteria andCampuseBetween(String value1, String value2) {
        addCriterion("campuse between", value1, value2, CAMPUSE);
        return this;
    }
    public ClassCriteria andCampuseNotBetween(String value1, String value2) {
        addCriterion("campuse not between", value1, value2, CAMPUSE);
        return this;
    }
        public ClassCriteria andCampuseLike(String value) {
            addCriterion("campuse like", value, CAMPUSE);
            return this;
        }

        public ClassCriteria andCampuseNotLike(String value) {
            addCriterion("campuse not like", value, CAMPUSE);
            return this;
        }
}

