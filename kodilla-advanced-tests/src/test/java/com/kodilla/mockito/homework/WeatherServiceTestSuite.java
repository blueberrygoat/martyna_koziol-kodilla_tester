package com.kodilla.mockito.homework;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class WeatherServiceTestSuite {
    WeatherService weatherService = new WeatherService();
    UserWeather userWeather1 = Mockito.mock(UserWeather.class);
    UserWeather userWeather2 = Mockito.mock(UserWeather.class);
    UserWeather userWeather3 = Mockito.mock(UserWeather.class);

    Alert alert = Mockito.mock(Alert.class);


    @Test
    public void subscribedUserShouldReceiveAlertFromLocation() {
        weatherService.addSubscriber("Katowice", userWeather1);

        weatherService.sendAlertForLocation(alert, "Katowice");

        Mockito.verify(userWeather1).receive(alert);
    }
    @Test
    public void notSubscribedUserShouldNotReceiveAlertFromLocation() {
        weatherService.addSubscriber("Katowice", userWeather1);
        weatherService.sendAlertForLocation(alert, "Gliwice");

        Mockito.verify(userWeather1, Mockito.never()).receive(alert);
    }
    @Test
    public void testUnsubscribingFromLocation() {
        weatherService.addSubscriber("Katowice", userWeather1);
        weatherService.unsubscribeForLocation(userWeather1, "Katowice");
        weatherService.sendAlertForLocation(alert, "Katowice");

        Mockito.verify(userWeather1, Mockito.never()).receive(alert);
    }
    @Test
    public void testUnsubscribingFromAllLocation() {
        weatherService.addSubscriber("Katowice", userWeather1);
        weatherService.addSubscriber("Gliwice", userWeather1);
        weatherService.removeSubscription(userWeather1);
        weatherService.sendAlertForLocation(alert, "Katowice");
        weatherService.sendAlertForLocation(alert, "Gliwice");

        Mockito.verify(userWeather1, Mockito.never()).receive(alert);

    }
    @Test
    public void testReceivingGroupAlertForLocation() {
        weatherService.addSubscriber("Katowice", userWeather1);
        weatherService.addSubscriber("Katowice", userWeather2);
        weatherService.addSubscriber("Gliwice", userWeather3);

        weatherService.sendAlertForLocation(alert, "Katowice");
        Mockito.verify(userWeather3, Mockito.never()).receive(alert);
        Mockito.verify(userWeather1, Mockito.times(1)).receive(alert);
        Mockito.verify(userWeather2, Mockito.times(1)).receive(alert);

    }
    @Test
    public void testSendingAlertForAllUsers() {
        weatherService.addSubscriber("Katowice", userWeather1);
        weatherService.addSubscriber("Zabrze", userWeather2);
        weatherService.addSubscriber("Gliwice", userWeather3);

        weatherService.sendAlertForAllUsers(alert);

        Mockito.verify(userWeather1, Mockito.times(1)).receive(alert);
        Mockito.verify(userWeather2, Mockito.times(1)).receive(alert);


    }
    @Test
    public void testRemovingLocation() {
        weatherService.addSubscriber("Katowice", userWeather1);
        weatherService.addSubscriber("Gliwice", userWeather3);
        weatherService.removeLocation("Gliwice");
        Mockito.verify(userWeather3, Mockito.never()).receive(alert);
        }
    }