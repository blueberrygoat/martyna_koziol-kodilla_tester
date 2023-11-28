package com.kodilla.spring.basic.spring_configuration.homework;

import java.time.LocalDate;
import java.time.LocalTime;

public class SUV implements Car {
    @Override
    public boolean hasHeadlightsTurnedOn(LocalTime localTime) {
        LocalTime timeOn = LocalTime.of(19, 59, 59);
        LocalTime timeOff = LocalTime.of(6, 0, 0);
        if (localTime.isAfter(timeOn)){
            return true;}
        else if (localTime.isBefore(timeOff)) {
            return true;}
        else{
            return false;
    }
}

    @Override
    public String getCarType() {
        return "SUV";
    }
}
