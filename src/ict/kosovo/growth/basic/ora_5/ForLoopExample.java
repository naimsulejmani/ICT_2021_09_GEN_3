package ict.kosovo.growth.basic.ora_5;

import java.util.Scanner;

public class ForLoopExample {
    public static void main(String[] args) {
        //llogartija e faktorielit
        Scanner reader = new Scanner(System.in);
        System.out.println("Shkruaj numrin per llogaritje te faktorielit: ");
        int nr = reader.nextInt();
        long factoriel = 1; //elementi njesi
        for (int index = 1; index <= nr; index++) {
            factoriel *= index;
        }
        System.out.printf("Faktorieli i %d! eshte %d. %n", nr, factoriel);

        factoriel = 1;
        for (; nr >= 1; nr--) {
            factoriel *= nr;
        }
        System.out.println("Faktorieli eshte: " + factoriel);
    }
}
