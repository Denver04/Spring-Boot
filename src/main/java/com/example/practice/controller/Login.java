package com.example.practice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Login {

    //This is another syntax.
    @ResponseBody
    @GetMapping("/login")
    public String LoggedIn(){
        return "Logged In....";
    }
}
