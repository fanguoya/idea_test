package com.cn.ylz.controller;

import com.cn.ylz.config.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    @Value("${boot.name}")
    private String name;

    @Value("${boot.idcard}")
    private String idcard;

    @Autowired
    private Student stu;

    @RequestMapping("/say/hello")
    public @ResponseBody  String hello()
    {
        return idcard+name+stu.getName()+stu.getIdcard();
    }
}
