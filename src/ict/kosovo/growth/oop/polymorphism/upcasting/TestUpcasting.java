package ict.kosovo.growth.oop.polymorphism.upcasting;

import java.util.Scanner;

public class TestUpcasting {
    public static void main(String[] args) {
        Shape forma1 = new Square(10); //upcasting ruaj femine tek prindi
        Shape forma2 = new Cube(10);
        forma2 = new Shape();

        //kur e ruajme referencen  e femise tek prindi i shohim vetem metodat atributet e prindit
        //mirepo sjelljet perseri jane te femise


        //runtime polimorfizem
        System.out.println(forma1.getArea());
        System.out.println(forma1.getPerimeter());
        //nese deshirojme gjithqysh me ju qas metodave te femise edhe pse i kemi ruajt te prindti
        Square square = (Square) forma1;//dhe kjo konvertohet
        //atehere dhe vetem atehere nese eshte krijuar nga Square ose femijet e square
        System.out.println(square.getA());
        System.out.println(((Square) forma1).getA());

//        Square square1 = (Square)forma2;
//        System.out.println(square.getA());
        //duhet me pyet prej asaj me specifike qe eshte dhe jo asaj me gjenerale

        if (forma2 instanceof Square) {
            System.out.println("WOW I am square");
            Square sq = (Square) forma2;
            System.out.println(sq.getA());
        } else if (forma2 instanceof Cube) {
            System.out.println("WOW I am Cube");
            Cube c = (Cube) forma2;
            c.setA(50);
        } else if (forma2 instanceof Object) {
            System.out.println("WOW I am object");
            System.out.println("Yes it is!!!");
        } else {
            System.out.println("I dont know what kind of shape are you");
        }
    }
}
