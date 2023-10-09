package com.example.patterns.decorate;

public class BaseDecorator implements Room {
    protected Room room;

    public BaseDecorator(Room room) {
        this.room = room;
    }

    @Override
    public String getDescription() {
        return room.getDescription();
    }

    @Override
    public double getPrice() {
        return room.getPrice();
    }
}
