package ict.kosovo.growth.labs.models;

import ict.kosovo.growth.oop.polymorphism.covariant_type.A;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public abstract class Product {
    private int id;
    private String name;
    private String description;
    private BigDecimal price;
    private LocalDate bestBefore;//afat perdorimi
    private Rating rating;
    private List<Review> reviews;//1 produkt ka zero ose me shume reviews

    public Product(int id, String name, String description, BigDecimal price, LocalDate bestBefore, Rating rating
            , List<Review> reviews) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.bestBefore = bestBefore;
        this.rating = rating;
        this.reviews = reviews;
    }

    public Product(int id, String name, BigDecimal price) {
        this(id, name, null, price, LocalDate.now(), Rating.NO_STAR, new ArrayList<>());
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        if (price.compareTo(BigDecimal.ZERO) < 0) {
            this.price = BigDecimal.ZERO;
            //throw error
        } else
            this.price = price;
    }

    public LocalDate getBestBefore() {
        return bestBefore;
    }

    //nuk guxon me qene e dates se djeshme
    public void setBestBefore(LocalDate bestBefore) {
        if (bestBefore.isBefore(LocalDate.now())) {
            //ketu gjuaje nje gabim
            System.out.println("Nuk lejohet te regjistrohen ne sistem produktet me afat te skaduar");
            return;
        }
        this.bestBefore = bestBefore;
    }

    //0..5
    public Rating getRating() {
        if (reviews.isEmpty()) return Rating.NO_STAR;
        double sum = 0;
        for (Review review : reviews) {
            sum += review.getRating().getValue();
        }
        int avg = (int) Math.ceil(sum / reviews.size());//3.1
        return Rating.values()[avg];
    }

//    public void setRating(Rating rating) {
//        this.rating = rating;
//    }

    //Interface Discountable
    public abstract BigDecimal getDiscount();

    @Override
    public String toString() {
        return String.format(
                "Product: %d - %s%nDescription: %s %nBest Before: %s%nCmimi: %.2f EUR%nRating: %s%nDiscount: -%.2f EUR",
                id, name, description, bestBefore, price, getRating(), getDiscount()

        );
    }

    public List<Review> getReviews() {
        return reviews;
    }

    public void setReviews(List<Review> reviews) {
        this.reviews = reviews;
    }
}
