package com.kodilla.spring.basic.spring_configuration.homework;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.time.LocalTime;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CarFactoryTestSuite {
    @Test
    public void shouldReturnCorrectCarTypeForSeason() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_configuration.homework");
        Car car = (Car) context.getBean("choosingCar");

        String carType = car.getCarType();
        System.out.println(carType);

        List<String> carTypes = Arrays.asList("SUV", "Sedan", "Cabrio");
        assertTrue(carTypes.contains(carType));
    }
    @Test
    public void shouldTurningOffTheHeadlightsBetween6amAnd8pm() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_configuration.homework");
        Car car = (Car) context.getBean(Car.class);

        boolean result = car.hasHeadlightsTurnedOn(LocalTime.of(6,0,0));
        assertFalse(result);
    }
    @Test
    public void shouldTurningOnTheHeadlightsBetween8pmAnd6am() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_configuration.homework");
        Car car = (Car) context.getBean(Car.class);

        boolean result = car.hasHeadlightsTurnedOn(LocalTime.of(20,0,0));
        assertTrue(result);
    }
}
