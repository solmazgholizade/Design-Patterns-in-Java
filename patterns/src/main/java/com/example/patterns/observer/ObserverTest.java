package com.example.patterns.observer;

public class ObserverTest {
    public static void main(String[] args) {
        StockMarket stockMarket = new StockMarket();

        StockBroker stockBroker1 = new StockBroker();
        StockBroker stockBroker2 = new StockBroker();

        stockMarket.registerObserver(stockBroker1);
        stockMarket.registerObserver(stockBroker2);

        stockBroker1.setSubject(stockMarket);
        stockBroker2.setSubject(stockMarket);


        System.out.println(stockBroker1.getStockDetail());
        stockMarket.setStockDetail("stock1", "oil", 100);
        System.out.println(stockBroker1.getStockDetail());


        System.out.println(stockBroker2.getStockDetail());
        stockMarket.setStockDetail("stock2", "agriculture", 100);
        System.out.println(stockBroker2.getStockDetail());
    }
}
