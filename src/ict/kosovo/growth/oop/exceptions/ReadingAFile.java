package ict.kosovo.growth.oop.exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadingAFile {
    public static void main(String[] args) {
        try {
            System.out.println("Total rreshta:" +countLines("files/test1.txt"));
        } catch (FileNotFoundException e) {
            System.out.println("Fajlli apo direktoriumi gabim!!!");
        }
    }

    public static int countLines(String filename) throws FileNotFoundException {
        int count = 0;
        Scanner reader = null;

//        try {
            reader = new Scanner(new File(filename));
//        } catch (FileNotFoundException ex) {
//            ex.printStackTrace();
//        }
        String line;
        while (reader.hasNextLine()) {
            line = reader.nextLine();
            System.out.println(line);
            count++;
        }
        return count;
    }
}
