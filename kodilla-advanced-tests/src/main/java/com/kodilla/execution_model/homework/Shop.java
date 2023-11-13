package com.kodilla.execution_model.homework;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Shop {
    private List<Order> orders = new ArrayList<>();
    public void addOrder(Order order){
        this.orders.add(order);
    }
    public int getSize() {
        return this.orders.size();
    }

    public List<Order> ordersByDate(LocalDate startDate, LocalDate endDate) {
        return orders
                .stream()
                .filter(u -> u.getDate().isAfter(startDate) && u.getDate().isBefore(endDate))
                .collect(Collectors.toList());
    }

    public List<Order> ordersByPrice(double minPrice, double maxPrice) {
        return  orders
                .stream()
                .filter(u -> u.getPrice()>minPrice && u.getPrice()<maxPrice)
                .collect(Collectors.toList());
    }

    public double getValueOfAllOrders() {
        return orders
                .stream()
                .mapToDouble(u ->u.getPrice())
                .sum();
    }
}
