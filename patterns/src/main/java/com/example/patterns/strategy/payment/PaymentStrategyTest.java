package com.example.patterns.strategy.payment;

public class PaymentStrategyTest {
    public static void main(String[] args) {
        ShoppingCart shoppingCart = new ShoppingCart();
        Item item1 = new Item("item1", 40);
        Item item2 = new Item("item1", 30);
        shoppingCart.addItem(item1);
        shoppingCart.addItem(item2);
        shoppingCart.pay(new CreditCardStrategy());
        shoppingCart.pay(new PayPalStrategy());
    }
}
