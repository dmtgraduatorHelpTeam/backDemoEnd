package com.dmsdbj.dmt.graduatorHelp.dao;

import com.dmsdbj.itoo.tool.base.dao.BaseDao;
import com.dmsdbj.dmt.graduatorHelp.entity.PictureEntity;
import com.dmsdbj.dmt.graduatorHelp.mybatisexample.PictureExample;
import org.springframework.stereotype.Repository;

/**
 *@author: 马金兴 
 *@create: 2017-11-15 15:47:40
 *@DESCRIPTION: 
 */
@Repository
public interface PictureDao extends BaseDao<PictureEntity,PictureExample> {
}
