package ict.kosovo.growth.oop.ushtrime_3;

public class Katrori {
    private double a;

    //    public Katrori() {
//    }
    public Katrori(double a) {
        //this.a = a;
        setA(a);
    }

    public void setA(double a) {
        if (a > 0)
            this.a = a;
    }

    public double getA() {
        return a;
    }

    public double getPerimeter() {
        return (4 * a);
    }

    public double getArea() {
        return (a * a);
    }


    public void print() {
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }

    public boolean hasGreaterAreaThan(Katrori nextKatrori) {
        return this.getArea() > nextKatrori.getArea();
    }

}