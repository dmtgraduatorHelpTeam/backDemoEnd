package com.dmsdbj.dmt.graduatorHelp.facade.impl;

import com.dmsdbj.dmt.graduatorHelp.entity.SkillPointEntity;
import com.dmsdbj.dmt.graduatorHelp.facade.SkillPointFacade;
import com.dmsdbj.dmt.graduatorHelp.service.SkillPointService;
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
@Component("skillPointFacade")
@Service
public class SkillPointFacadeImpl implements SkillPointFacade {

    //打印日志相关
	private static final Logger logger = LoggerFactory.getLogger(SkillPointFacadeImpl.class);

    @Autowired
    SkillPointService skillPointService;

    /**
     * 根据id查询SkillPoint
     * @param id
     * @return SkillPointEntity
     */
    @Override
    public SkillPointEntity findById(String id) {
        return skillPointService.findById(id);
    }
    
}
