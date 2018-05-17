package com.company.figure;

public class Circle implements IFigure {

    private String smth = "ttt";

    public Circle(String smth) {
        this.smth = smth;
    }

    public Circle() {
    }

    @Override
    public String square() {
        return "Circle square";
    }

    @Override
    public String perimeter() {
        return "Circle perimeter";
    }

    public String getSmth() {
        return "tttt";
    }

    public void setSmth(String smth) {
        this.smth = smth;
    }
}
