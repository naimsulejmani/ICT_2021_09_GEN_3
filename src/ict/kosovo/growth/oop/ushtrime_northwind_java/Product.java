package ict.kosovo.growth.oop.ushtrime_northwind_java;

import java.util.ArrayList;
//Mappim Table-Class (Mapper
public class Product {
    private int id;
    private String name;
    private int supplierId; //qeles i huaj qe lidhet me Supplier
    private int categoryId; //qeles i huaj qe lidhet me Category
    private int quantityPerUnit;
    private double price;
    private int unitInStock;
    private int unitInOrder;
    private int reorderLevel;
    private boolean discontinued;

    private Supplier supplier; //nje produkt ka nje supplier
    private Category category; // nje produkt ka vetem nje category

    private ArrayList<OrderDetail> orderDetails;

    public Product(int id, String name, int supplierId, int categoryId, int quantityPerUnit, double price, int unitInStock, int unitInOrder, int reorderLevel, boolean discontinued, Supplier supplier, Category category) {
        this.id = id;
        this.name = name;
        this.supplierId = supplierId;
        this.categoryId = categoryId;
        this.quantityPerUnit = quantityPerUnit;
        this.price = price;
        this.unitInStock = unitInStock;
        this.unitInOrder = unitInOrder;
        this.reorderLevel = reorderLevel;
        this.discontinued = discontinued;
        this.supplier = supplier;
        this.category = category;
    }

    public Product() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(int supplierId) {
        this.supplierId = supplierId;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public int getQuantityPerUnit() {
        return quantityPerUnit;
    }

    public void setQuantityPerUnit(int quantityPerUnit) {
        this.quantityPerUnit = quantityPerUnit;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getUnitInStock() {
        return unitInStock;
    }

    public void setUnitInStock(int unitInStock) {
        this.unitInStock = unitInStock;
    }

    public int getUnitInOrder() {
        return unitInOrder;
    }

    public void setUnitInOrder(int unitInOrder) {
        this.unitInOrder = unitInOrder;
    }

    public int getReorderLevel() {
        return reorderLevel;
    }

    public void setReorderLevel(int reorderLevel) {
        this.reorderLevel = reorderLevel;
    }

    public boolean isDiscontinued() {
        return discontinued;
    }

    public void setDiscontinued(boolean discontinued) {
        this.discontinued = discontinued;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public ArrayList<OrderDetail> getOrderDetails() {
        return orderDetails;
    }

    public void addOrderDetail(OrderDetail detail) {
        if (this.orderDetails == null)
            this.orderDetails = new ArrayList<>();
        this.orderDetails.add(detail);
    }
}
