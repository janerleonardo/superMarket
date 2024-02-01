package com.jan3r.supermarcket.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloWordController {
    @GetMapping("/hello")
    public String hello () {
        String name = "Jan3r";
        String format = String.format("Hello %s", name);
        return format;
    }
}
