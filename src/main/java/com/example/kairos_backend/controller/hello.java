package com.example.kairos_backend.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class hello {
    @RequestMapping("/helloworld")
    public String test(){
        return "hello world!";
    }
}
