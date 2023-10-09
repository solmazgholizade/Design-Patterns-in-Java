package com.example.patterns.factory;

public class ShapeFactory {

    private Shape shape;

    public Shape createShape(ShapeType shapeType) {
        if (shapeType.name() == String.valueOf(ShapeType.CIRCLE)) {
            shape = new circle();
        } else if (shapeType.name() == String.valueOf(ShapeType.SQUARE)) {
            shape = new Square();
        }
        return shape;
    }
}
