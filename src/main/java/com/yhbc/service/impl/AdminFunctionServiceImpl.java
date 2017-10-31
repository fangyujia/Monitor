package com.yhbc.service.impl;

import com.silverbox.entity.auth.AdminFunction;
import com.yhbc.dao.AdminFunctionDao;
import com.yhbc.service.AdminFunctionService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Transactional(rollbackFor = Exception.class)
@Service("adminFunctionService")
public class AdminFunctionServiceImpl extends BaseServiceImpl implements AdminFunctionService {

    @Resource
    private AdminFunctionDao adminFunctionDao;

    @Override
    public AdminFunction selectByPrimaryKey(Integer id) {
        return adminFunctionDao.selectByPrimaryKey(id);
    }

}
