package ict.kosovo.growth.advance.nested_class.method_refrencing;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.function.Predicate;

public class TestMethodReferncing {
    public static void main(String[] args) {
        ArrayList<String> klubet = new ArrayList<>();
        klubet.add("Real Madrid");
        klubet.add("removeBarcelona");
        klubet.add("Prishtina");
        klubet.add("Shkupi");

        //perdorimi i metodes ndihmese statike
        // klubet.removeIf(s->TextFilter.remove(s));
        //nese du me perdore method referencing
        klubet.removeIf(TextFilter::remove);

        System.out.println(klubet.size());
        TextFilter tf = new TextFilter();
        klubet.sort(tf::sortText);
//        klubet.sort(new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//
//            }
//        });

       // klubet.sort(String::compareToIgnoreCase);

        for (String klubi : klubet) {
            System.out.println(klubi);
        }


        Comparator<String> str = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return 0;
            }
        };
    }
}
