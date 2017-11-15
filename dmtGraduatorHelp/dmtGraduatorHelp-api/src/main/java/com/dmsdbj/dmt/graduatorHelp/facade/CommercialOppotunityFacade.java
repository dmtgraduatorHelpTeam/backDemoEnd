package com.dmsdbj.dmt.graduatorHelp.facade;

import com.dmsdbj.dmt.graduatorHelp.entity.CommercialOppotunityEntity;

/**
 *@author: 马金兴 
 *@create: 2017-11-15 15:47:40.
 */
public interface CommercialOppotunityFacade {
      /**
      * @author kongwy
      * @param id
      * @return CommercialOppotunityEntity
      */
     CommercialOppotunityEntity findById(String id);
}
