package com.dmsdbj.dmt.graduatorHelp.mybatisexample;

import java.util.List;
import java.util.ArrayList;
import java.io.Serializable;

/**
 * 
 * @author :张晗-十一期
 * @version:V1.1
 * @DESCRIPTION:根据sonar 改private属性 去掉arrayList<>中内容
 * @create:2017年8月15日
 * 
 */
public class CommercialOppotunityExample implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    private List<CommercialOppotunityCriteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    /**
     * 构造函数
     */
    public CommercialOppotunityExample() {
        oredCriteria = new ArrayList<>();
    }

    /**
     *以某字段升序或降序排序---比如：orderByClause=字段名 ASC  表示升序
     * @param orderByClause
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     *获得升序降序排序条件
     * @return String
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     *去除重复，boolean型，true为选择不重复的记录
     * @param distinct
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     *
     * @return boolean
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     *
     * @return List<CommercialOppotunityCriteria>
     */
    public List<CommercialOppotunityCriteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     *
     * @param criteria
     */
    public void or(CommercialOppotunityCriteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     *
     * @return CommercialOppotunityCriteria
     */
    public CommercialOppotunityCriteria or() {
        CommercialOppotunityCriteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     *
     * @return CommercialOppotunityCriteria
     */
    public CommercialOppotunityCriteria createCriteria() {
        CommercialOppotunityCriteria criteria = createCriteriaInternal();
        if (oredCriteria.isEmpty()) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     *
     * @return CommercialOppotunityCriteria
     */
    protected CommercialOppotunityCriteria createCriteriaInternal() {
        return new CommercialOppotunityCriteria();
    }

    /**
     * 清空查询条件
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     *
     * @param limit
     */
    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    /**
     *
     * @return Integer
     */
    public Integer getLimit() {
        return limit;
    }

    /**
     *
     * @param offset
     */
    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    /**
     *
     * @return Integer
     */
    public Integer getOffset() {
        return offset;
    }


}