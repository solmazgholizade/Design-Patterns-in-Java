package com.example.patterns.factory;

public class FactoryTest {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape shape = shapeFactory.createShape(ShapeType.CIRCLE);
        shape.draw();
    }
}
