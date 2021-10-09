package ict.kosovo.growth.oop.arrays_example;

import java.util.Arrays;

public class ExampleWithArray {
    public static void main(String[] args) {
        //deklaro vargun dhe inicializo me 10 numra (default 0)
        int[] numrat = new int[10];

        String[] names = {"Lumbardh", "Shkelqim", "Albina"};

        String[] lastnames;

        //lastnames = {"1","2","3"}
        lastnames = new String[]{"1", "2", "3"};

        Arrays.sort(names);

        for(String name: names) {
            System.out.println(name);
        }

        Arrays.binarySearch(names,"Albina");




        printArray(numrat);
        printArray(new int[]{1, 2, 3, 4});
        //kodi jone vazhdon ketu atehere
    }

    public static void printArray(int[] array) {
        for (int nr : array) {
            System.out.printf("%4d", nr);
        }
    }
}
