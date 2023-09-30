package com.kodilla.abstracts.homework;

public class Square extends Shape {
   private int a;
    public Square(int a) {
        this.a = a;
    }

    @Override
    public double Area() {
        double area = a * a;
        return area;
    }

    @Override
    public double Perimeter() {
        double perimeter = 4 * a;
        return perimeter;
    }
}