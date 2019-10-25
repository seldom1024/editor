package com.editor.controller;

import com.editor.dao.Blog;
import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.ResourceUtils;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Map;

/**
 * @description:
 * @author: Seldom
 * @time: 2019/10/25 17:09
 */
@Controller
public class MyController {

    private String filePath = ResourceUtils.getURL("classpath:static/download/md/").getPath();

    public MyController() throws FileNotFoundException {
    }

    @Autowired
    private Blog blog;

    @RequestMapping("/my")
    public String My(){
        return "md/show/show.html";
    }

    @RequestMapping("/myy")
    public String my(Map map) throws IOException {
        blog.setBlContent(FileUtils.readFileToString(new File(filePath + "test.md")));
        blog.setBlTitle("测试...");
        map.put("blog", blog);
        return "/md/reedit.html";
    }
}
