package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.springframework.stereotype.Component;

import java.awt.*;

@Component
public class Display {
    double display(double value) {
        System.out.println("Result: " + value);

        return value;
    }
}
