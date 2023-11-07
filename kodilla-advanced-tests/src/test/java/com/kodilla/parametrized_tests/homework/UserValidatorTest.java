package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EmptySource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class UserValidatorTest {

    UserValidator userValidator = new UserValidator();

    @ParameterizedTest
    @ValueSource(strings = {"username","Username","user1","user.","User_1","-user","_-.." })
    public void shouldReturnTrueIfUsernameIsValid(String username){
        assertTrue(userValidator.validateUsername(username));
    }
    @ParameterizedTest
    @EmptySource
    @ValueSource(strings = {"us","","!user","?user","_-.$","u s e r" })
    public void shouldReturnFalseIfUsernameIsInvalid(String username){
        assertFalse(userValidator.validateUsername(username));
    }

    @ParameterizedTest
    @ValueSource(strings = {"email@gmail.com","email_2@com.pl","e.mail@com.pl", "e@kodilla.com"})
    public void shouldReturnTrueIfEmailIsValid(String email){
        assertTrue(userValidator.validateEmail(email));
}
    @ParameterizedTest
    @EmptySource
    @ValueSource(strings = {"email@.pl", "email_2@.pl", "em..ail@com.pl", "e mail@com.pl","email_1@@com.pl"})
    public void shouldReturnFalseIfEmailIsInvalid(String email) {
        assertFalse(userValidator.validateUsername(email));
    }
}