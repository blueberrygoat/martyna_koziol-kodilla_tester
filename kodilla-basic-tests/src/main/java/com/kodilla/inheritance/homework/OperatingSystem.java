package com.kodilla.inheritance.homework;

public class OperatingSystem {
    private int year;

    public OperatingSystem(int year) {
        this.year = year;
    }

    public void turnedOn() {
        System.out.println("Windows is on");
    }

    public void turnedOff() {
        System.out.println("Windows is off");
    }

    public int getYear() {
        return year;
    }
    public void yearEdition(){
        System.out.println("First edition of Windows was in " + year);
    }
}
