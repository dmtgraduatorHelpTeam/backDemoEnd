package com.dmsdbj.dmt.graduatorHelp.entity;

import com.dmsdbj.itoo.tool.base.entity.BaseEntity;
import java.io.Serializable;
import java.util.Date;
/**
 * @author: 马金兴 
 * @create: 2017-11-15 15:47:40.
 */

public class HomeInfoEntity extends BaseEntity implements Serializable{
 	
	/**
	 *
	 * 用户id
	 */
	private String userId;
	/**
	 *
	 * 家庭成员姓名
	 */
	private String familyMemName;
	/**
	 *
	 * 与用户的关系
	 */
	private String relationshipId;
	/**
	 *
	 * 工作
	 */
	private String work;
	/**
	 *
	 * 电话
	 */
	private String phone;
	/**
	 *
	 * QQ号
	 */
	private String qq;
	/**
	 *
	 * 微信
	 */
	private String wechat;
	/**
	 *
	 * 邮箱
	 */
	private String email;
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
	public String getFamilyMemName() {
		return familyMemName;
	}

	/**
	 * 
	 * @param familyMemName 家庭成员姓名
	 */
    public void setFamilyMemName(String familyMemName) {
		this.familyMemName = (familyMemName== null ? null : familyMemName.trim());
	}
	/**
	 *
	 * @return String
	 */
	public String getRelationshipId() {
		return relationshipId;
	}

	/**
	 * 
	 * @param relationshipId 与用户的关系
	 */
    public void setRelationshipId(String relationshipId) {
		this.relationshipId = (relationshipId== null ? null : relationshipId.trim());
	}
	/**
	 *
	 * @return String
	 */
	public String getWork() {
		return work;
	}

	/**
	 * 
	 * @param work 工作
	 */
    public void setWork(String work) {
		this.work = (work== null ? null : work.trim());
	}
	/**
	 *
	 * @return String
	 */
	public String getPhone() {
		return phone;
	}

	/**
	 * 
	 * @param phone 电话
	 */
    public void setPhone(String phone) {
		this.phone = (phone== null ? null : phone.trim());
	}
	/**
	 *
	 * @return String
	 */
	public String getQq() {
		return qq;
	}

	/**
	 * 
	 * @param qq QQ号
	 */
    public void setQq(String qq) {
		this.qq = (qq== null ? null : qq.trim());
	}
	/**
	 *
	 * @return String
	 */
	public String getWechat() {
		return wechat;
	}

	/**
	 * 
	 * @param wechat 微信
	 */
    public void setWechat(String wechat) {
		this.wechat = (wechat== null ? null : wechat.trim());
	}
	/**
	 *
	 * @return String
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * 
	 * @param email 邮箱
	 */
    public void setEmail(String email) {
		this.email = (email== null ? null : email.trim());
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
		return "HomeInfoEntity{"+
		"userId='"+userId+'\''+
		"familyMemName='"+familyMemName+'\''+
		"relationshipId='"+relationshipId+'\''+
		"work='"+work+'\''+
		"phone='"+phone+'\''+
		"qq='"+qq+'\''+
		"wechat='"+wechat+'\''+
		"email='"+email+'\''+
		"operatorId='"+operatorId+'\''+
		"timestampTime='"+timestampTime+'\''+
		'}';
	}
}
