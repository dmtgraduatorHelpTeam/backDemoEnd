package com.dmsdbj.dmt.graduatorHelp.facade;

import com.dmsdbj.dmt.graduatorHelp.entity.HomeInfoEntity;

/**
 *@author: 马金兴 
 *@create: 2017-11-15 15:47:40.
 */
public interface HomeInfoFacade {
      /**
      * @author kongwy
      * @param id
      * @return HomeInfoEntity
      */
     HomeInfoEntity findById(String id);
}
