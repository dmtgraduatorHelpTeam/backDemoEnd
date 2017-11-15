package com.dmsdbj.dmt.graduatorHelp.service.impl;

import com.dmsdbj.itoo.tool.base.dao.BaseDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.dmsdbj.dmt.graduatorHelp.mybatisexample.CommercialOppotunityExample;
import com.dmsdbj.itoo.tool.base.service.impl.BaseServiceImpl;
import com.dmsdbj.dmt.graduatorHelp.dao.CommercialOppotunityDao;
import com.dmsdbj.dmt.graduatorHelp.service.CommercialOppotunityService;
import com.dmsdbj.dmt.graduatorHelp.entity.CommercialOppotunityEntity;

/**
 * @author: 马金兴 
 * @create:2017-11-15 15:47:40
 * @DESCRIPTION
 */
@Service("commercialOppotunityService")
public class CommercialOppotunityServiceImpl extends BaseServiceImpl<CommercialOppotunityEntity, CommercialOppotunityExample> implements CommercialOppotunityService {


    //注入commercialOppotunityDao
	@Autowired
    private CommercialOppotunityDao commercialOppotunityDao;

    /**
     * 让BaseServiceImpl获取到Dao
     * @return BaseDao<CommercialOppotunityEntity, CommercialOppotunityExample>
     */
    @Override
    public  BaseDao<CommercialOppotunityEntity, CommercialOppotunityExample> getRealDao(){
        return this.commercialOppotunityDao;
    }
}
