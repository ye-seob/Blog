package com.example.Blog.controllers;

import com.example.Blog.dto.LoginDTO;
import com.example.Blog.dto.SignupDTO;
import com.example.Blog.repository.UserRepository;
import com.example.Blog.service.SignupServiece;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
@Slf4j
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private SignupServiece signupService;

    @PostMapping("/login")
    public String login(@RequestBody LoginDTO loginDTO){
        log.info(loginDTO.toString());
        return  "";
    }
    @PostMapping("/signup")
    public String signup( SignupDTO signupDTO){
        log.info( signupDTO.toString());

        signupService.signup(signupDTO);
        return "redirect:/login";
    }
}
