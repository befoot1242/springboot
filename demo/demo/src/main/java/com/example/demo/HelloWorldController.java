package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
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