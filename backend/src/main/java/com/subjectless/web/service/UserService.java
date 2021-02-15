package com.subjectless.web.service;

import java.util.List;

import com.subjectless.web.dto.User;

public interface UserService {
    List<User> getUserList();
    User getByUserId(String userId);
    boolean registerUser(User user);
    User login(String userId, String password);
}
