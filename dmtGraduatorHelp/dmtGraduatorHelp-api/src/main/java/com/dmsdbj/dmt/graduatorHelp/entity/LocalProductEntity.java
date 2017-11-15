package com.dmsdbj.dmt.graduatorHelp.entity;

import com.dmsdbj.itoo.tool.base.entity.BaseEntity;
import java.io.Serializable;
import java.util.Date;
/**
 * @author: 马金兴 
 * @create: 2017-11-15 15:47:40.
 */

public class LocalProductEntity extends BaseEntity implements Serializable{
 	
	/**
	 *
	 * 用户id
	 */
	private String userId;
	/**
	 *
	 * 特产名称
	 */
	private String name;
	/**
	 *
	 * 描述
	 */
	private String description;
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
	public String getName() {
		return name;
	}

	/**
	 * 
	 * @param name 特产名称
	 */
    public void setName(String name) {
		this.name = (name== null ? null : name.trim());
	}
	/**
	 *
	 * @return String
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * 
	 * @param description 描述
	 */
    public void setDescription(String description) {
		this.description = (description== null ? null : description.trim());
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
		return "LocalProductEntity{"+
		"userId='"+userId+'\''+
		"name='"+name+'\''+
		"description='"+description+'\''+
		"operatorId='"+operatorId+'\''+
		"timestampTime='"+timestampTime+'\''+
		'}';
	}
}
