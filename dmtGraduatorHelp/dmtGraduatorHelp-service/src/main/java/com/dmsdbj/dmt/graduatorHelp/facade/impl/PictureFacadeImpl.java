package com.dmsdbj.dmt.graduatorHelp.facade.impl;

import com.dmsdbj.dmt.graduatorHelp.entity.PictureEntity;
import com.dmsdbj.dmt.graduatorHelp.facade.PictureFacade;
import com.dmsdbj.dmt.graduatorHelp.service.PictureService;
import org.springframework.beans.factory.annotation.Autowired;
import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *@author:马金兴 
 *@create: 2017-11-15 15:47:40
 * @DESCRIPTION
 */
@Component("pictureFacade")
@Service
public class PictureFacadeImpl implements PictureFacade {

    //打印日志相关
	private static final Logger logger = LoggerFactory.getLogger(PictureFacadeImpl.class);

    @Autowired
    PictureService pictureService;

    /**
     * 根据id查询Picture
     * @param id
     * @return PictureEntity
     */
    @Override
    public PictureEntity findById(String id) {
        return pictureService.findById(id);
    }
    
}
