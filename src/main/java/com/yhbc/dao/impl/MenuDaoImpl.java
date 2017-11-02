package com.yhbc.dao.impl;

import com.yhbc.dao.MenuDao;
import com.yhbc.dao.MybatisDaoBase;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * The type Menu dao.
 */
@Repository
public class MenuDaoImpl extends MybatisDaoBase implements MenuDao {
    @Override
    public List<Map<String, Object>> findMenusByParentId(Map<String, Object> map) {
        return sqlSession.selectList("MenuMapper.findMenusByParentId", map);
    }
}