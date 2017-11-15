package com.dmsdbj.dmt.graduatorHelp.facade.impl;

import com.dmsdbj.dmt.graduatorHelp.entity.LocalProductEntity;
import com.dmsdbj.dmt.graduatorHelp.facade.LocalProductFacade;
import com.dmsdbj.dmt.graduatorHelp.service.LocalProductService;
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
@Component("localProductFacade")
@Service
public class LocalProductFacadeImpl implements LocalProductFacade {

    //打印日志相关
	private static final Logger logger = LoggerFactory.getLogger(LocalProductFacadeImpl.class);

    @Autowired
    LocalProductService localProductService;

    /**
     * 根据id查询LocalProduct
     * @param id
     * @return LocalProductEntity
     */
    @Override
    public LocalProductEntity findById(String id) {
        return localProductService.findById(id);
    }
    
}
