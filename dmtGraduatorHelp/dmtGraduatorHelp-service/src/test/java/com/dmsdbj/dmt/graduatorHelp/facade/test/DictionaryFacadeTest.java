package com.dmsdbj.dmt.graduatorHelp.facade.test;

import org.junit.Test;
import testUtil.CommonFacade;
import com.dmsdbj.dmt.graduatorHelp.entity.DictionaryEntity;


public class TestDictionaryFacade extends CommonFacade {

    /**
	 *@author: 孔唯妍 
	 *@create:2017-11-15 15:47:40
     *@DESCRIPTION:分页查询测试
     */
    @Test
    public  void findById(){

        DictionaryEntity dictionaryEntity = dictionaryFacade.findById("0044fbbe28c254673bc37a");
        if (dictionaryEntity!=null){
        	assert true:"正确";
        }else {
            assert false:"null";
        }
    }


}
