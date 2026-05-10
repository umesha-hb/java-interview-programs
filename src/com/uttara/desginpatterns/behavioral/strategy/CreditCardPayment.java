package com.uttara.desginpatterns.behavioral.strategy;

public class CreditCardPayment implements PaymentStrategy
{
    @Override
    public void pay()
    {
        System.out.println("Paid Credit Card Amount");
    }
}
