package com.example.patterns.singleton;

public class LazySingleton implements Cloneable {
    private static LazySingleton instance;

    private LazySingleton() {
//        When someone wants to create an object through Reflection, this condition is checked!
        if (instance != null)
            throw new RuntimeException("Can't create instance. Please use getInsance() to create it.");
    }

    public static LazySingleton getInstance() {
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
//         When someone tries to make an instance by cloning, this condition is checked!
        if (instance != null) {
            throw new CloneNotSupportedException("Can't create instance. Please use getInsance() to create it.");
        }
        return super.clone();
    }
}
