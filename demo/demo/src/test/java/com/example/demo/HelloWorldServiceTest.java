package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.service.HelloWorldService;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class HelloWorldServiceTest {

    private final HelloWorldService helloWorldService;

    @Autowired
    public HelloWorldServiceTest(HelloWorldService helloworldService) {
        this.helloWorldService = helloworldService;
    }

    @Test
    void Service_HelloWorldが取得されることを確認() throws Exception {
        String result = helloWorldService.getString();
        assertThat(result).isEqualTo("HelloWorld!");
    }
}
