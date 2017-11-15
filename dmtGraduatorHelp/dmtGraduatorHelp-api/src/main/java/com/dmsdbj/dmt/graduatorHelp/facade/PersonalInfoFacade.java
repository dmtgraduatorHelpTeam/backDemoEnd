package com.dmsdbj.dmt.graduatorHelp.facade;

import com.dmsdbj.dmt.graduatorHelp.entity.PersonalInfoEntity;

/**
 *@author: 马金兴 
 *@create: 2017-11-15 15:47:40.
 */
public interface PersonalInfoFacade {
      /**
      * @author kongwy
      * @param id
      * @return PersonalInfoEntity
      */
     PersonalInfoEntity findById(String id);
}
