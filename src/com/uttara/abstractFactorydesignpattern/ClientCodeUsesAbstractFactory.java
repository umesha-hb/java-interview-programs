package com.uttara.abstractFactorydesignpattern;

public class ClientCodeUsesAbstractFactory {
	private Button button;
    private Checkbox checkbox;

    ClientCodeUsesAbstractFactory(AbstracFactoryGUIFactoryInterface factory) {
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }
    void render() {
        button.paint();
        checkbox.paint();
    }
    public static void main(String[] args) {
        String s1 = new String("hello"); // new object in heap
        String s2 = s1.intern();         // reference from string pool
        String s3 = "hello";              // literal, also in string pool

        System.out.println(s2 == s3);     // true

        AbstracFactoryGUIFactoryInterface
                abstracFactoryGUIFactoryInterface = new ConcreteFactoriesMacFactory();
        ClientCodeUsesAbstractFactory abstractFactory
                = new ClientCodeUsesAbstractFactory(abstracFactoryGUIFactoryInterface);
        abstractFactory.render();

    }
}
