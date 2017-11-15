package com.dmsdbj.dmt.graduatorHelp.entity;

import com.dmsdbj.itoo.tool.base.entity.BaseEntity;
import java.io.Serializable;
import java.util.Date;
/**
 * @author: 马金兴 
 * @create: 2017-11-15 15:47:40.
 */

public class PersonCompanyEntity extends BaseEntity implements Serializable{
 	
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
	 * 工资变动时间
	 */
	private Date salaryChangeTime;
	/**
	 *
	 * 工资
	 */
	private Double salary;
	/**
	 *
	 * 一年几薪
	 */
	private BigDecimal timesPerYear;
	/**
	 *
	 * 职位
	 */
	private String possession;
	/**
	 *
	 * 福利待遇
	 */
	private String wellfare;
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
	 * @return Date
	 */
	public Date getSalaryChangeTime() {
		return salaryChangeTime;
	}

	/**
	 * 
	 * @param salaryChangeTime 工资变动时间
	 */
    public void setSalaryChangeTime(Date salaryChangeTime) {
		this.salaryChangeTime = salaryChangeTime;
	}
	/**
	 *
	 * @return Double
	 */
	public Double getSalary() {
		return salary;
	}

	/**
	 * 
	 * @param salary 工资
	 */
    public void setSalary(Double salary) {
		this.salary = salary;
	}
	/**
	 *
	 * @return BigDecimal
	 */
	public BigDecimal getTimesPerYear() {
		return timesPerYear;
	}

	/**
	 * 
	 * @param timesPerYear 一年几薪
	 */
    public void setTimesPerYear(BigDecimal timesPerYear) {
		this.timesPerYear = timesPerYear;
	}
	/**
	 *
	 * @return String
	 */
	public String getPossession() {
		return possession;
	}

	/**
	 * 
	 * @param possession 职位
	 */
    public void setPossession(String possession) {
		this.possession = (possession== null ? null : possession.trim());
	}
	/**
	 *
	 * @return String
	 */
	public String getWellfare() {
		return wellfare;
	}

	/**
	 * 
	 * @param wellfare 福利待遇
	 */
    public void setWellfare(String wellfare) {
		this.wellfare = (wellfare== null ? null : wellfare.trim());
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
		return "PersonCompanyEntity{"+
		"userId='"+userId+'\''+
		"companyId='"+companyId+'\''+
		"salaryChangeTime='"+salaryChangeTime+'\''+
		"salary='"+salary+'\''+
		"timesPerYear='"+timesPerYear+'\''+
		"possession='"+possession+'\''+
		"wellfare='"+wellfare+'\''+
		"operatorId='"+operatorId+'\''+
		"timestampTime='"+timestampTime+'\''+
		'}';
	}
}
