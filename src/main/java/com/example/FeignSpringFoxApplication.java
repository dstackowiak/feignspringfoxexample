package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableFeignClients
@EnableSwagger2
public class FeignSpringFoxApplication {

    public static void main(String[] args) {
        SpringApplication.run(FeignSpringFoxApplication.class, args);
    }
}
