package com.utttara.hyniva;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class EmployeeTester {

	public static void main(String[] args) 
	{
		Map<String,List<Employee>> hs =new HashMap<String,List<Employee>>();
		List<Employee> employeeList = new ArrayList<Employee>();
		employeeList.add(new Employee(1, "umesha", 20000,"CS"));
		employeeList.add(new Employee(1, "umesha1", 30000,"CS"));
		employeeList.add(new Employee(1, "umesha2", 40000,"ME"));
		employeeList.add(new Employee(1, "umesha4", 50000,"TE"));
		employeeList.add(new Employee(1, "umesha3", 60000,"EEE"));
		hs.put("CS",employeeList);
		hs.put("EC",employeeList);
		hs.put("MECH",employeeList);
//		Map<Object, List<Employee>> cs =  employeeList.stream().filter(e->e.getDept().equals("CS")).collect(Collectors.groupingBy(e->e.getSalary()));
//		System.out.println(cs);  
		 double avgSlaray =  employeeList.stream().mapToDouble(e->e.getSalary()).average().orElse(0);   
		 System.out.println(avgSlaray);
		 double sumOfSalary =   employeeList.stream().mapToDouble(e->e.getSalary()).sum();
		 System.out.println(sumOfSalary);
		 double minSalary = employeeList.stream().mapToDouble(e->e.getSalary()).min().orElse(0);
		 System.out.println(minSalary);
		 double maxSalary = employeeList.stream().mapToDouble(e->e.getSalary()).max().orElse(0);
		 System.out.println(maxSalary);
		 double avgSlaray1 =  employeeList.stream().collect(Collectors.averagingDouble(e->e.getSalary()));
		 
		List<Employee> l =  employeeList.stream().filter(e->e.getSalary()>=50000&&e.getSalary()<=60000).sorted(Comparator.comparing(Employee::getName)).collect(Collectors.toList());
		 System.out.println("l : "+l);
		 
		 System.out.println(avgSlaray1);
		 
		 double sumOfSalary1 = employeeList.stream().collect(Collectors.summingDouble(e->e.getSalary()));
		 
		 System.out.println(sumOfSalary1);
		 Employee maxSalary1= employeeList.stream().collect(Collectors.maxBy(Comparator.comparing(Employee::getSalary))).get();
		 System.out.println(maxSalary1);
		 Employee minSalary1= employeeList.stream().collect(Collectors.minBy(Comparator.comparing(Employee::getSalary))).get();
		 System.out.println(minSalary1);
	}

}

