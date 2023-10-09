package com.example.patterns.strategy.payment;

public class Item {

    private String itemName;
    private double itemPrice;

    public Item(String itemName, double itemPrice) {
        this.itemName = itemName;
        this.itemPrice = itemPrice;
    }

    public double getItemPrice() {
        return itemPrice;
    }
}
