package com.cn.ylz.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JspController {

    @GetMapping("/jsp/index")
    public String getjsp(){

        return  "hello";
    }
}
