package com.example.patterns.adapter;

public class EmailNotification implements Notification {
    @Override
    public void send() {
        System.out.println("email notification was sent");
    }
}
