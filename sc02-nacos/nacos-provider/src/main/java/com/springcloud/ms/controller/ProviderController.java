package com.springcloud.ms.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: yaorp
 */
@RestController
public class ProviderController {

    @GetMapping("/hello/{id}")
    public String hello(@PathVariable String id) {
         return "Hello, " + id;
    }
}
