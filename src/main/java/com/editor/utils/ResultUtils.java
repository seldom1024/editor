package com.editor.utils;

/**
 * @description:
 * @author: Seldom
 * @time: 2019/10/25 16:29
 */

public class ResultUtils{
    public static final String SUCCESS_MSG = "处理成功";
    public static final String FAILED_MSG = "处理失败";

    public static final Integer SUCCESS_CODE = 0;
    public static final Integer FAILED_CODE = 1;
    private ResultUtils(){

    }

    public static ApiResult buildError(Integer errorCode,String msg){
        return new ApiResult(errorCode,msg,null);
    }

    public static ApiResult buildSuccessObject(Object data){
        return new ApiResult(SUCCESS_CODE,SUCCESS_MSG,data);
    }

    public static ApiResult buildSuccess(){
        return new ApiResult(SUCCESS_CODE,SUCCESS_MSG,null);
    }

}



