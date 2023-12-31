package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {
    @ParameterizedTest
    @MethodSource(value = "com.kodilla.parametrized_tests.homework.PersonSources#providePersonDataToCalculateBMI")
    void getBMI_ShouldReturnCorrectValue(Person person, String expected) {
        assertEquals(expected, person.getBMI());
    }
}