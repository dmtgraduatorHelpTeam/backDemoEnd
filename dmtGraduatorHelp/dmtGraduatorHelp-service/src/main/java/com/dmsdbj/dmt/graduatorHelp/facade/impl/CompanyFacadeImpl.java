package com.dmsdbj.dmt.graduatorHelp.facade.impl;

import com.dmsdbj.dmt.graduatorHelp.entity.CompanyEntity;
import com.dmsdbj.dmt.graduatorHelp.facade.CompanyFacade;
import com.dmsdbj.dmt.graduatorHelp.service.CompanyService;
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
@Component("companyFacade")
@Service
public class CompanyFacadeImpl implements CompanyFacade {

    //打印日志相关
	private static final Logger logger = LoggerFactory.getLogger(CompanyFacadeImpl.class);

    @Autowired
    CompanyService companyService;

    /**
     * 根据id查询Company
     * @param id
     * @return CompanyEntity
     */
    @Override
    public CompanyEntity findById(String id) {
        return companyService.findById(id);
    }
    
}
