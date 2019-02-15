package com.example.controller;


import com.example.service.JoinService;
import com.example.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Controller
public class UsersController{

    @Autowired
    private JoinService joinService;

    @Autowired
    private LoginService loginService;

    public String JoinRequest(@RequestParam Map<String, String> paramMap){
        String userId = paramMap.get("user_id");
        String userPw = paramMap.get("user_pw");
        String userName = paramMap.get("user_name");
        String page = joinService.joinUser(userId, userPw, userName);
        return page;
    }

    public String loginRequest(@RequestParam Map<String, String> paramMap){
        String userId = paramMap.get("user_id");
        String userPw = paramMap.get("user_pw");

        String page = loginService.login(userId, userPw);

        return page;
    }
}
