package com.example.patterns.decorate;

//done at runtime and add responsibilities to individual objects dynamically without affecting other objects.
public class BreakfastDecorator extends BaseDecorator {
    public BreakfastDecorator(Room room) {
        super(room);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + getDetail();
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 10;
    }

    public String getDetail() {
        return "+ Breakfast ";
    }
}
