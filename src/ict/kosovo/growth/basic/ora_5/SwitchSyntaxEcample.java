package ict.kosovo.growth.basic.ora_5;

import java.util.Scanner;

public class SwitchSyntaxEcample {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Zgjidhni menu: ");
        String menu = reader.nextLine();

        //kontrollo variablen switch ne nje rank te vlerave te lejuar (domein te vlerave)
        switch (menu) {
            case "Administrator":
                System.out.println("Mire se erdhe ne meny te administrimit");
                break;
            case "Dashboard":
                System.out.println("Dashboard meny");
                break;
            case "Test":
            case "Hello":
                System.out.println("Hello and Test menu");
                break;
            case "a","A":
                System.out.println("Keni zgjedhur A - meny");
                break;
            default:
                System.out.println("skeni perzgjedhur meny te sakte!");
                break;
        }
    }
}
