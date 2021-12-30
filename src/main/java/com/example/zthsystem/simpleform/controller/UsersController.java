package com.example.zthsystem.simpleform.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UsersController {

    @GetMapping("/register_page")
    public String getRegisterPage(){
        return "register_page";
    }
    @GetMapping("/login_page")
    public String getLoginPage(){
        return "login_page";
    }
}
