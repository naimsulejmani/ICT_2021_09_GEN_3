package ict.kosovo.growth.basic.ora_5;


import java.util.Scanner;

public class Slide5_Detyra2_1 {
    public static void main(String[] args) {
        //objekti qe na mundeson me lexu gjithcka nga konsola
        Scanner reader = new Scanner(System.in);
        System.out.print("Shkruaj numrin e pare: ");
        int nr1 = reader.nextInt();
        System.out.print("Shkruaj numrin e dyte: ");
        int nr2 = reader.nextInt();

        if (nr1 % nr2 == 0) {
            System.out.printf("%d eshte i plotpjestueshem me %d %n", nr1, nr2);
        } else {
            System.out.printf("%d nuk eshte i plotpjestueshem me %d %n", nr1, nr2);
        }

        System.out.printf("%d %seshte i plotpjestueshem me %d %n", nr1,
                nr1 % nr2 == 0 ? "" : "nuk ", nr2);

    }
}
