package com.editor.utils;

/**
 * @description: MdResult的返回类型，注意返回的格式success，message，url
 * @author: Seldom
 * @time: 2019/10/24 19:00
 */
public class MdResult {
    public Integer success;

    public String message;

    public String url;

    public MdResult(Integer success, String message, String url) {
        this.success = success;
        this.message = message;
        this.url = url;
    }
}
