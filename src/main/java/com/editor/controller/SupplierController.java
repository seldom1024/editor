package com.editor.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @description:
 * @author: Seldom
 * @time: 2019/10/24 18:40
 */

@Controller
public class SupplierController {
    /**
     * 页面跳转的controller
     * @param doc
     * @return
     */
    @RequestMapping("sys/md/{doc}")
    public String editMdDoc(@PathVariable("doc") String doc) {
        return "md/" + doc;
    }

    @RequestMapping("sys/read")
    public String readMd() {
        return "md/show/show";
    }

}

