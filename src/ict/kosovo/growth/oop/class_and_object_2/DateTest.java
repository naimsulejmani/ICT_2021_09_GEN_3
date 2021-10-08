package ict.kosovo.growth.oop.class_and_object_2;

import java.time.LocalDate;

public class DateTest {
    public static void main(String[] args) {
        Date d1 = new Date();
        d1.setDay(16);
        d1.setDay(33);
        System.out.println(d1.getDay());
        d1.setDay(8);
        d1.setMonth(10);
        d1.setYear(2021);
        d1.print();

        LocalDate dataAktualeESistemit = LocalDate.now();

    }
}
