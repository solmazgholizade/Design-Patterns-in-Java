package com.example.patterns.strategy.payment;

import java.util.ArrayList;
import java.util.List;

// Define the context that uses the strategy
public class ShoppingCart {
    List<Item> items;

    public ShoppingCart() {
        items = new ArrayList<>();
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void removeItem(Item item) {
        items.remove(item);
    }

    public double getTotalPrice() {
        double totalPrice = 0;
        for (Item item : items) {
            totalPrice += item.getItemPrice();
        }
        return totalPrice;
    }

    public void pay(PaymentStrategy paymentStrategy) {
        paymentStrategy.pay(getTotalPrice());
    }
}
