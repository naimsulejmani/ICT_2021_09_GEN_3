package ict.kosovo.growth.oop.generics.type_variable_bounds;

import java.util.Comparator;

public class TestComparableKatrori {
    public static void main(String[] args) {
        Katrori k1 = new Katrori(5.5);
        Katrori k2 = new Katrori(6.14);

        System.out.println(k1.compareTo(k2));
        Katrori[] katroret = new Katrori[]{
                k1, k2, new Katrori(4), new Katrori(10), new Katrori(1.5)
        };

        Person[] people = {
                new Person(1,"naim",34),
                new Person(2,"filan",40),
                new Person(3,"filane",20)
        };

        Katrori minimumi = min(katroret);
        System.out.println(minimumi.getA());
        Person smallestPersonInAge = min(people);
        System.out.println(smallestPersonInAge.getName());
        test(10,20,30,40);
    }

    public static void test(int... numrat) {
        for(int nr: numrat)
            System.out.println(nr);
    }

    public static <T extends Comparable> T min(T[] array) {
        if (array == null || array.length == 0) return null;
        T smallest = array[0];

        for (int i = 1; i < array.length; i++) {
            if (smallest.compareTo(array[i]) > 0)
                smallest = array[i];
        }
        return smallest;
    }
}
