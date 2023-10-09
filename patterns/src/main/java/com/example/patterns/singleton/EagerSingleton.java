package com.example.patterns.singleton;

public class EagerSingleton {
    private final static EagerSingleton instance = new EagerSingleton();

    private EagerSingleton() {
    }

    public static EagerSingleton getInstance() {
        return instance;
    }
}
