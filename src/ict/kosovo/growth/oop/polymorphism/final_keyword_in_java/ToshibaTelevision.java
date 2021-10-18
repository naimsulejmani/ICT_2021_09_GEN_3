package ict.kosovo.growth.oop.polymorphism.final_keyword_in_java;

public final class ToshibaTelevision extends Television {
    public ToshibaTelevision() {
        super();
    }

    //nese parametri eshte final, nuk guxon me ju ndru vlera
    public ToshibaTelevision(final int id) {
        super(id);
    }

//    @Override
//    public void turnOn() {
//        System.out.println("TURNED ON");
//    }
}
