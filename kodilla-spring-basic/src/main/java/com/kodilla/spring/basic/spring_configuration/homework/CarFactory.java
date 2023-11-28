package com.kodilla.spring.basic.spring_configuration.homework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalTime;
import java.util.List;
import java.util.Random;
@Configuration
public class CarFactory {
    @Bean
    public Car choosingCar() {
        String[] seasons = {"Spring", "Summer", "Autumn", "Winter"};
        Random r = new Random();
        String season = seasons[r.nextInt(seasons.length)];
        System.out.println(season);

        Car car;
        if (season.equals("Summer")) {
            car = new Cabrio();
        } else if (season.equals("Winter")) {
            car = new SUV();
        } else {
            car = new Sedan();
        }
        return car;
    }
}

