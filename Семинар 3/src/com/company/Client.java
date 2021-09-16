package com.company;

public class Client extends AbstractPerson {
    String service;
    float price;

    Client(String name) {
        super(name);
    }

    public String think() {
        return "Я есть власть";
    }

    public String getName(){
        return this.name;
    }
}