package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;


class GamblingMachineTest {
    GamblingMachine gamblingMachine = new GamblingMachine();

    @ParameterizedTest
    @CsvFileSource(resources = "/numbersOutOfDeclaredScope.csv",numLinesToSkip = 0)
    public void shouldThrowsExceptionWhenNumbersOutOfDeclaredScope(String input) {
        Set<Integer> numbers = transformToInt(input);
        assertThrows(InvalidNumbersException.class, () -> gamblingMachine.howManyWins(numbers));
    }
    @ParameterizedTest
    @CsvFileSource(resources = "/notCorrectSize.csv", numLinesToSkip = 0)
    public void shouldThrowsExceptionWhenWrongSizeNumbers(String input) {
        Set<Integer> numbers = transformToInt(input);
        assertThrows(InvalidNumbersException.class, () -> gamblingMachine.howManyWins(numbers));
    }
    @ParameterizedTest
    @CsvFileSource(resources = "/validateNumbers.csv", numLinesToSkip = 0)
    public void shouldNotThrowsExceptionWhenValidateNumbers(String input) {
        Set<Integer> numbers = transformToInt(input);
        assertDoesNotThrow(() -> gamblingMachine.howManyWins(numbers));
    }
    private Set<Integer> transformToInt(String input) {
        Set<Integer> numberInput = Arrays.stream(input.split(","))
                .map(n -> Integer.parseInt(n))
                .collect(Collectors.toSet());
        return numberInput;
    }
}