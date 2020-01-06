package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wangkang
 * @date 2020-01-06
 */
@RestController
public class WebController {

    @GetMapping("/hello")
    public String salutation() {
        return "Hello world!";
    }
}

