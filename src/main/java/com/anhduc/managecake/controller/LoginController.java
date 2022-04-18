package com.anhduc.managecake.controller;

import com.anhduc.managecake.reponsitory.RoleReponsitory;
import com.anhduc.managecake.reponsitory.UserReponsitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Role;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {
    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;
    @Autowired
    UserReponsitory userReponsitory;
    @Autowired
    RoleReponsitory roleReponsitory;

    @GetMapping("/login")
    public String login(){
        return "login";
    }
    @GetMapping("/register")
    public String registerGet(){
        return "register";
    }
}
