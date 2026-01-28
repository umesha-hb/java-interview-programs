package com.uttara.java21;

public sealed  class Shape // sealed restrict further
        permits Circle, Rectangle{ //Only Circle and Rectangle can extend Shape.
}
 final class Circle extends Shape {} // cannot be extended further

non-sealed class Rectangle extends Shape {

}  // open for extension
 sealed interface Payment
        permits FakePayment {
}
final class FakePayment implements Payment {}


/*
Sealed types:
Control who can extend / implement
Work on inheritance hierarchy
 */

/*
Sealed classes and interfaces restrict which classes can extend or implement them, giving control over inheritance.
They are useful for enforcing business rules, improving security, and enabling exhaustive pattern matching.
Generics, on the other hand, provide type safety for data and do not control inheritance.
Therefore, sealed types and generics complement each other rather than replace one another.
 */