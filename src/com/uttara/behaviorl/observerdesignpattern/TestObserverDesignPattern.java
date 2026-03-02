package com.uttara.behaviorl.observerdesignpattern;

public class TestObserverDesignPattern {
    public static void main(String args[])
    {
        YouTubeChannel channel = new YouTubeChannel();

        Subscriber alice = new User("Alice");
        Subscriber bob = new User("Bob");

        channel.subscribe(alice);
        channel.subscribe(bob);

       channel.uploadVideo("Java OserverDesignPattern Pattern Explained");
    }
}
