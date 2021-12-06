package ict.kosovo.growth.advance.streams;

import java.util.List;

public class Order {
    private int id;
    private List<Product> productList;

    public Order(int id, List<Product> productList) {
        this.id = id;
        this.productList = productList;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }
}
