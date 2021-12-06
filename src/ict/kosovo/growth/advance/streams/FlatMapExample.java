package ict.kosovo.growth.advance.streams;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class FlatMapExample {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product(1, "Laptop Lenovo X1", "laptop elegant dhe shume imire", 1999.99d, 0, LocalDate.of(2021, 12, 31)));
        products.add(new Product(2, "A", "AAAA", 10, 0.30, LocalDate.now()));
        products.add(new Product(3, "B", "BBBB", 20, 0.15, LocalDate.now().plusDays(100)));

        Order order = new Order(1, products);
        Order order1 = new Order(2, products);

        Long count = Stream.of(order, order1).flatMap(o -> o.getProductList().stream()).count();
        System.out.println(count);
    }
}
