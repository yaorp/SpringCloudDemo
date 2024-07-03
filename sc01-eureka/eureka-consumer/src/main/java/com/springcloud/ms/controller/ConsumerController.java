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
public class ConsumerController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/helloWorld/{id}")
    public String helloWorld(@PathVariable String id) {
        return restTemplate.getForObject("http://localhost:9001/hello/" + id, String.class);
    }
}
