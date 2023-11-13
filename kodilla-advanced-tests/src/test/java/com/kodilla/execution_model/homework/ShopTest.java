package com.kodilla.execution_model.homework;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ShopTest {
    Shop shop = new Shop();
    Order order1 = new Order(100.5, LocalDate.of(2023,10,15),"Martyna");
    Order order2 = new Order(50.25, LocalDate.of(2023,11,3),"Jagoda");
    Order order3 = new Order(53.15, LocalDate.of(2023,11,12),"Jacek");

    @BeforeEach
    public void initializeShop() {
       shop.addOrder(order1);
       shop.addOrder(order2);
       shop.addOrder(order3);
    }

    @Test
    public void testAddingOrdersToShop(){
        assertEquals(3,shop.getSize());

    }
    @Test
    public void shouldReturnListOfOrdersBetweenTwoDates(){
        LocalDate startDate = LocalDate.of(2020,1,1);
        LocalDate endDate = LocalDate.of(2024, 1,1);
        List <Order> result = shop.ordersByDate(startDate,endDate);
        assertEquals(3,result.size());
    }
    @Test
    public void shouldReturnOrdersFromPriceScope(){
        List <Order> result = shop.ordersByPrice(10,150);
        assertEquals(3,result.size());
    }
    @Test
    public void shouldReturnNumberOfAllOrders(){
        assertEquals(3,shop.getSize());
    }
    @Test
    public void shouldReturnValueOfAllOrders(){
        assertEquals(203.9,shop.getValueOfAllOrders());
    }
    @BeforeAll
    public static void displayIntroMessage() {
        System.out.println("Starting testing");
    }

    @AfterAll
    public static void displayGoodByeMessage() {
        System.out.println("Finishing testing");
    }

}