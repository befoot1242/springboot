package com.example.demo;

import org.springframework.stereotype.Service;

@Service
public class HelloWorldService {

    public String getString() {
        return "HelloWorld!";
    }
}