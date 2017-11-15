package com.dmsdbj.dmt.graduatorHelp.facade.impl;

import com.dmsdbj.dmt.graduatorHelp.entity.PersonCompanyEntity;
import com.dmsdbj.dmt.graduatorHelp.facade.PersonCompanyFacade;
import com.dmsdbj.dmt.graduatorHelp.service.PersonCompanyService;
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
@Component("personCompanyFacade")
@Service
public class PersonCompanyFacadeImpl implements PersonCompanyFacade {

    //打印日志相关
	private static final Logger logger = LoggerFactory.getLogger(PersonCompanyFacadeImpl.class);

    @Autowired
    PersonCompanyService personCompanyService;

    /**
     * 根据id查询PersonCompany
     * @param id
     * @return PersonCompanyEntity
     */
    @Override
    public PersonCompanyEntity findById(String id) {
        return personCompanyService.findById(id);
    }
    
}
