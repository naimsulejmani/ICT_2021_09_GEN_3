package ict.kosovo.growth.basic.ora_5;

public class TestDoubleOperator {
    public static void main(String[] args) {
        final double TOLERANCE = 0.0000001;
        double vlera = 1.0;
        vlera -= 0.1;
        System.out.println(vlera);
        vlera -= 0.1;
        System.out.println(vlera);
        vlera -= 0.1;
        System.out.println(vlera);
        vlera -= 0.1;
        System.out.println(vlera);
        vlera -= 0.1;
        System.out.println(vlera);
        vlera -= 0.1;
        System.out.println(vlera);
        vlera -= 0.1;
        System.out.println(vlera);
        vlera -= 0.1;
        System.out.println(vlera);
        vlera -= 0.1;
        System.out.println(vlera);
        vlera -= 0.1;
        System.out.println(vlera);

        if(Math.abs(vlera-0)<TOLERANCE) {
            System.out.println("PO");
        }
        else {
            System.out.println("JO");
        }
    }
}
