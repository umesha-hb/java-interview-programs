package com.uttara.creational.abstractFactorydesignpattern;

public class ConcreteFactoriesWindowsFactory implements AbstractFactoryGUIFactoryInterface {

	public Button createButton() {

		return new WindowsButton();
	}

	public Checkbox createCheckbox() {

		return new WindowsCheckbox();
	}

}
