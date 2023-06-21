package com.example.testproject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello!";
    }

    @GetMapping("/hello/{id}")
    public String sayHello(@PathVariable long id) {
        if (id < 0) {
            return "ID is incorrect!";
        } else {
            return "Your request is processing!";
        }
    }
}
