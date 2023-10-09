package com.example.patterns.adapter;

public class InstagramAdapter implements Notification {

    MessengerNotification messengerNotification;

    public InstagramAdapter(InstagramNotification instagramNotification) {
        this.messengerNotification = instagramNotification;
    }

    @Override
    public void send() {
        messengerNotification.dispatch();
    }
}
