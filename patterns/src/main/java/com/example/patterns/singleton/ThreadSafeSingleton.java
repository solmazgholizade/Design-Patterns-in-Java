package com.example.patterns.singleton;

public class ThreadSafeSingleton {
    private static ThreadSafeSingleton instance;

    public ThreadSafeSingleton() {
    }

//    public static synchronized ThreadSafeSingleton getInstance() {
//        if (instance == null) {
//            instance = new ThreadSafeSingleton();
//        }
//        return instance;
//    }

     public static ThreadSafeSingleton getInstance() {
        if (instance == null) {
            synchronized (ThreadSafeSingleton.class) {
                if (instance == null) {
                    instance = new ThreadSafeSingleton();
                }
            }
        }
        return instance;
    }
}
