package ict.kosovo.growth.labs.managers;

import ict.kosovo.growth.labs.exceptions.ExpiredProductDateException;
import ict.kosovo.growth.labs.exceptions.NegativePriceException;
import ict.kosovo.growth.labs.helpers.Log;
import ict.kosovo.growth.labs.models.*;
import ict.kosovo.growth.oop.abstract_interfaces.Wrestler;

import java.io.IOException;
import java.math.BigDecimal;
import java.text.MessageFormat;
import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.XMLFormatter;

public class ProductManager {
    private List<Product> products = new ArrayList<>();
    private String language = "en-US"; //"$", 10.10.2021
    //use logger here product_manager.log
    private ResourceFormatter formatter;
    private Log log;

    public ProductManager(String language) throws IOException {
        if (language != null) this.language = language;
        String[] arr = language.split("-");
        formatter = new ResourceFormatter(new Locale(arr[0], arr[1]));
        log = new Log("files/product_manager.txt", "PRODUCT_MANAGER_LOG", Level.INFO,new XMLFormatter());

    }
    //kriju nje klase qe i menaxhon resourcest tona ne lidhje me produkte
    //pergjegjesi shumegjuhesine

    public Product createFood(int id, String name, String description, double price,
                              LocalDate bestBefore, Rating rating) {

        Product product = null;
        try {
            product = new Food(id, name, description, BigDecimal.valueOf(price), bestBefore, rating, null);
            products.add(product);
            return product;
        } catch (NegativePriceException e) {
            log.logger.warning(formatter.getText(e.getMessage()) + " " + e.getPrice());
            System.out.println("Ruaje logun: " + formatter.getText(e.getMessage()));
        } catch (ExpiredProductDateException e) {
            log.logger.severe(formatter.getText(e.getMessage()));
            System.out.println("Ruaje logun" + formatter.getText(e.getMessage()));
        }
        return product;
    }

    public Product createDrink(int id, String name, String description, double price,
                               LocalDate bestBefore, Rating rating) {

        Product product = null;
        try {
            product = new Drink(id, name, description, BigDecimal.valueOf(price), bestBefore, rating, null);
            products.add(product);
            return product;
        } catch (NegativePriceException e) {
            System.out.println("Ruaje logun: " + formatter.getText(e.getMessage()));
        } catch (ExpiredProductDateException e) {
            System.out.println("Ruaje logun" + formatter.getText(e.getMessage()));
        }
        return product;
    }

    public Product createProduct(ProductType productType, int id, String name, String description, double price,
                                 LocalDate bestBefore, Rating rating) {
        return productType == ProductType.FOOD ?
                createFood(id, name, description, price, bestBefore, rating) :
                createDrink(id, name, description, price, bestBefore, rating);
    }

    public void printAllProducts() {
        System.out.printf("%s: %d%n", formatter.getText("totalProducts"), products.size());
        if (!products.isEmpty()) {
            System.out.println("---------------------------------------");
            for (Product product : products) {
                System.out.println(formatter.formatProduct(product));
                System.out.println("--------------------");
            }
            System.out.println("---------------------------------------");
        }
    }

    //do te na sherben per formatizim dhe shumegjuhesi
    //10.50 -> 10,50
    private static class ResourceFormatter {
        private Locale locale; //sq
        private ResourceBundle resources;//kjo sherben per me mujt me i perdore shumegjuhesine
        private DateTimeFormatter dateTimeFormatter;
        private NumberFormat moneyFormat;

        private ResourceFormatter(Locale locale) {
            this.locale = locale;
            dateTimeFormatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT).localizedBy(locale);
            moneyFormat = NumberFormat.getCurrencyInstance(locale);
            resources = ResourceBundle.getBundle("ict/kosovo/growth/labs/Resources", locale);
        }

        private String formatProduct(Product product) {
            return MessageFormat.format(resources.getString("product"),
                    product.getId(),
                    product.getName(),
                    moneyFormat.format(product.getPrice()),
                    dateTimeFormatter.format(product.getBestBefore()),
                    product.getRating());
        }

        private String getText(String key) {
            return resources.getString(key);
        }
    }

}
