package com.uttara.desginpatterns.creational.abstractfactory;

public class ConcreteFactoriesMacFactory implements AbstractFactoryGUIFactoryInterface {

	public Button createButton() {

		return new MacButton();
	}

	public Checkbox createCheckbox() {

		return new MacCheckbox();
	}

}
