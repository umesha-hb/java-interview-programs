package com.uttara.java8.tcs;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.stream.Collectors;

import com.uttara.persistent.EmployeeObject;

public class GroupByJava8Person {
	public static void main(String args[]) {
		List<Person> personList = new ArrayList<Person>();
		personList.add(new Person("Sharon", 21, "Female"));
		personList.add(new Person("Maria", 18, "Female"));
		personList.add(new Person("Jack", 21, "Male"));
		personList.add(new Person("James", 35, "Male"));



        System.out.println("<============ Group persons by gender - get result in List:============>");
		Map<String, List<Person>> groupByGenderList = 
                personList.stream().
                        collect(Collectors.groupingBy(Person::getGender));
        System.out.println(groupByGenderList);


        System.out.println("=========Group persons by gender - get result in Set:===========>");
        Map<String, Set<Person>> groupByGenderSet =
                personList.stream().collect(Collectors.groupingBy(Person::getGender,
                        Collectors.toSet()));
        System.out.println(groupByGenderSet);

        System.out.println("<======= count the Number of male and female employees=============>");
         Map<String, Long> countNumberOfMaleandFemaleEmployee
        = personList.stream().collect(Collectors.groupingBy(Person::getGender,
                Collectors.counting()));
        System.out.println(countNumberOfMaleandFemaleEmployee);

        System.out.println("<=============Group person with max age:===========================>");
        Map<String, Optional<Person>> personByMaxAge = personList.stream().
                collect(Collectors.groupingBy(Person::getGender
                        ,Collectors.maxBy(Comparator.comparing(Person::getAge))));
        System.out.println(personByMaxAge.toString());

        System.out.println("<=========Group person objects by gender and get age statistics:=================>");
        Map<String, IntSummaryStatistics> groupPersonsByAge = personList.stream().
                collect(Collectors.groupingBy(Person::getGender
                        ,Collectors.summarizingInt(Person::getAge)));
        System.out.println(groupPersonsByAge.toString());


        System.out.println("<===========Avg==================>");
        IntSummaryStatistics malesAge = groupPersonsByAge.get("Male");
        System.out.println("Avgerage male age:"+ malesAge.getAverage());

        System.out.println("<==================Max======================>");
        System.out.println("Max male age:"+ malesAge.getMax());

        System.out.println("<==========Min=================>");
        System.out.println("Min male age:"+ malesAge.getMin());


        System.out.println("<====================averageAge=======================>");
        Double averageAge = personList
		        .stream()
		        .collect(Collectors.averagingInt(p -> p.age));
        System.out.println("averageAge:" +averageAge);

        System.out.println("<=================sum==================================>");
        Integer sum = personList
		        .stream()
		       // .filter(p->p.age>20)
		        .collect(Collectors.summingInt(p -> p.age));
        System.out.println("sum : "+sum);
        
       Person p1 =   personList.stream().max(Comparator.comparing(e -> e.age)).get();
       System.out.println("Person Maximum Age"+p1.getAge());
       Person p2=   personList.stream().min(Comparator.comparing(e -> e.age)).get();
       System.out.println("Person Minimum Age"+p2.getAge());
        IntSummaryStatistics intSummaryStatistics = personList.stream()
                .collect(Collectors.summarizingInt(p -> p.age));
        System.out.println("intSummaryStatistics : "+intSummaryStatistics);

    
	}
}
