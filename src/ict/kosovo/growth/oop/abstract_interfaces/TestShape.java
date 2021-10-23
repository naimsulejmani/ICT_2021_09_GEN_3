package ict.kosovo.growth.oop.abstract_interfaces;

public class TestShape {
    public static void main(String[] args) {
        //Shape form1 = new Shape();//
        Shape square = new Square();
        Shape triangle = new Triangle();

        //square.draw();
        square.draw();
        triangle.draw();
        Shape circle = new Circle();
        circle.draw();
    }
}
