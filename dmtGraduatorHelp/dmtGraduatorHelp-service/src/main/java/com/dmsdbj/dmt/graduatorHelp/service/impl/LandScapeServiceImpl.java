package com.dmsdbj.dmt.graduatorHelp.service.impl;

import com.dmsdbj.itoo.tool.base.dao.BaseDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.dmsdbj.dmt.graduatorHelp.mybatisexample.LandScapeExample;
import com.dmsdbj.itoo.tool.base.service.impl.BaseServiceImpl;
import com.dmsdbj.dmt.graduatorHelp.dao.LandScapeDao;
import com.dmsdbj.dmt.graduatorHelp.service.LandScapeService;
import com.dmsdbj.dmt.graduatorHelp.entity.LandScapeEntity;

/**
 * @author: 马金兴 
 * @create:2017-11-15 15:47:40
 * @DESCRIPTION
 */
@Service("landScapeService")
public class LandScapeServiceImpl extends BaseServiceImpl<LandScapeEntity, LandScapeExample> implements LandScapeService {


    //注入landScapeDao
	@Autowired
    private LandScapeDao landScapeDao;

    /**
     * 让BaseServiceImpl获取到Dao
     * @return BaseDao<LandScapeEntity, LandScapeExample>
     */
    @Override
    public  BaseDao<LandScapeEntity, LandScapeExample> getRealDao(){
        return this.landScapeDao;
    }
}
