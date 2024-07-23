package com.example.Blog.controllers;

import com.example.Blog.dto.LoginForm;
import com.example.Blog.dto.SignupForm;
import com.example.Blog.entity.Users;
import com.example.Blog.repository.UsersRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@Slf4j
public class UserController {
    @Autowired
    private UsersRepository usersRepository;

    @PostMapping("/login")
    public String login(LoginForm form){
        System.out.println(form.toString());
        return  "";
    }
    @PostMapping("/signup")
    public String login(SignupForm form){
        log.info(form.toString());

        Users user = form.toEntity();
        log.info(user.toString());

        Users saved  = usersRepository.save(user);
        log.info(saved.toString());
        return  "";
    }
}
