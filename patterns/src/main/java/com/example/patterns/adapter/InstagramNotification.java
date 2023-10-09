package com.example.patterns.adapter;

public class InstagramNotification implements MessengerNotification {
    @Override
    public void dispatch() {
        System.out.println("instagram notification was sent");
    }
}
