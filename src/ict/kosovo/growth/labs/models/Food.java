package ict.kosovo.growth.labs.models;

import ict.kosovo.growth.labs.exceptions.ExpiredProductDateException;
import ict.kosovo.growth.labs.exceptions.NegativePriceException;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Food extends Product {

    public Food(int id, String name, String description, BigDecimal price, LocalDate bestBefore, Rating rating, List<Review> reviews) throws NegativePriceException, ExpiredProductDateException {
        super(id, name, description, price, bestBefore, rating,reviews);
    }

    public Food(int id, String name, BigDecimal price) throws NegativePriceException, ExpiredProductDateException {
        super(id, name, price);
    }

    @Override
    public BigDecimal getDiscount() {
        return getBestBefore().isEqual(LocalDate.now()) ? getPrice() : BigDecimal.ZERO;
    }
}
