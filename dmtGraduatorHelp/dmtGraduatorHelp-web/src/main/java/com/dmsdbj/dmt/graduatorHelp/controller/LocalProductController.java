package com.dmsdbj.dmt.graduatorHelp.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.dmsdbj.dmt.graduatorHelp.entity.LocalProductEntity;
import com.dmsdbj.dmt.graduatorHelp.facade.LocalProductFacade;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



/**
 * @author: 马金兴 
 * @DESCRIPTION: demo展示
 * @create: 2017-11-15 15:47:40.
 */

@RequestMapping("/localProduct")
@Controller
public class LocalProductController {

    //定义打印日志相关
    private static final Logger logger = LoggerFactory.getLogger(LocalProductController.class);

    @Reference
    LocalProductFacade localProductFacade;

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
        return "localProduct";
    }

    /**
     * 查找测试-马金兴-{date}
     *
     * @param id
     */
    @RequestMapping(value = {"/findById/{id}"}, method = RequestMethod.GET)
    public ItooResult findById(@PathVariable String id) {
		try {
			LocalProductEntity localProductEntity = localProductFacade.findById(id);
			if (localProductEntity != null) {
				return ItooResult.build("0000", "查询该课程为空", LocalProductEntity);
			}else{
				return ItooResult.build("0000", "查询该课程成功", LocalProductEntity);
			}
        
        } catch (Exception e) {
            logger.error("",e);
			return ItooResult.build("1111", "查询该课程失败", LocalProductEntity);
        }
    }
}    
