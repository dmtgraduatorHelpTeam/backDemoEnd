package com.dmsdbj.itoo.demo.entity;

import com.dmsdbj.itoo.tool.base.entity.BaseEntity;

import java.io.Serializable;
/**
 * @author: 孔唯妍 
 * @create: 2017-10-31 20:44:38.
 */

public class ClassEntity extends BaseEntity implements Serializable{
 	
	/**
	 *
	 * 行政班代码
	 */
	private String classCode;
	/**
	 *
	 * 行政班名称
	 */
	private String className;
	/**
	 *
	 * 年级（读取字典表中年级管理的id）
	 */
	private String grade;
	/**
	 *
	 * 专业(班级是属于专业的)
	 */
	private String professionId;
	/**
	 *
	 * 校区
	 */
	private String campuse;

	/**
	 *
	 * @return String
	 */
	public String getClassCode() {
		return classCode;
	}

	/**
	 * 
	 * @param classCode 行政班代码
	 */
    public void setClassCode(String classCode) {
		this.classCode = (classCode== null ? null : classCode.trim());
	}
	/**
	 *
	 * @return String
	 */
	public String getClassName() {
		return className;
	}

	/**
	 * 
	 * @param className 行政班名称
	 */
    public void setClassName(String className) {
		this.className = (className== null ? null : className.trim());
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
	 * @param grade 年级（读取字典表中年级管理的id）
	 */
    public void setGrade(String grade) {
		this.grade = (grade== null ? null : grade.trim());
	}
	/**
	 *
	 * @return String
	 */
	public String getProfessionId() {
		return professionId;
	}

	/**
	 * 
	 * @param professionId 专业(班级是属于专业的)
	 */
    public void setProfessionId(String professionId) {
		this.professionId = (professionId== null ? null : professionId.trim());
	}
	/**
	 *
	 * @return String
	 */
	public String getCampuse() {
		return campuse;
	}

	/**
	 * 
	 * @param campuse 校区
	 */
    public void setCampuse(String campuse) {
		this.campuse = (campuse== null ? null : campuse.trim());
	}
	
	@Override
    public String toString() {
		return "ClassEntity{"+
		"classCode='"+classCode+'\''+
		"className='"+className+'\''+
		"grade='"+grade+'\''+
		"professionId='"+professionId+'\''+
		"campuse='"+campuse+'\''+
		'}';
	}
}
