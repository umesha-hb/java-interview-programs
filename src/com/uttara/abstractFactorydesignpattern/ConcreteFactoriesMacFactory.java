package com.uttara.abstractFactorydesignpattern;

public class ConcreteFactoriesMacFactory implements AbstracFactoryGUIFactoryInterface {

	public Button createButton() {
		 return new MacButton();
	}

	public Checkbox createCheckbox() {
		return new MacCheckbox();
	}

}
