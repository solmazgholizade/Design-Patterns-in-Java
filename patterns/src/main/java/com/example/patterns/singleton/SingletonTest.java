package com.example.patterns.singleton;

import java.lang.reflect.Constructor;

public class SingletonTest {

    public static void main(String[] args) {
        EagerSingleton eagerSingleton1 = EagerSingleton.getInstance();
        EagerSingleton eagerSingleton2 = EagerSingleton.getInstance();
        System.out.println(eagerSingleton1.hashCode());
        System.out.println(eagerSingleton2.hashCode());

        LazySingleton lazySingleton1 = LazySingleton.getInstance();
        LazySingleton lazySingleton2 = LazySingleton.getInstance();
        System.out.println(lazySingleton1.hashCode());
        System.out.println(lazySingleton2.hashCode());


//Using Reflection to Create Object
        LazySingleton instanceOne = LazySingleton.getInstance();
        LazySingleton instanceTwo = null;
        try {
            Constructor[] constructors = LazySingleton.class.getDeclaredConstructors();
            for (Constructor constructor : constructors) {
                // This code will destroy the singleton pattern
                constructor.setAccessible(true);
                instanceTwo = (LazySingleton) constructor.newInstance();
                break;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(instanceOne.hashCode());
        System.out.println(instanceTwo.hashCode());
    }
}
