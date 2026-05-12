package com.uttara.desginpatterns.creational.builder;

public class TestBuilderDesignPattern {
    public static void main(String[] args) {
        Pizza pizza = new Pizza.PizzaBuilder()
                .setDough("Thin Crust")
                .setSauce("Tomato Basil")
                .setTopping("Cheese & Pepperoni")
                .build();
        System.out.println(pizza);
    }
}

