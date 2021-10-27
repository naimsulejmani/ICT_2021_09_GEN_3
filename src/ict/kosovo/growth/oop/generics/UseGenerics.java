package ict.kosovo.growth.oop.generics;

import java.util.ArrayList;

public class UseGenerics {
    public static void main(String[] args) {
        ArrayList listOfObjects = new ArrayList();
        listOfObjects.add(10);
        listOfObjects.add("Naim");

        ArrayList<String> emrat = new ArrayList<>();
        emrat.add("Naim");
        emrat.add("Zana");
        String emri = emrat.get(0);

        System.out.println(emri);
    }
}
