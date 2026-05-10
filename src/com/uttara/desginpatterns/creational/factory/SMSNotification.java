package com.uttara.desginpatterns.creational.factory;

public class SMSNotification implements Notification
{

	@Override
	public void notifyUser() {
		System.out.println("Sending a SMS notification");
		
	}

}
