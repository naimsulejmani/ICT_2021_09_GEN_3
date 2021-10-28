package ict.kosovo.growth.oop.generics.type_variable_bounds;

public class Katrori implements Comparable<Katrori> {
    private double a;

    public Katrori(double a) {
        this.a = a;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getArea() {
        return a * a;
    }

    public double getPerimeter() {
        return 4 * a;
    }

    /*
        <0 -> i bjen qe objekti (instance) eshte me i vogel se objekti krahasues
        =0 -> jane te barabarte per ka vlera
        >0 -> objekti instance eshte me i madh
     */
    @Override
    public int compareTo(Katrori other) {
        double diff = this.getArea() - other.getArea();
        if (diff < 0) return -1;
        else if (diff > 0) return 1;
        return 0;
    }
}
