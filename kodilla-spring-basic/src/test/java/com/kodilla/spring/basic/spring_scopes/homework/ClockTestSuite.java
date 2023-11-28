package com.kodilla.spring.basic.spring_scopes.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ClockTestSuite {
    @Test
    public void shouldCreateDifferentTimes() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Clock clockBean1 = context.getBean(Clock.class);
        Clock clockBean2 = context.getBean(Clock.class);
        assertNotEquals(clockBean1, clockBean2);
    }
}