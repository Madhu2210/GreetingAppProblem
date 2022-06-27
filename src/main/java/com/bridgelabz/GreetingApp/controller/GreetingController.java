package com.bridgelabz.GreetingApp.controller;

import com.bridgelabz.GreetingApp.model.Greeting;
import com.bridgelabz.GreetingApp.service.IGreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class GreetingController {
    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

@Autowired
   private IGreetingService greeting;

    @GetMapping("/greeting")
    public Greeting greeting(@RequestParam(value="name", defaultValue ="world") String name) {
       return new Greeting((int) counter.incrementAndGet(),String.format(template,name));
    }

    @RequestMapping(value=("/hello"), method = RequestMethod.GET)
    public String hello(){
        String message= greeting.getMessage();
        return message;
    }
}
