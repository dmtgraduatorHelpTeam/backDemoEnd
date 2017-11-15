package com.dmsdbj.dmt.graduatorHelp.dao;

import com.dmsdbj.itoo.tool.base.dao.BaseDao;
import com.dmsdbj.dmt.graduatorHelp.entity.HomeInfoEntity;
import com.dmsdbj.dmt.graduatorHelp.mybatisexample.HomeInfoExample;
import org.springframework.stereotype.Repository;

/**
 *@author: 马金兴 
 *@create: 2017-11-15 15:47:40
 *@DESCRIPTION: 
 */
@Repository
public interface HomeInfoDao extends BaseDao<HomeInfoEntity,HomeInfoExample> {
}
