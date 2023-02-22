package com.example.kairos_backend.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/controller")

public class test {
    @RequestMapping("/test")
    public String hello() {
        return "hello world!";
    }
}
