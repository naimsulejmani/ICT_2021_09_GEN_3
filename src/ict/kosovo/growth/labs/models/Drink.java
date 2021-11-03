package ict.kosovo.growth.labs.models;

import ict.kosovo.growth.labs.exceptions.ExpiredProductDateException;
import ict.kosovo.growth.labs.exceptions.NegativePriceException;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

//Kafja Te Naimi -> Pijet me zbritje prej ores  50%08:00 deri ne 10:00) vetem te haneve
public class Drink extends Product {

    public Drink(int id, String name, String description, BigDecimal price, LocalDate bestBefore, Rating rating, List<Review> reviews) throws NegativePriceException, ExpiredProductDateException {
        super(id, name, description, price, bestBefore, rating, reviews);
    }

    public Drink(int id, String name, BigDecimal price) throws NegativePriceException, ExpiredProductDateException {
        super(id, name, price);
    }

    @Override
    public BigDecimal getDiscount() {
        LocalTime now = LocalTime.now();
        return now.isAfter(LocalTime.of(19, 0)) && now.isBefore(LocalTime.of(21, 00))
                ? getPrice().divide(BigDecimal.valueOf(2)) : BigDecimal.ZERO;
    }
}
