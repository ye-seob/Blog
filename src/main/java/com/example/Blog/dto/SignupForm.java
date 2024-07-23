package com.example.Blog.dto;

import com.example.Blog.entity.Users;
import lombok.AllArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@ToString
public class SignupForm {
    private String name;
    private String userId;
    private String password;

    public Users toEntity() {
        return  new Users(null,name, userId,password);
    }
}
