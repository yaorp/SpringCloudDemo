package com.springcloud.ms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableEurekaClient
public class EurekaConsumerApplication
{
    public static void main( String[] args )
    {
        SpringApplication.run(EurekaConsumerApplication.class, args);
        System.out.println("【【EurekaConsumerApplication 启动成功】】");
    }

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
