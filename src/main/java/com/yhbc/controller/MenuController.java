package com.yhbc.controller;

import com.silverbox.entity.auth.AdminFunction;
import com.yhbc.service.AdminFunctionService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/menu")
public class MenuController {

    private static Logger logger = LoggerFactory.getLogger(MenuController.class);

    @Resource(name = "adminFunctionService")
    private AdminFunctionService adminFunctionService;

    @RequestMapping(value = "list.htm", method = {RequestMethod.GET})
    @ResponseBody
    public ModelAndView list(HttpServletRequest request, HttpSession session) {
        try {
            AdminFunction adminFunction = adminFunctionService.selectByPrimaryKey(1);
            System.out.println(adminFunction.getName());
            return new ModelAndView("/menu");
        } catch (Exception e) {
            logger.error("list menu error", e);
            return null;
        }
    }

}
