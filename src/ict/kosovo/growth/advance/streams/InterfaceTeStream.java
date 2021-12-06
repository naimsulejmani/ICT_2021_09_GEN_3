package ict.kosovo.growth.advance.streams;

import java.time.LocalDate;
import java.util.function.*;

public class InterfaceTeStream {
    public static void main(String[] args) {

        IntPredicate numerPredicate = new IntPredicate() {
            @Override
            public boolean test(int value) {
                return false;
            }
        };

        Predicate<Product> priceGreaterThan100 = new Predicate<Product>() {
            @Override
            public boolean test(Product product) {
                return product.getPrice() > 100;
            }
        };

        Predicate<Product> priceWithDiscount = product -> product.getDiscount() > 0;

        Product product = new Product(100, "Monte", "Monte me coko", 0.40, 0.05, LocalDate.now());

        System.out.println(priceGreaterThan100.test(product));
        System.out.println(priceWithDiscount.test(product));

        Function<Product, String> productStringFunction = product1 -> product1.getName() + ";" + product1.getDescription() + ";" + product1.getPrice();

        Function<Product, String> productStringFunction1 = new Function<Product, String>() {
            @Override
            public String apply(Product product) {
                return null;
            }
        };


        String result1 = productStringFunction.apply(product);
        System.out.println(result1);

        UnaryOperator<Product> unaryOperator = new UnaryOperator<Product>() {
            @Override
            public Product apply(Product product) {
                product.setDiscount(Math.random());
                return product;
            }
        };


        System.out.println(unaryOperator.apply(product).getDiscount());

        Consumer<Product> consumeProduct1 = new Consumer<Product>() {
            @Override
            public void accept(Product product) {
                System.out.println(product.getId() + " -> " + product.getName());
            }
        };

        Consumer<Product> productConsumer = p -> System.out.println(p.getId() + " -> " + p.getName());

        consumeProduct1.accept(product);

        Supplier<Integer> integerSupplier = new Supplier<Integer>() {
            @Override
            public Integer get() {
                return (int) (Math.random() * 101);
            }
        };

        Supplier<Integer> randomSupplierInt = () -> (int) (Math.random() * 101);

        System.out.println(randomSupplierInt.get());
        System.out.println(randomSupplierInt.get());


    }
}
