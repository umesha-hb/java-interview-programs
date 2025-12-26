package com.uttara.abstractFactorydesignpattern;

public class ConcreteFactoriesWindowsFactory implements AbstracFactoryGUIFactoryInterface {

	public Button createButton() {
		return new WindowsButton();
	}

	public Checkbox createCheckbox() {
		return new WindowsCheckbox();
	}

}
