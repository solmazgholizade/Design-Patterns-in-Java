package com.example.patterns.adapter;

public class TelegramNotification implements MessengerNotification{
    @Override
    public void dispatch() {
        System.out.println("telegram notification was sent");
    }
}
