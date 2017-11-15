package com.dmsdbj.dmt.graduatorHelp.facade;

import com.dmsdbj.dmt.graduatorHelp.entity.CompanyEntity;

/**
 *@author: 马金兴 
 *@create: 2017-11-15 15:47:40.
 */
public interface CompanyFacade {
      /**
      * @author kongwy
      * @param id
      * @return CompanyEntity
      */
     CompanyEntity findById(String id);
}
