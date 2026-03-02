package com.uttara.creational.factorydesignpattern;

public class EmailNotification implements Notification {

	@Override
	public void notifyUser() {
	System.out.println("Sending a Email Notification");

	}

}
