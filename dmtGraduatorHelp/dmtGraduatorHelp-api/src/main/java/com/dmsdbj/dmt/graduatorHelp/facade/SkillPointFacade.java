package com.dmsdbj.dmt.graduatorHelp.facade;

import com.dmsdbj.dmt.graduatorHelp.entity.SkillPointEntity;

/**
 *@author: 马金兴 
 *@create: 2017-11-15 15:47:40.
 */
public interface SkillPointFacade {
      /**
      * @author kongwy
      * @param id
      * @return SkillPointEntity
      */
     SkillPointEntity findById(String id);
}
