package ict.kosovo.growth.oop.enums;

public class SeasonTest {
    public static void main(String[] args) {
        Season s = Season.FALL;
        Season s1 = Season.FALL;
        Season s2 = Season.valueOf("WINTER");
        //Season s3 = Season.valueOf("TEST");

        System.out.println(s1.compareTo(s2));

        SeasonClass s4 = SeasonClass.SUMMER;

        if(s==s1) {
            System.out.println("Jane te njejte");
        }
        if(s.equals(s1)) {
            System.out.println("Jane te njejte");
        }

        System.out.println(s1);
        System.out.println(s2);


        Season[] allSeasons = Season.values();

        for(Season season: allSeasons) {
            System.out.println("Sezona "+season);
        }

        System.out.println(Season.values()[2]);

        switch (s) {
            case SPRING:
                System.out.println("Wow kaloj dimri");
                break;
            case SUMMER:
                System.out.println("shko ndeti");
                break;
            case FALL:
                System.out.println("Nisja shkolles");
                break;
            case WINTER:
                System.out.println("Shko ne Brezovice apo BOGE");
                break;
        }

    }
}
