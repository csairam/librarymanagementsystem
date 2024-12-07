package com.knf.dev.librarymanagementsystem.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

    // Redirect to /login page
    @GetMapping("/login")
    public String login() {
        return "login"; // Render login.html
    }
}
