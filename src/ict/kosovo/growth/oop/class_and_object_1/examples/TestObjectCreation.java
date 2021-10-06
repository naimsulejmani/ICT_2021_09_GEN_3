package ict.kosovo.growth.oop.class_and_object_1.examples;

import java.util.Scanner;

public class TestObjectCreation {
    public static void main(String[] args) {
        Human human1 = new Human("Naim","Sulejmani","Kosova","Prishtine",18,"junior programmer");
        Human human2 = new Human("Shpend", "Sedikushi","Shqiperi","Tirane",22,"senior programer");

        Scanner reader = new Scanner(System.in);
        System.out.println("Shkruaj emrin e person-it: ");
        String name = reader.nextLine();
        System.out.println("Shkruaj mbiemrin e person-it:");
        String lastName = reader.nextLine();


        Human human = new Human(name,lastName,"","",0,"");

        FutballPlayer messi = new FutballPlayer();
        messi.setNo(30);

    }
}
