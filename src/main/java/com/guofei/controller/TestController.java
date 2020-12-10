package com.guofei.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/exception/")
public class TestController {

    @RequestMapping("/serverError")
    public String serverError() {
        double d = 100 / 0;
        return "error" + d;
    }
}
