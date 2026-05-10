package com.uttara.desginpatterns.creational.abstractfactory;

public class ClientCodeUsesAbstractFactory {
	private Button button;
    private Checkbox checkbox;

    ClientCodeUsesAbstractFactory(AbstractFactoryGUIFactoryInterface factory) {
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }
    void render() {
        button.paint();
        checkbox.paint();
    }
    public static void main(String[] args) {
        AbstractFactoryGUIFactoryInterface
                abstractFactoryGUIFactoryInterface = new ConcreteFactoriesMacFactory();
        ClientCodeUsesAbstractFactory abstractFactory
                = new ClientCodeUsesAbstractFactory(abstractFactoryGUIFactoryInterface);
        abstractFactory.render();

    }
}
