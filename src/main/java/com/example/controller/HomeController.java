package com.example.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpSession;

@Controller
public class HomeController {

    @Autowired
    private HttpSession session;

    @GetMapping("/")
    public String index(){
        return "index";
    }
    @GetMapping("/joinPage")
    public String joinPage(){
        return "join";
    }

    @GetMapping("/loginPage")
    public String loginPage(){
        return "login";
    }

    @GetMapping("/logout")
    public String logout(){
        session.invalidate();   // 현재 생성된 세션을 무효화
        return "index";
    }

    @GetMapping("/freeboardWritePage")
    public String freeboardWritePage(){
        return "freeboardWrite";
    }
    @GetMapping("/freeboard")
    public String freeboard(){
        return "freeboard";
    }
    @PostMapping("/joinRequest")
    public String JoinRequest(){
        return "index";
    }
    @PostMapping("/loginRequest")
    public String LoginRequest(){
        return "index";
    }


}
