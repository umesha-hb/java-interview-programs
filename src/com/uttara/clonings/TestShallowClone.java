package com.uttara.clonings;

public class TestShallowClone {
    public static void main(String[] args) throws Exception {

        Employee e1 = new Employee(1, new Address("LA"));
        Employee e2 = (Employee) e1.clone();

        //shallow copy
        e2.address.city = "AT";
        System.out.println(e1.address.city);

        //deep copy
        EmployeeOne e3 = new EmployeeOne(1, new AddressOne("LA"));
        EmployeeOne e4 = (EmployeeOne) e3.clone();

        e4.address.city = "AT";

        System.out.println(e3.address.city);
    }
}

class EmployeeOne implements Cloneable {

    int id;
    AddressOne address;

    EmployeeOne(int id, AddressOne address) {
        this.id = id;
        this.address = address;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        //return super.clone(); // shallow copy
        EmployeeOne copy = (EmployeeOne) super.clone();
        copy.address = new AddressOne(this.address.city);
        return copy;
    }

}

class Employee implements Cloneable {

    int id;
    Address address;

    Employee(int id, Address address) {
        this.id = id;
        this.address = address;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone(); // shallow copy
    }
}
//shallow copy problem

class AddressOne {
    String city;

    AddressOne(String city) {
        this.city = city;
    }
}

class Address {
    String city;

    Address(String city) {
        this.city = city;
    }
}
