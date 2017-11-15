package com.dmsdbj.itoo.demo.facade.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.dmsdbj.itoo.demo.entity.ClassEntity;
import com.dmsdbj.itoo.demo.facade.ClassFacade;
import com.dmsdbj.itoo.demo.mybatisexample.ClassCriteria;
import com.dmsdbj.itoo.demo.mybatisexample.ClassExample;
import com.dmsdbj.itoo.demo.service.ClassService;
import com.github.pagehelper.PageHelper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 *@author:孔唯妍 
 *@create: 2017-10-31 20:44:38
 * @DESCRIPTION
 */
@Component("classFacade")
@Service
public class ClassFacadeImpl implements ClassFacade {

    private static final Logger logger = LoggerFactory.getLogger(ClassFacadeImpl.class);

    @Autowired
    ClassService classService;

    @Override
    public ClassEntity findById(String id) {
        logger.info(id);
        return classService.findById(id);
    }


    @Override
    public int deleteById(String id) {
        return classService.deleteById(id, "123");
    }

    @Override
    public boolean insert(ClassEntity classBean) {
        int result = classService.insert(classBean);
        System.out.println("zhanghantest---inset---" + result);
        if (result > 0) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public List<ClassEntity> selectPage(int pageNum, int pageSize) {
        ClassExample classExample = new ClassExample();
        ClassCriteria classCriteria = classExample.createCriteria();
        PageHelper.startPage(pageNum, pageSize);
        return classService.selectByExample(classExample);

    }

    @Override
    public int updateByConditionSelective(String classCode) {
        ClassExample classExample = new ClassExample();
        ClassCriteria criteria = classExample.createCriteria();
        String myclassCode = classCode;
        criteria.andClassCodeEqualTo(myclassCode);
        ClassEntity classEntity = new ClassEntity();
        classEntity.setClassCode("222222");
        return classService.updateByExample(classEntity, classExample);
    }


}
