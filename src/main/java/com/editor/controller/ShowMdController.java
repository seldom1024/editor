package com.editor.controller;

import org.apache.commons.io.FileUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;
import java.io.IOException;

/**
 * @description:
 * @author: Seldom
 * @time: 2019/10/24 18:50
 */
@RestController
@RequestMapping("/sys")
public class ShowMdController {

    /**
     * 文件根据需要自己选择
     * @param id
     * @return
     */
   /* @GetMapping("/show/{id}")
    public ApiResult showMd(@PathVariable("id")String id){
        String json = "";
        try {
            json = FileUtils.readFileToString(new File("F:/download/md/test.md"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return ResultUtils.buildSucessObject(json);
    }*/
}

