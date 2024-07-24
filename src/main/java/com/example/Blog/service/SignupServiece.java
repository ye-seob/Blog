package com.example.Blog.service;

import com.example.Blog.dto.SignupDTO;
import com.example.Blog.entity.UserEntity;
import com.example.Blog.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class SignupServiece {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;
    public void signup(SignupDTO signupDTO){
        UserEntity data = new UserEntity();

        data.setName(signupDTO.getName());
        data.setUserId(signupDTO.getUserId());
        data.setPassword(bCryptPasswordEncoder.encode(signupDTO.getPassword()));
        data.setRole("ROLE_USER");

        userRepository.save(data);
    }
}
