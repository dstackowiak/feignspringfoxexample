package com.example;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("exemple")
public interface FeignClientExample {

    @RequestMapping(method = RequestMethod.GET, value = "/example")
    TestClass getTestClass();
}
