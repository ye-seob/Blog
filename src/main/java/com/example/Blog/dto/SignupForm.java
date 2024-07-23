package com.example.Blog.dto;

import com.example.Blog.entity.Users;

public class SignupForm {
    private String name;
    private String userId;
    private String password;

    public SignupForm(String name, String userId, String password) {
        this.name = name;
        this.userId = userId;
        this.password = password;
    }

    @Override
    public String toString() {
        return "SignupForm{" +
                "name='" + name + '\'' +
                ", userId='" + userId + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public Users toEntity() {
        return  new Users(null,name, userId,password);
    }
}
