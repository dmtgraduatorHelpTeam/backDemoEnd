package com.dmsdbj.dmt.graduatorHelp.entity;

import com.dmsdbj.itoo.tool.base.entity.BaseEntity;
import java.io.Serializable;
import java.util.Date;
/**
 * @author: 马金兴 
 * @create: 2017-11-15 15:47:40.
 */

public class SkillPointEntity extends BaseEntity implements Serializable{
 	
	/**
	 *
	 * 父id
	 */
	private String pId;
	/**
	 *
	 * 用户id
	 */
	private String userId;
	/**
	 *
	 * 公司id
	 */
	private String companyId;
	/**
	 *
	 * 技术名称
	 */
	private String techName;
	/**
	 *
	 * 操作人id
	 */
	private String operatorId;
	/**
	 *
	 * 时间戳
	 */
	private Date timestampTime;

	/**
	 *
	 * @return String
	 */
	public String getPId() {
		return pId;
	}

	/**
	 * 
	 * @param pId 父id
	 */
    public void setPId(String pId) {
		this.pId = (pId== null ? null : pId.trim());
	}
	/**
	 *
	 * @return String
	 */
	public String getUserId() {
		return userId;
	}

	/**
	 * 
	 * @param userId 用户id
	 */
    public void setUserId(String userId) {
		this.userId = (userId== null ? null : userId.trim());
	}
	/**
	 *
	 * @return String
	 */
	public String getCompanyId() {
		return companyId;
	}

	/**
	 * 
	 * @param companyId 公司id
	 */
    public void setCompanyId(String companyId) {
		this.companyId = (companyId== null ? null : companyId.trim());
	}
	/**
	 *
	 * @return String
	 */
	public String getTechName() {
		return techName;
	}

	/**
	 * 
	 * @param techName 技术名称
	 */
    public void setTechName(String techName) {
		this.techName = (techName== null ? null : techName.trim());
	}
	/**
	 *
	 * @return String
	 */
	public String getOperatorId() {
		return operatorId;
	}

	/**
	 * 
	 * @param operatorId 操作人id
	 */
    public void setOperatorId(String operatorId) {
		this.operatorId = (operatorId== null ? null : operatorId.trim());
	}
	/**
	 *
	 * @return Date
	 */
	public Date getTimestampTime() {
		return timestampTime;
	}

	/**
	 * 
	 * @param timestampTime 时间戳
	 */
    public void setTimestampTime(Date timestampTime) {
		this.timestampTime = timestampTime;
	}
	
	@Override
    public String toString() {
		return "SkillPointEntity{"+
		"pId='"+pId+'\''+
		"userId='"+userId+'\''+
		"companyId='"+companyId+'\''+
		"techName='"+techName+'\''+
		"operatorId='"+operatorId+'\''+
		"timestampTime='"+timestampTime+'\''+
		'}';
	}
}
