package com.kodilla.optional.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Application {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Martyna", new Teacher("Janina")));
        students.add(new Student("Jagoda", null));
        students.add(new Student("Grzegorz", new Teacher("Małgorzata")));



        for (Student student: students) {
            String name = getTeacherName(student);

            System.out.println("uczeń:" + student.getName() + ", nauczyciel:" + name );
            
        }

    }

    public static String getTeacherName(Student student) {
        Optional<Teacher> optionalTeacher = Optional.ofNullable(student.getTeacher());
        String name = optionalTeacher.orElse(new Teacher("<undefined>")).getName();
        return name;
    }
}
