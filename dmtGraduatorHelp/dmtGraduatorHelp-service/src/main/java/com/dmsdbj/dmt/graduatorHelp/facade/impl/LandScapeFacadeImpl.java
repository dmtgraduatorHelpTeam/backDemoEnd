package com.dmsdbj.dmt.graduatorHelp.facade.impl;

import com.dmsdbj.dmt.graduatorHelp.entity.LandScapeEntity;
import com.dmsdbj.dmt.graduatorHelp.facade.LandScapeFacade;
import com.dmsdbj.dmt.graduatorHelp.service.LandScapeService;
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
@Component("landScapeFacade")
@Service
public class LandScapeFacadeImpl implements LandScapeFacade {

    //打印日志相关
	private static final Logger logger = LoggerFactory.getLogger(LandScapeFacadeImpl.class);

    @Autowired
    LandScapeService landScapeService;

    /**
     * 根据id查询LandScape
     * @param id
     * @return LandScapeEntity
     */
    @Override
    public LandScapeEntity findById(String id) {
        return landScapeService.findById(id);
    }
    
}
