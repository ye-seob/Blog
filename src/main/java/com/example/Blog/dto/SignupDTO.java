package com.example.Blog.dto;

import com.example.Blog.entity.UserEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@Setter
@ToString
public class SignupDTO {
    private String name;
    private String userId;
    private String password;

    public UserEntity toEntity() {
        return  new UserEntity();
    }
}
