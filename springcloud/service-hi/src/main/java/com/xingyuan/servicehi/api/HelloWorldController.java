package com.xingyuan.servicehi.api;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HelloWorldController {

    @Value("${server.port}")
    private String port;

    @GetMapping(value = "/hello")
    public String hello() {
        return "Hello World";
    }

}
