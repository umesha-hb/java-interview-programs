package com.uttara.creational.factorydesignpattern;

public class ClientCodeNotificationService {
    public static void main(String[] args)
    {
        NotificationFactory notificationFactory = new NotificationFactory();
        Notification notification = notificationFactory.createNotification("PUSH");
        notification.notifyUser();
    }
}
 