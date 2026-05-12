package com.uttara.desginpatterns.creational.abstractfactory;

public class TestAbstractFactoryDesignPattern {
	private Button button;
    private Checkbox checkbox;

    TestAbstractFactoryDesignPattern(AbstractFactoryGUIFactoryInterface factory) {
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
        TestAbstractFactoryDesignPattern abstractFactory
                = new TestAbstractFactoryDesignPattern(abstractFactoryGUIFactoryInterface);
        abstractFactory.render();

    }
}
