package com.uttara.desginpatterns.behavioral.strategy;
/*
The Strategy Design Pattern is a behavioral design pattern that lets you define a family of algorithms,
put each one in a separate class, and make them interchangeable at runtime.
 */
public class TestStrategyDesignPattern
{
    public static void main(String args[])
    {
        ShoppingCart cart = new ShoppingCart();
        // Using Credit Card strategy
        cart.setPaymentStrategy(new CreditCardPayment());
        cart.checkout();

        // Switching to PayPal strategy at runtime
        cart.setPaymentStrategy(new PayPalPayment());
        cart.checkout();
    }
}
