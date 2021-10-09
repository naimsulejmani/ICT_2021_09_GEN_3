package ict.kosovo.growth.oop.arrays_example;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList names = new ArrayList(); //initial capacity e ka 10
        //ne prapavije brenda saj ka nje varg te thjeshte
        //Object[] array = new Object[10];

        System.out.println(names.size());
        int x = 3;
        names.add("Behar");
        names.add("Blerta");
        names.add("Ndriqim");
        names.add(100);
        names.add(23.4d);
        names.add(false);
        names.add('c');
        names.add(2.2f);
        names.add(200000003l);
        names.add(x);
        System.out.println(names.size());



        System.out.println(names.get(1));
        String emri = names.get(2).toString();
        System.out.println(emri);
        //int vlera =(int) names.get(2);

        ArrayList<String> emrat = new ArrayList<>();
        emrat.add("Naim");
        System.out.println(emrat.get(0));
        ArrayList<Integer> numrat = new ArrayList<>();
        numrat.add(10);
        System.out.println(numrat.get(0));

        numrat.clear(); //fshij te gjitha elementet tek lista numrat
        Integer x1 = 100;
        numrat.add(200);
        numrat.add(300);
        numrat.add(x1);

        System.out.println(numrat.size());//2
        System.out.println(names.contains(x1));//true
        System.out.println(numrat.remove(Integer.valueOf(300)));

        numrat.add(0,-200);
        numrat.remove(0);



    }
}
