package com.yhbc.service;

import com.silverbox.entity.auth.AdminFunction;

/**
 * The interface Admin function service.
 */
public interface AdminFunctionService extends BaseService {

    /**
     * Select by primary key admin function.
     *
     * @param id the id
     * @return the admin function
     */
    AdminFunction selectByPrimaryKey(Integer id);
}
