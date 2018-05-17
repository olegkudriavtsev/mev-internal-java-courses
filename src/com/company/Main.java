package com.company;

import com.company.figure.Circle;
import com.company.figure.Rectangle;
import com.company.figure.Triangle;

public class Main {

    public static void main(String[] args) {
        Circle c1 = new Circle();
        Rectangle rectangle = new Rectangle();
        Triangle triangle = new Triangle();

        Calculator calculator = new Calculator();

        calculator.calculatePerimeter(c1);
        calculator.calculatePerimeter(rectangle);
        calculator.calculatePerimeter(triangle);

        calculator.calculateSquare(c1);
        calculator.calculateSquare(rectangle);
        calculator.calculateSquare(triangle);

    }



}
