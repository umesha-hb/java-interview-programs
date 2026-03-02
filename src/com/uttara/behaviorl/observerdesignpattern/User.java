package com.uttara.behaviorl.observerdesignpattern;

public class User implements Subscriber {

    private String name;

    public User(String name) {
        this.name = name;
    }

    public void update(String videoTitle) {
        System.out.println(name + " notified: New video -> " + videoTitle);
    }
}
