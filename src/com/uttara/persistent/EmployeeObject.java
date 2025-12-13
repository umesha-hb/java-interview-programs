package com.uttara.persistent;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class EmployeeObject {
	private String name;
	private int age;
	private double salary;
 
	public EmployeeObject(String name, int age, double salary)
	{
		this.name = name;
		this.age = age;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public double getSalary() {
		return salary;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setSalary(double salary) { 
		this.salary = salary;
	}
 
	@Override
	public String toString() {
		return "EmployeeObject [name=" + name + ", age=" + age + "]";
	}

	public static void main(String[] args) {
		List<Pen> al =Arrays.asList(new Pen("red",32,"reynolds"),
				new Pen("yellow",32,"dot"),
				new Pen("green",33,"balpen"),
				new Pen("blue",53,"inkpen"));
		List<Pen> p = al.stream().filter(e->e.getBrand().equalsIgnoreCase("inkpen"))
				.filter(e->e.getPrice()>30||e.getPrice()<50).collect(Collectors.toList());
 p.stream().forEach(System.out::println);
	}

}
class Pen
{
	String colour;
	int price;
	String brand;
	public String getColour() {
		return colour;
	}
	public int getPrice() {
		return price;
	}
	public String getBrand() {
		return brand;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public Pen(String colour, int price, String brand) {
		super();
		this.colour = colour;
		this.price = price;
		this.brand = brand;
	}
	@Override
	public String toString() {
		return "Pen [colour=" + colour + ", price=" + price + ", brand=" + brand + "]";
	}
	
}
