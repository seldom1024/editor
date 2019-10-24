package com.editor.utils;

import org.springframework.stereotype.Component;
import org.springframework.web.context.WebApplicationContext;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

/**
 * @description: 获取baseUrl
 * @author: Seldom
 * @time: 2019/10/5 15:39
 */
@Component
public class DataBaseUrl {
    public String getDbUrl(){
        WebApplicationContext webApplicationContext = (WebApplicationContext) SpringContextUtils.applicationContext;
        ServletContext servletContext = webApplicationContext.getServletContext();
        String projectPath = servletContext.getContextPath();
        HttpServletRequest request = HttpContextUtils.getHttpServletRequest();
        String contextpath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+projectPath;
        return contextpath;
    }
}
