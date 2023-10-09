package com.example.patterns.strategy.authentication;

public class LDAPAuthenticationStrategy implements AuthenticationStrategy {
    @Override
    public void authenticate(String name, String password) {
        System.out.println("LDAP: " + name + " was authenticated!");
    }
}
