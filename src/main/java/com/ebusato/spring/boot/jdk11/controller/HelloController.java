package com.ebusato.spring.boot.jdk11.controller;


import com.ebusato.spring.boot.jdk11.model.Greetings;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController(HelloController.ENDPOINT)
public class HelloController {

    public static final String ENDPOINT = "/hello";

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @GetMapping
    @ResponseBody
    public Greetings get(@RequestParam(required = false, defaultValue = "stranger") String name) {
        var actualCounter = counter.incrementAndGet();
        return new Greetings(actualCounter, String.format(template, name));
    }
}
