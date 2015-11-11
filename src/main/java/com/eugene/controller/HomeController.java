package com.eugene.controller;

import com.eugene.service.HomeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.inject.Inject;

@Controller
public class HomeController {
    private HomeService homeService;

    @Inject
    public HomeController(HomeService homeService) {
        this.homeService = homeService;
    }

    @RequestMapping(value = {"/", "/home"}, method = RequestMethod.GET)
    public String showHomePage(ModelMap model) {
        model.addAttribute("message", homeService.getHomeMessage());
        return "home";
    }

}
