package ict.kosovo.growth.oop.ushtrime_northwind_java;

import java.util.ArrayList;

public class Customer extends Company {

    private ArrayList<Order> orders;//nje konsumatore mundet me pas 0..* porosi

    public Customer(int id, String companyName, String contactName, String address, String city, String country) {
        super(id, companyName, contactName, address, city, country);
    }

    public Customer() {
        // super();
    }

    public ArrayList<Order> getOrders() {
        return orders;
    }

    public void addOrder(Order order) {
        if (this.orders == null)
            this.orders = new ArrayList<>();
        this.orders.add(order);
    }
}
