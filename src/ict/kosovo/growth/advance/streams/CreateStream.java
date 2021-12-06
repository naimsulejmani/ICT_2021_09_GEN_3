package ict.kosovo.growth.advance.streams;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class CreateStream {
    public static void main(String[] args) {
        //menyra e pare me kriju stream duke perdore supplier
        int shuma = IntStream.generate(() -> (int) (Math.random() * 10)).takeWhile(n -> n != 3).sum();
        System.out.println(shuma);

        //menyra e dyte me kriju stream
        Stream.of("Naim", "Filan", "Fistek", "A", "B").forEach(s -> System.out.println(s + " -> " + s.length()));


        //menyra e 3-te duke perdore liste apo elemente ngjashme
        List<Product> products = new ArrayList<>();
        products.add(new Product(1, "Laptop Lenovo X1", "laptop elegant dhe shume imire", 1999.99d, 0.05, LocalDate.of(2021, 12, 31)));
        products.add(new Product(2, "A", "AAAA", 10, 0.30, LocalDate.now()));
        products.add(new Product(3, "B", "BBBB", 20, 0.15, LocalDate.now().plusDays(100)));

        double totalDiscount = products.stream().parallel().mapToDouble(p -> (p.getPrice() * p.getDiscount())).sum();
        System.out.println(totalDiscount);

        String[] players = new String[]{"Ronaldo", "Messi", "Zidane", "Henry"};

        //menyra e 4-te me kriju stream eshte
        Arrays.stream(players).filter(s -> s.length() >= 6).forEach(s -> System.out.println(s));


    }
}
