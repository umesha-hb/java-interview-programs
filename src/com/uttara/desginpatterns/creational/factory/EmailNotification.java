package com.uttara.desginpatterns.creational.factory;

public class EmailNotification implements Notification {

	@Override
	public void notifyUser()
	{
	System.out.println("Sending a Email Notification");

	}

}
