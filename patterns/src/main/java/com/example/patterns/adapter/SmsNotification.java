package com.example.patterns.adapter;

public class SmsNotification implements Notification {
    @Override
    public void send() {
        System.out.println("sms notification was sent");
    }
}
