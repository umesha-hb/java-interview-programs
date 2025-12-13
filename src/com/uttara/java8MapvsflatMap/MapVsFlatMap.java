package com.uttara.java8MapvsflatMap;

import java.util.List;
import java.util.stream.Collectors;

public class MapVsFlatMap {
    public static void main(String[] args) {

        List<Customer> customers = EkartDataBase.getAll();

        //List<Customer>  convert List<String> -> Data Transformation
        //mapping : customer -> customer.getEmail()
        //customer -> customer.getEmail()  one to one mapping
        List<String> emails = customers.stream()
                .map(customer -> customer.getEmail().toUpperCase())
                .collect(Collectors.toList());
        System.out.println(emails);

//customer -> customer.getPhoneNumbers()  ->> one to many mapping
        //customer -> customer.getPhoneNumbers()  ->> one to many mapping
        List<List<String>> phoneNumbers = customers.
                stream().map(customer -> customer.getPhoneNumbers())
                .collect(Collectors.toList());
        System.out.println("phoneNumbers : "+phoneNumbers);

        //List<Customer>  convert List<String> -> Data Transformation
        //mapping : customer -> phone Numbers
        //customer -> customer.getPhoneNumbers()  ->> one to many mapping
        List<String> phones = customers.stream()
                .flatMap(customer -> customer.getPhoneNumbers().stream())
                .collect(Collectors.toList());
        System.out.println("phones : "+ phones);
        
        //get the database list of customer  Object  fullname = fristName+lastName   salary>20000

        List<String> emailsA = customers.stream().filter(e ->e.getSalary()>20000)
                .map(customer -> (customer.getFristName()+customer.getLastName()+":"+customer.getPhoneNumbers()) )
               .collect(Collectors.toList());
        emailsA.stream().forEach(System.out::println);
        
        System.out.println(emailsA);
    }
}
