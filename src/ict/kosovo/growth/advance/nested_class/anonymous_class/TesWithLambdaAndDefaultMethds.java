package ict.kosovo.growth.advance.nested_class.anonymous_class;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.function.Predicate;

public class TesWithLambdaAndDefaultMethds {
    public static void main(String[] args) {
        Product p1 = new Product(1, "Z", 150, 5);
        Product p2 = new Product(2, "A", 50, 2);
        Product p3 = new Product(5, "Z", 200, 1);
        Product p4 = new Product(3, "B", 10, 6);

        ArrayList<Product> products = new ArrayList<>();
        products.add(null);
        products.add(p1);
        products.add(p2);
        products.add(p3);
        products.add(p4);
        products.add(null);
        Comparator<Product> nameComparator = (s1, s2) -> s1.getName().compareToIgnoreCase(s2.getName());
        Comparator<Product> quantityComparator = (o1, o2) -> o1.getQuantity() - o2.getQuantity();
        //Collections.sort(products, nameComparator.thenComparing(quantityComparator));
        Collections.sort(products, Comparator.nullsLast(nameComparator.thenComparing(quantityComparator)));

        for (Product p : products) {
            System.out.println(p);
        }


        //shkruaj dicka qe fshine nga array lista produktet qe jane null ose produktet qe kane sasi me te vogel se 3
        //Interface funksional - Predicate
        Predicate<Product> isNullPredicate = p -> p == null;
        Predicate<Product> isLessThan3QuantityPredicate = p -> p.getQuantity() < 3;

        Predicate<Product> dyjaBashk = p -> p == null || p.getQuantity() < 3;

        products.removeIf(isNullPredicate.or(isLessThan3QuantityPredicate).negate());
        System.out.println("AFTER REMOVE");

        for (Product p : products) {
            System.out.println(p);
        }

    }
}
