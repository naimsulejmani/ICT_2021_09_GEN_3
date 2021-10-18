package ict.kosovo.growth.oop.polymorphism.final_keyword_in_java;

public class TestFinals {
    public static void main(String[] args) {
        ToshibaTelevision t1 = new ToshibaTelevision();
        ToshibaTelevision t2 = new ToshibaTelevision();
        ToshibaTelevision t3 = new ToshibaTelevision(100);
        System.out.println(t1.id);
        System.out.println(t2.id);
        System.out.println(t3.id);

        t2.turnOn();

    }
}
