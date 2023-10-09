package com.example.patterns.command;

// The Concrete Receiver implement the Receiver interface
public class Light implements Switchable {
    @Override
    public void turnOn() {
        System.out.println("The light turned on");
    }

    @Override
    public void turnOff() {
        System.out.println("The light turned off");
    }
}
