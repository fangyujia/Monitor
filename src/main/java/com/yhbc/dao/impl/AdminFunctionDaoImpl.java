package com.yhbc.dao.impl;

import com.silverbox.entity.auth.AdminFunction;
import com.yhbc.dao.AdminFunctionDao;
import com.yhbc.dao.MybatisDaoBase;
import org.springframework.stereotype.Repository;

/**
 * The type Admin function dao.
 */
@Repository
public class AdminFunctionDaoImpl extends MybatisDaoBase implements AdminFunctionDao {
    @Override
    public AdminFunction selectByPrimaryKey(Integer id) {
        return sqlSession.selectOne("AdminFunction.selectByPrimaryKey", id);
    }
}