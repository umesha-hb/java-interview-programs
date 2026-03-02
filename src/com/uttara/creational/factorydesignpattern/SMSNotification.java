package com.uttara.creational.factorydesignpattern;

public class SMSNotification implements Notification
{

	@Override
	public void notifyUser() {
		System.out.println("Sending a SMS notification");
		
	}

}
