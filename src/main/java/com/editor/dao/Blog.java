package com.editor.dao;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @description:
 * @author: Seldom
 * @time: 2019/10/25 17:39
 */
@Component
public class Blog {

    private String blContent;

    private String blTitle;

    public String getBlContent() {
        return blContent;
    }

    public void setBlContent(String blContent) {
        this.blContent = blContent;
    }

    public String getBlTitle() {
        return blTitle;
    }

    public void setBlTitle(String blTitle) {
        this.blTitle = blTitle;
    }
}
