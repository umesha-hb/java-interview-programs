package com.uttara.desginpatterns.creational.singleton;

public class SingleTon {

    private static SingleTon instance;

    private SingleTon() {
        // private constructor
    }

    public static SingleTon getInstance() {
        if (instance == null) {
            instance = new SingleTon();
        }

        return instance;
    }
}


class Tester {
    public static void main(String[] args) {
        SingleTon.getInstance();
    }
}

