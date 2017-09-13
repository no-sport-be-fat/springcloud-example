package com.bs.service.impl;

import com.bs.dao.UserDao;
import com.bs.entity.User;
import com.bs.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by liuxl on 2017/9/13.
 */
@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserDao userDao;

    public int addUser(User user){
        return userDao.insert(user);
    }

    public User getUserById(int id){
        return userDao.selectByPrimaryKey(id);
    }

    public List<User> getAllUsers(){
        return userDao.getAllUsers();
    }
}
