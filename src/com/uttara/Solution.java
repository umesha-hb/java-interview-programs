package com.uttara;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;
import java.net.*;

class Result {

    /*
     * Complete the 'findCountry' function below.
     *
     * The function is expected to return a STRING_ARRAY.
     * The function accepts following parameters:
     *  1. STRING region
     *  2. STRING keyword
     * API URL: https://jsonmock.hackerrank.com/api/countries/search?region={region}&name={keyword}&page={page_no}
     */

    public static List<String> findCountry(String region, String keyword) {
	List<Country> al = new ArrayList<Country>();
	al.add(new Country("Andorra","EUROPIN"));
	al.add(new Country("Austria","EUROPIN"));
	al.add(new Country("Belgium","EUROPIN"));
	al.add(new Country("Cyprus","EUROPIN"));
	al.add(new Country("Estonia","EUROPIN"));
	al.add(new Country("Finland","EUROPIN"));
	al.add(new Country("France","EUROPIN"));
	List<String> al1  = al.stream().filter(e->e.getRegion().equalsIgnoreCase(region)).map(e->e.getName()).collect(Collectors.toList());
	
      return al1.stream().map(e->e.toLowerCase()).filter(e->e.contains(keyword)).collect(Collectors.toList());  
    }

}
class Country
{
	private String name;
	private String region;
	public Country(String name,String region) {
		this.name = name;
		this.setRegion(region);
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}
}
public class Solution {
    public static void main(String[] args) throws IOException {
     /*   BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(new File("one.txt")));
        System.out.println("Enter the Region");
        String region = bufferedReader.readLine();
        System.out.println("Enter the keyword list country under the Region");
        String keyword = bufferedReader.readLine();

        List<String> result = Result.findCountry(region, keyword);
System.out.println(result);
        bufferedWriter.write(
            result.stream()
                .collect(joining("\n"))
            + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();*/
		Employee emp = new Employee();
		emp.setName("Vaibhav");
		Map<Employee,String> map= new HashMap<>();
		map.put(emp,emp.getName());
		emp.setName("Sanjay");
		System.out.println(map.get(emp));

    }
}
class Employee
{
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Employee employee = (Employee) o;
		return this.name.equals(employee.getName());

	}

	@Override
	public int hashCode() {
		return name.length()<this.name.length() ? name.hashCode() : this.name.hashCode();
	}
}
