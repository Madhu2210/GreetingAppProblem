package com.bridgelabz.GreetingApp.service;

import org.springframework.stereotype.Service;

@Service
public class GreetingService implements IGreetingService {

    @Override
    public String getMessage(){
        return "Hello World";
    }
}
