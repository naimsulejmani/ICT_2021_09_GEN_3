package ict.kosovo.growth.advance.streams;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerAndThenStream {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product(1, "Laptop Lenovo X1", "laptop elegant dhe shume imire", 1999.99d, 0, LocalDate.of(2021, 12, 31)));
        products.add(new Product(2, "A", "AAAA", 10, 0.30, LocalDate.now()));
        products.add(new Product(3, "B", "BBBB", 20, 0.15, LocalDate.now().plusDays(100)));


        Consumer<Product> expiredProducts = p -> p.setDueDate(LocalDate.now());
        Consumer<Product> setDiscount = p -> p.setDiscount(0.50);

        products.stream().forEach(expiredProducts.andThen(setDiscount)
                .andThen(p-> System.out.println(p.getName()+" -> "+p.getDueDate()+" -> "+p.getDiscount())));


        products.stream().peek(expiredProducts)
                .filter(p->p.getPrice()>10)
                .forEach(setDiscount);
    }
}
