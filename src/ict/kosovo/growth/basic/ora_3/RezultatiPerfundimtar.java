package ict.kosovo.growth.basic.ora_3;

import java.util.Scanner;

public class RezultatiPerfundimtar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //System.out.print("Ekipi vendas:");
        String ekipiVendas = sc.nextLine();
        //System.out.print("Ekipi musafir:");
        String ekipiMusafir = sc.nextLine();
        System.out.print("Nr. i tifozeve:");
        int tifozet = sc.nextInt();
        System.out.print("Fusha:");
        sc.nextLine();
        String fusha = sc.nextLine();//kur lexojme pas int dhe deshirojme me lexu string

        System.out.print("Sa gola ka shenuar " + ekipiVendas + ":");
        int gVendas = sc.nextInt();
        System.out.print("Sa gola ka shenuar " + ekipiMusafir + ":");
        int gMusafir = sc.nextInt();


        System.out.println("--------------------------------------------------------");
        System.out.println("Rezultati perfundimtar");
        //System.out.println(ekipiVendas + "-" + ekipiMusafir + " " + gVendas + " " + gMusafir);

        /*
            %s - String (text)
            %d - numer te plote int long byte
            %n - newline

         */
        System.out.printf("%s - %s: %d - %d %n", ekipiVendas, ekipiMusafir, gVendas, gMusafir);
        System.out.printf("Stadiumi %s me gjithsej %d tifoze prezent! %n", fusha, tifozet);
        System.out.println("--------------------------------------------------------");
    }
}
