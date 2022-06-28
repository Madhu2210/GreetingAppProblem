package com.bridgelabz.GreetingApp.service;

import com.bridgelabz.GreetingApp.model.Greeting;

public interface IGreetingService {
    public String getMessage();

    public String getGreeting(Greeting greeting);

    Greeting greetingMessage(long getId);
}
