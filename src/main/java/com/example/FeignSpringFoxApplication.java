package com.example;

import org.springframework.beans.BeansException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableFeignClients
@EnableSwagger2
public class FeignSpringFoxApplication implements ApplicationContextAware{

    public static void main(String[] args) {
        SpringApplication.run(FeignSpringFoxApplication.class, args);
    }

    @Override
    public void setApplicationContext(ApplicationContext ac) throws BeansException {
        //force the bean to get loaded as soon as possible
        ac.getBean("requestMappingHandlerAdapter");
    }
}
