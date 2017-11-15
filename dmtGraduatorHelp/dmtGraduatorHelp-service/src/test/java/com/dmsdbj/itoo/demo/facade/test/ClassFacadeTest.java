package com.dmsdbj.itoo.demo.facade.test;

import com.dmsdbj.itoo.demo.entity.ClassEntity;
import org.junit.Test;
import testUtil.CommonFacade;


public class ClassFacadeTest extends CommonFacade {

    /**
     * 分页查询测试-@author
     */
    @Test
    public void findById() {

        ClassEntity classEntity = classFacade.findById("0044fbbe28c254673bc37a");
        if (classEntity != null) {
            System.out.println("测试创建时间" + classEntity.getCreateTime());
        } else {
            System.out.println("你测试的ID库中不存在");
        }
    }


}
