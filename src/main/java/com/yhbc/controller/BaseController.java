package com.yhbc.controller;

import com.silverbox.constant.CodeCanstant;
import com.silverbox.entity.ResultObject;

/**
 * The type Base controller.
 *
 * @author fyj
 * @version v1.0.0
 * @date 2017 -09-19 11:17
 */
public class BaseController {

    /**
     * Success string.
     *
     * @param msg the msg
     * @return the string
     */
    public String success(String msg) {
        ResultObject resultObject = new ResultObject();
        resultObject.setSuccess(true);
        resultObject.setMsg(msg);
        resultObject.setCode(CodeCanstant.CODE_SUCCESS);
        return resultObject.toString();
    }

    /**
     * Success string.
     *
     * @param msg  the msg
     * @param data the data
     * @return the string
     */
    public String success(String msg, Object data) {
        ResultObject resultObject = new ResultObject();
        resultObject.setSuccess(true);
        resultObject.setMsg(msg);
        resultObject.setCode(CodeCanstant.CODE_SUCCESS);
        resultObject.setData(data);
        return resultObject.toString();
    }

    /**
     * Fail string.
     *
     * @param msg the msg
     * @return the string
     */
    public String fail(String msg) {
        ResultObject resultObject = new ResultObject();
        resultObject.setMsg(msg);
        resultObject.setCode(CodeCanstant.CODE_PARAMTERS_EMPTY);
        return resultObject.toString();
    }

    /**
     * Fail string.
     *
     * @param msg  the msg
     * @param code the code
     * @return the string
     */
    public String fail(String msg, Integer code) {
        ResultObject resultObject = new ResultObject();
        resultObject.setMsg(msg);
        resultObject.setCode(code);
        return resultObject.toString();
    }

    /**
     * Fail string.
     *
     * @param msg  the msg
     * @param code the code
     * @param data the data
     * @return the string
     */
    public String fail(String msg, Integer code, Object data) {
        ResultObject resultObject = new ResultObject();
        resultObject.setMsg(msg);
        resultObject.setCode(code);
        resultObject.setData(data);
        return resultObject.toString();
    }

    /**
     * Fail string.
     *
     * @param msg the msg
     * @param e   the exception
     * @return the string
     */
    public String fail(String msg, Exception e) {
        ResultObject resultObject = new ResultObject();
        resultObject.setMsg(msg + " : " + e.getMessage());
        resultObject.setCode(CodeCanstant.CODE_FALSE);
        return resultObject.toString();
    }

    /**
     * No data string.
     *
     * @param msg the msg
     * @return the string
     */
    public String noData(String msg) {
        ResultObject resultObject = new ResultObject();
        resultObject.setMsg(msg);
        resultObject.setCode(CodeCanstant.CODE_NO_DATA);
        return resultObject.toString();
    }
}
