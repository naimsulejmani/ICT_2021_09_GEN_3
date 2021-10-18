package ict.kosovo.growth.oop.polymorphism.upcasting;

public class Square extends Shape {
    private int a;

    public Square(int a) {
        this.a = a;
    }

    public int getA() {
        return this.a;
    }

    @Override
    public double getArea() {
        return a * a;
    }

    @Override
    public double getPerimeter() {
        return 4 * a;
    }
}
