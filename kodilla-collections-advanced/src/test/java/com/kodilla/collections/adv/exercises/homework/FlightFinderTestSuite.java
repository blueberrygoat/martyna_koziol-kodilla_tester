package com.kodilla.collections.adv.exercises.homework;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class FlightFinderTestSuite {
    @Test
    public void testFindingFlightsFrom() {
        //given
        FlightFinder flightFinder = new FlightFinder();
        flightFinder.findFlightsFrom("Katowice");
        //when
        List<Flight> result = flightFinder.findFlightsFrom("Katowice");
        //then
        assertEquals(3, result.size());
    }
    @Test
    public void testFindingFlightsTo() {
        //given
        FlightFinder flightFinder = new FlightFinder();
        flightFinder.findFlightsTo("Paryż");
        //when
        List<Flight> result = flightFinder.findFlightsTo("Paryż");
        //then
        assertEquals(2, result.size());
    }
}