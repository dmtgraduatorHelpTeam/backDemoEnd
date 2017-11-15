package com.dmsdbj.dmt.graduatorHelp.facade.impl;

import com.dmsdbj.dmt.graduatorHelp.entity.HomeInfoEntity;
import com.dmsdbj.dmt.graduatorHelp.facade.HomeInfoFacade;
import com.dmsdbj.dmt.graduatorHelp.service.HomeInfoService;
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
@Component("homeInfoFacade")
@Service
public class HomeInfoFacadeImpl implements HomeInfoFacade {

    //打印日志相关
	private static final Logger logger = LoggerFactory.getLogger(HomeInfoFacadeImpl.class);

    @Autowired
    HomeInfoService homeInfoService;

    /**
     * 根据id查询HomeInfo
     * @param id
     * @return HomeInfoEntity
     */
    @Override
    public HomeInfoEntity findById(String id) {
        return homeInfoService.findById(id);
    }
    
}
