package org.example;

public class Circle extends Shape {
    private double radius;
    private static final double PI = Math.PI;

    public Circle(double radius) {
        setRadius(radius);
    }

    @Override
    public double calculateArea() {
        return PI * Math.pow(radius, 2);
    }

    @Override
    public double calculatePerimeter() {
        return 2 * PI * radius;
    }

    public void setRadius(double radius) {
        if (radius > 0) {
            this.radius = radius;
        } else {
            System.out.println("Invalid radius");
        }
    }
}
