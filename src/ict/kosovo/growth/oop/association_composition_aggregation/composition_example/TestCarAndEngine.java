package ict.kosovo.growth.oop.association_composition_aggregation.composition_example;

public class TestCarAndEngine {
    public static void main(String[] args) {
        Engine engine = new Engine();//llojin, tipin, kuaj fuqi, ....
        Car car = new Car(engine); //engine !=null, atributet e vetures

    }
}
