package ict.kosovo.growth.oop.polymorphism.upcasting;

//you can try with extends Square
public class Cube extends Shape {
    private int a;

    public Cube(int a) {
        //super(a);
        this.a = a;
    }

    @Override
    public double getArea() {
        return a * a * a;
    }

    public void setA(int a) {
        this.a = a;
    }
}
