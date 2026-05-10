package com.uttara.immutable;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

final class Employee {
	private final String empName;
	private final int age;
	private final Address address;
	private final List<String> skills;
	private final LocalDate doDate;
	private final Map<String, String> h;

	public Employee(String name, int age, Address addr, List<String> skills, Map<String, String> h, LocalDate doDate) {
		this.empName = name;
		this.age = age;
		this.address = addr;
		this.skills = skills;
		this.doDate = doDate;
		this.h = h;
	}

	public String getEmpName() {
		return empName;
	}

	public int getAge() {
		return age;
	}

	/*
	 * public Address getAddress() { return address; }
	 */
	public Address getAddress() {
		Address address = new Address();
		address.setAddressLine1(address.getAddressLine1());
		address.setAddressLine2(address.getAddressLine2());
		address.setCity(address.getCity());

		return address;
	}

	public List<String> getSkills() {
		return new ArrayList<>(skills);
//			return skills;
	}

	public Map<String, String> getH() {
		return new HashMap<String, String>(h);
//		   return h;
	}

	

	public LocalDate getDoDate() {
		return doDate;
	}

	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", age=" + age + ", address=" + address + ",skills=" + skills + ",map="
				+ h + "," + "dob = " + doDate.getDayOfYear() + "-" + doDate.getDayOfYear() + "-" + doDate.getYear()
				+ "]";
	}

}
 class Address {

	private  String addressLine1;
	private  String addressLine2;
	private  String city;
	
	public String getAddressLine1() {
		return addressLine1;
	}
	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}
	public String getAddressLine2() {
		return addressLine2;
	}
	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Address [addressLine1=" + addressLine1 + ", addressLine2="
				+ addressLine2 + ", city=" + city + "]";
	}
}
