package com.example.Blog.controllers;

import com.example.Blog.dto.LoginForm;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {

    @PostMapping("/login")
    public String login(LoginForm form){
        System.out.println(form.toString());
        return  "";
    }
}
