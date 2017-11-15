package com.dmsdbj.dmt.graduatorHelp.service.impl;

import com.dmsdbj.itoo.tool.base.dao.BaseDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.dmsdbj.dmt.graduatorHelp.mybatisexample.DictionaryExample;
import com.dmsdbj.itoo.tool.base.service.impl.BaseServiceImpl;
import com.dmsdbj.dmt.graduatorHelp.dao.DictionaryDao;
import com.dmsdbj.dmt.graduatorHelp.service.DictionaryService;
import com.dmsdbj.dmt.graduatorHelp.entity.DictionaryEntity;

/**
 * @author: 马金兴 
 * @create:2017-11-15 15:47:40
 * @DESCRIPTION
 */
@Service("dictionaryService")
public class DictionaryServiceImpl extends BaseServiceImpl<DictionaryEntity, DictionaryExample> implements DictionaryService {


    //注入dictionaryDao
	@Autowired
    private DictionaryDao dictionaryDao;

    /**
     * 让BaseServiceImpl获取到Dao
     * @return BaseDao<DictionaryEntity, DictionaryExample>
     */
    @Override
    public  BaseDao<DictionaryEntity, DictionaryExample> getRealDao(){
        return this.dictionaryDao;
    }
}
