package com.uttara.desginpatterns.structural.decorator;

public class MilkDecorator extends CoffeeDecorator
{
    public MilkDecorator(Coffee coffee)
    {
        super(coffee);
    }

    public String getDescription()
    {
        return coffee.getDescription() + ", Milk";
    }

    public int getCost()
    {
        return coffee.getCost() + 20;
    }
}
