package com.dmsdbj.itoo.demo.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.dmsdbj.itoo.demo.entity.ClassEntity;
import com.dmsdbj.itoo.demo.facade.ClassFacade;
import com.dmsdbj.itoo.tool.business.ItooResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;

/**
 * @author: 孔唯妍 
 * @create:2017年10月31日
 * @DESCRIPTION
 */
@RequestMapping("/class")
@Controller
public class ClassController {

    private static final Logger logger = LoggerFactory.getLogger(ClassController.class);
    @Reference
    ClassFacade classFacade;

    /**
     * 首页导向页  张晗
     *
     * @return
     */
    @RequestMapping(value = {"/index"}, method = RequestMethod.GET)
    public String index() {
        return "class";
    }

    /**
     * 查找某个班级-张晗-2017年6月12日
     * <p>
     *
     * @param response
     */
    @RequestMapping(value = {"/findById/{id}"}, method = RequestMethod.GET)
    @ResponseBody
    public ItooResult findById(HttpServletResponse response, @PathVariable String id) {

        ItooResult itooResult = null;
        ClassEntity classEntity = classFacade.findById(id);

        if (classEntity != null) {
            itooResult = ItooResult.build("0000", "查询成功", classEntity);
        } else {
            itooResult = ItooResult.build("1111", "查询失败");
        }
        return itooResult;

    }

    @RequestMapping(value = {"/deleteById/{id}"}, method = RequestMethod.POST)
    @ResponseBody
    public ItooResult deleteById(@PathVariable String id, HttpServletResponse response) {

        String key = id;
        int result = classFacade.deleteById(key);
        if (result > 0) {

            return ItooResult.build("0000", "删除成功", result);
        }//该判断对应service层判断时返回的值
        else if (result == -10) {
            //此处msg对应自己的业务逻辑，比如name值不能重复等
            return ItooResult.build("1111", "数据已存在", result);
        } else {
            return ItooResult.build("1111", "删除XXX失败", result);
        }
    }

    @RequestMapping(value = {"/insert"}, method = RequestMethod.POST)
    @ResponseBody
    public ItooResult insert(HttpServletResponse response) {

        ClassEntity classBean = new ClassEntity();
        classBean.setOperator("zhanghan");
        classBean.setClassCode("111111");
        classBean.setClassName("张晗测试班级");
        classBean.setGrade("2012级");
        classBean.setProfessionId("c9464ea11ece15ff29f44f");
        boolean result = classFacade.insert(classBean);
        if (result == true) {

            return ItooResult.build("0000", "插入成功", result);
        } else {
            return ItooResult.build("1111", "插入XXX失败", result);
        }

    }

    @RequestMapping(value = {"/updateByExample/{classCode}"}, method = RequestMethod.POST)
    @ResponseBody
    public ItooResult updateByConditionSelective(@PathVariable String classCode, HttpServletResponse response) {

        int result = classFacade.updateByConditionSelective(classCode);
        if (result >= 0) {

            return ItooResult.build("0000", "修改成功", result);
        } else {
            return ItooResult.build("1111", "修改XXX失败", result);
        }
    }
}
