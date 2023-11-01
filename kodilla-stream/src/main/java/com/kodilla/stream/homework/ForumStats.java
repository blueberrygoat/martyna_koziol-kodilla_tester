package com.kodilla.stream.homework;

import com.kodilla.stream.User;
import com.kodilla.stream.UserRepository;

import java.util.List;

public class ForumStats {
    public static double averagePostsOfUsersOver40(List<User> users ) {
        double average = users
                .stream()
                .filter(u -> u.getAge() >= 40)
                .mapToInt(n -> n.getNumberOfPost())
                .average()
                .orElse(0.0);
        return average;
    }

    public static double averagePostsOfUsersUnder40(List<User> users ) {
        double average = users
                .stream()
                .filter(u -> u.getAge() < 40)
                .mapToInt(n -> n.getNumberOfPost())
                .average()
                .orElse(0.0);
        return average;
    }

    public static void main(String[] args) {
        System.out.println(averagePostsOfUsersOver40(UserRepository.getUsersList()));
        System.out.println(averagePostsOfUsersUnder40(UserRepository.getUsersList()));
    }
}
