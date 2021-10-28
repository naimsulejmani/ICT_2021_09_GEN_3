package ict.kosovo.growth.oop.generics.html_select_example;

public class TestSelect {
    public static void main(String[] args) {
        Select<Integer, String> select = new Select<>(1001,"nota");
        select.add(1,"Dobet");
        select.add(2,"Mjaftueshem");
        select.add(3,"Mire");
        select.add(4,"Shume mire");
        select.add(5,"Shkelqyeshem");

        System.out.println(select);

    }
}
