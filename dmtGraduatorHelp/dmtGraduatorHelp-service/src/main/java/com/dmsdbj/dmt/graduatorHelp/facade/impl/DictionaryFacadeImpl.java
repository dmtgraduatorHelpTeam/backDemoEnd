package com.dmsdbj.dmt.graduatorHelp.facade.impl;

import com.dmsdbj.dmt.graduatorHelp.entity.DictionaryEntity;
import com.dmsdbj.dmt.graduatorHelp.facade.DictionaryFacade;
import com.dmsdbj.dmt.graduatorHelp.service.DictionaryService;
import org.springframework.beans.factory.annotation.Autowired;
import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *@author:马金兴 
 *@create: 2017-11-15 15:47:40
 * @DESCRIPTION
 */
@Component("dictionaryFacade")
@Service
public class DictionaryFacadeImpl implements DictionaryFacade {

    //打印日志相关
	private static final Logger logger = LoggerFactory.getLogger(DictionaryFacadeImpl.class);

    @Autowired
    DictionaryService dictionaryService;

    /**
     * 根据id查询Dictionary
     * @param id
     * @return DictionaryEntity
     */
    @Override
    public DictionaryEntity findById(String id) {
        return dictionaryService.findById(id);
    }
    
}
