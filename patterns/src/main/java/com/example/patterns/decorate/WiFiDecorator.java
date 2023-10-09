package com.example.patterns.decorate;

//done at runtime and add responsibilities to individual objects dynamically without affecting other objects.
public class WiFiDecorator extends BaseDecorator {
    public WiFiDecorator(Room room) {
        super(room);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + getDetail();
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 5;
    }

    public String getDetail() {
        return "+ Wifi ";
    }
}
