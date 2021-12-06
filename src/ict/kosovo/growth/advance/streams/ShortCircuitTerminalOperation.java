package ict.kosovo.growth.advance.streams;

import ict.kosovo.growth.oop.generics.html_select_example.Option;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ShortCircuitTerminalOperation {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product(1, "Laptop Lenovo X1", "laptop elegant dhe shume imire", 1999.99d, 0, LocalDate.of(2021, 12, 31)));
        products.add(new Product(2, "A", "AAAA", 10, 0.30, LocalDate.now()));
        products.add(new Product(3, "B", "BBBB", 20, 0.15, LocalDate.now().plusDays(100)));



       Optional<Product> product =  products.stream().filter(p->p.getName().equals("A")).findFirst();

       if(product.isPresent())
       {
           System.out.println(product.get().getName());
       }
       else {
           System.out.println("Produkti nuk u gjet!!!");
       }

    }
}
