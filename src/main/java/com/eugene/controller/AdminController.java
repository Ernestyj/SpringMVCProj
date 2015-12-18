package com.eugene.controller;

import com.eugene.model.Admin;
import com.eugene.service.AdminService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by DCLab on 12/17/2015.
 */
@Controller
@Api(value = "管理员模块")
@RequestMapping("/admins")
public class AdminController {
    @Autowired
    private AdminService adminService;

    @ApiOperation(value = "获取所有管理员", nickname = "获取所有管理员")
    @ResponseBody
    @RequestMapping(method = RequestMethod.GET)
    public List<Admin> getAdmins(){
        return adminService.getAdmins();
    }

}
