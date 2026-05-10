package com.uttara.desginpatterns.structural.decorator;

/*
The Decorator Design Pattern is a structural design pattern used to add extra behavior or functionality
to an object dynamically without changing the original class.
 */
public class TestDecoraterPattern
{
    public static void main(String[] args)
    {
       Coffee coffee = new MilkDecorator(new SugarDecorator(new SimpleCoffee()));
        System.out.println(coffee.getDescription());
        System.out.println("Cost: " + coffee.getCost());


    }
}
