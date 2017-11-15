package com.dmsdbj.itoo.demo.facade;

import com.dmsdbj.itoo.demo.entity.ClassEntity;

import java.util.List;

/**
 *@author: 孔唯妍 
 *@create: 2017-10-31 20:35:12.
 */
public interface ClassFacade {
    /**
     * @author kwy
     * @param id 课程id
     * @return boolean
     */
    ClassEntity findById(String id);
    /**
     * @author kwy
     * @param id 课程id
     * @return boolean
     */
    int deleteById(String id);

    /**
     * @author kwy
     * @param classBean 课程id
     * @return boolean
     */
    boolean insert(ClassEntity classBean);
    /**
     * @author kwy
     * @param pageNum
     * @param pageSize
     * @return boolean
     */
    List<ClassEntity> selectPage(int pageNum, int pageSize);
    /**
     * @author kwy
     * @param classCode 课程id
     * @return boolean
     */
    int updateByConditionSelective(String classCode);
}
