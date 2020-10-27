package com.spring.mongo.controller;

import com.spring.mongo.model.Login;
import com.spring.mongo.services.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

/**
 * Created by prkumar on 18/10/2020.
 */
@RestController
public class LoginController {

    @Autowired
    @Qualifier("loginService")
    private LoginService loginService;

    @GetMapping(value = "/user/login/{userName}")
    public Login login(@PathVariable("userName") String userName) {

        return loginService.getUserByUserName(userName);
    }

    @PostMapping(value = "/user/save")
    public Login saveUser(@RequestBody Login login) {
        return loginService.saveUser(login);
    }
}
