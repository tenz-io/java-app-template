package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class RunnerTest {

    @Autowired
    Runner runner;

    @Test
    void run() {
        runner.run("arg1", "arg2");
    }
}