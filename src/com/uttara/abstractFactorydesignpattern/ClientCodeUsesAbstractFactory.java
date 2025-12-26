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
        AbstracFactoryGUIFactoryInterface
                abstracFactoryGUIFactoryInterface = new ConcreteFactoriesWindowsFactory();
        ClientCodeUsesAbstractFactory abstractFactory
                = new ClientCodeUsesAbstractFactory(abstracFactoryGUIFactoryInterface);
        abstractFactory.render();

    }
}
