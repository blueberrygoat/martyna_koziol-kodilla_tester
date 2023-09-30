package com.kodilla.inheritance.homework;

public class Windows8 extends OperatingSystem {

    public Windows8(int year) {
        super(year);
    }

    @Override
    public void turnedOn() {
        System.out.println("Windows 8 is on");
    }
    @Override
    public void yearEdition() {
        System.out.println("First edition of Windows 8 was in " + getYear());
    }
    @Override
    public void turnedOff() {
        System.out.println("Windows 8 is off");
    }
}
