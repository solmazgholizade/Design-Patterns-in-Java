package com.example.patterns.observer;

import java.util.ArrayList;
import java.util.List;

public class StockMarket implements Subject {
    private List<Observer> observerList;
    private String stockName;
    private String stockDescription;
    private double stockPrice;

    public StockMarket() {
        this.observerList = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void unregisterObserver(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyObservers() {
        observerList.forEach(observer -> {
            observer.update();
            System.out.println("Observer notified !");
        });
    }

    @Override
    public String getStockDetail() {
        return this.stockName;
    }

    public void setStockDetail(String stockName, String stockDescription, double stockPrice) {
        this.stockName = stockName;
        this.stockDescription = stockDescription;
        this.stockPrice = stockPrice;
        notifyObservers();
    }
}
