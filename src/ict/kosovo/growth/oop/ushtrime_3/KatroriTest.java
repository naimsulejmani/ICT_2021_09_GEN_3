package ict.kosovo.growth.oop.ushtrime_3;

public class KatroriTest {
    public static void main(String[] args) {
        Katrori k1 = new Katrori(4.0);
        Katrori k2 = new Katrori(5.0);

        k1.print();

        System.out.println(k2.getArea());


        System.out.println(k1.hasGreaterAreaThan(k2));
    }
}
