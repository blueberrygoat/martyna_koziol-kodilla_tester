package com.kodilla.exception.homework;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class WarehouseTest {

    @Test
    public void testingWrongOrderNumber() {
        Warehouse warehouse = new Warehouse();
        assertThrows(OrderDoesntExistException.class, () ->warehouse.getOrder("1"));
    }

}