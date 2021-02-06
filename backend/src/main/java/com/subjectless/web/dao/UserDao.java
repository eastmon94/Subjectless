package com.subjectless.web.dao;

import java.util.List;

import com.subjectless.web.dto.User;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao extends JpaRepository<User, Integer>{
    List<User> findAll();
    User findByUserId();
}
