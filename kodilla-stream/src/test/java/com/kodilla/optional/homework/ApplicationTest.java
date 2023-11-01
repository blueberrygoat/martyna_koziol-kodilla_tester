package com.kodilla.optional.homework;

import org.junit.jupiter.api.Test;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class ApplicationTest {
    @Test
    public void testGettingTeacherName() {
        //given
        Teacher teacher = new Teacher("Martyna");
        Student student = new Student("Jagoda",teacher);
        //when
        String name = Application.getTeacherName(student);
        //then
        assertEquals("Martyna", name);
    }
    @Test
    public void testNoTeacherName() {
        //given
        Student student = new Student("Jagoda",null);
        //when
        String name = Application.getTeacherName(student);
        //then
        assertEquals("<undefined>", name);
    }
}