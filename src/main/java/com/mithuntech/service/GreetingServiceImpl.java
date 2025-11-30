package com.mithuntech.service;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService {

    @Override
    public String greet(String name) {
        return "Hello " + name + ", welcome to Mithun Tech Training!";
    }
}
