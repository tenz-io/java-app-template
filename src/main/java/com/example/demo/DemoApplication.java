package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Component
    public static class MyComponent implements CommandLineRunner {

        @Value("${spring.application.name}")
        private String applicationName;

        @Override
        public void run(String... args) {
            System.out.println("Hello, " + applicationName + "!");
        }
    }

}
