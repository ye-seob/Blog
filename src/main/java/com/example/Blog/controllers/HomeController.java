package com.example.Blog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/login")
    public String loadLoginPage(){
        return "loginPage";
    }
    @GetMapping("/signup")
    public String loadSignupPage(){
        return "signupPage";
    }
}
