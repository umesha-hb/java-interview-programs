package com.uttara.relection.example;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

class Person{
    private String name="unknown";
    private void greet()
    {
        System.out.println("Hello:"+name);
    }
}
public class ReflectionExample {
    public static void main(String args[]) throws Exception{
        Class<?> cls = Class.forName("com.uttara.relection.example.Person");
        Constructor<?> constructor = cls.getDeclaredConstructor();
        Object obj = constructor.newInstance();
        Field field =cls.getDeclaredField("name");
        field.setAccessible(true); // bypass private
        field.set(obj,"umesh");
        Method method = cls.getDeclaredMethod("greet");
        method.setAccessible(true);
        method.invoke(obj);
    }
}
