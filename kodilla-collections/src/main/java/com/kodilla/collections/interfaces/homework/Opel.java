package com.kodilla.collections.interfaces.homework;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Opel opel = (Opel) o;
        return speed == opel.speed;
    }

    @Override
    public int hashCode() {
        return Objects.hash(speed);
    }
}
