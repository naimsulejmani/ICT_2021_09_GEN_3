package ict.kosovo.growth.oop.interfaces;

import java.time.Period;

public class TestPerishable {
    public static void main(String[] args) {
        CocaCola cc2l = new CocaCola();
        System.out.println(cc2l.verifyPeriod(Period.ofDays(10)));
        cc2l.perish();
    }
}
