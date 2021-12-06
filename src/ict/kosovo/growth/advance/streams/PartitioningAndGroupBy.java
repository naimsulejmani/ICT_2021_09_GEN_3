package ict.kosovo.growth.advance.streams;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PartitioningAndGroupBy {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product(1, "Laptop Lenovo X1", "laptop elegant dhe shume imire", 1999.99d, 0, LocalDate.of(2021, 12, 31)));
        products.add(new Product(2, "A", "AAAA", 10, 0.30, LocalDate.now()));
        products.add(new Product(3, "B", "BBBB", 20, 0.15, LocalDate.now()));


        Map<LocalDate, List<Product>> productGroupsByDate =
                products.stream().collect(Collectors.groupingBy(p->p.getDueDate()));

        productGroupsByDate.get(LocalDate.now()).stream().forEach(p-> System.out.println(p.getName()));


        Map<Boolean, List<Product>> cheaperProduct =
                products.stream().collect(Collectors.partitioningBy(p->p.getPrice()<50));

        System.out.println("------------------------------------------------");
        cheaperProduct.get(true).stream().forEach(p-> System.out.println(p.getName()));
        System.out.println("-------------------------------------");
        cheaperProduct.get(false).stream().forEach(p-> System.out.println(p.getName()));
    }
}
