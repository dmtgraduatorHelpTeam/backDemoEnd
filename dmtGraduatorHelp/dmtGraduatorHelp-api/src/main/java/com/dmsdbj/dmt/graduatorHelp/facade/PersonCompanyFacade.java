package com.dmsdbj.dmt.graduatorHelp.facade;

import com.dmsdbj.dmt.graduatorHelp.entity.PersonCompanyEntity;

/**
 *@author: 马金兴 
 *@create: 2017-11-15 15:47:40.
 */
public interface PersonCompanyFacade {
      /**
      * @author kongwy
      * @param id
      * @return PersonCompanyEntity
      */
     PersonCompanyEntity findById(String id);
}
