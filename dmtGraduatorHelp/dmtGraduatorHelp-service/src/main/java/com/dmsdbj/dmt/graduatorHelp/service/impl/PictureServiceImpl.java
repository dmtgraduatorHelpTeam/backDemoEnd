package com.dmsdbj.dmt.graduatorHelp.service.impl;

import com.dmsdbj.itoo.tool.base.dao.BaseDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.dmsdbj.dmt.graduatorHelp.mybatisexample.PictureExample;
import com.dmsdbj.itoo.tool.base.service.impl.BaseServiceImpl;
import com.dmsdbj.dmt.graduatorHelp.dao.PictureDao;
import com.dmsdbj.dmt.graduatorHelp.service.PictureService;
import com.dmsdbj.dmt.graduatorHelp.entity.PictureEntity;

/**
 * @author: 马金兴 
 * @create:2017-11-15 15:47:40
 * @DESCRIPTION
 */
@Service("pictureService")
public class PictureServiceImpl extends BaseServiceImpl<PictureEntity, PictureExample> implements PictureService {


    //注入pictureDao
	@Autowired
    private PictureDao pictureDao;

    /**
     * 让BaseServiceImpl获取到Dao
     * @return BaseDao<PictureEntity, PictureExample>
     */
    @Override
    public  BaseDao<PictureEntity, PictureExample> getRealDao(){
        return this.pictureDao;
    }
}
