package com.bridgelabz.GreetingApp.service;

import com.bridgelabz.GreetingApp.model.Greeting;

import java.util.List;

public interface IGreetingService {
    public String getMessage();

    public String getGreeting(Greeting greeting);

    Greeting greetingMessage(long getId);

    List<Greeting> getGreetings();

    Greeting updateUserMessage(long getId, Greeting greeting);
}
