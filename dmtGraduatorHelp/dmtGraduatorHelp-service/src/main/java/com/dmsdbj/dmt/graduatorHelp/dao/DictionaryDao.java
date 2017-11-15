package com.dmsdbj.dmt.graduatorHelp.dao;

import com.dmsdbj.itoo.tool.base.dao.BaseDao;
import com.dmsdbj.dmt.graduatorHelp.entity.DictionaryEntity;
import com.dmsdbj.dmt.graduatorHelp.mybatisexample.DictionaryExample;
import org.springframework.stereotype.Repository;

/**
 *@author: 马金兴 
 *@create: 2017-11-15 15:47:40
 *@DESCRIPTION: 
 */
@Repository
public interface DictionaryDao extends BaseDao<DictionaryEntity,DictionaryExample> {
}
