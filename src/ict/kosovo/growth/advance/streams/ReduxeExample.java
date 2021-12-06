package ict.kosovo.growth.advance.streams;

import ict.kosovo.growth.oop.generics.html_select_example.Option;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ReduxeExample {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product(1, "Laptop Lenovo X1", "laptop elegant dhe shume imire", 1999.99d, 0, LocalDate.of(2021, 12, 31)));
        products.add(new Product(2, "A", "AAAA", 10, 0.30, LocalDate.now()));
        products.add(new Product(3, "B", "BBBB", 20, 0.15, LocalDate.now().plusDays(100)));


        String reduxer = products.stream().map(product -> product.getName()).reduce("",(s1,s2)->s1+"; "+s2);
        Optional<String> optionalReduxer = products.stream().map(product -> product.getName()).reduce((s1, s2)->s1+"; "+s2);

        System.out.println(reduxer);
        System.out.println(optionalReduxer.isPresent() ? optionalReduxer.get(): "nodata");


    }
}
