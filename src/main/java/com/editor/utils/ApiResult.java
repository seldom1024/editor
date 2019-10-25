package com.editor.utils;

/**
 * @description:
 * @author: Seldom
 * @time: 2019/10/25 16:34
 */
public class ApiResult {

    ApiResult(Integer errorCode, String msg, Object data) {
        this.errorCode = errorCode;
        this.msg = msg;
        this.data = data;
    }

    /**
     * 错误码
     */
    private Integer errorCode;

    /**
     * 消息提示
     */
    private String msg;

    /**
     * 返回的函数，一般使用Object或者Map
     */
    private Object data;

    public Integer getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

}
