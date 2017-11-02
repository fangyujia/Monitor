package com.yhbc.controller;

import com.yhbc.service.MenuService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/menu")
public class MenuController extends BaseController {

    private static Logger logger = LoggerFactory.getLogger(MenuController.class);

    @Resource(name = "adminFunctionService")
    private MenuService menuService;

    @RequestMapping(value = "list.htm", method = {RequestMethod.GET})
    @ResponseBody
    public String list(Integer parentId) {
        try {
            Map<String, Object> map = new HashMap<>(0);
            map.put("parentId", parentId);
            map.put("project", "Monitor");
            List<Map<String, Object>> menus = menuService.findMenusByParentId(map);
            return success("查询成功", menus);
        } catch (Exception e) {
            logger.error("list menu error", e);
            return fail("list menu error", e);
        }
    }

}
