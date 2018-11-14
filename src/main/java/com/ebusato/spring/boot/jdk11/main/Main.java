package com.ebusato.spring.boot.jdk11.main;

import com.ebusato.spring.boot.jdk11.configuration.Configuration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main {

    public static void main(String[] args) {
        SpringApplication.run(Configuration.class, args);
    }
}
