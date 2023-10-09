package com.example.patterns.adapter;

public class AdapterTest {

    public static void main(String[] args) {
        Notification emailNotification = new EmailNotification();
        sendUser(emailNotification);

        Notification smsNotification = new SmsNotification();
        sendUser(smsNotification);

        MessengerNotification instagramNotification = new InstagramNotification();
//        sendUser(instagramNotification); // Incompatible Type

        Notification instagramAdapter = new InstagramAdapter(new InstagramNotification());
        sendUser(instagramAdapter);

        Notification notification = new TelegramAdapter(new TelegramNotification());
        sendUser(notification);
    }

    public static void sendUser(Notification notification) {
        notification.send();
    }
}
