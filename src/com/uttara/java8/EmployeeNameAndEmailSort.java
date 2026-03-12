package com.uttara.java8;



import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeNameAndEmailSort {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("John", "john@gmail.com"),
                new Employee("Alice", "alice@yahoo.com"),
                new Employee("John", "john@company.com"),
                new Employee("Bob", "bob@gmail.com")
        );

        List<Employee> sortedList = employees.stream()
                .sorted(Comparator
                        .comparing(Employee::getName)
                       )
                .collect(Collectors.toList());

       sortedList.forEach(System.out::println);
    }
}

class Employee {
    private String name;
    private String email;

    public Employee(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return name + " - " + email;
    }

}
