package com.icely.myFirstApp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.ui.Model;

@Controller
public class MyController {

    @GetMapping("/")
    @ResponseBody
    public String getName(){
        return  "<h1 className='hello'> Hello World! This is my first line of statement </h1>";
    }

    @GetMapping("/home")
    public String world(Model model){
        model.addAttribute("message","First thymeleaf web application");
        return "home";
    }
}
