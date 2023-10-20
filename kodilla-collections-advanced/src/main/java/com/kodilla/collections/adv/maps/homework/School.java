package com.kodilla.collections.adv.maps.homework;

import java.util.ArrayList;
import java.util.List;

public class School {
    private List<Integer> students = new ArrayList<>();
    private String schoolName;
    public School(String schoolName, List<Integer> students) {
        this.schoolName = schoolName;
        this.students = students;
    }
    public double getSum() {
        double sum = 0.0;
        for (double student : students)
            sum += student;
        return sum;}

    public String getSchoolName() {
        return schoolName;
    }

    @Override
    public String toString() {
        return "School{" +
                "students=" + students.toString() +
                ", schoolName='" + schoolName + '\'' +
                '}';
    }
}
