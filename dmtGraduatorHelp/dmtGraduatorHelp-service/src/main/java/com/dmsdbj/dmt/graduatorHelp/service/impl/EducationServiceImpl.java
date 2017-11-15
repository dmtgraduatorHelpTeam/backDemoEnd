package com.dmsdbj.dmt.graduatorHelp.service.impl;

import com.dmsdbj.itoo.tool.base.dao.BaseDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.dmsdbj.dmt.graduatorHelp.mybatisexample.EducationExample;
import com.dmsdbj.itoo.tool.base.service.impl.BaseServiceImpl;
import com.dmsdbj.dmt.graduatorHelp.dao.EducationDao;
import com.dmsdbj.dmt.graduatorHelp.service.EducationService;
import com.dmsdbj.dmt.graduatorHelp.entity.EducationEntity;

/**
 * @author: 马金兴 
 * @create:2017-11-15 15:47:40
 * @DESCRIPTION
 */
@Service("educationService")
public class EducationServiceImpl extends BaseServiceImpl<EducationEntity, EducationExample> implements EducationService {


    //注入educationDao
	@Autowired
    private EducationDao educationDao;

    /**
     * 让BaseServiceImpl获取到Dao
     * @return BaseDao<EducationEntity, EducationExample>
     */
    @Override
    public  BaseDao<EducationEntity, EducationExample> getRealDao(){
        return this.educationDao;
    }
}
