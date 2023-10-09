package com.example.patterns.adapter;

public class TelegramAdapter implements Notification {

    MessengerNotification messengerNotification;

    public TelegramAdapter(TelegramNotification telegramNotification) {
        this.messengerNotification = telegramNotification;
    }

    @Override
    public void send() {
        messengerNotification.dispatch();
    }
}
