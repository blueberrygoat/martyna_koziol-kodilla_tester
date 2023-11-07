package com.kodilla.exception.homework;

import java.util.List;

public class WarehouseApp {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();
        warehouse.addOrder(new Order("123"));
        warehouse.addOrder(new Order("345"));
        warehouse.addOrder(new Order("543"));

       try{
           Order order = warehouse.getOrder("3");
           System.out.println("Order no. " + order.getNumber() + " is found");
       }
       catch (OrderDoesntExistException e){
           System.out.println("Wrong order's number.");}

       }


    }
