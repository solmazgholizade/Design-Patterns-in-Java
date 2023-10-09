package com.example.patterns.strategy.authentication;

public class AuthenticationStrategyTest {
    public static void main(String[] args) {
        Authenticator authenticator = new Authenticator(new DatabaseAuthenticationStrategy());
        authenticator.authenticate("databaseUser1", "pass");

        authenticator = new Authenticator(new LDAPAuthenticationStrategy());
        authenticator.authenticate("ldapUser1", "pass");

        //calling authenticate() without context class
        AuthenticationStrategy authenticationStrategy = new LDAPAuthenticationStrategy();
        authenticationStrategy.authenticate("ldapUser2", "pass");

       /* calling authenticate() without context class and
        with anonymous inner class*/
        AuthenticationStrategy databaseAuthenticationStrategy = new AuthenticationStrategy() {
            @Override
            public void authenticate(String name, String password) {
                System.out.println("Database: " + name + " was authenticated!");
            }
        };
        databaseAuthenticationStrategy.authenticate("databaseUser2", "pass");

       /* calling authenticate() without context class and
        with lambda */
        AuthenticationStrategy databaseAuthenticationStrategy2 = (name, password) -> System.out.println("Database: " + name + " was authenticated!");
        databaseAuthenticationStrategy2.authenticate("databaseUser33", "pass");
    }
}
