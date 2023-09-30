package com.kodilla.inheritance.homework;

import com.kodilla.inheritance.Car;

public class OperatingSystemMain {
    public static void main(String[] args) {
        OperatingSystem system = new OperatingSystem(1985);
        system.turnedOn();
        system.yearEdition();
        system.turnedOff();

        WindowsXP windowsXP = new WindowsXP(2001);
        windowsXP.turnedOn();
        windowsXP.yearEdition();
        windowsXP.turnedOff();

        Windows8 windows8 = new Windows8(2012);
        windows8.turnedOn();
        windows8.yearEdition();
        windows8.turnedOff();

    }
}
