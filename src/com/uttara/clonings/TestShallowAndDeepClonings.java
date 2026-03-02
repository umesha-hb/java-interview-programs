package com.uttara.clonings;

public class TestShallowAndDeepClonings {
    public static void main(String[] args) throws Exception {
        //shallow copy
        ShallowClone e1 = new ShallowClone(1, new Address("LA"));
        ShallowClone e2 = (ShallowClone) e1.clone();
        e2.address.city = "AT";
        System.out.println(e1.address.city);

        //deep copy
        DeepClone e3 = new DeepClone(1, new Address("LA"));
        DeepClone e4 = (DeepClone) e3.clone();
        e4.address.city = "AT";
        System.out.println(e3.address.city);
    }
}

class DeepClone implements Cloneable {
    int id;
    Address address;
    DeepClone(int id, Address address) {
        this.id = id;
        this.address = address;
    }
    @Override
    protected Object clone() throws CloneNotSupportedException {
        //return super.clone(); // shallow copy
        DeepClone copy = (DeepClone) super.clone();
        copy.address = new Address(this.address.city);
        return copy;
    }
}

class ShallowClone implements Cloneable {
    int id;
    Address address;
    ShallowClone(int id, Address address) {
        this.id = id;
        this.address = address;
    }
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone(); // shallow copy
    }
}


class Address {
    String city;
    Address(String city) {
        this.city = city;
    }
}
