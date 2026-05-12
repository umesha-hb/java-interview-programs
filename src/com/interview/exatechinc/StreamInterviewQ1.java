package com.interview.exatechinc;

import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

public class StreamInterviewQ1 {

    static class Employee {
        private int id;
        private String name;
        private String department;
        private double salary;

        public Employee(int id, String name, String department, double salary) {
            this.id = id;
            this.name = name;
            this.department = department;
            this.salary = salary;
        }

        public String getDepartment() {
            return department;
        }

        public double getSalary() {
            return salary;
        }

        @Override
        public String toString() {
            return "Employee [id=" + id + ", name=" + name + ", department=" + department + ", salary=" + salary + "]";
        }

    }

    public static void main(String[] args) {

        List<Employee> employees = List.of(
                new Employee(1, "A", "IT", 70000),
                new Employee(2, "B", "HR", 50000),
                new Employee(3, "C", "IT", 90000),
                new Employee(4, "D", "FIN", -1000),
                new Employee(5, "E", "HR", 60000)
        );

        Map<String, Optional<Employee>> result = employees.stream()
                .collect(Collectors.groupingBy(e -> e.getDepartment(),
                                Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary))
                                )
                );
        System.out.println(result);

        Map<String, Employee> collect = employees.stream()
                .collect(Collectors.groupingBy(e -> e.getDepartment(),
                        Collectors.collectingAndThen(
                                Collectors.maxBy(Comparator.comparing(Employee::getSalary)),
                                Optional::get)
                ));
        System.out.println(collect);

        Map<String, Employee> collect1 = employees.stream()
                .collect(Collectors.toMap(e -> e.getDepartment(),
                        e->e, (e1, e2) -> e1.getSalary() > e2.getSalary() ? e1 : e2
                ));
        System.out.println(collect1);
    }
}


