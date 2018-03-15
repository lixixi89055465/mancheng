package com.bizvane.ishop.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.bizvane.ishop.constant.Common;
import com.bizvane.ishop.entity.Corp;
import com.bizvane.ishop.service.CorpService;
import com.github.pagehelper.PageInfo;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import javax.servlet.http.HttpServletRequest;

/**
 * Created by zhouying on 2016-04-20.
 */


/**
 * 企业管理
 */

@Controller
@RequestMapping("/corp")
public class CorpController {

    private static final Logger logger = Logger.getLogger(CorpController.class);


    @Autowired
    private CorpService corpService;


    /*
    * 列表
    * */
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    @ResponseBody
    public String cropManage(HttpServletRequest request) {
        JSONObject info = new JSONObject();
        try {
            int page_number = Integer.parseInt(request.getParameter("pageNumber"));
            int page_size = Integer.parseInt(request.getParameter("pageSize"));
            PageInfo<Corp> corpInfo = corpService.selectAllCorp(page_number, page_size, "");
            info.put("list", JSON.toJSONString(corpInfo));

        } catch (Exception ex) {
            info.put("error", ex.getMessage());
        }
        return info.toString();
    }

    /**
     * 新增
     */
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @ResponseBody
    public String addCrop(HttpServletRequest request) {
        try {
            String jsString = request.getParameter("param");
            JSONObject jsonObj = JSONObject.parseObject(jsString);
            String message = jsonObj.get("message").toString();
            String result = corpService.insert(message);
            if (result.equals(Common.DATABEAN_CODE_SUCCESS)) {
                return "success";
            }else {
                return "fail";
            }
        } catch (Exception ex) {
            return ex.getMessage();
        }
    }

    /**
     * 编辑
     */
    @RequestMapping(value = "/edit", method = RequestMethod.POST)
    @ResponseBody
    public String editCrop(HttpServletRequest request) {
        try {
            String jsString = request.getParameter("param");
            JSONObject jsonObj = JSONObject.parseObject(jsString);
            String message = jsonObj.get("message").toString();
            String result = corpService.update(message);
            if (result.equals(Common.DATABEAN_CODE_SUCCESS)) {
                return "success";
            }else {
                return "fail";
            }
        } catch (Exception ex) {
            return ex.getMessage();
        }
    }

}
