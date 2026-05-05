package com.utttara.hyniva;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class HighestSalaryPaidEmployeeInEachDept {

    public static void main(String[] args) {
        Map<String, Employee> hs = new HashMap<String, Employee>();
        List<Employee> employeeList = new ArrayList<Employee>();
        employeeList.add(new Employee(1, "A", 20000, "CS"));
        employeeList.add(new Employee(2, "A1", 30000, "CS"));
        employeeList.add(new Employee(3, "B", 40000, "ME"));
        employeeList.add(new Employee(4, "B1", 70000, "ME"));
        employeeList.add(new Employee(5, "C", 50000, "TE"));
        employeeList.add(new Employee(6, "C1", 40000, "TE"));
        employeeList.add(new Employee(7, "D", 60000, "EEE"));
        employeeList.add(new Employee(8, "D1", 80000, "EEE"));
        // maxSalary

        Integer secondHighestSalary = employeeList.stream()
                .sorted(Comparator.comparing(Employee::getSalary).reversed())
                .skip(1)
                .findFirst().get().getSalary();
        System.out.println("secondHighestSalary"+secondHighestSalary);

        System.out.println("maxSalary");
        Employee maxSalary= employeeList.stream()
                .collect(Collectors.maxBy(Comparator.comparing(Employee::getSalary))).get();
        System.out.println(maxSalary);

        // group employee by Dept
        System.out.println("------------------");
        System.out.println("group employee by Dept wise");
        Map<String, List<Employee>> map =
                employeeList.stream()
                        .collect(Collectors.groupingBy(Employee::getDept));
       map.entrySet().stream().forEach(System.out::println);

        // department wise  groupby highestPaid employee
        System.out.println("------------------");
       System.out.println("group highestPaid employee by in each-dept");
        Map<String, Employee> highestPaidByDept =
                employeeList.stream()
                        .collect(Collectors.groupingBy(
                                e-> e.getDept(),
                                Collectors.collectingAndThen(
                                        Collectors.maxBy(
                                                Comparator.comparing(Employee::getSalary)),
                                        opt->opt.orElse(null)
                                )
                        ));
        highestPaidByDept.entrySet().stream().forEach(System.out::println);

        System.out.println("------------------");
        System.out.println("using Collectors.toMap");
        Map<String, Employee> highestPaidByDeptMap =
                employeeList.stream()
                        .collect(Collectors.toMap(
                                e-> e.getDept(),
                                e -> e,
                                (e1, e2) -> e1.getSalary() > e2.getSalary() ? e1 : e2
                        ));


        highestPaidByDeptMap.entrySet().stream().forEach(System.out::println);
    }

}

