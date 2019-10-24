package com.editor.utils;

import org.springframework.stereotype.Component;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * @description: 保存时的文件名
 * @author: Seldom
 * @time: 2019/10/5 16:14
 */
@Component
public class PicFileName {

    public String fileNameAndPath(String originalFilename, int articleId){

        DateFormat dfFile = new SimpleDateFormat("yyyyMMddHHmmss");
        Calendar calendar = Calendar.getInstance();
        String dateName = dfFile.format(calendar.getTime())+"_"+originalFilename;
        String fileName =articleId+"_"+dateName;
        String endFileName = this.getPath() + fileName;
        return endFileName;
    }

    public String getPath(){
        DateFormat dfPath = new SimpleDateFormat("yyyyMMdd");
        Calendar calendar = Calendar.getInstance();
        String path = dfPath.format(calendar.getTime());
        String endPath = "upload/"+path+"/";
        return endPath;
    }

    public String fileNameAndPath(String originalFilename, Integer articleId, int i) {
        DateFormat dfFile = new SimpleDateFormat("yyyyMMddHHmmss");
        Calendar calendar = Calendar.getInstance();
        String dateName = dfFile.format(calendar.getTime())+"_"+originalFilename;
        String fileName =articleId+"_"+ i +"_"+dateName;
        String endFileName = this.getPath() + fileName;
        return endFileName;
    }
}
