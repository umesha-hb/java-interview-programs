package com.uttara.java17;

/*
Java Records (Java 16+) are designed to model immutable data carriers—objects
 whose main purpose is to hold data, not behavior
 */
/*
Java Records are important because they provide a concise, immutable way to represent data-only objects.
In real-world scenarios like API responses, DTOs, or transaction objects, records eliminate boilerplate code,
 reduce bugs, and clearly express intent.
They improve readability, safety, and maintainability, especially in microservices and concurrent applications.
 */
public record BankAccount(
        String accountNumber,
        String holderName,
        double balance
) {}
