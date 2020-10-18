package com.binhtlt.cloudconfigcenterclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    @Value("${greeting.message: Hello world - Default}")
    private String greetingMessage;

    @RequestMapping("/greeting")
    public String greeting (){
        return greetingMessage;
    }
}
