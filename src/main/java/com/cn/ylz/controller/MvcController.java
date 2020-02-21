package com.cn.ylz.controller;

import com.cn.ylz.config.User;
import org.springframework.web.bind.annotation.*;

@RestController
public class MvcController {

    @RequestMapping(value = "/say/getuser",method = RequestMethod.GET)
    public Object getUser()
    {
        User u = new User();
        u.setId(100);
        u.setName("范国亚");

        return  u;
    }

    @GetMapping(value = "/say/getuser1")
    public Object getUser1()
    {
        User u = new User();
        u.setId(100);
        u.setName("范国亚");
        return  u;
    }

    @PostMapping(value = "/say/getuser2")
    public Object getUser2()
    {
        User u = new User();
        u.setId(100);
        u.setName("范国亚");
        return  u;
    }
}
