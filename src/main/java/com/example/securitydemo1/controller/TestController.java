package com.example.securitydemo1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {

    @GetMapping("/index")
    public String index() {
        return "hello security";
    }

    @GetMapping("/test")
    public String test() {
        return "test";
    }
}
