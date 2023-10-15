package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Kia;
import com.kodilla.collections.interfaces.homework.Opel;

import java.util.Random;

public class CarApplication {
    private static final Random RANDOM = new Random();

    public static void main(String[] args) {
        Random random = new Random();
        Car[] cars = new Car[random.nextInt(15) + 1];
        for (int n = 0; n < cars.length; n++)
            cars[n] = drawCar();
        for (Car car : cars)
            CarUtils.describeCar(car);
    }

    public static Car drawCar() {
        Random random = new Random();
        int drawnCar = RANDOM.nextInt(3);
        double speed = getRandomSpeed(random);
        if (drawnCar == 0)
            return new Ford((int) speed);
        else if (drawnCar == 1)
            return new Opel((int) speed);
        else {
            return new Kia((int) speed);
        }
    }

    private static double getRandomSpeed(Random random) {
        return RANDOM.nextDouble() * 100 + 100;
    }
}
