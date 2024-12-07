package com.knf.dev.librarymanagementsystem.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserDashboardController {

    @GetMapping("/userdashboard")
    public String userdashboard() {
        // Logic to fetch user-specific data (if needed)
        // Return the Thymeleaf template for the user dashboard
        return "userdashboard"; // assuming you have a Thymeleaf template named 'userdashboard.html'
    }
}
