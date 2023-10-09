package com.example.patterns.decorate;

//done at compile time and it’s applicable to all the instances of the class.
public class RoomWithWifi extends SimpleRoom {
    @Override
    public String getDescription() {
        return super.getDescription() + getDetail();
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 5;
    }

    public String getDetail() {
        return "+ Wifi";
    }
}
