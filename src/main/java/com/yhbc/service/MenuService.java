package com.yhbc.service;

import java.util.List;
import java.util.Map;

/**
 * The interface Menu service.
 */
public interface MenuService extends BaseService {

    /**
     * Find menus by parent id list.
     *
     * @param map the map
     * @return the list
     */
    List<Map<String, Object>> findMenusByParentId(Map<String, Object> map);
}
