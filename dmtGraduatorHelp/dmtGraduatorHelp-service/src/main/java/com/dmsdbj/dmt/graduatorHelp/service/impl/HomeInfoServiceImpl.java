package com.dmsdbj.dmt.graduatorHelp.service.impl;

import com.dmsdbj.itoo.tool.base.dao.BaseDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.dmsdbj.dmt.graduatorHelp.mybatisexample.HomeInfoExample;
import com.dmsdbj.itoo.tool.base.service.impl.BaseServiceImpl;
import com.dmsdbj.dmt.graduatorHelp.dao.HomeInfoDao;
import com.dmsdbj.dmt.graduatorHelp.service.HomeInfoService;
import com.dmsdbj.dmt.graduatorHelp.entity.HomeInfoEntity;

/**
 * @author: 马金兴 
 * @create:2017-11-15 15:47:40
 * @DESCRIPTION
 */
@Service("homeInfoService")
public class HomeInfoServiceImpl extends BaseServiceImpl<HomeInfoEntity, HomeInfoExample> implements HomeInfoService {


    //注入homeInfoDao
	@Autowired
    private HomeInfoDao homeInfoDao;

    /**
     * 让BaseServiceImpl获取到Dao
     * @return BaseDao<HomeInfoEntity, HomeInfoExample>
     */
    @Override
    public  BaseDao<HomeInfoEntity, HomeInfoExample> getRealDao(){
        return this.homeInfoDao;
    }
}
