package com.bs.web;

import com.alibaba.fastjson.JSON;
import com.bs.entity.FeginError;
import com.bs.entity.User;
import com.bs.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by liuxl on 2017/9/13.
 */
@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/users", method = RequestMethod.GET)
    public Object users(/*@RequestParam String name*/) {
        String str = userService.getUserList();
        Object result;
       try {
           result = JSON.parseArray(str, User.class);
       } catch (Exception e){
            result = JSON.parseObject(str, FeginError.class);
       }
        return result;
    }
}
