package com.editor.controller;

import com.editor.utils.DataBaseUrl;
import com.editor.utils.MdResult;
import com.editor.utils.PicFileName;
import org.springframework.util.ResourceUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @description:
 * @author: Seldom
 * @time: 2019/10/24 18:40
 */
@RestController
@RequestMapping("/img")
public class ImgUpController {

    private String filePath = ResourceUtils.getURL("classpath:static/").getPath();

    public ImgUpController() throws FileNotFoundException {
    }

    /**
     * 上传图片的配置，用的是commons工具，文件存储路径为项目以外
     *
     * @param file
     * @return
     */
    @PostMapping("/imgUpLoad")
    public MdResult imgUpLoad(@RequestParam(value = "editormd-image-file", required = false) MultipartFile file) {
        String rootPath = filePath + "download/img/";
        String img_path = "/download/img/" + file.getOriginalFilename().replaceAll(" ", "");
        String dbUrl = new DataBaseUrl().getDbUrl() + img_path;
        File img_file = new File(rootPath);
        if (!img_file.exists()) {
            img_file.mkdirs();
        }
        String path = filePath + img_path;
        try {
            file.transferTo(new File(path));
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(dbUrl);
        System.out.println(img_path);
        return new MdResult(1, "上传成功", img_path);
    }

}