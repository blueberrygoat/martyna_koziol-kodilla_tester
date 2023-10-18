package com.kodilla.collections.interfaces.homework;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ford ford = (Ford) o;
        return speed == ford.speed;
    }

    @Override
    public int hashCode() {
        return Objects.hash(speed);
    }
}
