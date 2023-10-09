package com.example.patterns.decorate;

public class SimpleRoom implements Room {

    @Override
    public String getDescription() {
        return "simple room ";
    }

    @Override
    public double getPrice() {
        return 20;
    }
}
