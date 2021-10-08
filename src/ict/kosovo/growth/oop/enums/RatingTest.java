package ict.kosovo.growth.oop.enums;

import java.util.EnumSet;

public class RatingTest {
    public static void main(String[] args) {
        Rating vlersimiNdriqimin = Rating.FIVE_STAR;
        Rating vlersimiPerLumbardhin = Rating.NO_STAR;
        Rating vlerismiPerFitoren = Rating.ONE_STAR;

        System.out.println(vlersimiPerLumbardhin.getStars());
        System.out.println(vlerismiPerFitoren.getStars());
        System.out.println(vlersimiNdriqimin.getStars());

        for(Rating rating: Rating.values()) {
            rating.print();
        }
        System.out.println("Using ENUM SET");
        for(Rating rating: EnumSet.range(Rating.ONE_STAR, Rating.FOUR_STAR)) {
            rating.print();
        }
    }
}
