package ict.kosovo.growth.basic.ora_4;

public class TestimiIKonvertimeve {
    public static void main(String[] args) {
        byte b;
        int i = 174;
        double d = 105.142;
        System.out.println("Konvertimi nga int ne byte");
        b = (byte) i;
        System.out.println("b = " + b);
        System.out.println("i = " + i);
        System.out.println("Konvertimi nga double ne int");
        i = (int) d;
        System.out.println("d = " + d);
        System.out.println("i = " + i);
        System.out.println("Konvertimi nga double ne byte");
        b = (byte) d;
        System.out.println("b = " + b);

    }
}
