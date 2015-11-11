package com.eugene.service;

import org.springframework.stereotype.Component;

/**
 * Created by DCLab on 11/11/2015.
 */
@Component
public class UserServiceImpl implements UserService {
    @Override
    public String getUserName(String userId) {
        if (userId.equals("1")) return "Eugene";
        return null;
    }

    @Override
    public String getUserEmail(String userId) {
        return "hello@outlook.com";
    }

    @Override
    public String getUserAge(String userId) {
        return "20";
    }

    @Override
    public String getUserGender(String userId) {
        return "male";
    }
}
