package com.dmsdbj.dmt.graduatorHelp.facade.test;

import org.junit.Test;
import testUtil.CommonFacade;
import com.dmsdbj.dmt.graduatorHelp.entity.HomeInfoEntity;


public class TestHomeInfoFacade extends CommonFacade {

    /**
	 *@author: 孔唯妍 
	 *@create:2017-11-15 15:47:40
     *@DESCRIPTION:分页查询测试
     */
    @Test
    public  void findById(){

        HomeInfoEntity homeInfoEntity = homeInfoFacade.findById("0044fbbe28c254673bc37a");
        if (homeInfoEntity!=null){
        	assert true:"正确";
        }else {
            assert false:"null";
        }
    }


}
