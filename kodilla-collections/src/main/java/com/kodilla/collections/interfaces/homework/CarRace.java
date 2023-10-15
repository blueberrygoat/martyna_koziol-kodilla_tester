package com.kodilla.collections.interfaces.homework;

public class CarRace {
    public static void main(String[] args) {
        Car ford = new Ford(120);
        doRace(ford);
        Car opel = new Opel(150);
        doRace(opel);
        Car kia = new Kia(130);
        doRace(kia);
    }

    public static void doRace(Car car){
        for(int i = 0; i < 3; i++) {
            car.increaseSpeed();
        }

        for(int i = 0; i < 2; i++){
            car.decreaseSpeed();
        }
        System.out.println(car.getSpeed());
    }
}
