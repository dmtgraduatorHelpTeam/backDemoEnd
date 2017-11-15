package com.dmsdbj.dmt.graduatorHelp.entity;

import com.dmsdbj.itoo.tool.base.entity.BaseEntity;
import java.io.Serializable;
import java.util.Date;
/**
 * @author: 马金兴 
 * @create: 2017-11-15 15:47:40.
 */

public class PictureEntity extends BaseEntity implements Serializable{
 	
	/**
	 *
	 * 用户id
	 */
	private String userId;
	/**
	 *
	 * 图片类型id,从字典表中获取：公司、个人、景区等
	 */
	private String pictureTypeId;
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
	public String getPictureTypeId() {
		return pictureTypeId;
	}

	/**
	 * 
	 * @param pictureTypeId 图片类型id,从字典表中获取：公司、个人、景区等
	 */
    public void setPictureTypeId(String pictureTypeId) {
		this.pictureTypeId = (pictureTypeId== null ? null : pictureTypeId.trim());
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
		return "PictureEntity{"+
		"userId='"+userId+'\''+
		"pictureTypeId='"+pictureTypeId+'\''+
		"description='"+description+'\''+
		"operatorId='"+operatorId+'\''+
		"timestampTime='"+timestampTime+'\''+
		'}';
	}
}
