package com.dmsdbj.dmt.graduatorHelp.entity;

import com.dmsdbj.itoo.tool.base.entity.BaseEntity;
import java.io.Serializable;
import java.util.Date;
/**
 * @author: 马金兴 
 * @create: 2017-11-15 15:47:40.
 */

public class EducationEntity extends BaseEntity implements Serializable{
 	
	/**
	 *
	 * 用户id
	 */
	private String userId;
	/**
	 *
	 * 是否进入大米时代（0/1:前/后）
	 */
	private Integer isInDmt;
	/**
	 *
	 * 证书编号
	 */
	private String certificateNo;
	/**
	 *
	 * 证书名
	 */
	private String certificateName;
	/**
	 *
	 * 证书类型
	 */
	private Integer certificateType;
	/**
	 *
	 * 获取时间
	 */
	private Date receiveTime;
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
	 * @return Integer
	 */
	public Integer getIsInDmt() {
		return isInDmt;
	}

	/**
	 * 
	 * @param isInDmt 是否进入大米时代（0/1:前/后）
	 */
    public void setIsInDmt(Integer isInDmt) {
		this.isInDmt = isInDmt;
	}
	/**
	 *
	 * @return String
	 */
	public String getCertificateNo() {
		return certificateNo;
	}

	/**
	 * 
	 * @param certificateNo 证书编号
	 */
    public void setCertificateNo(String certificateNo) {
		this.certificateNo = (certificateNo== null ? null : certificateNo.trim());
	}
	/**
	 *
	 * @return String
	 */
	public String getCertificateName() {
		return certificateName;
	}

	/**
	 * 
	 * @param certificateName 证书名
	 */
    public void setCertificateName(String certificateName) {
		this.certificateName = (certificateName== null ? null : certificateName.trim());
	}
	/**
	 *
	 * @return Integer
	 */
	public Integer getCertificateType() {
		return certificateType;
	}

	/**
	 * 
	 * @param certificateType 证书类型
	 */
    public void setCertificateType(Integer certificateType) {
		this.certificateType = certificateType;
	}
	/**
	 *
	 * @return Date
	 */
	public Date getReceiveTime() {
		return receiveTime;
	}

	/**
	 * 
	 * @param receiveTime 获取时间
	 */
    public void setReceiveTime(Date receiveTime) {
		this.receiveTime = receiveTime;
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
		return "EducationEntity{"+
		"userId='"+userId+'\''+
		"isInDmt='"+isInDmt+'\''+
		"certificateNo='"+certificateNo+'\''+
		"certificateName='"+certificateName+'\''+
		"certificateType='"+certificateType+'\''+
		"receiveTime='"+receiveTime+'\''+
		"operatorId='"+operatorId+'\''+
		"timestampTime='"+timestampTime+'\''+
		'}';
	}
}
