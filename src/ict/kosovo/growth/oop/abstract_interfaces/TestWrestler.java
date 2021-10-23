package ict.kosovo.growth.oop.abstract_interfaces;

public class TestWrestler {
    public static void main(String[] args) {
        Wrestler.sayHello();
        Wrestler w = new Kane();
        w.payForWork(100);
        w.themeMusic();
        w.finisher();
        w.setName("Kane");
        System.out.println(w.getName());
    }
}
