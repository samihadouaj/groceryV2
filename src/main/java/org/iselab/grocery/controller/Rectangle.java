package org.iselab.grocery.controller;

public class Rectangle extends Shapes{
    double a,b;

    public Rectangle(String shape, double a, double b) {
        super(shape);
        this.a = a;
        this.b = b;
    }

    @Override
    public double calculateArea(double d) {
        return 0;
    }

    @Override
    public double calculateArea(double a, double b) {
        return a*b;
    }
}
