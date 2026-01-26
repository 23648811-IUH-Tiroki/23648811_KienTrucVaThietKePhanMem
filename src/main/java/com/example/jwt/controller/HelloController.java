package com.example.jwt.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/public")
    public String publicApi() {
        return "Public API - no token needed";
    }

    @GetMapping("/secure")
    public String secureApi() {
        return "Secure API - JWT is valid";
    }
}
