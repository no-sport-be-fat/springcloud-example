package com.bs.web;

import com.alibaba.fastjson.JSON;
import com.bs.entity.User;
import com.bs.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by liuxl on 2017/9/13.
 */
@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/users", method = RequestMethod.GET)
    public List<User> users(/*@RequestParam String name*/) {
        String str = userService.getUserList();
        List<User> list = JSON.parseArray(str,User.class);
        return list;
    }
}
