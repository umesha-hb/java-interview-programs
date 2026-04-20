package com.interview.hexware;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
/*
Snippet code
Solve using java 8 stream:
a. Find list of students whose first name starts with alphabet A
b. Group The Student By Department Names
c. Find all departments names
d. Find the count of student in each department
e. Find the list of students and sort them by their rank" Java "e.g.
 */

public class StudentTester {
    public static void main(String args[]){
        List<Student> list = Arrays.asList(
                new Student(1, "Rohit", "Mall", 30, "Male", "Mechanical Engineering", 2015, "Mumbai", 122),
                new Student(2, "Pulkit", "Singh", 56, "Male", "Computer Engineering", 2018, "Delhi", 67),
                new Student(3, "Ankit", "Patil", 25, "Female", "Mechanical Engineering", 2019, "Kerala", 164),
                new Student(4, "Satish Ray", "Malaghan", 30, "Male", "Mechanical Engineering", 2014, "Kerala", 26),
                new Student(5, "Roshan", "Mukd", 23, "Male", "Biotech Engineering", 2022, "Mumbai", 12),
                new Student(6, "Chetan", "Star", 24, "Male", "Mechanical Engineering", 2023, "Karnataka", 90),
                new Student(7, "Arun", "Vittal", 26, "Male", "Electronics Engineering", 2014, "Karnataka", 324),
                new Student(8, "Nam", "Dev", 31, "Male", "Computer Engineering", 2014, "Karnataka", 433),
                new Student(9, "Sonu", "Shankar", 27, "Female", "Computer Engineering", 2018, "Karnataka", 7),
                new Student(10, "Shubham", "Pandey", 26, "Male", "Instrumentation Engineering", 2017, "Mumbai", 98));

      /*
      a. Find list of students whose first name starts with alphabet A
       */
        List<Student> studentsWithA =
                list.stream()
                        .filter(s -> s.getFirstName().startsWith("A"))
                        .collect(Collectors.toList());
        System.out.println("studentsWithA="+studentsWithA);

        /*
        b. Group the students by department name
         */
        Map<String, List<Student>> studentsByDepartment =
                list.stream()
                        .collect(Collectors.groupingBy(Student::getDepartment));
        System.out.println("studentsByDepartment="+studentsByDepartment);

        /*
        c. Find all department names
         */
        List<String> departmentNames =
                list.stream()
                        .map(Student::getDepartment)
                        .distinct()
                        .collect(Collectors.toList());
        System.out.println("departmentNames="+departmentNames);

        /*
        d. Find the count of students in each department
         */
        Map<String, Long> studentCountByDepartment =
                list.stream()
                        .collect(Collectors.groupingBy(
                                Student::getDepartment,
                                Collectors.counting()
                        ));

        System.out.println("studentCountByDepartment="+studentCountByDepartment);

        /*
        e. Find the list of students and sort them by rank
         */
        List<Student> studentsSortedByRank =
                list.stream()
                        .sorted(Comparator.comparingInt(Student::getRank))
                        .collect(Collectors.toList());
        System.out.println("studentsSortedByRank="+studentsSortedByRank);


    }

}
class Student
{
private int id;
private String firstName;
    private String lastName;
    private int age;
    private String gender;
    private String department;
    private int year;
    private String city;
    private int rank;

    public Student(int id, String firstName, String lastName, int age, String gender, String department, int year, String city, int rank) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
        this.department = department;
        this.year = year;
        this.city = city;
        this.rank = rank;
    }

    public int getRank() {
        return rank;
    }

    public String getCity() {
        return city;
    }

    public int getYear() {
        return year;
    }

    public String getDepartment() {
        return department;
    }

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", department='" + department + '\'' +
                ", year=" + year +
                ", city='" + city + '\'' +
                ", rank=" + rank +
                '}';
    }
}
