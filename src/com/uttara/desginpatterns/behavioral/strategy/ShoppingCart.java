package com.uttara.desginpatterns.behavioral.strategy;

public class ShoppingCart
{
    private PaymentStrategy paymentStrategy;
    public void setPaymentStrategy(PaymentStrategy paymentStrategy)
    {
        this.paymentStrategy = paymentStrategy;
    }

    public void checkout()
    {
        if (paymentStrategy == null)
        {
            throw new IllegalStateException("Payment strategy not set");
        }
        paymentStrategy.pay();
    }
}
