package com.yhbc.dao;

import java.util.List;
import java.util.Map;

/**
 * The interface Menu dao.
 */
public interface MenuDao {
    /**
     * Find menus by parent id list.
     *
     * @param map the map
     * @return the list
     */
    List<Map<String, Object>> findMenusByParentId(Map<String,Object> map);
}