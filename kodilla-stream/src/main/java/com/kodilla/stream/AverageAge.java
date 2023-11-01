package com.kodilla.stream;

public class AverageAge {
    public static void main(String[] args) {
        double avg = UserRepository.getUsersList()   // [1]
                .stream()
                .mapToInt(n -> n.getAge())                 // [2]
                .average()                                 // [3]
                .orElse(0.0);                            // [4]
        System.out.println(avg);                      // [5]
    }
}
