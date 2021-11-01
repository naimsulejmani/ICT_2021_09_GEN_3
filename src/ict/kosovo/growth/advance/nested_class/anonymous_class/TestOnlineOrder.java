package ict.kosovo.growth.advance.nested_class.anonymous_class;

import java.math.BigDecimal;

public class TestOnlineOrder {
    public static void main(String[] args) {
        OnlineOrder oo = new OnlineOrder();
        System.out.println(oo.getDiscount());

        //nese shefi spo du kesi implementimi , po du me pas impleten

        //extend anonymous
        //pridni = referencat e femise
        Order order = new Order() {
            @Override
            public BigDecimal getDiscount() {
                return BigDecimal.valueOf(40d);
            }

            public void test() {
            }
        };

        Order order1 = new Order() {
            @Override
            public BigDecimal getDiscount() {
                return BigDecimal.ONE;
            }
        };

        System.out.println(order.getDiscount());
        System.out.println(order);

        System.out.println(order1.getDiscount());
        System.out.println(order1);
    }
}
