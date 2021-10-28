package ict.kosovo.growth.oop.generics.type_variable_bounds;

import ict.kosovo.growth.oop.generics.pairs.Pair;

import javax.print.Doc;
import java.util.ArrayList;

public class TestGenericClass {
    public static void main(String[] args) {
        Pair<Person> person;
        person = new Pair<>(new Doctor(1, "naim", 20), new Manager(2, "asd", 3));
        Pair<Manager> managerPair = new Pair<>(new Manager(1, "12313", 1), new Manager(1, "Naim", 3));

        Pair<? extends Person> pair;
        pair = new Pair<>(new Manager(1, "Naim", 28), new Doctor(2, "Filan", 55));

        Pair<? super Manager> pairOfManager;
        pairOfManager = new Pair<Manager>(new Manager(1,"A",1),new Manager(2,"B",2));
        pairOfManager.setFirst(new Manager(3,"C",3));
        Manager first = (Manager) pairOfManager.getFirst();

    }
}
