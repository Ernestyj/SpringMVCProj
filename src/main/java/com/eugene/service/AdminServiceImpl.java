package com.eugene.service;

import com.eugene.mapper.AdminMapper;
import com.eugene.model.Admin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by DCLab on 12/17/2015.
 */
@Service
public class AdminServiceImpl implements AdminService {
    @Autowired
    private AdminMapper adminMapper;

    @Override
    public List<Admin> getAdmins() {
        return adminMapper.getAdmins();
    }
}
