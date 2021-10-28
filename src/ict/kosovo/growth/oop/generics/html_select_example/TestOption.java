package ict.kosovo.growth.oop.generics.html_select_example;

public class TestOption {
    public static void main(String[] args) {
        Option<String,String> opcioni1 = new Option<>("volvo","Volvo");
        Option<String,String> opcioni2 = new Option<>("vw","VW");

        System.out.println(opcioni1);
        System.out.println(opcioni2);

    }
}
