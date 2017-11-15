package com.dmsdbj.dmt.graduatorHelp.service.impl;

import com.dmsdbj.itoo.tool.base.dao.BaseDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.dmsdbj.dmt.graduatorHelp.mybatisexample.CompanyExample;
import com.dmsdbj.itoo.tool.base.service.impl.BaseServiceImpl;
import com.dmsdbj.dmt.graduatorHelp.dao.CompanyDao;
import com.dmsdbj.dmt.graduatorHelp.service.CompanyService;
import com.dmsdbj.dmt.graduatorHelp.entity.CompanyEntity;

/**
 * @author: 马金兴 
 * @create:2017-11-15 15:47:40
 * @DESCRIPTION
 */
@Service("companyService")
public class CompanyServiceImpl extends BaseServiceImpl<CompanyEntity, CompanyExample> implements CompanyService {


    //注入companyDao
	@Autowired
    private CompanyDao companyDao;

    /**
     * 让BaseServiceImpl获取到Dao
     * @return BaseDao<CompanyEntity, CompanyExample>
     */
    @Override
    public  BaseDao<CompanyEntity, CompanyExample> getRealDao(){
        return this.companyDao;
    }
}
