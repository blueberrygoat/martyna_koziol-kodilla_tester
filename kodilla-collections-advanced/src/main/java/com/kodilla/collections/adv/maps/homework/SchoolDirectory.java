package com.kodilla.collections.adv.maps.homework;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SchoolDirectory {
    public static void main(String[] args) {
        Map<Principal, School> schoolDirectory = new HashMap<>();
        Principal principal1 = new Principal("John", "Stevenson");
        Principal principal2 = new Principal("Jessie", "Pinkman");
        Principal principal3 = new Principal("Bart", "Simpson");

        School school1 = new School("Princeton",Arrays.asList(15,20,30,18));
        School school2 = new School("Cambridge",Arrays.asList(19,23,28,20));
        School school3 = new School("Oxford",Arrays.asList(31,29,25,30));

        schoolDirectory.put(principal1,school1);
        schoolDirectory.put(principal2,school2);
        schoolDirectory.put(principal3,school3);

        for (Map.Entry<Principal,School> principalSchoolEntry : schoolDirectory.entrySet()){
            System.out.println(principalSchoolEntry.getKey().getFirstname() + " "
                    + principalSchoolEntry.getKey().getLastname() +" is principal of "
                    + principalSchoolEntry.getValue().getSum() + " students in "
                    + principalSchoolEntry.getValue().getSchoolName() + " University");
        }

    }
}
