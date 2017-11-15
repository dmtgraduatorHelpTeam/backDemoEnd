package com.dmsdbj.dmt.graduatorHelp.facade;

import com.dmsdbj.dmt.graduatorHelp.entity.PictureEntity;

/**
 *@author: 马金兴 
 *@create: 2017-11-15 15:47:40.
 */
public interface PictureFacade {
      /**
      * @author kongwy
      * @param id
      * @return PictureEntity
      */
     PictureEntity findById(String id);
}
