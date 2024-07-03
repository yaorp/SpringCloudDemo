package com.springcloud.ms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@EnableEurekaClient
public class EurekaProviderApplication
{
    public static void main( String[] args )
    {
        SpringApplication.run(EurekaProviderApplication.class, args);
        System.out.println("【【EurekaProviderApplication 启动成功】】");
    }
}
