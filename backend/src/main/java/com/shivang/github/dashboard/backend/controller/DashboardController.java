package com.shivang.github.dashboard.backend.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:5173")
@RequestMapping("/api/v1/dashboard")
@RestController
public class DashboardController {

    @GetMapping("say-hello")
    public String sayHello() {
        return "Hello World!";
    }

}
