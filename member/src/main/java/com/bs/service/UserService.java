package com.bs.service;

import com.bs.entity.User;

import java.util.List;

/**
 * Created by liuxl on 2017/9/13.
 */
public interface UserService {

    public int addUser(User user);

    public User getUserById(int id);

    public List<User> getAllUsers();
}
