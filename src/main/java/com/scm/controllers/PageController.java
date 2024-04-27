package com.scm.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {

    @RequestMapping("/home")
    public String home(Model model){
        model.addAttribute("heading", "Social Contact Management");
        model.addAttribute("developer", "Dravesh Singh");
        model.addAttribute("mobile", "+91780644242");
        model.addAttribute("email", "https://www.linkedin.com/in/draveshsingh");
        return "home";
    }
}
