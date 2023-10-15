package com.kodilla.collections.interfaces.homework;

public class Ford implements Car{
    int speed;

    public Ford(int speed){
        this.speed = speed;
    }

    @Override
    public int getSpeed() {
        System.out.print("Ford's speed: ");
        return speed;
    }

    @Override
    public void increaseSpeed() {
        this.speed = this.speed + 20;
    }

    @Override
    public void decreaseSpeed() {
        this.speed = this.speed - 15;
    }
}
