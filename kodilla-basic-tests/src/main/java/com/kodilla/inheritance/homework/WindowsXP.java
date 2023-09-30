package com.kodilla.inheritance.homework;

public class WindowsXP extends OperatingSystem {

    public WindowsXP(int year) {
        super(year);
    }

    @Override
    public void turnedOn() {
        System.out.println("WindowsXP is on");
    }
    @Override
    public void yearEdition() {
        System.out.println("First edition of WindowsXP was in " + getYear());
    }
}
