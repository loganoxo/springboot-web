package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author logan
 */
@RestController
public class TestController {

    @GetMapping("/test")
    public String get() {
        return "test success";
    }

}
