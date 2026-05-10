package com.uttara.desginpatterns.behavioral.observer;
/*
The Observer Design Pattern is a behavioral design pattern used when you want one object
to automatically notify multiple other objects whenever its state changes.
 */
public class TestObserverDesignPattern {
    public static void main(String args[])
    {
        YouTubeChannel channel = new YouTubeChannel();

        Subscriber alice = new User("Alice");
        Subscriber bob = new User("Bob");

        channel.subscribe(alice);
        channel.subscribe(bob);

       channel.uploadVideo("Java OserverDesignPattern Explained");
    }
}
