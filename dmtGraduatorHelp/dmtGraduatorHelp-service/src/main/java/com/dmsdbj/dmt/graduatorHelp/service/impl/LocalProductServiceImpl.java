package com.dmsdbj.dmt.graduatorHelp.service.impl;

import com.dmsdbj.itoo.tool.base.dao.BaseDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.dmsdbj.dmt.graduatorHelp.mybatisexample.LocalProductExample;
import com.dmsdbj.itoo.tool.base.service.impl.BaseServiceImpl;
import com.dmsdbj.dmt.graduatorHelp.dao.LocalProductDao;
import com.dmsdbj.dmt.graduatorHelp.service.LocalProductService;
import com.dmsdbj.dmt.graduatorHelp.entity.LocalProductEntity;

/**
 * @author: 马金兴 
 * @create:2017-11-15 15:47:40
 * @DESCRIPTION
 */
@Service("localProductService")
public class LocalProductServiceImpl extends BaseServiceImpl<LocalProductEntity, LocalProductExample> implements LocalProductService {


    //注入localProductDao
	@Autowired
    private LocalProductDao localProductDao;

    /**
     * 让BaseServiceImpl获取到Dao
     * @return BaseDao<LocalProductEntity, LocalProductExample>
     */
    @Override
    public  BaseDao<LocalProductEntity, LocalProductExample> getRealDao(){
        return this.localProductDao;
    }
}
