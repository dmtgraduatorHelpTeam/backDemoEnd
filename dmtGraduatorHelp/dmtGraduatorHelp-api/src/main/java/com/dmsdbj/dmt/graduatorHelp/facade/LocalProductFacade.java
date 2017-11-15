package com.dmsdbj.dmt.graduatorHelp.facade;

import com.dmsdbj.dmt.graduatorHelp.entity.LocalProductEntity;

/**
 *@author: 马金兴 
 *@create: 2017-11-15 15:47:40.
 */
public interface LocalProductFacade {
      /**
      * @author kongwy
      * @param id
      * @return LocalProductEntity
      */
     LocalProductEntity findById(String id);
}
