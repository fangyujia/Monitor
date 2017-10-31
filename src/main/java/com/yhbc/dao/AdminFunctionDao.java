package com.yhbc.dao;

import com.silverbox.entity.auth.AdminFunction;

/**
 * The interface Admin function dao.
 */
public interface AdminFunctionDao {
    /**
     * Select by primary key admin function.
     *
     * @param id the id
     * @return the admin function
     */
    AdminFunction selectByPrimaryKey(Integer id);
}