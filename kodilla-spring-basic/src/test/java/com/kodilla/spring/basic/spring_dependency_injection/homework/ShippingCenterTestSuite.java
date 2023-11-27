package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class ShippingCenterTestSuite {
    @Test
    public void shouldReturnFalseWhenPackedIsOverweight(){
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        DeliveryService bean = context.getBean(DeliveryService.class);
        boolean result = bean.deliverPackage("city", 31);
        assertFalse(result);
    }
    @Test
    public void shouldReturnTrueWhenWeightIsCorrect(){
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        DeliveryService bean = context.getBean(DeliveryService.class);
        boolean result = bean.deliverPackage("city", 30);
        assertTrue(result);
    }

    @Test
    public void shouldDeliveredPackedToAddressWhenWeightIsCorrect(){
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        ShippingCenter bean = context.getBean(ShippingCenter.class);
        String result = bean.sendPackage("city", 30);
        Assertions.assertEquals("Package delivered to: city",result);
    }

    @Test
    public void shouldNotDeliveredPackedToAddressWhenPackedIsOverweight(){
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        ShippingCenter bean = context.getBean(ShippingCenter.class);
        String result = bean.sendPackage("city", 31);
        Assertions.assertEquals("Package not delivered to: city",result);
    }

}