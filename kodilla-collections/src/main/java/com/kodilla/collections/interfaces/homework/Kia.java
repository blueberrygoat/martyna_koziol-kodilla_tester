package com.kodilla.collections.interfaces.homework;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Kia kia = (Kia) o;
        return speed == kia.speed;
    }

    @Override
    public int hashCode() {
        return Objects.hash(speed);
    }
}
