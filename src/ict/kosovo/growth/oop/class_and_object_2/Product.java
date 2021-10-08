package ict.kosovo.growth.oop.class_and_object_2;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Product {
    //per secilin atribut/fusha/data
    //shiko se a duhet me u lexu nga jasht dhe a duhet me u ndruar
    private int id;
    private String name;
    private BigDecimal price;
    private LocalDate bestBefore = LocalDate.now().plusDays(10);

    public BigDecimal getPrice() {
        return price;
    }
    public void setPrice(double price) {
        if (price < 0) return;
        //price = Math.abs(price);
        this.price = BigDecimal.valueOf(price);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBestBefore() {
        return bestBefore;
    }

    public int getId() {
        return id;
    }


}
