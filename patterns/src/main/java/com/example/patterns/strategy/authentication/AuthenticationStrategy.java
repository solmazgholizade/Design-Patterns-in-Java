package com.example.patterns.strategy.authentication;

public interface AuthenticationStrategy {
    void authenticate(String name, String password);
}
