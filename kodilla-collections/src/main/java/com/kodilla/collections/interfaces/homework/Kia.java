package com.kodilla.collections.interfaces.homework;

public class Kia implements Car{
    int speed;
    public Kia(int speed) {
        this.speed = speed;
    }
    @Override
    public int getSpeed() {
        System.out.print("Kia's speed: ");
        return speed;
    }

    @Override
    public void increaseSpeed() {
        this.speed = this.speed + 23;

    }

    @Override
    public void decreaseSpeed() {
        this.speed = this.speed -14;

    }
}
