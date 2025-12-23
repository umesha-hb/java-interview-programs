package com.uttara.builderdesignpattern;

// Step 1: The Product class
public class Pizza {
    private String dough;
    private String sauce;
    private String topping;

    // Private constructor to enforce object creation through Builder
    private Pizza(PizzaBuilder builder) {
        this.dough = builder.dough;
        this.sauce = builder.sauce;
        this.topping = builder.topping;
    }

    @Override
    public String toString() {
        return "Pizza [Dough=" + dough + ", Sauce=" + sauce + ", Topping=" + topping + "]";
    }

    // Step 2: The Builder class
    public static class PizzaBuilder {
        private String dough;
        private String sauce;
        private String topping;

        public PizzaBuilder setDough(String dough) {
            this.dough = dough;
            return this; // returning this for method chaining
        }

        public PizzaBuilder setSauce(String sauce) {
            this.sauce = sauce;
            return this;
        }

        public PizzaBuilder setTopping(String topping) {
            this.topping = topping;
            return this;
        }

        public Pizza build() {

            return new Pizza(this);
        }
    }
}
