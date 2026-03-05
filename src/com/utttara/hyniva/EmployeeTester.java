package com.utttara.hyniva;

import java.util.*;
import java.util.stream.Collectors;

public class EmployeeTester {

	public static void main(String[] args) 
	{
//		Map<String,List<Employee>> hs =new HashMap<String,List<Employee>>();
		List<Employee> employeeList = new ArrayList<Employee>();
		employeeList.add(new Employee(1, "umesha", 20000,"CS"));
		employeeList.add(new Employee(1, "umesha1", 30000,"CS"));
		employeeList.add(new Employee(1, "umesha2", 40000,"ME"));
		employeeList.add(new Employee(1, "umesha4", 50000,"TE"));
		employeeList.add(new Employee(1, "umesha3", 60000,"EEE"));

		//secondHighestEmployeeSalary
		Employee secondHighest =
				employeeList.stream()
						.sorted(Comparator.comparing(Employee::getSalary).reversed())
						.skip(1)
						.findFirst()
						.orElse(null);
		System.out.println("secondHighest="+secondHighest);



		//avg
		 double avgSlaray =  employeeList.stream().
				 mapToDouble(e->e.getSalary()).average().orElse(0);
		 System.out.println("avgSlaray="+avgSlaray);

		double avgSlaray1 =  employeeList.stream()
				.collect(Collectors.averagingDouble(e->e.getSalary()));
		System.out.println("avgSlaray1="+avgSlaray1);


		 //sum
		 int sumOfSalary =   employeeList.stream().
				 mapToInt(e->e.getSalary()).sum();
		 System.out.println("sumOfSalary="+sumOfSalary);

		double sumOfSalary1 = employeeList.stream()
				.collect(Collectors.summingDouble(e->e.getSalary()));
		System.out.println(sumOfSalary1);

		//min
		 double minSalary = employeeList.stream()
				 .mapToDouble(e->e.getSalary()).min().orElse(0);
		 System.out.println("minSalary="+minSalary);

		 Employee minSalaryEmployee= employeeList.stream()
				 .collect(Collectors.minBy(Comparator.comparing(Employee::getSalary))).get();
		 System.out.println("minSalaryEmployee="+minSalaryEmployee);

		 //max
		 double maxSalary = employeeList.stream()
				 .mapToDouble(e->e.getSalary()).max().orElse(0);
		 System.out.println("maxSalary="+maxSalary);

		 Employee maxSalaryEmployee= employeeList.stream().
				 collect(Collectors.maxBy(Comparator.comparing(Employee::getSalary))).get();
	  	 System.out.println("maxSalaryEmployee="+maxSalaryEmployee);

		   //count
		long count = employeeList.stream().count();
		System.out.println(count);


	}

}

