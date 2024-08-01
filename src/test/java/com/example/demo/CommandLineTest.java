package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CommandLineTest {

    @Autowired
    CommandLine commandLine;

    @Test
    void run() {
        commandLine.run("arg1", "arg2");
    }
}