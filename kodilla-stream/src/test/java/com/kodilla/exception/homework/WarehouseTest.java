package com.kodilla.exception.homework;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class WarehouseTest {
    @Test
    public void testAddingOrder(){
        Warehouse warehouse = new Warehouse();
        warehouse.addOrder(new Order("1"));
        warehouse.addOrder(new Order("3"));
        assertEquals(2,warehouse.orders.size());
    }
    @Test
    public void testingCorrectOrderNumber() throws OrderDoesntExistException{
        Warehouse warehouse = new Warehouse();
        Order order = new Order("123");
        warehouse.addOrder(order);
        Order result = warehouse.getOrder("123");
        assertEquals(order, result);
    }
    @Test
    public void testingWrongOrderNumber() {
        Warehouse warehouse = new Warehouse();
        assertThrows(OrderDoesntExistException.class, () ->warehouse.getOrder("1"));
    }

}