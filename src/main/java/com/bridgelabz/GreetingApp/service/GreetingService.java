package com.bridgelabz.GreetingApp.service;

import com.bridgelabz.GreetingApp.model.Greeting;
import com.bridgelabz.GreetingApp.repository.IGreetingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GreetingService implements IGreetingService {

    @Autowired
    IGreetingRepository repository;

    @Override
    public String getMessage(){

        return "Hello World";
    }

    @Override
    public String getGreeting(Greeting greeting) {
        repository.save(greeting);
        return greeting.toString();
    }

    @Override
    public Greeting greetingMessage(long getId){
        Optional<Greeting> greeting = repository.findById(getId);
        return greeting.get();

    }

    @Override
    public List<Greeting> getGreetings() {
        List<Greeting> greetings = repository.findAll();
        return greetings;
    }

    @Override
    public Greeting updateUserMessage(long getId, Greeting greeting) {
        Optional<Greeting> newGreeting = repository.findById(getId);
        if (newGreeting.isPresent()) {
            newGreeting.get().setMessage(greeting.getMessage());
            repository.save(newGreeting.get());
            return newGreeting.get();
        } else {
            return null;
        }
    }
}
