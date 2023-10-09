package com.example.patterns.strategy.payment;

public class CreditCardStrategy implements PaymentStrategy {
    @Override
    public void pay(double price) {
        System.out.println(price+"$ was paid by credit card!");
    }
}
