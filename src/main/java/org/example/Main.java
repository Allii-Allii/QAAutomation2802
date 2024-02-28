package org.example;

public class Main {
    public static void main(String[] args) {
        Shape square = new Square(5);

        double areaS = square.calculateArea();
        System.out.println("Square area is: " + areaS);

        double perimeterS = square.calculatePerimeter();
        System.out.println("Square perimeter is: " + perimeterS);



        Shape rectangle = new Rectangle(10, 5);

        double areaR = rectangle.calculateArea();
        System.out.println("Rectangle area is: " + areaR);

       double perimeterR = rectangle.calculatePerimeter();
        System.out.println("Rectangle perimeter is: " + perimeterR);


        Shape circle = new Circle(5.0);

        double areaC = circle.calculateArea();
        System.out.println("Circle area is: " + areaC);

        double perimeterC = circle.calculatePerimeter();
        System.out.println("Circle perimeter is: " + perimeterC);

    }
}