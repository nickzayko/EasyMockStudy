package com.andersen;

public class MultiConsumer {

    private ServiceInterface firstService;
    private ServiceInterface secondService;

    public final String opinion(){
        return "Service was: " + firstService.doSomething() + " and " + secondService.doSomething();
    }
}
