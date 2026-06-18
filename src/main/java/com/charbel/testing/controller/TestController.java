package com.charbel.testing.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.Map;

@RestController
public class TestController {

    @GetMapping("/ping")
    public Map<String, String> ping() {
        return Collections.singletonMap("message", "pong");
    }

}
