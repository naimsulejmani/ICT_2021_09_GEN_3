package ict.kosovo.growth.oop.interfaces;

import java.time.Period;

public interface Perishable {
    //konstante finale dhe statike
    public static final Period MAX_PERIOD = Period.ofDays(5);

    //metodat abstracte - mundemi me shtu edhe fjalen abstract po ska nevoje
    void perish();

    boolean isPerished();

    public default boolean verifyPeriod(Period p) {
        return comparePeriod(p) > 0;
    }

    private int comparePeriod(Period p) {
        return p.getDays() - MAX_PERIOD.getDays();
    }

    public static int getMaxPeriodDays() {
        return MAX_PERIOD.getDays();
    }

}
