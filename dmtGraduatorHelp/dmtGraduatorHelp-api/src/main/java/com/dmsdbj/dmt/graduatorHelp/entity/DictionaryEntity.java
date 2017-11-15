package com.dmsdbj.dmt.graduatorHelp.entity;

import com.dmsdbj.itoo.tool.base.entity.BaseEntity;
import java.io.Serializable;
import java.util.Date;
/**
 * @author: 马金兴 
 * @create: 2017-11-15 15:47:40.
 */

public class DictionaryEntity extends BaseEntity implements Serializable{
 	
	/**
	 *
	 * 名称
	 */
	private String dictName;
	/**
	 *
	 * 字典类型名称
	 */
	private String dictTypeName;
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
	public String getDictName() {
		return dictName;
	}

	/**
	 * 
	 * @param dictName 名称
	 */
    public void setDictName(String dictName) {
		this.dictName = (dictName== null ? null : dictName.trim());
	}
	/**
	 *
	 * @return String
	 */
	public String getDictTypeName() {
		return dictTypeName;
	}

	/**
	 * 
	 * @param dictTypeName 字典类型名称
	 */
    public void setDictTypeName(String dictTypeName) {
		this.dictTypeName = (dictTypeName== null ? null : dictTypeName.trim());
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
		return "DictionaryEntity{"+
		"dictName='"+dictName+'\''+
		"dictTypeName='"+dictTypeName+'\''+
		"operatorId='"+operatorId+'\''+
		"timestampTime='"+timestampTime+'\''+
		'}';
	}
}
