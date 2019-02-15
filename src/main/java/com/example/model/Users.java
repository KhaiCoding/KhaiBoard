package com.example.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="users")

public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String userId;
    private String password;
    private String username;



}
