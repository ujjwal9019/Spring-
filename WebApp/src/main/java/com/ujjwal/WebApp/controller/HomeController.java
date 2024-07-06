package com.ujjwal.WebApp.controller;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Component
public class HomeController {

    @RequestMapping("/")
    public String Hello(){
        return "Welcome home";
    }

    @RequestMapping("/about")
    public String about(){
        return "Welcome about";
    }

}
