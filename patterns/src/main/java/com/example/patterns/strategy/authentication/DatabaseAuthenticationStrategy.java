package com.example.patterns.strategy.authentication;

public class DatabaseAuthenticationStrategy implements AuthenticationStrategy {
    @Override
    public void authenticate(String name, String password) {
        System.out.println("Database: "+name + " was authenticated!");
    }
}
