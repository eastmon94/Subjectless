package com.subjectless.web.service;

import java.util.List;

import com.subjectless.web.dao.UserDao;
import com.subjectless.web.dto.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{
    
    @Autowired
    UserDao userDao;
    
    @Override
    public List<User> getUserList() {
        return userDao.findAll();
    }

    @Override
    public User getByUserId(String userId) {
        return userDao.findByUserId(userId);
    }

    @Override
    public boolean registerUser(User user) {
        if(userDao.findByUserId(user.getUserId())!=null) return false;

        userDao.save(user);
        return true;
    }

    @Override
    public User login(String userId, String password) {
        return userDao.findByUserIdAndPassword(userId, password);
    }
}
