package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class RunnerTest {

    @Test
    void run() {
        Runner runner = new Runner();
        runner.run("arg1", "arg2");
    }
}