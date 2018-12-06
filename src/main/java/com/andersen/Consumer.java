package com.andersen;

public class Consumer {
    private ServiceInterface serviceInterface;

    public String opinion(){
        return "Service was: " + serviceInterface.doSomething();
    }
}
