package com.springcloud.ms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

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
