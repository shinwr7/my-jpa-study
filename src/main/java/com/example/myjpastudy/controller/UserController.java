package com.example.myjpastudy.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/")
public class UserController {
    
    @GetMapping()
    public String getMethodName(@RequestParam String param) {
        return new String();
    }
    
}
