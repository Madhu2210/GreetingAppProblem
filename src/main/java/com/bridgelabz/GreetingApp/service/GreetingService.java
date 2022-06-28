package com.bridgelabz.GreetingApp.service;

import com.bridgelabz.GreetingApp.model.Greeting;
import org.springframework.stereotype.Service;

@Service
public class GreetingService implements IGreetingService {

    @Override
    public String getMessage(){

        return "Hello World";
    }

    @Override
    public String getGreeting(Greeting greeting) {
        return greeting.toString();
    }
}
