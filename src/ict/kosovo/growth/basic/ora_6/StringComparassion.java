package ict.kosovo.growth.basic.ora_6;

public class StringComparassion {
    public static void main(String[] args) {
//        String vlera1 = "Alma";
//        String vlera2 = "Alim";

//        System.out.println(vlera1.compareTo(vlera2));

//        System.out.println(vlera2.compareTo(vlera1));

        int vlera1 = 10;
        int vlera = 20;

        String emriStudentit1 = "Agim Cukaj";
        String emriStudentit2 = "Agim Kryeziu";
        //...
        String emriStudentit10 = "Elmaz Mejzini";

        String[] studentNames = new String[23];


        int[] notat = new int[24];
        //tek variabla notat ruhet adresa ne heap se ku eshte ku ndodhe ky varg

        boolean[] saktesite; //deklarimi
        saktesite = new boolean[10]; // gjithmon kur e inicializojme (duhet me specifiku numrin se sa elemente do ti nxen)

        String[] emrat = new String[100];

        long vlerat[] = new long[100];

        String[] studentet = {"Lumbardh", "Edona", "Eni", "Erlinde"};
        System.out.println(studentet.length);
        System.out.println(studentet[0]);
        System.out.println(studentet[3]);
        System.out.println(studentet[studentet.length - 1]);
        System.out.println(studentet[3 / 2]);
        studentet[2] = "Fitore";
        System.out.println(studentet[2]);
        System.out.println(studentet);
    }
}











