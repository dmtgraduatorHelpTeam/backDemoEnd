package com.dmsdbj.dmt.graduatorHelp.service.impl;

import com.dmsdbj.itoo.tool.base.dao.BaseDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.dmsdbj.dmt.graduatorHelp.mybatisexample.PersonalInfoExample;
import com.dmsdbj.itoo.tool.base.service.impl.BaseServiceImpl;
import com.dmsdbj.dmt.graduatorHelp.dao.PersonalInfoDao;
import com.dmsdbj.dmt.graduatorHelp.service.PersonalInfoService;
import com.dmsdbj.dmt.graduatorHelp.entity.PersonalInfoEntity;

/**
 * @author: 马金兴 
 * @create:2017-11-15 15:47:40
 * @DESCRIPTION
 */
@Service("personalInfoService")
public class PersonalInfoServiceImpl extends BaseServiceImpl<PersonalInfoEntity, PersonalInfoExample> implements PersonalInfoService {


    //注入personalInfoDao
	@Autowired
    private PersonalInfoDao personalInfoDao;

    /**
     * 让BaseServiceImpl获取到Dao
     * @return BaseDao<PersonalInfoEntity, PersonalInfoExample>
     */
    @Override
    public  BaseDao<PersonalInfoEntity, PersonalInfoExample> getRealDao(){
        return this.personalInfoDao;
    }
}
