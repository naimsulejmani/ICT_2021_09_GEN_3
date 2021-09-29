package ict.kosovo.growth.basic.ora_3;

import java.util.Scanner;

public class DetyraAdHoc {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Ligji i dyte i Njutonit");

        System.out.println("Shkruani masen e trupit:");
        double masa = input.nextDouble();

        System.out.println("Shkruani nxitimin e trupit:");
        double nxitimi = input.nextDouble();

        double forca = masa * nxitimi; //

        System.out.println("Forca eshte:" + forca);

    }
}
