package org.example;

public class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        setLength(length);
        setWidth(width);
    }

    @Override
    public double calculateArea() {
        return length * width;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (length + width);
    }

    public void setLength(double length) {
        if (length > 0) {
            this.length = length;
        } else {
            System.out.println("Invalid length");
        }
    }

    public void setWidth(double width) {
        if (width > 0) {
            this.width = width;
        } else {
            System.out.println("Invalid width");
        }
    }
}
