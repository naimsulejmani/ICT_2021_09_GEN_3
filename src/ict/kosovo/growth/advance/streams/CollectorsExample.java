package ict.kosovo.growth.advance.streams;

import java.text.ChoiceFormat;
import java.text.NumberFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class CollectorsExample {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product(1, "Laptop Lenovo X1", "laptop elegant dhe shume imire", 1999.99d, 0, LocalDate.of(2021, 12, 31)));
        products.add(new Product(2, "A", "AAAA", 10, 0.30, LocalDate.now()));
        products.add(new Product(3, "B", "BBBB", 20, 0.15, LocalDate.now().plusDays(100)));


        DoubleSummaryStatistics statistics = products.stream().collect(Collectors.summarizingDouble(p-> p.getPrice()));

        System.out.println(statistics);


        String namesOfProducts = products.stream().collect(Collectors.mapping(p->p.getName(), Collectors.joining(",")));

        System.out.println(namesOfProducts);

        List<Product> productWithSmallPrices = products.stream().filter(p->p.getPrice()<50).collect(Collectors.toList());


        NumberFormat format = NumberFormat.getCurrencyInstance(Locale.UK);

        String valueInDollar = products.stream().collect(Collectors.collectingAndThen(
                Collectors.averagingDouble(p->p.getPrice()),
                n-> format.format(n)
        ));

        System.out.println(valueInDollar);

    }
}
