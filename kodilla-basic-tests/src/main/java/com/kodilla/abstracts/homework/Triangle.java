package com.kodilla.abstracts.homework;

public class Triangle extends Shape {
    private int a;
    private int b;
    private  int c;
    private  int h;

    public Triangle(int a, int b, int c, int h) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.h = h;
    }

    @Override
    public double Area() {
        double area = (a * h)/2;
        return area;
    }

    @Override
    public double Perimeter() {
        int perimeter = (a + b + c);
        return perimeter;
    }
}

