package com.uttara.string.programs;

import java.io.Serializable;

public class DoubleCheckedLocking implements Cloneable, Serializable {
//
//    The volatile keyword ensures visibility of changes to variables across threads
//    and prevents instruction reordering.It does not provide atomicity.
//    It is used for simple flags and state variables shared between threads.
    private static volatile DoubleCheckedLocking instance;

    public static DoubleCheckedLocking getInstance() {
        if (instance == null) {
            synchronized (DoubleCheckedLocking.class) {
                if (instance == null) {
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

