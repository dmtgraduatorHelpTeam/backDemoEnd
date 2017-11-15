package com.dmsdbj.dmt.graduatorHelp.entity;

import com.dmsdbj.itoo.tool.base.entity.BaseEntity;
import java.io.Serializable;
import java.util.Date;
/**
 * @author: 马金兴 
 * @create: 2017-11-15 15:47:40.
 */

public class CompanyEntity extends BaseEntity implements Serializable{
 	
	/**
	 *
	 * 公司名称
	 */
	private String companyName;
	/**
	 *
	 * 公司电话
	 */
	private String companyTel;
	/**
	 *
	 * 入职时间
	 */
	private Date entryTime;
	/**
	 *
	 * 离职时间
	 */
	private Date quitTime;
	/**
	 *
	 * 趣事
	 */
	private String funnyThing;
	/**
	 *
	 * 地址
	 */
	private String companyAddress;
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
	public String getCompanyName() {
		return companyName;
	}

	/**
	 * 
	 * @param companyName 公司名称
	 */
    public void setCompanyName(String companyName) {
		this.companyName = (companyName== null ? null : companyName.trim());
	}
	/**
	 *
	 * @return String
	 */
	public String getCompanyTel() {
		return companyTel;
	}

	/**
	 * 
	 * @param companyTel 公司电话
	 */
    public void setCompanyTel(String companyTel) {
		this.companyTel = (companyTel== null ? null : companyTel.trim());
	}
	/**
	 *
	 * @return Date
	 */
	public Date getEntryTime() {
		return entryTime;
	}

	/**
	 * 
	 * @param entryTime 入职时间
	 */
    public void setEntryTime(Date entryTime) {
		this.entryTime = entryTime;
	}
	/**
	 *
	 * @return Date
	 */
	public Date getQuitTime() {
		return quitTime;
	}

	/**
	 * 
	 * @param quitTime 离职时间
	 */
    public void setQuitTime(Date quitTime) {
		this.quitTime = quitTime;
	}
	/**
	 *
	 * @return String
	 */
	public String getFunnyThing() {
		return funnyThing;
	}

	/**
	 * 
	 * @param funnyThing 趣事
	 */
    public void setFunnyThing(String funnyThing) {
		this.funnyThing = (funnyThing== null ? null : funnyThing.trim());
	}
	/**
	 *
	 * @return String
	 */
	public String getCompanyAddress() {
		return companyAddress;
	}

	/**
	 * 
	 * @param companyAddress 地址
	 */
    public void setCompanyAddress(String companyAddress) {
		this.companyAddress = (companyAddress== null ? null : companyAddress.trim());
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
		return "CompanyEntity{"+
		"companyName='"+companyName+'\''+
		"companyTel='"+companyTel+'\''+
		"entryTime='"+entryTime+'\''+
		"quitTime='"+quitTime+'\''+
		"funnyThing='"+funnyThing+'\''+
		"companyAddress='"+companyAddress+'\''+
		"operatorId='"+operatorId+'\''+
		"timestampTime='"+timestampTime+'\''+
		'}';
	}
}
