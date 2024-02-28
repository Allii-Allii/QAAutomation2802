package org.example;

public class Square extends Shape {
    private double side;

    public Square(double side) {
        setSide(side);
    }

    @Override
    public double calculateArea() {
        return side * side;
    }

    @Override
    public double calculatePerimeter() {
        return 4 * side;
    }

    public void setSide(double side) {
        if (side > 0) {
            this.side = side;
        } else {
            System.out.println("Invalid side");
        }
    }
}
