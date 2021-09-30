package ict.kosovo.growth.basic.ora_5;

import java.util.Locale;

public class StringMethods {
    public static void main(String[] args) {
        String teksti = "    ICT for Kosovo Growth     ";
        //String teksti1 = new String( "ICT for Kosovo Growth");

        System.out.println(teksti.toLowerCase());
        System.out.println(teksti.toUpperCase());
        System.out.println(teksti.charAt(1));
        System.out.println(teksti.replace("Kosovo","Albania"));
        System.out.println(teksti.length());
        System.out.println(teksti.repeat(3));
        System.out.println(teksti.indexOf("K"));
        System.out.println(teksti.trim());
        System.out.println(teksti.startsWith(" A "));
        System.out.println(teksti.endsWith("   "));
        System.out.println(teksti.substring(6,11));
    }
}
