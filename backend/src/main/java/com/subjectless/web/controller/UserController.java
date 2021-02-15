package com.subjectless.web.controller;

import com.subjectless.web.dto.User;
import com.subjectless.web.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping("login")
    public ResponseEntity<User> login(@RequestParam String userId, @RequestParam String password) {
        User u = userService.login(userId, password);
        if(u==null) return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        else return new ResponseEntity<>(u, HttpStatus.OK);
    }

    @PostMapping("join")
    public ResponseEntity<Boolean> join(@RequestBody User user) {
        boolean b = userService.registerUser(user);
        
        if(b) return new ResponseEntity<>(true, HttpStatus.OK);
        else  return new ResponseEntity<>(false, HttpStatus.CONFLICT);
    }
}
