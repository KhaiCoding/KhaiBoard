package com.example.service;


import com.example.model.Users;
import com.example.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;

@Service("LoginService")
public class LoginService{

    @Autowired
    private UserPasswordHashClass userPasswordHashClass;
    @Autowired
    private UsersRepository usersRepository;
    @Autowired
    HttpSession session;

    public String login(String userId, String userPw){
        if(userId.equals("")||userPw.equals("")){
            return "login";
        }

        String hashedPassword =userPasswordHashClass.getSHA256(userPw);
        System.out.println("도라이도라이도라이도라이");
        Users users = usersRepository.findByUserIdAndPassword(userId, hashedPassword);
        if(users==null){
            return "login";
        }

        session.setAttribute("loginUser", users);

        return "index";
    }
}
