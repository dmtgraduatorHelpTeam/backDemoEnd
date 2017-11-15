package com.dmsdbj.dmt.graduatorHelp.facade.impl;

import com.dmsdbj.dmt.graduatorHelp.entity.CommercialOppotunityEntity;
import com.dmsdbj.dmt.graduatorHelp.facade.CommercialOppotunityFacade;
import com.dmsdbj.dmt.graduatorHelp.service.CommercialOppotunityService;
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
@Component("commercialOppotunityFacade")
@Service
public class CommercialOppotunityFacadeImpl implements CommercialOppotunityFacade {

    //打印日志相关
	private static final Logger logger = LoggerFactory.getLogger(CommercialOppotunityFacadeImpl.class);

    @Autowired
    CommercialOppotunityService commercialOppotunityService;

    /**
     * 根据id查询CommercialOppotunity
     * @param id
     * @return CommercialOppotunityEntity
     */
    @Override
    public CommercialOppotunityEntity findById(String id) {
        return commercialOppotunityService.findById(id);
    }
    
}
