package com.interview.cgi;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        ILibrarySystem library = new LibrarySystem();

        // Create Book 1
        IBook book1 = new Book();
        book1.setId(1);
        book1.setTitle("Java Basics");
        book1.setAuthor("James");
        book1.setCategory("Programming");
        book1.setPrice(500);

        // Create Book 2
        IBook book2 = new Book();
        book2.setId(2);
        book2.setTitle("Spring Boot");
        book2.setAuthor("Rod");
        book2.setCategory("Programming");
        book2.setPrice(700);

        // Create Book 3
        IBook book3 = new Book();
        book3.setId(3);
        book3.setTitle("Data Structures");
        book3.setAuthor("Mark");
        book3.setCategory("Computer Science");
        book3.setPrice(600);

        // Add Books
        library.addBook(book1, 2);
        library.addBook(book2, 3);
        library.addBook(book3, 1);

        // Remove Book
        library.removeBook(book2, 1); // remove 1 Spring Boot

        // 1. Total Price

        System.out.println("Total Price: " + library.calculateTotalPrice());

        // 2. Category-wise Total Price
        System.out.println("\nCategory Total Price:");
        Map<String, Integer> categoryPrice = library.getCategoryTotalPrice();
        for (String category : categoryPrice.keySet()) {
            System.out.println(category + " -> " + categoryPrice.get(category));
        }

        // 3. Books Info
        System.out.println("\nBooks Info:");
        List<BooksInfo> booksInfoList = library.booksInfo();
        for (BooksInfo info : booksInfoList) {
            System.out.println("Title: " + info.title +
                    ", Quantity: " + info.quantity +
                    ", Price: " + info.price);
        }

        // 4. Category + Author Count
        System.out.println("\nCategory + Author Count:");
        List<CategoryWithAuthorCount> list = library.categoryAndAuthorWithCount();
        for (CategoryWithAuthorCount item : list) {
            System.out.println("Category: " + item.category +
                    ", Author: " + item.author +
                    ", Count: " + item.count);
        }
    }
}
