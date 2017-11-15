package com.dmsdbj.itoo.demo.service.impl;

import com.dmsdbj.itoo.demo.dao.ClassDao;
import com.dmsdbj.itoo.demo.entity.ClassEntity;
import com.dmsdbj.itoo.demo.mybatisexample.ClassExample;
import com.dmsdbj.itoo.demo.service.ClassService;
import com.dmsdbj.itoo.tool.base.dao.BaseDao;
import com.dmsdbj.itoo.tool.base.service.impl.BaseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * @author 孔唯妍
 * @create 2017年11月1日
 * @DESCRIPTION
 */
@Service("classService")
public class ClassServiceImpl extends BaseServiceImpl<ClassEntity, ClassExample> implements ClassService {


    //注入classDao
    @Autowired
    private ClassDao classDao;

    /**
     * 让BaseServiceImpl获取到Dao
     *
     * @return BaseDao<ClassEntity, ClassExample>
     */
    @Override
    public BaseDao<ClassEntity, ClassExample> getRealDao() {
        return this.classDao;
    }
}
