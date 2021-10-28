package ict.kosovo.growth.oop.generics.type_variable_bounds;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExample {
    public static void main(String[] args) {
        ArrayList<Integer> numrat = new ArrayList<>();
        numrat.add(10);
        numrat.add(20);
        numrat.add(30);
        Iterator<Integer> iterator = numrat.iterator();
        //readers
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
