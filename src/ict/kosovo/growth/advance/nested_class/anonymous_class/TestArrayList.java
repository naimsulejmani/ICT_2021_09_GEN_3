package ict.kosovo.growth.advance.nested_class.anonymous_class;

import java.util.ArrayList;
import java.util.function.Predicate;

public class TestArrayList {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Naim");
        names.add("Agim");
        names.add("Albina");
        names.add("Alma");
        System.out.println(names.size());
        names.removeIf((s)->s.equals("Naim"));
        System.out.println(names.size());

    }
}
