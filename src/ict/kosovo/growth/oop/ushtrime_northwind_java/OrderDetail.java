package ict.kosovo.growth.oop.ushtrime_northwind_java;

public class OrderDetail {
    private int orderId;
    private int productId;
    private double unitPrice;
    private int quantity;
    private float discount;

    private Product product;
    private Order order;


    public OrderDetail(int orderId, int productId, double unitPrice, int quantity, float discount, Product product) {
        this.orderId = orderId;
        this.productId = productId;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
        this.discount = discount;
        this.product = product;
    }

    public OrderDetail(int orderId, int productId, double unitPrice, int quantity) {
        this(orderId, productId, unitPrice, quantity, 0, null);
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public float getDiscount() {
        return discount;
    }

    public void setDiscount(float discount) {
        if (discount >= 0 && discount <= 1)
            this.discount = discount;
    }

    //0.10 1.00- 0.00
    public double getTotal() {
        return (this.quantity * (1 - discount) * unitPrice);
    }

    public void print() {
        System.out.printf("%d - %25s %30d x %8.2f = %.2f EUR%n", productId, product.getName(), quantity, unitPrice, getTotal());
    }
}
