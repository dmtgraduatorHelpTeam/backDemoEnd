package com.dmsdbj.dmt.graduatorHelp.service.impl;

import com.dmsdbj.itoo.tool.base.dao.BaseDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.dmsdbj.dmt.graduatorHelp.mybatisexample.SkillPointExample;
import com.dmsdbj.itoo.tool.base.service.impl.BaseServiceImpl;
import com.dmsdbj.dmt.graduatorHelp.dao.SkillPointDao;
import com.dmsdbj.dmt.graduatorHelp.service.SkillPointService;
import com.dmsdbj.dmt.graduatorHelp.entity.SkillPointEntity;

/**
 * @author: 马金兴 
 * @create:2017-11-15 15:47:40
 * @DESCRIPTION
 */
@Service("skillPointService")
public class SkillPointServiceImpl extends BaseServiceImpl<SkillPointEntity, SkillPointExample> implements SkillPointService {


    //注入skillPointDao
	@Autowired
    private SkillPointDao skillPointDao;

    /**
     * 让BaseServiceImpl获取到Dao
     * @return BaseDao<SkillPointEntity, SkillPointExample>
     */
    @Override
    public  BaseDao<SkillPointEntity, SkillPointExample> getRealDao(){
        return this.skillPointDao;
    }
}
