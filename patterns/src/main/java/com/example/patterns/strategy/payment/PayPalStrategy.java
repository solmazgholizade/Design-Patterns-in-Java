package com.example.patterns.strategy.payment;

public class PayPalStrategy implements PaymentStrategy {
    @Override
    public void pay(double price) {
        System.out.println(price+"$ was paid by PayPal!");
    }
}
