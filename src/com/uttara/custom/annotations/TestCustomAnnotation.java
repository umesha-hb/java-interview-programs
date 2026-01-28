package com.uttara.custom.annotations;
/*

A custom annotation in Java is created using @interface,
controlled by meta-annotations like @Target and @Retention,
and processed using reflection or annotation processors.
 */

import java.lang.annotation.*;
import java.lang.reflect.*;  

public class TestCustomAnnotation {

	public static void main(String[] args) throws Exception {

		Method method = MyService.class.getMethod("process");
		if (method.isAnnotationPresent(LogExecutionTime.class)) {
			LogExecutionTime annotation =
					method.getAnnotation(LogExecutionTime.class);

			System.out.println("Value: " + annotation.value());
		}

	}

}

/*
A custom annotation lets you add metadata to Java code (classes, methods, fields, etc.) that can be:
Read at compile time
Or at runtime using reflection
 */
@Retention(RetentionPolicy.RUNTIME)  
@Target(ElementType.METHOD) 
@interface LogExecutionTime {
	String value() default "";
}  

class MyService {
	@LogExecutionTime("Service Method")
public void process(){ System.out.println("Processing...");}
}  