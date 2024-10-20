package com.example.demo.initialLoader;

import com.example.demo.repository.TestRepository;
import com.example.demo.entity.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class LoadDatabase {

    private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

    @Bean
    CommandLineRunner initDatabase(TestRepository testRepository) {

        return args -> {
            for (int i = 0; i < 100; i++)
                testRepository.save(new Test("Frodo", "Baggins", "thief"));
            testRepository.save(new Test("Bilbo", "Baggins", "burglar"));
            testRepository.save(new Test("Frodo", "Baggins", "thief"));

            testRepository.findAll().forEach(employee -> log.info("Preloaded " + employee));

        };
    }
}
