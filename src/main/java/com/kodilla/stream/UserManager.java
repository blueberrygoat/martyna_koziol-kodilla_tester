package com.kodilla.stream;

import java.util.List;
import java.util.stream.Collectors;

public class UserManager {
    public static void main(String[] args) {
        processUsersStream();
        List<String> chemistGroupUsernames = filterChemistGroupUsernames();
        System.out.println(chemistGroupUsernames);
        List<User> ageUser = filterUserAge(49);
        System.out.println(ageUser);
        List<String> nonePostsUsernames = filterNonePostsUsernames();
        System.out.println(nonePostsUsernames);

    }

    private static void processUsersStream() {
        UserRepository.getUsersList()
                .stream()
                .filter(user -> user.getGroup().equals("Chemists")) // [1]
                .map(UserManager::getUserName)
                .forEach(username -> System.out.println(username));
    }
    public static String getUserName(User user) {
        return user.getUsername();
    }
    public static List<String> filterChemistGroupUsernames() {
        List<String> usernames = UserRepository.getUsersList()   // [1]
                .stream()
                .filter(user -> user.getGroup().equals("Chemists"))
                .map(UserManager::getUserName)
                .collect(Collectors.toList());                      // [2]

        return usernames;
    }
    public static List<User> filterUserAge(int age) {
        List<User> users = UserRepository.getUsersList()
                .stream()
                .filter(user -> user.getAge() > age)
                .collect(Collectors.toList());
        return users;
    }
    public static List<String> filterNonePostsUsernames() {
        List<String> usernames = UserRepository.getUsersList()
                .stream()
                .filter(user -> user.getNumberOfPost() == 0)
                .map(UserManager::getUserName)
                .collect(Collectors.toList());
        return usernames;
    }
}




