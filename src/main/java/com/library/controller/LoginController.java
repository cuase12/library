package com.library.controller;

import org.springframework.stereotype.Controller;

@Controller
public class LoginController {

    @GetMapping("/login")
    public String login(){
        return "login";
    }

}