package com.example.patterns.proxy;

public class DataBaseConnectionImpl implements DataBaseConnection {
    public DataBaseConnectionImpl() {
        System.out.println("Here, some heavy initial Configuration is done");
    }

    @Override
    public void connect() {
        System.out.println("DB Connected");
    }
}
