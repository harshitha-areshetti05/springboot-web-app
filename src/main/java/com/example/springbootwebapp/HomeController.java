package com.example.springbootwebapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String homePage() {
        return "home"; // This maps to home.html
    }

    @GetMapping("/about")
    public String aboutPage() {
        return "about"; // This maps to about.html
    }
}
