package com.dmsdbj.dmt.graduatorHelp.facade;

import com.dmsdbj.dmt.graduatorHelp.entity.LandScapeEntity;

/**
 *@author: 马金兴 
 *@create: 2017-11-15 15:47:40.
 */
public interface LandScapeFacade {
      /**
      * @author kongwy
      * @param id
      * @return LandScapeEntity
      */
     LandScapeEntity findById(String id);
}
