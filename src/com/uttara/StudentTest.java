package com.uttara;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StudentTest {

    public static void main(String[] args) {
        List<StudentTwo> al = new ArrayList<StudentTwo>();
        al.add(new StudentTwo("umesh", 25));
        al.add(new StudentTwo("umesh1", 26));
        al.add(new StudentTwo("umesh2", 24));
        Map<Integer, String> m = al.stream().collect(Collectors.toMap(s1 -> s1.getAge(), s1 -> s1.getName()));
        System.out.println(m);
    }

}

class StudentTwo {
    private String name;
    private int age;

    StudentTwo(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }


}
