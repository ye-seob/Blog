package com.example.Blog.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.ToString;

@Entity
@AllArgsConstructor
@ToString
public class Users {
    @Id
    @GeneratedValue
    private Long id;
    @Column
    private String name;
    @Column
    private String userId;
    @Column
    private String password;


}
