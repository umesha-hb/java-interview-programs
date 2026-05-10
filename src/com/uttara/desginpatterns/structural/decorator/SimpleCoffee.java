package com.uttara.desginpatterns.structural.decorator;

public class SimpleCoffee implements Coffee{
    @Override
    public String getDescription()
    {
        return "Simple Coffee";
    }

    @Override
    public int getCost()
    {
        return 100;
    }
}
