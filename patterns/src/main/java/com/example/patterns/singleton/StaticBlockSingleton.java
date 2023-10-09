package com.example.patterns.singleton;

public class StaticBlockSingleton {
    private static StaticBlockSingleton instance;

    static {
        try {
            instance = new StaticBlockSingleton();
        } catch (Exception e) {
            throw new RuntimeException("Exception occurred in creating singleton instance");
        }
    }

    private StaticBlockSingleton() {
    }

    public static StaticBlockSingleton getInstance() {
        return instance;
    }
}
