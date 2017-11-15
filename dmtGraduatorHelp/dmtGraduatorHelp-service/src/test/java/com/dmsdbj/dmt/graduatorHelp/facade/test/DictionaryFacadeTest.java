package com.dmsdbj.dmt.graduatorHelp.facade.test;

import org.junit.Test;
import testUtil.CommonFacade;
import com.dmsdbj.dmt.graduatorHelp.entity.DictionaryEntity;


public class DictionaryFacadeTest extends CommonFacade {

    /**
	 *@author: 孔唯妍 
	 *@create:2017-11-13 15:55:45
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
