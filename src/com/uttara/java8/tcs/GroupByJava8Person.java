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
		
		Map<String, List<Person>> groupByGenderList = 
                personList.stream().collect(Collectors.groupingBy(Person::getGender));
		//Group by gender List : Female-> Persons and Male -> Persons
        System.out.println("1. Group persons by gender - get result in List: ");
        System.out.println(groupByGenderList.toString());
//        personList.stream().collect(Collectors.groupingBy(e->e.getName(),Collectors.maxBy(Comparator.comparing(Person::getAge))));
        
        Map<String, Set<Person>> groupByGenderSet = 
                personList.stream().collect(Collectors.groupingBy(Person::getGender,Collectors.toSet()));
         
        //Group by gender Set: Female-> Persons and Male -> Persons
        System.out.println("2. Group persons by gender - get result in Set: ");
        System.out.println(groupByGenderSet.toString());
        
        //count the Number of male and femal employees
        Map<String, Long> countNumberOfMaleandFemaleEmployee
        = personList.stream().collect(Collectors.groupingBy(Person::getGender, Collectors.counting()));    
        System.out.println("3. Group person by gender and get name of person - get result in Set: ");
        System.out.println(countNumberOfMaleandFemaleEmployee);
        
        Map<String, Set<String>> groupByGenderAndFirstNameSet
        = personList.stream().collect(Collectors.groupingBy(Person::getGender, TreeMap::new,
                Collectors.mapping(Person::getName, Collectors.toSet())));    
        System.out.println("3. Group person by gender and get name of person - get result in Set: ");
        System.out.println(groupByGenderAndFirstNameSet.toString());
        
        Map<String, Optional<Person>> personByMaxAge = personList.stream().
                collect(Collectors.groupingBy(Person::getGender
                        ,Collectors.maxBy(Comparator.comparing(Person::getAge))));      
        System.out.println("5. Group person objects by gender and get person with max age: ");
        System.out.println(personByMaxAge.toString());
        
        Map<String, IntSummaryStatistics> groupPersonsByAge = personList.stream().
                collect(Collectors.groupingBy(Person::getGender
                        ,Collectors.summarizingInt(Person::getAge)));       
        System.out.println("6. Group person objects by gender and get age statistics: ");
        System.out.println(groupPersonsByAge.toString());
        IntSummaryStatistics malesAge = groupPersonsByAge.get("Male");
        System.out.println("Avgerage male age:"+ malesAge.getAverage());
        System.out.println("Max male age:"+ malesAge.getMax());
        System.out.println("Min male age:"+ malesAge.getMin());
        
        Double averageAge = personList
		        .stream()
		        .collect(Collectors.averagingInt(p -> p.age));
        System.out.println("averageAge:" +averageAge); 
        
        Integer sum = personList
		        .stream()
		       // .filter(p->p.age>20)
		        .collect(Collectors.summingInt(p -> p.age));
        System.out.println("sum : "+sum);
        
       Person p1 =   personList.stream().max(Comparator.comparing(e -> e.age)).get();
       System.out.println("Person Maximum Age"+p1.getAge());
       Person p2=   personList.stream().min(Comparator.comparing(e -> e.age)).get();
       System.out.println("Person Minimum Age"+p2.getAge());
        IntSummaryStatistics intSummaryStatistics = personList.stream().collect(Collectors.summarizingInt(p -> p.age));
        System.out.println("intSummaryStatistics : "+intSummaryStatistics);
    Person person =new Person("Vaibhav", 39, "male");
    
    Map<Person,String> map = new HashMap<>();
    map.put(person, person.getName());
   person.setName("Sanjay");
    System.out.println(map);
System.out.println("map.get(person) : "+map.get(person));//sanjay has code differnt thzt is the reason null



        String s1 = new String("Bangalore");
        String s2 = new String("Bangalore");
      s1.replace("Bangalore","Hyderabad");
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));
    
    
	}
}
