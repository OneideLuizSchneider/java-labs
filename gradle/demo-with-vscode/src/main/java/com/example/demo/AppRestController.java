package com.example.demo;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppRestController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/SomeThing")
    public SomeThing greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
        return new SomeThing(counter.incrementAndGet(), String.format(template, name));
    }
}
