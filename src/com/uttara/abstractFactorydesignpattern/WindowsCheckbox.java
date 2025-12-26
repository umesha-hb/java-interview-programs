package com.uttara.abstractFactorydesignpattern;

//Concrete Products (Families)
//Windows Family
public class WindowsCheckbox implements Checkbox {

	public void paint() {
		System.out.println("Rendering Windows Checkbox");

	}

}
