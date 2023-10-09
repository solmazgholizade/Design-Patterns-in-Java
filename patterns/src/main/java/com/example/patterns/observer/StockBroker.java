package com.example.patterns.observer;

public class StockBroker implements Observer {

    private Subject subject;
    private String stockDetail;

    @Override
    public void update() {
        this.stockDetail = subject.getStockDetail();
    }

    @Override
    public void setSubject(Subject subject) {
        this.subject = subject;
        this.stockDetail = "No data";
    }

    public String getStockDetail() {
        return stockDetail;
    }
}
