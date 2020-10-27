package com.spring.mongo.services;

import com.spring.mongo.model.Login;
import com.spring.mongo.repositories.LoginRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * Created by prkumar on 18/10/2020.
 */

@Service("loginService")
public class LoginService {

    @Autowired
    @Qualifier("loginRepository")
    private LoginRepository loginRepository;

    public Login getUserByUserName(String userName) {
        return loginRepository.getUserByUserName(userName);
    }

    public Login saveUser(Login login) {
        return loginRepository.save(login);
    }
}
