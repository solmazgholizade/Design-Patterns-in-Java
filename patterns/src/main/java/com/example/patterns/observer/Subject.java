package com.example.patterns.observer;

public interface Subject {
    void registerObserver(Observer observer);

    void unregisterObserver(Observer observer);

    void notifyObservers();

    String getStockDetail();
}
