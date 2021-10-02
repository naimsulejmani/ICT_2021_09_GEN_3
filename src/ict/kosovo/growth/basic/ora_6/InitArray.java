package ict.kosovo.growth.basic.ora_6;

import java.util.Scanner;

public class InitArray {
    public static void main(String[] args) {
        int[] numrat = new int[10];
        String[] emrat = new String[10];
        Scanner[] scanners = new Scanner[10];
        boolean[] sakt = new boolean[10];

        int[] notat = {5, 10, 9, 7, 6, 6, 10, 10, 10, 8};
        //column heading
        System.out.printf("%s%8s%n", "Index", "Value");

        //i - index
        for (int i = 0; i < notat.length; i++) {
            System.out.printf("%5d%8d%n", i, notat[i]);
        }

        System.out.println("----------------------");
        for (int i = 0; i < numrat.length; i++) {
            numrat[i] = (i + 1) * 2;
        }
        for (int i = 0; i < notat.length; i++) {
            System.out.printf("%5d%8d%n", i, numrat[i]);
        }
        System.out.println("--------------------------");
        Scanner reader = new Scanner(System.in);
        for (int i = 0; i < emrat.length; i++) {
            System.out.printf("Ploteso emrin e %d: ", i + 1);
            emrat[i] = reader.nextLine();
        }

        for (int i = 0; i < emrat.length; i++) {
            System.out.println(emrat[i]);
        }


    }
}
