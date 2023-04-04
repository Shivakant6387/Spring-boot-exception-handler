package com.example.springbootexception.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "User_INFO")
@Entity
@AllArgsConstructor(staticName = "build")
@NoArgsConstructor
@Data
public class User {
    @Id
    @GeneratedValue
    private int userId;
    private String userName;
    private String userEmail;
    private String gender;
    private String mobile;
    private int age;
    private String nationality;
}
