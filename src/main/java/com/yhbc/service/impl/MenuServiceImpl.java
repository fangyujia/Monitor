package com.yhbc.service.impl;

import com.yhbc.dao.MenuDao;
import com.yhbc.service.MenuService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Transactional(rollbackFor = Exception.class)
@Service("adminFunctionService")
public class MenuServiceImpl extends BaseServiceImpl implements MenuService {

    @Resource
    private MenuDao menuDao;

    @Override
    public List<Map<String, Object>> findMenusByParentId(Map<String, Object> map) {
        return menuDao.findMenusByParentId(map);
    }

}
