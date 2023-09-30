package com.kodilla.abstracts.homework;

public class ShapeApplication {
    public static void main(String[] args) {
        Square square = new Square(5);
        System.out.println("The area of square is " + square.Area());
        System.out.println("The perimeter of square is " + square.Perimeter());

        Rectangle rectangle = new  Rectangle(15,20);
        System.out.println("The area of rectangle is " + rectangle.Area());
        System.out.println("The perimeter of rectangle is " + rectangle.Perimeter());

        Triangle triangle = new Triangle(15,20,20, 38);
        System.out.println("The area of triangle is " + triangle.Area());
        System.out.println("The perimeter of triangle is " + triangle.Perimeter());

    }
}

