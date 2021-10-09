package ict.kosovo.growth.oop.ushtrime_3;

public class Drejtkendeshi {
    private double a;
    private double b;

    //    public Drejtkendeshi() {
//
//    }
    public Drejtkendeshi(double a, double b) {
        setA(a);
        setB(b);
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {

            this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {

            this.b = b;
    }

    public double perimetriD() {
        return 2 * (a + b);
    }

    public double syprinaD() {
        return a * b;
    }

    public boolean isSquare() {
        if (a == b) {
            return true;
        }
        return false;
    }




}