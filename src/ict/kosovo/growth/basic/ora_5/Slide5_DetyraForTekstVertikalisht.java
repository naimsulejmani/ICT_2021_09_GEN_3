package ict.kosovo.growth.basic.ora_5;

import java.util.Scanner;

public class Slide5_DetyraForTekstVertikalisht {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Shkruaj emrin e plote: ");
        String emri = reader.nextLine();

        System.out.println("Rezultati");
        System.out.println("----------------------");

        for (int index = 0; index < emri.length(); index++) {
            System.out.printf("%s      %s %n", emri.charAt(index),
                    emri.charAt(emri.length() - 1 - index));
        }

        System.out.println("----------------------");
    }
}
