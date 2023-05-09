package com.firstapp.rest.webservices.firstapprestwebservices;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {

    @GetMapping("/hello-world")
    public String HelloWorld()
    {
        return "Hello World again";
    }


    @GetMapping("/hello-world-bean")
    public HelloWorldBean HelloWorldBean()
    {

        return new HelloWorldBean("Hello World again");
    }
}