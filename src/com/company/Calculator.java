package com.company;

import com.company.figure.IFigure;

public class Calculator {

    public String calculateSquare(IFigure figure) {
        System.out.println("Square");
        return figure.square();
    }

    public String calculatePerimeter(IFigure figure) {
        System.out.println("Perimeter");
        return figure.perimeter();
    }

}
