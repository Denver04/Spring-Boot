package com.example.practice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.practice.model.User;
import com.example.practice.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/all-users")
    public List<User> getAllUser(){
        return userService.getAllUsers();
    }

    @GetMapping("/user/{age}")
    public User getUserByAge(@PathVariable int age){
        return userService.getUser(age);
    }

    @GetMapping("/users/{name}")
    public User getUserByAge(@PathVariable String name){
        return userService.getUserByName(name);
    }

    @PostMapping("/add-user")
    public void addUser(@RequestBody User user){
        userService.addUser(user);
    }
}
