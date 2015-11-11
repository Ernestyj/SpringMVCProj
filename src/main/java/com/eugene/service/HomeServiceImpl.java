package com.eugene.service;

import org.springframework.stereotype.Component;

/**
 * Created by DCLab on 11/10/2015.
 */
@Component
public class HomeServiceImpl implements HomeService {
    @Override
    public String getHomeMessage() {
        return "This is home page.";
    }
}
