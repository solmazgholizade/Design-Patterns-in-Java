package com.example.patterns.command;

// The Concrete Receiver implement the Receiver interface
public class Tv implements Switchable, VolumeControl {
    private int volume;

    @Override
    public void turnOn() {
        System.out.println("The tv turned on");
    }

    @Override
    public void turnOff() {
        System.out.println("The tv turned off");
    }

    @Override
    public void increaseVolume() {
        volume++;
        System.out.println("The volume of the tv increased");
        System.out.println("volume:" + volume);
    }

    @Override
    public void decreaseVolume() {
        volume--;
        System.out.println("The volume of the tv decreased");
        System.out.println("volume:" + volume);
    }
}
