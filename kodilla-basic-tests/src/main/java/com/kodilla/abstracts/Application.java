package com.kodilla.abstracts;

import com.kodilla.abstracts.homework.Rectangle;
import com.kodilla.abstracts.homework.Shape;
import com.kodilla.abstracts.homework.Square;
import com.kodilla.abstracts.homework.Triangle;

public class Application {
    public static void main(String[] args) {
        Animal dog = new Dog();

        AnimalProcessor processor = new AnimalProcessor();
        processor.process(dog);
    }
}
