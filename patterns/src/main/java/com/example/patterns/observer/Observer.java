package com.example.patterns.observer;

public interface Observer {
    void update();

    void setSubject(Subject subject);
}
