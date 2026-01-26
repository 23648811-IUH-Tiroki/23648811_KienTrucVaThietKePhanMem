package com.example.jwt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JwtResourceServerApplication {
    public static void main(String[] args) throws Exception {
        SpringApplication.run(JwtResourceServerApplication.class, args);
        System.out.println(
                com.example.jwt.util.JwtTokenService.generateToken()
            );
    }
}
