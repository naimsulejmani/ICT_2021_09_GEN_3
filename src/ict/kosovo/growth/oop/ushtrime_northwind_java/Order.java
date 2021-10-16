package ict.kosovo.growth.oop.ushtrime_northwind_java;

import java.time.LocalDate;
import java.util.ArrayList;

public class Order {
    private int id;
    private int customerId;
    private int employeeId;
    private LocalDate orderDate;

    private ArrayList<OrderDetail> orderDetails;
    private Customer customer;

    public Order(int id, int customerId, int employeeId, LocalDate orderDate) {
        this.id = id;
        this.customerId = customerId;
        this.employeeId = employeeId;
        this.orderDate = orderDate;
    }

    public Order(int id, int customerId, int employeeId) {
        this.id = id;
        this.customerId = customerId;
        this.employeeId = employeeId;
        this.orderDate = LocalDate.now();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDate orderDate) {
        this.orderDate = orderDate;
    }

    public void addOrderDetail(OrderDetail detail) {
        if (orderDetails == null)
            orderDetails = new ArrayList<>();
        this.orderDetails.add(detail);
    }

    public double getTotal() {
        double total = 0;
        for (OrderDetail detail : orderDetails) {
            total += detail.getTotal();
        }
        return total;
    }
}







