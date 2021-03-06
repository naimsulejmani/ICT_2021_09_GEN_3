package ict.kosovo.growth.labs;

import ict.kosovo.growth.labs.exceptions.ExpiredProductDateException;
import ict.kosovo.growth.labs.exceptions.NegativePriceException;
import ict.kosovo.growth.labs.managers.ProductManager;
import ict.kosovo.growth.labs.models.*;

import java.io.IOException;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;

//kjo klasa ka me u perdore per me testu shitjen e produkteve
//apo regjitrimin e produkteve paraqitjen e tyre
public class Shop {
    public static void main(String[] args) {
//        Product monte = new Product(1, "Monte Coko", "Cokollate me shume lajthi",
//                BigDecimal.valueOf(0.45), LocalDate.now().plusDays(30), Rating.FIVE_STAR);
//
//        System.out.println(monte);
//        try {
//            Product monte = new Food(1, "Monte Coko", "Cokollate me shume lajthi",
//                    BigDecimal.valueOf(0.50d), LocalDate.now(), Rating.NO_STAR, new ArrayList<>());
//
//            monte.getReviews().add(new Review("MIre", Rating.THREE_STAR, "ns"));
//            monte.getReviews().add(new Review("KEQ", Rating.ONE_STAR, "nb"));
//            monte.getReviews().add(new Review("Excellent", Rating.FIVE_STAR, "zm"));
//            //1+3+5/3
//            //monte.setRating(Rating.NO_STAR);
//            System.out.println(monte);
//
//            Review review1 = new Review("Shume produkte i mire", Rating.FIVE_STAR, "naimsulejmani");
//            System.out.println(review1);
//        } catch (NegativePriceException ex) {
//            System.out.println(ex.getMessage());
//            System.out.println(ex.getPrice());
//        } catch (ExpiredProductDateException ex) {
//            System.out.println(ex.getMessage());
//        }


        ProductManager pm = null;
        try {
            pm = new ProductManager("en-US");
            pm.createProduct(ProductType.FOOD, 1, "Jogobella", "pudink me fruta", -0.40, LocalDate.now().plusDays(10),
                    Rating.NO_STAR
            );
            pm.createProduct(ProductType.DRINK, 1, "Coca COla 1l", "pije e gazuar fantastike", 0.95, LocalDate.now().plusDays(60),
                    Rating.NO_STAR
            );

            pm.printAllProducts();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}
