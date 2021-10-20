package ict.kosovo.growth.oop.exceptions;

public class AddArguments {
    public static void main(String[] args) {
//        args = new String[]{"1","naim", "2", "3"};
//
//        try{
//            int sum = 0;
//            for (String arg : args) {
//                sum += Integer.parseInt(arg);
//            }
//            System.out.println("Shuma = " + sum);
//        }
//        catch (NumberFormatException ex) {
//            System.out.println("Non number element!");
//        }

        differentTryCatch(args);
    }

    public static void differentTryCatch(String[] args) {
        //Student[] students = ... jo te gjithe studentat e plotesojne kushtin
        args = new String[]{"1","naim", "2", "3"};

        int sum = 0;
        for (String arg : args) {
            try {
                sum += Integer.parseInt(arg);
                System.out.println(arg);
            }
            catch (NumberFormatException ex) {
                System.out.println(arg+" is not a number!");
            }
        }
        System.out.println("Shuma = " + sum);

    }
}