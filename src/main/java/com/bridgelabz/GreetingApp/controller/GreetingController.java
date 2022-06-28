package com.bridgelabz.GreetingApp.controller;

import com.bridgelabz.GreetingApp.model.Greeting;
import com.bridgelabz.GreetingApp.service.IGreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@RestController
public class GreetingController {
    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @Autowired
    IGreetingService greetingService;

    @GetMapping("/greeting")
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "world") String name) {
        return new Greeting(counter.incrementAndGet(), String.format(template, name));
    }

    @RequestMapping(value = ("/hello"), method = RequestMethod.GET)
    public String hello() {
        String message = greetingService.getMessage();
        return message;
    }

    @PostMapping("/messages")
    public String get(@RequestBody Greeting greeting) {
        String getGreeting=greetingService.getGreeting(greeting);
        return getGreeting;
    }

    @GetMapping("/getMessage/{getId}")
    public Greeting getMessage(@PathVariable long getId)
    {
        Greeting greeting=greetingService.greetingMessage(getId);
        return greeting;
    }

    @GetMapping("/getGreeting")
    public List<Greeting> getMessages()
    {
        List<Greeting> greeting=greetingService.getGreetings();
        return greeting;
    }
}
