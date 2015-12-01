package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestSpringFoxExemple {

    @Autowired
    private FeignClientExample feignClientExample;

    @RequestMapping("test" )
    public  TestClass getTestClass() {
        return feignClientExample.getTestClass();
    }
}
