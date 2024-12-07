package com.knf.dev.librarymanagementsystem.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ShowBookController {

    @GetMapping("/showbooks")
    public String showBooks() {
        // Logic to fetch books (optional)
        // Return the view that displays the books list, like 'books.html'
        return "showbooks"; // assuming you have a Thymeleaf template for 'books.html'
    }
}
