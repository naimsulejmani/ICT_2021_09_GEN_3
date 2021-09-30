package ict.kosovo.growth.basic.ora_5;

import java.util.Scanner;

public class DoWhileExample {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int numriPozitiv;
        do {
            System.out.println("Shkruaj nje numer pozitive ndash me dal prej konsole!!!");
            numriPozitiv = reader.nextInt();
            if (numriPozitiv <= 0)
                System.out.println("Fatekeqesisht duhet me perserite prap!");
        }
        while (numriPozitiv <= 0);
    }
}
