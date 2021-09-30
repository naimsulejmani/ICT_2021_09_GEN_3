package ict.kosovo.growth.basic.ora_5;

import java.util.Scanner;

public class SentinelWhile {
    public static void main(String[] args) {
        //mbledhja e numrave perderisa shfrytezuesi shkruan numer pozitive, ne momentin qe shkruan
        //0 aplikacioni mbyllet

        final int SENTINEL_ZERO = 0;
        Scanner reader = new Scanner(System.in);
        System.out.println("Shkruaj nje numer per mbledhje (0 per dalje): ");
        int sum = 0;
//        int numri;
//        while ((numri = reader.nextInt()) != SENTINEL_ZERO) {
//            sum += numri;
//            System.out.println("Shkruaj nje numer per mbledhje (0 per dalje): ");
//        }
        int numri = reader.nextInt();

        while (numri != SENTINEL_ZERO) {
            sum += numri;
            System.out.println("Shkruaj nje numer per mbledhje (0 per dalje): ");
            numri = reader.nextInt();
        }
        System.out.println("Shuma eshte: " + sum);

    }
}
