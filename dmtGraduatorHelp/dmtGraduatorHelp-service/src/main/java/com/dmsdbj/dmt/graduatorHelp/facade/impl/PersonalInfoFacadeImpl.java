package com.dmsdbj.dmt.graduatorHelp.facade.impl;

import com.dmsdbj.dmt.graduatorHelp.entity.PersonalInfoEntity;
import com.dmsdbj.dmt.graduatorHelp.facade.PersonalInfoFacade;
import com.dmsdbj.dmt.graduatorHelp.service.PersonalInfoService;
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
@Component("personalInfoFacade")
@Service
public class PersonalInfoFacadeImpl implements PersonalInfoFacade {

    //打印日志相关
	private static final Logger logger = LoggerFactory.getLogger(PersonalInfoFacadeImpl.class);

    @Autowired
    PersonalInfoService personalInfoService;

    /**
     * 根据id查询PersonalInfo
     * @param id
     * @return PersonalInfoEntity
     */
    @Override
    public PersonalInfoEntity findById(String id) {
        return personalInfoService.findById(id);
    }
    
}
