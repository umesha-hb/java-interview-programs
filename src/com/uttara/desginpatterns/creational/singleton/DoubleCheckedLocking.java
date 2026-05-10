package com.uttara.desginpatterns.creational.singleton;

import java.io.Serializable;

public class DoubleCheckedLocking implements Cloneable, Serializable {
//
//    The volatile keyword ensures visibility of changes to variables across threads
//    and prevents instruction reordering.It does not provide atomicity.
//    It is used for simple flags and state variables shared between threads.
    //Without volatile, a thread might see a partially constructed object.
    private static volatile DoubleCheckedLocking instance;

//    Double Checked Locking
    public static DoubleCheckedLocking getInstance() {
        if (instance == null) {   // 1st check (no locking)
            synchronized (DoubleCheckedLocking.class) {
                if (instance == null) {  // 2nd check (with locking)
                    instance = new DoubleCheckedLocking();
                }
            }
        }
        return instance;
    }
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException("Singleton cannot be cloned");
    }


    // 🔑 Fix for deserialization
    protected DoubleCheckedLocking readResolve() {
        return instance;
    }
}

