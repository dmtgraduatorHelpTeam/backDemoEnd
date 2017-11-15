package com.dmsdbj.dmt.graduatorHelp.facade.impl;

import com.dmsdbj.dmt.graduatorHelp.entity.EducationEntity;
import com.dmsdbj.dmt.graduatorHelp.facade.EducationFacade;
import com.dmsdbj.dmt.graduatorHelp.service.EducationService;
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
@Component("educationFacade")
@Service
public class EducationFacadeImpl implements EducationFacade {

    //打印日志相关
	private static final Logger logger = LoggerFactory.getLogger(EducationFacadeImpl.class);

    @Autowired
    EducationService educationService;

    /**
     * 根据id查询Education
     * @param id
     * @return EducationEntity
     */
    @Override
    public EducationEntity findById(String id) {
        return educationService.findById(id);
    }
    
}
