package com.kodilla.collections.interfaces.homework;

public class Opel implements Car{
    int speed;

    public Opel(int speed) {
        this.speed = speed;
    }

    @Override
    public int getSpeed() {
        System.out.print("Opel's speed: ");
        return speed;
    }

    @Override
    public void increaseSpeed() {
        this.speed = this.speed + 25;
    }

    @Override
    public void decreaseSpeed() {
        this.speed = this.speed - 20;

    }
}
