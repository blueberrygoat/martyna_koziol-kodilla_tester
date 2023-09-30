package com.kodilla.abstracts.homework;

public class Rectangle extends Shape {
    private int a;
    private int b;

    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double Area() {
        double area = a * b;
        return area;
    }

    @Override
    public double Perimeter() {
        double perimeter = 2 * (a + b);
        return perimeter;
    }
}

