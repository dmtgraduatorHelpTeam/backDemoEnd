package com.dmsdbj.dmt.graduatorHelp.facade;

import com.dmsdbj.dmt.graduatorHelp.entity.DictionaryEntity;

/**
 *@author: 马金兴 
 *@create: 2017-11-15 15:47:40.
 */
public interface DictionaryFacade {
      /**
      * @author kongwy
      * @param id
      * @return DictionaryEntity
      */
     DictionaryEntity findById(String id);
}
