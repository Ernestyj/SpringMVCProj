package com.eugene.controller;

import com.eugene.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.inject.Inject;

/**
 * Created by DCLab on 11/11/2015.
 */
@Controller
@RequestMapping("/user")
public class UserController {
    private final UserService userService;

    @Inject
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping(method = RequestMethod.GET)
    public String showUsers(@RequestParam("userid") String userId, ModelMap model){
        model.addAttribute("userName", userService.getUserName(userId));
        model.addAttribute("userEmail", userService.getUserEmail(userId));
        model.addAttribute("userAge", userService.getUserAge(userId));
        model.addAttribute("userGender", userService.getUserGender(userId));
        return "users";
    }

    @RequestMapping(method = RequestMethod.GET, params = "new")
    public String createUserProfile(ModelMap model){
        return "users_create";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String addUser(@RequestParam(value = "image", required = false) MultipartFile image){
        //TODO
        if (!image.isEmpty()) ;
        return "redirect:/user/" + "1";
    }

    @RequestMapping(value = "/{userId}", method = RequestMethod.GET)
    public String showUserProfile(@PathVariable String userId, ModelMap model){
        model.addAttribute("userName", userService.getUserName(userId));
        model.addAttribute("userEmail", userService.getUserEmail(userId));
        model.addAttribute("userAge", userService.getUserAge(userId));
        model.addAttribute("userGender", userService.getUserGender(userId));
        return "users";
    }
}
