package com.dmsdbj.dmt.graduatorHelp.facade.test;

import org.junit.Test;
import testUtil.CommonFacade;
import com.dmsdbj.dmt.graduatorHelp.entity.PersonCompanyEntity;


public class PersonCompanyFacadeTest extends CommonFacade {

    /**
	 *@author: 孔唯妍 
	 *@create:2017-11-13 15:55:45
     *@DESCRIPTION:分页查询测试
     */
    @Test
    public  void findById(){

        PersonCompanyEntity personCompanyEntity = personCompanyFacade.findById("0044fbbe28c254673bc37a");
        if (personCompanyEntity!=null){
        	assert true:"正确";
        }else {
            assert false:"null";
        }
    }


}
