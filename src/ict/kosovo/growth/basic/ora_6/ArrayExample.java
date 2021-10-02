package ict.kosovo.growth.basic.ora_6;

import java.util.Scanner;

public class ArrayExample {
    public static void main(String[] args) {
        int[] notat = new int[1_000_000_000];
        notat[0]=100;
        notat[1]=10;//....
        System.out.println("Adresa vjeter = "+ notat);
        notat = new int[20];
        System.out.println("Adresa e re = "+ notat);
        Scanner reader = new Scanner(System.in);
        reader.nextLine();
    }
}
