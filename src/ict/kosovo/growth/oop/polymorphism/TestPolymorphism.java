package ict.kosovo.growth.oop.polymorphism;

public class TestPolymorphism {


    public static void main(String args) {
        System.out.println("Une thirrem pa array");
    }

    public static void main() {
        System.out.println("une thirrem pa parametra");
    }

    //    public static void main(String[] args) {
//        System.out.println("Une thirrem main me args[]");
//    }
    public static void main(String... args) {
        System.out.println("Une thirrem main me args[]");
        main("test");
        main();
        System.out.println(add(24l,44l));
        System.out.println(add(5,4));
        System.out.println(add(5.0f,6f));
    }

    static long add(long a, long b) {
        return a+b;
    }

    static double add(double x, double y) {
        return x+y;
    }


}
