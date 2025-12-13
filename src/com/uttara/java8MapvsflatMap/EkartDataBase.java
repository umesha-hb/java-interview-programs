package com.uttara.java8MapvsflatMap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EkartDataBase {


    public static List<Customer> getAll() {
        return Stream.of(
                new Customer(101, "john", "john@gmail.com", Arrays.asList("397937955", "21654725"),"Umesha","HB",20001),
                new Customer(102, "smith", "smith@gmail.com", Arrays.asList("89563865", "2487238947"),"Cauvery","Raju",20001),
                new Customer(103, "peter", "peter@gmail.com", Arrays.asList("38946328654", "3286487236"),"Raju","CM",20001),
                new Customer(104, "kely", "kely@gmail.com", Arrays.asList("389246829364", "948609467"),"Janaki","V",10001)
        ).collect(Collectors.toList());
    }


}
