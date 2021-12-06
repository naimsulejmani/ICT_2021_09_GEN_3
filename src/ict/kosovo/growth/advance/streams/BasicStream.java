package ict.kosovo.growth.advance.streams;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class BasicStream {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product(1, "Laptop Lenovo X1", "laptop elegant dhe shume imire", 1999.99d, 0, LocalDate.of(2021, 12, 31)));
        products.add(new Product(2, "A", "AAAA", 10, 0.30, LocalDate.now()));
        products.add(new Product(3, "B", "BBBB", 20, 0.15, LocalDate.now().plusDays(100)));


        products.stream().forEach(p -> {
            p.setDiscount(0.50);
            System.out.println(p.getName() + ", zbritja eshte " + p.getDiscount());
        });

        System.out.println("--------------------------------------------------------");
        products.stream().parallel().forEach(p-> System.out.println(p.getName()+ ", zbritja eshte " + p.getDiscount()));

    }
}
