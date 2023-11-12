package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

public class PersonSources {
    static Stream<Arguments> providePersonDataToCalculateBMI(){
        return Stream.of(
                Arguments.of(new Person(1.70, 40), "Very severely underweight"),
                Arguments.of(new Person(1.70, 60), "Normal (healthy weight)"),
                Arguments.of(new Person(1.70, 120), "Obese Class III (Very severely obese)"));
    }
}
