package com.dmsdbj.dmt.graduatorHelp.facade;

import com.dmsdbj.dmt.graduatorHelp.entity.EducationEntity;

/**
 *@author: 马金兴 
 *@create: 2017-11-15 15:47:40.
 */
public interface EducationFacade {
      /**
      * @author kongwy
      * @param id
      * @return EducationEntity
      */
     EducationEntity findById(String id);
}
