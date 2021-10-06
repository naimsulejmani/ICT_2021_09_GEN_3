package ict.kosovo.growth.Dorezimet.EndritBislimi;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TicTacToe {
    static String[] vlera;
    static String ktheVleren;

    static String fituesi()
    {
        for (int a = 0; a < 8; a++) {
            String rreshti = null;

            switch (a) {
                case 0:
                    rreshti = vlera[0] + vlera[1] + vlera[2];
                    break;
                case 1:
                    rreshti = vlera[3] + vlera[4] + vlera[5];
                    break;
                case 2:
                    rreshti = vlera[6] + vlera[7] + vlera[8];
                    break;
                case 3:
                    rreshti = vlera[0] + vlera[3] + vlera[6];
                    break;
                case 4:
                    rreshti = vlera[1] + vlera[4] + vlera[7];
                    break;
                case 5:
                    rreshti = vlera[2] + vlera[5] + vlera[8];
                    break;
                case 6:
                    rreshti = vlera[0] + vlera[4] + vlera[8];
                    break;
                case 7:
                    rreshti = vlera[2] + vlera[4] + vlera[6];
                    break;
            }
            //For X winner
            if (rreshti.equals("XXX")) {
                return "X";
            }

            // For O winner
            else if (rreshti.equals("OOO")) {
                return "O";
            }
        }

        for (int a = 0; a < 9; a++) {
            if (Arrays.asList(vlera).contains(
                    String.valueOf(a + 1))) {
                break;
            }
            else if (a == 8) {
                return "barazim";
            }
        }
        System.out.println("----------------------------------------------------------------");
        System.out.print("Rradha e "+ktheVleren + ", shkruani nje numer per te vendosur " + ktheVleren + ": ");
        return null;

    }

    static void tabela()
    {

        System.out.println("| " + vlera[0] + " | "
                + vlera[1] + " | " + vlera[2]
                + " |");

        System.out.println("| " + vlera[3] + " | "
                + vlera[4] + " | " + vlera[5]
                + " |");

        System.out.println("| " + vlera[6] + " | "
                + vlera[7] + " | " + vlera[8]
                + " |");

    }

    public static void main(String[] args)
    {
        Scanner reader = new Scanner(System.in);
        vlera = new String[9];
        ktheVleren = "X";
        String winner = null;

        for (int a = 0; a < 9; a++) {
            vlera[a] = String.valueOf(a + 1);
        }
        System.out.println("----------------------------------------------------------------");
        System.out.println("W E L C O M E ");
        System.out.println("----------------------------------------------------------------");
        tabela();

        System.out.print("Lojtari i pare ka zgjedhur X. Shkruani nje numer nga tabela se ku deshironi ta vendosni X: ");

        //perderisa nuk ka fitues
        while (winner == null) {
            int numInput;

            try {
                numInput = reader.nextInt();
                if (!(numInput > 0 && numInput <= 9)) {
                    System.out.println("Numri eshte i zene ose i pavlefshem, ju lutem vendosni nje numer tjeter: ");
                    continue;
                }
            }
            catch (InputMismatchException e) {
                System.out.println("Numri eshte i zene ose i pavlefshem, ju lutem vendosni nje numer tjeter: ");
                continue;
            }

            if (vlera[numInput - 1].equals(
                    String.valueOf(numInput))) {
                vlera[numInput - 1] = ktheVleren;

                if (ktheVleren.equals("X")) {
                    ktheVleren = "O";
                }
                else {
                    ktheVleren = "X";
                }
                tabela();
                winner = fituesi();
            }
            else {
                System.out.print("Numri eshte i zene ose i pavlefshem, ju lutem vendosni nje numer tjeter: ");
            }
        }
        if (winner.equalsIgnoreCase("barazim")) {
            System.out.println("----------------------------------------------------------------");
            System.out.println("Barazim! Faleminderit qe luajtet!");
            System.out.println("----------------------------------------------------------------");
        }


        else {
            System.out.println("----------------------------------------------------------------");
            System.out.println("Urime! Lojtari qe zgjedhur " + winner + " ka fitur! Faleminderit qe luajtet!");
            System.out.println("----------------------------------------------------------------");
        }

    }
}
