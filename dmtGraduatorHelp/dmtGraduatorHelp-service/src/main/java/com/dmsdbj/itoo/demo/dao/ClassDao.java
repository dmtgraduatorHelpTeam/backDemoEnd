package com.dmsdbj.itoo.demo.dao;

import com.dmsdbj.itoo.demo.entity.ClassEntity;
import com.dmsdbj.itoo.demo.mybatisexample.ClassExample;
import com.dmsdbj.itoo.tool.base.dao.BaseDao;
import org.springframework.stereotype.Repository;

/**
 *@author: 孔唯妍 
 *@create: 2017-10-31 20:44:38
 *@DESCRIPTION: 
 */
@Repository
public interface ClassDao extends BaseDao<ClassEntity, ClassExample> {

}
