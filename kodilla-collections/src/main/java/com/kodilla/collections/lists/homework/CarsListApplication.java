package com.kodilla.collections.lists.homework;

import com.kodilla.collections.arrays.homework.CarUtils;
import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Kia;
import com.kodilla.collections.interfaces.homework.Opel;

import java.util.ArrayList;
import java.util.List;




public class CarsListApplication {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Ford(120));
        cars.add(new Kia(150));
        cars.add(new Opel(130));

        for (Car car : cars) {
           CarUtils.describeCar(car);
        }

        cars.remove(1);

        Car opel = new Opel(130);
        cars.remove(opel);

        System.out.println("After remove:");
        for (Car car : cars) {
            CarUtils.describeCar(car);}
        System.out.println(cars.size());
    }
}
