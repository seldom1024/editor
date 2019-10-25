package com.editor.controller;

import com.editor.utils.ApiResult;
import com.editor.utils.DataBaseUrl;
import com.editor.utils.ResultUtils;
import org.apache.commons.io.FileUtils;
import org.springframework.util.ResourceUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @description:
 * @author: Seldom
 * @time: 2019/10/24 18:50
 */
@RestController
@RequestMapping("/sys")
public class ShowMdController {

    private String filePath = ResourceUtils.getURL("classpath:static/download/md/").getPath();

    public ShowMdController() throws FileNotFoundException {
    }

    /**
     * 文件根据需要自己选择
     * @param id
     * @return
     */
    @GetMapping("/show/{id}")
    public ApiResult showMd(@PathVariable("id")String id){
        String json = "";
        try {
            json = FileUtils.readFileToString(new File(filePath + "test.md"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        ApiResult apiResult = ResultUtils.buildSuccessObject(json);
        System.out.println(apiResult.getData());
        return ResultUtils.buildSuccessObject(json);
    }
}

