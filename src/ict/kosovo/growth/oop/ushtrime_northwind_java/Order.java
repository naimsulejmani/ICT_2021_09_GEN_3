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
    private Employee employee;

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

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
         /*
        Numri porosise: 1
        Bleresi: SHPK Adnani
        Addressa: .....
        --------------------------------------
        1 - Jogobella       50  x   0.30    =   15.00 EUR
        2 - Monte           50  x   0.40    =   20.00 EUR
        --------------------------------------
        TOtali: 35.00 EUR.


         */

    public void print() {
        System.out.println("Numri i porosise: " + id);
        System.out.println("Bleresi: " + customer.getCompanyName());
        System.out.println("Addressa: " + customer.getAddress() + ", " + customer.getCity());
        System.out.println("------------------------------------------------------");
        for (OrderDetail detail : orderDetails) {
            detail.print();
        }

        System.out.println("------------------------------------------------------");
        System.out.printf("Totali: %30.2f EUR.", getTotal());
    }
}







