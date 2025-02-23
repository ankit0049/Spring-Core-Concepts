package com.demo.springconcepts.controller;

import com.demo.springconcepts.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/greetings")
public class GreetingController {
    @Autowired
    GreetingService greetingService;
    @GetMapping
    public String getGreeting() {

        return greetingService.getGreetings();
    }

    @GetMapping("/{name}")
    public String getPersonalizedGreeting(@PathVariable String name) {
        return "Hello, " + name + "! Welcome to Spring Boot!";
    }
}  