package com.uttara.abstractFactorydesignpattern;

//Concrete Products (Families)
//Windows Family
public class WindowsButton implements Button {

	
	public void paint() {
		 System.out.println("Rendering Windows Button");

	}

}
