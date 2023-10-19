package com.example.springbootprimary.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.springbootprimary.service.UserService;
import com.example.springbootprimary.util.Message;

import java.util.Map;

@RestController
@RequestMapping("/user")
//@CrossOrigin(origins = "*", maxAge = 3600)
public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping("/login")
    public Message login(@RequestBody Map<String, String> params) {
        return userService.login(params.get("username"), params.get("password"));
    }
}
