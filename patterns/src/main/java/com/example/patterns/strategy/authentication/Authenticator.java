package com.example.patterns.strategy.authentication;

// Define the context that uses the strategy
public class Authenticator {
    private AuthenticationStrategy authenticationStrategy;

    public Authenticator(AuthenticationStrategy authenticationStrategy) {
        this.authenticationStrategy = authenticationStrategy;
    }

    public void authenticate(String name, String password) {
        authenticationStrategy.authenticate(name, password);
    }
}
