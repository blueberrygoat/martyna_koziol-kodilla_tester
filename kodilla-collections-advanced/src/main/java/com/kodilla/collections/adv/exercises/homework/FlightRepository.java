package com.kodilla.collections.adv.exercises.homework;

import java.util.ArrayList;
import java.util.List;

public class FlightRepository {
    public static List<Flight> getFlightsTable(){
        List<Flight> flights = new ArrayList<>();
        flights.add(new Flight("Katowice", "Londyn"));
        flights.add(new Flight("Londyn", "Paryż"));
        flights.add(new Flight("Katowice", "Oslo"));
        flights.add(new Flight("Warszawa", "Madryt"));
        flights.add(new Flight("Katowice", "Paryż"));
        return flights;
    }
}
