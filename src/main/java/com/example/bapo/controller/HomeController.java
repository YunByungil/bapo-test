package com.example.bapo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @Value("${my-env.first}")
    private String first;

    @Value("${my-env.second}")
    private Integer second;
    @GetMapping
    public String home() {
        System.out.println("first = " + first);
        System.out.println("second = " + second);
        return "index";
    }
}
