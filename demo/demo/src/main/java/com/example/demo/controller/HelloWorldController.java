package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.HelloWorldService;

@RestController
public class HelloWorldController {

    private HelloWorldService helloworldService;

    @Autowired
    public HelloWorldController(HelloWorldService helloworldService) {
        this.helloworldService = helloworldService;
    }

    @ResponseBody
    @GetMapping
    public String index() {
        return helloworldService.getString();
    }
}