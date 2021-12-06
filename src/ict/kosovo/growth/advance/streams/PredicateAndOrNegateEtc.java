package ict.kosovo.growth.advance.streams;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.PrimitiveIterator;
import java.util.function.Predicate;

public class PredicateAndOrNegateEtc {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product(1, "Laptop Lenovo X1", "laptop elegant dhe shume imire", 1999.99d, 0, LocalDate.of(2021, 12, 31)));
        products.add(new Product(2, "A", "AAAA", 10, 0.30, LocalDate.now()));
        products.add(new Product(3, "B", "BBBB", 20, 0.15, LocalDate.now().plusDays(100)));

        Predicate<Product> filterPriceGreaterThan1000 = product -> product.getPrice() > 1000;
        Predicate<Product> filterDiscountgreaterThan20 = product -> product.getDiscount() > 0.20;

        products.stream()
                .filter(filterPriceGreaterThan1000.or(filterDiscountgreaterThan20).negate())
                .forEach(product -> System.out.println(product.getName()));

    }
}
