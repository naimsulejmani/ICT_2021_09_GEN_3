package ict.kosovo.growth.oop.ushtrime_northwind_java;

import java.util.ArrayList;

public class Supplier extends Company {
    private ArrayList<Product> products;
    //1 furnitor ka 0..* produkte

    public Supplier() {
    }

    public Supplier(int id, String companyName, String contactName, String address, String city, String country) {
        super(id, companyName, contactName, address, city, country);
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }
}
