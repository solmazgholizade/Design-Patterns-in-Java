package com.example.patterns.proxy;

//This proxy class creates heavy objects on demand and reuse them for all calls
public class DataBaseConnectionProxy implements DataBaseConnection {
    private DataBaseConnectionImpl dataBaseConnection;

    @Override
    public void connect() {
        if (dataBaseConnection == null) {
            dataBaseConnection = new DataBaseConnectionImpl();
        }
        dataBaseConnection.connect();
    }
}
