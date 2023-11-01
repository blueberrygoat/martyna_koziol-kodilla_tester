package com.kodilla.stream.homework;

import com.kodilla.stream.User;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class ForumStatsTest {
    @Test
    public void testAveragePostsOfUsersOver40() {
        List<User> users = new ArrayList<>();
        users.add(new User("Walter White", 50, 7, "Chemists"));
        users.add(new User("Jessie Pinkman", 25, 4648, "Sales"));
        users.add(new User("Tuco Salamanca", 34, 116, "Manager"));
        users.add(new User("Gus Firing", 49, 0, "Board"));

        double result = ForumStats.averagePostsOfUsersOver40(users);

        assertEquals(3.5, result, 0.001);
    }
    @Test
    public void testAveragePostsOfUsersUnder40() {
        List<User> users = new ArrayList<>();
        users.add(new User("Walter White", 50, 7, "Chemists"));
        users.add(new User("Jessie Pinkman", 25, 4648, "Sales"));
        users.add(new User("Tuco Salamanca", 34, 116, "Manager"));
        users.add(new User("Gus Firing", 49, 0, "Board"));

        double result = ForumStats.averagePostsOfUsersUnder40(users);

        assertEquals(2382, result, 0.001);

    }
    @Test
    public void testAveragePostsOfNoneUsersOver40() {
        List<User> users = new ArrayList<>();
        users.add(new User("Walter White", 12, 10, "Chemists"));
        users.add(new User("Jessie Pinkman", 39, 20, "Sales"));

        double result = ForumStats.averagePostsOfUsersOver40(users);

        assertEquals(0, result);
    }
    @Test
    public void testAveragePostsOfNoneUsersUnder40() {
        List<User> users = new ArrayList<>();
        users.add(new User("Walter White", 50, 7, "Chemists"));
        users.add(new User("Gus Firing", 49, 0, "Board"));

        double result = ForumStats.averagePostsOfUsersUnder40(users);

        assertEquals(0, result);
    }
}