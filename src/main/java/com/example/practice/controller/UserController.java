package com.example.practice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.practice.CustomAnnotation.annotation1;
import com.example.practice.model.User;
import com.example.practice.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/")
    @annotation1
    public List<User> getAllUser(){
        System.out.println("Fetching all users");
        return userService.getAllUsers();
    }

    @GetMapping("/age/{age}")
    public User getUserByAge(@PathVariable int age){
        return userService.getUser(age);
    }

    @GetMapping("/name/{name}")
    public User getUserByAge(@PathVariable String name){
        return userService.getUserByName(name);
    }

    @PostMapping("/add")
    public void addUser(@RequestBody User user){
        userService.addUser(user);
    }
}
