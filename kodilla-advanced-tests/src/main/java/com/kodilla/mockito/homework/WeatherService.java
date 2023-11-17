package com.kodilla.mockito.homework;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class WeatherService {
    private Map<String, Set<UserWeather>> userWeathers = new HashMap<>();
    public void addSubscriber(String location, UserWeather userWeather){

            if(userWeathers.containsKey(location)){
                userWeathers.get(location).add(userWeather);
            } else {
                Set<UserWeather> users = new HashSet<>();
                users.add(userWeather);
                userWeathers.put(location, users);
            }
        }

    public void sendAlertForLocation(Alert alert, String location) {
        if(userWeathers.containsKey(location)){
            this.userWeathers.get(location).forEach(userWeather -> userWeather.receive(alert));
            }
        }

    public void sendAlertForAllUsers(Alert alert) {
        Set<UserWeather> allUsers = new HashSet<>();
        for (Set<UserWeather> users : userWeathers.values()){
            allUsers.addAll(users);
        }

        allUsers.forEach(userWeather -> userWeather.receive(alert));
    }
    public void unsubscribeForLocation(UserWeather userWeather, String location) {
        if(userWeathers.containsKey(location)){
            this.userWeathers.get(location).remove(userWeather);
        }
    }
    public void removeSubscription(UserWeather userWeather) {
        for (Set<UserWeather> users : userWeathers.values()){
            users.remove(userWeather);
        }
    }

    public void removeLocation(String location) {
        userWeathers.remove(location);
    }
}

