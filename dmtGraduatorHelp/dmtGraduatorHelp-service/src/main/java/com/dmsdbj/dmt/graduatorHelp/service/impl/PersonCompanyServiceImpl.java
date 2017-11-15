package com.dmsdbj.dmt.graduatorHelp.service.impl;

import com.dmsdbj.itoo.tool.base.dao.BaseDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.dmsdbj.dmt.graduatorHelp.mybatisexample.PersonCompanyExample;
import com.dmsdbj.itoo.tool.base.service.impl.BaseServiceImpl;
import com.dmsdbj.dmt.graduatorHelp.dao.PersonCompanyDao;
import com.dmsdbj.dmt.graduatorHelp.service.PersonCompanyService;
import com.dmsdbj.dmt.graduatorHelp.entity.PersonCompanyEntity;

/**
 * @author: 马金兴 
 * @create:2017-11-15 15:47:40
 * @DESCRIPTION
 */
@Service("personCompanyService")
public class PersonCompanyServiceImpl extends BaseServiceImpl<PersonCompanyEntity, PersonCompanyExample> implements PersonCompanyService {


    //注入personCompanyDao
	@Autowired
    private PersonCompanyDao personCompanyDao;

    /**
     * 让BaseServiceImpl获取到Dao
     * @return BaseDao<PersonCompanyEntity, PersonCompanyExample>
     */
    @Override
    public  BaseDao<PersonCompanyEntity, PersonCompanyExample> getRealDao(){
        return this.personCompanyDao;
    }
}
