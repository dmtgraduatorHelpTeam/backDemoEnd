package com.dmsdbj.dmt.graduatorHelp.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.dmsdbj.dmt.graduatorHelp.entity.PersonCompanyEntity;
import com.dmsdbj.dmt.graduatorHelp.facade.PersonCompanyFacade;
import com.dmsdbj.itoo.tool.business.ItooResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;



/**
 * @author: 马金兴 
 * @DESCRIPTION: demo展示
 * @create: 2017-11-15 15:47:40.
 */

@RequestMapping("/personCompany")
@Controller
public class PersonCompanyController {

    //定义打印日志相关
    private static final Logger logger = LoggerFactory.getLogger(PersonCompanyController.class);

    @Reference
    PersonCompanyFacade personCompanyFacade;

    /**
     * @author: 马金兴 
     * @DESCRIPTION:首页导向页
	 * @params:
     * @return:
	 * @Date:
	 * @Modified By:  
     */
    @RequestMapping(value = {"/index"})
    public String index() {
        return "personCompany";
    }

    /**
     * 查找测试-马金兴-{date}
     *
     * @param id
     */
    @RequestMapping(value = {"/findById/{id}"}, method = RequestMethod.GET)
    public ItooResult findById(@PathVariable String id) {
		try {
			PersonCompanyEntity personCompanyEntity = personCompanyFacade.findById(id);
			if (personCompanyEntity != null) {
				return ItooResult.build("0000", "查询该课程为空");
			}else{
				return ItooResult.build("0000", "查询该课程成功", personCompanyEntity);
			}
        
        } catch (Exception e) {
            logger.error("",e);
			return ItooResult.build("1111", "查询该课程失败");
        }
    }
}    
