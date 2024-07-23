package com.example.Blog.dto;

public class LoginForm {
    private String userId;
    private String password;

    public LoginForm(String userId, String password) {
        this.userId = userId;
        this.password = password;
    }

    @Override
    public String toString() {
        return "LoginForm{" +
                ", userId='" + userId + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
