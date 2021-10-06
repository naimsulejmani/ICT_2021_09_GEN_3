package ict.kosovo.growth.Dorezimet.EdonaKomoni;

import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Emri i lojtarit 1: ");
        String lojtari1 = sc.nextLine();
        System.out.println("Lojtari 1, " + lojtari1 + ", do shtyp ne tabele simbolin X." );
        System.out.print("Emri i lojtarit 2: ");
        String lojtari2 = sc.nextLine();
        System.out.println("Lojtari 2, " + lojtari2 + ", do shtyp ne tabele simbolin O." );
        rregullatELojes();

        String[][] matrica = { {" ", " ", " "},
                {" ", " ", " "},
                {" ", " ", " "} };

        while (true) {
            luaj(matrica, "X", sc);
            printoMatricen(matrica);
            if (kaPerfunduarLoja(matrica))
                break;
            luaj(matrica,"O", sc);
            printoMatricen(matrica);
            if (kaPerfunduarLoja(matrica))
                break;

        }
        sc.close();


    }
    public static boolean vlereELejuar(String s) {
        //length = 2, startWith(0,1,2) dhe endWith (0,1,2)
        return s.equals("00") || s.equals("01") || s.equals("02")
                || s.equals("10") || s.equals("11") || s.equals("12")
                || s.equals("20") || s.equals("21") || s.equals("22");
    }

    public static boolean kaFitues(String[][] matrica, String simboli) {
        return (matrica[0][0] + matrica[0][1] + matrica[0][2]).equals(simboli.repeat(3)) || (matrica[0][0] + matrica[1][0] + matrica[2][0]).equals(simboli.repeat(3))
                || (matrica[0][1] + matrica[1][1] + matrica[2][1]).equals(simboli.repeat(3)) || (matrica[1][0] + matrica[1][1] + matrica[1][2]).equals(simboli.repeat(3))
                || (matrica[0][2] + matrica[1][2] + matrica[2][2]).equals(simboli.repeat(3)) || (matrica[2][0] + matrica[2][1] + matrica[2][2]).equals(simboli.repeat(3))
                || (matrica[0][0] + matrica[1][1] + matrica[2][2]).equals(simboli.repeat(3)) || (matrica[0][2] + matrica[1][1] + matrica[2][0]).equals(simboli.repeat(3));
    }

    public static void printoMatricen(String[][] matrica) {
        System.out.println("-------------------");
        for (int i = 0; i < matrica.length; i++) {
            for (int j = 0; j < matrica[0].length; j++) {
                if (j == 0 || j == matrica[0].length - 1) {
                    System.out.printf("|  %1s  |", matrica[i][j]);
                }
                else {
                    System.out.printf("  %1s  ", matrica[i][j]);
                }
            }
            System.out.println();
            System.out.println("-------------------");
        }
    }

    public static boolean eshteBosh(String[][] matrica, String koordinatat) {
        return (matrica[Integer.parseInt(String.valueOf(koordinatat.charAt(0)))][Integer.parseInt(String.valueOf(koordinatat.charAt(1)))]).equals(" ");
    }

    public static boolean kaPerfunduarLoja(String[][] matrica) {
        if (kaFitues(matrica, "X")) {
            printoMatricen(matrica);
            System.out.println("Lojtari 1 ka fituar!");
            return true;
        }
        if (kaFitues(matrica, "O")) {
            printoMatricen(matrica);
            System.out.println("Lojtari 2 ka fituar!");
            return true;
        }
        for (int i = 0; i < matrica.length; i++) {
            for (int j = 0; j < matrica[0].length; j++) {
                if (eshteBosh(matrica, i + "" + j))
                    return false;
            }
        }
        printoMatricen(matrica);
        System.out.println("Loja ka perfunduar pa fitues!");
        return true;
    }

    public static void rregullatELojes() {
        String[][] matrica = { {"00", "01", "02"},
                {"10", "11", "12"},
                {"20", "21", "22"} };
        System.out.println("----------------");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (j == 0 || j == matrica[0].length - 1) {
                    System.out.printf("| %2s |", matrica[i][j]);
                }
                else {
                    System.out.printf(" %2s ", matrica[i][j]);
                }
            }
            System.out.println();
            System.out.println("----------------");
        }
        System.out.println("Ju duhet te iu referoheni koordinatave ne tabelen e mesiperme!");
    }
    public static void luaj(String[][] matrica, String simboli, Scanner sc) {
        int numri;
        if(simboli.equals("X"))
            numri = 1;
        else numri = 2;
        System.out.print("Lojtari " + numri + " te shkruaj koordinatat: ");
        String koordinatat = sc.nextLine();
        boolean test = true;
        while (test) {
            if (!vlereELejuar(koordinatat)) {
                System.out.println("Keto vlera nuk jane te lejuara!");
                rregullatELojes();
                System.out.print("Sheno koordinata tjera: ");
                koordinatat = sc.nextLine();
            }
            else if(!eshteBosh(matrica, koordinatat)) {
                System.out.println("Keto koordinata jane te zena, shiko: ");
                printoMatricen(matrica);
                System.out.print("Sheno koordinata tjera: ");
                koordinatat = sc.nextLine();
            }
            else test = false;
        }
        matrica[Integer.parseInt(String.valueOf(koordinatat.charAt(0)))][Integer.parseInt(String.valueOf(koordinatat.charAt(1)))] = simboli;
    }



}
