package com.kodilla.stream;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class UserManagerTest {

    @Test
    public void testUsernameOfGroupChemists(){
        //given
        List<String> usernames = new ArrayList<>();
        usernames.add("Walter White");
        usernames.add("Gale Boetticher");
        //when
        List<String> result = UserManager.filterChemistGroupUsernames();
        //then
        assertEquals(usernames,result);
    }
    @Test
    public void testUserFilteredByAge(){
        //given
        List<User> users = new ArrayList<>();
        //when
        List<User> result = UserManager.filterUserAge(49);
        //then
        assertEquals(2,result.size());
    }
    @Test
    public void testUsernamesWithNonePosts(){
        //given
        List<String> usernames = new ArrayList<>();
        //when
        List<String> result = UserManager.filterNonePostsUsernames();
        //then
        assertEquals(2,result.size());
    }

}