package com.dmsdbj.dmt.graduatorHelp.entity;

import com.dmsdbj.itoo.tool.base.entity.BaseEntity;
import java.io.Serializable;
import java.util.Date;
/**
 * @author: 马金兴 
 * @create: 2017-11-15 15:47:40.
 */

public class PersonalInfoEntity extends BaseEntity implements Serializable{
 	
	/**
	 *
	 * 登录ID
	 */
	private String loginId;
	/**
	 *
	 * 用户姓名
	 */
	private String name;
	/**
	 *
	 * 英文名
	 */
	private String englishName;
	/**
	 *
	 * 期数
	 */
	private String grade;
	/**
	 *
	 * 性别
	 */
	private String sex;
	/**
	 *
	 * 出生年月
	 */
	private Date birthday;
	/**
	 *
	 * 邮箱
	 */
	private String email;
	/**
	 *
	 * 常用电话
	 */
	private String phone;
	/**
	 *
	 * 紧急联系人电话
	 */
	private String emergPhone;
	/**
	 *
	 * 紧急联系人姓名
	 */
	private String emergName;
	/**
	 *
	 * 紧急联系人与自己的关系
	 */
	private String emergRelation;
	/**
	 *
	 * 微信号
	 */
	private String wechat;
	/**
	 *
	 * QQ号
	 */
	private String qq;
	/**
	 *
	 * 进入提高班时间
	 */
	private Date enterDmtTime;
	/**
	 *
	 * 提高班毕业时间
	 */
	private Date graduateDmtTime;
	/**
	 *
	 * 进入大学时间
	 */
	private Date enterCollegeTime;
	/**
	 *
	 * 大学毕业时间
	 */
	private Date graduateCollegeTime;
	/**
	 *
	 * 籍贯
	 */
	private String nativePlace;
	/**
	 *
	 * 住所地址
	 */
	private String address;
	/**
	 *
	 * 擅长领域/自我介绍
	 */
	private String professionalField;
	/**
	 *
	 * 操作人名字
	 */
	private String operatorName;
	/**
	 *
	 * 操作人ID
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
	public String getLoginId() {
		return loginId;
	}

	/**
	 * 
	 * @param loginId 登录ID
	 */
    public void setLoginId(String loginId) {
		this.loginId = (loginId== null ? null : loginId.trim());
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
	 * @param name 用户姓名
	 */
    public void setName(String name) {
		this.name = (name== null ? null : name.trim());
	}
	/**
	 *
	 * @return String
	 */
	public String getEnglishName() {
		return englishName;
	}

	/**
	 * 
	 * @param englishName 英文名
	 */
    public void setEnglishName(String englishName) {
		this.englishName = (englishName== null ? null : englishName.trim());
	}
	/**
	 *
	 * @return String
	 */
	public String getGrade() {
		return grade;
	}

	/**
	 * 
	 * @param grade 期数
	 */
    public void setGrade(String grade) {
		this.grade = (grade== null ? null : grade.trim());
	}
	/**
	 *
	 * @return String
	 */
	public String getSex() {
		return sex;
	}

	/**
	 * 
	 * @param sex 性别
	 */
    public void setSex(String sex) {
		this.sex = (sex== null ? null : sex.trim());
	}
	/**
	 *
	 * @return Date
	 */
	public Date getBirthday() {
		return birthday;
	}

	/**
	 * 
	 * @param birthday 出生年月
	 */
    public void setBirthday(Date birthday) {
		this.birthday = birthday;
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
	public String getPhone() {
		return phone;
	}

	/**
	 * 
	 * @param phone 常用电话
	 */
    public void setPhone(String phone) {
		this.phone = (phone== null ? null : phone.trim());
	}
	/**
	 *
	 * @return String
	 */
	public String getEmergPhone() {
		return emergPhone;
	}

	/**
	 * 
	 * @param emergPhone 紧急联系人电话
	 */
    public void setEmergPhone(String emergPhone) {
		this.emergPhone = (emergPhone== null ? null : emergPhone.trim());
	}
	/**
	 *
	 * @return String
	 */
	public String getEmergName() {
		return emergName;
	}

	/**
	 * 
	 * @param emergName 紧急联系人姓名
	 */
    public void setEmergName(String emergName) {
		this.emergName = (emergName== null ? null : emergName.trim());
	}
	/**
	 *
	 * @return String
	 */
	public String getEmergRelation() {
		return emergRelation;
	}

	/**
	 * 
	 * @param emergRelation 紧急联系人与自己的关系
	 */
    public void setEmergRelation(String emergRelation) {
		this.emergRelation = (emergRelation== null ? null : emergRelation.trim());
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
	 * @param wechat 微信号
	 */
    public void setWechat(String wechat) {
		this.wechat = (wechat== null ? null : wechat.trim());
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
	 * @return Date
	 */
	public Date getEnterDmtTime() {
		return enterDmtTime;
	}

	/**
	 * 
	 * @param enterDmtTime 进入提高班时间
	 */
    public void setEnterDmtTime(Date enterDmtTime) {
		this.enterDmtTime = enterDmtTime;
	}
	/**
	 *
	 * @return Date
	 */
	public Date getGraduateDmtTime() {
		return graduateDmtTime;
	}

	/**
	 * 
	 * @param graduateDmtTime 提高班毕业时间
	 */
    public void setGraduateDmtTime(Date graduateDmtTime) {
		this.graduateDmtTime = graduateDmtTime;
	}
	/**
	 *
	 * @return Date
	 */
	public Date getEnterCollegeTime() {
		return enterCollegeTime;
	}

	/**
	 * 
	 * @param enterCollegeTime 进入大学时间
	 */
    public void setEnterCollegeTime(Date enterCollegeTime) {
		this.enterCollegeTime = enterCollegeTime;
	}
	/**
	 *
	 * @return Date
	 */
	public Date getGraduateCollegeTime() {
		return graduateCollegeTime;
	}

	/**
	 * 
	 * @param graduateCollegeTime 大学毕业时间
	 */
    public void setGraduateCollegeTime(Date graduateCollegeTime) {
		this.graduateCollegeTime = graduateCollegeTime;
	}
	/**
	 *
	 * @return String
	 */
	public String getNativePlace() {
		return nativePlace;
	}

	/**
	 * 
	 * @param nativePlace 籍贯
	 */
    public void setNativePlace(String nativePlace) {
		this.nativePlace = (nativePlace== null ? null : nativePlace.trim());
	}
	/**
	 *
	 * @return String
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * 
	 * @param address 住所地址
	 */
    public void setAddress(String address) {
		this.address = (address== null ? null : address.trim());
	}
	/**
	 *
	 * @return String
	 */
	public String getProfessionalField() {
		return professionalField;
	}

	/**
	 * 
	 * @param professionalField 擅长领域/自我介绍
	 */
    public void setProfessionalField(String professionalField) {
		this.professionalField = (professionalField== null ? null : professionalField.trim());
	}
	/**
	 *
	 * @return String
	 */
	public String getOperatorName() {
		return operatorName;
	}

	/**
	 * 
	 * @param operatorName 操作人名字
	 */
    public void setOperatorName(String operatorName) {
		this.operatorName = (operatorName== null ? null : operatorName.trim());
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
	 * @param operatorId 操作人ID
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
		return "PersonalInfoEntity{"+
		"loginId='"+loginId+'\''+
		"name='"+name+'\''+
		"englishName='"+englishName+'\''+
		"grade='"+grade+'\''+
		"sex='"+sex+'\''+
		"birthday='"+birthday+'\''+
		"email='"+email+'\''+
		"phone='"+phone+'\''+
		"emergPhone='"+emergPhone+'\''+
		"emergName='"+emergName+'\''+
		"emergRelation='"+emergRelation+'\''+
		"wechat='"+wechat+'\''+
		"qq='"+qq+'\''+
		"enterDmtTime='"+enterDmtTime+'\''+
		"graduateDmtTime='"+graduateDmtTime+'\''+
		"enterCollegeTime='"+enterCollegeTime+'\''+
		"graduateCollegeTime='"+graduateCollegeTime+'\''+
		"nativePlace='"+nativePlace+'\''+
		"address='"+address+'\''+
		"professionalField='"+professionalField+'\''+
		"operatorName='"+operatorName+'\''+
		"operatorId='"+operatorId+'\''+
		"timestampTime='"+timestampTime+'\''+
		'}';
	}
}
