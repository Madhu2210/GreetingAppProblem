package com.bridgelabz.GreetingApp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Greeting {
    @Id
    @GeneratedValue
    private int id;
    private String message;

    public Greeting(int id, String message) {
        this.id = id;
        this.message = message;
    }

    public long getId() {

        return id;
    }

    public void setId(int id) {

        this.id = id;
    }

    public String getMessage() {

        return message;
    }

    public void setMessage(String message) {

        this.message = message;
    }

    public Greeting() {
    }

    @Override
    public String toString() {
        return "Greeting{" + "id" + id + ", messages='" + message + '\'' + '}';
    }
}
