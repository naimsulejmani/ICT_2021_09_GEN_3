package ict.kosovo.growth.labs.models;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Food extends Product {

    public Food(int id, String name, String description, BigDecimal price, LocalDate bestBefore, Rating rating, List<Review> reviews) {
        super(id, name, description, price, bestBefore, rating,reviews);
    }

    public Food(int id, String name, BigDecimal price) {
        super(id, name, price);
    }

    @Override
    public BigDecimal getDiscount() {
        return getBestBefore().isEqual(LocalDate.now()) ? getPrice() : BigDecimal.ZERO;
    }
}
