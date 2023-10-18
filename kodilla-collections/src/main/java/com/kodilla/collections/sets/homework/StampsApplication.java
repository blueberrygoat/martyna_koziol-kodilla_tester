package com.kodilla.collections.sets.homework;

import com.kodilla.collections.sets.Order;

import java.util.HashSet;
import java.util.Set;

public class StampsApplication {
    public static void main(String[] args) {
        Set <Stamp> stamps = new HashSet<>();
        stamps.add(new Stamp("Rabbit",43.0,31.25,true));
        stamps.add(new Stamp("Book",39.5, 31.25, true));
        stamps.add(new Stamp("Shell",90.0,70.0,true));
        stamps.add(new Stamp("Flower",43.0, 31.25, false));
        stamps.add(new Stamp("Balloon",43.0, 31.25, false));
        stamps.add(new Stamp("Shell",90.0,70.0,true));
        stamps.add(new Stamp("Book",39.5, 31.25,true));

        System.out.println(stamps.size());
        for (Stamp stamp : stamps)
            System.out.println(stamp);
    }
}
