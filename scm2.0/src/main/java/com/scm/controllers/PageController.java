package com.scm.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {


    @RequestMapping("/home")
    public String home(Model model){
        System.out.println("Home Page handler");
        
        // sending data to view
        model.addAttribute("name", "Substring tech");
        model.addAttribute("Collage", "Bits");
        model.addAttribute("GithubRepo", "https://github.com/Hussainjr/E_Commerce_SCM");

        return "home";
    }


}