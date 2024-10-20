package com.example.demo.service;

import java.util.List;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Test;
import com.example.demo.repository.TestRepository;

@Service
public class HelloWorldService {
    private TestRepository repository;

    HelloWorldService(TestRepository repository) {
        this.repository = repository;
    }

    public String getString() {
        // List<EntityModel<Test>> employees = repository.findAll().stream() //
        // .map(assembler::toModel) //
        // .collect(Collectors.toList());

        List<Test> tests = repository.findAll();
        System.out.println(tests);

        return "HelloWorld!";
    }
}