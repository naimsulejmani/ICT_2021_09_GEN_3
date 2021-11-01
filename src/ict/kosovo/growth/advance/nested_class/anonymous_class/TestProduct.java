package ict.kosovo.growth.advance.nested_class.anonymous_class;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class TestProduct {
    public static void main(String[] args) {
        Product p1 = new Product(1, "Z", 150, 5);
        Product p2 = new Product(2, "A", 50, 2);
        Product p3 = new Product(5, "Z", 200, 1);
        Product p4 = new Product(3, "B", 10, 6);

        ArrayList<Product> products = new ArrayList<>();
        products.add(p1);
        products.add(p2);
        products.add(p3);
        products.add(p4);

        Collections.sort(products);

        for (Product p : products) {
            System.out.println(p);
        }
        System.out.println("---------------------------");
        System.out.println("Sort by quantity");

        Comparator<Product> quantityProductComparator = new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return (int) (o2.getQuantity() - o1.getQuantity());

            }
        };

        Collections.sort(products, quantityProductComparator);

        for (Product p : products) {
            System.out.println(p);
        }


        System.out.println("---------------------------");
        System.out.println("Sort by name");
        Collections.sort(products, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return o2.getName().compareToIgnoreCase(o1.getName());

            }
        });
        //ne baze te totalit
        Collections.sort(products, (o1, o2) -> (int) (o1.getQuantity()*o1.getPrice()-o2.getQuantity()-o2.getPrice()));

        for (Product p : products) {
            System.out.println(p);
        }


        System.out.println("---------------------------");
        System.out.println("Sort by id");

        Collections.sort(products, (product1, product2) -> product2.getId() - product1.getId());
        Collections.sort(products, (product1, product2) -> {
            int a = 10;
            return product2.getId() - product1.getId();
        });
        for (Product p : products) {
            System.out.println(p);
        }


        Comparator<Product> productNameComparatorAsc = (prod1, prod2) -> prod1.getId() - prod2.getId();

        products.removeIf(product -> product.getName().equals("Z"));
        System.out.println(products.size());

    }
}
