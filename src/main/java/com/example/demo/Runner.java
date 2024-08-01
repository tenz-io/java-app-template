package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Runner implements CommandLineRunner {

    @Value("${spring.application.name}")
    private String applicationName;

    private static final Logger logger = LoggerFactory.getLogger(DemoApplication.class);


    @Override
    public void run(String... args) {
        logger.info("Hello, {} with args: {}!", applicationName, args);
    }
}

