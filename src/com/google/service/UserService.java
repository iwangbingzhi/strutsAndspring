package com.google.service;

import com.google.dao.UserDao;

/**
 * Created by 王炳智 on 2017/8/22.
 */
public class UserService {
    public UserService(UserDao userDao) {
        this.userDao = userDao;
    }

    private UserDao userDao;

    public void add(){
        System.out.println("UserService...........");
        userDao.add();
    }
}
