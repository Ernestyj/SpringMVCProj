package com.eugene.service;

/**
 * Created by DCLab on 11/11/2015.
 */
public interface UserService {
    String getUserName(String userId);
    String getUserEmail(String userId);
    String getUserAge(String userId);
    String getUserGender(String userId);
}
